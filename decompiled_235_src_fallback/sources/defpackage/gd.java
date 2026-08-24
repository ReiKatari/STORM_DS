package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gd  reason: default package */
/* loaded from: classes.dex */
public final class gd implements defpackage.sm6 {
    @Override // defpackage.sm6
    public final boolean a(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r0 = defpackage.l2.g(r1)
            return r0
    }

    @Override // defpackage.sm6
    public final boolean b() {
            r1 = this;
            kx4 r1 = defpackage.kx4.a
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // defpackage.sm6
    public final java.lang.String c(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            java.lang.String r0 = defpackage.l2.c(r1)     // Catch: java.lang.UnsupportedOperationException -> L10
            if (r0 == 0) goto L10
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)     // Catch: java.lang.UnsupportedOperationException -> L10
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // defpackage.sm6
    public final void d(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            r3.getClass()
            defpackage.l2.f(r1)     // Catch: java.lang.IllegalArgumentException -> L20
            javax.net.ssl.SSLParameters r0 = r1.getSSLParameters()     // Catch: java.lang.IllegalArgumentException -> L20
            kx4 r2 = defpackage.kx4.a     // Catch: java.lang.IllegalArgumentException -> L20
            java.util.ArrayList r2 = defpackage.q61.j(r3)     // Catch: java.lang.IllegalArgumentException -> L20
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.IllegalArgumentException -> L20
            java.lang.Object[] r2 = r2.toArray(r3)     // Catch: java.lang.IllegalArgumentException -> L20
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch: java.lang.IllegalArgumentException -> L20
            defpackage.l2.e(r0, r2)     // Catch: java.lang.IllegalArgumentException -> L20
            r1.setSSLParameters(r0)     // Catch: java.lang.IllegalArgumentException -> L20
            return
        L20:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Android internal error"
            r1.<init>(r2, r0)
            throw r1
    }
}
