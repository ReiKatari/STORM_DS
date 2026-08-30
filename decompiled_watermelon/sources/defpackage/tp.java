package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tp implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ bj2 B;

    public /* synthetic */ tp(bj2 bj2Var, int i) {
        this.A = i;
        this.B = bj2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        float f = 1.0f;
        ur5 ur5Var = ur5.a;
        o27 o27Var = o27.a;
        boolean z3 = false;
        bj2 bj2Var = this.B;
        tu0 tu0Var = (tu0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z3)) {
                    zy3 b = o76.b(wy3.a, 1.0f);
                    sr5 a = rr5.a(rt.b, y60.h0, sk2Var, 54);
                    int j0 = dt3.j0(sk2Var);
                    sm4 l = sk2Var.l();
                    zy3 e0 = l07.e0(sk2Var, b);
                    nu0.i.getClass();
                    mv0 mv0Var = mu0.b;
                    sk2Var.b0();
                    if (sk2Var.S) {
                        sk2Var.k(mv0Var);
                    } else {
                        sk2Var.k0();
                    }
                    oo2.S(sk2Var, mu0.f, a);
                    oo2.S(sk2Var, mu0.e, l);
                    dn dnVar = mu0.g;
                    if (sk2Var.S || !b53.x(sk2Var.L(), Integer.valueOf(j0))) {
                        b31.w(j0, sk2Var, j0, dnVar);
                    }
                    oo2.S(sk2Var, mu0.d, e0);
                    bj2Var.i(ur5Var, sk2Var, 6);
                    sk2Var.p(true);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var;
                if (sk2Var2.O(intValue & 1, z)) {
                    sk2Var2.X(-1691869137);
                    long j = ((xq0) sk2Var2.j(e01.a)).a;
                    if (!((hr0) sk2Var2.j(ir0.a)).k() ? mh7.V(j) >= 0.5d : mh7.V(j) <= 0.5d) {
                        f = 0.87f;
                    }
                    sk2Var2.p(false);
                    dk7.a(b01.a.a(Float.valueOf(f)), ct3.H0(-308149173, new tp(bj2Var, 2), sk2Var2), sk2Var2, 56);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            default:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var3 = (sk2) tu0Var;
                if (sk2Var3.O(intValue & 1, z2)) {
                    bj2Var.i(ur5Var, sk2Var3, 0);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
        }
    }
}
