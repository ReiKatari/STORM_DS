package me.magnum.melonds.ui.layouteditor;

import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[ug3.values().length];
        try {
            iArr[ug3.MAIN_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ug3.SECONDARY_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[wc3.values().length];
        try {
            iArr2[wc3.SIZE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wc3.WIDTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[wc3.HEIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[vc3.values().length];
        try {
            iArr3[vc3.TOP_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[vc3.BOTTOM_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        c = iArr3;
        int[] iArr4 = new int[LayoutEditorActivity.a.values().length];
        try {
            iArr4[LayoutEditorActivity.a.PROPERTIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[LayoutEditorActivity.a.BACKGROUNDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[LayoutEditorActivity.a.REVERT.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[LayoutEditorActivity.a.RESET.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[LayoutEditorActivity.a.SAVE_AS_NEW.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[LayoutEditorActivity.a.SAVE_AND_EXIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[LayoutEditorActivity.a.EXIT_WITHOUT_SAVING.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
        int[] iArr5 = new int[ne3.values().length];
        try {
            iArr5[ne3.WIDTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[ne3.HEIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        e = iArr5;
    }
}
