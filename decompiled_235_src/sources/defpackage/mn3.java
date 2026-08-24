package defpackage;

import me.magnum.melonds.ui.layouts.LayoutSelectorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mn3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mn3 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ LayoutSelectorActivity B;

    public /* synthetic */ mn3(LayoutSelectorActivity layoutSelectorActivity, int i) {
        this.A = i;
        this.B = layoutSelectorActivity;
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
                int i2 = LayoutSelectorActivity.B0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    bl2.e(false, n16.I(244558342, new mn3(this.B, 1), xq2Var), xq2Var, 48, 1);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                int i3 = LayoutSelectorActivity.B0;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z2)) {
                    LayoutSelectorActivity layoutSelectorActivity = this.B;
                    qn3 qn3Var = (qn3) layoutSelectorActivity.A0.getValue();
                    boolean h = xq2Var2.h(layoutSelectorActivity);
                    Object P = xq2Var2.P();
                    if (h || P == ox0.a) {
                        i4 i4Var = new i4(0, layoutSelectorActivity, LayoutSelectorActivity.class, "finish", "finish()V", 0, 0, 8);
                        xq2Var2.l0(i4Var);
                        P = i4Var;
                    }
                    np2.d(qn3Var, (on2) ((po2) P), xq2Var2, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
