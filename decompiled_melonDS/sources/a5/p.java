package a5;

import android.os.Handler;
import android.os.Looper;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ m0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(m0 m0Var, int i2) {
        super(1);
        this.B = i2;
        this.L = m0Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        Looper looper;
        switch (this.B) {
            case 0:
                y3.z o5 = ((y3.z) obj).o();
                o5.getClass();
                this.L.l(o5);
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                x4.l lVar = new x4.l(((x4.l) obj).f14346a);
                m0 m0Var = this.L;
                m0Var.m1setPopupContentSizefhxjrPA(lVar);
                m0Var.m();
                return yb.y.f14813a;
            default:
                mc.a aVar = (mc.a) obj;
                m0 m0Var2 = this.L;
                Handler handler = m0Var2.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    aVar.b();
                } else {
                    Handler handler2 = m0Var2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new k0(0, aVar));
                    }
                }
                return yb.y.f14813a;
        }
    }
}
