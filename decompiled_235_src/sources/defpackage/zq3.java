package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zq3  reason: default package */
/* loaded from: classes.dex */
public final class zq3 extends z64 implements va6 {
    public on2 k0;
    public tq3 l0;
    public lo4 m0;
    public boolean n0;
    public e76 o0;
    public final xq3 p0 = new xq3(this, 0);
    public xq3 q0;

    public zq3(on2 on2Var, tq3 tq3Var, lo4 lo4Var, boolean z) {
        this.k0 = on2Var;
        this.l0 = tq3Var;
        this.m0 = lo4Var;
        this.n0 = z;
        R0();
    }

    @Override // defpackage.va6
    public final void A0(gb6 gb6Var) {
        fg3[] fg3VarArr = eb6.a;
        fb6 fb6Var = bb6.n;
        fg3[] fg3VarArr2 = eb6.a;
        fg3 fg3Var = fg3VarArr2[6];
        gb6Var.a(fb6Var, Boolean.TRUE);
        gb6Var.a(bb6.N, this.p0);
        lo4 lo4Var = this.m0;
        lo4 lo4Var2 = lo4.Vertical;
        e76 e76Var = this.o0;
        if (lo4Var == lo4Var2) {
            if (e76Var != null) {
                fb6 fb6Var2 = bb6.w;
                fg3 fg3Var2 = fg3VarArr2[13];
                gb6Var.a(fb6Var2, e76Var);
            } else {
                nb3.a0("scrollAxisRange");
                throw null;
            }
        } else if (e76Var != null) {
            fb6 fb6Var3 = bb6.v;
            fg3 fg3Var3 = fg3VarArr2[12];
            gb6Var.a(fb6Var3, e76Var);
        } else {
            nb3.a0("scrollAxisRange");
            throw null;
        }
        xq3 xq3Var = this.q0;
        if (xq3Var != null) {
            gb6Var.a(sa6.f, new y1(null, xq3Var));
        }
        gb6Var.a(sa6.C, new y1(null, new mc(new yq3(this, 2), 23)));
        bt0 e = this.l0.e();
        fb6 fb6Var4 = bb6.f;
        fg3 fg3Var4 = fg3VarArr2[24];
        gb6Var.a(fb6Var4, e);
    }

    @Override // defpackage.z64
    public final boolean G0() {
        return false;
    }

    public final void R0() {
        xq3 xq3Var;
        this.o0 = new e76(new yq3(this, 0), new yq3(this, 1));
        if (this.n0) {
            xq3Var = new xq3(this, 1);
        } else {
            xq3Var = null;
        }
        this.q0 = xq3Var;
    }
}
