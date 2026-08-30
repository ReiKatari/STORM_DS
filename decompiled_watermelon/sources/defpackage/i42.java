package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i42  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i42 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ k42 B;

    public /* synthetic */ i42(k42 k42Var, int i) {
        this.A = i;
        this.B = k42Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        o27 o27Var = o27.a;
        k42 k42Var = this.B;
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
                    mj2.b(true, ct3.H0(1730256364, new i42(k42Var, 1), sk2Var), sk2Var, 54, 0);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var;
                if (sk2Var2.O(intValue & 1, z2)) {
                    aj2 aj2Var = (aj2) k42Var.X.getValue();
                    if (aj2Var == null) {
                        sk2Var2.X(-2130102771);
                    } else {
                        sk2Var2.X(624023668);
                        aj2Var.j(sk2Var2, 0);
                    }
                    sk2Var2.p(false);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
