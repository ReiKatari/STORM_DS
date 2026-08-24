package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xk4  reason: default package */
/* loaded from: classes.dex */
public final class xk4 {
    public static final java.util.List E = null;
    public static final java.util.List F = null;
    public final long A;
    public final defpackage.il5 B;
    public final defpackage.qz6 C;
    public final defpackage.os0 D;
    public final defpackage.eb a;
    public final java.util.List b;
    public final java.util.List c;
    public final defpackage.fa6 d;
    public final boolean e;
    public final boolean f;
    public final defpackage.xd5 g;
    public final boolean h;
    public final boolean i;
    public final defpackage.vs0 j;
    public final defpackage.la0 k;
    public final defpackage.d90 l;
    public final java.net.ProxySelector m;
    public final defpackage.xd5 n;
    public final javax.net.SocketFactory o;
    public final javax.net.ssl.SSLSocketFactory p;
    public final javax.net.ssl.X509TrustManager q;
    public final java.util.List r;
    public final java.util.List s;
    public final defpackage.sk4 t;
    public final defpackage.il0 u;
    public final defpackage.q60 v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    static {
            k55 r0 = defpackage.k55.HTTP_2
            k55 r1 = defpackage.k55.HTTP_1_1
            k55[] r0 = new defpackage.k55[]{r0, r1}
            java.util.List r0 = defpackage.az7.k(r0)
            defpackage.xk4.E = r0
            xz0 r0 = defpackage.xz0.g
            xz0 r1 = defpackage.xz0.h
            xz0[] r0 = new defpackage.xz0[]{r0, r1}
            java.util.List r0 = defpackage.az7.k(r0)
            defpackage.xk4.F = r0
            return
    }

