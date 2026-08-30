package b4;

import android.os.Trace;
import android.view.MotionEvent;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ x B;

    public /* synthetic */ k(x xVar, int i2) {
        this.A = i2;
        this.B = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                zb.j jVar = this.B.f1962e0;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!jVar.isEmpty()) {
                    try {
                        ((mc.a) jVar.removeLast()).b();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            default:
                x xVar = this.B;
                xVar.f1996v1 = false;
                MotionEvent motionEvent = xVar.f1981n1;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    xVar.D(motionEvent);
                    return;
                } else {
                    a0.j.p("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
        }
    }
}
