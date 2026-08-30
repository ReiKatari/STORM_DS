package b4;

import android.view.Choreographer;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 implements Choreographer.FrameCallback {
    public final /* synthetic */ zc.h A;
    public final /* synthetic */ mc.l B;

    public z0(zc.h hVar, a1 a1Var, mc.l lVar) {
        this.A = hVar;
        this.B = lVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        Object kVar;
        try {
            kVar = this.B.k(Long.valueOf(j2));
        } catch (Throwable th2) {
            kVar = new yb.k(th2);
        }
        this.A.h(kVar);
    }
}
