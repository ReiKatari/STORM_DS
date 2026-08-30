package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: np0  reason: default package */
/* loaded from: classes.dex */
public final class np0 implements AutoCloseable, o31 {
    public final e31 A;

    public np0(e31 e31Var) {
        e31Var.getClass();
        this.A = e31Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ln2.t(this.A, null);
    }

    @Override // defpackage.o31
    public final e31 w() {
        return this.A;
    }
}
