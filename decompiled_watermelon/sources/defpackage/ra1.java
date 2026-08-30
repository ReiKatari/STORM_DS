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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ra1  reason: default package */
/* loaded from: classes.dex */
public final class ra1 {
    public final Context a;
    public final pv5 b;

    public ra1(Context context, pv5 pv5Var) {
        this.a = context;
        this.b = pv5Var;
    }

    public static mv5 e(int i, int i2, vc3 vc3Var) {
        return new mv5(l07.b0(new gr4(f(i, i2), vc3Var, 1.0f, false)));
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

    public final mv5 a(int i, int i2, List list, w13 w13Var) {
        int i3;
        int i4;
        kv5 kv5Var = (kv5) tq0.K0(list);
        int i5 = w13Var.a;
        int i6 = w13Var.b;
        int i7 = w13Var.c;
        int i8 = w13Var.d;
        int i9 = (i - i5) - i7;
        pv5 pv5Var = this.b;
        int a = (int) pv5Var.a(140.0f);
        int a2 = (int) pv5Var.a(50.0f);
        int a3 = (int) pv5Var.a(40.0f);
        int a4 = (int) pv5Var.a(4.0f);
        int i10 = (int) (i9 / 1.3333334f);
        int y = kv5Var.c.getY() - i6;
        int i11 = i2 - i8;
        Rect rect = kv5Var.c;
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
        int i13 = i11 - a;
        Rect rect4 = new Rect(i5, i13, a, a);
        int i14 = i - i7;
        Rect rect5 = new Rect(i14 - a, i13, a, a);
        gr4 gr4Var = new gr4(rect2, vc3.TOP_SCREEN, 1.0f, false);
        gr4 gr4Var2 = new gr4(rect3, vc3.BOTTOM_SCREEN, 1.0f, false);
        gr4 gr4Var3 = new gr4(rect4, vc3.DPAD, 1.0f, false);
        gr4 gr4Var4 = new gr4(rect5, vc3.BUTTONS, 1.0f, false);
        gr4 gr4Var5 = new gr4(new Rect(i5, rect.getBottom(), a2, a2), vc3.BUTTON_L, 1.0f, false);
        int i15 = i / 2;
        int i16 = i15 - a3;
        int i17 = a4 / 2;
        int i18 = i11 - a3;
        double d = a4;
        double d2 = d * 1.5d;
        int i19 = (int) (d / 2.0d);
        return new mv5(l07.c0(gr4Var, gr4Var2, gr4Var3, gr4Var4, gr4Var5, new gr4(new Rect(i14 - a2, rect.getBottom(), a2, a2), vc3.BUTTON_R, 1.0f, false), new gr4(new Rect(i16 - i17, i18, a3, a3), vc3.BUTTON_SELECT, 1.0f, false), new gr4(new Rect(i15 + i17, i18, a3, a3), vc3.BUTTON_START, 1.0f, false), new gr4(new Rect(i15 - ((int) ((a3 * 2.0d) + d2)), rect.getBottom(), a3, a3), vc3.BUTTON_HINGE, 1.0f, false), new gr4(new Rect(i16 - i19, rect.getBottom(), a3, a3), vc3.BUTTON_TOGGLE_SOFT_INPUT, 1.0f, false), new gr4(new Rect(a4 + i15 + i19, rect.getBottom(), a3, a3), vc3.BUTTON_MICROPHONE_TOGGLE, 1.0f, false), new gr4(new Rect(i15 + a3 + ((int) d2), rect.getBottom(), a3, a3), vc3.BUTTON_FAST_FORWARD_TOGGLE, 1.0f, false)));
    }

    public final mv5 b(int i, int i2, w13 w13Var, vc3 vc3Var) {
        gr4[] gr4VarArr;
        if (vc3Var != null && !vc3Var.isScreen()) {
            i.i("When specifying a single screen component, it must be a screen component");
            return null;
        }
        int i3 = w13Var.a;
        int i4 = w13Var.b;
        int i5 = w13Var.c;
        int i6 = w13Var.d;
        int i7 = (i - i3) - i5;
        int i8 = (i2 - i4) - i6;
        pv5 pv5Var = this.b;
        int a = (int) pv5Var.a(140.0f);
        int a2 = (int) pv5Var.a(50.0f);
        int a3 = (int) pv5Var.a(40.0f);
        int a4 = (int) pv5Var.a(4.0f);
        if (vc3Var == null) {
            int X = jv3.X(i7 * 0.66f);
            int i9 = (int) (X / 1.3333334f);
            if (i9 > i8) {
                X = (int) (i8 * 1.3333334f);
            } else {
                i8 = i9;
            }
            int i10 = i7 - X;
            gr4VarArr = new gr4[]{new gr4(new Rect(i3, i4, X, i8), vc3.TOP_SCREEN, 1.0f, false), new gr4(new Rect(X + i3, i4, i10, (int) (i10 / 1.3333334f)), vc3.BOTTOM_SCREEN, 1.0f, false)};
        } else {
            Rect f = f(i7, i8);
            gr4VarArr = new gr4[]{new gr4(new Rect(f.getX() + i3, f.getY() + i4, f.getWidth(), f.getHeight()), vc3Var, 1.0f, false)};
        }
        int i11 = i2 - i6;
        int i12 = i11 - a;
        Rect rect = new Rect(i3, i12, a, a);
        int i13 = i - i5;
        Rect rect2 = new Rect(i13 - a, i12, a, a);
        vq2 vq2Var = new vq2(11);
        vq2Var.d(gr4VarArr);
        vq2Var.a(new gr4(rect, vc3.DPAD, 1.0f, false));
        vq2Var.a(new gr4(rect2, vc3.BUTTONS, 1.0f, false));
        vq2Var.a(new gr4(new Rect(i3, i4, a2, a2), vc3.BUTTON_L, 1.0f, false));
        vq2Var.a(new gr4(new Rect(i13 - a2, i4, a2, a2), vc3.BUTTON_R, 1.0f, false));
        int i14 = i11 - a3;
        vq2Var.a(new gr4(new Rect(((i - a4) / 2) - a3, i14, a3, a3), vc3.BUTTON_SELECT, 1.0f, false));
        vq2Var.a(new gr4(new Rect((i + a4) / 2, i14, a3, a3), vc3.BUTTON_START, 1.0f, false));
        int i15 = i / 2;
        double d = a4;
        double d2 = d * 1.5d;
        vq2Var.a(new gr4(new Rect(i15 - ((int) ((a3 * 2.0d) + d2)), i4, a3, a3), vc3.BUTTON_HINGE, 1.0f, false));
        int i16 = (int) (d / 2.0d);
        vq2Var.a(new gr4(new Rect((i15 - a3) - i16, i4, a3, a3), vc3.BUTTON_TOGGLE_SOFT_INPUT, 1.0f, false));
        vq2Var.a(new gr4(new Rect(i16 + i15, i4, a3, a3), vc3.BUTTON_MICROPHONE_TOGGLE, 1.0f, false));
        vq2Var.a(new gr4(new Rect(i15 + a3 + ((int) d2), i4, a3, a3), vc3.BUTTON_FAST_FORWARD_TOGGLE, 1.0f, false));
        ArrayList arrayList = vq2Var.b;
        return new mv5(l07.c0(arrayList.toArray(new gr4[arrayList.size()])));
    }

    public final k17 c(o17 o17Var) {
        mv5 a;
        List list;
        ti4 ti4Var;
        int i;
        k17 k17Var;
        mv5 d;
        mv5 d2;
        if4 if4Var;
        mv5 d3;
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
        o17Var.getClass();
        ip4 ip4Var = o17Var.a;
        int i7 = ip4Var.a;
        int i8 = ip4Var.b;
        if4 if4Var2 = o17Var.c;
        List<kv5> list2 = o17Var.d;
        wd3 wd3Var = o17Var.e;
        ud3 ud3Var = wd3Var.a;
        ud3 ud3Var2 = wd3Var.b;
        w13 w13Var = o17Var.b;
        if (ud3Var2 != null) {
            int i9 = ud3Var2.d;
            int i10 = ud3Var2.c;
            int i11 = ud3Var2.a;
            w13 w13Var2 = w13.e;
            if (i11 != 0 || (i2 = Build.VERSION.SDK_INT) < 29 || (windowManager = (WindowManager) this.a.getSystemService(WindowManager.class)) == null) {
                k17Var = null;
            } else if (i2 >= 30) {
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                displayCutout = WindowInsets.Type.displayCutout();
                insets = windowInsets.getInsets(displayCutout);
                insets.getClass();
                i3 = insets.left;
                i4 = insets.top;
                k17Var = null;
                i5 = insets.right;
                i6 = insets.bottom;
                w13Var2 = new w13(i3, i4, i5, i6);
            } else {
                k17Var = null;
                cutout = windowManager.getDefaultDisplay().getCutout();
                if (cutout != null) {
                    safeInsetLeft = cutout.getSafeInsetLeft();
                    safeInsetTop = cutout.getSafeInsetTop();
                    safeInsetRight = cutout.getSafeInsetRight();
                    safeInsetBottom = cutout.getSafeInsetBottom();
                    w13Var2 = new w13(safeInsetLeft, safeInsetTop, safeInsetRight, safeInsetBottom);
                }
            }
            td3 td3Var = ud3Var.b;
            td3 td3Var2 = td3.BUILT_IN;
            if (td3Var == td3Var2 && ud3Var2.b == td3Var2) {
                if (ud3Var.a == 0) {
                    if (i10 > i9) {
                        if4Var = if4.LANDSCAPE;
                    } else {
                        if4Var = if4.PORTRAIT;
                    }
                    int i12 = qa1.a[if4Var.ordinal()];
                    if (i12 != 1) {
                        if (i12 == 2) {
                            d3 = b(i10, i9, w13Var2, vc3.BOTTOM_SCREEN);
                        } else {
                            i.c();
                            return k17Var;
                        }
                    } else {
                        d3 = d(i10, i9, w13Var2, vc3.BOTTOM_SCREEN);
                    }
                    ti4Var = new ti4(e(i7, i8, vc3.TOP_SCREEN), d3);
                } else {
                    int i13 = qa1.a[if4Var2.ordinal()];
                    if (i13 != 1) {
                        if (i13 == 2) {
                            d2 = b(i7, i8, w13Var, vc3.BOTTOM_SCREEN);
                        } else {
                            i.c();
                            return k17Var;
                        }
                    } else {
                        d2 = d(i7, i8, w13Var, vc3.BOTTOM_SCREEN);
                    }
                    ti4Var = new ti4(d2, e(i10, i9, vc3.TOP_SCREEN));
                }
            } else {
                int i14 = qa1.a[if4Var2.ordinal()];
                if (i14 != 1) {
                    if (i14 == 2) {
                        d = b(i7, i8, w13Var, vc3.BOTTOM_SCREEN);
                    } else {
                        i.c();
                        return k17Var;
                    }
                } else {
                    d = d(i7, i8, w13Var, vc3.BOTTOM_SCREEN);
                }
                ti4Var = new ti4(d, e(i10, i9, vc3.TOP_SCREEN));
            }
        } else {
            int i15 = qa1.a[if4Var2.ordinal()];
            if (i15 != 1) {
                if (i15 == 2) {
                    if (list2 == null || !list2.isEmpty()) {
                        for (kv5 kv5Var : list2) {
                            if (kv5Var.a == if4.PORTRAIT) {
                                int i16 = w13Var.a;
                                int i17 = w13Var.b;
                                int i18 = w13Var.c;
                                int i19 = w13Var.d;
                                int i20 = (i8 - i17) - i19;
                                pv5 pv5Var = this.b;
                                int a2 = (int) pv5Var.a(140.0f);
                                int a3 = (int) pv5Var.a(50.0f);
                                int a4 = (int) pv5Var.a(40.0f);
                                int a5 = (int) pv5Var.a(8.0f);
                                Rect rect = ((kv5) tq0.K0(list2)).c;
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
                                    i = i17 + a3 + a5;
                                } else {
                                    i = i17;
                                }
                                int i25 = i8 - i19;
                                int i26 = i25 - a2;
                                int i27 = i25 - a4;
                                int i28 = a5 * 2;
                                a = new mv5(l07.c0(new gr4(new Rect(rect.getX() - x, i, x, i21), vc3.TOP_SCREEN, 1.0f, false), new gr4(new Rect(rect.getRight(), i, right, i23), vc3.BOTTOM_SCREEN, 1.0f, false), new gr4(new Rect(i16, i26, a2, a2), vc3.DPAD, 1.0f, false), new gr4(new Rect(i22 - a2, i26, a2, a2), vc3.BUTTONS, 1.0f, false), new gr4(new Rect(i16, i17, a3, a3), vc3.BUTTON_L, 1.0f, false), new gr4(new Rect(i22 - a3, i17, a3, a3), vc3.BUTTON_R, 1.0f, false), new gr4(new Rect((rect.getX() - a4) - a5, i27, a4, a4), vc3.BUTTON_SELECT, 1.0f, false), new gr4(new Rect(rect.getRight() + a5, i27, a4, a4), vc3.BUTTON_START, 1.0f, false), new gr4(new Rect((rect.getX() - (a4 * 2)) - i28, i17, a4, a4), vc3.BUTTON_HINGE, 1.0f, false), new gr4(new Rect((rect.getX() - a4) - a5, i17, a4, a4), vc3.BUTTON_TOGGLE_SOFT_INPUT, 1.0f, false), new gr4(new Rect(rect.getRight() + a4 + a5, i17, a4, a4), vc3.BUTTON_MICROPHONE_TOGGLE, 1.0f, false), new gr4(new Rect(rect.getRight() + i28, i17, a4, a4), vc3.BUTTON_FAST_FORWARD_TOGGLE, 1.0f, false)));
                                list = null;
                                break;
                            }
                        }
                    }
                    if (list2 == null || !list2.isEmpty()) {
                        for (kv5 kv5Var2 : list2) {
                            if (kv5Var2.a == if4.LANDSCAPE) {
                                a = a(i7, i8, list2, w13Var);
                                list = null;
                                break;
                            }
                        }
                    }
                    list = null;
                    a = b(i7, i8, w13Var, null);
                } else {
                    i.c();
                    return null;
                }
            } else {
                if (list2 == null || !list2.isEmpty()) {
                    for (kv5 kv5Var3 : list2) {
                        if (kv5Var3.a == if4.LANDSCAPE) {
                            a = a(i7, i8, list2, w13Var);
                            list = null;
                            break;
                        }
                    }
                }
                list = null;
                a = d(i7, i8, w13Var, null);
            }
            ti4Var = new ti4(a, new mv5(list));
        }
        return new k17((mv5) ti4Var.A, (mv5) ti4Var.B);
    }

