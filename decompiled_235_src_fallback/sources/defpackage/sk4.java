package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sk4  reason: default package */
/* loaded from: classes.dex */
public final class sk4 implements javax.net.ssl.HostnameVerifier {
    public static final defpackage.sk4 a = null;

    static {
            sk4 r0 = new sk4
            r0.<init>()
            defpackage.sk4.a = r0
            return
    }

    public static java.util.List a(java.security.cert.X509Certificate r4, int r5) {
            java.util.Collection r4 = r4.getSubjectAlternativeNames()     // Catch: java.security.cert.CertificateParsingException -> L44
            if (r4 != 0) goto L7
            goto L44
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.security.cert.CertificateParsingException -> L44
            r0.<init>()     // Catch: java.security.cert.CertificateParsingException -> L44
            java.util.Iterator r4 = r4.iterator()     // Catch: java.security.cert.CertificateParsingException -> L44
        L10:
            boolean r1 = r4.hasNext()     // Catch: java.security.cert.CertificateParsingException -> L44
            if (r1 == 0) goto L43
            java.lang.Object r1 = r4.next()     // Catch: java.security.cert.CertificateParsingException -> L44
            java.util.List r1 = (java.util.List) r1     // Catch: java.security.cert.CertificateParsingException -> L44
            if (r1 == 0) goto L10
            int r2 = r1.size()     // Catch: java.security.cert.CertificateParsingException -> L44
            r3 = 2
            if (r2 >= r3) goto L26
            goto L10
        L26:
            r2 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch: java.security.cert.CertificateParsingException -> L44
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch: java.security.cert.CertificateParsingException -> L44
            boolean r2 = defpackage.nb3.k(r2, r3)     // Catch: java.security.cert.CertificateParsingException -> L44
            if (r2 == 0) goto L10
            r2 = 1
            java.lang.Object r1 = r1.get(r2)     // Catch: java.security.cert.CertificateParsingException -> L44
            if (r1 != 0) goto L3d
            goto L10
        L3d:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.security.cert.CertificateParsingException -> L44
            r0.add(r1)     // Catch: java.security.cert.CertificateParsingException -> L44
            goto L10
        L43:
            return r0
        L44:
            yt1 r4 = defpackage.yt1.A
            return r4
    }

