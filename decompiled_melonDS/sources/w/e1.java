package w;

import android.hardware.camera2.CameraCaptureSession;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ g1 B;

    public /* synthetic */ e1(g1 g1Var, int i2) {
        this.A = i2;
        this.B = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                g1 g1Var = this.B;
                g1Var.g(g1Var);
                return;
            default:
                g1 g1Var2 = this.B;
                g1Var2.k("Session call super.close()");
                p7.m.l(g1Var2.f13932g, "Need to call openCaptureSession before using this API.");
                x0 x0Var = g1Var2.f13927b;
                synchronized (x0Var.f14090c) {
                    ((LinkedHashSet) x0Var.f14092e).add(g1Var2);
                }
                ((CameraCaptureSession) ((p1.a0) g1Var2.f13932g.B).B).close();
                g1Var2.f13929d.execute(new e1(g1Var2, 0));
                return;
        }
    }
}
