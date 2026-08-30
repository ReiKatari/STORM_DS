package mg;

import mc.p;
import n2.s;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ l B;
    public final /* synthetic */ mc.a L;
    public final /* synthetic */ mc.l R;

    public /* synthetic */ h(l lVar, mc.a aVar, mc.l lVar2, int i2, int i10) {
        this.A = i10;
        this.B = lVar;
        this.L = aVar;
        this.R = lVar2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        int i2 = this.A;
        n2.m mVar = (n2.m) obj;
        ((Integer) obj2).getClass();
        switch (i2) {
            case 0:
                n.d(this.B, this.L, this.R, mVar, s.F(1));
                break;
            default:
                n.c(this.B, this.L, this.R, mVar, s.F(1));
                break;
        }
        return y.f14813a;
    }
}
