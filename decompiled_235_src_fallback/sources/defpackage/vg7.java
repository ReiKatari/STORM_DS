package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vg7  reason: default package */
/* loaded from: classes.dex */
public final class vg7 extends defpackage.yl5 implements defpackage.in6 {
    public final defpackage.n34 B;
    public final long L;

    public vg7(defpackage.n34 r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r0.L = r2
            return
    }

    @Override // defpackage.in6
    public final defpackage.b67 b() {
            r0 = this;
            a67 r0 = defpackage.b67.d
            return r0
    }

    @Override // defpackage.in6
    public final long b0(defpackage.k80 r1, long r2) {
            r0 = this;
            r1.getClass()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.yl5, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }

    @Override // defpackage.yl5
    public final long h() {
            r2 = this;
            long r0 = r2.L
            return r0
    }

    @Override // defpackage.yl5
    public final defpackage.n34 k() {
            r0 = this;
            n34 r0 = r0.B
            return r0
    }

    @Override // defpackage.yl5
    public final defpackage.z80 n() {
            r1 = this;
            fe5 r0 = new fe5
            r0.<init>(r1)
            return r0
    }
}
