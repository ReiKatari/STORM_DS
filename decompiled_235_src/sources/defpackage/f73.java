package defpackage;

import me.magnum.melonds.ui.inputsetup.InputSetupActivity;
import me.magnum.melonds.ui.inputsetup.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f73  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class f73 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ InputSetupActivity B;

    public /* synthetic */ f73(InputSetupActivity inputSetupActivity, int i) {
        this.A = i;
        this.B = inputSetupActivity;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        px0 px0Var = (px0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i2 = InputSetupActivity.D0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    bl2.e(false, n16.I(1190419940, new f73(this.B, 1), xq2Var), xq2Var, 48, 1);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                int i3 = InputSetupActivity.D0;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z2)) {
                    InputSetupActivity inputSetupActivity = this.B;
                    b B = inputSetupActivity.B();
                    boolean h = xq2Var2.h(inputSetupActivity);
                    Object P = xq2Var2.P();
                    if (h || P == ox0.a) {
                        u9 u9Var = new u9(0, 8, InputSetupActivity.class, inputSetupActivity, "onNavigateUp", "onNavigateUp()Z");
                        xq2Var2.l0(u9Var);
                        P = u9Var;
                    }
                    x73.b(B, (on2) P, xq2Var2, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
