package l1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ b3.p B;
    public final /* synthetic */ int L;

    public /* synthetic */ n(b3.p pVar, int i2, int i10) {
        this.A = 1;
        this.B = pVar;
        this.L = i10;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        int i2 = this.A;
        n2.m mVar = (n2.m) obj;
        ((Integer) obj2).getClass();
        switch (i2) {
            case 0:
                p.a(this.B, mVar, n2.s.F(this.L | 1));
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                u1.a.b(this.B, mVar, n2.s.F(1), this.L);
                break;
            case 2:
                zg.a.h(this.B, mVar, n2.s.F(this.L | 1));
                break;
            case 3:
                zg.a.g(this.B, mVar, n2.s.F(this.L | 1));
                break;
            default:
                zg.a.n(this.B, mVar, n2.s.F(this.L | 1));
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ n(b3.p pVar, int i2, int i10, byte b10) {
        this.A = i10;
        this.B = pVar;
        this.L = i2;
    }
}
