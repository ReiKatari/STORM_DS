package bd;

import i3.e0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import y3.c0;
import y3.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ u(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.A) {
            case 0:
                Throwable th2 = (Throwable) obj;
                yb.y yVar = yb.y.f14813a;
                ((zc.h) this.B).h(yVar);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                Throwable th3 = (Throwable) obj;
                ((ti.n) this.B).cancel();
                return yb.y.f14813a;
            case 2:
                Throwable th4 = (Throwable) obj;
                ((n2.f) this.B).cancel();
                return yb.y.f14813a;
            default:
                float[] fArr = ((e0) obj).f6629a;
                z zVar = (z) this.B;
                if (zVar.U()) {
                    c0.i(zVar).u(zVar, fArr);
                }
                return yb.y.f14813a;
        }
    }
}
