package defpackage;

import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ne1  reason: default package */
/* loaded from: classes.dex */
public final class ne1 {
    public final Context a;
    public final c76 b;

    public ne1(Context context, c76 c76Var) {
        this.a = context;
        this.b = c76Var;
    }

    public static z66 e(int i, int i2, nj3 nj3Var) {
        return new z66(hf.b0(new j05(f(i, i2), nj3Var, 1.0f, false)));
    }

    public static Rect f(int i, int i2) {
        float f = i;
        float f2 = i2;
        if (f / f2 > 1.3333334f) {
            int i3 = (int) ((f2 / 192.0f) * 256.0f);
            return new Rect((i - i3) / 2, 0, i3, i2);
        }
        int i4 = (int) ((f / 256.0f) * 192.0f);
        return new Rect(0, (i2 - i4) / 2, i, i4);
    }

    public final z66 a(int i, int i2, List list, d83 d83Var) {
        int i3;
        int i4;
        x66 x66Var = (x66) gt0.H0(list);
        int i5 = d83Var.a;
        int i6 = d83Var.b;
        int i7 = d83Var.c;
        int i8 = d83Var.d;
        int i9 = (i - i5) - i7;
        c76 c76Var = this.b;
        int a = (int) c76Var.a(140.0f);
        c76Var.a(50.0f);
        int a2 = (int) c76Var.a(40.0f);
        int a3 = (int) c76Var.a(4.0f);
        int i10 = (int) (i9 / 1.3333334f);
        int y = x66Var.c.getY() - i6;
        int i11 = i2 - i8;
        Rect rect = x66Var.c;
        int bottom = i11 - rect.getBottom();
        if (i10 <= y && i10 <= bottom) {
            i3 = i9;
            i4 = 0;
        } else {
            i10 = Math.min(y, bottom);
            i3 = (int) (i10 * 1.3333334f);
            i4 = (i9 - i3) / 2;
        }
        int i12 = i4 + i5;
        Rect rect2 = new Rect(i12, rect.getY() - i10, i3, i10);
        Rect rect3 = new Rect(i12, rect.getBottom(), i3, i10);
        int a4 = (int) c76Var.a(8.0f);
        int i13 = i5 + a4;
        int i14 = (i11 - a) - a4;
        Rect rect4 = new Rect(i13, i14, a, a);
        int i15 = i - i7;
        Rect rect5 = new Rect((i15 - a) - a4, i14, a, a);
        int a5 = (int) c76Var.a(54.0f);
        int a6 = (int) c76Var.a(32.0f);
        int a7 = (int) c76Var.a(56.0f);
        int a8 = (int) c76Var.a(44.0f);
        int i16 = i / 2;
        int i17 = a3 / 2;
        int i18 = (i11 - a6) - a4;
        double d = a3;
        double d2 = d * 1.5d;
        int i19 = (int) (d / 2.0d);
        return new z66(hf.c0(new j05(rect2, nj3.TOP_SCREEN, 1.0f, false), new j05(rect3, nj3.BOTTOM_SCREEN, 1.0f, false), new j05(rect4, nj3.DPAD, 1.0f, false), new j05(rect5, nj3.BUTTONS, 1.0f, false), new j05(new Rect(i13, rect.getBottom() + a4, a7, a8), nj3.BUTTON_L, 1.0f, false), new j05(new Rect((i15 - a7) - a4, rect.getBottom() + a4, a7, a8), nj3.BUTTON_R, 1.0f, false), new j05(new Rect((i16 - a5) - i17, i18, a5, a6), nj3.BUTTON_SELECT, 1.0f, false), new j05(new Rect(i17 + i16, i18, a5, a6), nj3.BUTTON_START, 1.0f, false), new j05(new Rect(i16 - ((int) ((a2 * 2.0d) + d2)), rect.getBottom() + a4, a2, a2), nj3.BUTTON_HINGE, 1.0f, false), new j05(new Rect((i16 - a2) - i19, rect.getBottom() + a4, a2, a2), nj3.BUTTON_TOGGLE_SOFT_INPUT, 1.0f, false), new j05(new Rect(a3 + i16 + i19, rect.getBottom() + a4, a2, a2), nj3.BUTTON_MICROPHONE_TOGGLE, 1.0f, false), new j05(new Rect(i16 + a2 + ((int) d2), rect.getBottom() + a4, a2, a2), nj3.BUTTON_FAST_FORWARD_TOGGLE, 1.0f, false)));
    }

