package defpackage;

import me.magnum.melonds.ui.layouts.LayoutListActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: em3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class em3 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ LayoutListActivity B;

    public /* synthetic */ em3(LayoutListActivity layoutListActivity, int i) {
        this.A = i;
        this.B = layoutListActivity;
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
                int i2 = LayoutListActivity.B0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    bl2.e(false, n16.I(1573839142, new em3(this.B, 1), xq2Var), xq2Var, 48, 1);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                int i3 = LayoutListActivity.B0;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z2)) {
                    LayoutListActivity layoutListActivity = this.B;
                    eo3 eo3Var = (eo3) layoutListActivity.A0.getValue();
                    boolean h = xq2Var2.h(layoutListActivity);
                    Object P = xq2Var2.P();
                    if (h || P == ox0.a) {
                        i4 i4Var = new i4(0, layoutListActivity, LayoutListActivity.class, "finish", "finish()V", 0, 0, 7);
                        xq2Var2.l0(i4Var);
                        P = i4Var;
                    }
                    np2.d(eo3Var, (on2) ((po2) P), xq2Var2, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
