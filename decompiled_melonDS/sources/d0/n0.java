package d0;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n0 extends d0 {
    public final /* synthetic */ int R = 1;
    public final Object X;

    public n0(y0 y0Var, o0 o0Var) {
        super(y0Var);
        this.X = new WeakReference(o0Var);
        d(new m0(0, this));
    }

    @Override // d0.d0, java.lang.AutoCloseable
    public void close() {
        switch (this.R) {
            case DSiCameraSource.FrontCamera /* 1 */:
                if (!((AtomicBoolean) this.X).getAndSet(true)) {
                    super.close();
                    return;
                }
                return;
            default:
                super.close();
                return;
        }
    }

    public n0(y0 y0Var) {
        super(y0Var);
        this.X = new AtomicBoolean(false);
    }
}
