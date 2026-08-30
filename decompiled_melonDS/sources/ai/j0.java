package ai;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ b3.p B;
    public final /* synthetic */ mc.a L;
    public final /* synthetic */ int R;

    public /* synthetic */ j0(b3.p pVar, mc.a aVar, int i2, int i10) {
        this.A = i10;
        this.B = pVar;
        this.L = aVar;
        this.R = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        n2.m mVar = (n2.m) obj;
        Integer num = (Integer) obj2;
        switch (this.A) {
            case 0:
                num.getClass();
                n.l(this.B, this.L, mVar, n2.s.F(this.R | 1));
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                num.intValue();
                n.e(this.B, this.L, mVar, n2.s.F(this.R | 1));
                break;
            default:
                num.intValue();
                mh.x.c(this.B, this.L, mVar, n2.s.F(this.R | 1));
                break;
        }
        return yb.y.f14813a;
    }
}
