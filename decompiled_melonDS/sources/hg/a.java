package hg;

import a7.m0;
import ai.v0;
import c1.c2;
import mc.p;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
import n2.m;
import n2.r;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ BackgroundsActivity B;

    public /* synthetic */ a(BackgroundsActivity backgroundsActivity, int i2) {
        this.A = i2;
        this.B = backgroundsActivity;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        int i2 = this.A;
        y yVar = y.f14813a;
        BackgroundsActivity backgroundsActivity = this.B;
        m mVar = (m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                int i10 = BackgroundsActivity.f9488y0;
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    ij.a.u(false, v2.h.c(440963006, new a(backgroundsActivity, 1), rVar), rVar, 48, 1);
                } else {
                    rVar.R();
                }
                return yVar;
            default:
                int i11 = BackgroundsActivity.f9488y0;
                if ((intValue & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar2 = (r) mVar;
                if (rVar2.O(intValue & 1, z11)) {
                    c2.a(null, v2.h.c(-1635922308, new v0(3, pc.a.K(new m0[0], rVar2), backgroundsActivity), rVar2), rVar2, 48);
                } else {
                    rVar2.R();
                }
                return yVar;
        }
    }
}
