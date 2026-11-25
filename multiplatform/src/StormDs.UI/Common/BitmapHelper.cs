// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.Runtime.InteropServices;
using Avalonia;
using Avalonia.Media.Imaging;
using Avalonia.Platform;

namespace StormDs.UI.Common;

/// <summary>
/// High-performance Skia/WriteableBitmap utility for instant zero-copy BGRA rendering
/// of 32x32 -> 128x128 cartridge icons, covers, and dual DS emulation screens.
/// </summary>
public static class BitmapHelper
{
    /// <summary>
    /// Creates a WriteableBitmap from raw BGRA8888 byte array.
    /// </summary>
    public static WriteableBitmap? CreateBgraBitmap(byte[]? bgraPixels, int width, int height)
    {
        if (bgraPixels == null || bgraPixels.Length == 0 || width <= 0 || height <= 0)
        {
            return null;
        }

        try
        {
            var wb = new WriteableBitmap(
                new PixelSize(width, height),
                new Vector(96, 96),
                PixelFormat.Bgra8888,
                AlphaFormat.Premul);

            UpdateBgraBitmap(wb, bgraPixels, width, height);
            return wb;
        }
        catch
        {
            return null;
        }
    }

    /// <summary>
    /// Updates an existing WriteableBitmap in-place with zero per-frame allocation.
    /// </summary>
    public static void UpdateBgraBitmap(WriteableBitmap wb, byte[] bgraPixels, int width, int height)
    {
        if (bgraPixels.Length == 0 || width <= 0 || height <= 0) return;
        using var locked = wb.Lock();
        int copyBytes = Math.Min(bgraPixels.Length, locked.RowBytes * height);
        Marshal.Copy(bgraPixels, 0, locked.Address, copyBytes);
    }

    /// <summary>
    /// Generates an authentic high-tech FreeBIOS / DS splash frame pattern in 256x192 BGRA8888.
    /// </summary>
    public static byte[] GenerateTestScreenBgra(int width, int height, bool isTouchScreen, string title, long frame)
    {
        byte[] buffer = new byte[width * height * 4];
        byte bgR = (byte)(isTouchScreen ? 20 : 15);
        byte bgG = (byte)(isTouchScreen ? 25 : 30);
        byte bgB = (byte)(isTouchScreen ? 40 : 60);

        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                int idx = (y * width + x) * 4;

                // Subtle animated grid line pattern
                bool grid = (x % 32 == 0) || (y % 24 == 0);
                byte r = (byte)(grid ? Math.Min(255, bgR + 25) : bgR);
                byte g = (byte)(grid ? Math.Min(255, bgG + 35) : bgG);
                byte b = (byte)(grid ? Math.Min(255, bgB + 55) : bgB);

                // Scanning beam effect
                int beamY = (int)((frame * 2) % height);
                if (Math.Abs(y - beamY) < 3)
                {
                    r = (byte)Math.Min(255, r + 40);
                    g = (byte)Math.Min(255, g + 80);
                    b = (byte)Math.Min(255, b + 120);
                }

                buffer[idx + 0] = b; // B
                buffer[idx + 1] = g; // G
                buffer[idx + 2] = r; // R
                buffer[idx + 3] = 255; // A
            }
        }

        return buffer;
    }
}
