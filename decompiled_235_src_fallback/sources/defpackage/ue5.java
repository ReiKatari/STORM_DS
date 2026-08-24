package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ue5  reason: default package */
/* loaded from: classes.dex */
public final class ue5 {
    public final defpackage.qz6 a;
    public final defpackage.ls1 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final defpackage.ea i;
    public final defpackage.il5 j;
    public final defpackage.je5 k;
    public final boolean l;
    public defpackage.zb m;
    public defpackage.re5 n;
    public defpackage.b26 o;
    public final defpackage.pu p;

    public ue5(defpackage.qz6 r1, defpackage.ls1 r2, int r3, int r4, int r5, int r6, boolean r7, boolean r8, defpackage.ea r9, defpackage.il5 r10, defpackage.je5 r11, defpackage.pa r12) {
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
            java.lang.Object r1 = r12.L
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "GET"
            boolean r1 = defpackage.nb3.k(r1, r2)
            r1 = r1 ^ 1
            r0.l = r1
            pu r1 = new pu
            r1.<init>()
            r0.p = r1
            return
    }

    public final boolean a(defpackage.ke5 r5) {
            r4 = this;
            pu r0 = r4.p
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto La
            goto L4e
        La:
            b26 r0 = r4.o
            if (r0 == 0) goto Lf
            goto L4e
        Lf:
            if (r5 == 0) goto L39
            monitor-enter(r5)
            int r0 = r5.l     // Catch: java.lang.Throwable -> L36
            r2 = 0
            if (r0 == 0) goto L18
            goto L30
        L18:
            boolean r0 = r5.j     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L1d
            goto L30
        L1d:
            b26 r0 = r5.c     // Catch: java.lang.Throwable -> L36
            ea r0 = r0.a     // Catch: java.lang.Throwable -> L36
            i03 r0 = r0.h     // Catch: java.lang.Throwable -> L36
            ea r3 = r4.i     // Catch: java.lang.Throwable -> L36
            i03 r3 = r3.h     // Catch: java.lang.Throwable -> L36
            boolean r0 = defpackage.az7.a(r0, r3)     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L2e
            goto L30
        L2e:
            b26 r2 = r5.c     // Catch: java.lang.Throwable -> L36
        L30:
            monitor-exit(r5)
            if (r2 == 0) goto L39
            r4.o = r2
            return r1
        L36:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L39:
            zb r5 = r4.m
            if (r5 == 0) goto L4a
            int r0 = r5.B
            java.lang.Object r5 = r5.L
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            if (r0 >= r5) goto L4a
            return r1
        L4a:
            re5 r4 = r4.n
            if (r4 != 0) goto L4f
        L4e:
            return r1
        L4f:
            boolean r4 = r4.g()
            return r4
    }

