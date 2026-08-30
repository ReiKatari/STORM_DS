package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sp implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ et0 B;

    public /* synthetic */ sp(et0 et0Var, int i) {
        this.A = i;
        this.B = et0Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.A;
        boolean z5 = false;
        o27 o27Var = o27.a;
        et0 et0Var = this.B;
        tu0 tu0Var = (tu0) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z5 = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z5)) {
                    tv0 tv0Var = b01.a;
                    long j = ((xq0) sk2Var.j(e01.a)).a;
                    if (!((hr0) sk2Var.j(ir0.a)).k() ? mh7.V(j) < 0.5d : mh7.V(j) > 0.5d) {
                        f = 1.0f;
                    } else {
                        f = 0.87f;
                    }
                    dk7.a(tv0Var.a(Float.valueOf(f)), et0Var, sk2Var, 8);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                int intValue2 = num.intValue();
                if ((intValue2 & 3) != 2) {
                    z5 = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var;
                if (sk2Var2.O(intValue2 & 1, z5)) {
                    ir6.a(((c17) sk2Var2.j(d17.b)).k, ct3.H0(-1686273317, new sp(et0Var, 2), sk2Var2), sk2Var2, 48);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            case 2:
                int intValue3 = num.intValue();
                if ((intValue3 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var3 = (sk2) tu0Var;
                if (sk2Var3.O(intValue3 & 1, z)) {
                    zy3 a = o76.a(wy3.a, 56.0f, 56.0f);
                    tv3 d = d50.d(y60.Z, false);
                    int j0 = dt3.j0(sk2Var3);
                    sm4 l = sk2Var3.l();
                    zy3 e0 = l07.e0(sk2Var3, a);
                    nu0.i.getClass();
                    mv0 mv0Var = mu0.b;
                    sk2Var3.b0();
                    if (sk2Var3.S) {
                        sk2Var3.k(mv0Var);
                    } else {
                        sk2Var3.k0();
                    }
                    oo2.S(sk2Var3, mu0.f, d);
                    oo2.S(sk2Var3, mu0.e, l);
                    dn dnVar = mu0.g;
                    if (sk2Var3.S || !b53.x(sk2Var3.L(), Integer.valueOf(j0))) {
                        b31.w(j0, sk2Var3, j0, dnVar);
                    }
                    oo2.S(sk2Var3, mu0.d, e0);
                    et0Var.j(sk2Var3, 0);
                    sk2Var3.p(true);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
            case 3:
                int intValue4 = num.intValue();
                if ((intValue4 & 3) != 2) {
                    z5 = true;
                }
                sk2 sk2Var4 = (sk2) tu0Var;
                if (sk2Var4.O(intValue4 & 1, z5)) {
                    et0Var.i(tb2.a, sk2Var4, 6);
                } else {
                    sk2Var4.R();
                }
                return o27Var;
            case 4:
                num.getClass();
                oo2.f(et0Var, tu0Var, ep2.I(7));
                return o27Var;
            case 5:
                int intValue5 = num.intValue();
                if ((intValue5 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var5 = (sk2) tu0Var;
                if (sk2Var5.O(intValue5 & 1, z2)) {
                    oo2.h(et0Var, sk2Var5, 0);
                } else {
                    sk2Var5.R();
                }
                return o27Var;
            case ig7.b /* 6 */:
                num.getClass();
                oo2.h(et0Var, tu0Var, ep2.I(1));
                return o27Var;
            case 7:
                int intValue6 = num.intValue();
                if ((intValue6 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sk2 sk2Var6 = (sk2) tu0Var;
                if (sk2Var6.O(intValue6 & 1, z3)) {
                    et0Var.j(sk2Var6, 0);
                } else {
                    sk2Var6.R();
                }
                return o27Var;
            case 8:
                int intValue7 = num.intValue();
                if ((intValue7 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                sk2 sk2Var7 = (sk2) tu0Var;
                if (sk2Var7.O(intValue7 & 1, z4)) {
                    et0Var.j(sk2Var7, 0);
                } else {
                    sk2Var7.R();
                }
                return o27Var;
            case 9:
                num.getClass();
                dt3.L(et0Var, tu0Var, ep2.I(7));
                return o27Var;
            default:
                num.getClass();
                ln2.p(et0Var, tu0Var, ep2.I(1));
                return o27Var;
        }
    }

    public /* synthetic */ sp(et0 et0Var, int i, int i2) {
        this.A = i2;
        this.B = et0Var;
    }
}
