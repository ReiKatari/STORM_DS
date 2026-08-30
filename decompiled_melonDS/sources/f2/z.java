package f2;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ u1.v0 B;

    public /* synthetic */ z(u1.v0 v0Var, int i2) {
        this.A = i2;
        this.B = v0Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.A) {
            case 0:
                v3.t tVar = (v3.t) obj;
                this.B.e(v3.s.h(tVar, false));
                tVar.a();
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                v3.t tVar2 = (v3.t) obj;
                this.B.e(v3.s.h(tVar2, false));
                tVar2.a();
                break;
            default:
                this.B.a(((h3.b) obj).f6050a, w.f4801d);
                break;
        }
        return yb.y.f14813a;
    }
}
