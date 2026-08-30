package uh;

import b4.o;
import mc.p;
import me.magnum.melonds.ui.layouts.LayoutSelectorActivity;
import n2.l;
import n2.m;
import n2.r;
import nc.i;
import v2.h;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ LayoutSelectorActivity B;

    public /* synthetic */ d(LayoutSelectorActivity layoutSelectorActivity, int i2) {
        this.A = i2;
        this.B = layoutSelectorActivity;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        int i2 = this.A;
        y yVar = y.f14813a;
        m mVar = (m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                int i10 = LayoutSelectorActivity.f9561y0;
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    ij.a.u(false, h.c(244558342, new d(this.B, 1), rVar), rVar, 48, 1);
                } else {
                    rVar.R();
                }
                return yVar;
            default:
                int i11 = LayoutSelectorActivity.f9561y0;
                if ((intValue & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar2 = (r) mVar;
                if (rVar2.O(intValue & 1, z11)) {
                    LayoutSelectorActivity layoutSelectorActivity = this.B;
                    xh.c cVar = (xh.c) layoutSelectorActivity.f9565x0.getValue();
                    boolean h2 = rVar2.h(layoutSelectorActivity);
                    Object L = rVar2.L();
                    if (h2 || L == l.f9953a) {
                        o oVar = new o(0, layoutSelectorActivity, LayoutSelectorActivity.class, "finish", "finish()V", 0, 0, 8);
                        rVar2.h0(oVar);
                        L = oVar;
                    }
                    wh.a.b(cVar, (mc.a) ((i) L), rVar2, 0);
                } else {
                    rVar2.R();
                }
                return yVar;
        }
    }
}
