package defpackage;

import me.magnum.melonds.ui.layouts.LayoutListActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hf3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hf3 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ LayoutListActivity B;

    public /* synthetic */ hf3(LayoutListActivity layoutListActivity, int i) {
        this.A = i;
        this.B = layoutListActivity;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        o27 o27Var = o27.a;
        tu0 tu0Var = (tu0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i2 = LayoutListActivity.A0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    mj2.b(false, ct3.H0(1573839142, new hf3(this.B, 1), sk2Var), sk2Var, 48, 1);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                int i3 = LayoutListActivity.A0;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var;
                if (sk2Var2.O(intValue & 1, z2)) {
                    LayoutListActivity layoutListActivity = this.B;
                    eh3 eh3Var = (eh3) layoutListActivity.z0.getValue();
                    boolean h = sk2Var2.h(layoutListActivity);
                    Object L = sk2Var2.L();
                    if (h || L == su0.a) {
                        i4 i4Var = new i4(0, layoutListActivity, LayoutListActivity.class, "finish", "finish()V", 0, 0, 7);
                        sk2Var2.h0(i4Var);
                        L = i4Var;
                    }
                    nl2.f(eh3Var, (ki2) ((lj2) L), sk2Var2, 0);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
