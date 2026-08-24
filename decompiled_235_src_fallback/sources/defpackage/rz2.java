package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rz2  reason: default package */
/* loaded from: classes.dex */
public final class rz2 implements defpackage.v62 {
    public static final java.util.List g = null;
    public static final java.util.List h = null;
    public final defpackage.ke5 a;
    public final defpackage.dp3 b;
    public final defpackage.qz2 c;
    public volatile defpackage.xz2 d;
    public final defpackage.k55 e;
    public volatile boolean f;

    static {
            java.lang.String r10 = ":scheme"
            java.lang.String r11 = ":authority"
            java.lang.String r0 = "connection"
            java.lang.String r1 = "host"
            java.lang.String r2 = "keep-alive"
            java.lang.String r3 = "proxy-connection"
            java.lang.String r4 = "te"
            java.lang.String r5 = "transfer-encoding"
            java.lang.String r6 = "encoding"
            java.lang.String r7 = "upgrade"
            java.lang.String r8 = ":method"
            java.lang.String r9 = ":path"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.util.List r0 = defpackage.az7.k(r0)
            defpackage.rz2.g = r0
            java.lang.String r7 = "encoding"
            java.lang.String r8 = "upgrade"
            java.lang.String r1 = "connection"
            java.lang.String r2 = "host"
            java.lang.String r3 = "keep-alive"
            java.lang.String r4 = "proxy-connection"
            java.lang.String r5 = "te"
            java.lang.String r6 = "transfer-encoding"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.List r0 = defpackage.az7.k(r0)
            defpackage.rz2.h = r0
            return
    }

    public rz2(defpackage.xk4 r1, defpackage.ke5 r2, defpackage.dp3 r3, defpackage.qz2 r4) {
            r0 = this;
            r1.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r2
            r0.b = r3
            r0.c = r4
            java.util.List r1 = r1.s
            k55 r2 = defpackage.k55.H2_PRIOR_KNOWLEDGE
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L1a
            goto L1c
        L1a:
            k55 r2 = defpackage.k55.HTTP_2
        L1c:
            r0.e = r2
            return
    }

    @Override // defpackage.v62
    public final defpackage.in6 a(defpackage.wl5 r1) {
            r0 = this;
            xz2 r0 = r0.d
            r0.getClass()
            vz2 r0 = r0.d0
            return r0
    }

    @Override // defpackage.v62
    public final void b() {
            r0 = this;
            xz2 r0 = r0.d
            r0.getClass()
            uz2 r0 = r0.e0
            r0.close()
            return
    }

    @Override // defpackage.v62
    public final boolean c() {
            r4 = this;
            xz2 r4 = r4.d
            r0 = 0
            if (r4 == 0) goto L20
            monitor-enter(r4)
            vz2 r1 = r4.d0     // Catch: java.lang.Throwable -> L17
            boolean r2 = r1.B     // Catch: java.lang.Throwable -> L17
            r3 = 1
            if (r2 == 0) goto L19
            k80 r1 = r1.R     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.u()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            r1 = r3
            goto L1a
        L17:
            r0 = move-exception
            goto L1e
        L19:
            r1 = r0
        L1a:
            monitor-exit(r4)
            if (r1 != r3) goto L20
            return r3
        L1e:
            monitor-exit(r4)
            throw r0
        L20:
            return r0
    }

    @Override // defpackage.v62
    public final void cancel() {
            r1 = this;
            r0 = 1
            r1.f = r0
            xz2 r1 = r1.d
            if (r1 == 0) goto Lc
            a62 r0 = defpackage.a62.CANCEL
            r1.e(r0)
        Lc:
            return
    }

    @Override // defpackage.v62
    public final long d(defpackage.wl5 r1) {
            r0 = this;
            boolean r0 = defpackage.zz2.a(r1)
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            long r0 = defpackage.az7.e(r1)
            return r0
    }

    @Override // defpackage.v62
    public final defpackage.ui6 e(defpackage.pa r1, long r2) {
            r0 = this;
            r1.getClass()
            xz2 r0 = r0.d
            r0.getClass()
            uz2 r0 = r0.e0
            return r0
    }

