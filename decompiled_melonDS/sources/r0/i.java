package r0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ l A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int L;

    public /* synthetic */ i(l lVar, int i2, int i10) {
        this.A = lVar;
        this.B = i2;
        this.L = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        l lVar = this.A;
        int i2 = lVar.f12590i;
        int i10 = this.B;
        boolean z11 = true;
        if (i2 != i10) {
            lVar.f12590i = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = lVar.f12589h;
        int i12 = this.L;
        if (i11 != i12) {
            lVar.f12589h = i12;
        } else {
            z11 = z10;
        }
        if (z11) {
            lVar.e();
        }
    }
}
