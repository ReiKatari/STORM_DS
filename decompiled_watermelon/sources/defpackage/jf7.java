package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jf7  reason: default package */
/* loaded from: classes.dex */
public abstract class jf7 extends rf7 {
    public static boolean m = false;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public x13[] d;
    public x13 e;
    public vf7 f;
    public x13 g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public jf7(vf7 vf7Var, WindowInsets windowInsets) {
        super(vf7Var);
        this.e = null;
        this.k = new Rect[10];
        this.l = new Rect[10];
        this.c = windowInsets;
    }

    private yg1 B(View view) {
        Display display;
        int i;
        int i2;
        int i3;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.s()) {
            return yg1.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        int i4 = 0;
        er5 F = jv3.F(display, 0);
        er5 F2 = jv3.F(display, 1);
        er5 F3 = jv3.F(display, 2);
        er5 F4 = jv3.F(display, 3);
        int i5 = point.x;
        int i6 = point.y;
        if (F != null) {
            i = F.b;
        } else {
            i = 0;
        }
        if (F2 != null) {
            i2 = F2.b;
        } else {
            i2 = 0;
        }
        if (F3 != null) {
            i3 = F3.b;
        } else {
            i3 = 0;
        }
        if (F4 != null) {
            i4 = F4.b;
        }
        return yg1.a(i5, i6, false, i, i2, i3, i4);
    }

