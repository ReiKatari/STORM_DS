package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: df1  reason: default package */
/* loaded from: classes.dex */
public final class df1 implements defpackage.ui6 {
    public final java.io.OutputStream A;
    public final defpackage.tm6 B;
    public final /* synthetic */ defpackage.eb L;

    public df1(defpackage.eb r2) {
            r1 = this;
            r1.<init>()
            r1.L = r2
            java.lang.Object r2 = r2.B
            java.net.Socket r2 = (java.net.Socket) r2
            java.io.OutputStream r0 = r2.getOutputStream()
            r1.A = r0
            tm6 r0 = new tm6
            r0.<init>(r2)
            r1.B = r0
            return
    }

    @Override // defpackage.ui6
    public final void O(defpackage.k80 r7, long r8) {
            r6 = this;
            long r0 = r7.B
            r2 = 0
            r4 = r8
            defpackage.hf.D(r0, r2, r4)
        L8:
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L6a
            tm6 r1 = r6.B
            r1.f()
            o96 r0 = r7.A
            r0.getClass()
            int r2 = r0.c
            int r3 = r0.b
            int r2 = r2 - r3
            long r2 = (long) r2
            long r2 = java.lang.Math.min(r8, r2)
            int r2 = (int) r2
            r1.i()
            java.io.OutputStream r3 = r6.A     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            byte[] r4 = r0.a     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            int r5 = r0.b     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            r3.write(r4, r5, r2)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            boolean r3 = r1.j()
            if (r3 != 0) goto L4f
            int r1 = r0.b
            int r1 = r1 + r2
            r0.b = r1
            long r2 = (long) r2
            long r8 = r8 - r2
            long r4 = r7.B
            long r4 = r4 - r2
            r7.B = r4
            int r2 = r0.c
            if (r1 != r2) goto L8
            o96 r1 = r0.a()
            r7.A = r1
            defpackage.r96.a(r0)
            goto L8
        L4f:
            r6 = 0
            java.io.IOException r6 = r1.k(r6)
            throw r6
        L55:
            r0 = move-exception
            r6 = r0
            goto L66
        L58:
            r0 = move-exception
            r6 = r0
            boolean r7 = r1.j()     // Catch: java.lang.Throwable -> L55
            if (r7 != 0) goto L61
            goto L65
        L61:
            java.io.IOException r6 = r1.k(r6)     // Catch: java.lang.Throwable -> L55
        L65:
            throw r6     // Catch: java.lang.Throwable -> L55
        L66:
            r1.j()
            throw r6
        L6a:
            return
    }

    @Override // defpackage.ui6
    public final defpackage.b67 b() {
            r0 = this;
            tm6 r0 = r0.B
            return r0
    }

    @Override // defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r5 = this;
            java.io.OutputStream r0 = r5.A
            eb r1 = r5.L
            tm6 r5 = r5.B
            r5.i()
            java.lang.Object r2 = r1.L     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            java.lang.Object r1 = r1.B     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            java.net.Socket r1 = (java.net.Socket) r1     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            r2.getClass()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
        L14:
            int r3 = r2.get()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            r4 = r3 & 1
            if (r4 == 0) goto L1e
            r2 = 0
            goto L27
        L1e:
            r4 = r3 | 1
            boolean r3 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            if (r3 == 0) goto L14
            r2 = r4
        L27:
            if (r2 == 0) goto L5c
            r3 = 3
            if (r2 == r3) goto L4c
            boolean r2 = r1.isClosed()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            if (r2 != 0) goto L48
            boolean r2 = r1.isOutputShutdown()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            if (r2 == 0) goto L39
            goto L48
        L39:
            r0.flush()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            r1.shutdownOutput()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42 java.lang.UnsupportedOperationException -> L44
            goto L4f
        L40:
            r0 = move-exception
            goto L6c
        L42:
            r0 = move-exception
            goto L60
        L44:
            r0.close()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            goto L4f
        L48:
            r5.j()
            return
        L4c:
            r1.close()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
        L4f:
            boolean r0 = r5.j()
            if (r0 != 0) goto L56
            return
        L56:
            r0 = 0
            java.io.IOException r5 = r5.k(r0)
            throw r5
        L5c:
            r5.j()
            return
        L60:
            boolean r1 = r5.j()     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L67
            goto L6b
        L67:
            java.io.IOException r0 = r5.k(r0)     // Catch: java.lang.Throwable -> L40
        L6b:
            throw r0     // Catch: java.lang.Throwable -> L40
        L6c:
            r5.j()
            throw r0
    }

    @Override // defpackage.ui6, java.io.Flushable
    public final void flush() {
            r2 = this;
            tm6 r0 = r2.B
            r0.i()
            java.io.OutputStream r2 = r2.A     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            r2.flush()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            boolean r2 = r0.j()
            if (r2 != 0) goto L11
            return
        L11:
            r2 = 0
            java.io.IOException r2 = r0.k(r2)
            throw r2
        L17:
            r2 = move-exception
            goto L26
        L19:
            r2 = move-exception
            boolean r1 = r0.j()     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L21
            goto L25
        L21:
            java.io.IOException r2 = r0.k(r2)     // Catch: java.lang.Throwable -> L17
        L25:
            throw r2     // Catch: java.lang.Throwable -> L17
        L26:
            r0.j()
            throw r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "sink("
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
