package a5;

import android.window.OnBackInvokedCallback;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f438a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f439b;

    public /* synthetic */ y(int i2, Object obj) {
        this.f438a = i2;
        this.f439b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f438a) {
            case 0:
                mc.a aVar = (mc.a) this.f439b;
                if (aVar != null) {
                    aVar.b();
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((f7.j) this.f439b).a();
                return;
            case 2:
                ((l.x) this.f439b).D();
                return;
            case 3:
                ((Runnable) this.f439b).run();
                return;
            default:
                me.magnum.melonds.ui.layouteditor.b bVar = ((rh.c) this.f439b).A;
                if (bVar.f9543d0) {
                    bVar.q(true);
                    return;
                } else {
                    bVar.r();
                    return;
                }
        }
    }
}
