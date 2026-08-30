package he;

import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ t B;
    public final /* synthetic */ List L;

    public /* synthetic */ o(t tVar, List list, int i2) {
        this.A = i2;
        this.B = tVar;
        this.L = list;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        t7.a aVar = (t7.a) obj;
        switch (this.A) {
            case 0:
                aVar.getClass();
                this.B.f6484b.J(aVar, this.L);
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                aVar.getClass();
                this.B.f6485c.J(aVar, this.L);
                break;
            case 2:
                aVar.getClass();
                this.B.f6487e.J(aVar, this.L);
                break;
            case 3:
                aVar.getClass();
                this.B.f6486d.J(aVar, this.L);
                break;
            default:
                aVar.getClass();
                this.B.f6488f.J(aVar, this.L);
                break;
        }
        return y.f14813a;
    }
}
