package b4;

import android.os.Handler;
import android.os.Looper;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ x L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(x xVar, int i2) {
        super(1);
        this.B = i2;
        this.L = xVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        Looper looper;
        switch (this.B) {
            case 0:
                ((g3.p) this.L.getFocusOwner()).g(((g3.f) obj).f5505a, false);
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                mc.a aVar = (mc.a) obj;
                x xVar = this.L;
                xVar.getUncaughtExceptionHandler$ui();
                Handler handler = xVar.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    aVar.b();
                } else {
                    Handler handler2 = xVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new a5.k0(2, aVar));
                    }
                }
                return yb.y.f14813a;
            default:
                x xVar2 = this.L;
                return new t0(xVar2, xVar2.getTextInputService(), (zc.u) obj);
        }
    }
}
