package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fd  reason: default package */
/* loaded from: classes.dex */
public final class fd extends defpackage.kx4 implements defpackage.g41 {
    public static final boolean e = false;
    public android.content.Context c;
    public final java.util.ArrayList d;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            defpackage.fd.e = r0
            return
    }

    public fd() {
            r6 = this;
            r6.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lf
            gd r0 = new gd
            r0.<init>()
            goto L10
        Lf:
            r0 = 0
        L10:
            mg1 r1 = new mg1
            xd5 r2 = defpackage.bm.e
            r1.<init>(r2)
            mg1 r2 = new mg1
            g01 r3 = defpackage.i01.a
            r2.<init>(r3)
            mg1 r3 = new mg1
            p60 r4 = defpackage.r60.a
            r3.<init>(r4)
            r4 = 4
            sm6[] r4 = new defpackage.sm6[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            java.util.ArrayList r0 = defpackage.fv.C0(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.size()
        L41:
            if (r5 >= r2) goto L56
            java.lang.Object r3 = r0.get(r5)
            int r5 = r5 + 1
            r4 = r3
            sm6 r4 = (defpackage.sm6) r4
            boolean r4 = r4.b()
            if (r4 == 0) goto L41
            r1.add(r3)
            goto L41
        L56:
            r6.d = r1
            return
    }

    @Override // defpackage.g41
    public final void a(android.content.Context r1) {
            r0 = this;
            r0.c = r1
            return
    }

    @Override // defpackage.g41
    public final android.content.Context b() {
            r0 = this;
            android.content.Context r0 = r0.c
            return r0
    }

    @Override // defpackage.kx4
    public final defpackage.q60 c(javax.net.ssl.X509TrustManager r3) {
            r2 = this;
            r2 = 0
            android.net.http.X509TrustManagerExtensions r0 = new android.net.http.X509TrustManagerExtensions     // Catch: java.lang.IllegalArgumentException -> L7
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L7
            goto L8
        L7:
            r0 = r2
        L8:
            if (r0 == 0) goto Lf
            ae r2 = new ae
            r2.<init>(r3, r0)
        Lf:
            if (r2 == 0) goto L12
            return r2
        L12:
            d30 r2 = new d30
            java.lang.String r0 = "buildTrustRootIndex"
            android.os.StrictMode.noteSlowCall(r0)
            t30 r0 = new t30
            java.security.cert.X509Certificate[] r3 = r3.getAcceptedIssuers()
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.security.cert.X509Certificate[] r3 = (java.security.cert.X509Certificate[]) r3
            r0.<init>(r3)
            r2.<init>(r0)
            return r2
    }

    @Override // defpackage.kx4
    public final void d(javax.net.ssl.SSLSocket r5, java.lang.String r6, java.util.List r7) {
            r4 = this;
            r7.getClass()
            java.util.ArrayList r4 = r4.d
            int r0 = r4.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1c
            java.lang.Object r2 = r4.get(r1)
            int r1 = r1 + 1
            r3 = r2
            sm6 r3 = (defpackage.sm6) r3
            boolean r3 = r3.a(r5)
            if (r3 == 0) goto La
            goto L1d
        L1c:
            r2 = 0
        L1d:
            sm6 r2 = (defpackage.sm6) r2
            if (r2 == 0) goto L24
            r2.d(r5, r6, r7)
        L24:
            return
    }

    @Override // defpackage.kx4
    public final java.lang.String f(javax.net.ssl.SSLSocket r6) {
            r5 = this;
            java.util.ArrayList r5 = r5.d
            int r0 = r5.size()
            r1 = 0
        L7:
            r2 = 0
            if (r1 >= r0) goto L1a
            java.lang.Object r3 = r5.get(r1)
            int r1 = r1 + 1
            r4 = r3
            sm6 r4 = (defpackage.sm6) r4
            boolean r4 = r4.a(r6)
            if (r4 == 0) goto L7
            goto L1b
        L1a:
            r3 = r2
        L1b:
            sm6 r3 = (defpackage.sm6) r3
            if (r3 == 0) goto L24
            java.lang.String r5 = r3.c(r6)
            return r5
        L24:
            return r2
    }

    @Override // defpackage.kx4
    public final java.lang.Object g() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Le
            android.util.CloseGuard r2 = defpackage.m2.j()
            defpackage.m2.u(r2)
            return r2
        Le:
            java.lang.Object r2 = super.g()
            return r2
    }

    @Override // defpackage.kx4
    public final boolean h(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r0 = r0.isCleartextTrafficPermitted(r1)
            return r0
    }

    @Override // defpackage.kx4
    public final void i(java.lang.String r2, int r3, java.lang.Throwable r4) {
            r1 = this;
            r1 = 5
            java.lang.String r0 = "OkHttp"
            if (r3 != r1) goto Lb
            boolean r1 = defpackage.nj.e
            android.util.Log.w(r0, r2, r4)
            return
        Lb:
            boolean r1 = defpackage.nj.e
            android.util.Log.i(r0, r2, r4)
            return
    }

    @Override // defpackage.kx4
    public final void j(java.lang.Object r3, java.lang.String r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            r3.getClass()
            android.util.CloseGuard r2 = defpackage.m2.k(r3)
            defpackage.m2.C(r2)
            return
        L11:
            super.j(r3, r4)
            return
    }

    @Override // defpackage.kx4
    public final javax.net.ssl.SSLContext k() {
            r0 = this;
            java.lang.String r0 = "newSSLContext"
            android.os.StrictMode.noteSlowCall(r0)
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)
            r0.getClass()
            return r0
    }
}
