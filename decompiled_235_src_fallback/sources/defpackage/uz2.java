package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uz2  reason: default package */
/* loaded from: classes.dex */
public final class uz2 implements defpackage.ui6 {
    public final boolean A;
    public final defpackage.k80 B;
    public boolean L;
    public final /* synthetic */ defpackage.xz2 R;

    public uz2(defpackage.xz2 r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.R = r1
            r0.A = r2
            k80 r1 = new k80
            r1.<init>()
            r0.B = r1
            return
    }

    @Override // defpackage.ui6
    public final void O(defpackage.k80 r4, long r5) {
            r3 = this;
            java.util.TimeZone r0 = defpackage.az7.a
            k80 r0 = r3.B
            r0.O(r4, r5)
        L7:
            long r4 = r0.B
            r1 = 16384(0x4000, double:8.095E-320)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 < 0) goto L14
            r4 = 0
            r3.e(r4)
            goto L7
        L14:
            return
    }

    @Override // defpackage.ui6
    public final defpackage.b67 b() {
            r0 = this;
            xz2 r0 = r0.R
            wz2 r0 = r0.g0
            return r0
    }

    @Override // defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r13 = this;
            xz2 r1 = r13.R
            java.util.TimeZone r0 = defpackage.az7.a
            monitor-enter(r1)
            boolean r0 = r13.L     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto Lb
            monitor-exit(r1)
            return
        Lb:
            a62 r0 = r1.f()     // Catch: java.lang.Throwable -> L5b
            r2 = 1
            if (r0 != 0) goto L14
            r0 = r2
            goto L15
        L14:
            r0 = 0
        L15:
            monitor-exit(r1)
            xz2 r1 = r13.R
            uz2 r3 = r1.e0
            boolean r3 = r3.A
            if (r3 != 0) goto L41
            k80 r3 = r13.B
            long r3 = r3.B
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L34
        L28:
            k80 r0 = r13.B
            long r0 = r0.B
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L41
            r13.e(r2)
            goto L28
        L34:
            if (r0 == 0) goto L41
            qz2 r7 = r1.B
            int r8 = r1.A
            r10 = 0
            r11 = 0
            r9 = 1
            r7.u(r8, r9, r10, r11)
        L41:
            xz2 r1 = r13.R
            monitor-enter(r1)
            r13.L = r2     // Catch: java.lang.Throwable -> L57
            r1.notifyAll()     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)
            xz2 r0 = r13.R
            qz2 r0 = r0.B
            r0.flush()
            xz2 r13 = r13.R
            r13.a()
            return
        L57:
            r0 = move-exception
            r13 = r0
            monitor-exit(r1)
            throw r13
        L5b:
            r0 = move-exception
            r13 = r0
            monitor-exit(r1)
            throw r13
    }

    public final void e(boolean r13) {
            r12 = this;
            xz2 r1 = r12.R
            monitor-enter(r1)
            wz2 r0 = r1.g0     // Catch: java.lang.Throwable -> L59
            r0.i()     // Catch: java.lang.Throwable -> L59
        L8:
            long r2 = r1.R     // Catch: java.lang.Throwable -> L2f
            long r4 = r1.X     // Catch: java.lang.Throwable -> L2f
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L32
            boolean r0 = r12.A     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L32
            boolean r0 = r12.L     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L32
            a62 r0 = r1.f()     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L32
            r1.wait()     // Catch: java.lang.InterruptedException -> L22 java.lang.Throwable -> L2f
            goto L8
        L22:
            java.lang.Thread r12 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r12.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r12 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r12.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r12     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            r12 = r0
            goto L83
        L32:
            wz2 r0 = r1.g0     // Catch: java.lang.Throwable -> L59
            r0.m()     // Catch: java.lang.Throwable -> L59
            r1.b()     // Catch: java.lang.Throwable -> L59
            long r2 = r1.X     // Catch: java.lang.Throwable -> L59
            long r4 = r1.R     // Catch: java.lang.Throwable -> L59
            long r2 = r2 - r4
            k80 r0 = r12.B     // Catch: java.lang.Throwable -> L59
            long r4 = r0.B     // Catch: java.lang.Throwable -> L59
            long r10 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L59
            long r2 = r1.R     // Catch: java.lang.Throwable -> L59
            long r2 = r2 + r10
            r1.R = r2     // Catch: java.lang.Throwable -> L59
            if (r13 == 0) goto L5c
            k80 r13 = r12.B     // Catch: java.lang.Throwable -> L59
            long r2 = r13.B     // Catch: java.lang.Throwable -> L59
            int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r13 != 0) goto L5c
            r13 = 1
        L57:
            r8 = r13
            goto L5e
        L59:
            r0 = move-exception
            r12 = r0
            goto L89
        L5c:
            r13 = 0
            goto L57
        L5e:
            monitor-exit(r1)
            xz2 r13 = r12.R
            wz2 r13 = r13.g0
            r13.i()
            xz2 r13 = r12.R     // Catch: java.lang.Throwable -> L79
            qz2 r6 = r13.B     // Catch: java.lang.Throwable -> L79
            int r7 = r13.A     // Catch: java.lang.Throwable -> L79
            k80 r9 = r12.B     // Catch: java.lang.Throwable -> L79
            r6.u(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L79
            xz2 r12 = r12.R
            wz2 r12 = r12.g0
            r12.m()
            return
        L79:
            r0 = move-exception
            r13 = r0
            xz2 r12 = r12.R
            wz2 r12 = r12.g0
            r12.m()
            throw r13
        L83:
            wz2 r13 = r1.g0     // Catch: java.lang.Throwable -> L59
            r13.m()     // Catch: java.lang.Throwable -> L59
            throw r12     // Catch: java.lang.Throwable -> L59
        L89:
            monitor-exit(r1)
            throw r12
    }

    @Override // defpackage.ui6, java.io.Flushable
    public final void flush() {
            r4 = this;
            xz2 r0 = r4.R
            java.util.TimeZone r1 = defpackage.az7.a
            monitor-enter(r0)
            r0.b()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)
        L9:
            k80 r0 = r4.B
            long r0 = r0.B
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1f
            r0 = 0
            r4.e(r0)
            xz2 r0 = r4.R
            qz2 r0 = r0.B
            r0.flush()
            goto L9
        L1f:
            return
        L20:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }
}
