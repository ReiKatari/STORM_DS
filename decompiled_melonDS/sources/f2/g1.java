package f2;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ mc.a B;

    public /* synthetic */ g1(int i2, mc.a aVar) {
        this.A = i2;
        this.B = aVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.A) {
            case 0:
                x4.c cVar = (x4.c) obj;
                return (h3.b) this.B.b();
            case DSiCameraSource.FrontCamera /* 1 */:
                x4.c cVar2 = (x4.c) obj;
                return new x4.j((pc.a.M(((Number) this.B.b()).floatValue()) << 32) | (0 & 4294967295L));
            case 2:
                ((t7.a) obj).getClass();
                return this.B.b();
            case 3:
                ((u1.m0) obj).getClass();
                this.B.b();
                return yb.y.f14813a;
            default:
                ((h.a) obj).getClass();
                this.B.b();
                return yb.y.f14813a;
        }
    }
}
