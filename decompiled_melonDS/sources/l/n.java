package l;

import a6.f1;
import a6.x0;
import android.view.ViewGroup;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ x B;

    public /* synthetic */ n(x xVar, int i2) {
        this.A = i2;
        this.B = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.A) {
            case 0:
                x xVar = this.B;
                if ((xVar.T0 & 1) != 0) {
                    xVar.v(0);
                }
                if ((xVar.T0 & 4096) != 0) {
                    xVar.v(108);
                }
                xVar.S0 = false;
                xVar.T0 = 0;
                return;
            default:
                x xVar2 = this.B;
                xVar2.f8478q0.showAtLocation(xVar2.p0, 55, 0, 0);
                f1 f1Var = xVar2.f8480s0;
                if (f1Var != null) {
                    f1Var.b();
                }
                if (xVar2.f8481t0 && (viewGroup = xVar2.f8482u0) != null && viewGroup.isLaidOut()) {
                    xVar2.p0.setAlpha(0.0f);
                    f1 b10 = x0.b(xVar2.p0);
                    b10.a(1.0f);
                    xVar2.f8480s0 = b10;
                    b10.d(new p(0, this));
                    return;
                }
                xVar2.p0.setAlpha(1.0f);
                xVar2.p0.setVisibility(0);
                return;
        }
    }
}
