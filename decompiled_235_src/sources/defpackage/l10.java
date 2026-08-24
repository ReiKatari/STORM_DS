package defpackage;

import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l10  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class l10 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ BackgroundsActivity B;

    public /* synthetic */ l10(BackgroundsActivity backgroundsActivity, int i) {
        this.A = i;
        this.B = backgroundsActivity;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        BackgroundsActivity backgroundsActivity = this.B;
        px0 px0Var = (px0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i2 = BackgroundsActivity.B0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    bl2.e(false, n16.I(440963006, new l10(backgroundsActivity, 1), xq2Var), xq2Var, 48, 1);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                int i3 = BackgroundsActivity.B0;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z2)) {
                    vg6.a(null, n16.I(-1635922308, new l4(1, yh2.I(new qd4[0], xq2Var2), backgroundsActivity), xq2Var2), xq2Var2, 48);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
