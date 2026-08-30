package androidx.fragment.app;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ j0 B;

    public /* synthetic */ z(j0 j0Var, int i2) {
        this.A = i2;
        this.B = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.startPostponedEnterTransition();
                return;
            default:
                this.B.callStartTransitionListener(false);
                return;
        }
    }
}
