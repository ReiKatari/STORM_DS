package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qp implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ re7 B;
    public final /* synthetic */ ih4 L;
    public final /* synthetic */ et0 R;

    public /* synthetic */ qp(re7 re7Var, ih4 ih4Var, et0 et0Var, int i) {
        this.A = i;
        this.B = re7Var;
        this.L = ih4Var;
        this.R = et0Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        float f;
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z = false;
        et0 et0Var = this.R;
        ih4 ih4Var = this.L;
        re7 re7Var = this.B;
        tu0 tu0Var = (tu0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    tv0 tv0Var = b01.a;
                    long j = ((xq0) sk2Var.j(e01.a)).a;
                    if (!((hr0) sk2Var.j(ir0.a)).k() ? mh7.V(j) < 0.5d : mh7.V(j) > 0.5d) {
                        f = 0.74f;
                    } else {
                        f = 0.6f;
                    }
                    dk7.a(tv0Var.a(Float.valueOf(f)), ct3.H0(597057613, new qp(re7Var, ih4Var, et0Var, 1), sk2Var), sk2Var, 56);
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
                    zy3 d = o76.d(b53.W(l07.x0(o76.c(wy3.a, 1.0f), re7Var), ih4Var), 56.0f);
                    sr5 a = rr5.a(rt.a, y60.h0, sk2Var2, 54);
                    int j0 = dt3.j0(sk2Var2);
                    sm4 l = sk2Var2.l();
                    zy3 e0 = l07.e0(sk2Var2, d);
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
                    et0Var.i(ur5.a, sk2Var2, 6);
                    sk2Var2.p(true);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
