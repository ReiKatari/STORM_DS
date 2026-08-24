package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lk1  reason: default package */
/* loaded from: classes.dex */
public final class lk1 implements java.io.Closeable, java.io.Flushable {
    public static final defpackage.xh5 m0 = null;
    public final defpackage.lt4 A;
    public final long B;
    public final defpackage.lt4 L;
    public final defpackage.lt4 R;
    public final defpackage.lt4 X;
    public final java.util.LinkedHashMap Y;
    public final defpackage.o41 Z;
    public long d0;
    public int e0;
    public defpackage.ee5 f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public final defpackage.jk1 l0;

    static {
            xh5 r0 = new xh5
            java.lang.String r1 = "[a-z0-9_-]{1,120}"
            r0.<init>(r1)
            defpackage.lk1.m0 = r0
            return
    }

    public lk1(long r3, defpackage.n61 r5, defpackage.db2 r6, defpackage.lt4 r7) {
            r2 = this;
            r2.<init>()
            r2.A = r7
            r2.B = r3
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L4a
            java.lang.String r3 = "journal"
            lt4 r3 = r7.d(r3)
            r2.L = r3
            java.lang.String r3 = "journal.tmp"
            lt4 r3 = r7.d(r3)
            r2.R = r3
            java.lang.String r3 = "journal.bkp"
            lt4 r3 = r7.d(r3)
            r2.X = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r4 = 0
            r7 = 1061158912(0x3f400000, float:0.75)
            r0 = 1
            r3.<init>(r4, r7, r0)
            r2.Y = r3
            gu6 r3 = defpackage.oi2.c()
            n61 r4 = r5.m0(r0)
            l61 r3 = defpackage.jw2.y(r3, r4)
            o41 r3 = defpackage.g04.i(r3)
            r2.Z = r3
            jk1 r3 = new jk1
            r3.<init>(r6)
            r2.l0 = r3
            return
        L4a:
            java.lang.String r2 = "maxSize <= 0"
            defpackage.i.h(r2)
            r2 = 0
            throw r2
    }

