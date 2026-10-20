#!/usr/bin/env python3
"""
STORM DS — Automated Vulkan Visual Regression & Debug Capture Harness (Stage 3)

Triggers in-game frame capture and Vulkan state report dumps over ADB via the
`me.magnum.melonds.DEBUG_CAPTURE` broadcast intent, pulls artifacts from the
connected Android device, and computes PSNR / SSIM visual regression metrics
against reference baseline screenshots.
"""

from __future__ import annotations

import argparse
import json
import math
import os
import shutil
import struct
import subprocess
import sys
import time
import zlib
from pathlib import Path
from typing import Any, Dict, List, Optional, Tuple


DEFAULT_DEVICE_DIR = "/storage/emulated/0/STORM DS/debug/regression"
BROADCAST_ACTION = "me.magnum.melonds.DEBUG_CAPTURE"
EMULATOR_ACTIVITY = "me.magnum.melonds.ui.emulator.EmulatorActivity"

DEBUG_VIEW_NAMES = {
    0: "normal",
    1: "only_3d",
    2: "only_2d",
    3: "composition_mask",
}


def run_adb(
    args: List[str],
    device: Optional[str] = None,
    check: bool = True,
    capture_output: bool = True,
) -> subprocess.CompletedProcess:
    cmd = ["adb"]
    if device:
        cmd.extend(["-s", device])
    cmd.extend(args)
    return subprocess.run(
        cmd,
        check=check,
        capture_output=capture_output,
        text=True,
    )


def clear_device_capture_dir(device_dir: str, device: Optional[str]) -> None:
    run_adb(["shell", f'rm -rf "{device_dir}" && mkdir -p "{device_dir}"'], device=device, check=False)


def launch_rom_if_requested(
    rom_path: str,
    package_name: str,
    device: Optional[str],
    wait_sec: float,
) -> None:
    component = f"{package_name}/{EMULATOR_ACTIVITY}"
    print(f"[regression] Launching ROM on device: {rom_path} via {component}")
    run_adb(
        [
            "shell",
            "am",
            "start",
            "-n",
            component,
            "--es",
            "PATH",
            f'"{rom_path}"',
        ],
        device=device,
        check=True,
    )
    if wait_sec > 0:
        print(f"[regression] Waiting {wait_sec:.1f}s for ROM to reach target frame...")
        time.sleep(wait_sec)


def trigger_debug_capture(
    device_dir: str,
    device: Optional[str],
    debug_view_mode: Optional[int] = None,
    compositor_mode: Optional[int] = None,
    thick_edges: Optional[bool] = None,
    timeout_sec: float = 15.0,
) -> Dict[str, Any]:
    clear_device_capture_dir(device_dir, device)

    cmd = [
        "shell",
        "am",
        "broadcast",
        "-a",
        BROADCAST_ACTION,
        "--es",
        "output_dir",
        f'"{device_dir}"',
    ]
    if debug_view_mode is not None:
        cmd.extend(["--ei", "debug_view_mode", str(debug_view_mode)])
    if compositor_mode is not None:
        cmd.extend(["--ei", "compositor_mode", str(compositor_mode)])
    if thick_edges is not None:
        cmd.extend(["--ez", "thick_edges", "true" if thick_edges else "false"])

    print(f"[regression] Broadcasting {BROADCAST_ACTION} -> {device_dir}")
    run_adb(cmd, device=device, check=True)

    done_file = f"{device_dir}/capture_done.json"
    deadline = time.time() + timeout_sec
    while time.time() < deadline:
        res = run_adb(["shell", f'cat "{done_file}"'], device=device, check=False)
        if res.returncode == 0 and res.stdout.strip().startswith("{"):
            try:
                return json.loads(res.stdout.strip())
            except json.JSONDecodeError:
                pass
        time.sleep(0.35)

    raise TimeoutError(
        f"Timed out after {timeout_sec}s waiting for {done_file} from {BROADCAST_ACTION}"
    )


def pull_capture_artifacts(
    device_dir: str,
    local_dir: Path,
    device: Optional[str],
) -> Path:
    local_dir.mkdir(parents=True, exist_ok=True)
    run_adb(["pull", f"{device_dir}/.", str(local_dir)], device=device, check=True)
    frame_png = local_dir / "frame.png"
    if not frame_png.exists():
        # Fallback to adb screencap if frame.png was not produced
        fallback_cmd = ["adb"]
        if device:
            fallback_cmd.extend(["-s", device])
        fallback_cmd.extend(["exec-out", "screencap", "-p"])
        proc = subprocess.run(fallback_cmd, capture_output=True, check=False)
        if proc.returncode == 0 and proc.stdout.startswith(b"\x89PNG"):
            frame_png.write_bytes(proc.stdout)
    return frame_png


