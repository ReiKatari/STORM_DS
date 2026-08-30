package zg;

import me.magnum.melonds.domain.model.DSiWareTitle;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ mc.p B;
    public final /* synthetic */ DSiWareTitle L;

    public /* synthetic */ k(mc.p pVar, DSiWareTitle dSiWareTitle, int i2) {
        this.A = i2;
        this.B = pVar;
        this.L = dSiWareTitle;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.A) {
            case 0:
                re.a aVar = (re.a) obj;
                aVar.getClass();
                this.B.j(this.L, aVar);
                return y.f14813a;
            default:
                re.a aVar2 = (re.a) obj;
                aVar2.getClass();
                this.B.j(this.L, aVar2);
                return y.f14813a;
        }
    }
}
