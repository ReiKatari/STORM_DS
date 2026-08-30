package zg;

import g2.b2;
import g2.l0;
import g2.m0;
import me.magnum.melonds.R;
import y3.u0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements mc.p {
    public final /* synthetic */ int A;

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        switch (this.A) {
            case 0:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    b2.b(ij.a.Q(), l0.f.I(rVar, R.string.close), null, ((l0) rVar.j(m0.f5257a)).d(), rVar, 0, 4);
                } else {
                    rVar.R();
                }
                return y.f14813a;
            default:
                return Integer.valueOf(((u0) obj).g(((Integer) obj2).intValue()));
        }
    }
}
