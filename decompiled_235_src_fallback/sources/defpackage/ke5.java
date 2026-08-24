package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ke5  reason: default package */
/* loaded from: classes.dex */
public final class ke5 extends defpackage.oz2 implements defpackage.u62 {
    public final defpackage.qz6 b;
    public final defpackage.b26 c;
    public final java.net.Socket d;
    public final java.net.Socket e;
    public final defpackage.pv2 f;
    public final defpackage.k55 g;
    public final defpackage.bt h;
    public defpackage.qz2 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final java.util.ArrayList p;
    public long q;

    public ke5(defpackage.qz6 r1, defpackage.ls1 r2, defpackage.b26 r3, java.net.Socket r4, java.net.Socket r5, defpackage.pv2 r6, defpackage.k55 r7, defpackage.bt r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r7.getClass()
            r8.getClass()
            r0.<init>()
            r0.b = r1
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r1 = 1
            r0.o = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.p = r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.q = r1
            return
    }

    public static void c(defpackage.xk4 r3, defpackage.b26 r4, java.io.IOException r5) {
            r3.getClass()
            r4.getClass()
            r5.getClass()
            java.net.Proxy r0 = r4.b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
            if (r0 == r1) goto L26
            ea r0 = r4.a
            java.net.ProxySelector r1 = r0.g
            i03 r0 = r0.h
            java.net.URI r0 = r0.h()
            java.net.Proxy r2 = r4.b
            java.net.SocketAddress r2 = r2.address()
            r1.connectFailed(r0, r2, r5)
        L26:
            il5 r3 = r3.B
            monitor-enter(r3)
            java.util.LinkedHashSet r5 = r3.b     // Catch: java.lang.Throwable -> L30
            r5.add(r4)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r3)
            return
        L30:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L30
            throw r4
    }

    @Override // defpackage.oz2
    public final void a(defpackage.qz2 r1, defpackage.fd6 r2) {
            r0 = this;
            r2.getClass()
            monitor-enter(r0)
            int r1 = r2.a     // Catch: java.lang.Throwable -> L17
            r1 = r1 & 8
            if (r1 == 0) goto L10
            int[] r1 = r2.b     // Catch: java.lang.Throwable -> L17
            r2 = 3
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L17
            goto L13
        L10:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L13:
            r0.o = r1     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return
        L17:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // defpackage.oz2
    public final void b(defpackage.xz2 r2) {
            r1 = this;
            a62 r1 = defpackage.a62.REFUSED_STREAM
            r0 = 0
            r2.c(r1, r0)
            return
    }

    @Override // defpackage.u62
    public final void cancel() {
            r0 = this;
            java.net.Socket r0 = r0.d
            defpackage.az7.c(r0)
            return
    }

    public final boolean d(defpackage.ea r9, java.util.List r10) {
            r8 = this;
            i03 r0 = r9.h
            java.util.TimeZone r1 = defpackage.az7.a
            java.util.ArrayList r1 = r8.p
            int r1 = r1.size()
            int r2 = r8.o
            r3 = 0
            if (r1 >= r2) goto Ld6
            boolean r1 = r8.j
            if (r1 == 0) goto L15
            goto Ld6
        L15:
            b26 r1 = r8.c
            ea r2 = r1.a
            ea r4 = r1.a
            boolean r2 = r2.a(r9)
            if (r2 != 0) goto L23
            goto Ld6
        L23:
            java.lang.String r2 = r0.d
            java.lang.String r5 = r0.d
            i03 r6 = r4.h
            java.lang.String r6 = r6.d
            boolean r2 = defpackage.nb3.k(r2, r6)
            if (r2 == 0) goto L33
            goto Lcb
        L33:
            qz2 r2 = r8.i
            if (r2 != 0) goto L39
            goto Ld6
        L39:
            if (r10 == 0) goto Ld6
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L43
            goto Ld6
        L43:
            java.util.Iterator r10 = r10.iterator()
        L47:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Ld6
            java.lang.Object r2 = r10.next()
            b26 r2 = (defpackage.b26) r2
            java.net.Proxy r6 = r2.b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L47
            java.net.Proxy r6 = r1.b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L47
            java.net.InetSocketAddress r6 = r1.c
            java.net.InetSocketAddress r2 = r2.c
            boolean r2 = defpackage.nb3.k(r6, r2)
            if (r2 == 0) goto L47
            javax.net.ssl.HostnameVerifier r10 = r9.d
            sk4 r1 = defpackage.sk4.a
            if (r10 == r1) goto L76
            goto Ld6
        L76:
            java.util.TimeZone r10 = defpackage.az7.a
            i03 r10 = r4.h
            int r0 = r0.e
            int r1 = r10.e
            if (r0 == r1) goto L81
            goto Ld6
        L81:
            java.lang.String r10 = r10.d
            boolean r10 = defpackage.nb3.k(r5, r10)
            pv2 r0 = r8.f
            if (r10 == 0) goto L8c
            goto Lab
        L8c:
            boolean r8 = r8.k
            if (r8 != 0) goto Ld6
            if (r0 == 0) goto Ld6
            java.util.List r8 = r0.a()
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto Ld6
            java.lang.Object r8 = r8.get(r3)
            r8.getClass()
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8
            boolean r8 = defpackage.sk4.c(r5, r8)
            if (r8 == 0) goto Ld6
        Lab:
            il0 r8 = r9.e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r8.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r0.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.util.List r9 = r0.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r5.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r9.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.util.Set r8 = r8.a     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.util.Iterator r8 = r8.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            boolean r9 = r8.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            if (r9 != 0) goto Lcd
        Lcb:
            r8 = 1
            return r8
        Lcd:
            java.lang.Object r8 = r8.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            defpackage.xg6.A(r8)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r8 = 0
            throw r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
        Ld6:
            return r3
    }

    @Override // defpackage.u62
    public final void e() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.j = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // defpackage.u62
    public final void f(defpackage.je5 r4, java.io.IOException r5) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r5 instanceof defpackage.lr6     // Catch: java.lang.Throwable -> L1e
            r1 = 1
            if (r0 == 0) goto L34
            r0 = r5
            lr6 r0 = (defpackage.lr6) r0     // Catch: java.lang.Throwable -> L1e
            a62 r0 = r0.A     // Catch: java.lang.Throwable -> L1e
            a62 r2 = defpackage.a62.REFUSED_STREAM     // Catch: java.lang.Throwable -> L1e
            if (r0 != r2) goto L20
            int r4 = r3.n     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + r1
            r3.n = r4     // Catch: java.lang.Throwable -> L1e
            if (r4 <= r1) goto L55
            r3.j = r1     // Catch: java.lang.Throwable -> L1e
            int r4 = r3.l     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + r1
            r3.l = r4     // Catch: java.lang.Throwable -> L1e
            goto L55
        L1e:
            r4 = move-exception
            goto L57
        L20:
            lr6 r5 = (defpackage.lr6) r5     // Catch: java.lang.Throwable -> L1e
            a62 r5 = r5.A     // Catch: java.lang.Throwable -> L1e
            a62 r0 = defpackage.a62.CANCEL     // Catch: java.lang.Throwable -> L1e
            if (r5 != r0) goto L2c
            boolean r4 = r4.m0     // Catch: java.lang.Throwable -> L1e
            if (r4 != 0) goto L55
        L2c:
            r3.j = r1     // Catch: java.lang.Throwable -> L1e
            int r4 = r3.l     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + r1
            r3.l = r4     // Catch: java.lang.Throwable -> L1e
            goto L55
        L34:
            qz2 r0 = r3.i     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L3a
            r0 = r1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            if (r0 == 0) goto L41
            boolean r0 = r5 instanceof defpackage.vz0     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L55
        L41:
            r3.j = r1     // Catch: java.lang.Throwable -> L1e
            int r0 = r3.m     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L55
            if (r5 == 0) goto L50
            xk4 r4 = r4.A     // Catch: java.lang.Throwable -> L1e
            b26 r0 = r3.c     // Catch: java.lang.Throwable -> L1e
            c(r4, r0, r5)     // Catch: java.lang.Throwable -> L1e
        L50:
            int r4 = r3.l     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + r1
            r3.l = r4     // Catch: java.lang.Throwable -> L1e
        L55:
            monitor-exit(r3)
            return
        L57:
            monitor-exit(r3)
            throw r4
    }

    public final boolean g(boolean r8) {
            r7 = this;
            java.util.TimeZone r0 = defpackage.az7.a
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r7.d
            boolean r2 = r2.isClosed()
            r3 = 0
            if (r2 != 0) goto L83
            java.net.Socket r2 = r7.e
            boolean r2 = r2.isClosed()
            if (r2 != 0) goto L83
            java.net.Socket r2 = r7.e
            boolean r2 = r2.isInputShutdown()
            if (r2 != 0) goto L83
            java.net.Socket r2 = r7.e
            boolean r2 = r2.isOutputShutdown()
            if (r2 == 0) goto L28
            goto L83
        L28:
            qz2 r2 = r7.i
            r4 = 1
            if (r2 == 0) goto L4a
            monitor-enter(r2)
            boolean r7 = r2.Y     // Catch: java.lang.Throwable -> L44
            if (r7 == 0) goto L34
            monitor-exit(r2)
            return r3
        L34:
            long r7 = r2.j0     // Catch: java.lang.Throwable -> L44
            long r5 = r2.i0     // Catch: java.lang.Throwable -> L44
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 >= 0) goto L46
            long r7 = r2.k0     // Catch: java.lang.Throwable -> L44
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L46
            monitor-exit(r2)
            return r3
        L44:
            r7 = move-exception
            goto L48
        L46:
            monitor-exit(r2)
            return r4
        L48:
            monitor-exit(r2)
            throw r7
        L4a:
            monitor-enter(r7)
            long r5 = r7.q     // Catch: java.lang.Throwable -> L80
            long r0 = r0 - r5
            monitor-exit(r7)
            r5 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L7f
            if (r8 == 0) goto L7f
            java.net.Socket r8 = r7.e
            bt r7 = r7.h
            java.lang.Object r7 = r7.L
            fe5 r7 = (defpackage.fe5) r7
            r8.getClass()
            r7.getClass()
            int r0 = r8.getSoTimeout()     // Catch: java.net.SocketTimeoutException -> L7d java.io.IOException -> L7e
            r8.setSoTimeout(r4)     // Catch: java.lang.Throwable -> L78
            boolean r7 = r7.e()     // Catch: java.lang.Throwable -> L78
            r7 = r7 ^ r4
            r8.setSoTimeout(r0)     // Catch: java.net.SocketTimeoutException -> L7d java.io.IOException -> L7e
            return r7
        L78:
            r7 = move-exception
            r8.setSoTimeout(r0)     // Catch: java.net.SocketTimeoutException -> L7d java.io.IOException -> L7e
            throw r7     // Catch: java.net.SocketTimeoutException -> L7d java.io.IOException -> L7e
        L7d:
            r3 = r4
        L7e:
            return r3
        L7f:
            return r4
        L80:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L83:
            return r3
    }

    @Override // defpackage.u62
    public final defpackage.b26 h() {
            r0 = this;
            b26 r0 = r0.c
            return r0
    }

    public final void i() {
            r7 = this;
            long r0 = java.lang.System.nanoTime()
            r7.q = r0
            k55 r0 = r7.g
            k55 r1 = defpackage.k55.HTTP_2
            if (r0 == r1) goto L12
            k55 r1 = defpackage.k55.H2_PRIOR_KNOWLEDGE
            if (r0 != r1) goto L11
            goto L12
        L11:
            return
        L12:
            java.net.Socket r0 = r7.e
            r1 = 0
            r0.setSoTimeout(r1)
            cs1 r0 = defpackage.cs1.Y
            oe2 r0 = defpackage.oe2.a
            s9 r2 = new s9
            qz6 r3 = r7.b
            r3.getClass()
            r2.<init>()
            r2.a = r3
            nz2 r3 = defpackage.oz2.a
            r2.d = r3
            oe2 r3 = defpackage.oe2.a
            r2.e = r3
            bt r3 = r7.h
            b26 r4 = r7.c
            ea r4 = r4.a
            i03 r4 = r4.h
            java.lang.String r4 = r4.d
            r3.getClass()
            r4.getClass()
            r2.b = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = defpackage.az7.b
            r3.append(r5)
            r5 = 32
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.c = r3
            r2.d = r7
            r2.e = r0
            qz2 r0 = new qz2
            r0.<init>(r2)
            r7.i = r0
            fd6 r2 = defpackage.qz2.v0
            int r3 = r2.a
            r3 = r3 & 8
            if (r3 == 0) goto L73
            int[] r2 = r2.b
            r3 = 3
            r2 = r2[r3]
            goto L76
        L73:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L76:
            r7.o = r2
            yz2 r7 = r0.s0
            java.lang.String r2 = ">> CONNECTION "
            monitor-enter(r7)
            boolean r3 = r7.R     // Catch: java.lang.Throwable -> La7
            if (r3 != 0) goto L12a
            java.util.logging.Logger r3 = defpackage.yz2.Y     // Catch: java.lang.Throwable -> La7
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> La7
            boolean r4 = r3.isLoggable(r4)     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto Laa
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r4.<init>(r2)     // Catch: java.lang.Throwable -> La7
            da0 r2 = defpackage.iz2.a     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = r2.e()     // Catch: java.lang.Throwable -> La7
            r4.append(r2)     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> La7
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = defpackage.az7.d(r2, r4)     // Catch: java.lang.Throwable -> La7
            r3.fine(r2)     // Catch: java.lang.Throwable -> La7
            goto Laa
        La7:
            r0 = move-exception
            goto L132
        Laa:
            y80 r2 = r7.A     // Catch: java.lang.Throwable -> La7
            da0 r3 = defpackage.iz2.a     // Catch: java.lang.Throwable -> La7
            r2.P(r3)     // Catch: java.lang.Throwable -> La7
            y80 r2 = r7.A     // Catch: java.lang.Throwable -> La7
            r2.flush()     // Catch: java.lang.Throwable -> La7
            monitor-exit(r7)
            yz2 r7 = r0.s0
            fd6 r2 = r0.m0
            r7.getClass()
            r2.getClass()
            monitor-enter(r7)
            boolean r3 = r7.R     // Catch: java.lang.Throwable -> Lf2
            if (r3 != 0) goto L120
            int r3 = r2.a     // Catch: java.lang.Throwable -> Lf2
            int r3 = java.lang.Integer.bitCount(r3)     // Catch: java.lang.Throwable -> Lf2
            int r3 = r3 * 6
            r4 = 4
            r7.k(r1, r3, r4, r1)     // Catch: java.lang.Throwable -> Lf2
            r3 = r1
        Ld3:
            r4 = 10
            if (r3 >= r4) goto Lf7
            r4 = 1
            int r5 = r4 << r3
            int r6 = r2.a     // Catch: java.lang.Throwable -> Lf2
            r5 = r5 & r6
            if (r5 == 0) goto Le0
            goto Le1
        Le0:
            r4 = r1
        Le1:
            if (r4 == 0) goto Lf4
            y80 r4 = r7.A     // Catch: java.lang.Throwable -> Lf2
            r4.writeShort(r3)     // Catch: java.lang.Throwable -> Lf2
            y80 r4 = r7.A     // Catch: java.lang.Throwable -> Lf2
            int[] r5 = r2.b     // Catch: java.lang.Throwable -> Lf2
            r5 = r5[r3]     // Catch: java.lang.Throwable -> Lf2
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> Lf2
            goto Lf4
        Lf2:
            r0 = move-exception
            goto L128
        Lf4:
            int r3 = r3 + 1
            goto Ld3
        Lf7:
            y80 r2 = r7.A     // Catch: java.lang.Throwable -> Lf2
            r2.flush()     // Catch: java.lang.Throwable -> Lf2
            monitor-exit(r7)
            fd6 r7 = r0.m0
            int r7 = r7.a()
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r7 == r2) goto L10f
            yz2 r3 = r0.s0
            int r7 = r7 - r2
            long r4 = (long) r7
            r3.x(r1, r4)
        L10f:
            qz6 r7 = r0.Z
            pz6 r1 = r7.d()
            java.lang.String r2 = r0.L
            i5 r5 = r0.t0
            r6 = 6
            r3 = 0
            defpackage.pz6.b(r1, r2, r3, r5, r6)
            return
        L120:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf2
            throw r0     // Catch: java.lang.Throwable -> Lf2
        L128:
            monitor-exit(r7)
            throw r0
        L12a:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> La7
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La7
            throw r0     // Catch: java.lang.Throwable -> La7
        L132:
            monitor-exit(r7)
            throw r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Connection{"
            r0.<init>(r1)
            b26 r1 = r3.c
            ea r2 = r1.a
            i03 r2 = r2.h
            java.lang.String r2 = r2.d
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            ea r2 = r1.a
            i03 r2 = r2.h
            int r2 = r2.e
            r0.append(r2)
            java.lang.String r2 = ", proxy="
            r0.append(r2)
            java.net.Proxy r2 = r1.b
            r0.append(r2)
            java.lang.String r2 = " hostAddress="
            r0.append(r2)
            java.net.InetSocketAddress r1 = r1.c
            r0.append(r1)
            java.lang.String r1 = " cipherSuite="
            r0.append(r1)
            pv2 r1 = r3.f
            if (r1 == 0) goto L40
            rq0 r1 = r1.b
            goto L42
        L40:
            java.lang.String r1 = "none"
        L42:
            r0.append(r1)
            java.lang.String r1 = " protocol="
            r0.append(r1)
            k55 r3 = r3.g
            r0.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
