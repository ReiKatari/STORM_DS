package androidx.fragment.app;

import android.util.Log;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ e2 B;
    public final /* synthetic */ o L;

    public /* synthetic */ l(e2 e2Var, o oVar, int i2) {
        this.A = i2;
        this.B = e2Var;
        this.L = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                boolean K = g1.K(2);
                e2 e2Var = this.B;
                if (K) {
                    Log.v("FragmentManager", "Transition for operation " + e2Var + " has completed");
                }
                e2Var.c(this.L);
                return;
            default:
                boolean K2 = g1.K(2);
                e2 e2Var2 = this.B;
                if (K2) {
                    Log.v("FragmentManager", "Transition for operation " + e2Var2 + " has completed");
                }
                e2Var2.c(this.L);
                return;
        }
    }
}
