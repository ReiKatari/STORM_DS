package qi;

import fj.a0;
import fj.i0;
import pi.g0;
import pi.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends g0 implements fj.g0 {
    public final t L;
    public final long R;

    public c(t tVar, long j2) {
        this.L = tVar;
        this.R = j2;
    }

    @Override // pi.g0
    public final long d() {
        return this.R;
    }

    @Override // fj.g0
    public final i0 f() {
        return i0.f4986d;
    }

    @Override // pi.g0
    public final t i() {
        return this.L;
    }

    @Override // fj.g0
    public final long k(fj.e eVar, long j2) {
        eVar.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // pi.g0
    public final fj.g m() {
        return new a0(this);
    }

    @Override // pi.g0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
