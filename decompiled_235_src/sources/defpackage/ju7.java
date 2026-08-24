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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ju7  reason: default package */
/* loaded from: classes.dex */
public abstract class ju7 extends ru7 {
    public static boolean m = false;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public e83[] d;
    public e83 e;
    public vu7 f;
    public e83 g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public ju7(vu7 vu7Var, WindowInsets windowInsets) {
        super(vu7Var);
        this.e = null;
        this.k = new Rect[10];
        this.l = new Rect[10];
        this.c = windowInsets;
    }

    private cl1 B(View view) {
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
            return cl1.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        int i4 = 0;
        x16 i0 = nw7.i0(display, 0);
        x16 i02 = nw7.i0(display, 1);
        x16 i03 = nw7.i0(display, 2);
        x16 i04 = nw7.i0(display, 3);
        int i5 = point.x;
        int i6 = point.y;
        if (i0 != null) {
            i = i0.b;
        } else {
            i = 0;
        }
        if (i02 != null) {
            i2 = i02.b;
        } else {
            i2 = 0;
        }
        if (i03 != null) {
            i3 = i03.b;
        } else {
            i3 = 0;
        }
        if (i04 != null) {
            i4 = i04.b;
        }
        return cl1.a(i5, i6, false, i, i2, i3, i4);
    }

    private static List<Rect> C(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[su7.a(i2)]) != null) {
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

    private Rect[] D(e83 e83Var) {
        ArrayList arrayList = new ArrayList();
        int i = e83Var.a;
        int i2 = e83Var.d;
        int i3 = e83Var.c;
        int i4 = e83Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, e83Var.a, this.i));
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

    private e83 E(int i, boolean z) {
        e83 e83Var = e83.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                e83Var = e83.a(e83Var, F(i2, z));
            }
        }
        return e83Var;
    }

    private e83 G() {
        vu7 vu7Var = this.f;
        if (vu7Var != null) {
            return vu7Var.a.k();
        }
        return e83.e;
    }

    private e83 H(View view) {
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
                    return e83.c(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }
        fa6.h("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
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

    @Override // defpackage.ru7
    public void A(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    public e83 F(int i, boolean z) {
        int i2;
        yk1 g;
        int i3;
        int i4;
        int i5;
        e83 e83Var = e83.e;
        int i6 = 0;
        if (i != 1) {
            e83 e83Var2 = null;
            if (i != 2) {
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                if (i == 128) {
                                    vu7 vu7Var = this.f;
                                    if (vu7Var != null) {
                                        g = vu7Var.a.g();
                                    } else {
                                        g = g();
                                    }
                                    if (g != null) {
                                        int i7 = Build.VERSION.SDK_INT;
                                        if (i7 >= 28) {
                                            i3 = pp.m(g.a);
                                        } else {
                                            i3 = 0;
                                        }
                                        if (i7 >= 28) {
                                            i4 = pp.o(g.a);
                                        } else {
                                            i4 = 0;
                                        }
                                        if (i7 >= 28) {
                                            i5 = pp.n(g.a);
                                        } else {
                                            i5 = 0;
                                        }
                                        if (i7 >= 28) {
                                            i6 = pp.l(g.a);
                                        }
                                        return e83.c(i3, i4, i5, i6);
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
                    e83[] e83VarArr = this.d;
                    if (e83VarArr != null) {
                        e83Var2 = e83VarArr[su7.a(8)];
                    }
                    if (e83Var2 != null) {
                        return e83Var2;
                    }
                    e83 m2 = m();
                    e83 G = G();
                    int i8 = m2.d;
                    if (i8 > G.d) {
                        return e83.c(0, 0, 0, i8);
                    }
                    e83 e83Var3 = this.g;
                    if (e83Var3 != null && !e83Var3.equals(e83Var) && (i2 = this.g.d) > G.d) {
                        return e83.c(0, 0, 0, i2);
                    }
                }
            } else if (z) {
                e83 G2 = G();
                e83 k = k();
                return e83.c(Math.max(G2.a, k.a), 0, Math.max(G2.c, k.c), Math.max(G2.d, k.d));
            } else if ((this.h & 2) == 0) {
                e83 m3 = m();
                vu7 vu7Var2 = this.f;
                if (vu7Var2 != null) {
                    e83Var2 = vu7Var2.a.k();
                }
                int i9 = m3.d;
                if (e83Var2 != null) {
                    i9 = Math.min(i9, e83Var2.d);
                }
                return e83.c(m3.a, 0, m3.c, i9);
            }
        } else if (z) {
            return e83.c(0, Math.max(G().b, m().b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return e83.c(0, m().b, 0, 0);
            }
        }
        return e83Var;
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
        return !F(i, false).equals(e83.e);
    }

    public void K(e83 e83Var) {
        this.g = e83Var;
    }

    @Override // defpackage.ru7
    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        e83 H = H(view);
        if (H == null) {
            H = e83.e;
        }
        K(H);
    }

    @Override // defpackage.ru7
    public List<Rect> e(int i) {
        return C(this.k, i);
    }

    @Override // defpackage.ru7
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        ju7 ju7Var = (ju7) obj;
        if (!Objects.equals(this.g, ju7Var.g) || !L(this.h, ju7Var.h)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ru7
    public List<Rect> f(int i) {
        return C(this.l, i);
    }

    @Override // defpackage.ru7
    public e83 h(int i) {
        return E(i, false);
    }

    @Override // defpackage.ru7
    public e83 i(int i) {
        return E(i, true);
    }

    @Override // defpackage.ru7
    public final e83 m() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = e83.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.ru7
    public void o(View view) {
        B(view);
    }

    @Override // defpackage.ru7
    public void p() {
        for (int i = 1; i <= 512; i <<= 1) {
            int a = su7.a(i);
            this.k[a] = D(h(i));
            if (i != 8) {
                this.l[a] = D(i(i));
            }
        }
    }

    @Override // defpackage.ru7
    public vu7 q(int i, int i2, int i3, int i4) {
        iu7 bu7Var;
        vu7 g = vu7.g(null, this.c);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            bu7Var = new hu7(g);
        } else if (i5 >= 35) {
            bu7Var = new gu7(g);
        } else if (i5 >= 34) {
            bu7Var = new fu7(g);
        } else if (i5 >= 31) {
            bu7Var = new eu7(g);
        } else if (i5 >= 30) {
            bu7Var = new du7(g);
        } else if (i5 >= 29) {
            bu7Var = new cu7(g);
        } else {
            bu7Var = new bu7(g);
        }
        bu7Var.h(vu7.e(m(), i, i2, i3, i4));
        bu7Var.f(vu7.e(k(), i, i2, i3, i4));
        return bu7Var.b();
    }

    @Override // defpackage.ru7
    public boolean s() {
        return this.c.isRound();
    }

    @Override // defpackage.ru7
    public boolean t(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !I(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ru7
    public void v(e83[] e83VarArr) {
        this.d = e83VarArr;
    }

    @Override // defpackage.ru7
    public void w(vu7 vu7Var) {
        this.f = vu7Var;
    }

    @Override // defpackage.ru7
    public void y(int i) {
        this.h = i;
    }

    @Override // defpackage.ru7
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.ru7
    public void u(cl1 cl1Var) {
    }
}