    public final mv5 d(int i, int i2, w13 w13Var, vc3 vc3Var) {
        int i3;
        gr4[] gr4VarArr;
        int i4;
        int i5;
        if (vc3Var != null && !vc3Var.isScreen()) {
            i.i("When specifying a single screen component, it must be a screen component");
            return null;
        }
        int i6 = w13Var.a;
        int i7 = w13Var.b;
        int i8 = w13Var.c;
        int i9 = w13Var.d;
        int i10 = (i - i6) - i8;
        int i11 = (i2 - i7) - i9;
        pv5 pv5Var = this.b;
        int a = (int) pv5Var.a(140.0f);
        int a2 = (int) pv5Var.a(50.0f);
        int a3 = (int) pv5Var.a(40.0f);
        int a4 = (int) pv5Var.a(4.0f);
        int i12 = (int) (i10 / 1.3333334f);
        if (vc3Var == null) {
            if (i12 * 2 > i11) {
                i12 = i11 / 2;
                int i13 = (int) (i12 * 1.3333334f);
                i5 = (i10 - i13) / 2;
                i10 = i13;
            } else {
                i5 = 0;
            }
            int i14 = i5 + i6;
            i3 = i9;
            gr4VarArr = new gr4[]{new gr4(new Rect(i14, i7, i10, i12), vc3.TOP_SCREEN, 1.0f, false), new gr4(new Rect(i14, i7 + i12, i10, i12), vc3.BOTTOM_SCREEN, 1.0f, false)};
        } else {
            i3 = i9;
            gr4VarArr = new gr4[]{new gr4(new Rect(i6, i7, i10, i12), vc3Var, 1.0f, false)};
        }
        if (vc3Var == null) {
            i4 = (i12 * 2) + i7;
        } else {
            i4 = i7 + i12;
        }
        if (i4 + a2 + a > i2) {
            i4 = i7 + i12;
        }
        int i15 = i2 - i3;
        int i16 = i15 - a;
        Rect rect = new Rect(i6, i16, a, a);
        int i17 = i - i8;
        Rect rect2 = new Rect(i17 - a, i16, a, a);
        vq2 vq2Var = new vq2(11);
        vq2Var.d(gr4VarArr);
        vq2Var.a(new gr4(rect, vc3.DPAD, 1.0f, false));
        vq2Var.a(new gr4(rect2, vc3.BUTTONS, 1.0f, false));
        vq2Var.a(new gr4(new Rect(i6, i4, a2, a2), vc3.BUTTON_L, 1.0f, false));
        vq2Var.a(new gr4(new Rect(i17 - a2, i4, a2, a2), vc3.BUTTON_R, 1.0f, false));
        int i18 = i / 2;
        int i19 = i18 - a3;
        int i20 = a4 / 2;
        int i21 = i15 - a3;
        vq2Var.a(new gr4(new Rect(i19 - i20, i21, a3, a3), vc3.BUTTON_SELECT, 1.0f, false));
        vq2Var.a(new gr4(new Rect(i20 + i18, i21, a3, a3), vc3.BUTTON_START, 1.0f, false));
        double d = a4;
        double d2 = d * 1.5d;
        vq2Var.a(new gr4(new Rect(i18 - ((int) ((a3 * 2.0d) + d2)), i4, a3, a3), vc3.BUTTON_HINGE, 1.0f, false));
        int i22 = (int) (d / 2.0d);
        vq2Var.a(new gr4(new Rect(i19 - i22, i4, a3, a3), vc3.BUTTON_TOGGLE_SOFT_INPUT, 1.0f, false));
        vq2Var.a(new gr4(new Rect(i22 + i18, i4, a3, a3), vc3.BUTTON_MICROPHONE_TOGGLE, 1.0f, false));
        vq2Var.a(new gr4(new Rect(i18 + a3 + ((int) d2), i4, a3, a3), vc3.BUTTON_FAST_FORWARD_TOGGLE, 1.0f, false));
        ArrayList arrayList = vq2Var.b;
        return new mv5(l07.c0(arrayList.toArray(new gr4[arrayList.size()])));
    }
}
