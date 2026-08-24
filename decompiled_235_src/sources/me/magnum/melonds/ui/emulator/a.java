package me.magnum.melonds.ui.emulator;

import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[ed5.values().length];
        try {
            iArr[ed5.REOPEN_PAUSE_MENU.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ed5.RESUME_SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ed5.REOPEN_TERMINAL_EXIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[mk2.values().length];
        try {
            iArr2[mk2.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[mk2.TOP_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[mk2.TOP_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[mk2.BOTTOM_LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[mk2.BOTTOM_CENTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[mk2.BOTTOM_RIGHT.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[mk2.HIDDEN.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
        int[] iArr3 = new int[VideoRenderer.values().length];
        try {
            iArr3[VideoRenderer.SOFTWARE.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[VideoRenderer.OPENGL.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[VideoRenderer.VULKAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        c = iArr3;
        int[] iArr4 = new int[jq1.values().length];
        try {
            iArr4[jq1.INTERNAL_TOP_EXTERNAL_BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[jq1.INTERNAL_BOTTOM_EXTERNAL_TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[jq1.OFF.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        d = iArr4;
        int[] iArr5 = new int[EmulatorActivity.a.values().length];
        try {
            iArr5[EmulatorActivity.a.OPEN_GL.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[EmulatorActivity.a.VULKAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        e = iArr5;
    }
}
