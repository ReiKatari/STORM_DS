package fj;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class n implements g0 {
    public final g0 A;

    public n(g0 g0Var) {
        g0Var.getClass();
        this.A = g0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A.close();
    }

    @Override // fj.g0
    public final i0 f() {
        return this.A.f();
    }

    @Override // fj.g0
    public long k(e eVar, long j2) {
        eVar.getClass();
        return this.A.k(eVar, j2);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.A + ')';
    }
}
