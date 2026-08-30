package pi;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends fj.m {
    public final /* synthetic */ f B;
    public final /* synthetic */ l2.g L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, l2.g gVar, fj.e0 e0Var) {
        super(e0Var);
        this.B = fVar;
        this.L = gVar;
    }

    @Override // fj.m, fj.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f fVar = this.B;
        l2.g gVar = this.L;
        synchronized (fVar) {
            if (gVar.f8677a) {
                return;
            }
            gVar.f8677a = true;
            super.close();
            ((e9.a) this.L.f8678b).d();
        }
    }
}
