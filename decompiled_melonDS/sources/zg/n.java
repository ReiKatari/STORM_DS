package zg;

import me.magnum.melonds.common.camera.DSiCameraSource;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ yg.j B;
    public final /* synthetic */ mc.a L;
    public final /* synthetic */ mc.l R;
    public final /* synthetic */ mc.p X;
    public final /* synthetic */ int Y;

    public /* synthetic */ n(yg.j jVar, mc.a aVar, mc.l lVar, mc.p pVar, int i2, int i10) {
        this.A = i10;
        this.B = jVar;
        this.L = aVar;
        this.R = lVar;
        this.X = pVar;
        this.Y = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).intValue();
                a.e(this.B, this.L, this.R, this.X, (n2.m) obj, n2.s.F(this.Y | 1));
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Integer) obj2).intValue();
                a.j(this.B, this.L, this.R, this.X, (n2.m) obj, n2.s.F(this.Y | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                a.o(this.B, this.L, this.R, this.X, (n2.m) obj, n2.s.F(this.Y | 1));
                break;
        }
        return y.f14813a;
    }
}
