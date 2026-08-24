package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qz2  reason: default package */
/* loaded from: classes.dex */
public final class qz2 implements java.io.Closeable {
    public static final defpackage.fd6 v0 = null;
    public final defpackage.oz2 A;
    public final java.util.LinkedHashMap B;
    public final java.lang.String L;
    public int R;
    public int X;
    public boolean Y;
    public final defpackage.qz6 Z;
    public final defpackage.pz6 d0;
    public final defpackage.pz6 e0;
    public final defpackage.pz6 f0;
    public final defpackage.d90 g0;
    public long h0;
    public long i0;
    public long j0;
    public long k0;
    public final defpackage.oe2 l0;
    public final defpackage.fd6 m0;
    public defpackage.fd6 n0;
    public final defpackage.tc7 o0;
    public long p0;
    public long q0;
    public final defpackage.bt r0;
    public final defpackage.yz2 s0;
    public final defpackage.i5 t0;
    public final java.util.LinkedHashSet u0;

    static {
            fd6 r0 = new fd6
            r0.<init>()
            r1 = 4
            r2 = 65535(0xffff, float:9.1834E-41)
            r0.b(r1, r2)
            r1 = 5
            r2 = 16384(0x4000, float:2.2959E-41)
            r0.b(r1, r2)
            defpackage.qz2.v0 = r0
            return
    }

    public qz2(defpackage.s9 r5) {
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = r5.d
            oz2 r0 = (defpackage.oz2) r0
            r4.A = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r4.B = r0
            java.lang.Object r0 = r5.c
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            if (r0 == 0) goto L8f
            r4.L = r0
            r0 = 3
            r4.X = r0
            java.lang.Object r0 = r5.a
            qz6 r0 = (defpackage.qz6) r0
            r4.Z = r0
            pz6 r2 = r0.d()
            r4.d0 = r2
            pz6 r2 = r0.d()
            r4.e0 = r2
            pz6 r0 = r0.d()
            r4.f0 = r0
            d90 r0 = defpackage.d90.B0
            r4.g0 = r0
            java.lang.Object r0 = r5.e
            oe2 r0 = (defpackage.oe2) r0
            r4.l0 = r0
            fd6 r0 = new fd6
            r0.<init>()
            r2 = 4
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            r0.b(r2, r3)
            r4.m0 = r0
            fd6 r0 = defpackage.qz2.v0
            r4.n0 = r0
            tc7 r2 = new tc7
            r3 = 0
            r2.<init>(r3)
            r4.o0 = r2
            int r0 = r0.a()
            long r2 = (long) r0
            r4.q0 = r2
            java.lang.Object r5 = r5.b
            bt r5 = (defpackage.bt) r5
            if (r5 == 0) goto L89
            r4.r0 = r5
            yz2 r0 = new yz2
            java.lang.Object r1 = r5.R
            ee5 r1 = (defpackage.ee5) r1
            r0.<init>(r1)
            r4.s0 = r0
            i5 r0 = new i5
            tz2 r1 = new tz2
            java.lang.Object r5 = r5.L
            fe5 r5 = (defpackage.fe5) r5
            r1.<init>(r5)
            r0.<init>(r4, r1)
            r4.t0 = r0
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            r4.u0 = r5
            return
        L89:
            java.lang.String r4 = "socket"
            defpackage.nb3.a0(r4)
            throw r1
        L8f:
            java.lang.String r4 = "connectionName"
            defpackage.nb3.a0(r4)
            throw r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r3 = this;
            a62 r0 = defpackage.a62.NO_ERROR
            a62 r1 = defpackage.a62.CANCEL
            r2 = 0
            r3.e(r0, r1, r2)
            return
    }

