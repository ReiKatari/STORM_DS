package w;

import java.util.LinkedHashSet;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ g1 B;
    public final /* synthetic */ g1 L;

    public /* synthetic */ d1(g1 g1Var, g1 g1Var2, int i2) {
        this.A = i2;
        this.B = g1Var;
        this.L = g1Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                g1 g1Var = this.B;
                g1 g1Var2 = this.L;
                x0 x0Var = g1Var.f13927b;
                synchronized (x0Var.f14090c) {
                    ((LinkedHashSet) x0Var.f14091d).remove(g1Var);
                    ((LinkedHashSet) x0Var.f14092e).remove(g1Var);
                }
                g1Var.g(g1Var2);
                if (g1Var.f13932g != null) {
                    Objects.requireNonNull(g1Var.f13931f);
                    g1Var.f13931f.c(g1Var2);
                    return;
                }
                aj.g.y0("SyncCaptureSessionBase", "[" + g1Var + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
                return;
            default:
                g1 g1Var3 = this.B;
                g1 g1Var4 = this.L;
                Objects.requireNonNull(g1Var3.f13931f);
                g1Var3.f13931f.g(g1Var4);
                return;
        }
    }
}
