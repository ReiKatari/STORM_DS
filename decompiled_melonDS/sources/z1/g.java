package z1;

import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.s;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ b3.p B;
    public final /* synthetic */ v2.c L;
    public final /* synthetic */ int R;

    public /* synthetic */ g(b3.p pVar, v2.c cVar, int i2, int i10) {
        this.A = i10;
        this.B = pVar;
        this.L = cVar;
        this.R = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        int i2 = this.A;
        n2.m mVar = (n2.m) obj;
        ((Integer) obj2).getClass();
        switch (i2) {
            case 0:
                h.c(this.B, this.L, mVar, s.F(this.R | 1));
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                h.d(this.B, this.L, mVar, s.F(this.R | 1));
                break;
            case 2:
                k.d(this.B, this.L, mVar, s.F(this.R | 1));
                break;
            case 3:
                h.b(this.B, this.L, mVar, s.F(this.R | 1));
                break;
            default:
                h.a(this.B, this.L, mVar, s.F(this.R | 1));
                break;
        }
        return y.f14813a;
    }
}
