package me.magnum.melonds;

import android.net.Uri;
import java.nio.ByteBuffer;
import m9.o;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.domain.model.EmulatorConfiguration;
import me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement;
import me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard;
import me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievement;
import me.magnum.melonds.ui.emulator.render.FrameRenderCallback;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
import oe.s;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class MelonEmulator {

    /* renamed from: a  reason: collision with root package name */
    public static final MelonEmulator f9466a = new Object();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ fc.a $ENTRIES;
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
            $ENTRIES = r.x($values);
        }

        private a(String str, int i2) {
        }

        public static fc.a getEntries() {
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
    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class b {
        private static final /* synthetic */ fc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b NONE = new b("NONE", 0);
        public static final b GBA_ROM = new b("GBA_ROM", 1);
        public static final b RUMBLE_PAK = new b("RUMBLE_PAK", 2);
        public static final b MEMORY_EXPANSION = new b("MEMORY_EXPANSION", 3);

        private static final /* synthetic */ b[] $values() {
            return new b[]{NONE, GBA_ROM, RUMBLE_PAK, MEMORY_EXPANSION};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = r.x($values);
        }

        private b(String str, int i2) {
        }

        public static fc.a getEntries() {
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
    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class c {
        private static final /* synthetic */ fc.a $ENTRIES;
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
            $ENTRIES = r.x($values);
        }

        private c(String str, int i2, boolean z10) {
            this.isTerminal = z10;
        }

        public static fc.a getEntries() {
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

    private final native int loadRomInternal(String str, String str2, int i2, String str3, String str4);

    private final native boolean loadStateInternal(String str);

    private final native void onKeyPress(int i2);

    private final native void onKeyRelease(int i2);

    private final native boolean saveStateInternal(String str);

    public final a a() {
        return (a) ((fc.b) a.getEntries()).get(bootFirmwareInternal());
    }

    public final c b(Uri uri, Uri uri2, b bVar, Uri uri3, Uri uri4) {
        String str;
        uri.getClass();
        bVar.getClass();
        String uri5 = uri.toString();
        uri5.getClass();
        String uri6 = uri2.toString();
        uri6.getClass();
        int ordinal = bVar.ordinal();
        String str2 = null;
        if (uri3 != null) {
            str = uri3.toString();
        } else {
            str = null;
        }
        if (uri4 != null) {
            str2 = uri4.toString();
        }
        int loadRomInternal = loadRomInternal(uri5, uri6, ordinal, str, str2);
        if (loadRomInternal != 0) {
            if (loadRomInternal != 1) {
                if (loadRomInternal != 2) {
                    if (loadRomInternal == 3) {
                        return c.BIOS_FAILED;
                    }
                    o.r("Unknown load result");
                    return null;
                }
                return c.NDS_FAILED;
            }
            return c.SUCCESS_GBA_FAILED;
        }
        return c.SUCCESS;
    }

    public final boolean c(Uri uri) {
        String uri2 = uri.toString();
        uri2.getClass();
        return loadStateInternal(uri2);
    }

    public final void d(s sVar) {
        sVar.getClass();
        onKeyPress(sVar.getKeyCode());
    }

    public final void e(s sVar) {
        sVar.getClass();
        onKeyRelease(sVar.getKeyCode());
    }

    public final boolean f(Uri uri) {
        String uri2 = uri.toString();
        uri2.getClass();
        return saveStateInternal(uri2);
    }

    public final native float getFPS();

    public final native RewindWindow getRewindWindow();

    public final native String getRichPresenceStatus();

    public final native RASimpleRuntimeAchievement[] getRuntimeAchievements();

    public final native boolean loadRewindState(RewindSaveState rewindSaveState);

    public final native void onScreenRelease();

    public final native void onScreenTouch(int i2, int i10);

    public final native void pauseEmulation();

    public final native void presentFrame(long j2, FrameRenderCallback frameRenderCallback);

    public final native void resetEmulation();

    public final native void resumeEmulation();

    public final native void setFastForwardEnabled(boolean z10);

    public final native void setMicrophoneEnabled(boolean z10);

    public final native void setupAchievements(RASimpleAchievement[] rASimpleAchievementArr, RASimpleLeaderboard[] rASimpleLeaderboardArr, String str);

    public final native void setupCheats(Cheat[] cheatArr);

    public final native void setupEmulator(EmulatorConfiguration emulatorConfiguration, DSiCameraSource dSiCameraSource, ByteBuffer byteBuffer);

    public final native void startEmulation();

    public final native void stopEmulation();

    public final native boolean takeScreenshot();

    public final native void unloadRetroAchievementsData();

    public final native void updateEmulatorConfiguration(EmulatorConfiguration emulatorConfiguration);
}
