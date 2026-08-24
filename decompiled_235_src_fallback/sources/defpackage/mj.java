package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mj  reason: default package */
/* loaded from: classes.dex */
public final class mj implements defpackage.qc7 {
    public final javax.net.ssl.X509TrustManager a;
    public final java.lang.reflect.Method b;

    public mj(javax.net.ssl.X509TrustManager r1, java.lang.reflect.Method r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.qc7
    public final java.security.cert.X509Certificate a(java.security.cert.X509Certificate r2) {
            r1 = this;
            java.lang.reflect.Method r0 = r1.b     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
            javax.net.ssl.X509TrustManager r1 = r1.a     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
            java.lang.Object r1 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
            r1.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
            java.security.cert.TrustAnchor r1 = (java.security.cert.TrustAnchor) r1     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
            java.security.cert.X509Certificate r1 = r1.getTrustedCert()     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
            return r1
        L16:
            r1 = 0
            return r1
        L18:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r0 = "unable to get issues and signature"
            r2.<init>(r0, r1)
            throw r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof defpackage.mj
            if (r0 != 0) goto L8
            goto L1f
        L8:
            mj r3 = (defpackage.mj) r3
            javax.net.ssl.X509TrustManager r0 = r2.a
            javax.net.ssl.X509TrustManager r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.lang.reflect.Method r2 = r2.b
            java.lang.reflect.Method r3 = r3.b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.reflect.Method r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CustomTrustRootIndex(trustManager="
            r0.<init>(r1)
            javax.net.ssl.X509TrustManager r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", findByIssuerAndSignatureMethod="
            r0.append(r1)
            java.lang.reflect.Method r2 = r2.b
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
