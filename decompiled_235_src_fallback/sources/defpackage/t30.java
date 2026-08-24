package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t30  reason: default package */
/* loaded from: classes.dex */
public final class t30 implements defpackage.qc7 {
    public final java.util.LinkedHashMap a;

    public t30(java.security.cert.X509Certificate... r7) {
            r6 = this;
            r6.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            int r1 = r7.length
            r2 = 0
        La:
            if (r2 >= r1) goto L28
            r3 = r7[r2]
            javax.security.auth.x500.X500Principal r4 = r3.getSubjectX500Principal()
            java.lang.Object r5 = r0.get(r4)
            if (r5 != 0) goto L20
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            r0.put(r4, r5)
        L20:
            java.util.Set r5 = (java.util.Set) r5
            r5.add(r3)
            int r2 = r2 + 1
            goto La
        L28:
            r6.a = r0
            return
    }

    @Override // defpackage.qc7
    public final java.security.cert.X509Certificate a(java.security.cert.X509Certificate r4) {
            r3 = this;
            javax.security.auth.x500.X500Principal r0 = r4.getIssuerX500Principal()
            java.util.LinkedHashMap r3 = r3.a
            java.lang.Object r3 = r3.get(r0)
            java.util.Set r3 = (java.util.Set) r3
            r0 = 0
            if (r3 != 0) goto L10
            return r0
        L10:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L16:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            r2 = r1
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.security.PublicKey r2 = r2.getPublicKey()     // Catch: java.lang.Exception -> L16
            r4.verify(r2)     // Catch: java.lang.Exception -> L16
            r0 = r1
        L2b:
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L15
            boolean r0 = r2 instanceof defpackage.t30
            if (r0 == 0) goto L13
            t30 r2 = (defpackage.t30) r2
            java.util.LinkedHashMap r2 = r2.a
            java.util.LinkedHashMap r1 = r1.a
            boolean r1 = defpackage.nb3.k(r2, r1)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.util.LinkedHashMap r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }
}
