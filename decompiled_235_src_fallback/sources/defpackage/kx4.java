package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kx4  reason: default package */
/* loaded from: classes.dex */
public abstract class kx4 {
    public static volatile defpackage.kx4 a;
    public static final java.util.logging.Logger b = null;

    static {
            java.lang.String r0 = "Possibly running android unit test without robolectric"
            java.util.Map r1 = defpackage.li.b     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            defpackage.li.b(r3, r2)     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            goto Lc
        L28:
            r1 = move-exception
            goto L2c
        L2a:
            r1 = move-exception
            goto L35
        L2c:
            java.io.PrintStream r2 = java.lang.System.err
            r2.println(r0)
            r1.printStackTrace()
            goto L3d
        L35:
            java.io.PrintStream r2 = java.lang.System.err
            r2.println(r0)
            r1.printStackTrace()
        L3d:
            boolean r0 = defpackage.fd.e
            r1 = 0
            if (r0 == 0) goto L48
            fd r0 = new fd
            r0.<init>()
            goto L49
        L48:
            r0 = r1
        L49:
            if (r0 != 0) goto L55
            boolean r0 = defpackage.nj.e
            if (r0 == 0) goto L54
            nj r1 = new nj
            r1.<init>()
        L54:
            r0 = r1
        L55:
            if (r0 == 0) goto L66
            defpackage.kx4.a = r0
            java.lang.Class<xk4> r0 = defpackage.xk4.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            defpackage.kx4.b = r0
            return
        L66:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected Android API level 21+ but was "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    public abstract defpackage.q60 c(javax.net.ssl.X509TrustManager r1);

    public abstract void d(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List r3);

    public void e(java.net.Socket r1, java.net.InetSocketAddress r2, int r3) {
            r0 = this;
            r2.getClass()
            r1.connect(r2, r3)
            return
    }

    public abstract java.lang.String f(javax.net.ssl.SSLSocket r1);

    public java.lang.Object g() {
            r1 = this;
            java.util.logging.Logger r1 = defpackage.kx4.b
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            boolean r1 = r1.isLoggable(r0)
            if (r1 == 0) goto L12
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r0 = "response.body().close()"
            r1.<init>(r0)
            return r1
        L12:
            r1 = 0
            return r1
    }

    public abstract boolean h(java.lang.String r1);

    public abstract void i(java.lang.String r1, int r2, java.lang.Throwable r3);

    public void j(java.lang.Object r2, java.lang.String r3) {
            r1 = this;
            if (r2 != 0) goto L8
            java.lang.String r0 = " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);"
            java.lang.String r3 = r3.concat(r0)
        L8:
            r0 = 5
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.i(r3, r0, r2)
            return
    }

    public abstract javax.net.ssl.SSLContext k();

    public final java.lang.String toString() {
            r0 = this;
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }
}
