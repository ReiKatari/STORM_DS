package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: va2  reason: default package */
/* loaded from: classes.dex */
public final class va2 implements defpackage.in6 {
    public final defpackage.wf3 A;
    public long B;
    public boolean L;

    public va2(defpackage.wf3 r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.in6
    public final defpackage.b67 b() {
            r0 = this;
            a67 r0 = defpackage.b67.d
            return r0
    }

    @Override // defpackage.in6
    public final long b0(defpackage.k80 r17, long r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r1.getClass()
            boolean r4 = r0.L
            r5 = 0
            if (r4 != 0) goto L93
            wf3 r4 = r0.A
            long r7 = r0.B
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 < 0) goto L89
            long r2 = r2 + r7
            r5 = r7
        L19:
            int r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r9 >= 0) goto L7c
            r9 = 1
            o96 r9 = r1.j0(r9)
            byte[] r12 = r9.a
            int r13 = r9.c
            long r14 = r2 - r5
            r18 = -1
            int r10 = 8192 - r13
            long r10 = (long) r10
            long r10 = java.lang.Math.min(r14, r10)
            int r10 = (int) r10
            monitor-enter(r4)
            r12.getClass()     // Catch: java.lang.Throwable -> L51
            java.io.RandomAccessFile r11 = r4.R     // Catch: java.lang.Throwable -> L51
            r11.seek(r5)     // Catch: java.lang.Throwable -> L51
            r11 = 0
        L3c:
            if (r11 >= r10) goto L53
            java.io.RandomAccessFile r15 = r4.R     // Catch: java.lang.Throwable -> L51
            int r14 = r10 - r11
            int r14 = r15.read(r12, r13, r14)     // Catch: java.lang.Throwable -> L51
            r15 = -1
            if (r14 != r15) goto L4f
            if (r11 != 0) goto L53
            monitor-exit(r4)
            r11 = -1
        L4d:
            r15 = -1
            goto L55
        L4f:
            int r11 = r11 + r14
            goto L3c
        L51:
            r0 = move-exception
            goto L7a
        L53:
            monitor-exit(r4)
            goto L4d
        L55:
            if (r11 != r15) goto L6d
            int r2 = r9.b
            int r3 = r9.c
            if (r2 != r3) goto L66
            o96 r2 = r9.a()
            r1.A = r2
            defpackage.r96.a(r9)
        L66:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L7e
            r5 = r18
            goto L7f
        L6d:
            int r10 = r9.c
            int r10 = r10 + r11
            r9.c = r10
            long r9 = (long) r11
            long r5 = r5 + r9
            long r11 = r1.B
            long r11 = r11 + r9
            r1.B = r11
            goto L19
        L7a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            throw r0
        L7c:
            r18 = -1
        L7e:
            long r5 = r5 - r7
        L7f:
            int r1 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r1 == 0) goto L88
            long r1 = r0.B
            long r1 = r1 + r5
            r0.B = r1
        L88:
            return r5
        L89:
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r0 = defpackage.lb1.h(r2, r0)
            defpackage.i.f(r0)
            return r5
        L93:
            java.lang.String r0 = "closed"
            defpackage.i.m(r0)
            return r5
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            wf3 r0 = r2.A
            boolean r1 = r2.L
            if (r1 == 0) goto L7
            return
        L7:
            r1 = 1
            r2.L = r1
            java.util.concurrent.locks.ReentrantLock r2 = r0.L
            r2.lock()
            int r1 = r0.B     // Catch: java.lang.Throwable -> L2a
            int r1 = r1 + (-1)
            r0.B = r1     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L2c
            boolean r1 = r0.A     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L1c
            goto L2c
        L1c:
            r2.unlock()
            monitor-enter(r0)
            java.io.RandomAccessFile r2 = r0.R     // Catch: java.lang.Throwable -> L27
            r2.close()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)
            return
        L27:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r2
        L2a:
            r0 = move-exception
            goto L30
        L2c:
            r2.unlock()
            return
        L30:
            r2.unlock()
            throw r0
    }
}