    public final void e(defpackage.a62 r4, defpackage.a62 r5, java.io.IOException r6) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            java.util.TimeZone r0 = defpackage.az7.a
            r3.n(r4)     // Catch: java.io.IOException -> Lb
        Lb:
            monitor-enter(r3)
            java.util.LinkedHashMap r4 = r3.B     // Catch: java.lang.Throwable -> L27
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L27
            r0 = 0
            if (r4 != 0) goto L29
            java.util.LinkedHashMap r4 = r3.B     // Catch: java.lang.Throwable -> L27
            java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L27
            xz2[] r1 = new defpackage.xz2[r0]     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch: java.lang.Throwable -> L27
            java.util.LinkedHashMap r1 = r3.B     // Catch: java.lang.Throwable -> L27
            r1.clear()     // Catch: java.lang.Throwable -> L27
            goto L2a
        L27:
            r4 = move-exception
            goto L54
        L29:
            r4 = 0
        L2a:
            monitor-exit(r3)
            xz2[] r4 = (defpackage.xz2[]) r4
            if (r4 == 0) goto L3a
            int r1 = r4.length
        L30:
            if (r0 >= r1) goto L3a
            r2 = r4[r0]
            r2.c(r5, r6)     // Catch: java.io.IOException -> L37
        L37:
            int r0 = r0 + 1
            goto L30
        L3a:
            yz2 r4 = r3.s0     // Catch: java.io.IOException -> L3f
            r4.close()     // Catch: java.io.IOException -> L3f
        L3f:
            bt r4 = r3.r0     // Catch: java.io.IOException -> L44
            r4.cancel()     // Catch: java.io.IOException -> L44
        L44:
            pz6 r4 = r3.d0
            r4.f()
            pz6 r4 = r3.e0
            r4.f()
            pz6 r3 = r3.f0
            r3.f()
            return
        L54:
            monitor-exit(r3)
            throw r4
    }

    public final void flush() {
            r0 = this;
            yz2 r0 = r0.s0
            r0.flush()
            return
    }

    public final defpackage.xz2 h(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r1.B     // Catch: java.lang.Throwable -> Lf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lf
            xz2 r2 = (defpackage.xz2) r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final defpackage.xz2 k(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r1.B     // Catch: java.lang.Throwable -> L12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L12
            xz2 r2 = (defpackage.xz2) r2     // Catch: java.lang.Throwable -> L12
            r1.notifyAll()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final void n(defpackage.a62 r4) {
            r3 = this;
            r4.getClass()
            yz2 r0 = r3.s0
            monitor-enter(r0)
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Le
            boolean r1 = r3.Y     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L10
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        Le:
            r3 = move-exception
            goto L22
        L10:
            r1 = 1
            r3.Y = r1     // Catch: java.lang.Throwable -> L1f
            int r1 = r3.R     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le
            yz2 r3 = r3.s0     // Catch: java.lang.Throwable -> Le
            byte[] r2 = defpackage.yy7.a     // Catch: java.lang.Throwable -> Le
            r3.n(r1, r4, r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        L1f:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L22:
            monitor-exit(r0)
            throw r3
    }

    public final void r(long r7) {
            r6 = this;
            monitor-enter(r6)
            tc7 r0 = r6.o0     // Catch: java.lang.Throwable -> L2a
            r3 = 0
            r5 = 2
            r1 = r7
            defpackage.tc7.c(r0, r1, r3, r5)     // Catch: java.lang.Throwable -> L2a
            tc7 r7 = r6.o0     // Catch: java.lang.Throwable -> L2a
            long r3 = r7.b()     // Catch: java.lang.Throwable -> L2a
            fd6 r7 = r6.m0     // Catch: java.lang.Throwable -> L2a
            int r7 = r7.a()     // Catch: java.lang.Throwable -> L2a
            int r7 = r7 / 2
            long r7 = (long) r7     // Catch: java.lang.Throwable -> L2a
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 < 0) goto L2d
            r7 = 0
            r6.x(r7, r3)     // Catch: java.lang.Throwable -> L2a
            tc7 r0 = r6.o0     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            r5 = 1
            defpackage.tc7.c(r0, r1, r3, r5)     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r0 = move-exception
            r7 = r0
            goto L39
        L2d:
            oe2 r7 = r6.l0     // Catch: java.lang.Throwable -> L2a
            tc7 r8 = r6.o0     // Catch: java.lang.Throwable -> L2a
            r7.getClass()     // Catch: java.lang.Throwable -> L2a
            r8.getClass()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r6)
            return
        L39:
            monitor-exit(r6)
            throw r7
    }

    public final void u(int r9, boolean r10, defpackage.k80 r11, long r12) {
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            yz2 r8 = r8.s0
            r8.h(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.p0     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.q0     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.B     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            yz2 r4 = r8.s0     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.L     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.p0     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.p0 = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            yz2 r4 = r8.s0
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.h(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
    }

    public final void v(int r9, defpackage.a62 r10) {
            r8 = this;
            r10.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.L
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = "] writeSynReset"
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            r52 r6 = new r52
            r6.<init>(r8, r9, r10)
            r7 = 6
            pz6 r2 = r8.d0
            r4 = 0
            defpackage.pz6.b(r2, r3, r4, r6, r7)
            return
    }

    public final void x(int r9, long r10) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.L
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = "] windowUpdate"
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            jz2 r6 = new jz2
            r6.<init>(r8, r9, r10)
            r7 = 6
            pz6 r2 = r8.d0
            r4 = 0
            defpackage.pz6.b(r2, r3, r4, r6, r7)
            return
    }
}
