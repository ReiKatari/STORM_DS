package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lf2  reason: default package */
/* loaded from: classes.dex */
public abstract class lf2 implements sb6 {
    public final sb6 A;

    public lf2(sb6 sb6Var) {
        sb6Var.getClass();
        this.A = sb6Var;
    }

    @Override // defpackage.sb6
    public long L(f60 f60Var, long j) {
        f60Var.getClass();
        return this.A.L(f60Var, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A.close();
    }

    @Override // defpackage.sb6
    public final kt6 f() {
        return this.A.f();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.A + ')';
    }
}
