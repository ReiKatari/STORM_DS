package jg;

import me.magnum.melonds.ui.cheats.CheatsActivity;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ CheatsActivity B;
    public final /* synthetic */ k0.d L;

    public /* synthetic */ a(CheatsActivity cheatsActivity, k0.d dVar, int i2) {
        this.A = i2;
        this.B = cheatsActivity;
        this.L = dVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        int i2 = this.A;
        y yVar = y.f14813a;
        k0.d dVar = this.L;
        CheatsActivity cheatsActivity = this.B;
        n2.m mVar = (n2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                int i10 = CheatsActivity.f9493y0;
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    ij.a.u(false, v2.h.c(-1275664099, new a(cheatsActivity, dVar, 1), rVar), rVar, 48, 1);
                } else {
                    rVar.R();
                }
                return yVar;
            default:
                int i11 = CheatsActivity.f9493y0;
                if ((intValue & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar;
                if (rVar2.O(intValue & 1, z11)) {
                    lg.j.b((u) cheatsActivity.f9497x0.getValue(), dVar, rVar2, 0);
                } else {
                    rVar2.R();
                }
                return yVar;
        }
    }
}
