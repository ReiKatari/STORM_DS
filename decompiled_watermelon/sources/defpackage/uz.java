package defpackage;

import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class uz implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ BackgroundsActivity B;

    public /* synthetic */ uz(BackgroundsActivity backgroundsActivity, int i) {
        this.A = i;
        this.B = backgroundsActivity;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        o27 o27Var = o27.a;
        BackgroundsActivity backgroundsActivity = this.B;
        tu0 tu0Var = (tu0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i2 = BackgroundsActivity.A0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    mj2.b(false, ct3.H0(440963006, new uz(backgroundsActivity, 1), sk2Var), sk2Var, 48, 1);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                int i3 = BackgroundsActivity.A0;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var;
                if (sk2Var2.O(intValue & 1, z2)) {
                    j56.a(null, ct3.H0(-1635922308, new l4(1, ln2.Q(new k54[0], sk2Var2), backgroundsActivity), sk2Var2), sk2Var2, 48);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