def _load_rgb_pixels(path: Path) -> Tuple[int, int, List[Tuple[int, int, int]]]:
    """Load image as (width, height, list of (R, G, B) tuples). Uses Pillow if available, else pure-Python PNG."""
    try:
        from PIL import Image  # type: ignore

        with Image.open(path) as img:
            rgb = img.convert("RGB")
            w, h = rgb.size
            return w, h, list(rgb.getdata())
    except ImportError:
        return _decode_png_pure_python(path)


def _decode_png_pure_python(path: Path) -> Tuple[int, int, List[Tuple[int, int, int]]]:
    data = path.read_bytes()
    if data[:8] != b"\x89PNG\r\n\x1a\n":
        raise ValueError(f"Not a valid PNG file: {path}")

    pos = 8
    width = height = bit_depth = color_type = 0
    idat_chunks: List[bytes] = []

    while pos < len(data):
        length = struct.unpack(">I", data[pos : pos + 4])[0]
        chunk_type = data[pos + 4 : pos + 8]
        chunk_data = data[pos + 8 : pos + 8 + length]
        pos += 12 + length

        if chunk_type == b"IHDR":
            width, height, bit_depth, color_type, _, _, _ = struct.unpack(">IIBBBBB", chunk_data)
            if bit_depth != 8 or color_type not in (2, 6):
                raise ValueError(f"Unsupported PNG format (bit_depth={bit_depth}, color_type={color_type})")
        elif chunk_type == b"IDAT":
            idat_chunks.append(chunk_data)
        elif chunk_type == b"IEND":
            break

    bpp = 3 if color_type == 2 else 4
    stride = width * bpp
    raw = zlib.decompress(b"".join(idat_chunks))

    recon = bytearray(height * stride)
    in_pos = 0
    for y in range(height):
        filter_type = raw[in_pos]
        in_pos += 1
        row_start = y * stride
        prev_start = (y - 1) * stride
        for x in range(stride):
            val = raw[in_pos]
            in_pos += 1
            a = recon[row_start + x - bpp] if x >= bpp else 0
            b = recon[prev_start + x] if y > 0 else 0
            c = recon[prev_start + x - bpp] if (y > 0 and x >= bpp) else 0
            if filter_type == 0:
                recon[row_start + x] = val
            elif filter_type == 1:
                recon[row_start + x] = (val + a) & 0xFF
            elif filter_type == 2:
                recon[row_start + x] = (val + b) & 0xFF
            elif filter_type == 3:
                recon[row_start + x] = (val + ((a + b) >> 1)) & 0xFF
            elif filter_type == 4:
                p = a + b - c
                pa, pb, pc = abs(p - a), abs(p - b), abs(p - c)
                pr = a if (pa <= pb and pa <= pc) else (b if pb <= pc else c)
                recon[row_start + x] = (val + pr) & 0xFF

    pixels: List[Tuple[int, int, int]] = []
    for i in range(0, len(recon), bpp):
        pixels.append((recon[i], recon[i + 1], recon[i + 2]))
    return width, height, pixels


