package defpackage;

import me.magnum.melonds.ui.settings.vulkandriver.VulkanDriverManagerActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ar7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ar7 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ VulkanDriverManagerActivity B;

    public /* synthetic */ ar7(VulkanDriverManagerActivity vulkanDriverManagerActivity, int i) {
        this.A = i;
        this.B = vulkanDriverManagerActivity;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        VulkanDriverManagerActivity vulkanDriverManagerActivity = this.B;
        px0 px0Var = (px0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i2 = VulkanDriverManagerActivity.B0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    bl2.e(false, n16.I(-1827491315, new ar7(vulkanDriverManagerActivity, 1), xq2Var), xq2Var, 48, 1);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                int i3 = VulkanDriverManagerActivity.B0;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z2)) {
                    qr7 qr7Var = (qr7) vulkanDriverManagerActivity.A0.getValue();
                    boolean h = xq2Var2.h(vulkanDriverManagerActivity);
                    Object P = xq2Var2.P();
                    if (h || P == ox0.a) {
                        P = new t46(vulkanDriverManagerActivity, 23);
                        xq2Var2.l0(P);
                    }
                    vy7.F(qr7Var, (on2) P, xq2Var2, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
