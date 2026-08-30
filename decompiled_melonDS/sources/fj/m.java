package fj;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class m implements e0 {
    public final e0 A;

    public m(e0 e0Var) {
        e0Var.getClass();
        this.A = e0Var;
    }

    @Override // fj.e0
    public void A(e eVar, long j2) {
        this.A.A(eVar, j2);
    }

    @Override // fj.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A.close();
    }

    @Override // fj.e0
    public final i0 f() {
        return this.A.f();
    }

    @Override // fj.e0, java.io.Flushable
    public void flush() {
        this.A.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.A + ')';
    }
}
