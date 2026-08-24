package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kk1  reason: default package */
/* loaded from: classes.dex */
public final class kk1 implements java.io.Closeable, java.io.Flushable {
    public static final defpackage.xh5 p0 = null;
    public static final java.lang.String q0 = null;
    public static final java.lang.String r0 = null;
    public static final java.lang.String s0 = null;
    public static final java.lang.String t0 = null;
    public final defpackage.lt4 A;
    public final defpackage.ik1 B;
    public final long L;
    public final defpackage.lt4 R;
    public final defpackage.lt4 X;
    public final defpackage.lt4 Y;
    public long Z;
    public defpackage.ee5 d0;
    public final java.util.LinkedHashMap e0;
    public int f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public long m0;
    public final defpackage.pz6 n0;
    public final defpackage.hk1 o0;

    static {
            xh5 r0 = new xh5
            java.lang.String r1 = "[a-z0-9_-]{1,120}"
            r0.<init>(r1)
            defpackage.kk1.p0 = r0
            java.lang.String r0 = "CLEAN"
            defpackage.kk1.q0 = r0
            java.lang.String r0 = "DIRTY"
            defpackage.kk1.r0 = r0
            java.lang.String r0 = "REMOVE"
            defpackage.kk1.s0 = r0
            java.lang.String r0 = "READ"
            defpackage.kk1.t0 = r0
            return
    }