def compute_metrics(
    candidate_path: Path,
    baseline_path: Path,
    diff_out_path: Optional[Path] = None,
) -> Dict[str, Any]:
    w1, h1, px1 = _load_rgb_pixels(candidate_path)
    w2, h2, px2 = _load_rgb_pixels(baseline_path)

    if (w1, h1) != (w2, h2):
        return {
            "dimensionMismatch": True,
            "candidateSize": [w1, h1],
            "baselineSize": [w2, h2],
            "psnrDb": 0.0,
            "ssim": 0.0,
            "maxAbsDiff": 255,
            "changedPixelRatio": 1.0,
        }

    total_pixels = w1 * h1
    if total_pixels == 0:
        raise ValueError("Empty image")

    mse_sum = 0.0
    max_diff = 0
    changed_pixels = 0

    # Luminance arrays for SSIM
    lum1: List[float] = []
    lum2: List[float] = []
    diff_rgb: List[Tuple[int, int, int]] = []

    for (r1, g1, b1), (r2, g2, b2) in zip(px1, px2):
        dr = abs(r1 - r2)
        dg = abs(g1 - g2)
        db = abs(b1 - b2)
        local_max = max(dr, dg, db)
        if local_max > max_diff:
            max_diff = local_max
        if local_max > 2:
            changed_pixels += 1
        mse_sum += (dr * dr + dg * dg + db * db) / 3.0

        y1 = 0.299 * r1 + 0.587 * g1 + 0.114 * b1
        y2 = 0.299 * r2 + 0.587 * g2 + 0.114 * b2
        lum1.append(y1)
        lum2.append(y2)

        if diff_out_path is not None:
            heat = min(255, local_max * 4)
            diff_rgb.append((heat, max(0, int(y1 * 0.25)), max(0, 255 - heat) if local_max > 2 else int(y1 * 0.25)))

    mse = mse_sum / total_pixels
    psnr_db = 99.0 if mse <= 1e-9 else 10.0 * math.log10((255.0 * 255.0) / mse)

    # Global + 8x8 block SSIM on luminance
    c1 = (0.01 * 255.0) ** 2
    c2 = (0.03 * 255.0) ** 2
    block_size = 8
    ssim_sum = 0.0
    block_count = 0

    for by in range(0, h1 - block_size + 1, block_size):
        for bx in range(0, w1 - block_size + 1, block_size):
            n = block_size * block_size
            s1 = s2 = 0.0
            for y in range(by, by + block_size):
                row_offset = y * w1
                for x in range(bx, bx + block_size):
                    idx = row_offset + x
                    s1 += lum1[idx]
                    s2 += lum2[idx]
            mu1 = s1 / n
            mu2 = s2 / n
            var1 = var2 = cov = 0.0
            for y in range(by, by + block_size):
                row_offset = y * w1
                for x in range(bx, bx + block_size):
                    idx = row_offset + x
                    d1 = lum1[idx] - mu1
                    d2 = lum2[idx] - mu2
                    var1 += d1 * d1
                    var2 += d2 * d2
                    cov += d1 * d2
            var1 /= n - 1
            var2 /= n - 1
            cov /= n - 1
            num = (2.0 * mu1 * mu2 + c1) * (2.0 * cov + c2)
            den = (mu1 * mu1 + mu2 * mu2 + c1) * (var1 + var2 + c2)
            ssim_sum += num / den if den > 0 else 1.0
            block_count += 1

    ssim = (ssim_sum / block_count) if block_count > 0 else 1.0

    if diff_out_path is not None:
        try:
            from PIL import Image  # type: ignore

            diff_img = Image.new("RGB", (w1, h1))
            diff_img.putdata(diff_rgb)
            diff_img.save(diff_out_path)
        except ImportError:
            pass

    return {
        "dimensionMismatch": False,
        "candidateSize": [w1, h1],
        "baselineSize": [w2, h2],
        "mse": round(mse, 4),
        "psnrDb": round(psnr_db, 3),
        "ssim": round(ssim, 5),
        "maxAbsDiff": max_diff,
        "changedPixelRatio": round(changed_pixels / total_pixels, 6),
    }


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser(
        description="Automated Vulkan visual regression and debug state capture harness for STORM DS."
    )
    parser.add_argument("--device", help="ADB device serial (optional if a single device is connected)")
    parser.add_argument(
        "--package",
        default="me.magnum.melonds.dev",
        help="Target Android package name (default: me.magnum.melonds.dev)",
    )
    parser.add_argument("--rom", help="Optional on-device ROM path to launch before capturing")
    parser.add_argument(
        "--wait-sec",
        type=float,
        default=8.0,
        help="Seconds to wait after launching ROM before capturing (default: 8.0)",
    )
    parser.add_argument(
        "--device-dir",
        default=DEFAULT_DEVICE_DIR,
        help=f"On-device directory for debug capture output (default: {DEFAULT_DEVICE_DIR})",
    )
    parser.add_argument(
        "--out",
        type=Path,
        default=Path("artifacts/vulkan_regression"),
        help="Local directory to store pulled screenshots, Vulkan reports, and diff metrics",
    )
    parser.add_argument(
        "--baseline",
        type=Path,
        help="Optional baseline PNG file or directory of baseline PNGs for PSNR/SSIM comparison",
    )
    parser.add_argument(
        "--psnr-threshold",
        type=float,
        default=35.0,
        help="Minimum acceptable PSNR in dB when comparing against baseline (default: 35.0)",
    )
    parser.add_argument(
        "--ssim-threshold",
        type=float,
        default=0.97,
        help="Minimum acceptable SSIM [0..1] when comparing against baseline (default: 0.97)",
    )
    parser.add_argument(
        "--compositor-mode",
        choices=["precise", "legacy"],
        help="Optional Vulkan compositor mode override during capture (precise=0, legacy=1)",
    )
    parser.add_argument(
        "--thick-edges",
        choices=["true", "false"],
        help="Optional high-res cel-shaded edge thickening override during capture",
    )
    parser.add_argument(
        "--all-debug-views",
        action="store_true",
        help="Capture all 4 Vulkan debug views (0=Normal, 1=Only3D, 2=Only2D, 3=CompositionMask)",
    )
    return parser.parse_args()