    public final z66 b(int i, int i2, d83 d83Var, nj3 nj3Var) {
        j05[] j05VarArr;
        if (nj3Var != null && !nj3Var.isScreen()) {
            i.h("When specifying a single screen component, it must be a screen component");
            return null;
        }
        int i3 = d83Var.a;
        int i4 = d83Var.b;
        int i5 = d83Var.c;
        int i6 = d83Var.d;
        int i7 = (i - i3) - i5;
        int i8 = (i2 - i4) - i6;
        c76 c76Var = this.b;
        int a = (int) c76Var.a(140.0f);
        c76Var.a(50.0f);
        int a2 = (int) c76Var.a(40.0f);
        int a3 = (int) c76Var.a(4.0f);
        if (nj3Var == null) {
            int E = u24.E(i7 * 0.66f);
            int i9 = (int) (E / 1.3333334f);
            if (i9 > i8) {
                E = (int) (i8 * 1.3333334f);
            } else {
                i8 = i9;
            }
            int i10 = i7 - E;
            j05VarArr = new j05[]{new j05(new Rect(i3, i4, E, i8), nj3.TOP_SCREEN, 1.0f, false), new j05(new Rect(E + i3, i4, i10, (int) (i10 / 1.3333334f)), nj3.BOTTOM_SCREEN, 1.0f, false)};
        } else {
            Rect f = f(i7, i8);
            j05VarArr = new j05[]{new j05(new Rect(f.getX() + i3, f.getY() + i4, f.getWidth(), f.getHeight()), nj3Var, 1.0f, false)};
        }
        int i11 = i2 - i6;
        int i12 = i11 - a;
        Rect rect = new Rect(i3, i12, a, a);
        int i13 = i - i5;
        Rect rect2 = new Rect(i13 - a, i12, a, a);
        int a4 = (int) c76Var.a(54.0f);
        int a5 = (int) c76Var.a(32.0f);
        int a6 = (int) c76Var.a(56.0f);
        int a7 = (int) c76Var.a(44.0f);
        ww2 ww2Var = new ww2(11);
        ww2Var.d(j05VarArr);
        ww2Var.a(new j05(rect, nj3.DPAD, 1.0f, false));
        ww2Var.a(new j05(rect2, nj3.BUTTONS, 1.0f, false));
        ww2Var.a(new j05(new Rect(i3, i4, a6, a7), nj3.BUTTON_L, 1.0f, false));
        ww2Var.a(new j05(new Rect(i13 - a6, i4, a6, a7), nj3.BUTTON_R, 1.0f, false));
        int i14 = i11 - a5;
        ww2Var.a(new j05(new Rect(((i - a3) / 2) - a4, i14, a4, a5), nj3.BUTTON_SELECT, 1.0f, false));
        ww2Var.a(new j05(new Rect((i + a3) / 2, i14, a4, a5), nj3.BUTTON_START, 1.0f, false));
        int i15 = i / 2;
        double d = a3;
        double d2 = d * 1.5d;
        ww2Var.a(new j05(new Rect(i15 - ((int) ((a2 * 2.0d) + d2)), i4, a2, a2), nj3.BUTTON_HINGE, 1.0f, false));
        int i16 = (int) (d / 2.0d);
        ww2Var.a(new j05(new Rect((i15 - a2) - i16, i4, a2, a2), nj3.BUTTON_TOGGLE_SOFT_INPUT, 1.0f, false));
        ww2Var.a(new j05(new Rect(i16 + i15, i4, a2, a2), nj3.BUTTON_MICROPHONE_TOGGLE, 1.0f, false));
        ww2Var.a(new j05(new Rect(i15 + a2 + ((int) d2), i4, a2, a2), nj3.BUTTON_FAST_FORWARD_TOGGLE, 1.0f, false));
        ArrayList arrayList = ww2Var.b;
        return new z66(hf.c0(arrayList.toArray(new j05[arrayList.size()])));
    }