    public kk1(defpackage.db2 r4, defpackage.lt4 r5, long r6, defpackage.qz6 r8) {
            r3 = this;
            r4.getClass()
            r8.getClass()
            r3.<init>()
            r3.A = r5
            ik1 r0 = new ik1
            r0.<init>(r4)
            r3.B = r0
            r3.L = r6
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r0 = 1061158912(0x3f400000, float:0.75)
            r1 = 1
            r2 = 0
            r4.<init>(r2, r0, r1)
            r3.e0 = r4
            pz6 r4 = r8.d()
            r3.n0 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = defpackage.az7.b
            java.lang.String r0 = " Cache"
            java.lang.String r4 = defpackage.i61.n(r4, r8, r0)
            hk1 r8 = new hk1
            r8.<init>(r4, r2, r3)
            r3.o0 = r8
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 <= 0) goto L58
            java.lang.String r4 = "journal"
            lt4 r4 = r5.d(r4)
            r3.R = r4
            java.lang.String r4 = "journal.tmp"
            lt4 r4 = r5.d(r4)
            r3.X = r4
            java.lang.String r4 = "journal.bkp"
            lt4 r4 = r5.d(r4)
            r3.Y = r4
            return
        L58:
            java.lang.String r3 = "maxSize <= 0"
            defpackage.i.h(r3)
            r3 = 0
            throw r3
    }

    public static void N(java.lang.String r2) {
            xh5 r0 = defpackage.kk1.p0
            boolean r0 = r0.d(r2)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.String r0 = "keys must match regex [a-z0-9_-]{1,120}: \""
            r1 = 34
            java.lang.String r2 = defpackage.i61.k(r1, r0, r2)
            defpackage.i.f(r2)
            return
    }

    public final void A(java.lang.String r12) {
            r11 = this;
            r0 = 32
            r1 = 0
            r2 = 6
            int r3 = defpackage.qs6.s0(r0, r1, r2, r12)
            java.lang.String r4 = "unexpected journal line: "
            r5 = -1
            if (r3 == r5) goto Lc1
            int r6 = r3 + 1
            r7 = 4
            int r7 = defpackage.qs6.s0(r0, r6, r7, r12)
            java.util.LinkedHashMap r8 = r11.e0
            if (r7 != r5) goto L2e
            java.lang.String r6 = r12.substring(r6)
            java.lang.String r9 = defpackage.kk1.s0
            int r10 = r9.length()
            if (r3 != r10) goto L32
            boolean r9 = defpackage.xs6.g0(r12, r9, r1)
            if (r9 == 0) goto L32
            r8.remove(r6)
            return
        L2e:
            java.lang.String r6 = r12.substring(r6, r7)
        L32:
            java.lang.Object r9 = r8.get(r6)
            dk1 r9 = (defpackage.dk1) r9
            if (r9 != 0) goto L42
            dk1 r9 = new dk1
            r9.<init>(r11, r6)
            r8.put(r6, r9)
        L42:
            if (r7 == r5) goto L90
            java.lang.String r6 = defpackage.kk1.q0
            int r8 = r6.length()
            if (r3 != r8) goto L90
            boolean r6 = defpackage.xs6.g0(r12, r6, r1)
            if (r6 == 0) goto L90
            r11 = 1
            int r7 = r7 + r11
            java.lang.String r12 = r12.substring(r7)
            char[] r3 = new char[r11]
            r3[r1] = r0
            java.util.List r12 = defpackage.qs6.J0(r12, r3, r2)
            r9.e = r11
            r11 = 0
            r9.g = r11
            int r11 = r12.size()
            kk1 r0 = r9.j
            r0.getClass()
            r0 = 2
            if (r11 != r0) goto L8c
            int r11 = r12.size()     // Catch: java.lang.NumberFormatException -> L88
        L75:
            if (r1 >= r11) goto Lb8
            long[] r0 = r9.b     // Catch: java.lang.NumberFormatException -> L88
            java.lang.Object r2 = r12.get(r1)     // Catch: java.lang.NumberFormatException -> L88
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NumberFormatException -> L88
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L88
            r0[r1] = r2     // Catch: java.lang.NumberFormatException -> L88
            int r1 = r1 + 1
            goto L75
        L88:
            defpackage.fa6.d(r12, r4)
            return
        L8c:
            defpackage.fa6.d(r12, r4)
            return
        L90:
            if (r7 != r5) goto La8
            java.lang.String r0 = defpackage.kk1.r0
            int r2 = r0.length()
            if (r3 != r2) goto La8
            boolean r0 = defpackage.xs6.g0(r12, r0, r1)
            if (r0 == 0) goto La8
            bk1 r12 = new bk1
            r12.<init>(r11, r9)
            r9.g = r12
            return
        La8:
            if (r7 != r5) goto Lb9
            java.lang.String r11 = defpackage.kk1.t0
            int r0 = r11.length()
            if (r3 != r0) goto Lb9
            boolean r11 = defpackage.xs6.g0(r12, r11, r1)
            if (r11 == 0) goto Lb9
        Lb8:
            return
        Lb9:
            java.lang.String r11 = r4.concat(r12)
            defpackage.e41.i(r11)
            return
        Lc1:
            java.lang.String r11 = r4.concat(r12)
            defpackage.e41.i(r11)
            return
    }

    public final synchronized void D() {
            r10 = this;
            monitor-enter(r10)
            ee5 r0 = r10.d0     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lc
            r0.close()     // Catch: java.lang.Throwable -> L9
            goto Lc
        L9:
            r0 = move-exception
            goto Lff
        Lc:
            ik1 r0 = r10.B     // Catch: java.lang.Throwable -> L9
            lt4 r1 = r10.X     // Catch: java.lang.Throwable -> L9
            ui6 r0 = r0.J(r1)     // Catch: java.lang.Throwable -> L9
            ee5 r0 = defpackage.hi2.t(r0)     // Catch: java.lang.Throwable -> L9
            r1 = 0
            java.lang.String r2 = "libcore.io.DiskLruCache"
            r0.H(r2)     // Catch: java.lang.Throwable -> L6f
            r2 = 10
            r0.writeByte(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = "1"
            r0.H(r3)     // Catch: java.lang.Throwable -> L6f
            r0.writeByte(r2)     // Catch: java.lang.Throwable -> L6f
            r3 = 201105(0x31191, double:9.9359E-319)
            r0.h0(r3)     // Catch: java.lang.Throwable -> L6f
            r0.writeByte(r2)     // Catch: java.lang.Throwable -> L6f
            r3 = 2
            r0.h0(r3)     // Catch: java.lang.Throwable -> L6f
            r0.writeByte(r2)     // Catch: java.lang.Throwable -> L6f
            r0.writeByte(r2)     // Catch: java.lang.Throwable -> L6f
            java.util.LinkedHashMap r3 = r10.e0     // Catch: java.lang.Throwable -> L6f
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L6f
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L6f
        L49:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L93
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L6f
            r4.getClass()     // Catch: java.lang.Throwable -> L6f
            dk1 r4 = (defpackage.dk1) r4     // Catch: java.lang.Throwable -> L6f
            bk1 r5 = r4.g     // Catch: java.lang.Throwable -> L6f
            r6 = 32
            if (r5 == 0) goto L71
            java.lang.String r5 = defpackage.kk1.r0     // Catch: java.lang.Throwable -> L6f
            r0.H(r5)     // Catch: java.lang.Throwable -> L6f
            r0.writeByte(r6)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = r4.a     // Catch: java.lang.Throwable -> L6f
            r0.H(r4)     // Catch: java.lang.Throwable -> L6f
            r0.writeByte(r2)     // Catch: java.lang.Throwable -> L6f
            goto L49
        L6f:
            r2 = move-exception
            goto L9a
        L71:
            java.lang.String r5 = defpackage.kk1.q0     // Catch: java.lang.Throwable -> L6f
            r0.H(r5)     // Catch: java.lang.Throwable -> L6f
            r0.writeByte(r6)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = r4.a     // Catch: java.lang.Throwable -> L6f
            r0.H(r5)     // Catch: java.lang.Throwable -> L6f
            long[] r4 = r4.b     // Catch: java.lang.Throwable -> L6f
            int r5 = r4.length     // Catch: java.lang.Throwable -> L6f
            r7 = r1
        L82:
            if (r7 >= r5) goto L8f
            r8 = r4[r7]     // Catch: java.lang.Throwable -> L6f
            r0.writeByte(r6)     // Catch: java.lang.Throwable -> L6f
            r0.h0(r8)     // Catch: java.lang.Throwable -> L6f
            int r7 = r7 + 1
            goto L82
        L8f:
            r0.writeByte(r2)     // Catch: java.lang.Throwable -> L6f
            goto L49
        L93:
            r0.close()     // Catch: java.lang.Throwable -> L98
            r0 = 0
            goto La3
        L98:
            r0 = move-exception
            goto La3
        L9a:
            r0.close()     // Catch: java.lang.Throwable -> L9e
            goto La2
        L9e:
            r0 = move-exception
            defpackage.mb3.q(r2, r0)     // Catch: java.lang.Throwable -> L9
        La2:
            r0 = r2
        La3:
            if (r0 != 0) goto Lfe
            ik1 r0 = r10.B     // Catch: java.lang.Throwable -> L9
            lt4 r2 = r10.R     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.v(r2)     // Catch: java.lang.Throwable -> L9
            ik1 r2 = r10.B
            if (r0 == 0) goto Lc9
            lt4 r0 = r10.R     // Catch: java.lang.Throwable -> L9
            lt4 r3 = r10.Y     // Catch: java.lang.Throwable -> L9
            r2.h(r0, r3)     // Catch: java.lang.Throwable -> L9
            ik1 r0 = r10.B     // Catch: java.lang.Throwable -> L9
            lt4 r2 = r10.X     // Catch: java.lang.Throwable -> L9
            lt4 r3 = r10.R     // Catch: java.lang.Throwable -> L9
            r0.h(r2, r3)     // Catch: java.lang.Throwable -> L9
            ik1 r0 = r10.B     // Catch: java.lang.Throwable -> L9
            lt4 r2 = r10.Y     // Catch: java.lang.Throwable -> L9
            defpackage.yy7.d(r0, r2)     // Catch: java.lang.Throwable -> L9
            goto Ld0
        Lc9:
            lt4 r0 = r10.X     // Catch: java.lang.Throwable -> L9
            lt4 r3 = r10.R     // Catch: java.lang.Throwable -> L9
            r2.h(r0, r3)     // Catch: java.lang.Throwable -> L9
        Ld0:
            ee5 r0 = r10.d0     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Ld7
            defpackage.yy7.b(r0)     // Catch: java.lang.Throwable -> L9
        Ld7:
            ik1 r0 = r10.B     // Catch: java.lang.Throwable -> L9
            lt4 r2 = r10.R     // Catch: java.lang.Throwable -> L9
            r0.getClass()     // Catch: java.lang.Throwable -> L9
            r2.getClass()     // Catch: java.lang.Throwable -> L9
            ui6 r0 = r0.e(r2)     // Catch: java.lang.Throwable -> L9
            v92 r2 = new v92     // Catch: java.lang.Throwable -> L9
            k0 r3 = new k0     // Catch: java.lang.Throwable -> L9
            r4 = 19
            r3.<init>(r10, r4)     // Catch: java.lang.Throwable -> L9
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L9
            ee5 r0 = new ee5     // Catch: java.lang.Throwable -> L9
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L9
            r10.d0 = r0     // Catch: java.lang.Throwable -> L9
            r10.g0 = r1     // Catch: java.lang.Throwable -> L9
            r10.l0 = r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r10)
            return
        Lfe:
            throw r0     // Catch: java.lang.Throwable -> L9
        Lff:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public final void F(defpackage.dk1 r11) {
            r10 = this;
            java.lang.String r0 = r11.a
            boolean r1 = r10.h0
            r2 = 10
            r3 = 32
            r4 = 1
            if (r1 != 0) goto L2f
            int r1 = r11.h
            if (r1 <= 0) goto L24
            ee5 r1 = r10.d0
            if (r1 == 0) goto L24
            java.lang.String r5 = defpackage.kk1.r0
            r1.H(r5)
            r1.writeByte(r3)
            r1.H(r0)
            r1.writeByte(r2)
            r1.flush()
        L24:
            int r1 = r11.h
            if (r1 > 0) goto L2c
            bk1 r1 = r11.g
            if (r1 == 0) goto L2f
        L2c:
            r11.f = r4
            return
        L2f:
            bk1 r1 = r11.g
            if (r1 == 0) goto L36
            r1.g()
        L36:
            r1 = 0
        L37:
            r5 = 2
            if (r1 >= r5) goto L57
            java.util.ArrayList r5 = r11.c
            java.lang.Object r5 = r5.get(r1)
            lt4 r5 = (defpackage.lt4) r5
            ik1 r6 = r10.B
            defpackage.yy7.d(r6, r5)
            long r5 = r10.Z
            long[] r7 = r11.b
            r8 = r7[r1]
            long r5 = r5 - r8
            r10.Z = r5
            r5 = 0
            r7[r1] = r5
            int r1 = r1 + 1
            goto L37
        L57:
            int r11 = r10.f0
            int r11 = r11 + r4
            r10.f0 = r11
            ee5 r11 = r10.d0
            if (r11 == 0) goto L6e
            java.lang.String r1 = defpackage.kk1.s0
            r11.H(r1)
            r11.writeByte(r3)
            r11.H(r0)
            r11.writeByte(r2)
        L6e:
            java.util.LinkedHashMap r11 = r10.e0
            r11.remove(r0)
            boolean r11 = r10.u()
            if (r11 == 0) goto L80
            pz6 r11 = r10.n0
            hk1 r10 = r10.o0
            defpackage.pz6.d(r11, r10)
        L80:
            return
    }

    public final void J() {
            r4 = this;
        L0:
            long r0 = r4.Z
            long r2 = r4.L
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2a
            java.util.LinkedHashMap r0 = r4.e0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            r1.getClass()
            dk1 r1 = (defpackage.dk1) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.F(r1)
            goto L0
        L29:
            return
        L2a:
            r0 = 0
            r4.k0 = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.i0     // Catch: java.lang.Throwable -> L2d
            r1 = 1
            if (r0 == 0) goto L43
            boolean r0 = r5.j0     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto Lb
            goto L43
        Lb:
            java.util.LinkedHashMap r0 = r5.e0     // Catch: java.lang.Throwable -> L2d
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L2d
            r0.getClass()     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            dk1[] r3 = new defpackage.dk1[r2]     // Catch: java.lang.Throwable -> L2d
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch: java.lang.Throwable -> L2d
            dk1[] r0 = (defpackage.dk1[]) r0     // Catch: java.lang.Throwable -> L2d
            int r3 = r0.length     // Catch: java.lang.Throwable -> L2d
        L1e:
            if (r2 >= r3) goto L32
            r4 = r0[r2]     // Catch: java.lang.Throwable -> L2d
            r4.getClass()     // Catch: java.lang.Throwable -> L2d
            bk1 r4 = r4.g     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L2f
            r4.g()     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            r0 = move-exception
            goto L47
        L2f:
            int r2 = r2 + 1
            goto L1e
        L32:
            r5.J()     // Catch: java.lang.Throwable -> L2d
            ee5 r0 = r5.d0     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L3c
            defpackage.yy7.b(r0)     // Catch: java.lang.Throwable -> L2d
        L3c:
            r0 = 0
            r5.d0 = r0     // Catch: java.lang.Throwable -> L2d
            r5.j0 = r1     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return
        L43:
            r5.j0 = r1     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return
        L47:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r0
    }

    public final synchronized void e() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.j0     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            java.lang.String r0 = "cache is closed"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1     // Catch: java.lang.Throwable -> Lf
        Lf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.i0     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L7
            monitor-exit(r1)
            return
        L7:
            r1.e()     // Catch: java.lang.Throwable -> L17
            r1.J()     // Catch: java.lang.Throwable -> L17
            ee5 r0 = r1.d0     // Catch: java.lang.Throwable -> L17
            r0.getClass()     // Catch: java.lang.Throwable -> L17
            r0.flush()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    public final synchronized void h(defpackage.bk1 r10, boolean r11) {
            r9 = this;
            monitor-enter(r9)
            java.lang.Object r0 = r10.L     // Catch: java.lang.Throwable -> L38
            dk1 r0 = (defpackage.dk1) r0     // Catch: java.lang.Throwable -> L38
            bk1 r1 = r0.g     // Catch: java.lang.Throwable -> L38
            boolean r1 = defpackage.nb3.k(r1, r10)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L129
            r1 = 2
            r2 = 0
            if (r11 == 0) goto L58
            boolean r3 = r0.e     // Catch: java.lang.Throwable -> L38
            if (r3 != 0) goto L58
            r3 = r2
        L16:
            if (r3 >= r1) goto L58
            java.lang.Object r4 = r10.B     // Catch: java.lang.Throwable -> L38
            boolean[] r4 = (boolean[]) r4     // Catch: java.lang.Throwable -> L38
            r4.getClass()     // Catch: java.lang.Throwable -> L38
            boolean r4 = r4[r3]     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L3e
            ik1 r4 = r9.B     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r5 = r0.d     // Catch: java.lang.Throwable -> L38
            java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Throwable -> L38
            lt4 r5 = (defpackage.lt4) r5     // Catch: java.lang.Throwable -> L38
            boolean r4 = r4.v(r5)     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto L3b
            r10.a()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r9)
            return
        L38:
            r10 = move-exception
            goto L131
        L3b:
            int r3 = r3 + 1
            goto L16
        L3e:
            r10.a()     // Catch: java.lang.Throwable -> L38
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r11.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch: java.lang.Throwable -> L38
            r11.append(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L38
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L38
            throw r10     // Catch: java.lang.Throwable -> L38
        L58:
            r10 = r2
        L59:
            if (r10 >= r1) goto La8
            java.util.ArrayList r3 = r0.d     // Catch: java.lang.Throwable -> L38
            java.lang.Object r3 = r3.get(r10)     // Catch: java.lang.Throwable -> L38
            lt4 r3 = (defpackage.lt4) r3     // Catch: java.lang.Throwable -> L38
            if (r11 == 0) goto La0
            boolean r4 = r0.f     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto La0
            ik1 r4 = r9.B     // Catch: java.lang.Throwable -> L38
            boolean r4 = r4.v(r3)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto La5
            java.util.ArrayList r4 = r0.c     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r4.get(r10)     // Catch: java.lang.Throwable -> L38
            lt4 r4 = (defpackage.lt4) r4     // Catch: java.lang.Throwable -> L38
            ik1 r5 = r9.B     // Catch: java.lang.Throwable -> L38
            r5.h(r3, r4)     // Catch: java.lang.Throwable -> L38
            long[] r3 = r0.b     // Catch: java.lang.Throwable -> L38
            r5 = r3[r10]     // Catch: java.lang.Throwable -> L38
            ik1 r3 = r9.B     // Catch: java.lang.Throwable -> L38
            ai1 r3 = r3.A(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r3 = r3.e     // Catch: java.lang.Throwable -> L38
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L93
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L38
            goto L95
        L93:
            r3 = 0
        L95:
            long[] r7 = r0.b     // Catch: java.lang.Throwable -> L38
            r7[r10] = r3     // Catch: java.lang.Throwable -> L38
            long r7 = r9.Z     // Catch: java.lang.Throwable -> L38
            long r7 = r7 - r5
            long r7 = r7 + r3
            r9.Z = r7     // Catch: java.lang.Throwable -> L38
            goto La5
        La0:
            ik1 r4 = r9.B     // Catch: java.lang.Throwable -> L38
            defpackage.yy7.d(r4, r3)     // Catch: java.lang.Throwable -> L38
        La5:
            int r10 = r10 + 1
            goto L59
        La8:
            r10 = 0
            r0.g = r10     // Catch: java.lang.Throwable -> L38
            boolean r10 = r0.f     // Catch: java.lang.Throwable -> L38
            if (r10 == 0) goto Lb4
            r9.F(r0)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r9)
            return
        Lb4:
            int r10 = r9.f0     // Catch: java.lang.Throwable -> L38
            r1 = 1
            int r10 = r10 + r1
            r9.f0 = r10     // Catch: java.lang.Throwable -> L38
            ee5 r10 = r9.d0     // Catch: java.lang.Throwable -> L38
            r10.getClass()     // Catch: java.lang.Throwable -> L38
            boolean r3 = r0.e     // Catch: java.lang.Throwable -> L38
            r4 = 10
            r5 = 32
            if (r3 != 0) goto Le2
            if (r11 == 0) goto Lca
            goto Le2
        Lca:
            java.util.LinkedHashMap r11 = r9.e0     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = r0.a     // Catch: java.lang.Throwable -> L38
            r11.remove(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.String r11 = defpackage.kk1.s0     // Catch: java.lang.Throwable -> L38
            r10.H(r11)     // Catch: java.lang.Throwable -> L38
            r10.writeByte(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.String r11 = r0.a     // Catch: java.lang.Throwable -> L38
            r10.H(r11)     // Catch: java.lang.Throwable -> L38
            r10.writeByte(r4)     // Catch: java.lang.Throwable -> L38
            goto L10f
        Le2:
            r0.e = r1     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = defpackage.kk1.q0     // Catch: java.lang.Throwable -> L38
            r10.H(r1)     // Catch: java.lang.Throwable -> L38
            r10.writeByte(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = r0.a     // Catch: java.lang.Throwable -> L38
            r10.H(r1)     // Catch: java.lang.Throwable -> L38
            long[] r1 = r0.b     // Catch: java.lang.Throwable -> L38
            int r3 = r1.length     // Catch: java.lang.Throwable -> L38
        Lf4:
            if (r2 >= r3) goto L101
            r6 = r1[r2]     // Catch: java.lang.Throwable -> L38
            r10.writeByte(r5)     // Catch: java.lang.Throwable -> L38
            r10.h0(r6)     // Catch: java.lang.Throwable -> L38
            int r2 = r2 + 1
            goto Lf4
        L101:
            r10.writeByte(r4)     // Catch: java.lang.Throwable -> L38
            if (r11 == 0) goto L10f
            long r1 = r9.m0     // Catch: java.lang.Throwable -> L38
            r3 = 1
            long r3 = r3 + r1
            r9.m0 = r3     // Catch: java.lang.Throwable -> L38
            r0.i = r1     // Catch: java.lang.Throwable -> L38
        L10f:
            r10.flush()     // Catch: java.lang.Throwable -> L38
            long r10 = r9.Z     // Catch: java.lang.Throwable -> L38
            long r0 = r9.L     // Catch: java.lang.Throwable -> L38
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L120
            boolean r10 = r9.u()     // Catch: java.lang.Throwable -> L38
            if (r10 == 0) goto L127
        L120:
            pz6 r10 = r9.n0     // Catch: java.lang.Throwable -> L38
            hk1 r11 = r9.o0     // Catch: java.lang.Throwable -> L38
            defpackage.pz6.d(r10, r11)     // Catch: java.lang.Throwable -> L38
        L127:
            monitor-exit(r9)
            return
        L129:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L38
            java.lang.String r11 = "Check failed."
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L38
            throw r10     // Catch: java.lang.Throwable -> L38
        L131:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L38
            throw r10
    }

    public final synchronized defpackage.bk1 k(long r6, java.lang.String r8) {
            r5 = this;
            monitor-enter(r5)
            r8.getClass()     // Catch: java.lang.Throwable -> L25
            r5.r()     // Catch: java.lang.Throwable -> L25
            r5.e()     // Catch: java.lang.Throwable -> L25
            N(r8)     // Catch: java.lang.Throwable -> L25
            java.util.LinkedHashMap r0 = r5.e0     // Catch: java.lang.Throwable -> L25
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L25
            dk1 r0 = (defpackage.dk1) r0     // Catch: java.lang.Throwable -> L25
            r1 = -1
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L29
            if (r0 == 0) goto L27
            long r3 = r0.i     // Catch: java.lang.Throwable -> L25
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 == 0) goto L29
            goto L27
        L25:
            r6 = move-exception
            goto L82
        L27:
            monitor-exit(r5)
            return r2
        L29:
            if (r0 == 0) goto L2e
            bk1 r6 = r0.g     // Catch: java.lang.Throwable -> L25
            goto L2f
        L2e:
            r6 = r2
        L2f:
            if (r6 == 0) goto L33
            monitor-exit(r5)
            return r2
        L33:
            if (r0 == 0) goto L3b
            int r6 = r0.h     // Catch: java.lang.Throwable -> L25
            if (r6 == 0) goto L3b
            monitor-exit(r5)
            return r2
        L3b:
            boolean r6 = r5.k0     // Catch: java.lang.Throwable -> L25
            if (r6 != 0) goto L79
            boolean r6 = r5.l0     // Catch: java.lang.Throwable -> L25
            if (r6 == 0) goto L44
            goto L79
        L44:
            ee5 r6 = r5.d0     // Catch: java.lang.Throwable -> L25
            r6.getClass()     // Catch: java.lang.Throwable -> L25
            java.lang.String r7 = defpackage.kk1.r0     // Catch: java.lang.Throwable -> L25
            r6.H(r7)     // Catch: java.lang.Throwable -> L25
            r7 = 32
            r6.writeByte(r7)     // Catch: java.lang.Throwable -> L25
            r6.H(r8)     // Catch: java.lang.Throwable -> L25
            r7 = 10
            r6.writeByte(r7)     // Catch: java.lang.Throwable -> L25
            r6.flush()     // Catch: java.lang.Throwable -> L25
            boolean r6 = r5.g0     // Catch: java.lang.Throwable -> L25
            if (r6 == 0) goto L64
            monitor-exit(r5)
            return r2
        L64:
            if (r0 != 0) goto L70
            dk1 r0 = new dk1     // Catch: java.lang.Throwable -> L25
            r0.<init>(r5, r8)     // Catch: java.lang.Throwable -> L25
            java.util.LinkedHashMap r6 = r5.e0     // Catch: java.lang.Throwable -> L25
            r6.put(r8, r0)     // Catch: java.lang.Throwable -> L25
        L70:
            bk1 r6 = new bk1     // Catch: java.lang.Throwable -> L25
            r6.<init>(r5, r0)     // Catch: java.lang.Throwable -> L25
            r0.g = r6     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            return r6
        L79:
            pz6 r6 = r5.n0     // Catch: java.lang.Throwable -> L25
            hk1 r7 = r5.o0     // Catch: java.lang.Throwable -> L25
            defpackage.pz6.d(r6, r7)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            return r2
        L82:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L25
            throw r6
    }

    public final synchronized defpackage.fk1 n(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            r4.getClass()     // Catch: java.lang.Throwable -> L4d
            r3.r()     // Catch: java.lang.Throwable -> L4d
            r3.e()     // Catch: java.lang.Throwable -> L4d
            N(r4)     // Catch: java.lang.Throwable -> L4d
            java.util.LinkedHashMap r0 = r3.e0     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L4d
            dk1 r0 = (defpackage.dk1) r0     // Catch: java.lang.Throwable -> L4d
            r1 = 0
            if (r0 != 0) goto L1a
            monitor-exit(r3)
            return r1
        L1a:
            fk1 r0 = r0.a()     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L22
            monitor-exit(r3)
            return r1
        L22:
            int r1 = r3.f0     // Catch: java.lang.Throwable -> L4d
            int r1 = r1 + 1
            r3.f0 = r1     // Catch: java.lang.Throwable -> L4d
            ee5 r1 = r3.d0     // Catch: java.lang.Throwable -> L4d
            r1.getClass()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = defpackage.kk1.t0     // Catch: java.lang.Throwable -> L4d
            r1.H(r2)     // Catch: java.lang.Throwable -> L4d
            r2 = 32
            r1.writeByte(r2)     // Catch: java.lang.Throwable -> L4d
            r1.H(r4)     // Catch: java.lang.Throwable -> L4d
            r4 = 10
            r1.writeByte(r4)     // Catch: java.lang.Throwable -> L4d
            boolean r4 = r3.u()     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L4f
            pz6 r4 = r3.n0     // Catch: java.lang.Throwable -> L4d
            hk1 r1 = r3.o0     // Catch: java.lang.Throwable -> L4d
            defpackage.pz6.d(r4, r1)     // Catch: java.lang.Throwable -> L4d
            goto L4f
        L4d:
            r4 = move-exception
            goto L51
        L4f:
            monitor-exit(r3)
            return r0
        L51:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4d
            throw r4
    }

    public final synchronized void r() {
            r7 = this;
            java.lang.String r0 = "DiskLruCache "
            monitor-enter(r7)
            java.util.TimeZone r1 = defpackage.az7.a     // Catch: java.lang.Throwable -> L27
            boolean r1 = r7.i0     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto Lb
            monitor-exit(r7)
            return
        Lb:
            ik1 r1 = r7.B     // Catch: java.lang.Throwable -> L27
            lt4 r2 = r7.Y     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.v(r2)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L2f
            ik1 r1 = r7.B     // Catch: java.lang.Throwable -> L27
            lt4 r2 = r7.R     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.v(r2)     // Catch: java.lang.Throwable -> L27
            ik1 r2 = r7.B
            lt4 r3 = r7.Y
            if (r1 == 0) goto L2a
            r2.u(r3)     // Catch: java.lang.Throwable -> L27
            goto L2f
        L27:
            r0 = move-exception
            goto Lc3
        L2a:
            lt4 r1 = r7.R     // Catch: java.lang.Throwable -> L27
            r2.h(r3, r1)     // Catch: java.lang.Throwable -> L27
        L2f:
            ik1 r1 = r7.B     // Catch: java.lang.Throwable -> L27
            lt4 r2 = r7.Y     // Catch: java.lang.Throwable -> L27
            byte[] r3 = defpackage.yy7.a     // Catch: java.lang.Throwable -> L27
            r1.getClass()     // Catch: java.lang.Throwable -> L27
            r2.getClass()     // Catch: java.lang.Throwable -> L27
            ui6 r3 = r1.J(r2)     // Catch: java.lang.Throwable -> L27
            r4 = 1
            r5 = 0
            db2 r6 = r1.B     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L59
            r6.r(r2)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L59
            if (r3 == 0) goto L4b
            r3.close()     // Catch: java.lang.Throwable -> L4b
        L4b:
            r1 = r4
            goto L6c
        L4d:
            r6 = move-exception
            if (r3 == 0) goto L64
            r3.close()     // Catch: java.lang.Throwable -> L54
            goto L64
        L54:
            r3 = move-exception
            defpackage.mb3.q(r6, r3)     // Catch: java.lang.Throwable -> L27
            goto L64
        L59:
            if (r3 == 0) goto L62
            r3.close()     // Catch: java.lang.Throwable -> L5f
            goto L62
        L5f:
            r3 = move-exception
        L60:
            r6 = r3
            goto L64
        L62:
            r3 = 0
            goto L60
        L64:
            if (r6 != 0) goto Lc2
            db2 r1 = r1.B     // Catch: java.lang.Throwable -> L27
            r1.r(r2)     // Catch: java.lang.Throwable -> L27
            r1 = r5
        L6c:
            r7.h0 = r1     // Catch: java.lang.Throwable -> L27
            ik1 r1 = r7.B     // Catch: java.lang.Throwable -> L27
            lt4 r2 = r7.R     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.v(r2)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto Lbb
            r7.x()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L82
            r7.v()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L82
            r7.i0 = r4     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L82
            monitor-exit(r7)
            return
        L82:
            r1 = move-exception
            kx4 r2 = defpackage.kx4.a     // Catch: java.lang.Throwable -> L27
            kx4 r2 = defpackage.kx4.a     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L27
            lt4 r0 = r7.A     // Catch: java.lang.Throwable -> L27
            r3.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = " is corrupt: "
            r3.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L27
            r3.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = ", removing"
            r3.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L27
            r3 = 5
            r2.i(r0, r3, r1)     // Catch: java.lang.Throwable -> L27
            r7.close()     // Catch: java.lang.Throwable -> Lb7
            ik1 r0 = r7.B     // Catch: java.lang.Throwable -> Lb7
            lt4 r1 = r7.A     // Catch: java.lang.Throwable -> Lb7
            defpackage.yy7.c(r0, r1)     // Catch: java.lang.Throwable -> Lb7
            r7.j0 = r5     // Catch: java.lang.Throwable -> L27
            goto Lbb
        Lb7:
            r0 = move-exception
            r7.j0 = r5     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        Lbb:
            r7.D()     // Catch: java.lang.Throwable -> L27
            r7.i0 = r4     // Catch: java.lang.Throwable -> L27
            monitor-exit(r7)
            return
        Lc2:
            throw r6     // Catch: java.lang.Throwable -> L27
        Lc3:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L27
            throw r0
    }

    public final boolean u() {
            r2 = this;
            int r0 = r2.f0
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r0 < r1) goto L10
            java.util.LinkedHashMap r2 = r2.e0
            int r2 = r2.size()
            if (r0 < r2) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    public final void v() {
            r10 = this;
            lt4 r0 = r10.X
            ik1 r1 = r10.B
            defpackage.yy7.d(r1, r0)
            java.util.LinkedHashMap r0 = r10.e0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r0.next()
            r2.getClass()
            dk1 r2 = (defpackage.dk1) r2
            bk1 r3 = r2.g
            r4 = 2
            r5 = 0
            if (r3 != 0) goto L34
        L26:
            if (r5 >= r4) goto L11
            long r6 = r10.Z
            long[] r3 = r2.b
            r8 = r3[r5]
            long r6 = r6 + r8
            r10.Z = r6
            int r5 = r5 + 1
            goto L26
        L34:
            r3 = 0
            r2.g = r3
        L37:
            if (r5 >= r4) goto L52
            java.util.ArrayList r3 = r2.c
            java.lang.Object r3 = r3.get(r5)
            lt4 r3 = (defpackage.lt4) r3
            defpackage.yy7.d(r1, r3)
            java.util.ArrayList r3 = r2.d
            java.lang.Object r3 = r3.get(r5)
            lt4 r3 = (defpackage.lt4) r3
            defpackage.yy7.d(r1, r3)
            int r5 = r5 + 1
            goto L37
        L52:
            r0.remove()
            goto L11
        L56:
            return
    }

    public final void x() {
            r13 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            ik1 r2 = r13.B
            lt4 r3 = r13.R
            in6 r4 = r2.N(r3)
            fe5 r4 = defpackage.hi2.u(r4)
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r7 = r4.y(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = r4.y(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r9 = r4.y(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r10 = r4.y(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r11 = r4.y(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r12 = "libcore.io.DiskLruCache"
            boolean r12 = r12.equals(r7)     // Catch: java.lang.Throwable -> L62
            if (r12 == 0) goto La2
            java.lang.String r12 = "1"
            boolean r12 = r12.equals(r8)     // Catch: java.lang.Throwable -> L62
            if (r12 == 0) goto La2
            r12 = 201105(0x31191, float:2.81808E-40)
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L62
            boolean r9 = defpackage.nb3.k(r12, r9)     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto La2
            r9 = 2
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L62
            boolean r9 = defpackage.nb3.k(r9, r10)     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto La2
            int r9 = r11.length()     // Catch: java.lang.Throwable -> L62
            if (r9 > 0) goto La2
            r0 = 0
        L58:
            java.lang.String r1 = r4.y(r5)     // Catch: java.lang.Throwable -> L62 java.io.EOFException -> L64
            r13.A(r1)     // Catch: java.lang.Throwable -> L62 java.io.EOFException -> L64
            int r0 = r0 + 1
            goto L58
        L62:
            r13 = move-exception
            goto Lcb
        L64:
            java.util.LinkedHashMap r1 = r13.e0     // Catch: java.lang.Throwable -> L62
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L62
            int r0 = r0 - r1
            r13.f0 = r0     // Catch: java.lang.Throwable -> L62
            boolean r0 = r4.e()     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L77
            r13.D()     // Catch: java.lang.Throwable -> L62
            goto L9b
        L77:
            ee5 r0 = r13.d0     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L7e
            defpackage.yy7.b(r0)     // Catch: java.lang.Throwable -> L62
        L7e:
            r2.getClass()     // Catch: java.lang.Throwable -> L62
            r3.getClass()     // Catch: java.lang.Throwable -> L62
            ui6 r0 = r2.e(r3)     // Catch: java.lang.Throwable -> L62
            v92 r1 = new v92     // Catch: java.lang.Throwable -> L62
            k0 r2 = new k0     // Catch: java.lang.Throwable -> L62
            r3 = 19
            r2.<init>(r13, r3)     // Catch: java.lang.Throwable -> L62
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L62
            ee5 r0 = new ee5     // Catch: java.lang.Throwable -> L62
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r13.d0 = r0     // Catch: java.lang.Throwable -> L62
        L9b:
            r4.close()     // Catch: java.lang.Throwable -> La0
            r13 = 0
            goto Ld3
        La0:
            r13 = move-exception
            goto Ld3
        La2:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r2.append(r7)     // Catch: java.lang.Throwable -> L62
            r2.append(r0)     // Catch: java.lang.Throwable -> L62
            r2.append(r8)     // Catch: java.lang.Throwable -> L62
            r2.append(r0)     // Catch: java.lang.Throwable -> L62
            r2.append(r10)     // Catch: java.lang.Throwable -> L62
            r2.append(r0)     // Catch: java.lang.Throwable -> L62
            r2.append(r11)     // Catch: java.lang.Throwable -> L62
            r0 = 93
            r2.append(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L62
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L62
            throw r13     // Catch: java.lang.Throwable -> L62
        Lcb:
            r4.close()     // Catch: java.lang.Throwable -> Lcf
            goto Ld3
        Lcf:
            r0 = move-exception
            defpackage.mb3.q(r13, r0)
        Ld3:
            if (r13 != 0) goto Ld6
            return
        Ld6:
            throw r13
    }
}