def main() -> int:
    args = parse_args()
    args.out.mkdir(parents=True, exist_ok=True)

    if args.rom:
        launch_rom_if_requested(args.rom, args.package, args.device, args.wait_sec)

    comp_mode_int: Optional[int] = None
    if args.compositor_mode == "precise":
        comp_mode_int = 0
    elif args.compositor_mode == "legacy":
        comp_mode_int = 1

    thick_edges_bool: Optional[bool] = None
    if args.thick_edges is not None:
        thick_edges_bool = args.thick_edges == "true"

    views_to_capture = [0, 1, 2, 3] if args.all_debug_views else [0]
    summary_results: List[Dict[str, Any]] = []
    overall_passed = True

    for view_id in views_to_capture:
        view_name = DEBUG_VIEW_NAMES.get(view_id, f"view_{view_id}")
        view_out_dir = args.out / view_name if args.all_debug_views else args.out
        view_out_dir.mkdir(parents=True, exist_ok=True)

        status = trigger_debug_capture(
            device_dir=args.device_dir,
            device=args.device,
            debug_view_mode=view_id if args.all_debug_views else None,
            compositor_mode=comp_mode_int,
            thick_edges=thick_edges_bool,
        )
        frame_png = pull_capture_artifacts(args.device_dir, view_out_dir, args.device)

        entry: Dict[str, Any] = {
            "viewMode": view_id,
            "viewName": view_name,
            "captureStatus": status,
            "framePath": str(frame_png),
        }

        if args.baseline:
            baseline_png = (
                (args.baseline / view_name / "frame.png")
                if (args.baseline.is_dir() and args.all_debug_views)
                else ((args.baseline / "frame.png") if args.baseline.is_dir() else args.baseline)
            )
            if baseline_png.exists() and frame_png.exists():
                diff_png = view_out_dir / "diff.png"
                metrics = compute_metrics(frame_png, baseline_png, diff_png)
                passed = (
                    not metrics["dimensionMismatch"]
                    and metrics["psnrDb"] >= args.psnr_threshold
                    and metrics["ssim"] >= args.ssim_threshold
                )
                metrics["passed"] = passed
                entry["comparison"] = metrics
                if not passed:
                    overall_passed = False
                print(
                    f"[regression] [{view_name}] PSNR={metrics['psnrDb']:.2f} dB "
                    f"(min {args.psnr_threshold}), SSIM={metrics['ssim']:.5f} "
                    f"(min {args.ssim_threshold}) -> {'PASS' if passed else 'FAIL'}"
                )
            else:
                print(f"[regression] [{view_name}] Baseline not found at {baseline_png}; skipping comparison.")

        summary_results.append(entry)

    # Restore normal debug view if we cycled through debug views
    if args.all_debug_views:
        trigger_debug_capture(
            device_dir=args.device_dir,
            device=args.device,
            debug_view_mode=0,
        )

    report_path = args.out / "regression_report.json"
    report_payload = {
        "timestamp": int(time.time()),
        "overallPassed": overall_passed,
        "psnrThresholdDb": args.psnr_threshold,
        "ssimThreshold": args.ssim_threshold,
        "results": summary_results,
    }
    report_path.write_text(json.dumps(report_payload, indent=2), encoding="utf-8")
    print(f"[regression] Saved regression report to {report_path}")

    return 0 if overall_passed else 1


if __name__ == "__main__":
    sys.exit(main())
