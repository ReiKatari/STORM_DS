package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r37  reason: default package */
/* loaded from: classes.dex */
public final class r37 implements gy4 {
    public final View a;
    public final bt b;
    public final s37 c;
    public boolean d;
    public qn2 e;
    public qn2 f;
    public c37 g;
    public l33 h;
    public final ArrayList i;
    public final go3 j;
    public Rect k;
    public final b81 l;
    public final ua4 m;
    public rk3 n;

    public r37(View view, te teVar) {
        bt btVar = new bt(view);
        s37 s37Var = new s37(Choreographer.getInstance(), 0);
        this.a = view;
        this.b = btVar;
        this.c = s37Var;
        this.e = hh2.t0;
        this.f = hh2.u0;
        this.g = new c37("", 4, k47.b);
        this.h = l33.g;
        this.i = new ArrayList();
        this.j = kj2.M(xr3.NONE, new pj(this, 19));
        this.l = new b81(teVar, btVar);
        this.m = new ua4(new p37[16]);
    }

    @Override // defpackage.gy4
    public final void a() {
        i(p37.StartInput);
    }

    @Override // defpackage.gy4
    public final void b() {
        i(p37.ShowKeyboard);
    }

    @Override // defpackage.gy4
    public final void c() {
        this.d = false;
        this.e = hh2.v0;
        this.f = hh2.w0;
        this.k = null;
        i(p37.StopInput);
    }

    @Override // defpackage.gy4
    public final void d(c37 c37Var, mk4 mk4Var, a47 a47Var, d80 d80Var, of5 of5Var, of5 of5Var2) {
        b81 b81Var = this.l;
        synchronized (b81Var.c) {
            try {
                b81Var.j = c37Var;
                b81Var.l = mk4Var;
                b81Var.k = a47Var;
                b81Var.m = d80Var;
                b81Var.n = of5Var;
                b81Var.o = of5Var2;
                if (!b81Var.e) {
                    if (b81Var.d) {
                    }
                }
                b81Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gy4
    public final void e(c37 c37Var, l33 l33Var, t00 t00Var, w51 w51Var) {
        this.d = true;
        this.g = c37Var;
        this.h = l33Var;
        this.e = t00Var;
        this.f = w51Var;
        i(p37.StartInput);
    }

    @Override // defpackage.gy4
    public final void f(c37 c37Var, c37 c37Var2) {
        boolean z;
        int i;
        int i2;
        int i3;
        if (k47.b(this.g.b, c37Var2.b) && nb3.k(this.g.c, c37Var2.c)) {
            z = false;
        } else {
            z = true;
        }
        this.g = c37Var2;
        int size = this.i.size();
        for (int i4 = 0; i4 < size; i4++) {
            kf5 kf5Var = (kf5) ((WeakReference) this.i.get(i4)).get();
            if (kf5Var != null) {
                kf5Var.d = c37Var2;
            }
        }
        b81 b81Var = this.l;
        synchronized (b81Var.c) {
            b81Var.j = null;
            b81Var.l = null;
            b81Var.k = null;
            b81Var.m = ne.s0;
            b81Var.n = null;
            b81Var.o = null;
        }
        int i5 = -1;
        if (nb3.k(c37Var, c37Var2)) {
            if (z) {
                bt btVar = this.b;
                int f = k47.f(c37Var2.b);
                int e = k47.e(c37Var2.b);
                k47 k47Var = this.g.c;
                if (k47Var != null) {
                    i3 = k47.f(k47Var.a);
                } else {
                    i3 = -1;
                }
                k47 k47Var2 = this.g.c;
                if (k47Var2 != null) {
                    i5 = k47.e(k47Var2.a);
                }
                ((InputMethodManager) ((go3) btVar.L).getValue()).updateSelection((View) btVar.B, f, e, i3, i5);
            }
        } else if (c37Var != null && (!nb3.k(c37Var.a.B, c37Var2.a.B) || (k47.b(c37Var.b, c37Var2.b) && !nb3.k(c37Var.c, c37Var2.c)))) {
            bt btVar2 = this.b;
            ((InputMethodManager) ((go3) btVar2.L).getValue()).restartInput((View) btVar2.B);
        } else {
            int size2 = this.i.size();
            for (int i6 = 0; i6 < size2; i6++) {
                kf5 kf5Var2 = (kf5) ((WeakReference) this.i.get(i6)).get();
                if (kf5Var2 != null) {
                    c37 c37Var3 = this.g;
                    bt btVar3 = this.b;
                    if (kf5Var2.h) {
                        kf5Var2.d = c37Var3;
                        if (kf5Var2.f) {
                            ((InputMethodManager) ((go3) btVar3.L).getValue()).updateExtractedText((View) btVar3.B, kf5Var2.e, uj2.c0(c37Var3));
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
                        ((InputMethodManager) ((go3) btVar3.L).getValue()).updateSelection((View) btVar3.B, k47.f(j), k47.e(j), i, i2);
                    }
                }
            }
        }
    }

    @Override // defpackage.gy4
    public final void g() {
        i(p37.HideKeyboard);
    }

    @Override // defpackage.gy4
    public final void h(of5 of5Var) {
        Rect rect;
        this.k = new Rect(u24.E(of5Var.a), u24.E(of5Var.b), u24.E(of5Var.c), u24.E(of5Var.d));
        if (this.i.isEmpty() && (rect = this.k) != null) {
            this.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final void i(p37 p37Var) {
        this.m.b(p37Var);
        if (this.n == null) {
            rk3 rk3Var = new rk3(this, 17);
            this.c.execute(rk3Var);
            this.n = rk3Var;
        }
    }
}
