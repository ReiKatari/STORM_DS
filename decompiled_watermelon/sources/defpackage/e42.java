package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e42  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e42 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ f42 B;

    public /* synthetic */ e42(f42 f42Var, int i) {
        this.A = i;
        this.B = f42Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        o27 o27Var;
        boolean z2;
        int i = this.A;
        o27 o27Var2 = o27.a;
        f42 f42Var = this.B;
        tu0 tu0Var = (tu0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    zy3 i2 = dk7.i(o76.c, jd7.s, iq2.g);
                    tv3 d = d50.d(y60.L, false);
                    int hashCode = Long.hashCode(sk2Var.T);
                    sm4 l = sk2Var.l();
                    zy3 e0 = l07.e0(sk2Var, i2);
                    nu0.i.getClass();
                    mv0 mv0Var = mu0.b;
                    sk2Var.b0();
                    if (sk2Var.S) {
                        sk2Var.k(mv0Var);
                    } else {
                        sk2Var.k0();
                    }
                    oo2.S(sk2Var, mu0.f, d);
                    oo2.S(sk2Var, mu0.e, l);
                    oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
                    oo2.P(sk2Var, mu0.h);
                    oo2.S(sk2Var, mu0.d, e0);
                    aj2 aj2Var = (aj2) f42Var.B.getValue();
                    if (aj2Var == null) {
                        sk2Var.X(908576654);
                        sk2Var.p(false);
                        o27Var = null;
                    } else {
                        sk2Var.X(-1356164397);
                        aj2Var.j(sk2Var, 0);
                        sk2Var.p(false);
                        o27Var = o27Var2;
                    }
                    if (o27Var == null) {
                        sk2Var.X(-1356164003);
                        pu.e(sk2Var, 0);
                    } else {
                        sk2Var.X(-1356164840);
                    }
                    sk2Var.p(false);
                    sk2Var.p(true);
                } else {
                    sk2Var.R();
                }
                return o27Var2;
            default:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var;
                if (sk2Var2.O(intValue & 1, z2)) {
                    mj2.b(true, ct3.H0(918246117, new e42(f42Var, 0), sk2Var2), sk2Var2, 54, 0);
                } else {
                    sk2Var2.R();
                }
                return o27Var2;
        }
    }
}
