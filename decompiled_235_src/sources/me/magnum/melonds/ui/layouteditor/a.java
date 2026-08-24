package me.magnum.melonds.ui.layouteditor;

import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[sn3.values().length];
        try {
            iArr[sn3.MAIN_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sn3.SECONDARY_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[oj3.values().length];
        try {
            iArr2[oj3.SIZE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[oj3.WIDTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[oj3.HEIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[nj3.values().length];
        try {
            iArr3[nj3.TOP_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[nj3.BOTTOM_SCREEN.ordinal()] = 2;
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
        int[] iArr5 = new int[il3.values().length];
        try {
            iArr5[il3.WIDTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[il3.HEIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        e = iArr5;
    }
}
