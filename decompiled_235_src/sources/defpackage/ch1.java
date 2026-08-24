package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ch1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ch1 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ eh1 B;

    public /* synthetic */ ch1(eh1 eh1Var, int i) {
        this.A = i;
        this.B = eh1Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        eh1 eh1Var = this.B;
        switch (i) {
            case 0:
                fq5 fq5Var = (fq5) hf.K(eh1Var, jq5.a);
                ql qlVar = eh1Var.q0;
                if (fq5Var == null) {
                    if (qlVar != null) {
                        eh1Var.S0(qlVar);
                    }
                    eh1Var.q0 = null;
                } else if (qlVar == null) {
                    dh1 dh1Var = new dh1(eh1Var, 0);
                    ch1 ch1Var = new ch1(eh1Var, 1);
                    r94 r94Var = eh1Var.m0;
                    boolean z = eh1Var.n0;
                    float f = eh1Var.o0;
                    sc7 sc7Var = iq5.a;
                    ql qlVar2 = new ql(r94Var, z, f, dh1Var, ch1Var);
                    eh1Var.R0(qlVar2);
                    eh1Var.q0 = qlVar2;
                }
                return jg7.a;
            default:
                fq5 fq5Var2 = (fq5) hf.K(eh1Var, jq5.a);
                long j = ((kt0) hf.K(eh1Var, j31.a)).a;
                if (((ut0) hf.K(eh1Var, vt0.a)).k()) {
                    if (hv.N(j) > 0.5d) {
                        return jq5.d;
                    }
                    return jq5.e;
                }
                return jq5.f;
        }
    }
}
