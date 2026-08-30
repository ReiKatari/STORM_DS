package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ak3  reason: default package */
/* loaded from: classes.dex */
public final class ak3 extends yy3 implements gz5 {
    public ki2 j0;
    public uj3 k0;
    public jf4 l0;
    public boolean m0;
    public rv5 n0;
    public final yj3 o0 = new yj3(this, 0);
    public yj3 p0;

    public ak3(ki2 ki2Var, uj3 uj3Var, jf4 jf4Var, boolean z) {
        this.j0 = ki2Var;
        this.k0 = uj3Var;
        this.l0 = jf4Var;
        this.m0 = z;
        R0();
    }

    @Override // defpackage.yy3
    public final boolean G0() {
        return false;
    }

    public final void R0() {
        yj3 yj3Var;
        this.n0 = new rv5(new zj3(this, 0), new zj3(this, 1));
        if (this.m0) {
            yj3Var = new yj3(this, 1);
        } else {
            yj3Var = null;
        }
        this.p0 = yj3Var;
    }

    @Override // defpackage.gz5
    public final void p0(rz5 rz5Var) {
        l93[] l93VarArr = pz5.a;
        qz5 qz5Var = mz5.n;
        l93[] l93VarArr2 = pz5.a;
        l93 l93Var = l93VarArr2[6];
        rz5Var.b(qz5Var, Boolean.TRUE);
        rz5Var.b(mz5.N, this.o0);
        jf4 jf4Var = this.l0;
        jf4 jf4Var2 = jf4.Vertical;
        rv5 rv5Var = this.n0;
        if (jf4Var == jf4Var2) {
            if (rv5Var != null) {
                qz5 qz5Var2 = mz5.w;
                l93 l93Var2 = l93VarArr2[13];
                rz5Var.b(qz5Var2, rv5Var);
            } else {
                b53.g0("scrollAxisRange");
                throw null;
            }
        } else if (rv5Var != null) {
            qz5 qz5Var3 = mz5.v;
            l93 l93Var3 = l93VarArr2[12];
            rz5Var.b(qz5Var3, rv5Var);
        } else {
            b53.g0("scrollAxisRange");
            throw null;
        }
        yj3 yj3Var = this.p0;
        if (yj3Var != null) {
            rz5Var.b(dz5.f, new w1(null, yj3Var));
        }
        rz5Var.b(dz5.C, new w1(null, new yb(24, new zj3(this, 2))));
        oq0 c = this.k0.c();
        qz5 qz5Var4 = mz5.f;
        l93 l93Var4 = l93VarArr2[24];
        rz5Var.b(qz5Var4, c);
    }
}
