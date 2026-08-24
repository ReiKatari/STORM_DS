package defpackage;

import me.magnum.melonds.ui.cheats.CheatsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ko0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ko0 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ CheatsActivity B;
    public final /* synthetic */ vy7 L;

    public /* synthetic */ ko0(CheatsActivity cheatsActivity, vy7 vy7Var, int i) {
        this.A = i;
        this.B = cheatsActivity;
        this.L = vy7Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        vy7 vy7Var = this.L;
        CheatsActivity cheatsActivity = this.B;
        px0 px0Var = (px0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i2 = CheatsActivity.B0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    bl2.e(false, n16.I(-1275664099, new ko0(cheatsActivity, vy7Var, 1), xq2Var), xq2Var, 48, 1);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                int i3 = CheatsActivity.B0;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z2)) {
                    jw2.d((aq0) cheatsActivity.A0.getValue(), vy7Var, xq2Var2, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
