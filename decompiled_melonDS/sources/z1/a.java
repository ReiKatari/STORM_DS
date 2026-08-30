package z1;

import a5.k0;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.h0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ f B;

    public /* synthetic */ a(f fVar, int i2) {
        this.A = i2;
        this.B = fVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        Looper looper;
        switch (this.A) {
            case 0:
                mc.a aVar = (mc.a) obj;
                View view = this.B.f14867a;
                Handler handler = view.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    aVar.b();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new k0(3, aVar));
                    }
                }
                return y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                ActionMode actionMode = this.B.f14874h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return y.f14813a;
            case 2:
                ActionMode actionMode2 = this.B.f14874h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return y.f14813a;
            default:
                h0 h0Var = (h0) obj;
                f fVar = this.B;
                fVar.f14871e.d();
                return new a5.a(11, fVar);
        }
    }
}
