package a6;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class w1 extends d2 {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f523i = false;

    /* renamed from: j  reason: collision with root package name */
    public static Method f524j;

    /* renamed from: k  reason: collision with root package name */
    public static Class f525k;

    /* renamed from: l  reason: collision with root package name */
    public static Field f526l;
    public static Field m;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f527c;

    /* renamed from: d  reason: collision with root package name */
    public q5.b[] f528d;

    /* renamed from: e  reason: collision with root package name */
    public q5.b f529e;

    /* renamed from: f  reason: collision with root package name */
    public i2 f530f;

    /* renamed from: g  reason: collision with root package name */
    public q5.b f531g;

    /* renamed from: h  reason: collision with root package name */
    public int f532h;

    public w1(i2 i2Var, WindowInsets windowInsets) {
        super(i2Var);
        this.f529e = null;
        this.f527c = windowInsets;
    }

    public static boolean B(int i2, int i10) {
        if ((i2 & 6) == (i10 & 6)) {
            return true;
        }
        return false;
    }

    @SuppressLint({"WrongConstant"})
    private q5.b u(int i2, boolean z10) {
        q5.b bVar = q5.b.f12282e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i2 & i10) != 0) {
                bVar = q5.b.a(bVar, v(i10, z10));
            }
        }
        return bVar;
    }

    private q5.b w() {
        i2 i2Var = this.f530f;
        if (i2Var != null) {
            return i2Var.f479a.i();
        }
        return q5.b.f12282e;
    }

    private q5.b x(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f523i) {
                z();
            }
            Method method = f524j;
            if (method != null && f525k != null && f526l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f526l.get(m.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return q5.b.c(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e6) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
                }
            }
            return null;
        }
        m9.o.v("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void z() {
        try {
            f524j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f525k = cls;
            f526l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f526l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e6) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
        }
        f523i = true;
    }

    public void A(q5.b bVar) {
        this.f531g = bVar;
    }

    @Override // a6.d2
    public void d(View view) {
        q5.b x9 = x(view);
        if (x9 == null) {
            x9 = q5.b.f12282e;
        }
        A(x9);
    }

    @Override // a6.d2
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        if (!Objects.equals(this.f531g, w1Var.f531g) || !B(this.f532h, w1Var.f532h)) {
            return false;
        }
        return true;
    }

    @Override // a6.d2
    public q5.b f(int i2) {
        return u(i2, false);
    }

    @Override // a6.d2
    public q5.b g(int i2) {
        return u(i2, true);
    }

    @Override // a6.d2
    public final q5.b k() {
        if (this.f529e == null) {
            WindowInsets windowInsets = this.f527c;
            this.f529e = q5.b.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f529e;
    }

    @Override // a6.d2
    public i2 m(int i2, int i10, int i11, int i12) {
        v1 q1Var;
        i2 g10 = i2.g(null, this.f527c);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            q1Var = new u1(g10);
        } else if (i13 >= 31) {
            q1Var = new t1(g10);
        } else if (i13 >= 30) {
            q1Var = new s1(g10);
        } else if (i13 >= 29) {
            q1Var = new r1(g10);
        } else {
            q1Var = new q1(g10);
        }
        q1Var.g(i2.e(k(), i2, i10, i11, i12));
        q1Var.e(i2.e(i(), i2, i10, i11, i12));
        return q1Var.b();
    }

    @Override // a6.d2
    public boolean o() {
        return this.f527c.isRound();
    }

    @Override // a6.d2
    @SuppressLint({"WrongConstant"})
    public boolean p(int i2) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i2 & i10) != 0 && !y(i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // a6.d2
    public void q(q5.b[] bVarArr) {
        this.f528d = bVarArr;
    }

    @Override // a6.d2
    public void r(i2 i2Var) {
        this.f530f = i2Var;
    }

    @Override // a6.d2
    public void t(int i2) {
        this.f532h = i2;
    }

    public q5.b v(int i2, boolean z10) {
        int i10;
        n e6;
        int i11;
        int i12;
        int i13;
        q5.b bVar = q5.b.f12282e;
        int i14 = 0;
        if (i2 != 1) {
            q5.b bVar2 = null;
            if (i2 != 2) {
                if (i2 != 8) {
                    if (i2 != 16) {
                        if (i2 != 32) {
                            if (i2 != 64) {
                                if (i2 == 128) {
                                    i2 i2Var = this.f530f;
                                    if (i2Var != null) {
                                        e6 = i2Var.f479a.e();
                                    } else {
                                        e6 = e();
                                    }
                                    if (e6 != null) {
                                        int i15 = Build.VERSION.SDK_INT;
                                        if (i15 >= 28) {
                                            i11 = k.l(e6.f493a);
                                        } else {
                                            i11 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i12 = k.n(e6.f493a);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i13 = k.m(e6.f493a);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i14 = k.k(e6.f493a);
                                        }
                                        return q5.b.c(i11, i12, i13, i14);
                                    }
                                }
                            } else {
                                return l();
                            }
                        } else {
                            return h();
                        }
                    } else {
                        return j();
                    }
                } else {
                    q5.b[] bVarArr = this.f528d;
                    if (bVarArr != null) {
                        bVar2 = bVarArr[a.a.I(8)];
                    }
                    if (bVar2 != null) {
                        return bVar2;
                    }
                    q5.b k10 = k();
                    q5.b w10 = w();
                    int i16 = k10.f12286d;
                    if (i16 > w10.f12286d) {
                        return q5.b.c(0, 0, 0, i16);
                    }
                    q5.b bVar3 = this.f531g;
                    if (bVar3 != null && !bVar3.equals(bVar) && (i10 = this.f531g.f12286d) > w10.f12286d) {
                        return q5.b.c(0, 0, 0, i10);
                    }
                }
            } else if (z10) {
                q5.b w11 = w();
                q5.b i17 = i();
                return q5.b.c(Math.max(w11.f12283a, i17.f12283a), 0, Math.max(w11.f12285c, i17.f12285c), Math.max(w11.f12286d, i17.f12286d));
            } else if ((this.f532h & 2) == 0) {
                q5.b k11 = k();
                i2 i2Var2 = this.f530f;
                if (i2Var2 != null) {
                    bVar2 = i2Var2.f479a.i();
                }
                int i18 = k11.f12286d;
                if (bVar2 != null) {
                    i18 = Math.min(i18, bVar2.f12286d);
                }
                return q5.b.c(k11.f12283a, 0, k11.f12285c, i18);
            }
        } else if (z10) {
            return q5.b.c(0, Math.max(w().f12284b, k().f12284b), 0, 0);
        } else {
            if ((this.f532h & 4) == 0) {
                return q5.b.c(0, k().f12284b, 0, 0);
            }
        }
        return bVar;
    }

    public boolean y(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !v(i2, false).equals(q5.b.f12282e);
    }
}
