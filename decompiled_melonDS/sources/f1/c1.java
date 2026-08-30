package f1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ d1 B;

    public /* synthetic */ c1(d1 d1Var, int i2) {
        this.A = i2;
        this.B = d1Var;
    }

    @Override // mc.a
    public final Object b() {
        long j2;
        switch (this.A) {
            case 0:
                this.B.Q0();
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                return new h3.b(this.B.f4538q0);
            default:
                y3.z zVar = (y3.z) this.B.f4537o0.getValue();
                if (zVar != null) {
                    j2 = zVar.a0(0L);
                } else {
                    j2 = 9205357640488583168L;
                }
                return new h3.b(j2);
        }
    }
}
