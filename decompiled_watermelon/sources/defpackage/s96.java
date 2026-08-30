package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s96  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s96 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ aj2 B;
    public final /* synthetic */ et0 L;

    public /* synthetic */ s96(et0 et0Var, aj2 aj2Var, int i) {
        this.A = 2;
        this.L = et0Var;
        this.B = aj2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        float f;
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z3 = false;
        et0 et0Var = this.L;
        aj2 aj2Var = this.B;
        tu0 tu0Var = (tu0) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z3)) {
                    ir6.a(((c17) sk2Var.j(d17.b)).j, ct3.H0(1789628237, new s96(aj2Var, et0Var, 1), sk2Var), sk2Var, 48);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                int intValue2 = num.intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var;
                if (sk2Var2.O(intValue2 & 1, z)) {
                    if (aj2Var == null) {
                        sk2Var2.X(1845819398);
                        ln2.p(et0Var, sk2Var2, 0);
                        sk2Var2.p(false);
                    } else {
                        sk2Var2.X(1845823628);
                        ln2.i(et0Var, aj2Var, sk2Var2, 0);
                        sk2Var2.p(false);
                    }
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            case 2:
                num.getClass();
                ln2.i(et0Var, aj2Var, tu0Var, ep2.I(1));
                return o27Var;
            default:
                int intValue3 = num.intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var3 = (sk2) tu0Var;
                if (sk2Var3.O(intValue3 & 1, z2)) {
                    tv0 tv0Var = b01.a;
                    long j = ((xq0) sk2Var3.j(e01.a)).a;
                    if (!((hr0) sk2Var3.j(ir0.a)).k() ? mh7.V(j) < 0.5d : mh7.V(j) > 0.5d) {
                        f = 1.0f;
                    } else {
                        f = 0.87f;
                    }
                    dk7.a(tv0Var.a(Float.valueOf(f)), ct3.H0(1236486620, new s96(aj2Var, et0Var, 0), sk2Var3), sk2Var3, 56);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
        }
    }

    public /* synthetic */ s96(aj2 aj2Var, et0 et0Var, int i) {
        this.A = i;
        this.B = aj2Var;
        this.L = et0Var;
    }
}
