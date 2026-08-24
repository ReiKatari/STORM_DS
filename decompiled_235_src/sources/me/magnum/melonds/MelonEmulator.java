package me.magnum.melonds;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Map;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.domain.model.EmulatorConfiguration;
import me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig;
import me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement;
import me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard;
import me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievement;
import me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievementBucketEntry;
import me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig;
import me.magnum.melonds.ui.emulator.render.FrameRenderCallback;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MelonEmulator {
    public static final MelonEmulator a = new Object();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ t52 $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a SUCCESS = new a("SUCCESS", 0);
        public static final a BIOS9_MISSING = new a("BIOS9_MISSING", 1);
        public static final a BIOS9_BAD = new a("BIOS9_BAD", 2);
        public static final a BIOS7_MISSING = new a("BIOS7_MISSING", 3);
        public static final a BIOS7_BAD = new a("BIOS7_BAD", 4);
        public static final a FIRMWARE_MISSING = new a("FIRMWARE_MISSING", 5);
        public static final a FIRMWARE_BAD = new a("FIRMWARE_BAD", 6);
        public static final a FIRMWARE_NOT_BOOTABLE = new a("FIRMWARE_NOT_BOOTABLE", 7);
        public static final a DSI_BIOS9_MISSING = new a("DSI_BIOS9_MISSING", 8);
        public static final a DSI_BIOS9_BAD = new a("DSI_BIOS9_BAD", 9);
        public static final a DSI_BIOS7_MISSING = new a("DSI_BIOS7_MISSING", 10);
        public static final a DSI_BIOS7_BAD = new a("DSI_BIOS7_BAD", 11);
        public static final a DSI_NAND_MISSING = new a("DSI_NAND_MISSING", 12);
        public static final a DSI_NAND_BAD = new a("DSI_NAND_BAD", 13);

        private static final /* synthetic */ a[] $values() {
            return new a[]{SUCCESS, BIOS9_MISSING, BIOS9_BAD, BIOS7_MISSING, BIOS7_BAD, FIRMWARE_MISSING, FIRMWARE_BAD, FIRMWARE_NOT_BOOTABLE, DSI_BIOS9_MISSING, DSI_BIOS9_BAD, DSI_BIOS7_MISSING, DSI_BIOS7_BAD, DSI_NAND_MISSING, DSI_NAND_BAD};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nc1.L($values);
        }

        private a(String str, int i) {
        }

        public static t52 getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class b {
        private static final /* synthetic */ t52 $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b NONE = new b("NONE", 0);
        public static final b GBA_ROM = new b("GBA_ROM", 1);
        public static final b RUMBLE_PAK = new b("RUMBLE_PAK", 2);
        public static final b MEMORY_EXPANSION = new b("MEMORY_EXPANSION", 3);
        public static final b ANALOG_INPUT = new b("ANALOG_INPUT", 4);

        private static final /* synthetic */ b[] $values() {
            return new b[]{NONE, GBA_ROM, RUMBLE_PAK, MEMORY_EXPANSION, ANALOG_INPUT};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nc1.L($values);
        }

        private b(String str, int i) {
        }

        public static t52 getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class c {
        private static final /* synthetic */ t52 $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        private final boolean isTerminal;
        public static final c SUCCESS = new c("SUCCESS", 0, false);
        public static final c SUCCESS_GBA_FAILED = new c("SUCCESS_GBA_FAILED", 1, false);
        public static final c NDS_FAILED = new c("NDS_FAILED", 2, true);
        public static final c BIOS_FAILED = new c("BIOS_FAILED", 3, true);

        private static final /* synthetic */ c[] $values() {
            return new c[]{SUCCESS, SUCCESS_GBA_FAILED, NDS_FAILED, BIOS_FAILED};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nc1.L($values);
        }

        private c(String str, int i, boolean z) {
            this.isTerminal = z;
        }

        public static t52 getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final boolean isTerminal() {
            return this.isTerminal;
        }
    }

    private final native int bootFirmwareInternal();

    private final native int loadRomInternal(String str, String str2, int i, String str3, String str4);

    private final native boolean loadStateInternal(String str);

    private final native void onKeyPress(int i);

    private final native void onKeyRelease(int i);

    private final native boolean saveStateInternal(String str);

    public final a a() {
        return (a) ((u52) a.getEntries()).get(bootFirmwareInternal());
    }

    public final native int attachVulkanSurface(Surface surface, int i, int i2);

    public final c b(Uri uri, Uri uri2, b bVar, Uri uri3, Uri uri4) {
        String str;
        String str2;
        uri.getClass();
        uri2.getClass();
        bVar.getClass();
        String uri5 = uri.toString();
        uri5.getClass();
        String uri6 = uri2.toString();
        uri6.getClass();
        int ordinal = bVar.ordinal();
        if (uri3 != null) {
            str = uri3.toString();
        } else {
            str = null;
        }
        if (uri4 != null) {
            str2 = uri4.toString();
        } else {
            str2 = null;
        }
        int loadRomInternal = loadRomInternal(uri5, uri6, ordinal, str, str2);
        if (loadRomInternal != 0) {
            if (loadRomInternal != 1) {
                if (loadRomInternal != 2) {
                    if (loadRomInternal == 3) {
                        return c.BIOS_FAILED;
                    }
                    u34.j("Unknown load result");
                    return null;
                }
                return c.NDS_FAILED;
            }
            return c.SUCCESS_GBA_FAILED;
        }
        return c.SUCCESS;
    }

    public final boolean c(Uri uri) {
        uri.getClass();
        String uri2 = uri.toString();
        uri2.getClass();
        return loadStateInternal(uri2);
    }

    public final native void configureOpenGlRetroArchFilter(boolean z, String str, String str2, boolean z2, String str3, int i, int i2, int i3);

    public final native void configureVulkanSurface(int i, VulkanPresentationConfig vulkanPresentationConfig, Bitmap bitmap);

    public final native String[] consumeShaderDiagnostics();

    public final void d(b63 b63Var) {
        b63Var.getClass();
        onKeyPress(b63Var.getKeyCode());
    }

    public final native boolean debugStepFrame();

    public final native void detachVulkanSurface(int i);

    public final native int discardPendingRetroAchievementsSubmissions(long[] jArr);

    public final void e(b63 b63Var) {
        b63Var.getClass();
        onKeyRelease(b63Var.getKeyCode());
    }

    public final boolean f(Uri uri) {
        uri.getClass();
        String uri2 = uri.toString();
        uri2.getClass();
        return saveStateInternal(uri2);
    }

    public final native int getCurrentRenderer();

    public final native float getFPS();

    public final native RewindWindow getRewindWindow();

    public final native String getRichPresenceStatus();

    public final native RASimpleRuntimeAchievementBucketEntry[] getRuntimeAchievementBuckets();

    public final native RASimpleRuntimeAchievement[] getRuntimeAchievements();

    public final native long[] getRuntimeSubsetIds();

    public final native boolean loadRewindState(RewindSaveState rewindSaveState);

    public final native void onScreenRelease();

    public final native void onScreenTouch(int i, int i2);

    public final native void pauseEmulation();

    public final native boolean precompileVulkanPipelines(int i, String str, String str2, int i2, Map<String, Float> map);

    public final native void presentFrame(long j, FrameRenderCallback frameRenderCallback);

    public final native void presentVulkanFrame(long j, long j2);

    public final native boolean prewarmOpenGlRetroArchFilter(int i, int i2);

    public final native long refreshPendingRetroAchievementsSubmissions();

    public final native void releaseOpenGlRetroArchFilter();

    public final native void resetEmulation();

    public final native void resizeVulkanSurface(int i, int i2, int i3);

    public final native void resumeEmulation();

    public final native long[] retryPendingRetroAchievementsSubmissions(long[] jArr);

    public final native void setFastForwardEnabled(boolean z);

    public final native void setFrameLimitSpeedMultiplier(float f);

    public final native void setMicrophoneEnabled(boolean z);

    public final native void setRetroAchievementsSubmissionTransportSuspended(boolean z);

    public final native void setSlot2AnalogInput(float f, float f2);

    public final native boolean setupAchievements(RASimpleAchievement[] rASimpleAchievementArr, RASimpleLeaderboard[] rASimpleLeaderboardArr, String str, RARuntimeBridgeConfig rARuntimeBridgeConfig);

    public final native void setupCheats(Cheat[] cheatArr);

    public final native void setupEmulator(EmulatorConfiguration emulatorConfiguration, DSiCameraSource dSiCameraSource, ByteBuffer byteBuffer);

    public final native void startEmulation(boolean z);

    public final native void stopEmulation();

    public final native boolean takeScreenshot();

    public final native void unloadRetroAchievementsData();

    public final native void updateEmulatorConfiguration(EmulatorConfiguration emulatorConfiguration);
}
