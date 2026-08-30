package x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ o B;
    public final /* synthetic */ String L;

    public /* synthetic */ n(o oVar, String str, int i2) {
        this.A = i2;
        this.B = oVar;
        this.L = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.f14303b.onCameraAvailable(this.L);
                return;
            default:
                this.B.f14303b.onCameraUnavailable(this.L);
                return;
        }
    }
}
