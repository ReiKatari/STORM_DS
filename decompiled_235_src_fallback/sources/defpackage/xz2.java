package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xz2  reason: default package */
/* loaded from: classes.dex */
public final class xz2 implements defpackage.rm6 {
    public final int A;
    public final defpackage.qz2 B;
    public final defpackage.tc7 L;
    public long R;
    public long X;
    public final java.util.ArrayDeque Y;
    public boolean Z;
    public final defpackage.vz2 d0;
    public final defpackage.uz2 e0;
    public final defpackage.wz2 f0;
    public final defpackage.wz2 g0;
    public defpackage.a62 h0;
    public java.io.IOException i0;

    public xz2(int r4, defpackage.qz2 r5, boolean r6, boolean r7, defpackage.yw2 r8) {
            r3 = this;
            r5.getClass()
            r3.<init>()
            r3.A = r4
            r3.B = r5
            tc7 r0 = new tc7
            r0.<init>(r4)
            r3.L = r0
            fd6 r4 = r5.n0
            int r4 = r4.a()
            long r0 = (long) r4
            r3.X = r0
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            r3.Y = r4
            vz2 r0 = new vz2
            fd6 r5 = r5.m0
            int r5 = r5.a()
            long r1 = (long) r5
            r0.<init>(r3, r1, r7)
            r3.d0 = r0
            uz2 r5 = new uz2
            r5.<init>(r3, r6)
            r3.e0 = r5
            wz2 r5 = new wz2
            r5.<init>(r3)
            r3.f0 = r5
            wz2 r5 = new wz2
            r5.<init>(r3)
            r3.g0 = r5
            r5 = 0
            if (r8 == 0) goto L57
            boolean r3 = r3.g()
            if (r3 != 0) goto L51
            r4.add(r8)
            return
        L51:
            java.lang.String r3 = "locally-initiated streams shouldn't have headers yet"
            defpackage.i.m(r3)
            throw r5
        L57:
            boolean r3 = r3.g()
            if (r3 == 0) goto L5e
            return
        L5e:
            java.lang.String r3 = "remotely-initiated streams should have headers"
            defpackage.i.m(r3)
            throw r5
    }

