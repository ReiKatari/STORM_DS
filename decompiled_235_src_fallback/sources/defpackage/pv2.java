package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pv2  reason: default package */
/* loaded from: classes.dex */
public final class pv2 {
    public final defpackage.l67 a;
    public final defpackage.rq0 b;
    public final java.util.List c;
    public final defpackage.ex6 d;

    public pv2(defpackage.l67 r1, defpackage.rq0 r2, java.util.List r3, defpackage.on2 r4) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            x7 r1 = new x7
            r2 = 10
            r1.<init>(r2, r4)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.d = r2
            return
    }

    public final java.util.List a() {
            r0 = this;
            ex6 r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.pv2
            if (r0 == 0) goto L2d
            pv2 r3 = (defpackage.pv2) r3
            l67 r0 = r3.a
            l67 r1 = r2.a
            if (r0 != r1) goto L2d
            rq0 r0 = r3.b
            rq0 r1 = r2.b
            if (r0 == r1) goto L13
            goto L2d
        L13:
            java.util.List r0 = r3.a()
            java.util.List r1 = r2.a()
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L2d
            java.util.List r3 = r3.c
            java.util.List r2 = r2.c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            l67 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            rq0 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List r0 = r2.a()
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r5 = this;
            java.util.List r0 = r5.a()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = defpackage.ht0.v0(r0, r2)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r3 = r0.next()
            java.security.cert.Certificate r3 = (java.security.cert.Certificate) r3
            boolean r4 = r3 instanceof java.security.cert.X509Certificate
            if (r4 == 0) goto L2e
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            java.security.Principal r3 = r3.getSubjectDN()
            java.lang.String r3 = r3.toString()
            goto L35
        L2e:
            java.lang.String r3 = r3.getType()
            r3.getClass()
        L35:
            r1.add(r3)
            goto L13
        L39:
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Handshake{tlsVersion="
            r1.<init>(r3)
            l67 r3 = r5.a
            r1.append(r3)
            java.lang.String r3 = " cipherSuite="
            r1.append(r3)
            rq0 r3 = r5.b
            r1.append(r3)
            java.lang.String r3 = " peerCertificates="
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = " localCertificates="
            r1.append(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.c
            int r2 = defpackage.ht0.v0(r5, r2)
            r0.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L6f:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L95
            java.lang.Object r2 = r5.next()
            java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
            boolean r3 = r2 instanceof java.security.cert.X509Certificate
            if (r3 == 0) goto L8a
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.security.Principal r2 = r2.getSubjectDN()
            java.lang.String r2 = r2.toString()
            goto L91
        L8a:
            java.lang.String r2 = r2.getType()
            r2.getClass()
        L91:
            r0.add(r2)
            goto L6f
        L95:
            r1.append(r0)
            r5 = 125(0x7d, float:1.75E-43)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
    }
}
