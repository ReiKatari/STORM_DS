package p1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ y0 B;

    public /* synthetic */ x0(y0 y0Var, int i2) {
        this.A = i2;
        this.B = y0Var;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                return Float.valueOf(this.B.f11290j0.b());
            case DSiCameraSource.FrontCamera /* 1 */:
                return Float.valueOf(this.B.f11290j0.f());
            default:
                y0 y0Var = this.B;
                return Float.valueOf(y0Var.f11290j0.a() - y0Var.f11290j0.e());
        }
    }
}