    public xk4() {
            r1 = this;
            wk4 r0 = new wk4
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public xk4(defpackage.wk4 r7) {
            r6 = this;
            r6.<init>()
            eb r0 = r7.a
            r6.a = r0
            java.util.ArrayList r0 = r7.c
            java.util.List r0 = defpackage.az7.j(r0)
            r6.b = r0
            java.util.ArrayList r0 = r7.d
            java.util.List r0 = defpackage.az7.j(r0)
            r6.c = r0
            fa6 r0 = r7.e
            r6.d = r0
            boolean r0 = r7.f
            r6.e = r0
            boolean r0 = r7.g
            r6.f = r0
            xd5 r0 = r7.h
            r6.g = r0
            boolean r0 = r7.i
            r6.h = r0
            boolean r0 = r7.j
            r6.i = r0
            vs0 r0 = r7.k
            r6.j = r0
            la0 r0 = r7.l
            r6.k = r0
            d90 r0 = r7.m
            r6.l = r0
            java.net.ProxySelector r0 = r7.n
            if (r0 != 0) goto L47
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
            if (r0 != 0) goto L47
            dh4 r0 = defpackage.dh4.a
        L47:
            r6.m = r0
            xd5 r0 = r7.o
            r6.n = r0
            javax.net.SocketFactory r0 = r7.p
            r6.o = r0
            java.util.List r0 = r7.s
            r6.r = r0
            java.util.List r1 = r7.t
            r6.s = r1
            sk4 r1 = r7.u
            r6.t = r1
            int r1 = r7.x
            r6.w = r1
            int r1 = r7.y
            r6.x = r1
            int r1 = r7.z
            r6.y = r1
            int r1 = r7.A
            r6.z = r1
            long r1 = r7.B
            r6.A = r1
            il5 r1 = r7.C
            if (r1 != 0) goto L7a
            il5 r1 = new il5
            r1.<init>()
        L7a:
            r6.B = r1
            qz6 r1 = r7.D
            if (r1 != 0) goto L82
            qz6 r1 = defpackage.qz6.l
        L82:
            r6.C = r1
            os0 r1 = r7.b
            if (r1 != 0) goto L91
            os0 r1 = new os0
            r2 = 27
            r1.<init>(r2)
            r7.b = r1
        L91:
            r6.D = r1
            r1 = 0
            if (r0 == 0) goto L9e
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L9e
            goto L168
        L9e:
            java.util.Iterator r0 = r0.iterator()
        La2:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L168
            java.lang.Object r2 = r0.next()
            xz0 r2 = (defpackage.xz0) r2
            boolean r2 = r2.a
            if (r2 == 0) goto La2
            javax.net.ssl.SSLSocketFactory r0 = r7.q
            if (r0 == 0) goto Le0
            r6.p = r0
            q60 r0 = r7.w
            r0.getClass()
            r6.v = r0
            javax.net.ssl.X509TrustManager r2 = r7.r
            r2.getClass()
            r6.q = r2
            il0 r7 = r7.v
            r7.getClass()
            q60 r2 = r7.b
            boolean r2 = defpackage.nb3.k(r2, r0)
            if (r2 == 0) goto Ld4
            goto Ldc
        Ld4:
            il0 r2 = new il0
            java.util.Set r7 = r7.a
            r2.<init>(r7, r0)
            r7 = r2
        Ldc:
            r6.u = r7
            goto L172
        Le0:
            kx4 r0 = defpackage.kx4.a
            kx4 r0 = defpackage.kx4.a
            r0.getClass()
            java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0)
            r0.init(r1)
            javax.net.ssl.TrustManager[] r0 = r0.getTrustManagers()
            r0.getClass()
            int r2 = r0.length
            r3 = 1
            if (r2 != r3) goto L157
            r2 = 0
            r4 = r0[r2]
            boolean r5 = r4 instanceof javax.net.ssl.X509TrustManager
            if (r5 == 0) goto L157
            javax.net.ssl.X509TrustManager r4 = (javax.net.ssl.X509TrustManager) r4
            r6.q = r4
            kx4 r0 = defpackage.kx4.a
            r0.getClass()
            javax.net.ssl.SSLContext r0 = r0.k()     // Catch: java.security.GeneralSecurityException -> L142
            javax.net.ssl.TrustManager[] r3 = new javax.net.ssl.TrustManager[r3]     // Catch: java.security.GeneralSecurityException -> L142
            r3[r2] = r4     // Catch: java.security.GeneralSecurityException -> L142
            r0.init(r1, r3, r1)     // Catch: java.security.GeneralSecurityException -> L142
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch: java.security.GeneralSecurityException -> L142
            r0.getClass()     // Catch: java.security.GeneralSecurityException -> L142
            r6.p = r0
            kx4 r0 = defpackage.kx4.a
            q60 r0 = r0.c(r4)
            r6.v = r0
            il0 r7 = r7.v
            r7.getClass()
            q60 r2 = r7.b
            boolean r2 = defpackage.nb3.k(r2, r0)
            if (r2 == 0) goto L137
            goto L13f
        L137:
            il0 r2 = new il0
            java.util.Set r7 = r7.a
            r2.<init>(r7, r0)
            r7 = r2
        L13f:
            r6.u = r7
            goto L172
        L142:
            r6 = move-exception
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No System TLS: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0, r6)
            throw r7
        L157:
            java.lang.String r6 = java.util.Arrays.toString(r0)
            r6.getClass()
            java.lang.String r7 = "Unexpected default trust managers: "
            java.lang.String r6 = r7.concat(r6)
            defpackage.u34.f(r6)
            throw r1
        L168:
            r6.p = r1
            r6.v = r1
            r6.q = r1
            il0 r7 = defpackage.il0.c
            r6.u = r7
        L172:
            javax.net.ssl.X509TrustManager r7 = r6.q
            q60 r0 = r6.v
            javax.net.ssl.SSLSocketFactory r2 = r6.p
            java.util.List r3 = r6.c
            java.util.List r4 = r6.b
            r4.getClass()
            boolean r5 = r4.contains(r1)
            if (r5 != 0) goto L1ef
            r3.getClass()
            boolean r4 = r3.contains(r1)
            if (r4 != 0) goto L1e9
            java.util.List r3 = r6.r
            if (r3 == 0) goto L199
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L199
            goto L1c6
        L199:
            java.util.Iterator r3 = r3.iterator()
        L19d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1c6
            java.lang.Object r4 = r3.next()
            xz0 r4 = (defpackage.xz0) r4
            boolean r4 = r4.a
            if (r4 == 0) goto L19d
            if (r2 == 0) goto L1c0
            if (r0 == 0) goto L1ba
            if (r7 == 0) goto L1b4
            goto L1d8
        L1b4:
            java.lang.String r6 = "x509TrustManager == null"
            defpackage.i.m(r6)
            throw r1
        L1ba:
            java.lang.String r6 = "certificateChainCleaner == null"
            defpackage.i.m(r6)
            throw r1
        L1c0:
            java.lang.String r6 = "sslSocketFactory == null"
            defpackage.i.m(r6)
            throw r1
        L1c6:
            java.lang.String r3 = "Check failed."
            if (r2 != 0) goto L1e5
            if (r0 != 0) goto L1e1
            if (r7 != 0) goto L1dd
            il0 r6 = r6.u
            il0 r7 = defpackage.il0.c
            boolean r6 = defpackage.nb3.k(r6, r7)
            if (r6 == 0) goto L1d9
        L1d8:
            return
        L1d9:
            defpackage.i.m(r3)
            throw r1
        L1dd:
            defpackage.i.m(r3)
            throw r1
        L1e1:
            defpackage.i.m(r3)
            throw r1
        L1e5:
            defpackage.i.m(r3)
            throw r1
        L1e9:
            java.lang.String r6 = "Null network interceptor: "
            defpackage.u34.i(r3, r6)
            throw r1
        L1ef:
            java.lang.String r6 = "Null interceptor: "
            defpackage.u34.i(r4, r6)
            throw r1
    }
}
