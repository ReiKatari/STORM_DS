package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zq1 implements aj2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ n6 B;

    public /* synthetic */ zq1(n6 n6Var) {
        this.B = n6Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        n6 n6Var = this.B;
        tu0 tu0Var = (tu0) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = EmulatorActivity.P1;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    pu.b(n6Var, sk2Var, 0);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                num.getClass();
                pu.b(n6Var, tu0Var, ep2.I(1));
                return o27Var;
        }
    }

    public /* synthetic */ zq1(n6 n6Var, int i) {
        this.B = n6Var;
    }
}
