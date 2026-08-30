package me.magnum.melonds.ui.emulator;

import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[u35.values().length];
        try {
            iArr[u35.REOPEN_PAUSE_MENU.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u35.RESUME_SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u35.REOPEN_TERMINAL_EXIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[nf2.values().length];
        try {
            iArr2[nf2.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[nf2.TOP_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[nf2.TOP_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[nf2.BOTTOM_LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[nf2.BOTTOM_CENTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[nf2.BOTTOM_RIGHT.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[nf2.HIDDEN.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
        int[] iArr3 = new int[cm1.values().length];
        try {
            iArr3[cm1.INTERNAL_TOP_EXTERNAL_BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[cm1.INTERNAL_BOTTOM_EXTERNAL_TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[cm1.OFF.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        c = iArr3;
        int[] iArr4 = new int[EmulatorActivity.a.values().length];
        try {
            iArr4[EmulatorActivity.a.OPEN_GL.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[EmulatorActivity.a.VULKAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        d = iArr4;
        int[] iArr5 = new int[VideoRenderer.values().length];
        try {
            iArr5[VideoRenderer.VULKAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        e = iArr5;
    }
}
