package defpackage;

import me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p91  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class p91 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ DSiWareManagerActivity B;

    public /* synthetic */ p91(DSiWareManagerActivity dSiWareManagerActivity, int i) {
        this.A = i;
        this.B = dSiWareManagerActivity;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        DSiWareManagerActivity dSiWareManagerActivity = this.B;
        px0 px0Var = (px0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i2 = DSiWareManagerActivity.B0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    bl2.e(false, n16.I(-1462418469, new p91(dSiWareManagerActivity, 1), xq2Var), xq2Var, 48, 1);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                int i3 = DSiWareManagerActivity.B0;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z2)) {
                    la1 la1Var = (la1) dSiWareManagerActivity.A0.getValue();
                    boolean h = xq2Var2.h(dSiWareManagerActivity);
                    Object P = xq2Var2.P();
                    if (h || P == ox0.a) {
                        P = new a5(dSiWareManagerActivity, 22);
                        xq2Var2.l0(P);
                    }
                    ak7.q(la1Var, (on2) P, xq2Var2, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
