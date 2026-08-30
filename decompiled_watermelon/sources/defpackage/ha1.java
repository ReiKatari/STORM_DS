package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ha1  reason: default package */
/* loaded from: classes.dex */
public final class ha1 extends m22 implements Executor {
    public static final ha1 L = new g31();
    public static final g31 R;

    /* JADX WARN: Type inference failed for: r0v0, types: [g31, ha1] */
    static {
        t27 t27Var = t27.L;
        int i = bm6.a;
        if (64 >= i) {
            i = 64;
        }
        R = t27Var.m0(nl2.Y(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        j0(mp1.A, runnable);
    }

    @Override // defpackage.g31
    public final void j0(e31 e31Var, Runnable runnable) {
        R.j0(e31Var, runnable);
    }

    @Override // defpackage.g31
    public final void k0(e31 e31Var, Runnable runnable) {
        R.k0(e31Var, runnable);
    }

    @Override // defpackage.g31
    public final g31 m0(int i) {
        return t27.L.m0(1);
    }

    @Override // defpackage.g31
    public final String toString() {
        return "Dispatchers.IO";
    }
}
