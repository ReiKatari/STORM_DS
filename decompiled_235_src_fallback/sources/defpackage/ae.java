package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ae  reason: default package */
/* loaded from: classes.dex */
public final class ae extends defpackage.q60 {
    public final javax.net.ssl.X509TrustManager p;
    public final android.net.http.X509TrustManagerExtensions q;

    public ae(javax.net.ssl.X509TrustManager r1, android.net.http.X509TrustManagerExtensions r2) {
            r0 = this;
            r0.<init>()
            r0.p = r1
            r0.q = r2
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.ae
            if (r0 == 0) goto Le
            ae r2 = (defpackage.ae) r2
            javax.net.ssl.X509TrustManager r2 = r2.p
            javax.net.ssl.X509TrustManager r1 = r1.p
            if (r2 != r1) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            javax.net.ssl.X509TrustManager r0 = r0.p
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // defpackage.q60
    public final java.util.List q(java.lang.String r2, java.util.List r3) {
            r1 = this;
            r3.getClass()
            r2.getClass()
            r0 = 0
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            java.security.cert.X509Certificate[] r3 = (java.security.cert.X509Certificate[]) r3
            android.net.http.X509TrustManagerExtensions r1 = r1.q     // Catch: java.security.cert.CertificateException -> L1b
            java.lang.String r0 = "RSA"
            java.util.List r1 = r1.checkServerTrusted(r3, r0, r2)     // Catch: java.security.cert.CertificateException -> L1b
            r1.getClass()     // Catch: java.security.cert.CertificateException -> L1b
            return r1
        L1b:
            r1 = move-exception
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r3 = r1.getMessage()
            r2.<init>(r3)
            r2.initCause(r1)
            throw r2
    }
}
