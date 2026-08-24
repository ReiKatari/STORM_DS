package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: de1  reason: default package */
/* loaded from: classes.dex */
public final class de1 extends e72 implements Executor {
    public static final de1 L = new n61();
    public static final n61 R;

    /* JADX WARN: Type inference failed for: r0v0, types: [de1, n61] */
    static {
        og7 og7Var = og7.L;
        int i = xx6.a;
        if (64 >= i) {
            i = 64;
        }
        R = og7Var.m0(bl2.V(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        j0(vt1.A, runnable);
    }

    @Override // defpackage.n61
    public final void j0(l61 l61Var, Runnable runnable) {
        R.j0(l61Var, runnable);
    }

    @Override // defpackage.n61
    public final void k0(l61 l61Var, Runnable runnable) {
        R.k0(l61Var, runnable);
    }

    @Override // defpackage.n61
    public final n61 m0(int i) {
        return og7.L.m0(1);
    }

    @Override // defpackage.n61
    public final String toString() {
        return "Dispatchers.IO";
    }
}
