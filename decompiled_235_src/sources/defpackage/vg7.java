package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vg7  reason: default package */
/* loaded from: classes.dex */
public final class vg7 extends yl5 implements in6 {
    public final n34 B;
    public final long L;

    public vg7(n34 n34Var, long j) {
        this.B = n34Var;
        this.L = j;
    }

    @Override // defpackage.in6
    public final b67 b() {
        return b67.d;
    }

    @Override // defpackage.in6
    public final long b0(k80 k80Var, long j) {
        k80Var.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.yl5
    public final long h() {
        return this.L;
    }

    @Override // defpackage.yl5
    public final n34 k() {
        return this.B;
    }

    @Override // defpackage.yl5
    public final z80 n() {
        return new fe5(this);
    }

    @Override // defpackage.yl5, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
