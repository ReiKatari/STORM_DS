package lg;

import ai.b1;
import java.util.List;
import l4.c0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;
    public final /* synthetic */ mc.l L;

    public /* synthetic */ l(List list, mc.l lVar, int i2) {
        this.A = i2;
        this.B = list;
        this.L = lVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        n1.i iVar = (n1.i) obj;
        switch (this.A) {
            case 0:
                iVar.getClass();
                c0 c0Var = new c0(15);
                List list = this.B;
                iVar.q(list.size(), new b1(2, c0Var, list), new ai.j(3, list), new v2.c(802480018, true, new n(list, this.L, 0)));
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                iVar.getClass();
                List list2 = this.B;
                iVar.q(list2.size(), null, new ai.j(4, list2), new v2.c(802480018, true, new n(list2, this.L, 1)));
                break;
            default:
                iVar.getClass();
                List list3 = this.B;
                iVar.q(list3.size(), null, new ai.j(5, list3), new v2.c(802480018, true, new n(list3, this.L, 2)));
                break;
        }
        return y.f14813a;
    }
}
