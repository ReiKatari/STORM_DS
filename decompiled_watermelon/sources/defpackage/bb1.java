package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bb1  reason: default package */
/* loaded from: classes.dex */
public final class bb1 extends m22 {
    public static final bb1 R;
    public n31 L;

    /* JADX WARN: Type inference failed for: r0v0, types: [bb1, g31] */
    static {
        int i = hn6.c;
        int i2 = hn6.d;
        long j = hn6.e;
        String str = hn6.a;
        ?? g31Var = new g31();
        g31Var.L = new n31(i, i2, j, str);
        R = g31Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.g31
    public final void j0(e31 e31Var, Runnable runnable) {
        n31.p(this.L, runnable, 6);
    }

    @Override // defpackage.g31
    public final void k0(e31 e31Var, Runnable runnable) {
        n31.p(this.L, runnable, 2);
    }

    @Override // defpackage.g31
    public final g31 m0(int i) {
        jk2.m(1);
        if (1 >= hn6.c) {
            return this;
        }
        return super.m0(1);
    }

    @Override // defpackage.g31
    public final String toString() {
        return "Dispatchers.Default";
    }
}
