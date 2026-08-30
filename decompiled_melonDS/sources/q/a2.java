package q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a2 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ d2 B;

    public /* synthetic */ a2(d2 d2Var, int i2) {
        this.A = i2;
        this.B = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                r1 r1Var = this.B.L;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                d2 d2Var = this.B;
                r1 r1Var2 = d2Var.L;
                if (r1Var2 != null && r1Var2.isAttachedToWindow() && d2Var.L.getCount() > d2Var.L.getChildCount() && d2Var.L.getChildCount() <= d2Var.f11870g0) {
                    d2Var.f11882t0.setInputMethodMode(2);
                    d2Var.c();
                    return;
                }
                return;
        }
    }
}
