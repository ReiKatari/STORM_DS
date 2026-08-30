package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gx6  reason: default package */
/* loaded from: classes.dex */
public final class gx6 implements ae6 {
    public final bz6 A;
    public final tj4 B;
    public final tj4 L;
    public final tj4 R;
    public ux5 X;
    public zm6 Y;
    public final tj4 Z;
    public final pj4 c0;
    public boolean d0;
    public final tj4 e0;
    public oo f0;
    public final rj4 g0;
    public boolean h0;
    public final sc6 i0;
    public final /* synthetic */ kx6 j0;

    public gx6(kx6 kx6Var, Object obj, oo ooVar, bz6 bz6Var) {
        this.j0 = kx6Var;
        this.A = bz6Var;
        tj4 G = me2.G(obj);
        this.B = G;
        Object obj2 = null;
        this.L = me2.G(ct3.P0(RecyclerView.A1, RecyclerView.A1, null, 7));
        this.R = me2.G(new zm6(c(), bz6Var, obj, G.getValue(), ooVar));
        this.Z = me2.G(Boolean.TRUE);
        this.c0 = new pj4(-1.0f);
        this.e0 = me2.G(obj);
        this.f0 = ooVar;
        this.g0 = new rj4(b().d());
        Float f = (Float) tc7.b.get(bz6Var);
        if (f != null) {
            float floatValue = f.floatValue();
            oo ooVar2 = (oo) bz6Var.a.n(obj);
            int b = ooVar2.b();
            for (int i = 0; i < b; i++) {
                ooVar2.e(i, floatValue);
            }
            obj2 = this.A.b.n(ooVar2);
        }
        this.i0 = ct3.P0(RecyclerView.A1, RecyclerView.A1, obj2, 3);
    }

    public final zm6 b() {
        return (zm6) this.R.getValue();
    }

    public final y72 c() {
        return (y72) this.L.getValue();
    }

    public final void d(long j) {
        if (this.c0.h() == -1.0f) {
            this.h0 = true;
            if (b53.x(b().L, b().R)) {
                f(b().L);
                return;
            }
            f(b().c(j));
            this.f0 = b().g(j);
        }
    }

    public final void f(Object obj) {
        this.e0.setValue(obj);
    }

    public final void g(boolean z, Object obj) {
        Object obj2;
        y72 c;
        ho qd6Var;
        zm6 zm6Var = this.Y;
        if (zm6Var != null) {
            obj2 = zm6Var.L;
        } else {
            obj2 = null;
        }
        tj4 tj4Var = this.B;
        boolean x = b53.x(obj2, tj4Var.getValue());
        rj4 rj4Var = this.g0;
        tj4 tj4Var2 = this.R;
        if (x) {
            tj4Var2.setValue(new zm6(this.i0, this.A, obj, obj, this.f0.c()));
            this.d0 = true;
            rj4Var.i(b().d());
            return;
        }
        if (z && !this.h0) {
            if (c() instanceof sc6) {
                c = c();
            } else {
                c = this.i0;
            }
        } else {
            c = c();
        }
        kx6 kx6Var = this.j0;
        long e = kx6Var.e();
        tj4 tj4Var3 = kx6Var.h;
        if (e <= 0) {
            qd6Var = c;
        } else {
            qd6Var = new qd6(c, kx6Var.e());
        }
        tj4Var2.setValue(new zm6(qd6Var, this.A, obj, tj4Var.getValue(), this.f0));
        rj4Var.i(b().d());
        this.d0 = false;
        tj4Var3.setValue(Boolean.TRUE);
        if (kx6Var.g()) {
            xa6 xa6Var = kx6Var.i;
            int size = xa6Var.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                gx6 gx6Var = (gx6) xa6Var.get(i);
                j = Math.max(j, gx6Var.g0.h());
                gx6Var.d(0L);
            }
            tj4Var3.setValue(Boolean.FALSE);
        }
    }

    @Override // defpackage.ae6
    public final Object getValue() {
        return this.e0.getValue();
    }

    public final void h(Object obj, Object obj2, y72 y72Var) {
        this.B.setValue(obj2);
        this.L.setValue(y72Var);
        if (b53.x(b().R, obj) && b53.x(b().L, obj2)) {
            return;
        }
        g(false, obj);
    }

    public final void i(Object obj, y72 y72Var) {
        Object value;
        Object obj2;
        if (this.d0) {
            zm6 zm6Var = this.Y;
            if (zm6Var != null) {
                obj2 = zm6Var.L;
            } else {
                obj2 = null;
            }
            if (b53.x(obj, obj2)) {
                return;
            }
        }
        tj4 tj4Var = this.B;
        boolean x = b53.x(tj4Var.getValue(), obj);
        pj4 pj4Var = this.c0;
        if (x && pj4Var.h() == -1.0f) {
            return;
        }
        tj4Var.setValue(obj);
        this.L.setValue(y72Var);
        if (pj4Var.h() == -3.0f) {
            value = obj;
        } else {
            value = this.e0.getValue();
        }
        tj4 tj4Var2 = this.Z;
        boolean z = true;
        g(!((Boolean) tj4Var2.getValue()).booleanValue(), value);
        if (pj4Var.h() != -3.0f) {
            z = false;
        }
        tj4Var2.setValue(Boolean.valueOf(z));
        if (pj4Var.h() >= RecyclerView.A1) {
            long d = b().d();
            f(b().c(pj4Var.h() * ((float) d)));
        } else if (pj4Var.h() == -3.0f) {
            f(obj);
        }
        this.d0 = false;
        pj4Var.i(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.e0.getValue() + ", target: " + this.B.getValue() + ", spec: " + c();
    }
}
