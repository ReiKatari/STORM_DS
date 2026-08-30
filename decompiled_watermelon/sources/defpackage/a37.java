package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a37  reason: default package */
/* loaded from: classes.dex */
public final class a37 extends gc5 implements sb6 {
    public final cw3 B;
    public final long L;

    public a37(cw3 cw3Var, long j) {
        this.B = cw3Var;
        this.L = j;
    }

    @Override // defpackage.sb6
    public final long L(f60 f60Var, long j) {
        f60Var.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.gc5
    public final long d() {
        return this.L;
    }

    @Override // defpackage.sb6
    public final kt6 f() {
        return kt6.d;
    }

    @Override // defpackage.gc5
    public final cw3 i() {
        return this.B;
    }

    @Override // defpackage.gc5
    public final u60 p() {
        return new s45(this);
    }

    @Override // defpackage.gc5, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