    public final ff7 c(jf7 jf7Var) {
        z66 a;
        List list;
        vr4 vr4Var;
        int i;
        ff7 ff7Var;
        z66 d;
        z66 d2;
        ko4 ko4Var;
        z66 d3;
        int i2;
        WindowManager windowManager;
        DisplayCutout cutout;
        int safeInsetLeft;
        int safeInsetTop;
        int safeInsetRight;
        int safeInsetBottom;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int displayCutout;
        Insets insets;
        int i3;
        int i4;
        int i5;
        int i6;
        jf7Var.getClass();
        my4 my4Var = jf7Var.a;
        int i7 = my4Var.a;
        int i8 = my4Var.b;
        ko4 ko4Var2 = jf7Var.c;
        List<x66> list2 = jf7Var.d;
        ok3 ok3Var = jf7Var.e;
        mk3 mk3Var = ok3Var.a;
        mk3 mk3Var2 = ok3Var.b;
        d83 d83Var = jf7Var.b;
        if (mk3Var2 != null) {
            int i9 = mk3Var2.d;
            int i10 = mk3Var2.c;
            int i11 = mk3Var2.a;
            d83 d83Var2 = d83.e;
            if (i11 != 0 || (i2 = Build.VERSION.SDK_INT) < 29 || (windowManager = (WindowManager) this.a.getSystemService(WindowManager.class)) == null) {
                ff7Var = null;
            } else if (i2 >= 30) {
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                displayCutout = WindowInsets.Type.displayCutout();
                insets = windowInsets.getInsets(displayCutout);
                insets.getClass();
                i3 = insets.left;
                i4 = insets.top;
                ff7Var = null;
                i5 = insets.right;
                i6 = insets.bottom;
                d83Var2 = new d83(i3, i4, i5, i6);
            } else {
                ff7Var = null;
                cutout = windowManager.getDefaultDisplay().getCutout();
                if (cutout != null) {
                    safeInsetLeft = cutout.getSafeInsetLeft();
                    safeInsetTop = cutout.getSafeInsetTop();
                    safeInsetRight = cutout.getSafeInsetRight();
                    safeInsetBottom = cutout.getSafeInsetBottom();
                    d83Var2 = new d83(safeInsetLeft, safeInsetTop, safeInsetRight, safeInsetBottom);
                }
            }
            lk3 lk3Var = mk3Var.b;
            lk3 lk3Var2 = lk3.BUILT_IN;
            if (lk3Var == lk3Var2 && mk3Var2.b == lk3Var2) {
                if (mk3Var.a == 0) {
                    if (i10 > i9) {
                        ko4Var = ko4.LANDSCAPE;
                    } else {
                        ko4Var = ko4.PORTRAIT;
                    }
                    int i12 = me1.a[ko4Var.ordinal()];
                    if (i12 != 1) {
                        if (i12 == 2) {
                            d3 = b(i10, i9, d83Var2, nj3.BOTTOM_SCREEN);
                        } else {
                            i.d();
                            return ff7Var;
                        }
                    } else {
                        d3 = d(i10, i9, d83Var2, nj3.BOTTOM_SCREEN);
                    }
                    vr4Var = new vr4(e(i7, i8, nj3.TOP_SCREEN), d3);
                } else {
                    int i13 = me1.a[ko4Var2.ordinal()];
                    if (i13 != 1) {
                        if (i13 == 2) {
                            d2 = b(i7, i8, d83Var, nj3.BOTTOM_SCREEN);
                        } else {
                            i.d();
                            return ff7Var;
                        }
                    } else {
                        d2 = d(i7, i8, d83Var, nj3.BOTTOM_SCREEN);
                    }
                    vr4Var = new vr4(d2, e(i10, i9, nj3.TOP_SCREEN));
                }
            } else {
                int i14 = me1.a[ko4Var2.ordinal()];
                if (i14 != 1) {
                    if (i14 == 2) {
                        d = b(i7, i8, d83Var, nj3.BOTTOM_SCREEN);
                    } else {
                        i.d();
                        return ff7Var;
                    }
                } else {
                    d = d(i7, i8, d83Var, nj3.BOTTOM_SCREEN);
                }
                vr4Var = new vr4(d, e(i10, i9, nj3.TOP_SCREEN));
            }
        } else {
            int i15 = me1.a[ko4Var2.ordinal()];
            if (i15 != 1) {
                if (i15 == 2) {
                    if (list2 == null || !list2.isEmpty()) {
                        for (x66 x66Var : list2) {
                            if (x66Var.a == ko4.PORTRAIT) {
                                int i16 = d83Var.a;
                                int i17 = d83Var.b;
                                int i18 = d83Var.c;
                                int i19 = d83Var.d;
                                int i20 = (i8 - i17) - i19;
                                c76 c76Var = this.b;
                                int a2 = (int) c76Var.a(140.0f);
                                int a3 = (int) c76Var.a(50.0f);
                                int a4 = (int) c76Var.a(40.0f);
                                int a5 = (int) c76Var.a(8.0f);
                                Rect rect = ((x66) gt0.H0(list2)).c;
                                int x = rect.getX() - i16;
                                int i21 = (int) (x / 1.3333334f);
                                if (i21 > i20) {
                                    x = (int) (i20 * 1.3333334f);
                                    i21 = i20;
                                }
                                int i22 = i7 - i18;
                                int right = i22 - rect.getRight();
                                int i23 = (int) (right / 1.3333334f);
                                if (i23 > i20) {
                                    right = (int) (i20 * 1.3333334f);
                                    i23 = i20;
                                }
                                int i24 = (i20 - a3) - a5;
                                if (i21 < i24 && i23 < i24) {
                                    i = a3 + i17 + a5;
                                } else {
                                    i = i17;
                                }
                                Rect rect2 = new Rect(rect.getX() - x, i, x, i21);
                                Rect rect3 = new Rect(rect.getRight(), i, right, i23);
                                int a6 = (int) c76Var.a(8.0f);
                                int i25 = i16 + a6;
                                int i26 = i8 - i19;
                                int i27 = (i26 - a2) - a6;
                                Rect rect4 = new Rect(i25, i27, a2, a2);
                                Rect rect5 = new Rect((i22 - a2) - a6, i27, a2, a2);
                                int a7 = (int) c76Var.a(54.0f);
                                int a8 = (int) c76Var.a(32.0f);
                                int a9 = (int) c76Var.a(56.0f);
                                int a10 = (int) c76Var.a(44.0f);
                                int i28 = i17 + a6;
                                int i29 = (i26 - a8) - a6;
                                int i30 = a5 * 2;
                                a = new z66(hf.c0(new j05(rect2, nj3.TOP_SCREEN, 1.0f, false), new j05(rect3, nj3.BOTTOM_SCREEN, 1.0f, false), new j05(rect4, nj3.DPAD, 1.0f, false), new j05(rect5, nj3.BUTTONS, 1.0f, false), new j05(new Rect(i25, i28, a9, a10), nj3.BUTTON_L, 1.0f, false), new j05(new Rect((i22 - a9) - a6, i28, a9, a10), nj3.BUTTON_R, 1.0f, false), new j05(new Rect((rect.getX() - a7) - a5, i29, a7, a8), nj3.BUTTON_SELECT, 1.0f, false), new j05(new Rect(rect.getRight() + a5, i29, a7, a8), nj3.BUTTON_START, 1.0f, false), new j05(new Rect((rect.getX() - (a4 * 2)) - i30, i28, a4, a4), nj3.BUTTON_HINGE, 1.0f, false), new j05(new Rect((rect.getX() - a4) - a5, i28, a4, a4), nj3.BUTTON_TOGGLE_SOFT_INPUT, 1.0f, false), new j05(new Rect(rect.getRight() + a4 + a5, i28, a4, a4), nj3.BUTTON_MICROPHONE_TOGGLE, 1.0f, false), new j05(new Rect(rect.getRight() + i30, i28, a4, a4), nj3.BUTTON_FAST_FORWARD_TOGGLE, 1.0f, false)));
                                list = null;
                                break;
                            }
                        }
                    }
                    if (list2 == null || !list2.isEmpty()) {
                        for (x66 x66Var2 : list2) {
                            if (x66Var2.a == ko4.LANDSCAPE) {
                                a = a(i7, i8, list2, d83Var);
                                list = null;
                                break;
                            }
                        }
                    }
                    list = null;
                    a = b(i7, i8, d83Var, null);
                } else {
                    i.d();
                    return null;
                }
            } else {
                if (list2 == null || !list2.isEmpty()) {
                    for (x66 x66Var3 : list2) {
                        if (x66Var3.a == ko4.LANDSCAPE) {
                            a = a(i7, i8, list2, d83Var);
                            list = null;
                            break;
                        }
                    }
                }
                list = null;
                a = d(i7, i8, d83Var, null);
            }
            vr4Var = new vr4(a, new z66(list));
        }
        return new ff7((z66) vr4Var.A, (z66) vr4Var.B);
    }

