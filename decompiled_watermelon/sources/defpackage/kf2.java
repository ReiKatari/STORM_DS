package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kf2  reason: default package */
/* loaded from: classes.dex */
public abstract class kf2 implements g76 {
    public final g76 A;

    public kf2(g76 g76Var) {
        g76Var.getClass();
        this.A = g76Var;
    }

    @Override // defpackage.g76, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A.close();
    }

    @Override // defpackage.g76
    public final kt6 f() {
        return this.A.f();
    }

    @Override // defpackage.g76, java.io.Flushable
    public void flush() {
        this.A.flush();
    }

    @Override // defpackage.g76
    public void l(f60 f60Var, long j) {
        this.A.l(f60Var, j);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.A + ')';
    }
}