    public final void a() {
            r2 = this;
            java.util.TimeZone r0 = defpackage.az7.a
            monitor-enter(r2)
            vz2 r0 = r2.d0     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.B     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.X     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            uz2 r0 = r2.e0     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.A     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.L     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.h()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            a62 r0 = defpackage.a62.CANCEL
            r1 = 0
            r2.c(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            qz2 r0 = r2.B
            int r2 = r2.A
            r0.k(r2)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
    }

    public final void b() {
            r2 = this;
            uz2 r0 = r2.e0
            boolean r1 = r0.L
            if (r1 != 0) goto L29
            boolean r0 = r0.A
            if (r0 != 0) goto L23
            a62 r0 = r2.f()
            if (r0 == 0) goto L22
            java.io.IOException r0 = r2.i0
            if (r0 == 0) goto L15
            goto L21
        L15:
            lr6 r0 = new lr6
            a62 r2 = r2.f()
            r2.getClass()
            r0.<init>(r2)
        L21:
            throw r0
        L22:
            return
        L23:
            java.lang.String r2 = "stream finished"
            defpackage.e41.i(r2)
            return
        L29:
            java.lang.String r2 = "stream closed"
            defpackage.e41.i(r2)
            return
    }

    public final void c(defpackage.a62 r1, java.io.IOException r2) {
            r0 = this;
            r1.getClass()
            boolean r2 = r0.d(r1, r2)
            if (r2 != 0) goto La
            return
        La:
            qz2 r2 = r0.B
            r2.getClass()
            yz2 r2 = r2.s0
            int r0 = r0.A
            r2.v(r0, r1)
            return
    }

    @Override // defpackage.rm6
    public final void cancel() {
            r1 = this;
            a62 r0 = defpackage.a62.CANCEL
            r1.e(r0)
            return
    }

    public final boolean d(defpackage.a62 r3, java.io.IOException r4) {
            r2 = this;
            java.util.TimeZone r0 = defpackage.az7.a
            monitor-enter(r2)
            a62 r0 = r2.f()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto Lc
            monitor-exit(r2)
            return r1
        Lc:
            r2.h0 = r3     // Catch: java.lang.Throwable -> L21
            r2.i0 = r4     // Catch: java.lang.Throwable -> L21
            r2.notifyAll()     // Catch: java.lang.Throwable -> L21
            vz2 r3 = r2.d0     // Catch: java.lang.Throwable -> L21
            boolean r3 = r3.B     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L23
            uz2 r3 = r2.e0     // Catch: java.lang.Throwable -> L21
            boolean r3 = r3.A     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L23
            monitor-exit(r2)
            return r1
        L21:
            r3 = move-exception
            goto L2d
        L23:
            monitor-exit(r2)
            qz2 r3 = r2.B
            int r2 = r2.A
            r3.k(r2)
            r2 = 1
            return r2
        L2d:
            monitor-exit(r2)
            throw r3
    }

    public final void e(defpackage.a62 r2) {
            r1 = this;
            r2.getClass()
            r0 = 0
            boolean r0 = r1.d(r2, r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            qz2 r0 = r1.B
            int r1 = r1.A
            r0.v(r1, r2)
            return
    }

    public final defpackage.a62 f() {
            r1 = this;
            monitor-enter(r1)
            a62 r0 = r1.h0     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final boolean g() {
            r3 = this;
            int r0 = r3.A
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 != r1) goto L9
            r0 = r1
            goto La
        L9:
            r0 = r2
        La:
            qz2 r3 = r3.B
            r3.getClass()
            if (r1 != r0) goto L12
            return r1
        L12:
            return r2
    }

    public final boolean h() {
            r3 = this;
            monitor-enter(r3)
            a62 r0 = r3.f()     // Catch: java.lang.Throwable -> L15
            r1 = 0
            if (r0 == 0) goto La
            monitor-exit(r3)
            return r1
        La:
            vz2 r0 = r3.d0     // Catch: java.lang.Throwable -> L15
            boolean r2 = r0.B     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L17
            boolean r0 = r0.X     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L27
            goto L17
        L15:
            r0 = move-exception
            goto L2a
        L17:
            uz2 r0 = r3.e0     // Catch: java.lang.Throwable -> L15
            boolean r2 = r0.A     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L21
            boolean r0 = r0.L     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L27
        L21:
            boolean r0 = r3.Z     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L27
            monitor-exit(r3)
            return r1
        L27:
            monitor-exit(r3)
            r3 = 1
            return r3
        L2a:
            monitor-exit(r3)
            throw r0
    }

    public final void i(defpackage.yw2 r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.util.TimeZone r0 = defpackage.az7.a
            monitor-enter(r2)
            boolean r0 = r2.Z     // Catch: java.lang.Throwable -> L22
            r1 = 1
            if (r0 == 0) goto L24
            java.lang.String r0 = ":status"
            java.lang.String r0 = r3.a(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L24
            java.lang.String r0 = ":method"
            java.lang.String r0 = r3.a(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            vz2 r3 = r2.d0     // Catch: java.lang.Throwable -> L22
            r3.getClass()     // Catch: java.lang.Throwable -> L22
            goto L2b
        L22:
            r3 = move-exception
            goto L43
        L24:
            r2.Z = r1     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r0 = r2.Y     // Catch: java.lang.Throwable -> L22
            r0.add(r3)     // Catch: java.lang.Throwable -> L22
        L2b:
            if (r4 == 0) goto L31
            vz2 r3 = r2.d0     // Catch: java.lang.Throwable -> L22
            r3.B = r1     // Catch: java.lang.Throwable -> L22
        L31:
            boolean r3 = r2.h()     // Catch: java.lang.Throwable -> L22
            r2.notifyAll()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r2)
            if (r3 != 0) goto L42
            qz2 r3 = r2.B
            int r2 = r2.A
            r3.k(r2)
        L42:
            return
        L43:
            monitor-exit(r2)
            throw r3
    }

    @Override // defpackage.rm6
    public final defpackage.in6 k() {
            r0 = this;
            vz2 r0 = r0.d0
            return r0
    }

    @Override // defpackage.rm6
    public final defpackage.ui6 w() {
            r0 = this;
            uz2 r0 = r0.e0
            return r0
    }
}
