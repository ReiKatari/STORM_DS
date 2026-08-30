package me.magnum.melonds.ui.layouteditor;

import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import rh.s;
import sh.c;
import sh.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f9536a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f9537b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int[] f9538c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int[] f9539d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int[] f9540e;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.MAIN_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.SECONDARY_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f9536a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.SIZE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[c.WIDTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[c.HEIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f9537b = iArr2;
        int[] iArr3 = new int[ve.c.values().length];
        try {
            iArr3[ve.c.TOP_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[ve.c.BOTTOM_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f9538c = iArr3;
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
            iArr4[LayoutEditorActivity.a.SAVE_AND_EXIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[LayoutEditorActivity.a.EXIT_WITHOUT_SAVING.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        f9539d = iArr4;
        int[] iArr5 = new int[s.values().length];
        try {
            iArr5[s.WIDTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr5[s.HEIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        f9540e = iArr5;
    }
}
