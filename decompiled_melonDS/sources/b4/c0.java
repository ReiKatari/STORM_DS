package b4;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ d0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(d0 d0Var, int i2) {
        super(1);
        this.B = i2;
        this.L = d0Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.B) {
            case 0:
                View view = this.L.R;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                p2 p2Var = (p2) obj;
                if (p2Var.B.contains(p2Var)) {
                    d0 d0Var = this.L;
                    a4.e2 snapshotObserver = d0Var.R.getSnapshotObserver();
                    snapshotObserver.f194a.c(p2Var, d0Var.H0, new a4.n0(3, p2Var, d0Var));
                }
                return yb.y.f14813a;
        }
    }
}