    private static List<Rect> C(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[sf7.b(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        if (rectArr3 == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(rectArr3);
    }

    private Rect[] D(x13 x13Var) {
        ArrayList arrayList = new ArrayList();
        int i = x13Var.a;
        int i2 = x13Var.d;
        int i3 = x13Var.c;
        int i4 = x13Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, x13Var.a, this.i));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.j, i4));
        }
        if (i3 != 0) {
            int i5 = this.j;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.i));
        }
        if (i2 != 0) {
            int i6 = this.i;
            arrayList.add(new Rect(0, i6 - i2, this.j, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private x13 E(int i, boolean z) {
        x13 x13Var = x13.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                x13Var = x13.a(x13Var, F(i2, z));
            }
        }
        return x13Var;
    }

    private x13 G() {
        vf7 vf7Var = this.f;
        if (vf7Var != null) {
            return vf7Var.a.k();
        }
        return x13.e;
    }

    private x13 H(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!m) {
                J();
            }
            Method method = n;
            if (method != null && o != null && p != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) p.get(q.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return x13.c(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }
        vd6.i("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        return null;
    }

    private static void J() {
        try {
            n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            o = cls;
            p = cls.getDeclaredField("mVisibleInsets");
            q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            p.setAccessible(true);
            q.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        m = true;
    }

    public static boolean L(int i, int i2) {
        if ((i & 6) == (i2 & 6)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rf7
    public void A(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    public x13 F(int i, boolean z) {
        int i2;
        ug1 g;
        int i3;
        int i4;
        int i5;
        x13 x13Var = x13.e;
        int i6 = 0;
        if (i != 1) {
            x13 x13Var2 = null;
            if (i != 2) {
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                if (i == 128) {
                                    vf7 vf7Var = this.f;
                                    if (vf7Var != null) {
                                        g = vf7Var.a.g();
                                    } else {
                                        g = g();
                                    }
                                    if (g != null) {
                                        int i7 = Build.VERSION.SDK_INT;
                                        if (i7 >= 28) {
                                            i3 = dp.m(g.a);
                                        } else {
                                            i3 = 0;
                                        }
                                        if (i7 >= 28) {
                                            i4 = dp.o(g.a);
                                        } else {
                                            i4 = 0;
                                        }
                                        if (i7 >= 28) {
                                            i5 = dp.n(g.a);
                                        } else {
                                            i5 = 0;
                                        }
                                        if (i7 >= 28) {
                                            i6 = dp.l(g.a);
                                        }
                                        return x13.c(i3, i4, i5, i6);
                                    }
                                }
                            } else {
                                return n();
                            }
                        } else {
                            return j();
                        }
                    } else {
                        return l();
                    }
                } else {
                    x13[] x13VarArr = this.d;
                    if (x13VarArr != null) {
                        x13Var2 = x13VarArr[sf7.b(8)];
                    }
                    if (x13Var2 != null) {
                        return x13Var2;
                    }
                    x13 m2 = m();
                    x13 G = G();
                    int i8 = m2.d;
                    if (i8 > G.d) {
                        return x13.c(0, 0, 0, i8);
                    }
                    x13 x13Var3 = this.g;
                    if (x13Var3 != null && !x13Var3.equals(x13Var) && (i2 = this.g.d) > G.d) {
                        return x13.c(0, 0, 0, i2);
                    }
                }
            } else if (z) {
                x13 G2 = G();
                x13 k = k();
                return x13.c(Math.max(G2.a, k.a), 0, Math.max(G2.c, k.c), Math.max(G2.d, k.d));
            } else if ((this.h & 2) == 0) {
                x13 m3 = m();
                vf7 vf7Var2 = this.f;
                if (vf7Var2 != null) {
                    x13Var2 = vf7Var2.a.k();
                }
                int i9 = m3.d;
                if (x13Var2 != null) {
                    i9 = Math.min(i9, x13Var2.d);
                }
                return x13.c(m3.a, 0, m3.c, i9);
            }
        } else if (z) {
            return x13.c(0, Math.max(G().b, m().b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return x13.c(0, m().b, 0, 0);
            }
        }
        return x13Var;
    }

    public boolean I(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !F(i, false).equals(x13.e);
    }

    public void K(x13 x13Var) {
        this.g = x13Var;
    }

    @Override // defpackage.rf7
    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        x13 H = H(view);
        if (H == null) {
            H = x13.e;
        }
        K(H);
    }

    @Override // defpackage.rf7
    public List<Rect> e(int i) {
        return C(this.k, i);
    }

    @Override // defpackage.rf7
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        jf7 jf7Var = (jf7) obj;
        if (!Objects.equals(this.g, jf7Var.g) || !L(this.h, jf7Var.h)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.rf7
    public List<Rect> f(int i) {
        return C(this.l, i);
    }

    @Override // defpackage.rf7
    public x13 h(int i) {
        return E(i, false);
    }

    @Override // defpackage.rf7
    public x13 i(int i) {
        return E(i, true);
    }

    @Override // defpackage.rf7
    public final x13 m() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = x13.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.rf7
    public void o(View view) {
        B(view);
    }

    @Override // defpackage.rf7
    public void p() {
        for (int i = 1; i <= 512; i <<= 1) {
            int b = sf7.b(i);
            this.k[b] = D(h(i));
            if (i != 8) {
                this.l[b] = D(i(i));
            }
        }
    }

    @Override // defpackage.rf7
    public vf7 q(int i, int i2, int i3, int i4) {
        if7 af7Var;
        vf7 g = vf7.g(null, this.c);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            af7Var = new hf7(g);
        } else if (i5 >= 35) {
            af7Var = new gf7(g);
        } else if (i5 >= 34) {
            af7Var = new ff7(g);
        } else if (i5 >= 31) {
            af7Var = new ef7(g);
        } else if (i5 >= 30) {
            af7Var = new df7(g);
        } else if (i5 >= 29) {
            af7Var = new cf7(g);
        } else {
            af7Var = new af7(g);
        }
        af7Var.h(vf7.e(m(), i, i2, i3, i4));
        af7Var.f(vf7.e(k(), i, i2, i3, i4));
        return af7Var.b();
    }

    @Override // defpackage.rf7
    public boolean s() {
        return this.c.isRound();
    }

    @Override // defpackage.rf7
    public boolean t(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !I(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.rf7
    public void v(x13[] x13VarArr) {
        this.d = x13VarArr;
    }

    @Override // defpackage.rf7
    public void w(vf7 vf7Var) {
        this.f = vf7Var;
    }

    @Override // defpackage.rf7
    public void y(int i) {
        this.h = i;
    }

    @Override // defpackage.rf7
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.rf7
    public void u(yg1 yg1Var) {
    }
}
