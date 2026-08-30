package b4;

import android.view.Choreographer;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x0 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ y0 A;

    public x0(y0 y0Var) {
        this.A = y0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        this.A.R.removeCallbacks(this);
        y0.b0(this.A);
        y0 y0Var = this.A;
        synchronized (y0Var.X) {
            if (!y0Var.f2011d0) {
                return;
            }
            y0Var.f2011d0 = false;
            ArrayList arrayList = y0Var.Z;
            y0Var.Z = y0Var.f2009b0;
            y0Var.f2009b0 = arrayList;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Choreographer.FrameCallback) arrayList.get(i2)).doFrame(j2);
            }
            arrayList.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        y0.b0(this.A);
        y0 y0Var = this.A;
        synchronized (y0Var.X) {
            if (y0Var.Z.isEmpty()) {
                y0Var.L.removeFrameCallback(this);
                y0Var.f2011d0 = false;
            }
        }
    }
}
