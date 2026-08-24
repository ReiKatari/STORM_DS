package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vz2  reason: default package */
/* loaded from: classes.dex */
public final class vz2 implements defpackage.in6 {
    public final long A;
    public boolean B;
    public final defpackage.k80 L;
    public final defpackage.k80 R;
    public boolean X;
    public final /* synthetic */ defpackage.xz2 Y;

    public vz2(defpackage.xz2 r1, long r2, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.Y = r1
            r0.A = r2
            r0.B = r4
            k80 r1 = new k80
            r1.<init>()
            r0.L = r1
            k80 r1 = new k80
            r1.<init>()
            r0.R = r1
            return
    }

    @Override // defpackage.in6
    public final defpackage.b67 b() {
            r0 = this;
            xz2 r0 = r0.Y
            wz2 r0 = r0.f0
            return r0
    }

    @Override // defpackage.in6
    public final long b0(defpackage.k80 r28, long r29) {
            r27 = this;
            r0 = r27
            r1 = r29
            r28.getClass()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto Lf5
        Ld:
            xz2 r5 = r0.Y
            monitor-enter(r5)
            qz2 r6 = r5.B     // Catch: java.lang.Throwable -> L2d
            r6.getClass()     // Catch: java.lang.Throwable -> L2d
            uz2 r6 = r5.e0     // Catch: java.lang.Throwable -> L2d
            boolean r7 = r6.L     // Catch: java.lang.Throwable -> L2d
            r8 = 1
            r9 = 0
            if (r7 != 0) goto L24
            boolean r6 = r6.A     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L22
            goto L24
        L22:
            r6 = r9
            goto L25
        L24:
            r6 = r8
        L25:
            if (r6 == 0) goto L30
            wz2 r7 = r5.f0     // Catch: java.lang.Throwable -> L2d
            r7.i()     // Catch: java.lang.Throwable -> L2d
            goto L30
        L2d:
            r0 = move-exception
            goto Lf3
        L30:
            a62 r7 = r5.f()     // Catch: java.lang.Throwable -> L4b
            if (r7 == 0) goto L4e
            boolean r7 = r0.B     // Catch: java.lang.Throwable -> L4b
            if (r7 != 0) goto L4e
            java.io.IOException r7 = r5.i0     // Catch: java.lang.Throwable -> L4b
            if (r7 != 0) goto L4f
            lr6 r7 = new lr6     // Catch: java.lang.Throwable -> L4b
            a62 r10 = r5.f()     // Catch: java.lang.Throwable -> L4b
            r10.getClass()     // Catch: java.lang.Throwable -> L4b
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L4b
            goto L4f
        L4b:
            r0 = move-exception
            goto Leb
        L4e:
            r7 = 0
        L4f:
            boolean r10 = r0.X     // Catch: java.lang.Throwable -> L4b
            if (r10 != 0) goto Le3
            k80 r10 = r0.R     // Catch: java.lang.Throwable -> L4b
            long r11 = r10.B     // Catch: java.lang.Throwable -> L4b
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            r14 = -1
            if (r13 <= 0) goto La4
            long r11 = java.lang.Math.min(r1, r11)     // Catch: java.lang.Throwable -> L4b
            r13 = r28
            long r17 = r10.b0(r13, r11)     // Catch: java.lang.Throwable -> L4b
            tc7 r8 = r5.L     // Catch: java.lang.Throwable -> L4b
            r19 = 0
            r21 = 2
            r16 = r8
            defpackage.tc7.c(r16, r17, r19, r21)     // Catch: java.lang.Throwable -> L4b
            tc7 r8 = r5.L     // Catch: java.lang.Throwable -> L4b
            long r10 = r8.b()     // Catch: java.lang.Throwable -> L4b
            if (r7 != 0) goto La0
            qz2 r8 = r5.B     // Catch: java.lang.Throwable -> L4b
            fd6 r8 = r8.m0     // Catch: java.lang.Throwable -> L4b
            int r8 = r8.a()     // Catch: java.lang.Throwable -> L4b
            int r8 = r8 / 2
            r25 = r3
            long r3 = (long) r8     // Catch: java.lang.Throwable -> L4b
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 < 0) goto La2
            qz2 r3 = r5.B     // Catch: java.lang.Throwable -> L4b
            int r4 = r5.A     // Catch: java.lang.Throwable -> L4b
            r3.x(r4, r10)     // Catch: java.lang.Throwable -> L4b
            tc7 r3 = r5.L     // Catch: java.lang.Throwable -> L4b
            r20 = 0
            r24 = 1
            r19 = r3
            r22 = r10
            defpackage.tc7.c(r19, r20, r22, r24)     // Catch: java.lang.Throwable -> L4b
            goto La2
        La0:
            r25 = r3
        La2:
            r8 = r9
            goto Lc3
        La4:
            r13 = r28
            r25 = r3
            boolean r3 = r0.B     // Catch: java.lang.Throwable -> L4b
            if (r3 != 0) goto Lc1
            if (r7 != 0) goto Lc1
            r5.wait()     // Catch: java.lang.Throwable -> L4b java.lang.InterruptedException -> Lb4
        Lb1:
            r17 = r14
            goto Lc3
        Lb4:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L4b
            r0.interrupt()     // Catch: java.lang.Throwable -> L4b
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L4b
            r0.<init>()     // Catch: java.lang.Throwable -> L4b
            throw r0     // Catch: java.lang.Throwable -> L4b
        Lc1:
            r8 = r9
            goto Lb1
        Lc3:
            if (r6 == 0) goto Lca
            wz2 r3 = r5.f0     // Catch: java.lang.Throwable -> L2d
            r3.m()     // Catch: java.lang.Throwable -> L2d
        Lca:
            monitor-exit(r5)
            xz2 r3 = r0.Y
            qz2 r3 = r3.B
            oe2 r3 = r3.l0
            r3.getClass()
            if (r8 == 0) goto Lda
            r3 = r25
            goto Ld
        Lda:
            int r0 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r0 == 0) goto Ldf
            return r17
        Ldf:
            if (r7 != 0) goto Le2
            return r14
        Le2:
            throw r7
        Le3:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "stream closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4b
            throw r0     // Catch: java.lang.Throwable -> L4b
        Leb:
            if (r6 == 0) goto Lf2
            wz2 r1 = r5.f0     // Catch: java.lang.Throwable -> L2d
            r1.m()     // Catch: java.lang.Throwable -> L2d
        Lf2:
            throw r0     // Catch: java.lang.Throwable -> L2d
        Lf3:
            monitor-exit(r5)
            throw r0
        Lf5:
            r25 = r3
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r0 = defpackage.lb1.h(r1, r0)
            defpackage.i.f(r0)
            return r25
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r4 = this;
            xz2 r0 = r4.Y
            monitor-enter(r0)
            r1 = 1
            r4.X = r1     // Catch: java.lang.Throwable -> L26
            k80 r1 = r4.R     // Catch: java.lang.Throwable -> L26
            long r2 = r1.B     // Catch: java.lang.Throwable -> L26
            r1.e()     // Catch: java.lang.Throwable -> L26
            r0.notifyAll()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L20
            xz2 r0 = r4.Y
            java.util.TimeZone r1 = defpackage.az7.a
            qz2 r0 = r0.B
            r0.r(r2)
        L20:
            xz2 r4 = r4.Y
            r4.a()
            return
        L26:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }
}
