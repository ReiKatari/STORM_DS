package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ki  reason: default package */
/* loaded from: classes.dex */
public final class ki implements gy4 {
    public et3 a;
    public ap6 b;
    public kt3 c;
    public of6 d;

    @Override // defpackage.gy4
    public final void a() {
        j(null);
    }

    @Override // defpackage.gy4
    public final void b() {
        xm6 xm6Var;
        et3 et3Var = this.a;
        if (et3Var != null && (xm6Var = (xm6) hf.K(et3Var, ky0.q)) != null) {
            ((bh1) xm6Var).b();
        }
    }

    @Override // defpackage.gy4
    public final void c() {
        ap6 ap6Var = this.b;
        if (ap6Var != null) {
            ap6Var.h(null);
        }
        this.b = null;
        na4 i = i();
        if (i != null) {
            ((of6) i).h();
        }
    }

    @Override // defpackage.gy4
    public final void d(c37 c37Var, mk4 mk4Var, a47 a47Var, d80 d80Var, of5 of5Var, of5 of5Var2) {
        kt3 kt3Var = this.c;
        if (kt3Var != null) {
            ft3 ft3Var = kt3Var.m;
            synchronized (ft3Var.c) {
                try {
                    ft3Var.j = c37Var;
                    ft3Var.l = mk4Var;
                    ft3Var.k = a47Var;
                    ft3Var.m = of5Var;
                    ft3Var.n = of5Var2;
                    if (!ft3Var.e) {
                        if (ft3Var.d) {
                        }
                    }
                    ft3Var.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.gy4
    public final void e(c37 c37Var, l33 l33Var, t00 t00Var, w51 w51Var) {
        j(new d5(c37Var, this, l33Var, t00Var, w51Var, 2));
    }

    @Override // defpackage.gy4
    public final void f(c37 c37Var, c37 c37Var2) {
        boolean z;
        int i;
        int i2;
        int i3;
        kt3 kt3Var = this.c;
        if (kt3Var != null) {
            if (k47.b(kt3Var.h.b, c37Var2.b) && nb3.k(kt3Var.h.c, c37Var2.c)) {
                z = false;
            } else {
                z = true;
            }
            kt3Var.h = c37Var2;
            int size = kt3Var.j.size();
            for (int i4 = 0; i4 < size; i4++) {
                lf5 lf5Var = (lf5) ((WeakReference) kt3Var.j.get(i4)).get();
                if (lf5Var != null) {
                    lf5Var.g = c37Var2;
                }
            }
            ft3 ft3Var = kt3Var.m;
            synchronized (ft3Var.c) {
                ft3Var.j = null;
                ft3Var.l = null;
                ft3Var.k = null;
                ft3Var.m = null;
                ft3Var.n = null;
            }
            int i5 = -1;
            if (nb3.k(c37Var, c37Var2)) {
                if (z) {
                    u63 u63Var = kt3Var.b;
                    int f = k47.f(c37Var2.b);
                    int e = k47.e(c37Var2.b);
                    k47 k47Var = kt3Var.h.c;
                    if (k47Var != null) {
                        i3 = k47.f(k47Var.a);
                    } else {
                        i3 = -1;
                    }
                    k47 k47Var2 = kt3Var.h.c;
                    if (k47Var2 != null) {
                        i5 = k47.e(k47Var2.a);
                    }
                    u63Var.n().updateSelection((View) u63Var.B, f, e, i3, i5);
                }
            } else if (c37Var != null && (!nb3.k(c37Var.a.B, c37Var2.a.B) || (k47.b(c37Var.b, c37Var2.b) && !nb3.k(c37Var.c, c37Var2.c)))) {
                u63 u63Var2 = kt3Var.b;
                u63Var2.n().restartInput((View) u63Var2.B);
            } else {
                int size2 = kt3Var.j.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    lf5 lf5Var2 = (lf5) ((WeakReference) kt3Var.j.get(i6)).get();
                    if (lf5Var2 != null) {
                        c37 c37Var3 = kt3Var.h;
                        u63 u63Var3 = kt3Var.b;
                        if (lf5Var2.k) {
                            lf5Var2.g = c37Var3;
                            if (lf5Var2.i) {
                                u63Var3.n().updateExtractedText((View) u63Var3.B, lf5Var2.h, oi2.g(c37Var3));
                            }
                            k47 k47Var3 = c37Var3.c;
                            long j = c37Var3.b;
                            if (k47Var3 != null) {
                                i = k47.f(k47Var3.a);
                            } else {
                                i = -1;
                            }
                            k47 k47Var4 = c37Var3.c;
                            if (k47Var4 != null) {
                                i2 = k47.e(k47Var4.a);
                            } else {
                                i2 = -1;
                            }
                            u63Var3.n().updateSelection((View) u63Var3.B, k47.f(j), k47.e(j), i, i2);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.gy4
    public final void g() {
        xm6 xm6Var;
        et3 et3Var = this.a;
        if (et3Var != null && (xm6Var = (xm6) hf.K(et3Var, ky0.q)) != null) {
            ((bh1) xm6Var).a();
        }
    }

    @Override // defpackage.gy4
    public final void h(of5 of5Var) {
        Rect rect;
        kt3 kt3Var = this.c;
        if (kt3Var != null) {
            kt3Var.l = new Rect(u24.E(of5Var.a), u24.E(of5Var.b), u24.E(of5Var.c), u24.E(of5Var.d));
            if (kt3Var.j.isEmpty() && (rect = kt3Var.l) != null) {
                kt3Var.a.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }

    public final na4 i() {
        of6 of6Var = this.d;
        if (of6Var != null) {
            return of6Var;
        }
        if (!et6.a) {
            return null;
        }
        of6 b = pf6.b(1, 0, m80.DROP_LATEST, 2);
        this.d = b;
        return b;
    }

    public final void j(d5 d5Var) {
        et3 et3Var = this.a;
        if (et3Var == null) {
            return;
        }
        ap6 ap6Var = null;
        l5 l5Var = new l5(d5Var, this, et3Var, (r41) null, 1);
        if (et3Var.j0) {
            ap6Var = hv.L(et3Var.F0(), null, a71.UNDISPATCHED, new xd1(et3Var, l5Var, null, 26), 1);
        }
        this.b = ap6Var;
    }

    public final void k(et3 et3Var) {
        boolean z;
        if (this.a == et3Var) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            s53.c("Expected textInputModifierNode to be " + et3Var + " but was " + this.a);
        }
        this.a = null;
    }
}
