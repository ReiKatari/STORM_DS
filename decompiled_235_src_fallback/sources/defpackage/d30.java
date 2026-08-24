package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d30  reason: default package */
/* loaded from: classes.dex */
public final class d30 extends defpackage.q60 {
    public final defpackage.qc7 p;

    public d30(defpackage.qc7 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.p = r1
            return
    }

    public static boolean g0(java.security.cert.X509Certificate r2, java.security.cert.X509Certificate r3, int r4) {
            java.security.Principal r0 = r2.getIssuerDN()
            java.security.Principal r1 = r3.getSubjectDN()
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto Lf
            goto L1f
        Lf:
            int r0 = r3.getBasicConstraints()
            if (r0 >= r4) goto L16
            goto L1f
        L16:
            java.security.PublicKey r3 = r3.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L1f
            r2.verify(r3)     // Catch: java.security.GeneralSecurityException -> L1f
            r2 = 1
            return r2
        L1f:
            r2 = 0
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r3 != r2) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof defpackage.d30
            if (r1 == 0) goto L15
            d30 r3 = (defpackage.d30) r3
            qc7 r3 = r3.p
            qc7 r2 = r2.p
            boolean r2 = defpackage.nb3.k(r3, r2)
            if (r2 == 0) goto L15
            return r0
        L15:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r0 = this;
            qc7 r0 = r0.p
            int r0 = r0.hashCode()
            return r0
    }

    @Override // defpackage.q60
    public final java.util.List q(java.lang.String r8, java.util.List r9) {
            r7 = this;
            r9.getClass()
            r8.getClass()
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.Object r0 = r8.removeFirst()
            r0.getClass()
            r9.add(r0)
            r0 = 0
            r1 = r0
        L1c:
            r2 = 9
            if (r0 >= r2) goto L96
            int r2 = r9.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r2 = r9.get(r2)
            r2.getClass()
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            qc7 r4 = r7.p
            java.security.cert.X509Certificate r4 = r4.a(r2)
            if (r4 == 0) goto L55
            int r1 = r9.size()
            if (r1 > r3) goto L43
            boolean r1 = r2.equals(r4)
            if (r1 != 0) goto L46
        L43:
            r9.add(r4)
        L46:
            int r1 = r9.size()
            int r1 = r1 + (-2)
            boolean r1 = g0(r4, r4, r1)
            if (r1 == 0) goto L53
            goto L81
        L53:
            r1 = r3
            goto L7c
        L55:
            java.util.Iterator r4 = r8.iterator()
            r4.getClass()
        L5c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r4.next()
            r5.getClass()
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5
            int r6 = r9.size()
            int r6 = r6 - r3
            boolean r6 = g0(r2, r5, r6)
            if (r6 == 0) goto L5c
            r4.remove()
            r9.add(r5)
        L7c:
            int r0 = r0 + 1
            goto L1c
        L7f:
            if (r1 == 0) goto L82
        L81:
            return r9
        L82:
            javax.net.ssl.SSLPeerUnverifiedException r7 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed to find a trusted cert that signed "
            r8.<init>(r9)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L96:
            javax.net.ssl.SSLPeerUnverifiedException r7 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Certificate chain too long: "
            r8.<init>(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }
}
