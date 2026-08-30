package d0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ r1 B;

    public /* synthetic */ n1(r1 r1Var, int i2) {
        this.A = i2;
        this.B = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.f3449e.cancel(true);
                return;
            default:
                this.B.b();
                return;
        }
    }
}
