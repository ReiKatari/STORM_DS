package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g70  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g70 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ih4 B;
    public final /* synthetic */ bj2 L;

    public /* synthetic */ g70(ih4 ih4Var, bj2 bj2Var, int i) {
        this.A = i;
        this.B = ih4Var;
        this.L = bj2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z = false;
        bj2 bj2Var = this.L;
        ih4 ih4Var = this.B;
        tu0 tu0Var = (tu0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    ir6.a(((c17) sk2Var.j(d17.b)).k, ct3.H0(165539859, new g70(ih4Var, bj2Var, 1), sk2Var), sk2Var, 48);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                if ((intValue & 3) != 2) {
                    z = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var;
                if (sk2Var2.O(intValue & 1, z)) {
                    zy3 W = b53.W(o76.a(wy3.a, e70.b, e70.c), ih4Var);
                    sr5 a = rr5.a(rt.d, y60.h0, sk2Var2, 54);
                    int j0 = dt3.j0(sk2Var2);
                    sm4 l = sk2Var2.l();
                    zy3 e0 = l07.e0(sk2Var2, W);
                    nu0.i.getClass();
                    mv0 mv0Var = mu0.b;
                    sk2Var2.b0();
                    if (sk2Var2.S) {
                        sk2Var2.k(mv0Var);
                    } else {
                        sk2Var2.k0();
                    }
                    oo2.S(sk2Var2, mu0.f, a);
                    oo2.S(sk2Var2, mu0.e, l);
                    dn dnVar = mu0.g;
                    if (sk2Var2.S || !b53.x(sk2Var2.L(), Integer.valueOf(j0))) {
                        b31.w(j0, sk2Var2, j0, dnVar);
                    }
                    oo2.S(sk2Var2, mu0.d, e0);
                    bj2Var.i(ur5.a, sk2Var2, 6);
                    sk2Var2.p(true);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