    public final defpackage.h26 b() {
            r13 = this;
            je5 r0 = r13.k
            ke5 r0 = r0.e0
            r1 = 0
            r2 = 1
            if (r0 != 0) goto La
        L8:
            r3 = r1
            goto L69
        La:
            boolean r3 = r13.l
            boolean r3 = r0.g(r3)
            monitor-enter(r0)
            boolean r4 = r0.j
            if (r3 != 0) goto L21
            r0.j = r2     // Catch: java.lang.Throwable -> L1e
            je5 r3 = r13.k     // Catch: java.lang.Throwable -> L1e
            java.net.Socket r3 = r3.k()     // Catch: java.lang.Throwable -> L1e
            goto L4e
        L1e:
            r13 = move-exception
            goto L33e
        L21:
            if (r4 != 0) goto L48
            b26 r3 = r0.c     // Catch: java.lang.Throwable -> L1e
            ea r3 = r3.a     // Catch: java.lang.Throwable -> L1e
            i03 r3 = r3.h     // Catch: java.lang.Throwable -> L1e
            r3.getClass()     // Catch: java.lang.Throwable -> L1e
            ea r4 = r13.i     // Catch: java.lang.Throwable -> L1e
            i03 r4 = r4.h     // Catch: java.lang.Throwable -> L1e
            int r5 = r3.e     // Catch: java.lang.Throwable -> L1e
            int r6 = r4.e     // Catch: java.lang.Throwable -> L1e
            if (r5 != r6) goto L42
            java.lang.String r3 = r3.d     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = r4.d     // Catch: java.lang.Throwable -> L1e
            boolean r3 = defpackage.nb3.k(r3, r4)     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L42
            r3 = r2
            goto L43
        L42:
            r3 = 0
        L43:
            if (r3 != 0) goto L46
            goto L48
        L46:
            r3 = r1
            goto L4e
        L48:
            je5 r3 = r13.k     // Catch: java.lang.Throwable -> L1e
            java.net.Socket r3 = r3.k()     // Catch: java.lang.Throwable -> L1e
        L4e:
            monitor-exit(r0)
            je5 r4 = r13.k
            ke5 r4 = r4.e0
            if (r4 == 0) goto L63
            if (r3 != 0) goto L5d
            pp5 r3 = new pp5
            r3.<init>(r0)
            goto L69
        L5d:
            java.lang.String r13 = "Check failed."
            defpackage.i.m(r13)
            return r1
        L63:
            if (r3 == 0) goto L8
            defpackage.az7.c(r3)
            goto L8
        L69:
            if (r3 == 0) goto L6c
            return r3
        L6c:
            pp5 r0 = r13.d(r1, r1)
            if (r0 == 0) goto L73
            return r0
        L73:
            pu r0 = r13.p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L84
            pu r13 = r13.p
            java.lang.Object r13 = r13.removeFirst()
            h26 r13 = (defpackage.h26) r13
            return r13
        L84:
            b26 r0 = r13.o
            if (r0 == 0) goto L90
            r13.o = r1
            jz0 r0 = r13.c(r0, r1)
            goto L320
        L90:
            zb r0 = r13.m
            if (r0 == 0) goto Lc2
            int r3 = r0.B
            java.lang.Object r4 = r0.L
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            if (r3 >= r4) goto Lc2
            int r2 = r0.B
            java.lang.Object r3 = r0.L
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            if (r2 >= r4) goto Lbe
            int r2 = r0.B
            int r4 = r2 + 1
            r0.B = r4
            java.lang.Object r0 = r3.get(r2)
            b26 r0 = (defpackage.b26) r0
            jz0 r0 = r13.c(r0, r1)
            goto L320
        Lbe:
            defpackage.fa6.c()
            return r1
        Lc2:
            re5 r0 = r13.n
            if (r0 != 0) goto Ld5
            re5 r0 = new re5
            ea r3 = r13.i
            il5 r4 = r13.j
            je5 r5 = r13.k
            boolean r6 = r13.h
            r0.<init>(r3, r4, r5, r6)
            r13.n = r0
        Ld5:
            boolean r3 = r0.g()
            if (r3 == 0) goto L338
            boolean r3 = r0.g()
            if (r3 == 0) goto L334
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        Le6:
            int r4 = r0.L
            java.lang.Object r5 = r0.B
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            if (r4 >= r5) goto L2e7
            java.lang.Object r4 = r0.R
            ea r4 = (defpackage.ea) r4
            java.lang.String r5 = "No route to "
            int r6 = r0.L
            java.lang.Object r7 = r0.B
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            if (r6 >= r7) goto L2c5
            java.lang.Object r6 = r0.B
            java.util.List r6 = (java.util.List) r6
            int r7 = r0.L
            int r8 = r7 + 1
            r0.L = r8
            java.lang.Object r6 = r6.get(r7)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0.Y = r7
            java.net.Proxy$Type r8 = r6.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.DIRECT
            if (r8 == r9) goto L15a
            java.net.Proxy$Type r8 = r6.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.SOCKS
            if (r8 != r9) goto L12c
            goto L15a
        L12c:
            java.net.SocketAddress r8 = r6.address()
            boolean r9 = r8 instanceof java.net.InetSocketAddress
            if (r9 == 0) goto L150
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8
            java.net.InetAddress r9 = r8.getAddress()
            if (r9 != 0) goto L144
            java.lang.String r9 = r8.getHostName()
            r9.getClass()
            goto L14b
        L144:
            java.lang.String r9 = r9.getHostAddress()
            r9.getClass()
        L14b:
            int r8 = r8.getPort()
            goto L160
        L150:
            java.lang.String r13 = "Proxy.address() is not an InetSocketAddress: "
            java.lang.Class r0 = r8.getClass()
            defpackage.u34.w(r0, r13)
            return r1
        L15a:
            i03 r8 = r4.h
            java.lang.String r9 = r8.d
            int r8 = r8.e
        L160:
            if (r2 > r8) goto L2a6
            r10 = 65536(0x10000, float:9.1835E-41)
            if (r8 >= r10) goto L2a6
            java.net.Proxy$Type r5 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.SOCKS
            if (r5 != r10) goto L177
            java.net.InetSocketAddress r4 = java.net.InetSocketAddress.createUnresolved(r9, r8)
            r7.add(r4)
            goto L239
        L177:
            xh5 r5 = defpackage.wy7.a
            r9.getClass()
            xh5 r5 = defpackage.wy7.a
            boolean r5 = r5.d(r9)
            if (r5 == 0) goto L18d
            java.net.InetAddress r4 = java.net.InetAddress.getByName(r9)
            java.util.List r4 = defpackage.hf.b0(r4)
            goto L1a4
        L18d:
            d90 r5 = r4.a
            r5.getClass()
            java.net.InetAddress[] r5 = java.net.InetAddress.getAllByName(r9)     // Catch: java.lang.NullPointerException -> L296
            r5.getClass()     // Catch: java.lang.NullPointerException -> L296
            java.util.List r5 = defpackage.fv.T0(r5)     // Catch: java.lang.NullPointerException -> L296
            boolean r10 = r5.isEmpty()
            if (r10 != 0) goto L27a
            r4 = r5
        L1a4:
            boolean r5 = r0.A
            if (r5 == 0) goto L220
            int r5 = r4.size()
            r9 = 2
            if (r5 >= r9) goto L1b1
            goto L220
        L1b1:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r4.iterator()
        L1bf:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L1d8
            java.lang.Object r11 = r10.next()
            r12 = r11
            java.net.InetAddress r12 = (java.net.InetAddress) r12
            boolean r12 = r12 instanceof java.net.Inet6Address
            if (r12 == 0) goto L1d4
            r5.add(r11)
            goto L1bf
        L1d4:
            r9.add(r11)
            goto L1bf
        L1d8:
            boolean r10 = r5.isEmpty()
            if (r10 != 0) goto L220
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L1e5
            goto L220
        L1e5:
            byte[] r4 = defpackage.yy7.a
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r9 = r9.iterator()
            kw3 r10 = defpackage.hf.I()
        L1f3:
            boolean r4 = r5.hasNext()
            if (r4 != 0) goto L205
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L200
            goto L205
        L200:
            kw3 r4 = defpackage.hf.A(r10)
            goto L220
        L205:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L212
            java.lang.Object r4 = r5.next()
            r10.add(r4)
        L212:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L1f3
            java.lang.Object r4 = r9.next()
            r10.add(r4)
            goto L1f3
        L220:
            java.util.Iterator r4 = r4.iterator()
        L224:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L239
            java.lang.Object r5 = r4.next()
            java.net.InetAddress r5 = (java.net.InetAddress) r5
            java.net.InetSocketAddress r9 = new java.net.InetSocketAddress
            r9.<init>(r5, r8)
            r7.add(r9)
            goto L224
        L239:
            java.lang.Object r4 = r0.Y
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L241:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L273
            java.lang.Object r5 = r4.next()
            java.net.InetSocketAddress r5 = (java.net.InetSocketAddress) r5
            b26 r7 = new b26
            java.lang.Object r8 = r0.R
            ea r8 = (defpackage.ea) r8
            r7.<init>(r8, r6, r5)
            java.lang.Object r5 = r0.X
            il5 r5 = (defpackage.il5) r5
            monitor-enter(r5)
            java.util.LinkedHashSet r8 = r5.b     // Catch: java.lang.Throwable -> L270
            boolean r8 = r8.contains(r7)     // Catch: java.lang.Throwable -> L270
            monitor-exit(r5)
            if (r8 == 0) goto L26c
            java.lang.Object r5 = r0.Z
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r7)
            goto L241
        L26c:
            r3.add(r7)
            goto L241
        L270:
            r13 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L270
            throw r13
        L273:
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto Le6
            goto L2e7
        L27a:
            java.net.UnknownHostException r13 = new java.net.UnknownHostException
            d90 r0 = r4.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " returned no addresses for "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            r13.<init>(r0)
            throw r13
        L296:
            r13 = move-exception
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.String r1 = "Broken system behaviour for dns lookup of "
            java.lang.String r1 = r1.concat(r9)
            r0.<init>(r1)
            r0.initCause(r13)
            throw r0
        L2a6:
            java.net.SocketException r13 = new java.net.SocketException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r9)
            r1 = 58
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = "; port is out of range"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L2c5:
            java.net.SocketException r13 = new java.net.SocketException
            i03 r1 = r4.h
            java.lang.String r1 = r1.d
            java.lang.String r2 = "; exhausted proxy configurations: "
            java.lang.Object r0 = r0.B
            java.util.List r0 = (java.util.List) r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            r3.append(r1)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r13.<init>(r0)
            throw r13
        L2e7:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L2fb
            java.lang.Object r2 = r0.Z
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            defpackage.gt0.A0(r3, r2)
            java.lang.Object r0 = r0.Z
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
        L2fb:
            zb r0 = new zb
            r0.<init>(r3)
            r13.m = r0
            je5 r2 = r13.k
            boolean r2 = r2.m0
            if (r2 != 0) goto L32e
            int r2 = r0.B
            int r4 = r3.size()
            if (r2 >= r4) goto L32a
            int r1 = r0.B
            int r2 = r1 + 1
            r0.B = r2
            java.lang.Object r0 = r3.get(r1)
            b26 r0 = (defpackage.b26) r0
            jz0 r0 = r13.c(r0, r3)
        L320:
            java.util.List r1 = r0.k
            pp5 r13 = r13.d(r0, r1)
            if (r13 == 0) goto L329
            return r13
        L329:
            return r0
        L32a:
            defpackage.fa6.c()
            return r1
        L32e:
            java.lang.String r13 = "Canceled"
            defpackage.e41.i(r13)
            return r1
        L334:
            defpackage.fa6.c()
            return r1
        L338:
            java.lang.String r13 = "exhausted all routes"
            defpackage.e41.i(r13)
            return r1
        L33e:
            monitor-exit(r0)
            throw r13
    }

    public final defpackage.jz0 c(defpackage.b26 r16, java.util.ArrayList r17) {
            r15 = this;
            r10 = r16
            r10.getClass()
            ea r0 = r10.a
            javax.net.ssl.SSLSocketFactory r1 = r0.c
            if (r1 != 0) goto L3c
            java.util.List r0 = r0.j
            xz0 r1 = defpackage.xz0.h
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L34
            ea r0 = r10.a
            i03 r0 = r0.h
            java.lang.String r0 = r0.d
            kx4 r1 = defpackage.kx4.a
            kx4 r1 = defpackage.kx4.a
            boolean r1 = r1.h(r0)
            if (r1 == 0) goto L26
            goto L46
        L26:
            java.net.UnknownServiceException r15 = new java.net.UnknownServiceException
            java.lang.String r1 = "CLEARTEXT communication to "
            java.lang.String r2 = " not permitted by network security policy"
            java.lang.String r0 = defpackage.lb1.A(r1, r0, r2)
            r15.<init>(r0)
            throw r15
        L34:
            java.net.UnknownServiceException r15 = new java.net.UnknownServiceException
            java.lang.String r0 = "CLEARTEXT communication not enabled for client"
            r15.<init>(r0)
            throw r15
        L3c:
            java.util.List r0 = r0.i
            k55 r1 = defpackage.k55.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ldf
        L46:
            java.net.Proxy r0 = r10.b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            r2 = 0
            if (r0 == r1) goto L52
            goto L63
        L52:
            ea r0 = r10.a
            javax.net.ssl.SSLSocketFactory r1 = r0.c
            if (r1 != 0) goto L65
            java.util.List r0 = r0.i
            k55 r1 = defpackage.k55.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L63
            goto L65
        L63:
            r12 = r2
            goto Lc4
        L65:
            s9 r0 = new s9
            r1 = 13
            r0.<init>(r1)
            ea r1 = r10.a
            i03 r1 = r1.h
            r1.getClass()
            r0.a = r1
            java.lang.String r1 = "CONNECT"
            r0.D(r1, r2)
            ea r1 = r10.a
            i03 r2 = r1.h
            r3 = 1
            java.lang.String r2 = defpackage.az7.i(r2, r3)
            java.lang.String r3 = "Host"
            r0.B(r3, r2)
            java.lang.String r2 = "Proxy-Connection"
            java.lang.String r3 = "Keep-Alive"
            r0.B(r2, r3)
            java.lang.String r2 = "User-Agent"
            java.lang.String r3 = "okhttp/5.3.2"
            r0.B(r2, r3)
            pa r2 = new pa
            r2.<init>(r0)
            xl5 r0 = defpackage.yl5.A
            ww2 r3 = new ww2
            r4 = 0
            r3.<init>(r4, r4)
            k55 r4 = defpackage.k55.HTTP_1_1
            r4.getClass()
            java.lang.String r4 = "Proxy-Authenticate"
            defpackage.ft7.c(r4)
            java.lang.String r5 = "OkHttp-Preemptive"
            defpackage.ft7.d(r5, r4)
            r3.r(r4)
            defpackage.ft7.a(r3, r4, r5)
            r3.f()
            r0.getClass()
            xd5 r0 = r1.f
            r0.getClass()
            goto L63
        Lc4:
            jz0 r0 = new jz0
            qz6 r1 = r15.a
            ls1 r2 = r15.b
            int r3 = r15.c
            int r4 = r15.d
            int r5 = r15.e
            int r6 = r15.f
            boolean r7 = r15.g
            je5 r8 = r15.k
            r13 = -1
            r14 = 0
            r9 = r15
            r11 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        Ldf:
            java.net.UnknownServiceException r15 = new java.net.UnknownServiceException
            java.lang.String r0 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r15.<init>(r0)
            throw r15
    }

    public final defpackage.pp5 d(defpackage.jz0 r11, java.util.List r12) {
            r10 = this;
            ls1 r0 = r10.b
            boolean r1 = r10.l
            ea r2 = r10.i
            je5 r3 = r10.k
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.c()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            r0.getClass()
            java.io.Serializable r0 = r0.d
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L23:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L6b
            java.lang.Object r7 = r0.next()
            ke5 r7 = (defpackage.ke5) r7
            r7.getClass()
            monitor-enter(r7)
            if (r6 == 0) goto L43
            qz2 r9 = r7.i     // Catch: java.lang.Throwable -> L41
            if (r9 == 0) goto L3c
            r9 = r5
            goto L3d
        L3c:
            r9 = r4
        L3d:
            if (r9 != 0) goto L43
        L3f:
            r9 = r4
            goto L4e
        L41:
            r10 = move-exception
            goto L69
        L43:
            boolean r9 = r7.d(r2, r12)     // Catch: java.lang.Throwable -> L41
            if (r9 != 0) goto L4a
            goto L3f
        L4a:
            r3.b(r7)     // Catch: java.lang.Throwable -> L41
            r9 = r5
        L4e:
            monitor-exit(r7)
            if (r9 == 0) goto L23
            boolean r9 = r7.g(r1)
            if (r9 == 0) goto L58
            goto L6c
        L58:
            monitor-enter(r7)
            r7.j = r5     // Catch: java.lang.Throwable -> L66
            java.net.Socket r8 = r3.k()     // Catch: java.lang.Throwable -> L66
            monitor-exit(r7)
            if (r8 == 0) goto L23
            defpackage.az7.c(r8)
            goto L23
        L66:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        L69:
            monitor-exit(r7)
            throw r10
        L6b:
            r7 = r8
        L6c:
            if (r7 != 0) goto L6f
            return r8
        L6f:
            if (r11 == 0) goto L7c
            b26 r12 = r11.j
            r10.o = r12
            java.net.Socket r10 = r11.q
            if (r10 == 0) goto L7c
            defpackage.az7.c(r10)
        L7c:
            pp5 r10 = new pp5
            r10.<init>(r7)
            return r10
    }
}
