package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jz0  reason: default package */
/* loaded from: classes.dex */
public final class jz0 implements defpackage.h26, defpackage.u62 {
    public final defpackage.qz6 a;
    public final defpackage.ls1 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final defpackage.je5 h;
    public final defpackage.ue5 i;
    public final defpackage.b26 j;
    public final java.util.List k;
    public final defpackage.pa l;
    public final int m;
    public final boolean n;
    public volatile boolean o;
    public java.net.Socket p;
    public java.net.Socket q;
    public defpackage.pv2 r;
    public defpackage.k55 s;
    public defpackage.bt t;
    public defpackage.ke5 u;

    public jz0(defpackage.qz6 r1, defpackage.ls1 r2, int r3, int r4, int r5, int r6, boolean r7, defpackage.je5 r8, defpackage.ue5 r9, defpackage.b26 r10, java.util.List r11, defpackage.pa r12, int r13, boolean r14) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r10.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            r0.k = r11
            r0.l = r12
            r0.m = r13
            r0.n = r14
            return
    }

    @Override // defpackage.h26
    public final defpackage.h26 a() {
            r15 = this;
            jz0 r0 = new jz0
            int r13 = r15.m
            boolean r14 = r15.n
            qz6 r1 = r15.a
            ls1 r2 = r15.b
            int r3 = r15.c
            int r4 = r15.d
            int r5 = r15.e
            int r6 = r15.f
            boolean r7 = r15.g
            je5 r8 = r15.h
            ue5 r9 = r15.i
            b26 r10 = r15.j
            java.util.List r11 = r15.k
            pa r12 = r15.l
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
    }

    @Override // defpackage.h26
    public final defpackage.ke5 b() {
            r3 = this;
            je5 r0 = r3.h
            xk4 r0 = r0.A
            il5 r0 = r0.B
            b26 r1 = r3.j
            monitor-enter(r0)
            r1.getClass()     // Catch: java.lang.Throwable -> L4d
            java.util.LinkedHashSet r2 = r0.b     // Catch: java.lang.Throwable -> L4d
            r2.remove(r1)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)
            ke5 r0 = r3.u
            r0.getClass()
            b26 r1 = r3.j
            r1.getClass()
            ue5 r1 = r3.i
            java.util.List r2 = r3.k
            pp5 r1 = r1.d(r3, r2)
            if (r1 == 0) goto L29
            ke5 r3 = r1.a
            return r3
        L29:
            monitor-enter(r0)
            ls1 r1 = r3.b     // Catch: java.lang.Throwable -> L4a
            r1.getClass()     // Catch: java.lang.Throwable -> L4a
            java.util.TimeZone r2 = defpackage.az7.a     // Catch: java.lang.Throwable -> L4a
            java.io.Serializable r2 = r1.d     // Catch: java.lang.Throwable -> L4a
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2     // Catch: java.lang.Throwable -> L4a
            r2.add(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r2 = r1.b     // Catch: java.lang.Throwable -> L4a
            pz6 r2 = (defpackage.pz6) r2     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r1 = r1.c     // Catch: java.lang.Throwable -> L4a
            hk1 r1 = (defpackage.hk1) r1     // Catch: java.lang.Throwable -> L4a
            defpackage.pz6.d(r2, r1)     // Catch: java.lang.Throwable -> L4a
            je5 r3 = r3.h     // Catch: java.lang.Throwable -> L4a
            r3.b(r0)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)
            return r0
        L4a:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L4d:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            throw r3
    }

    @Override // defpackage.h26
    public final boolean c() {
            r0 = this;
            k55 r0 = r0.s
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // defpackage.h26, defpackage.u62
    public final void cancel() {
            r1 = this;
            r0 = 1
            r1.o = r0
            java.net.Socket r1 = r1.p
            if (r1 == 0) goto La
            defpackage.az7.c(r1)
        La:
            return
    }

    @Override // defpackage.h26
    public final defpackage.g26 d() {
            r8 = this;
            ls1 r0 = r8.b
            b26 r1 = r8.j
            je5 r2 = r8.h
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.o0
            java.net.Socket r3 = r8.p
            r4 = 0
            if (r3 != 0) goto L71
            r2.add(r8)
            r3 = 0
            java.net.InetSocketAddress r5 = r1.c     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r5.getClass()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r0.getClass()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r8.i()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r3 = 1
            g26 r5 = new g26     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r6 = 6
            r5.<init>(r8, r4, r6)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r2.remove(r8)
            return r5
        L27:
            r0 = move-exception
            goto L64
        L29:
            r4 = move-exception
            ea r5 = r1.a     // Catch: java.lang.Throwable -> L27
            java.net.Proxy r5 = r1.b     // Catch: java.lang.Throwable -> L27
            java.net.Proxy$Type r5 = r5.type()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy$Type r6 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.Throwable -> L27
            if (r5 == r6) goto L49
            ea r5 = r1.a     // Catch: java.lang.Throwable -> L27
            java.net.ProxySelector r6 = r5.g     // Catch: java.lang.Throwable -> L27
            i03 r5 = r5.h     // Catch: java.lang.Throwable -> L27
            java.net.URI r5 = r5.h()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy r7 = r1.b     // Catch: java.lang.Throwable -> L27
            java.net.SocketAddress r7 = r7.address()     // Catch: java.lang.Throwable -> L27
            r6.connectFailed(r5, r7, r4)     // Catch: java.lang.Throwable -> L27
        L49:
            java.net.InetSocketAddress r1 = r1.c     // Catch: java.lang.Throwable -> L27
            r1.getClass()     // Catch: java.lang.Throwable -> L27
            r0.getClass()     // Catch: java.lang.Throwable -> L27
            g26 r0 = new g26     // Catch: java.lang.Throwable -> L27
            r1 = 2
            r0.<init>(r8, r4, r1)     // Catch: java.lang.Throwable -> L27
            r2.remove(r8)
            if (r3 != 0) goto L63
            java.net.Socket r8 = r8.p
            if (r8 == 0) goto L63
            defpackage.az7.c(r8)
        L63:
            return r0
        L64:
            r2.remove(r8)
            if (r3 != 0) goto L70
            java.net.Socket r8 = r8.p
            if (r8 == 0) goto L70
            defpackage.az7.c(r8)
        L70:
            throw r0
        L71:
            java.lang.String r8 = "TCP already connected"
            defpackage.i.m(r8)
            return r4
    }

    @Override // defpackage.u62
    public final void e() {
            r0 = this;
            return
    }

    @Override // defpackage.u62
    public final void f(defpackage.je5 r1, java.io.IOException r2) {
            r0 = this;
            return
    }

    @Override // defpackage.h26
    public final defpackage.g26 g() {
            r18 = this;
            r1 = r18
            ls1 r2 = r1.b
            je5 r0 = r1.h
            java.util.concurrent.CopyOnWriteArrayList r3 = r0.o0
            java.net.Socket r8 = r1.p
            r13 = 0
            if (r8 == 0) goto L15a
            boolean r0 = r1.c()
            if (r0 != 0) goto L154
            b26 r0 = r1.j
            ea r4 = r0.a
            java.net.InetSocketAddress r14 = r0.c
            ea r0 = r0.a
            java.util.List r4 = r4.j
            r3.add(r1)
            r15 = 0
            pa r5 = r1.l     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            if (r5 == 0) goto L42
            g26 r5 = r1.k()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            java.lang.Throwable r6 = r5.c     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            if (r6 == 0) goto L42
            r3.remove(r1)
            java.net.Socket r0 = r1.q
            if (r0 == 0) goto L37
            defpackage.az7.c(r0)
        L37:
            defpackage.az7.c(r8)
            return r5
        L3b:
            r0 = move-exception
            goto L144
        L3e:
            r0 = move-exception
            r4 = r13
            goto L104
        L42:
            javax.net.ssl.SSLSocketFactory r5 = r0.c     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            r6 = 1
            java.lang.String r7 = "socket"
            if (r5 == 0) goto La8
            bt r5 = r1.t     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            if (r5 == 0) goto La4
            java.lang.Object r5 = r5.L     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            fe5 r5 = (defpackage.fe5) r5     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            k80 r5 = r5.B     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            boolean r5 = r5.u()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            if (r5 == 0) goto L9c
            bt r5 = r1.t     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            if (r5 == 0) goto L98
            java.lang.Object r5 = r5.R     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            ee5 r5 = (defpackage.ee5) r5     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            k80 r5 = r5.B     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            boolean r5 = r5.u()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            if (r5 == 0) goto L9c
            javax.net.ssl.SSLSocketFactory r5 = r0.c     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            i03 r0 = r0.h     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            java.lang.String r9 = r0.d     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            int r0 = r0.e     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            java.net.Socket r0 = r5.createSocket(r8, r9, r0, r6)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            r0.getClass()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            jz0 r5 = r1.m(r4, r0)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            int r9 = r5.m     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            java.lang.Object r9 = r4.get(r9)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            xz0 r9 = (defpackage.xz0) r9     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            jz0 r4 = r5.l(r4, r0)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            boolean r5 = r5.n     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L95
            r9.a(r0, r5)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L95
            r1.j(r0, r9)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L95
            r16 = r4
            goto Lbb
        L95:
            r0 = move-exception
            goto L104
        L98:
            defpackage.nb3.a0(r7)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            throw r13     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
        L9c:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            java.lang.String r4 = "TLS tunnel buffered too many bytes!"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            throw r0     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
        La4:
            defpackage.nb3.a0(r7)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            throw r13     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
        La8:
            r1.q = r8     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            java.util.List r0 = r0.i     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            k55 r4 = defpackage.k55.H2_PRIOR_KNOWLEDGE     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            boolean r0 = r0.contains(r4)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            if (r0 == 0) goto Lb5
            goto Lb7
        Lb5:
            k55 r4 = defpackage.k55.HTTP_1_1     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
        Lb7:
            r1.s = r4     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            r16 = r13
        Lbb:
            ke5 r4 = new ke5     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            qz6 r5 = r1.a     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r9 = r6
            ls1 r6 = r1.b     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r0 = r7
            b26 r7 = r1.j     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r10 = r9
            java.net.Socket r9 = r1.q     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r9.getClass()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r11 = r10
            pv2 r10 = r1.r     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r12 = r11
            k55 r11 = r1.s     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r11.getClass()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r17 = r12
            bt r12 = r1.t     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            if (r12 == 0) goto L100
            r2.getClass()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r1.u = r4     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r4.i()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r14.getClass()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            g26 r0 = new g26     // Catch: java.lang.Throwable -> Lf2 java.io.IOException -> Lf6
            r4 = 6
            r0.<init>(r1, r13, r4)     // Catch: java.lang.Throwable -> Lf2 java.io.IOException -> Lf6
            r3.remove(r1)
            return r0
        Lf2:
            r0 = move-exception
            r15 = r17
            goto L144
        Lf6:
            r0 = move-exception
            r4 = r16
            r15 = r17
            goto L104
        Lfc:
            r0 = move-exception
            r4 = r16
            goto L104
        L100:
            defpackage.nb3.a0(r0)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            throw r13     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
        L104:
            r14.getClass()     // Catch: java.lang.Throwable -> L3b
            r2.getClass()     // Catch: java.lang.Throwable -> L3b
            boolean r2 = r1.g     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L12f
            boolean r2 = r0 instanceof java.net.ProtocolException     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L113
            goto L12f
        L113:
            boolean r2 = r0 instanceof java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L118
            goto L12f
        L118:
            boolean r2 = r0 instanceof javax.net.ssl.SSLHandshakeException     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L125
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L3b
            boolean r2 = r2 instanceof java.security.cert.CertificateException     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L125
            goto L12f
        L125:
            boolean r2 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L12a
            goto L12f
        L12a:
            boolean r2 = r0 instanceof javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L12f
            r13 = r4
        L12f:
            g26 r2 = new g26     // Catch: java.lang.Throwable -> L3b
            r2.<init>(r1, r13, r0)     // Catch: java.lang.Throwable -> L3b
            r3.remove(r1)
            if (r15 != 0) goto L143
            java.net.Socket r0 = r1.q
            if (r0 == 0) goto L140
            defpackage.az7.c(r0)
        L140:
            defpackage.az7.c(r8)
        L143:
            return r2
        L144:
            r3.remove(r1)
            if (r15 != 0) goto L153
            java.net.Socket r1 = r1.q
            if (r1 == 0) goto L150
            defpackage.az7.c(r1)
        L150:
            defpackage.az7.c(r8)
        L153:
            throw r0
        L154:
            java.lang.String r0 = "already connected"
            defpackage.i.m(r0)
            return r13
        L15a:
            java.lang.String r0 = "TCP not connected"
            defpackage.i.h(r0)
            return r13
    }

    @Override // defpackage.u62
    public final defpackage.b26 h() {
            r0 = this;
            b26 r0 = r0.j
            return r0
    }

    public final void i() {
            r4 = this;
            b26 r0 = r4.j
            java.net.Proxy r0 = r0.b
            java.net.Proxy$Type r0 = r0.type()
            if (r0 != 0) goto Lc
            r0 = -1
            goto L14
        Lc:
            int[] r1 = defpackage.iz0.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L14:
            r1 = 1
            if (r0 == r1) goto L24
            r1 = 2
            if (r0 == r1) goto L24
            java.net.Socket r0 = new java.net.Socket
            b26 r1 = r4.j
            java.net.Proxy r1 = r1.b
            r0.<init>(r1)
            goto L31
        L24:
            b26 r0 = r4.j
            ea r0 = r0.a
            javax.net.SocketFactory r0 = r0.b
            java.net.Socket r0 = r0.createSocket()
            r0.getClass()
        L31:
            r4.p = r0
            boolean r1 = r4.o
            if (r1 != 0) goto L86
            int r1 = r4.f
            r0.setSoTimeout(r1)
            kx4 r1 = defpackage.kx4.a     // Catch: java.net.ConnectException -> L6a
            kx4 r1 = defpackage.kx4.a     // Catch: java.net.ConnectException -> L6a
            b26 r2 = r4.j     // Catch: java.net.ConnectException -> L6a
            java.net.InetSocketAddress r2 = r2.c     // Catch: java.net.ConnectException -> L6a
            int r3 = r4.e     // Catch: java.net.ConnectException -> L6a
            r1.e(r0, r2, r3)     // Catch: java.net.ConnectException -> L6a
            eb r1 = new eb     // Catch: java.lang.NullPointerException -> L56
            r1.<init>(r0)     // Catch: java.lang.NullPointerException -> L56
            bt r0 = new bt     // Catch: java.lang.NullPointerException -> L56
            r0.<init>(r1)     // Catch: java.lang.NullPointerException -> L56
            r4.t = r0     // Catch: java.lang.NullPointerException -> L56
            return
        L56:
            r4 = move-exception
            java.lang.String r0 = r4.getMessage()
            java.lang.String r1 = "throw with null exception"
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L64
            return
        L64:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r4)
            throw r0
        L6a:
            r0 = move-exception
            java.net.ConnectException r1 = new java.net.ConnectException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to connect to "
            r2.<init>(r3)
            b26 r4 = r4.j
            java.net.InetSocketAddress r4 = r4.c
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            r1.initCause(r0)
            throw r1
        L86:
            java.lang.String r4 = "canceled"
            defpackage.e41.i(r4)
            return
    }

    public final void j(javax.net.ssl.SSLSocket r10, defpackage.xz0 r11) {
            r9 = this;
            java.lang.String r0 = "Hostname "
            java.lang.String r1 = "\n            |Hostname "
            b26 r2 = r9.j
            ea r2 = r2.a
            boolean r3 = r11.b     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L1d
            kx4 r3 = defpackage.kx4.a     // Catch: java.lang.Throwable -> L1a
            kx4 r3 = defpackage.kx4.a     // Catch: java.lang.Throwable -> L1a
            i03 r4 = r2.h     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = r4.d     // Catch: java.lang.Throwable -> L1a
            java.util.List r5 = r2.i     // Catch: java.lang.Throwable -> L1a
            r3.d(r10, r4, r5)     // Catch: java.lang.Throwable -> L1a
            goto L1d
        L1a:
            r9 = move-exception
            goto L149
        L1d:
            r10.startHandshake()     // Catch: java.lang.Throwable -> L1a
            javax.net.ssl.SSLSession r3 = r10.getSession()     // Catch: java.lang.Throwable -> L1a
            r3.getClass()     // Catch: java.lang.Throwable -> L1a
            pv2 r4 = defpackage.xk2.j(r3)     // Catch: java.lang.Throwable -> L1a
            javax.net.ssl.HostnameVerifier r5 = r2.d     // Catch: java.lang.Throwable -> L1a
            r5.getClass()     // Catch: java.lang.Throwable -> L1a
            i03 r6 = r2.h     // Catch: java.lang.Throwable -> L1a
            java.lang.String r6 = r6.d     // Catch: java.lang.Throwable -> L1a
            boolean r3 = r5.verify(r6, r3)     // Catch: java.lang.Throwable -> L1a
            if (r3 != 0) goto Le1
            java.util.List r9 = r4.a()     // Catch: java.lang.Throwable -> L1a
            boolean r11 = r9.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r11 != 0) goto Lc6
            r11 = 0
            java.lang.Object r9 = r9.get(r11)     // Catch: java.lang.Throwable -> L1a
            r9.getClass()     // Catch: java.lang.Throwable -> L1a
            java.security.cert.X509Certificate r9 = (java.security.cert.X509Certificate) r9     // Catch: java.lang.Throwable -> L1a
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            i03 r1 = r2.h     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r1.d     // Catch: java.lang.Throwable -> L1a
            r0.append(r1)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = " not verified:\n            |    certificate: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1a
            il0 r1 = defpackage.il0.c     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "sha256/"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1a
            da0 r2 = defpackage.da0.R     // Catch: java.lang.Throwable -> L1a
            java.security.PublicKey r2 = r9.getPublicKey()     // Catch: java.lang.Throwable -> L1a
            byte[] r2 = r2.getEncoded()     // Catch: java.lang.Throwable -> L1a
            r2.getClass()     // Catch: java.lang.Throwable -> L1a
            da0 r2 = defpackage.xd5.t(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "SHA-256"
            da0 r2 = r2.c(r3)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = r2.a()     // Catch: java.lang.Throwable -> L1a
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1a
            r0.append(r1)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "\n            |    DN: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1a
            java.security.Principal r1 = r9.getSubjectDN()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L1a
            r0.append(r1)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "\n            |    subjectAltNames: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1a
            r1 = 7
            java.util.List r1 = defpackage.sk4.a(r9, r1)     // Catch: java.lang.Throwable -> L1a
            r2 = 2
            java.util.List r9 = defpackage.sk4.a(r9, r2)     // Catch: java.lang.Throwable -> L1a
            java.util.ArrayList r9 = defpackage.gt0.V0(r1, r9)     // Catch: java.lang.Throwable -> L1a
            r0.append(r9)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r9 = "\n            "
            r0.append(r9)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r9 = defpackage.rs6.S(r9)     // Catch: java.lang.Throwable -> L1a
            r11.<init>(r9)     // Catch: java.lang.Throwable -> L1a
            throw r11     // Catch: java.lang.Throwable -> L1a
        Lc6:
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L1a
            i03 r0 = r2.h     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = r0.d     // Catch: java.lang.Throwable -> L1a
            r11.append(r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = " not verified (no certificates)"
            r11.append(r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L1a
            r9.<init>(r11)     // Catch: java.lang.Throwable -> L1a
            throw r9     // Catch: java.lang.Throwable -> L1a
        Le1:
            il0 r0 = r2.e     // Catch: java.lang.Throwable -> L1a
            r0.getClass()     // Catch: java.lang.Throwable -> L1a
            pv2 r1 = new pv2     // Catch: java.lang.Throwable -> L1a
            l67 r3 = r4.a     // Catch: java.lang.Throwable -> L1a
            rq0 r5 = r4.b     // Catch: java.lang.Throwable -> L1a
            java.util.List r6 = r4.c     // Catch: java.lang.Throwable -> L1a
            u6 r7 = new u6     // Catch: java.lang.Throwable -> L1a
            r8 = 4
            r7.<init>(r0, r4, r2, r8)     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L1a
            r9.r = r1     // Catch: java.lang.Throwable -> L1a
            i03 r1 = r2.h     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r1.d     // Catch: java.lang.Throwable -> L1a
            r1.getClass()     // Catch: java.lang.Throwable -> L1a
            java.util.Set r0 = r0.a     // Catch: java.lang.Throwable -> L1a
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L1a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            if (r1 != 0) goto L141
            boolean r11 = r11.b     // Catch: java.lang.Throwable -> L1a
            if (r11 == 0) goto L11b
            kx4 r11 = defpackage.kx4.a     // Catch: java.lang.Throwable -> L1a
            kx4 r11 = defpackage.kx4.a     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = r11.f(r10)     // Catch: java.lang.Throwable -> L1a
        L11b:
            r9.q = r10     // Catch: java.lang.Throwable -> L1a
            eb r11 = new eb     // Catch: java.lang.Throwable -> L1a
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L1a
            bt r0 = new bt     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L1a
            r9.t = r0     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L135
            j55 r11 = defpackage.k55.Companion     // Catch: java.lang.Throwable -> L1a
            r11.getClass()     // Catch: java.lang.Throwable -> L1a
            k55 r11 = defpackage.j55.a(r2)     // Catch: java.lang.Throwable -> L1a
            goto L137
        L135:
            k55 r11 = defpackage.k55.HTTP_1_1     // Catch: java.lang.Throwable -> L1a
        L137:
            r9.s = r11     // Catch: java.lang.Throwable -> L1a
            kx4 r9 = defpackage.kx4.a
            kx4 r9 = defpackage.kx4.a
            r9.getClass()
            return
        L141:
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> L1a
            defpackage.xg6.A(r9)     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L149:
            kx4 r11 = defpackage.kx4.a
            kx4 r11 = defpackage.kx4.a
            r11.getClass()
            defpackage.az7.c(r10)
            throw r9
    }

    public final defpackage.g26 k() {
            r10 = this;
            pa r0 = r10.l
            r0.getClass()
            b26 r1 = r10.j
            ea r2 = r1.a
            i03 r2 = r2.h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "CONNECT "
            r3.<init>(r4)
            r4 = 1
            java.lang.String r2 = defpackage.az7.i(r2, r4)
            r3.append(r2)
            java.lang.String r2 = " HTTP/1.1"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            hz2 r3 = new hz2
            bt r4 = r10.t
            java.lang.String r5 = "socket"
            r6 = 0
            if (r4 == 0) goto Lbf
            r3.<init>(r6, r10, r4)
            bt r4 = r10.t
            if (r4 == 0) goto Lbb
            java.lang.Object r4 = r4.L
            fe5 r4 = (defpackage.fe5) r4
            in6 r4 = r4.A
            b67 r4 = r4.b()
            int r7 = r10.c
            long r7 = (long) r7
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.g(r7, r9)
            bt r4 = r10.t
            if (r4 == 0) goto Lb7
            java.lang.Object r4 = r4.R
            ee5 r4 = (defpackage.ee5) r4
            ui6 r4 = r4.A
            b67 r4 = r4.b()
            int r5 = r10.d
            long r7 = (long) r5
            r4.g(r7, r9)
            java.lang.Object r4 = r0.R
            yw2 r4 = (defpackage.yw2) r4
            r3.l(r4, r2)
            r3.b()
            r2 = 0
            ul5 r2 = r3.f(r2)
            r2.getClass()
            r2.a = r0
            wl5 r0 = r2.a()
            int r2 = r0.R
            long r4 = defpackage.az7.e(r0)
            r7 = -1
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 != 0) goto L7e
            goto L91
        L7e:
            pa r0 = r0.A
            java.lang.Object r0 = r0.B
            i03 r0 = (defpackage.i03) r0
            fz2 r0 = r3.k(r0, r4)
            r3 = 2147483647(0x7fffffff, float:NaN)
            defpackage.az7.g(r0, r3)
            r0.close()
        L91:
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto Lb0
            r10 = 407(0x197, float:5.7E-43)
            if (r2 != r10) goto La6
            ea r10 = r1.a
            xd5 r10 = r10.f
            r10.getClass()
            java.lang.String r10 = "Failed to authenticate with proxy"
            defpackage.e41.i(r10)
            return r6
        La6:
            java.lang.String r10 = "Unexpected response code for CONNECT: "
            java.lang.String r10 = defpackage.lb1.g(r2, r10)
            defpackage.e41.i(r10)
            return r6
        Lb0:
            g26 r0 = new g26
            r1 = 6
            r0.<init>(r10, r6, r1)
            return r0
        Lb7:
            defpackage.nb3.a0(r5)
            throw r6
        Lbb:
            defpackage.nb3.a0(r5)
            throw r6
        Lbf:
            defpackage.nb3.a0(r5)
            throw r6
    }

    public final defpackage.jz0 l(java.util.List r20, javax.net.ssl.SSLSocket r21) {
            r19 = this;
            r0 = r19
            r20.getClass()
            int r1 = r0.m
            int r2 = r1 + 1
            int r3 = r20.size()
        Ld:
            if (r2 >= r3) goto L6e
            r4 = r20
            java.lang.Object r5 = r4.get(r2)
            xz0 r5 = (defpackage.xz0) r5
            r5.getClass()
            boolean r6 = r5.a
            if (r6 != 0) goto L1f
            goto L40
        L1f:
            java.lang.String[] r6 = r5.d
            if (r6 == 0) goto L30
            java.lang.String[] r7 = r21.getEnabledProtocols()
            qb4 r8 = defpackage.qb4.b
            boolean r6 = defpackage.yy7.h(r6, r7, r8)
            if (r6 != 0) goto L30
            goto L40
        L30:
            java.lang.String[] r5 = r5.c
            if (r5 == 0) goto L43
            java.lang.String[] r6 = r21.getEnabledCipherSuites()
            zh2 r7 = defpackage.rq0.c
            boolean r5 = defpackage.yy7.h(r5, r6, r7)
            if (r5 != 0) goto L43
        L40:
            int r2 = r2 + 1
            goto Ld
        L43:
            r3 = -1
            if (r1 == r3) goto L4a
            r1 = 1
        L47:
            r18 = r1
            goto L4c
        L4a:
            r1 = 0
            goto L47
        L4c:
            jz0 r4 = new jz0
            b26 r14 = r0.j
            java.util.List r15 = r0.k
            qz6 r5 = r0.a
            ls1 r6 = r0.b
            int r7 = r0.c
            int r8 = r0.d
            int r9 = r0.e
            int r10 = r0.f
            boolean r11 = r0.g
            je5 r12 = r0.h
            ue5 r13 = r0.i
            pa r0 = r0.l
            r16 = r0
            r17 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r4
        L6e:
            r0 = 0
            return r0
    }

    public final defpackage.jz0 m(java.util.List r4, javax.net.ssl.SSLSocket r5) {
            r3 = this;
            r4.getClass()
            int r0 = r3.m
            r1 = -1
            if (r0 == r1) goto L9
            return r3
        L9:
            jz0 r0 = r3.l(r4, r5)
            if (r0 == 0) goto L10
            return r0
        L10:
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to find acceptable protocols. isFallback="
            r1.<init>(r2)
            boolean r3 = r3.n
            r1.append(r3)
            java.lang.String r3 = ", modes="
            r1.append(r3)
            r1.append(r4)
            java.lang.String[] r3 = r5.getEnabledProtocols()
            r3.getClass()
            java.lang.String r3 = java.util.Arrays.toString(r3)
            r3.getClass()
            java.lang.String r4 = ", supported protocols="
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
