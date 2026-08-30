package sf;

import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import j0.o1;
import java.util.ArrayList;
import java.util.List;
import kf.w1;
import oe.a0;
import oe.b0;
import p7.t;
import ve.g;
import ve.h;
import ve.i;
import ve.j;
import ve.l;
import ve.m;
import ve.n;
import ve.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12888a;

    /* renamed from: b  reason: collision with root package name */
    public final w1 f12889b;

    public b(Context context, w1 w1Var) {
        this.f12888a = context;
        this.f12889b = w1Var;
    }

    public static m e(int i2, int i10, ve.c cVar) {
        return new m(t.x(new j(f(i2, i10), cVar, 1.0f, false)));
    }

    public static b0 f(int i2, int i10) {
        float f8 = i2;
        float f10 = i10;
        if (f8 / f10 > 1.3333334f) {
            int i11 = (int) (256 * (f10 / 192));
            return new b0((i2 - i11) / 2, 0, i11, i10);
        }
        int i12 = (int) (192 * (f8 / 256));
        return new b0(0, (i10 - i12) / 2, i2, i12);
    }

    public final m a(int i2, int i10, List list, ve.b bVar) {
        int i11;
        int i12;
        int i13 = bVar.f13793a;
        int i14 = bVar.f13794b;
        int i15 = bVar.f13795c;
        int i16 = bVar.f13796d;
        int i17 = (i2 - i13) - i15;
        w1 w1Var = this.f12889b;
        int a10 = (int) w1Var.a(140.0f);
        int a11 = (int) w1Var.a(50.0f);
        int a12 = (int) w1Var.a(40.0f);
        int a13 = (int) w1Var.a(4.0f);
        int i18 = (int) (i17 / 1.3333334f);
        b0 b0Var = ((l) zb.l.R(list)).f13817c;
        int i19 = b0Var.f10913b - i14;
        int i20 = i10 - i16;
        int a14 = i20 - b0Var.a();
        if (i18 <= i19 && i18 <= a14) {
            i11 = i17;
            i12 = 0;
        } else {
            i18 = Math.min(i19, a14);
            i11 = (int) (i18 * 1.3333334f);
            i12 = (i17 - i11) / 2;
        }
        int i21 = i12 + i13;
        b0 b0Var2 = new b0(i21, b0Var.f10913b - i18, i11, i18);
        b0 b0Var3 = new b0(i21, b0Var.a(), i11, i18);
        int i22 = i20 - a10;
        b0 b0Var4 = new b0(i13, i22, a10, a10);
        int i23 = i2 - i15;
        b0 b0Var5 = new b0(i23 - a10, i22, a10, a10);
        j jVar = new j(b0Var2, ve.c.TOP_SCREEN, 1.0f, false);
        j jVar2 = new j(b0Var3, ve.c.BOTTOM_SCREEN, 1.0f, false);
        j jVar3 = new j(b0Var4, ve.c.DPAD, 1.0f, false);
        j jVar4 = new j(b0Var5, ve.c.BUTTONS, 1.0f, false);
        j jVar5 = new j(new b0(i13, b0Var.a(), a11, a11), ve.c.BUTTON_L, 1.0f, false);
        int i24 = i2 / 2;
        int i25 = i24 - a12;
        int i26 = a13 / 2;
        int i27 = i20 - a12;
        double d4 = a13;
        double d10 = d4 * 1.5d;
        int i28 = (int) (d4 / 2.0d);
        return new m(t.y(jVar, jVar2, jVar3, jVar4, jVar5, new j(new b0(i23 - a11, b0Var.a(), a11, a11), ve.c.BUTTON_R, 1.0f, false), new j(new b0(i25 - i26, i27, a12, a12), ve.c.BUTTON_SELECT, 1.0f, false), new j(new b0(i24 + i26, i27, a12, a12), ve.c.BUTTON_START, 1.0f, false), new j(new b0(i24 - ((int) ((a12 * 2.0d) + d10)), b0Var.a(), a12, a12), ve.c.BUTTON_HINGE, 1.0f, false), new j(new b0(i25 - i28, b0Var.a(), a12, a12), ve.c.BUTTON_TOGGLE_SOFT_INPUT, 1.0f, false), new j(new b0(i24 + a13 + i28, b0Var.a(), a12, a12), ve.c.BUTTON_MICROPHONE_TOGGLE, 1.0f, false), new j(new b0(i24 + a12 + ((int) d10), b0Var.a(), a12, a12), ve.c.BUTTON_FAST_FORWARD_TOGGLE, 1.0f, false)));
    }

    public final m b(int i2, int i10, ve.b bVar, ve.c cVar) {
        j[] jVarArr;
        if (cVar != null && !cVar.isScreen()) {
            a0.j.h("When specifying a single screen component, it must be a screen component");
            return null;
        }
        int i11 = bVar.f13793a;
        int i12 = bVar.f13794b;
        int i13 = bVar.f13795c;
        int i14 = bVar.f13796d;
        int i15 = (i2 - i11) - i13;
        int i16 = (i10 - i12) - i14;
        w1 w1Var = this.f12889b;
        int a10 = (int) w1Var.a(140.0f);
        int a11 = (int) w1Var.a(50.0f);
        int a12 = (int) w1Var.a(40.0f);
        int a13 = (int) w1Var.a(4.0f);
        if (cVar == null) {
            int M = pc.a.M(i15 * 0.66f);
            int i17 = (int) (M / 1.3333334f);
            if (i17 > i16) {
                M = (int) (i16 * 1.3333334f);
            } else {
                i16 = i17;
            }
            int i18 = i15 - M;
            jVarArr = new j[]{new j(new b0(i11, i12, M, i16), ve.c.TOP_SCREEN, 1.0f, false), new j(new b0(M + i11, i12, i18, (int) (i18 / 1.3333334f)), ve.c.BOTTOM_SCREEN, 1.0f, false)};
        } else {
            b0 f8 = f(i15, i16);
            jVarArr = new j[]{new j(new b0(f8.f10912a + i11, f8.f10913b + i12, f8.f10914c, f8.f10915d), cVar, 1.0f, false)};
        }
        int i19 = i10 - i14;
        int i20 = i19 - a10;
        b0 b0Var = new b0(i11, i20, a10, a10);
        int i21 = i2 - i13;
        b0 b0Var2 = new b0(i21 - a10, i20, a10, a10);
        o1 o1Var = new o1(11);
        o1Var.d(jVarArr);
        o1Var.a(new j(b0Var, ve.c.DPAD, 1.0f, false));
        o1Var.a(new j(b0Var2, ve.c.BUTTONS, 1.0f, false));
        o1Var.a(new j(new b0(i11, i12, a11, a11), ve.c.BUTTON_L, 1.0f, false));
        o1Var.a(new j(new b0(i21 - a11, i12, a11, a11), ve.c.BUTTON_R, 1.0f, false));
        int i22 = i19 - a12;
        o1Var.a(new j(new b0(((i2 - a13) / 2) - a12, i22, a12, a12), ve.c.BUTTON_SELECT, 1.0f, false));
        o1Var.a(new j(new b0((i2 + a13) / 2, i22, a12, a12), ve.c.BUTTON_START, 1.0f, false));
        int i23 = i2 / 2;
        double d4 = a13;
        double d10 = d4 * 1.5d;
        o1Var.a(new j(new b0(i23 - ((int) ((a12 * 2.0d) + d10)), i12, a12, a12), ve.c.BUTTON_HINGE, 1.0f, false));
        int i24 = (int) (d4 / 2.0d);
        o1Var.a(new j(new b0((i23 - a12) - i24, i12, a12, a12), ve.c.BUTTON_TOGGLE_SOFT_INPUT, 1.0f, false));
        o1Var.a(new j(new b0(i24 + i23, i12, a12, a12), ve.c.BUTTON_MICROPHONE_TOGGLE, 1.0f, false));
        o1Var.a(new j(new b0(i23 + a12 + ((int) d10), i12, a12, a12), ve.c.BUTTON_FAST_FORWARD_TOGGLE, 1.0f, false));
        ArrayList arrayList = o1Var.f7269a;
        return new m(t.y(arrayList.toArray(new j[arrayList.size()])));
    }

    public final n c(o oVar) {
        m a10;
        List list;
        yb.j jVar;
        int i2;
        m d4;
        m d10;
        bf.a aVar;
        m d11;
        int i10;
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
        int i11;
        int i12;
        int i13;
        int i14;
        oVar.getClass();
        a0 a0Var = oVar.f13823a;
        int i15 = a0Var.f10908a;
        int i16 = a0Var.f10909b;
        bf.a aVar2 = oVar.f13825c;
        List<l> list2 = oVar.f13826d;
        i iVar = oVar.f13827e;
        h hVar = iVar.f13809a;
        h hVar2 = iVar.f13810b;
        ve.b bVar = oVar.f13824b;
        if (hVar2 != null) {
            int i17 = hVar2.f13808d;
            int i18 = hVar2.f13807c;
            int i19 = hVar2.f13805a;
            ve.b bVar2 = ve.b.f13792e;
            if (i19 == 0 && (i10 = Build.VERSION.SDK_INT) >= 29 && (windowManager = (WindowManager) this.f12888a.getSystemService(WindowManager.class)) != null) {
                if (i10 >= 30) {
                    currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                    windowInsets = currentWindowMetrics.getWindowInsets();
                    displayCutout = WindowInsets.Type.displayCutout();
                    insets = windowInsets.getInsets(displayCutout);
                    insets.getClass();
                    i11 = insets.left;
                    i12 = insets.top;
                    i13 = insets.right;
                    i14 = insets.bottom;
                    bVar2 = new ve.b(i11, i12, i13, i14);
                } else {
                    cutout = windowManager.getDefaultDisplay().getCutout();
                    if (cutout != null) {
                        safeInsetLeft = cutout.getSafeInsetLeft();
                        safeInsetTop = cutout.getSafeInsetTop();
                        safeInsetRight = cutout.getSafeInsetRight();
                        safeInsetBottom = cutout.getSafeInsetBottom();
                        bVar2 = new ve.b(safeInsetLeft, safeInsetTop, safeInsetRight, safeInsetBottom);
                    }
                }
            }
            g gVar = hVar.f13806b;
            g gVar2 = g.BUILT_IN;
            if (gVar == gVar2 && hVar2.f13806b == gVar2) {
                if (hVar.f13805a == 0) {
                    if (i18 > i17) {
                        aVar = bf.a.LANDSCAPE;
                    } else {
                        aVar = bf.a.PORTRAIT;
                    }
                    int i20 = a.f12887a[aVar.ordinal()];
                    if (i20 != 1) {
                        if (i20 == 2) {
                            d11 = b(i18, i17, bVar2, ve.c.BOTTOM_SCREEN);
                        } else {
                            m9.o.o();
                            return null;
                        }
                    } else {
                        d11 = d(i18, i17, bVar2, ve.c.BOTTOM_SCREEN);
                    }
                    jVar = new yb.j(e(i15, i16, ve.c.TOP_SCREEN), d11);
                } else {
                    int i21 = a.f12887a[aVar2.ordinal()];
                    if (i21 != 1) {
                        if (i21 == 2) {
                            d10 = b(i15, i16, bVar, ve.c.BOTTOM_SCREEN);
                        } else {
                            m9.o.o();
                            return null;
                        }
                    } else {
                        d10 = d(i15, i16, bVar, ve.c.BOTTOM_SCREEN);
                    }
                    jVar = new yb.j(d10, e(i18, i17, ve.c.TOP_SCREEN));
                }
            } else {
                int i22 = a.f12887a[aVar2.ordinal()];
                if (i22 != 1) {
                    if (i22 == 2) {
                        d4 = b(i15, i16, bVar, ve.c.BOTTOM_SCREEN);
                    } else {
                        m9.o.o();
                        return null;
                    }
                } else {
                    d4 = d(i15, i16, bVar, ve.c.BOTTOM_SCREEN);
                }
                jVar = new yb.j(d4, e(i18, i17, ve.c.TOP_SCREEN));
            }
        } else {
            int i23 = a.f12887a[aVar2.ordinal()];
            if (i23 != 1) {
                if (i23 == 2) {
                    if (list2 == null || !list2.isEmpty()) {
                        for (l lVar : list2) {
                            if (lVar.f13815a == bf.a.PORTRAIT) {
                                int i24 = bVar.f13793a;
                                int i25 = bVar.f13794b;
                                int i26 = bVar.f13795c;
                                int i27 = bVar.f13796d;
                                int i28 = (i16 - i25) - i27;
                                w1 w1Var = this.f12889b;
                                int a11 = (int) w1Var.a(140.0f);
                                int a12 = (int) w1Var.a(50.0f);
                                int a13 = (int) w1Var.a(40.0f);
                                int a14 = (int) w1Var.a(8.0f);
                                b0 b0Var = ((l) zb.l.R(list2)).f13817c;
                                int i29 = b0Var.f10912a;
                                int i30 = i29 - i24;
                                int i31 = (int) (i30 / 1.3333334f);
                                if (i31 > i28) {
                                    i30 = (int) (i28 * 1.3333334f);
                                    i31 = i28;
                                }
                                int i32 = i15 - i26;
                                int b10 = i32 - b0Var.b();
                                int i33 = (int) (b10 / 1.3333334f);
                                if (i33 > i28) {
                                    b10 = (int) (i28 * 1.3333334f);
                                    i33 = i28;
                                }
                                int i34 = (i28 - a12) - a14;
                                if (i31 < i34 && i33 < i34) {
                                    i2 = i25 + a12 + a14;
                                } else {
                                    i2 = i25;
                                }
                                int i35 = i16 - i27;
                                int i36 = i35 - a11;
                                int i37 = (i29 - a13) - a14;
                                int i38 = i35 - a13;
                                int i39 = a14 * 2;
                                a10 = new m(t.y(new j(new b0(i29 - i30, i2, i30, i31), ve.c.TOP_SCREEN, 1.0f, false), new j(new b0(b0Var.b(), i2, b10, i33), ve.c.BOTTOM_SCREEN, 1.0f, false), new j(new b0(i24, i36, a11, a11), ve.c.DPAD, 1.0f, false), new j(new b0(i32 - a11, i36, a11, a11), ve.c.BUTTONS, 1.0f, false), new j(new b0(i24, i25, a12, a12), ve.c.BUTTON_L, 1.0f, false), new j(new b0(i32 - a12, i25, a12, a12), ve.c.BUTTON_R, 1.0f, false), new j(new b0(i37, i38, a13, a13), ve.c.BUTTON_SELECT, 1.0f, false), new j(new b0(b0Var.b() + a14, i38, a13, a13), ve.c.BUTTON_START, 1.0f, false), new j(new b0((i29 - (a13 * 2)) - i39, i25, a13, a13), ve.c.BUTTON_HINGE, 1.0f, false), new j(new b0(i37, i25, a13, a13), ve.c.BUTTON_TOGGLE_SOFT_INPUT, 1.0f, false), new j(new b0(b0Var.b() + a13 + a14, i25, a13, a13), ve.c.BUTTON_MICROPHONE_TOGGLE, 1.0f, false), new j(new b0(b0Var.b() + i39, i25, a13, a13), ve.c.BUTTON_FAST_FORWARD_TOGGLE, 1.0f, false)));
                                list = null;
                                jVar = new yb.j(a10, new m(list));
                            }
                        }
                    }
                    if (list2 == null || !list2.isEmpty()) {
                        for (l lVar2 : list2) {
                            if (lVar2.f13815a == bf.a.LANDSCAPE) {
                                a10 = a(i15, i16, list2, bVar);
                                list = null;
                                break;
                            }
                        }
                    }
                    list = null;
                    a10 = b(i15, i16, bVar, null);
                    jVar = new yb.j(a10, new m(list));
                } else {
                    m9.o.o();
                    return null;
                }
            } else {
                if (list2 == null || !list2.isEmpty()) {
                    for (l lVar3 : list2) {
                        if (lVar3.f13815a == bf.a.LANDSCAPE) {
                            a10 = a(i15, i16, list2, bVar);
                            list = null;
                            break;
                        }
                    }
                }
                list = null;
                a10 = d(i15, i16, bVar, null);
                jVar = new yb.j(a10, new m(list));
            }
        }
        return new n((m) jVar.A, (m) jVar.B);
    }

    public final m d(int i2, int i10, ve.b bVar, ve.c cVar) {
        int i11;
        int i12;
        j[] jVarArr;
        int i13;
        int i14;
        if (cVar != null && !cVar.isScreen()) {
            a0.j.h("When specifying a single screen component, it must be a screen component");
            return null;
        }
        int i15 = bVar.f13793a;
        int i16 = bVar.f13794b;
        int i17 = bVar.f13795c;
        int i18 = bVar.f13796d;
        int i19 = (i2 - i15) - i17;
        int i20 = (i10 - i16) - i18;
        w1 w1Var = this.f12889b;
        int a10 = (int) w1Var.a(140.0f);
        int a11 = (int) w1Var.a(50.0f);
        int a12 = (int) w1Var.a(40.0f);
        int a13 = (int) w1Var.a(4.0f);
        int i21 = (int) (i19 / 1.3333334f);
        if (cVar == null) {
            if (i21 * 2 > i20) {
                i21 = i20 / 2;
                int i22 = (int) (i21 * 1.3333334f);
                i14 = (i19 - i22) / 2;
                i19 = i22;
            } else {
                i14 = 0;
            }
            int i23 = i14 + i15;
            i11 = i18;
            i12 = i17;
            jVarArr = new j[]{new j(new b0(i23, i16, i19, i21), ve.c.TOP_SCREEN, 1.0f, false), new j(new b0(i23, i16 + i21, i19, i21), ve.c.BOTTOM_SCREEN, 1.0f, false)};
        } else {
            i11 = i18;
            i12 = i17;
            jVarArr = new j[]{new j(new b0(i15, i16, i19, i21), cVar, 1.0f, false)};
        }
        if (cVar == null) {
            i13 = (i21 * 2) + i16;
        } else {
            i13 = i16 + i21;
        }
        if (i13 + a11 + a10 > i10) {
            i13 = i16 + i21;
        }
        int i24 = i10 - i11;
        int i25 = i24 - a10;
        b0 b0Var = new b0(i15, i25, a10, a10);
        int i26 = i2 - i12;
        b0 b0Var2 = new b0(i26 - a10, i25, a10, a10);
        o1 o1Var = new o1(11);
        o1Var.d(jVarArr);
        o1Var.a(new j(b0Var, ve.c.DPAD, 1.0f, false));
        o1Var.a(new j(b0Var2, ve.c.BUTTONS, 1.0f, false));
        o1Var.a(new j(new b0(i15, i13, a11, a11), ve.c.BUTTON_L, 1.0f, false));
        o1Var.a(new j(new b0(i26 - a11, i13, a11, a11), ve.c.BUTTON_R, 1.0f, false));
        int i27 = i2 / 2;
        int i28 = i27 - a12;
        int i29 = a13 / 2;
        int i30 = i24 - a12;
        o1Var.a(new j(new b0(i28 - i29, i30, a12, a12), ve.c.BUTTON_SELECT, 1.0f, false));
        o1Var.a(new j(new b0(i29 + i27, i30, a12, a12), ve.c.BUTTON_START, 1.0f, false));
        double d4 = a13;
        double d10 = d4 * 1.5d;
        o1Var.a(new j(new b0(i27 - ((int) ((a12 * 2.0d) + d10)), i13, a12, a12), ve.c.BUTTON_HINGE, 1.0f, false));
        int i31 = (int) (d4 / 2.0d);
        o1Var.a(new j(new b0(i28 - i31, i13, a12, a12), ve.c.BUTTON_TOGGLE_SOFT_INPUT, 1.0f, false));
        o1Var.a(new j(new b0(i27 + i31, i13, a12, a12), ve.c.BUTTON_MICROPHONE_TOGGLE, 1.0f, false));
        o1Var.a(new j(new b0(i27 + a12 + ((int) d10), i13, a12, a12), ve.c.BUTTON_FAST_FORWARD_TOGGLE, 1.0f, false));
        ArrayList arrayList = o1Var.f7269a;
        return new m(t.y(arrayList.toArray(new j[arrayList.size()])));
    }
}
