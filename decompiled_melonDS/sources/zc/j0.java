package zc;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 extends b1 {
    public final /* synthetic */ int X;
    public final Object Y;

    public /* synthetic */ j0(int i2, Object obj) {
        this.X = i2;
        this.Y = obj;
    }

    @Override // zc.b1
    public final boolean j() {
        switch (this.X) {
            case 0:
                return false;
            case DSiCameraSource.FrontCamera /* 1 */:
                return false;
            default:
                return false;
        }
    }

    @Override // zc.b1
    public final void k(Throwable th2) {
        switch (this.X) {
            case 0:
                ((i0) this.Y).dispose();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((mc.l) this.Y).k(th2);
                return;
            default:
                Object obj = f1.A.get(i());
                boolean z10 = obj instanceof o;
                c1 c1Var = (c1) this.Y;
                if (z10) {
                    c1Var.h(p7.j.o(((o) obj).f15025a));
                    return;
                } else {
                    c1Var.h(x.D(obj));
                    return;
                }
        }
    }
}
