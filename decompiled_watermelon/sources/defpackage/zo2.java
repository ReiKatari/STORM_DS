package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zo2  reason: default package */
/* loaded from: classes.dex */
public final class zo2 extends be7 {
    @Override // defpackage.ud1
    public final void a(ud1 ud1Var) {
        yd1 yd1Var = this.h;
        if (!yd1Var.c || yd1Var.j) {
            return;
        }
        yd1Var.d((int) ((((yd1) yd1Var.l.get(0)).g * ((yo2) this.b).t0) + 0.5f));
    }

    @Override // defpackage.be7
    public final void d() {
        gz0 gz0Var = this.b;
        yo2 yo2Var = (yo2) gz0Var;
        int i = yo2Var.u0;
        int i2 = yo2Var.v0;
        int i3 = yo2Var.x0;
        yd1 yd1Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                yd1Var.l.add(gz0Var.U.d.h);
                this.b.U.d.h.k.add(yd1Var);
                yd1Var.f = i;
            } else if (i2 != -1) {
                yd1Var.l.add(gz0Var.U.d.i);
                this.b.U.d.i.k.add(yd1Var);
                yd1Var.f = -i2;
            } else {
                yd1Var.b = true;
                yd1Var.l.add(gz0Var.U.d.i);
                this.b.U.d.i.k.add(yd1Var);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            yd1Var.l.add(gz0Var.U.e.h);
            this.b.U.e.h.k.add(yd1Var);
            yd1Var.f = i;
        } else if (i2 != -1) {
            yd1Var.l.add(gz0Var.U.e.i);
            this.b.U.e.i.k.add(yd1Var);
            yd1Var.f = -i2;
        } else {
            yd1Var.b = true;
            yd1Var.l.add(gz0Var.U.e.i);
            this.b.U.e.i.k.add(yd1Var);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.be7
    public final void e() {
        gz0 gz0Var = this.b;
        int i = ((yo2) gz0Var).x0;
        yd1 yd1Var = this.h;
        if (i == 1) {
            gz0Var.Z = yd1Var.g;
        } else {
            gz0Var.a0 = yd1Var.g;
        }
    }

    @Override // defpackage.be7
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.be7
    public final boolean k() {
        return false;
    }

    public final void m(yd1 yd1Var) {
        yd1 yd1Var2 = this.h;
        yd1Var2.k.add(yd1Var);
        yd1Var.l.add(yd1Var2);
    }
}
