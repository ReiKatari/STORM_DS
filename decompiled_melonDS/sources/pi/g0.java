package pi;

import java.io.Closeable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g0 implements Closeable {
    public static final f0 B;
    public e0 A;

    /* JADX WARN: Type inference failed for: r1v0, types: [fj.e, java.lang.Object] */
    static {
        fj.h hVar = fj.h.R;
        hVar.getClass();
        ?? obj = new Object();
        obj.c0(hVar);
        B = new f0(null, hVar.A.length, obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        qi.e.b(m());
    }

    public abstract long d();

    public abstract t i();

    public abstract fj.g m();
}
