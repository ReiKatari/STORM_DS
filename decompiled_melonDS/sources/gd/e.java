package gd;

import ed.t;
import java.util.concurrent.Executor;
import zc.q;
import zc.r0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends r0 implements Executor {
    public static final e L = new q();
    public static final q R;

    /* JADX WARN: Type inference failed for: r0v0, types: [zc.q, gd.e] */
    static {
        l lVar = l.L;
        int i2 = t.f4468a;
        if (64 >= i2) {
            i2 = 64;
        }
        R = lVar.a0(ed.b.l(i2, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // zc.q
    public final void X(cc.g gVar, Runnable runnable) {
        R.X(gVar, runnable);
    }

    @Override // zc.q
    public final void Y(cc.g gVar, Runnable runnable) {
        R.Y(gVar, runnable);
    }

    @Override // zc.q
    public final q a0(int i2) {
        return l.L.a0(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        X(cc.h.A, runnable);
    }

    @Override // zc.q
    public final String toString() {
        return "Dispatchers.IO";
    }
}
