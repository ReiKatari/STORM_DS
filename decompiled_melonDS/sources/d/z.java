package d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z implements androidx.lifecycle.v, AutoCloseable {
    public final /* synthetic */ v A;
    public final /* synthetic */ androidx.lifecycle.r B;

    public z(v vVar, a0 a0Var, androidx.lifecycle.r rVar) {
        this.A = vVar;
        this.B = rVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.B.c(this);
    }

    @Override // androidx.lifecycle.v
    public final void d(androidx.lifecycle.x xVar, androidx.lifecycle.p pVar) {
        androidx.lifecycle.p pVar2 = androidx.lifecycle.p.ON_START;
        v vVar = this.A;
        if (pVar == pVar2) {
            vVar.g(true);
        } else if (pVar == androidx.lifecycle.p.ON_STOP) {
            vVar.g(false);
        }
        if (pVar == androidx.lifecycle.p.ON_DESTROY) {
            vVar.e();
            this.B.c(this);
        }
    }
}
