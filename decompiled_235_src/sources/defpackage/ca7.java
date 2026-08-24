package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ca7  reason: default package */
/* loaded from: classes.dex */
public final class ca7 implements pp6 {
    public final wc7 A;
    public final vs4 B;
    public final vs4 L;
    public final vs4 R;
    public g96 X;
    public jz6 Y;
    public final vs4 Z;
    public final rs4 d0;
    public boolean e0;
    public final vs4 f0;
    public ap g0;
    public final ts4 h0;
    public boolean i0;
    public final io6 j0;
    public final /* synthetic */ ga7 k0;

    public ca7(ga7 ga7Var, Object obj, ap apVar, wc7 wc7Var) {
        this.k0 = ga7Var;
        this.A = wc7Var;
        vs4 Y = np2.Y(obj);
        this.B = Y;
        Object obj2 = null;
        this.L = np2.Y(ge7.U(RecyclerView.B1, RecyclerView.B1, null, 7));
        this.R = np2.Y(new jz6(b(), wc7Var, obj, Y.getValue(), apVar));
        this.Z = np2.Y(Boolean.TRUE);
        this.d0 = new rs4(-1.0f);
        this.f0 = np2.Y(obj);
        this.g0 = apVar;
        this.h0 = new ts4(a().b());
        Float f = (Float) vq7.b.get(wc7Var);
        if (f != null) {
            float floatValue = f.floatValue();
            ap apVar2 = (ap) wc7Var.a.g(obj);
            int b = apVar2.b();
            for (int i = 0; i < b; i++) {
                apVar2.e(i, floatValue);
            }
            obj2 = this.A.b.g(apVar2);
        }
        this.j0 = ge7.U(RecyclerView.B1, RecyclerView.B1, obj2, 3);
    }

    public final jz6 a() {
        return (jz6) this.R.getValue();
    }

    public final rc2 b() {
        return (rc2) this.L.getValue();
    }

    public final void e(long j) {
        if (this.d0.h() == -1.0f) {
            this.i0 = true;
            if (nb3.k(a().L, a().R)) {
                f(a().L);
                return;
            }
            f(a().g(j));
            this.g0 = a().d(j);
        }
    }

    public final void f(Object obj) {
        this.f0.setValue(obj);
    }

    public final void g(boolean z, Object obj) {
        Object obj2;
        rc2 b;
        to gp6Var;
        jz6 jz6Var = this.Y;
        if (jz6Var != null) {
            obj2 = jz6Var.L;
        } else {
            obj2 = null;
        }
        vs4 vs4Var = this.B;
        boolean k = nb3.k(obj2, vs4Var.getValue());
        ts4 ts4Var = this.h0;
        vs4 vs4Var2 = this.R;
        if (k) {
            vs4Var2.setValue(new jz6(this.j0, this.A, obj, obj, this.g0.c()));
            this.e0 = true;
            ts4Var.i(a().b());
            return;
        }
        if (z && !this.i0) {
            if (b() instanceof io6) {
                b = b();
            } else {
                b = this.j0;
            }
        } else {
            b = b();
        }
        ga7 ga7Var = this.k0;
        long e = ga7Var.e();
        vs4 vs4Var3 = ga7Var.h;
        if (e <= 0) {
            gp6Var = b;
        } else {
            gp6Var = new gp6(b, ga7Var.e());
        }
        vs4Var2.setValue(new jz6(gp6Var, this.A, obj, vs4Var.getValue(), this.g0));
        ts4Var.i(a().b());
        this.e0 = false;
        vs4Var3.setValue(Boolean.TRUE);
        if (ga7Var.g()) {
            mm6 mm6Var = ga7Var.i;
            int size = mm6Var.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                ca7 ca7Var = (ca7) mm6Var.get(i);
                j = Math.max(j, ca7Var.h0.h());
                ca7Var.e(0L);
            }
            vs4Var3.setValue(Boolean.FALSE);
        }
    }

    @Override // defpackage.pp6
    public final Object getValue() {
        return this.f0.getValue();
    }

    public final void h(Object obj, Object obj2, rc2 rc2Var) {
        this.B.setValue(obj2);
        this.L.setValue(rc2Var);
        if (nb3.k(a().R, obj) && nb3.k(a().L, obj2)) {
            return;
        }
        g(false, obj);
    }

    public final void i(Object obj, rc2 rc2Var) {
        Object value;
        Object obj2;
        if (this.e0) {
            jz6 jz6Var = this.Y;
            if (jz6Var != null) {
                obj2 = jz6Var.L;
            } else {
                obj2 = null;
            }
            if (nb3.k(obj, obj2)) {
                return;
            }
        }
        vs4 vs4Var = this.B;
        boolean k = nb3.k(vs4Var.getValue(), obj);
        rs4 rs4Var = this.d0;
        if (k && rs4Var.h() == -1.0f) {
            return;
        }
        vs4Var.setValue(obj);
        this.L.setValue(rc2Var);
        if (rs4Var.h() == -3.0f) {
            value = obj;
        } else {
            value = this.f0.getValue();
        }
        vs4 vs4Var2 = this.Z;
        boolean z = true;
        g(!((Boolean) vs4Var2.getValue()).booleanValue(), value);
        if (rs4Var.h() != -3.0f) {
            z = false;
        }
        vs4Var2.setValue(Boolean.valueOf(z));
        if (rs4Var.h() >= RecyclerView.B1) {
            long b = a().b();
            f(a().g(rs4Var.h() * ((float) b)));
        } else if (rs4Var.h() == -3.0f) {
            f(obj);
        }
        this.e0 = false;
        rs4Var.i(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.f0.getValue() + ", target: " + this.B.getValue() + ", spec: " + b();
    }
}
