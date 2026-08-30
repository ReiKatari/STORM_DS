package ai;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ b3.p B;

    public /* synthetic */ x(b3.p pVar, int i2, int i10) {
        this.A = i10;
        this.B = pVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        int i2 = this.A;
        n2.m mVar = (n2.m) obj;
        ((Integer) obj2).getClass();
        switch (i2) {
            case 0:
                n.f(this.B, mVar, n2.s.F(1));
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                n.g(this.B, mVar, n2.s.F(1));
                break;
            case 2:
                n.k(this.B, mVar, n2.s.F(1));
                break;
            case 3:
                ig.m.g(this.B, mVar, n2.s.F(1));
                break;
            case 4:
                lg.j.j(this.B, mVar, n2.s.F(1));
                break;
            default:
                zg.a.m(this.B, mVar, n2.s.F(1));
                break;
        }
        return yb.y.f14813a;
    }
}
