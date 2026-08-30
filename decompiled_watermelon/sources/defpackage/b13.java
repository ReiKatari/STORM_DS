package defpackage;

import me.magnum.melonds.ui.inputsetup.InputSetupActivity;
import me.magnum.melonds.ui.inputsetup.b;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b13  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b13 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ InputSetupActivity B;

    public /* synthetic */ b13(InputSetupActivity inputSetupActivity, int i) {
        this.A = i;
        this.B = inputSetupActivity;
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
                int i2 = InputSetupActivity.C0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    mj2.b(false, ct3.H0(1190419940, new b13(this.B, 1), sk2Var), sk2Var, 48, 1);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                int i3 = InputSetupActivity.C0;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var;
                if (sk2Var2.O(intValue & 1, z2)) {
                    InputSetupActivity inputSetupActivity = this.B;
                    b B = inputSetupActivity.B();
                    boolean h = sk2Var2.h(inputSetupActivity);
                    Object L = sk2Var2.L();
                    if (h || L == su0.a) {
                        t9 t9Var = new t9(0, 8, InputSetupActivity.class, inputSetupActivity, "onNavigateUp", "onNavigateUp()Z");
                        sk2Var2.h0(t9Var);
                        L = t9Var;
                    }
                    q13.b(B, (ki2) L, sk2Var2, 0);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
