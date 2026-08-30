package b4;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q0 implements ComponentCallbacks2 {
    public final /* synthetic */ g4.d A;

    public q0(g4.d dVar) {
        this.A = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        g4.d dVar = this.A;
        synchronized (dVar) {
            dVar.f5560a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        g4.d dVar = this.A;
        synchronized (dVar) {
            dVar.f5560a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        g4.d dVar = this.A;
        synchronized (dVar) {
            dVar.f5560a.c();
        }
    }
}
