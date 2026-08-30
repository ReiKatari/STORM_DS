package defpackage;

import me.magnum.melonds.ui.cheats.CheatsActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cm0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cm0 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ CheatsActivity B;
    public final /* synthetic */ tq5 L;

    public /* synthetic */ cm0(CheatsActivity cheatsActivity, tq5 tq5Var, int i) {
        this.A = i;
        this.B = cheatsActivity;
        this.L = tq5Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        o27 o27Var = o27.a;
        tq5 tq5Var = this.L;
        CheatsActivity cheatsActivity = this.B;
        tu0 tu0Var = (tu0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i2 = CheatsActivity.A0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    mj2.b(false, ct3.H0(-1275664099, new cm0(cheatsActivity, tq5Var, 1), sk2Var), sk2Var, 48, 1);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                int i3 = CheatsActivity.A0;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var;
                if (sk2Var2.O(intValue & 1, z2)) {
                    iq2.b((pn0) cheatsActivity.z0.getValue(), tq5Var, sk2Var2, 0);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
