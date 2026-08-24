package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ef1  reason: default package */
/* loaded from: classes.dex */
public final class ef1 implements defpackage.in6 {
    public final java.io.InputStream A;
    public final defpackage.tm6 B;
    public final /* synthetic */ defpackage.eb L;

    public ef1(defpackage.eb r2) {
            r1 = this;
            r1.<init>()
            r1.L = r2
            java.lang.Object r2 = r2.B
            java.net.Socket r2 = (java.net.Socket) r2
            java.io.InputStream r0 = r2.getInputStream()
            r1.A = r0
            tm6 r0 = new tm6
            r0.<init>(r2)
            r1.B = r0
            return
    }

    @Override // defpackage.in6
    public final defpackage.b67 b() {
            r0 = this;
            tm6 r0 = r0.B
            return r0
    }

    @Override // defpackage.in6
    public final long b0(defpackage.k80 r5, long r6) {
            r4 = this;
            r5.getClass()
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            return r0
        La:
            if (r2 < 0) goto L7b
            tm6 r0 = r4.B
            r0.f()
            r1 = 1
            o96 r1 = r5.j0(r1)
            int r2 = r1.c
            int r2 = 8192 - r2
            long r2 = (long) r2
            long r6 = java.lang.Math.min(r6, r2)
            int r6 = (int) r6
            r0.i()     // Catch: java.lang.AssertionError -> L6d
            java.io.InputStream r4 = r4.A     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            byte[] r7 = r1.a     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            int r2 = r1.c     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            int r4 = r4.read(r7, r2, r6)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            boolean r6 = r0.j()     // Catch: java.lang.AssertionError -> L6d
            if (r6 != 0) goto L54
            r6 = -1
            if (r4 != r6) goto L48
            int r4 = r1.b
            int r6 = r1.c
            if (r4 != r6) goto L45
            o96 r4 = r1.a()
            r5.A = r4
            defpackage.r96.a(r1)
        L45:
            r4 = -1
            return r4
        L48:
            int r6 = r1.c
            int r6 = r6 + r4
            r1.c = r6
            long r6 = r5.B
            long r0 = (long) r4
            long r6 = r6 + r0
            r5.B = r6
            return r0
        L54:
            r4 = 0
            java.io.IOException r4 = r0.k(r4)     // Catch: java.lang.AssertionError -> L6d
            throw r4     // Catch: java.lang.AssertionError -> L6d
        L5a:
            r4 = move-exception
            goto L69
        L5c:
            r4 = move-exception
            boolean r5 = r0.j()     // Catch: java.lang.Throwable -> L5a
            if (r5 != 0) goto L64
            goto L68
        L64:
            java.io.IOException r4 = r0.k(r4)     // Catch: java.lang.Throwable -> L5a
        L68:
            throw r4     // Catch: java.lang.Throwable -> L5a
        L69:
            r0.j()     // Catch: java.lang.AssertionError -> L6d
            throw r4     // Catch: java.lang.AssertionError -> L6d
        L6d:
            r4 = move-exception
            boolean r5 = defpackage.xy7.a(r4)
            if (r5 == 0) goto L7a
            java.io.IOException r5 = new java.io.IOException
            r5.<init>(r4)
            throw r5
        L7a:
            throw r4
        L7b:
            java.lang.String r4 = "byteCount < 0: "
            java.lang.String r4 = defpackage.lb1.h(r6, r4)
            defpackage.i.f(r4)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r5 = this;
            eb r0 = r5.L
            tm6 r1 = r5.B
            r1.i()
            java.lang.Object r2 = r0.L     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.lang.Object r0 = r0.B     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.net.Socket r0 = (java.net.Socket) r0     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r2.getClass()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
        L12:
            int r3 = r2.get()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r4 = r3 & 2
            if (r4 == 0) goto L1c
            r2 = 0
            goto L25
        L1c:
            r4 = r3 | 2
            boolean r3 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            if (r3 == 0) goto L12
            r2 = r4
        L25:
            if (r2 == 0) goto L59
            r3 = 3
            if (r2 == r3) goto L49
            boolean r2 = r0.isClosed()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            if (r2 != 0) goto L45
            boolean r2 = r0.isInputShutdown()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            if (r2 == 0) goto L37
            goto L45
        L37:
            r0.shutdownInput()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d java.lang.UnsupportedOperationException -> L3f
            goto L4c
        L3b:
            r5 = move-exception
            goto L69
        L3d:
            r5 = move-exception
            goto L5d
        L3f:
            java.io.InputStream r5 = r5.A     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r5.close()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            goto L4c
        L45:
            r1.j()
            return
        L49:
            r0.close()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
        L4c:
            boolean r5 = r1.j()
            if (r5 != 0) goto L53
            return
        L53:
            r5 = 0
            java.io.IOException r5 = r1.k(r5)
            throw r5
        L59:
            r1.j()
            return
        L5d:
            boolean r0 = r1.j()     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L64
            goto L68
        L64:
            java.io.IOException r5 = r1.k(r5)     // Catch: java.lang.Throwable -> L3b
        L68:
            throw r5     // Catch: java.lang.Throwable -> L3b
        L69:
            r1.j()
            throw r5
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "source("
            r0.<init>(r1)
            eb r2 = r2.L
            java.lang.Object r2 = r2.B
            java.net.Socket r2 = (java.net.Socket) r2
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
