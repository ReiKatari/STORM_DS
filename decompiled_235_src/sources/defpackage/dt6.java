package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dt6  reason: default package */
/* loaded from: classes.dex */
public final class dt6 extends zg1 implements yy4, rg2, ph2 {
    public on2 m0;
    public boolean n0;
    public final ow6 o0;

    public dt6(on2 on2Var) {
        this.m0 = on2Var;
        rg rgVar = new rg(this, 4);
        oy4 oy4Var = jw6.a;
        ow6 ow6Var = new ow6(null, null, null, rgVar);
        R0(ow6Var);
        this.o0 = ow6Var;
    }

    @Override // defpackage.rg2
    public final void D(sh2 sh2Var) {
        this.n0 = sh2Var.isFocused();
    }

    @Override // defpackage.yy4
    public final void I() {
        this.o0.I();
    }

    @Override // defpackage.yy4
    public final long o() {
        tm1 tm1Var = l.h;
        qh1 qh1Var = nc1.f0(this).u0;
        tm1Var.getClass();
        int i = s87.b;
        return x31.v(qh1Var.r0(10.0f), qh1Var.r0(40.0f), qh1Var.r0(10.0f), qh1Var.r0(40.0f));
    }

    @Override // defpackage.yy4
    public final void w(oy4 oy4Var, py4 py4Var, long j) {
        this.o0.w(oy4Var, py4Var, j);
    }
}
