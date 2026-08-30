package gd;

import zc.q;
import zc.r0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends r0 {
    public static final f R;
    public d L;

    /* JADX WARN: Type inference failed for: r0v0, types: [zc.q, gd.f] */
    static {
        int i2 = k.f5648c;
        int i10 = k.f5649d;
        long j2 = k.f5650e;
        String str = k.f5646a;
        ?? qVar = new q();
        qVar.L = new d(i2, i10, j2, str);
        R = qVar;
    }

    @Override // zc.q
    public final void X(cc.g gVar, Runnable runnable) {
        d.m(this.L, runnable, 6);
    }

    @Override // zc.q
    public final void Y(cc.g gVar, Runnable runnable) {
        d.m(this.L, runnable, 2);
    }

    @Override // zc.q
    public final q a0(int i2) {
        ed.b.a(1);
        if (1 >= k.f5648c) {
            return this;
        }
        return super.a0(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // zc.q
    public final String toString() {
        return "Dispatchers.Default";
    }
}