    @Override // defpackage.v62
    public final defpackage.ul5 f(boolean r11) {
            r10 = this;
            xz2 r0 = r10.d
            r1 = 0
            if (r0 == 0) goto L103
            monitor-enter(r0)
        L6:
            java.util.ArrayDeque r2 = r0.Y     // Catch: java.lang.Throwable -> L36
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L36
            r3 = 0
            if (r2 == 0) goto L5b
            a62 r2 = r0.f()     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L5b
            r2 = 1
            if (r11 != 0) goto L2d
            qz2 r4 = r0.B     // Catch: java.lang.Throwable -> L36
            r4.getClass()     // Catch: java.lang.Throwable -> L36
            uz2 r4 = r0.e0     // Catch: java.lang.Throwable -> L36
            boolean r5 = r4.L     // Catch: java.lang.Throwable -> L36
            if (r5 != 0) goto L2a
            boolean r4 = r4.A     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r4 = r3
            goto L2b
        L2a:
            r4 = r2
        L2b:
            if (r4 == 0) goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L39
            wz2 r2 = r0.f0     // Catch: java.lang.Throwable -> L36
            r2.i()     // Catch: java.lang.Throwable -> L36
            goto L39
        L36:
            r10 = move-exception
            goto L101
        L39:
            r0.wait()     // Catch: java.lang.Throwable -> L44 java.lang.InterruptedException -> L46
            if (r3 == 0) goto L6
            wz2 r2 = r0.f0     // Catch: java.lang.Throwable -> L36
            r2.m()     // Catch: java.lang.Throwable -> L36
            goto L6
        L44:
            r10 = move-exception
            goto L53
        L46:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L44
            r10.interrupt()     // Catch: java.lang.Throwable -> L44
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L44
            r10.<init>()     // Catch: java.lang.Throwable -> L44
            throw r10     // Catch: java.lang.Throwable -> L44
        L53:
            if (r3 == 0) goto L5a
            wz2 r11 = r0.f0     // Catch: java.lang.Throwable -> L36
            r11.m()     // Catch: java.lang.Throwable -> L36
        L5a:
            throw r10     // Catch: java.lang.Throwable -> L36
        L5b:
            java.util.ArrayDeque r2 = r0.Y     // Catch: java.lang.Throwable -> L36
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto Lef
            java.util.ArrayDeque r2 = r0.Y     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r2.removeFirst()     // Catch: java.lang.Throwable -> L36
            r2.getClass()     // Catch: java.lang.Throwable -> L36
            yw2 r2 = (defpackage.yw2) r2     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)
            k55 r10 = r10.e
            r10.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r4 = 20
            r0.<init>(r4)
            int r4 = r2.size()
            r6 = r1
            r5 = r3
        L81:
            if (r5 >= r4) goto Lb7
            java.lang.String r7 = r2.b(r5)
            java.lang.String r8 = r2.d(r5)
            java.lang.String r9 = ":status"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L9e
            java.lang.String r6 = "HTTP/1.1 "
            java.lang.String r6 = r6.concat(r8)
            ei r6 = defpackage.xk2.E(r6)
            goto Lb4
        L9e:
            java.util.List r9 = defpackage.rz2.h
            boolean r9 = r9.contains(r7)
            if (r9 != 0) goto Lb4
            r0.add(r7)
            java.lang.CharSequence r7 = defpackage.qs6.T0(r8)
            java.lang.String r7 = r7.toString()
            r0.add(r7)
        Lb4:
            int r5 = r5 + 1
            goto L81
        Lb7:
            if (r6 == 0) goto Le7
            ul5 r2 = new ul5
            r2.<init>()
            r2.b = r10
            int r10 = r6.B
            r2.c = r10
            java.lang.Object r10 = r6.R
            java.lang.String r10 = (java.lang.String) r10
            r2.d = r10
            yw2 r10 = new yw2
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r0 = r0.toArray(r3)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r10.<init>(r0)
            ww2 r10 = r10.c()
            r2.f = r10
            if (r11 == 0) goto Le6
            int r10 = r2.c
            r11 = 100
            if (r10 != r11) goto Le6
            return r1
        Le6:
            return r2
        Le7:
            java.net.ProtocolException r10 = new java.net.ProtocolException
            java.lang.String r11 = "Expected ':status' header not present"
            r10.<init>(r11)
            throw r10
        Lef:
            java.io.IOException r10 = r0.i0     // Catch: java.lang.Throwable -> L36
            if (r10 == 0) goto Lf4
            goto L100
        Lf4:
            lr6 r10 = new lr6     // Catch: java.lang.Throwable -> L36
            a62 r11 = r0.f()     // Catch: java.lang.Throwable -> L36
            r11.getClass()     // Catch: java.lang.Throwable -> L36
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L36
        L100:
            throw r10     // Catch: java.lang.Throwable -> L36
        L101:
            monitor-exit(r0)
            throw r10
        L103:
            java.lang.String r10 = "stream wasn't created"
            defpackage.e41.i(r10)
            return r1
    }

    @Override // defpackage.v62
    public final void g() {
            r0 = this;
            qz2 r0 = r0.c
            r0.flush()
            return
    }

    @Override // defpackage.v62
    public final defpackage.rm6 h() {
            r0 = this;
            xz2 r0 = r0.d
            r0.getClass()
            return r0
    }

    @Override // defpackage.v62
    public final defpackage.u62 i() {
            r0 = this;
            ke5 r0 = r0.a
            return r0
    }

    @Override // defpackage.v62
    public final void j(defpackage.pa r15) {
            r14 = this;
            r15.getClass()
            xz2 r0 = r14.d
            if (r0 == 0) goto L8
            return
        L8:
            java.lang.Object r0 = r15.X
            mk5 r0 = (defpackage.mk5) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L12
            r0 = r2
            goto L13
        L12:
            r0 = r1
        L13:
            java.lang.Object r3 = r15.R
            yw2 r3 = (defpackage.yw2) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r3.size()
            int r5 = r5 + 4
            r4.<init>(r5)
            uw2 r5 = new uw2
            da0 r6 = defpackage.uw2.f
            java.lang.Object r7 = r15.L
            java.lang.String r7 = (java.lang.String) r7
            r5.<init>(r6, r7)
            r4.add(r5)
            uw2 r5 = new uw2
            da0 r6 = defpackage.uw2.g
            java.lang.Object r15 = r15.B
            i03 r15 = (defpackage.i03) r15
            r15.getClass()
            java.lang.String r7 = r15.b()
            java.lang.String r8 = r15.d()
            if (r8 == 0) goto L59
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r7 = 63
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
        L59:
            r5.<init>(r6, r7)
            r4.add(r5)
            java.lang.String r5 = "Host"
            java.lang.String r5 = r3.a(r5)
            if (r5 == 0) goto L71
            uw2 r6 = new uw2
            da0 r7 = defpackage.uw2.i
            r6.<init>(r7, r5)
            r4.add(r6)
        L71:
            uw2 r5 = new uw2
            da0 r6 = defpackage.uw2.h
            java.lang.String r15 = r15.a
            r5.<init>(r6, r15)
            r4.add(r5)
            int r15 = r3.size()
            r5 = r1
        L82:
            if (r5 >= r15) goto Lbf
            java.lang.String r6 = r3.b(r5)
            java.util.Locale r7 = java.util.Locale.US
            r7.getClass()
            java.lang.String r6 = r6.toLowerCase(r7)
            r6.getClass()
            java.util.List r7 = defpackage.rz2.g
            boolean r7 = r7.contains(r6)
            if (r7 == 0) goto Lb0
            java.lang.String r7 = "te"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto Lbc
            java.lang.String r7 = r3.d(r5)
            java.lang.String r8 = "trailers"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto Lbc
        Lb0:
            uw2 r7 = new uw2
            java.lang.String r8 = r3.d(r5)
            r7.<init>(r6, r8)
            r4.add(r7)
        Lbc:
            int r5 = r5 + 1
            goto L82
        Lbf:
            qz2 r8 = r14.c
            r8.getClass()
            r9 = r0 ^ 1
            yz2 r15 = r8.s0
            monitor-enter(r15)
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L151
            int r3 = r8.X     // Catch: java.lang.Throwable -> Ld7
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r3 <= r5) goto Ldb
            a62 r3 = defpackage.a62.REFUSED_STREAM     // Catch: java.lang.Throwable -> Ld7
            r8.n(r3)     // Catch: java.lang.Throwable -> Ld7
            goto Ldb
        Ld7:
            r0 = move-exception
            r14 = r0
            goto L15a
        Ldb:
            boolean r3 = r8.Y     // Catch: java.lang.Throwable -> Ld7
            if (r3 != 0) goto L154
            int r7 = r8.X     // Catch: java.lang.Throwable -> Ld7
            int r3 = r7 + 2
            r8.X = r3     // Catch: java.lang.Throwable -> Ld7
            xz2 r6 = new xz2     // Catch: java.lang.Throwable -> Ld7
            r11 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto Lfe
            long r10 = r8.p0     // Catch: java.lang.Throwable -> Ld7
            long r12 = r8.q0     // Catch: java.lang.Throwable -> Ld7
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 >= 0) goto Lfe
            long r10 = r6.R     // Catch: java.lang.Throwable -> Ld7
            long r12 = r6.X     // Catch: java.lang.Throwable -> Ld7
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto Lff
        Lfe:
            r1 = r2
        Lff:
            boolean r0 = r6.h()     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L10e
            java.util.LinkedHashMap r0 = r8.B     // Catch: java.lang.Throwable -> Ld7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Ld7
            r0.put(r2, r6)     // Catch: java.lang.Throwable -> Ld7
        L10e:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L151
            yz2 r0 = r8.s0     // Catch: java.lang.Throwable -> L151
            r0.r(r9, r7, r4)     // Catch: java.lang.Throwable -> L151
            monitor-exit(r15)
            if (r1 == 0) goto L11c
            yz2 r15 = r8.s0
            r15.flush()
        L11c:
            r14.d = r6
            boolean r15 = r14.f
            xz2 r0 = r14.d
            if (r15 != 0) goto L143
            r0.getClass()
            wz2 r15 = r0.f0
            dp3 r0 = r14.b
            int r0 = r0.d
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r15.g(r0, r2)
            xz2 r15 = r14.d
            r15.getClass()
            wz2 r15 = r15.g0
            dp3 r14 = r14.b
            int r14 = r14.e
            long r0 = (long) r14
            r15.g(r0, r2)
            return
        L143:
            r0.getClass()
            a62 r14 = defpackage.a62.CANCEL
            r0.e(r14)
            java.lang.String r14 = "Canceled"
            defpackage.e41.i(r14)
            return
        L151:
            r0 = move-exception
            r14 = r0
            goto L15c
        L154:
            vz0 r14 = new vz0     // Catch: java.lang.Throwable -> Ld7
            r14.<init>()     // Catch: java.lang.Throwable -> Ld7
            throw r14     // Catch: java.lang.Throwable -> Ld7
        L15a:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L151
            throw r14     // Catch: java.lang.Throwable -> L151
        L15c:
            monitor-exit(r15)
            throw r14
    }
}