    public static boolean b(java.lang.String r13) {
            int r0 = r13.length()
            int r1 = r13.length()
            r2 = 0
            if (r1 < 0) goto L7d
            int r3 = r13.length()
            if (r1 > r3) goto L60
            r3 = 0
            r5 = r2
        L14:
            if (r5 >= r1) goto L5a
            char r6 = r13.charAt(r5)
            r7 = 128(0x80, float:1.8E-43)
            r8 = 1
            if (r6 >= r7) goto L24
            long r3 = r3 + r8
        L21:
            int r5 = r5 + 1
            goto L14
        L24:
            r7 = 2048(0x800, float:2.87E-42)
            if (r6 >= r7) goto L2c
            r6 = 2
        L2a:
            long r3 = r3 + r6
            goto L21
        L2c:
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r7) goto L57
            r7 = 57343(0xdfff, float:8.0355E-41)
            if (r6 <= r7) goto L37
            goto L57
        L37:
            int r10 = r5 + 1
            if (r10 >= r1) goto L40
            char r11 = r13.charAt(r10)
            goto L41
        L40:
            r11 = r2
        L41:
            r12 = 56319(0xdbff, float:7.892E-41)
            if (r6 > r12) goto L54
            r6 = 56320(0xdc00, float:7.8921E-41)
            if (r11 < r6) goto L54
            if (r11 <= r7) goto L4e
            goto L54
        L4e:
            r6 = 4
            long r3 = r3 + r6
            int r5 = r5 + 2
            goto L14
        L54:
            long r3 = r3 + r8
            r5 = r10
            goto L14
        L57:
            r6 = 3
            goto L2a
        L5a:
            int r13 = (int) r3
            if (r0 != r13) goto L5f
            r13 = 1
            return r13
        L5f:
            return r2
        L60:
            java.lang.String r0 = "endIndex > string.length: "
            java.lang.String r2 = " > "
            java.lang.StringBuilder r0 = defpackage.xg6.t(r0, r1, r2)
            int r13 = r13.length()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L7d:
            java.lang.String r13 = "endIndex < beginIndex: "
            java.lang.String r0 = " < 0"
            java.lang.String r13 = defpackage.lb1.k(r13, r1, r0)
            defpackage.i.f(r13)
            return r2
    }

    public static boolean c(java.lang.String r9, java.security.cert.X509Certificate r10) {
            r9.getClass()
            xh5 r0 = defpackage.wy7.a
            boolean r0 = r0.d(r9)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3a
            java.lang.String r9 = defpackage.wy7.b(r9)
            r0 = 7
            java.util.List r10 = a(r10, r0)
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L1e
            goto L119
        L1e:
            java.util.Iterator r10 = r10.iterator()
        L22:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L119
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = defpackage.wy7.b(r0)
            boolean r0 = defpackage.nb3.k(r9, r0)
            if (r0 == 0) goto L22
            goto L118
        L3a:
            boolean r0 = b(r9)
            if (r0 == 0) goto L4c
            java.util.Locale r0 = java.util.Locale.US
            r0.getClass()
            java.lang.String r9 = r9.toLowerCase(r0)
            r9.getClass()
        L4c:
            r0 = 2
            java.util.List r10 = a(r10, r0)
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L59
            goto L119
        L59:
            java.util.Iterator r10 = r10.iterator()
        L5d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L119
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            int r3 = r9.length()
            if (r3 != 0) goto L71
            goto Leb
        L71:
            java.lang.String r3 = "."
            boolean r4 = defpackage.xs6.g0(r9, r3, r2)
            if (r4 != 0) goto Leb
            java.lang.String r4 = ".."
            boolean r5 = defpackage.xs6.Y(r9, r4, r2)
            if (r5 == 0) goto L83
            goto Leb
        L83:
            if (r0 == 0) goto Leb
            int r5 = r0.length()
            if (r5 != 0) goto L8c
            goto Leb
        L8c:
            boolean r5 = defpackage.xs6.g0(r0, r3, r2)
            if (r5 != 0) goto Leb
            boolean r4 = defpackage.xs6.Y(r0, r4, r2)
            if (r4 == 0) goto L99
            goto Leb
        L99:
            boolean r4 = defpackage.xs6.Y(r9, r3, r2)
            if (r4 != 0) goto La4
            java.lang.String r4 = r9.concat(r3)
            goto La5
        La4:
            r4 = r9
        La5:
            boolean r5 = defpackage.xs6.Y(r0, r3, r2)
            if (r5 != 0) goto Laf
            java.lang.String r0 = r0.concat(r3)
        Laf:
            boolean r3 = b(r0)
            if (r3 == 0) goto Lc1
            java.util.Locale r3 = java.util.Locale.US
            r3.getClass()
            java.lang.String r0 = r0.toLowerCase(r3)
            r0.getClass()
        Lc1:
            java.lang.String r3 = "*"
            boolean r3 = defpackage.qs6.j0(r0, r3, r2)
            if (r3 != 0) goto Lce
            boolean r0 = r4.equals(r0)
            goto L116
        Lce:
            java.lang.String r3 = "*."
            boolean r5 = defpackage.xs6.g0(r0, r3, r2)
            if (r5 == 0) goto Leb
            r5 = 42
            r6 = 4
            int r5 = defpackage.qs6.s0(r5, r1, r6, r0)
            r7 = -1
            if (r5 == r7) goto Le1
            goto Leb
        Le1:
            int r5 = r4.length()
            int r8 = r0.length()
            if (r5 >= r8) goto Led
        Leb:
            r0 = r2
            goto L116
        Led:
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto Lf4
            goto Leb
        Lf4:
            java.lang.String r0 = r0.substring(r1)
            boolean r3 = defpackage.xs6.Y(r4, r0, r2)
            if (r3 != 0) goto Lff
            goto Leb
        Lff:
            int r3 = r4.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto L115
            int r3 = r3 + (-1)
            r0 = 46
            int r0 = defpackage.qs6.x0(r0, r3, r6, r4)
            if (r0 == r7) goto L115
            goto Leb
        L115:
            r0 = r1
        L116:
            if (r0 == 0) goto L5d
        L118:
            return r1
        L119:
            return r2
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(java.lang.String r2, javax.net.ssl.SSLSession r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            boolean r1 = b(r2)
            r0 = 0
            if (r1 != 0) goto Le
            goto L1e
        Le:
            java.security.cert.Certificate[] r1 = r3.getPeerCertificates()     // Catch: javax.net.ssl.SSLException -> L1e
            r1 = r1[r0]     // Catch: javax.net.ssl.SSLException -> L1e
            r1.getClass()     // Catch: javax.net.ssl.SSLException -> L1e
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1     // Catch: javax.net.ssl.SSLException -> L1e
            boolean r1 = c(r2, r1)     // Catch: javax.net.ssl.SSLException -> L1e
            return r1
        L1e:
            return r0
    }
}