    public static void F(java.lang.String r2) {
            xh5 r0 = defpackage.lk1.m0
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

    public static final void e(defpackage.lk1 r9, defpackage.bk1 r10, boolean r11) {
            monitor-enter(r9)
            java.lang.Object r0 = r10.L     // Catch: java.lang.Throwable -> L35
            ek1 r0 = (defpackage.ek1) r0     // Catch: java.lang.Throwable -> L35
            bk1 r1 = r0.g     // Catch: java.lang.Throwable -> L35
            boolean r1 = defpackage.nb3.k(r1, r10)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L11e
            r1 = 2
            r2 = 0
            if (r11 == 0) goto L95
            boolean r3 = r0.f     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L95
            r3 = r2
        L16:
            if (r3 >= r1) goto L3b
            java.lang.Object r4 = r10.B     // Catch: java.lang.Throwable -> L35
            boolean[] r4 = (boolean[]) r4     // Catch: java.lang.Throwable -> L35
            boolean r4 = r4[r3]     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L38
            jk1 r4 = r9.l0     // Catch: java.lang.Throwable -> L35
            java.util.ArrayList r5 = r0.d     // Catch: java.lang.Throwable -> L35
            java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Throwable -> L35
            lt4 r5 = (defpackage.lt4) r5     // Catch: java.lang.Throwable -> L35
            boolean r4 = r4.v(r5)     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L38
            r10.e(r2)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r9)
            return
        L35:
            r10 = move-exception
            goto L126
        L38:
            int r3 = r3 + 1
            goto L16
        L3b:
            r10 = r2
        L3c:
            if (r10 >= r1) goto La8
            java.util.ArrayList r3 = r0.d     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r3.get(r10)     // Catch: java.lang.Throwable -> L35
            lt4 r3 = (defpackage.lt4) r3     // Catch: java.lang.Throwable -> L35
            java.util.ArrayList r4 = r0.c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r4.get(r10)     // Catch: java.lang.Throwable -> L35
            lt4 r4 = (defpackage.lt4) r4     // Catch: java.lang.Throwable -> L35
            jk1 r5 = r9.l0     // Catch: java.lang.Throwable -> L35
            boolean r5 = r5.v(r3)     // Catch: java.lang.Throwable -> L35
            jk1 r6 = r9.l0
            if (r5 == 0) goto L5c
            r6.h(r3, r4)     // Catch: java.lang.Throwable -> L35
            goto L71
        L5c:
            java.util.ArrayList r3 = r0.c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r3.get(r10)     // Catch: java.lang.Throwable -> L35
            lt4 r3 = (defpackage.lt4) r3     // Catch: java.lang.Throwable -> L35
            boolean r5 = r6.v(r3)     // Catch: java.lang.Throwable -> L35
            if (r5 != 0) goto L71
            ui6 r3 = r6.J(r3)     // Catch: java.lang.Throwable -> L35
            defpackage.k.a(r3)     // Catch: java.lang.Throwable -> L35
        L71:
            long[] r3 = r0.b     // Catch: java.lang.Throwable -> L35
            r5 = r3[r10]     // Catch: java.lang.Throwable -> L35
            jk1 r3 = r9.l0     // Catch: java.lang.Throwable -> L35
            ai1 r3 = r3.A(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r3.e     // Catch: java.lang.Throwable -> L35
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L86
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L35
            goto L88
        L86:
            r3 = 0
        L88:
            long[] r7 = r0.b     // Catch: java.lang.Throwable -> L35
            r7[r10] = r3     // Catch: java.lang.Throwable -> L35
            long r7 = r9.d0     // Catch: java.lang.Throwable -> L35
            long r7 = r7 - r5
            long r7 = r7 + r3
            r9.d0 = r7     // Catch: java.lang.Throwable -> L35
            int r10 = r10 + 1
            goto L3c
        L95:
            r10 = r2
        L96:
            if (r10 >= r1) goto La8
            jk1 r3 = r9.l0     // Catch: java.lang.Throwable -> L35
            java.util.ArrayList r4 = r0.d     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r4.get(r10)     // Catch: java.lang.Throwable -> L35
            lt4 r4 = (defpackage.lt4) r4     // Catch: java.lang.Throwable -> L35
            r3.u(r4)     // Catch: java.lang.Throwable -> L35
            int r10 = r10 + 1
            goto L96
        La8:
            r10 = 0
            r0.g = r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r0.f     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto Lb4
            r9.A(r0)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r9)
            return
        Lb4:
            int r10 = r9.e0     // Catch: java.lang.Throwable -> L35
            r1 = 1
            int r10 = r10 + r1
            r9.e0 = r10     // Catch: java.lang.Throwable -> L35
            ee5 r10 = r9.f0     // Catch: java.lang.Throwable -> L35
            r10.getClass()     // Catch: java.lang.Throwable -> L35
            r3 = 10
            r4 = 32
            if (r11 != 0) goto Le2
            boolean r11 = r0.e     // Catch: java.lang.Throwable -> L35
            if (r11 == 0) goto Lca
            goto Le2
        Lca:
            java.util.LinkedHashMap r11 = r9.Y     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r0.a     // Catch: java.lang.Throwable -> L35
            r11.remove(r5)     // Catch: java.lang.Throwable -> L35
            java.lang.String r11 = "REMOVE"
            r10.H(r11)     // Catch: java.lang.Throwable -> L35
            r10.writeByte(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r11 = r0.a     // Catch: java.lang.Throwable -> L35
            r10.H(r11)     // Catch: java.lang.Throwable -> L35
            r10.writeByte(r3)     // Catch: java.lang.Throwable -> L35
            goto L105
        Le2:
            r0.e = r1     // Catch: java.lang.Throwable -> L35
            java.lang.String r11 = "CLEAN"
            r10.H(r11)     // Catch: java.lang.Throwable -> L35
            r10.writeByte(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r11 = r0.a     // Catch: java.lang.Throwable -> L35
            r10.H(r11)     // Catch: java.lang.Throwable -> L35
            long[] r11 = r0.b     // Catch: java.lang.Throwable -> L35
            int r0 = r11.length     // Catch: java.lang.Throwable -> L35
            r5 = r2
        Lf5:
            if (r5 >= r0) goto L102
            r6 = r11[r5]     // Catch: java.lang.Throwable -> L35
            r10.writeByte(r4)     // Catch: java.lang.Throwable -> L35
            r10.h0(r6)     // Catch: java.lang.Throwable -> L35
            int r5 = r5 + 1
            goto Lf5
        L102:
            r10.writeByte(r3)     // Catch: java.lang.Throwable -> L35
        L105:
            r10.flush()     // Catch: java.lang.Throwable -> L35
            long r10 = r9.d0     // Catch: java.lang.Throwable -> L35
            long r3 = r9.B     // Catch: java.lang.Throwable -> L35
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto L119
            int r10 = r9.e0     // Catch: java.lang.Throwable -> L35
            r11 = 2000(0x7d0, float:2.803E-42)
            if (r10 < r11) goto L117
            r2 = r1
        L117:
            if (r2 == 0) goto L11c
        L119:
            r9.r()     // Catch: java.lang.Throwable -> L35
        L11c:
            monitor-exit(r9)
            return
        L11e:
            java.lang.String r10 = "Check failed."
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L35
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L35
            throw r11     // Catch: java.lang.Throwable -> L35
        L126:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L35
            throw r10
    }

    public final void A(defpackage.ek1 r11) {
            r10 = this;
            int r0 = r11.h
            java.lang.String r1 = r11.a
            r2 = 10
            r3 = 32
            if (r0 <= 0) goto L1f
            ee5 r0 = r10.f0
            if (r0 == 0) goto L1f
            java.lang.String r4 = "DIRTY"
            r0.H(r4)
            r0.writeByte(r3)
            r0.H(r1)
            r0.writeByte(r2)
            r0.flush()
        L1f:
            int r0 = r11.h
            r4 = 1
            if (r0 > 0) goto L70
            bk1 r0 = r11.g
            if (r0 == 0) goto L29
            goto L70
        L29:
            r0 = 0
        L2a:
            r5 = 2
            if (r0 >= r5) goto L4a
            java.util.ArrayList r5 = r11.c
            java.lang.Object r5 = r5.get(r0)
            lt4 r5 = (defpackage.lt4) r5
            jk1 r6 = r10.l0
            r6.u(r5)
            long r5 = r10.d0
            long[] r7 = r11.b
            r8 = r7[r0]
            long r5 = r5 - r8
            r10.d0 = r5
            r5 = 0
            r7[r0] = r5
            int r0 = r0 + 1
            goto L2a
        L4a:
            int r11 = r10.e0
            int r11 = r11 + r4
            r10.e0 = r11
            ee5 r11 = r10.f0
            if (r11 == 0) goto L61
            java.lang.String r0 = "REMOVE"
            r11.H(r0)
            r11.writeByte(r3)
            r11.H(r1)
            r11.writeByte(r2)
        L61:
            java.util.LinkedHashMap r11 = r10.Y
            r11.remove(r1)
            int r11 = r10.e0
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r11 < r0) goto L6f
            r10.r()
        L6f:
            return
        L70:
            r11.f = r4
            return
    }

    public final void D() {
            r4 = this;
        L0:
            long r0 = r4.d0
            long r2 = r4.B
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.Y
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            ek1 r1 = (defpackage.ek1) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.A(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.j0 = r0
            return
    }

    public final synchronized void J() {
            r10 = this;
            monitor-enter(r10)
            ee5 r0 = r10.f0     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lc
            r0.close()     // Catch: java.lang.Throwable -> L9
            goto Lc
        L9:
            r0 = move-exception
            goto Lf6
        Lc:
            jk1 r0 = r10.l0     // Catch: java.lang.Throwable -> L9
            lt4 r1 = r10.R     // Catch: java.lang.Throwable -> L9
            ui6 r0 = r0.J(r1)     // Catch: java.lang.Throwable -> L9
            ee5 r0 = defpackage.hi2.t(r0)     // Catch: java.lang.Throwable -> L9
            r1 = 0
            java.lang.String r2 = "libcore.io.DiskLruCache"
            r0.H(r2)     // Catch: java.lang.Throwable -> L6b
            r2 = 10
            r0.writeByte(r2)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = "1"
            r0.H(r3)     // Catch: java.lang.Throwable -> L6b
            r0.writeByte(r2)     // Catch: java.lang.Throwable -> L6b
            r3 = 1
            r0.h0(r3)     // Catch: java.lang.Throwable -> L6b
            r0.writeByte(r2)     // Catch: java.lang.Throwable -> L6b
            r3 = 2
            r0.h0(r3)     // Catch: java.lang.Throwable -> L6b
            r0.writeByte(r2)     // Catch: java.lang.Throwable -> L6b
            r0.writeByte(r2)     // Catch: java.lang.Throwable -> L6b
            java.util.LinkedHashMap r3 = r10.Y     // Catch: java.lang.Throwable -> L6b
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L6b
        L48:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r4 == 0) goto L8f
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L6b
            ek1 r4 = (defpackage.ek1) r4     // Catch: java.lang.Throwable -> L6b
            bk1 r5 = r4.g     // Catch: java.lang.Throwable -> L6b
            r6 = 32
            if (r5 == 0) goto L6d
            java.lang.String r5 = "DIRTY"
            r0.H(r5)     // Catch: java.lang.Throwable -> L6b
            r0.writeByte(r6)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = r4.a     // Catch: java.lang.Throwable -> L6b
            r0.H(r4)     // Catch: java.lang.Throwable -> L6b
            r0.writeByte(r2)     // Catch: java.lang.Throwable -> L6b
            goto L48
        L6b:
            r2 = move-exception
            goto L96
        L6d:
            java.lang.String r5 = "CLEAN"
            r0.H(r5)     // Catch: java.lang.Throwable -> L6b
            r0.writeByte(r6)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r5 = r4.a     // Catch: java.lang.Throwable -> L6b
            r0.H(r5)     // Catch: java.lang.Throwable -> L6b
            long[] r4 = r4.b     // Catch: java.lang.Throwable -> L6b
            int r5 = r4.length     // Catch: java.lang.Throwable -> L6b
            r7 = r1
        L7e:
            if (r7 >= r5) goto L8b
            r8 = r4[r7]     // Catch: java.lang.Throwable -> L6b
            r0.writeByte(r6)     // Catch: java.lang.Throwable -> L6b
            r0.h0(r8)     // Catch: java.lang.Throwable -> L6b
            int r7 = r7 + 1
            goto L7e
        L8b:
            r0.writeByte(r2)     // Catch: java.lang.Throwable -> L6b
            goto L48
        L8f:
            r0.close()     // Catch: java.lang.Throwable -> L94
            r0 = 0
            goto L9f
        L94:
            r0 = move-exception
            goto L9f
        L96:
            r0.close()     // Catch: java.lang.Throwable -> L9a
            goto L9e
        L9a:
            r0 = move-exception
            defpackage.mb3.q(r2, r0)     // Catch: java.lang.Throwable -> L9
        L9e:
            r0 = r2
        L9f:
            if (r0 != 0) goto Lf5
            jk1 r0 = r10.l0     // Catch: java.lang.Throwable -> L9
            lt4 r2 = r10.L     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.v(r2)     // Catch: java.lang.Throwable -> L9
            jk1 r2 = r10.l0
            if (r0 == 0) goto Lc5
            lt4 r0 = r10.L     // Catch: java.lang.Throwable -> L9
            lt4 r3 = r10.X     // Catch: java.lang.Throwable -> L9
            r2.h(r0, r3)     // Catch: java.lang.Throwable -> L9
            jk1 r0 = r10.l0     // Catch: java.lang.Throwable -> L9
            lt4 r2 = r10.R     // Catch: java.lang.Throwable -> L9
            lt4 r3 = r10.L     // Catch: java.lang.Throwable -> L9
            r0.h(r2, r3)     // Catch: java.lang.Throwable -> L9
            jk1 r0 = r10.l0     // Catch: java.lang.Throwable -> L9
            lt4 r2 = r10.X     // Catch: java.lang.Throwable -> L9
            r0.u(r2)     // Catch: java.lang.Throwable -> L9
            goto Lcc
        Lc5:
            lt4 r0 = r10.R     // Catch: java.lang.Throwable -> L9
            lt4 r3 = r10.L     // Catch: java.lang.Throwable -> L9
            r2.h(r0, r3)     // Catch: java.lang.Throwable -> L9
        Lcc:
            jk1 r0 = r10.l0     // Catch: java.lang.Throwable -> L9
            lt4 r2 = r10.L     // Catch: java.lang.Throwable -> L9
            r0.getClass()     // Catch: java.lang.Throwable -> L9
            r2.getClass()     // Catch: java.lang.Throwable -> L9
            ui6 r0 = r0.e(r2)     // Catch: java.lang.Throwable -> L9
            v92 r2 = new v92     // Catch: java.lang.Throwable -> L9
            k0 r3 = new k0     // Catch: java.lang.Throwable -> L9
            r4 = 20
            r3.<init>(r10, r4)     // Catch: java.lang.Throwable -> L9
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L9
            ee5 r0 = new ee5     // Catch: java.lang.Throwable -> L9
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L9
            r10.f0 = r0     // Catch: java.lang.Throwable -> L9
            r10.e0 = r1     // Catch: java.lang.Throwable -> L9
            r10.g0 = r1     // Catch: java.lang.Throwable -> L9
            r10.k0 = r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r10)
            return
        Lf5:
            throw r0     // Catch: java.lang.Throwable -> L9
        Lf6:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.h0     // Catch: java.lang.Throwable -> L34
            r1 = 1
            if (r0 == 0) goto L4d
            boolean r0 = r7.i0     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto Lb
            goto L4d
        Lb:
            java.util.LinkedHashMap r0 = r7.Y     // Catch: java.lang.Throwable -> L34
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L34
            r2 = 0
            ek1[] r3 = new defpackage.ek1[r2]     // Catch: java.lang.Throwable -> L34
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch: java.lang.Throwable -> L34
            ek1[] r0 = (defpackage.ek1[]) r0     // Catch: java.lang.Throwable -> L34
            int r3 = r0.length     // Catch: java.lang.Throwable -> L34
        L1b:
            if (r2 >= r3) goto L36
            r4 = r0[r2]     // Catch: java.lang.Throwable -> L34
            bk1 r4 = r4.g     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L31
            java.lang.Object r5 = r4.L     // Catch: java.lang.Throwable -> L34
            ek1 r5 = (defpackage.ek1) r5     // Catch: java.lang.Throwable -> L34
            bk1 r6 = r5.g     // Catch: java.lang.Throwable -> L34
            boolean r4 = defpackage.nb3.k(r6, r4)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L31
            r5.f = r1     // Catch: java.lang.Throwable -> L34
        L31:
            int r2 = r2 + 1
            goto L1b
        L34:
            r0 = move-exception
            goto L51
        L36:
            r7.D()     // Catch: java.lang.Throwable -> L34
            o41 r0 = r7.Z     // Catch: java.lang.Throwable -> L34
            r2 = 0
            defpackage.g04.x(r0, r2)     // Catch: java.lang.Throwable -> L34
            ee5 r0 = r7.f0     // Catch: java.lang.Throwable -> L34
            r0.getClass()     // Catch: java.lang.Throwable -> L34
            r0.close()     // Catch: java.lang.Throwable -> L34
            r7.f0 = r2     // Catch: java.lang.Throwable -> L34
            r7.i0 = r1     // Catch: java.lang.Throwable -> L34
            monitor-exit(r7)
            return
        L4d:
            r7.i0 = r1     // Catch: java.lang.Throwable -> L34
            monitor-exit(r7)
            return
        L51:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L34
            throw r0
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.h0     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            boolean r0 = r2.i0     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1a
            r2.D()     // Catch: java.lang.Throwable -> L18
            ee5 r0 = r2.f0     // Catch: java.lang.Throwable -> L18
            r0.getClass()     // Catch: java.lang.Throwable -> L18
            r0.flush()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            return
        L18:
            r0 = move-exception
            goto L22
        L1a:
            java.lang.String r0 = "cache is closed"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L18
            throw r1     // Catch: java.lang.Throwable -> L18
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    public final synchronized defpackage.bk1 h(java.lang.String r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.i0     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L6b
            F(r5)     // Catch: java.lang.Throwable -> L19
            r4.n()     // Catch: java.lang.Throwable -> L19
            java.util.LinkedHashMap r0 = r4.Y     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L19
            ek1 r0 = (defpackage.ek1) r0     // Catch: java.lang.Throwable -> L19
            r1 = 0
            if (r0 == 0) goto L1b
            bk1 r2 = r0.g     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r5 = move-exception
            goto L73
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L20
            monitor-exit(r4)
            return r1
        L20:
            if (r0 == 0) goto L28
            int r2 = r0.h     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L28
            monitor-exit(r4)
            return r1
        L28:
            boolean r2 = r4.j0     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L66
            boolean r2 = r4.k0     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L31
            goto L66
        L31:
            ee5 r2 = r4.f0     // Catch: java.lang.Throwable -> L19
            r2.getClass()     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "DIRTY"
            r2.H(r3)     // Catch: java.lang.Throwable -> L19
            r3 = 32
            r2.writeByte(r3)     // Catch: java.lang.Throwable -> L19
            r2.H(r5)     // Catch: java.lang.Throwable -> L19
            r3 = 10
            r2.writeByte(r3)     // Catch: java.lang.Throwable -> L19
            r2.flush()     // Catch: java.lang.Throwable -> L19
            boolean r2 = r4.g0     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L51
            monitor-exit(r4)
            return r1
        L51:
            if (r0 != 0) goto L5d
            ek1 r0 = new ek1     // Catch: java.lang.Throwable -> L19
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L19
            java.util.LinkedHashMap r1 = r4.Y     // Catch: java.lang.Throwable -> L19
            r1.put(r5, r0)     // Catch: java.lang.Throwable -> L19
        L5d:
            bk1 r5 = new bk1     // Catch: java.lang.Throwable -> L19
            r5.<init>(r4, r0)     // Catch: java.lang.Throwable -> L19
            r0.g = r5     // Catch: java.lang.Throwable -> L19
            monitor-exit(r4)
            return r5
        L66:
            r4.r()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r4)
            return r1
        L6b:
            java.lang.String r5 = "cache is closed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L19
            throw r0     // Catch: java.lang.Throwable -> L19
        L73:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r5
    }

