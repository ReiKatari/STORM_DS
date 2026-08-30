package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ad1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ad1 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ cd1 B;

    public /* synthetic */ ad1(cd1 cd1Var, int i) {
        this.A = i;
        this.B = cd1Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        cd1 cd1Var = this.B;
        switch (i) {
            case 0:
                hg5 hg5Var = (hg5) mh7.t(cd1Var, lg5.a);
                el elVar = cd1Var.p0;
                if (hg5Var == null) {
                    if (elVar != null) {
                        cd1Var.S0(elVar);
                    }
                    cd1Var.p0 = null;
                } else if (elVar == null) {
                    bd1 bd1Var = new bd1(0, cd1Var);
                    ad1 ad1Var = new ad1(cd1Var, 1);
                    l14 l14Var = cd1Var.l0;
                    boolean z = cd1Var.m0;
                    float f = cd1Var.n0;
                    xy6 xy6Var = kg5.a;
                    el elVar2 = new el(l14Var, z, f, bd1Var, ad1Var);
                    cd1Var.R0(elVar2);
                    cd1Var.p0 = elVar2;
                }
                return o27.a;
            default:
                hg5 hg5Var2 = (hg5) mh7.t(cd1Var, lg5.a);
                long j = ((xq0) mh7.t(cd1Var, e01.a)).a;
                if (((hr0) mh7.t(cd1Var, ir0.a)).k()) {
                    if (mh7.V(j) > 0.5d) {
                        return lg5.d;
                    }
                    return lg5.e;
                }
                return lg5.f;
        }
    }
}
