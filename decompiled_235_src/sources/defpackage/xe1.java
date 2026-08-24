package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xe1  reason: default package */
/* loaded from: classes.dex */
public final class xe1 extends e72 {
    public static final xe1 R;
    public v61 L;

    /* JADX WARN: Type inference failed for: r0v0, types: [xe1, n61] */
    static {
        int i = sz6.c;
        int i2 = sz6.d;
        long j = sz6.e;
        String str = sz6.a;
        ?? n61Var = new n61();
        n61Var.L = new v61(i, i2, j, str);
        R = n61Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.n61
    public final void j0(l61 l61Var, Runnable runnable) {
        v61.k(this.L, runnable, 6);
    }

    @Override // defpackage.n61
    public final void k0(l61 l61Var, Runnable runnable) {
        v61.k(this.L, runnable, 2);
    }

    @Override // defpackage.n61
    public final n61 m0(int i) {
        kn2.u(1);
        if (1 >= sz6.c) {
            return this;
        }
        return super.m0(1);
    }

    @Override // defpackage.n61
    public final String toString() {
        return "Dispatchers.Default";
    }
}