    public final synchronized defpackage.gk1 k(java.lang.String r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.i0     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L4e
            F(r5)     // Catch: java.lang.Throwable -> L47
            r4.n()     // Catch: java.lang.Throwable -> L47
            java.util.LinkedHashMap r0 = r4.Y     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L47
            ek1 r0 = (defpackage.ek1) r0     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L4b
            gk1 r0 = r0.a()     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L1c
            goto L4b
        L1c:
            int r1 = r4.e0     // Catch: java.lang.Throwable -> L47
            r2 = 1
            int r1 = r1 + r2
            r4.e0 = r1     // Catch: java.lang.Throwable -> L47
            ee5 r1 = r4.f0     // Catch: java.lang.Throwable -> L47
            r1.getClass()     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = "READ"
            r1.H(r3)     // Catch: java.lang.Throwable -> L47
            r3 = 32
            r1.writeByte(r3)     // Catch: java.lang.Throwable -> L47
            r1.H(r5)     // Catch: java.lang.Throwable -> L47
            r5 = 10
            r1.writeByte(r5)     // Catch: java.lang.Throwable -> L47
            int r5 = r4.e0     // Catch: java.lang.Throwable -> L47
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r5 < r1) goto L40
            goto L41
        L40:
            r2 = 0
        L41:
            if (r2 == 0) goto L49
            r4.r()     // Catch: java.lang.Throwable -> L47
            goto L49
        L47:
            r5 = move-exception
            goto L56
        L49:
            monitor-exit(r4)
            return r0
        L4b:
            monitor-exit(r4)
            r4 = 0
            return r4
        L4e:
            java.lang.String r5 = "cache is closed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L47
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L47
            throw r0     // Catch: java.lang.Throwable -> L47
        L56:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L47
            throw r5
    }

    public final synchronized void n() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.h0     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L7
            monitor-exit(r4)
            return
        L7:
            jk1 r0 = r4.l0     // Catch: java.lang.Throwable -> L2a
            lt4 r1 = r4.R     // Catch: java.lang.Throwable -> L2a
            r0.u(r1)     // Catch: java.lang.Throwable -> L2a
            jk1 r0 = r4.l0     // Catch: java.lang.Throwable -> L2a
            lt4 r1 = r4.X     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r0.v(r1)     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L31
            jk1 r0 = r4.l0     // Catch: java.lang.Throwable -> L2a
            lt4 r1 = r4.L     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r0.v(r1)     // Catch: java.lang.Throwable -> L2a
            jk1 r1 = r4.l0
            lt4 r2 = r4.X
            if (r0 == 0) goto L2c
            r1.u(r2)     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r0 = move-exception
            goto L5f
        L2c:
            lt4 r0 = r4.L     // Catch: java.lang.Throwable -> L2a
            r1.h(r2, r0)     // Catch: java.lang.Throwable -> L2a
        L31:
            jk1 r0 = r4.l0     // Catch: java.lang.Throwable -> L2a
            lt4 r1 = r4.L     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r0.v(r1)     // Catch: java.lang.Throwable -> L2a
            r1 = 1
            if (r0 == 0) goto L58
            r4.v()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L46
            r4.u()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L46
            r4.h0 = r1     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L46
            monitor-exit(r4)
            return
        L46:
            r0 = 0
            r4.close()     // Catch: java.lang.Throwable -> L54
            jk1 r2 = r4.l0     // Catch: java.lang.Throwable -> L54
            lt4 r3 = r4.A     // Catch: java.lang.Throwable -> L54
            defpackage.u24.i(r2, r3)     // Catch: java.lang.Throwable -> L54
            r4.i0 = r0     // Catch: java.lang.Throwable -> L2a
            goto L58
        L54:
            r1 = move-exception
            r4.i0 = r0     // Catch: java.lang.Throwable -> L2a
            throw r1     // Catch: java.lang.Throwable -> L2a
        L58:
            r4.J()     // Catch: java.lang.Throwable -> L2a
            r4.h0 = r1     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r4)
            return
        L5f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            throw r0
    }

    public final void r() {
            r3 = this;
            y3 r0 = new y3
            r1 = 9
            r2 = 0
            r0.<init>(r3, r2, r1)
            r1 = 3
            o41 r3 = r3.Z
            defpackage.hv.L(r3, r2, r2, r0, r1)
            return
    }

    public final void u() {
            r9 = this;
            java.util.LinkedHashMap r0 = r9.Y
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r0.next()
            ek1 r3 = (defpackage.ek1) r3
            bk1 r4 = r3.g
            r5 = 2
            r6 = 0
            if (r4 != 0) goto L28
        L1e:
            if (r6 >= r5) goto Lc
            long[] r4 = r3.b
            r7 = r4[r6]
            long r1 = r1 + r7
            int r6 = r6 + 1
            goto L1e
        L28:
            r4 = 0
            r3.g = r4
        L2b:
            if (r6 >= r5) goto L48
            java.util.ArrayList r4 = r3.c
            java.lang.Object r4 = r4.get(r6)
            lt4 r4 = (defpackage.lt4) r4
            jk1 r7 = r9.l0
            r7.u(r4)
            java.util.ArrayList r4 = r3.d
            java.lang.Object r4 = r4.get(r6)
            lt4 r4 = (defpackage.lt4) r4
            r7.u(r4)
            int r6 = r6 + 1
            goto L2b
        L48:
            r0.remove()
            goto Lc
        L4c:
            r9.d0 = r1
            return
    }

    public final void v() {
            r13 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            jk1 r2 = r13.l0
            lt4 r3 = r13.L
            in6 r4 = r2.N(r3)
            fe5 r4 = defpackage.hi2.u(r4)
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r7 = r4.y(r5)     // Catch: java.lang.Throwable -> L60
            java.lang.String r8 = r4.y(r5)     // Catch: java.lang.Throwable -> L60
            java.lang.String r9 = r4.y(r5)     // Catch: java.lang.Throwable -> L60
            java.lang.String r10 = r4.y(r5)     // Catch: java.lang.Throwable -> L60
            java.lang.String r11 = r4.y(r5)     // Catch: java.lang.Throwable -> L60
            java.lang.String r12 = "libcore.io.DiskLruCache"
            boolean r12 = r12.equals(r7)     // Catch: java.lang.Throwable -> L60
            if (r12 == 0) goto L99
            java.lang.String r12 = "1"
            boolean r12 = r12.equals(r8)     // Catch: java.lang.Throwable -> L60
            if (r12 == 0) goto L99
            r12 = 1
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L60
            boolean r12 = defpackage.nb3.k(r12, r9)     // Catch: java.lang.Throwable -> L60
            if (r12 == 0) goto L99
            r12 = 2
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L60
            boolean r12 = defpackage.nb3.k(r12, r10)     // Catch: java.lang.Throwable -> L60
            if (r12 == 0) goto L99
            int r12 = r11.length()     // Catch: java.lang.Throwable -> L60
            if (r12 > 0) goto L99
            r0 = 0
        L56:
            java.lang.String r1 = r4.y(r5)     // Catch: java.lang.Throwable -> L60 java.io.EOFException -> L62
            r13.x(r1)     // Catch: java.lang.Throwable -> L60 java.io.EOFException -> L62
            int r0 = r0 + 1
            goto L56
        L60:
            r13 = move-exception
            goto Lc8
        L62:
            java.util.LinkedHashMap r1 = r13.Y     // Catch: java.lang.Throwable -> L60
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L60
            int r0 = r0 - r1
            r13.e0 = r0     // Catch: java.lang.Throwable -> L60
            boolean r0 = r4.e()     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto L75
            r13.J()     // Catch: java.lang.Throwable -> L60
            goto L92
        L75:
            r2.getClass()     // Catch: java.lang.Throwable -> L60
            r3.getClass()     // Catch: java.lang.Throwable -> L60
            ui6 r0 = r2.e(r3)     // Catch: java.lang.Throwable -> L60
            v92 r1 = new v92     // Catch: java.lang.Throwable -> L60
            k0 r2 = new k0     // Catch: java.lang.Throwable -> L60
            r3 = 20
            r2.<init>(r13, r3)     // Catch: java.lang.Throwable -> L60
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L60
            ee5 r0 = new ee5     // Catch: java.lang.Throwable -> L60
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L60
            r13.f0 = r0     // Catch: java.lang.Throwable -> L60
        L92:
            r4.close()     // Catch: java.lang.Throwable -> L97
            r13 = 0
            goto Ld0
        L97:
            r13 = move-exception
            goto Ld0
        L99:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L60
            r2.append(r7)     // Catch: java.lang.Throwable -> L60
            r2.append(r0)     // Catch: java.lang.Throwable -> L60
            r2.append(r8)     // Catch: java.lang.Throwable -> L60
            r2.append(r0)     // Catch: java.lang.Throwable -> L60
            r2.append(r9)     // Catch: java.lang.Throwable -> L60
            r2.append(r0)     // Catch: java.lang.Throwable -> L60
            r2.append(r10)     // Catch: java.lang.Throwable -> L60
            r2.append(r0)     // Catch: java.lang.Throwable -> L60
            r2.append(r11)     // Catch: java.lang.Throwable -> L60
            r0 = 93
            r2.append(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L60
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L60
            throw r13     // Catch: java.lang.Throwable -> L60
        Lc8:
            r4.close()     // Catch: java.lang.Throwable -> Lcc
            goto Ld0
        Lcc:
            r0 = move-exception
            defpackage.mb3.q(r13, r0)
        Ld0:
            if (r13 != 0) goto Ld3
            return
        Ld3:
            throw r13
    }

    public final void x(java.lang.String r12) {
            r11 = this;
            r0 = 32
            r1 = 0
            r2 = 6
            int r3 = defpackage.qs6.s0(r0, r1, r2, r12)
            java.lang.String r4 = "unexpected journal line: "
            r5 = -1
            if (r3 == r5) goto Lad
            int r6 = r3 + 1
            r7 = 4
            int r8 = defpackage.qs6.s0(r0, r6, r7, r12)
            java.util.LinkedHashMap r9 = r11.Y
            if (r8 != r5) goto L2a
            java.lang.String r6 = r12.substring(r6)
            if (r3 != r2) goto L2e
            java.lang.String r10 = "REMOVE"
            boolean r10 = defpackage.xs6.g0(r12, r10, r1)
            if (r10 == 0) goto L2e
            r9.remove(r6)
            return
        L2a:
            java.lang.String r6 = r12.substring(r6, r8)
        L2e:
            java.lang.Object r10 = r9.get(r6)
            if (r10 != 0) goto L3c
            ek1 r10 = new ek1
            r10.<init>(r11, r6)
            r9.put(r6, r10)
        L3c:
            ek1 r10 = (defpackage.ek1) r10
            r6 = 5
            if (r8 == r5) goto L84
            if (r3 != r6) goto L84
            java.lang.String r9 = "CLEAN"
            boolean r9 = defpackage.xs6.g0(r12, r9, r1)
            if (r9 == 0) goto L84
            r11 = 1
            int r8 = r8 + r11
            java.lang.String r12 = r12.substring(r8)
            char[] r3 = new char[r11]
            r3[r1] = r0
            java.util.List r12 = defpackage.qs6.J0(r12, r3, r2)
            r10.e = r11
            r11 = 0
            r10.g = r11
            int r11 = r12.size()
            r0 = 2
            if (r11 != r0) goto L80
            int r11 = r12.size()     // Catch: java.lang.NumberFormatException -> L7c
        L69:
            if (r1 >= r11) goto La4
            long[] r0 = r10.b     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.Object r2 = r12.get(r1)     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NumberFormatException -> L7c
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L7c
            r0[r1] = r2     // Catch: java.lang.NumberFormatException -> L7c
            int r1 = r1 + 1
            goto L69
        L7c:
            defpackage.fa6.d(r12, r4)
            return
        L80:
            defpackage.fa6.d(r12, r4)
            return
        L84:
            if (r8 != r5) goto L98
            if (r3 != r6) goto L98
            java.lang.String r0 = "DIRTY"
            boolean r0 = defpackage.xs6.g0(r12, r0, r1)
            if (r0 == 0) goto L98
            bk1 r12 = new bk1
            r12.<init>(r11, r10)
            r10.g = r12
            return
        L98:
            if (r8 != r5) goto La5
            if (r3 != r7) goto La5
            java.lang.String r11 = "READ"
            boolean r11 = defpackage.xs6.g0(r12, r11, r1)
            if (r11 == 0) goto La5
        La4:
            return
        La5:
            java.lang.String r11 = r4.concat(r12)
            defpackage.e41.i(r11)
            return
        Lad:
            java.lang.String r11 = r4.concat(r12)
            defpackage.e41.i(r11)
            return
    }
}