    public final z66 d(int i, int i2, d83 d83Var, nj3 nj3Var) {
        int i3;
        int i4;
        int i5;
        j05[] j05VarArr;
        int i6;
        int i7;
        if (nj3Var != null && !nj3Var.isScreen()) {
            i.h("When specifying a single screen component, it must be a screen component");
            return null;
        }
        int i8 = d83Var.a;
        int i9 = d83Var.b;
        int i10 = d83Var.c;
        int i11 = d83Var.d;
        int i12 = (i - i8) - i10;
        int i13 = (i2 - i9) - i11;
        c76 c76Var = this.b;
        int a = (int) c76Var.a(140.0f);
        int a2 = (int) c76Var.a(50.0f);
        int a3 = (int) c76Var.a(40.0f);
        int a4 = (int) c76Var.a(4.0f);
        int i14 = (int) (i12 / 1.3333334f);
        if (nj3Var == null) {
            if (i14 * 2 > i13) {
                i14 = i13 / 2;
                int i15 = (int) (i14 * 1.3333334f);
                i7 = (i12 - i15) / 2;
                i12 = i15;
            } else {
                i7 = 0;
            }
            int i16 = i7 + i8;
            i3 = i11;
            i4 = i10;
            i5 = a2;
            j05VarArr = new j05[]{new j05(new Rect(i16, i9, i12, i14), nj3.TOP_SCREEN, 1.0f, false), new j05(new Rect(i16, i9 + i14, i12, i14), nj3.BOTTOM_SCREEN, 1.0f, false)};
        } else {
            i3 = i11;
            i4 = i10;
            i5 = a2;
            j05VarArr = new j05[]{new j05(new Rect(i8, i9, i12, i14), nj3Var, 1.0f, false)};
        }
        if (nj3Var == null) {
            i6 = (i14 * 2) + i9;
        } else {
            i6 = i9 + i14;
        }
        if (i6 + i5 + a > i2) {
            i6 = i9 + i14;
        }
        int i17 = i2 - i3;
        int i18 = i17 - a;
        Rect rect = new Rect(i8, i18, a, a);
        int i19 = i - i4;
        Rect rect2 = new Rect(i19 - a, i18, a, a);
        int a5 = (int) c76Var.a(54.0f);
        int a6 = (int) c76Var.a(32.0f);
        int a7 = (int) c76Var.a(56.0f);
        int a8 = (int) c76Var.a(44.0f);
        ww2 ww2Var = new ww2(11);
        ww2Var.d(j05VarArr);
        ww2Var.a(new j05(rect, nj3.DPAD, 1.0f, false));
        ww2Var.a(new j05(rect2, nj3.BUTTONS, 1.0f, false));
        ww2Var.a(new j05(new Rect(i8, i6, a7, a8), nj3.BUTTON_L, 1.0f, false));
        ww2Var.a(new j05(new Rect(i19 - a7, i6, a7, a8), nj3.BUTTON_R, 1.0f, false));
        int i20 = i / 2;
        int i21 = a4 / 2;
        int i22 = i17 - a6;
        ww2Var.a(new j05(new Rect((i20 - a5) - i21, i22, a5, a6), nj3.BUTTON_SELECT, 1.0f, false));
        ww2Var.a(new j05(new Rect(i21 + i20, i22, a5, a6), nj3.BUTTON_START, 1.0f, false));
        double d = a4;
        double d2 = d * 1.5d;
        ww2Var.a(new j05(new Rect(i20 - ((int) ((a3 * 2.0d) + d2)), i6, a3, a3), nj3.BUTTON_HINGE, 1.0f, false));
        int i23 = (int) (d / 2.0d);
        ww2Var.a(new j05(new Rect((i20 - a3) - i23, i6, a3, a3), nj3.BUTTON_TOGGLE_SOFT_INPUT, 1.0f, false));
        ww2Var.a(new j05(new Rect(i23 + i20, i6, a3, a3), nj3.BUTTON_MICROPHONE_TOGGLE, 1.0f, false));
        ww2Var.a(new j05(new Rect(i20 + a3 + ((int) d2), i6, a3, a3), nj3.BUTTON_FAST_FORWARD_TOGGLE, 1.0f, false));
        ArrayList arrayList = ww2Var.b;
        return new z66(hf.c0(arrayList.toArray(new j05[arrayList.size()])));
    }
}
