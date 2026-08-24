package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bv2  reason: default package */
/* loaded from: classes.dex */
public final class bv2 extends ct7 {
    @Override // defpackage.xh1
    public final void a(xh1 xh1Var) {
        ci1 ci1Var = this.h;
        if (!ci1Var.c || ci1Var.j) {
            return;
        }
        ci1Var.d((int) ((((ci1) ci1Var.l.get(0)).g * ((av2) this.b).t0) + 0.5f));
    }

    @Override // defpackage.ct7
    public final void d() {
        l21 l21Var = this.b;
        av2 av2Var = (av2) l21Var;
        int i = av2Var.u0;
        int i2 = av2Var.v0;
        int i3 = av2Var.x0;
        ci1 ci1Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                ci1Var.l.add(l21Var.U.d.h);
                this.b.U.d.h.k.add(ci1Var);
                ci1Var.f = i;
            } else if (i2 != -1) {
                ci1Var.l.add(l21Var.U.d.i);
                this.b.U.d.i.k.add(ci1Var);
                ci1Var.f = -i2;
            } else {
                ci1Var.b = true;
                ci1Var.l.add(l21Var.U.d.i);
                this.b.U.d.i.k.add(ci1Var);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            ci1Var.l.add(l21Var.U.e.h);
            this.b.U.e.h.k.add(ci1Var);
            ci1Var.f = i;
        } else if (i2 != -1) {
            ci1Var.l.add(l21Var.U.e.i);
            this.b.U.e.i.k.add(ci1Var);
            ci1Var.f = -i2;
        } else {
            ci1Var.b = true;
            ci1Var.l.add(l21Var.U.e.i);
            this.b.U.e.i.k.add(ci1Var);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.ct7
    public final void e() {
        l21 l21Var = this.b;
        int i = ((av2) l21Var).x0;
        ci1 ci1Var = this.h;
        if (i == 1) {
            l21Var.Z = ci1Var.g;
        } else {
            l21Var.a0 = ci1Var.g;
        }
    }

    @Override // defpackage.ct7
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.ct7
    public final boolean k() {
        return false;
    }

    public final void m(ci1 ci1Var) {
        ci1 ci1Var2 = this.h;
        ci1Var2.k.add(ci1Var);
        ci1Var.l.add(ci1Var2);
    }
}
