package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ia0  reason: default package */
/* loaded from: classes.dex */
public final class ia0 {
    public static final java.lang.String k = null;
    public static final java.lang.String l = null;
    public final defpackage.i03 a;
    public final defpackage.yw2 b;
    public final java.lang.String c;
    public final defpackage.k55 d;
    public final int e;
    public final java.lang.String f;
    public final defpackage.yw2 g;
    public final defpackage.pv2 h;
    public final long i;
    public final long j;

    static {
            kx4 r0 = defpackage.kx4.a
            kx4 r0 = defpackage.kx4.a
            r0.getClass()
            java.lang.String r0 = "OkHttp-Sent-Millis"
            defpackage.ia0.k = r0
            kx4 r0 = defpackage.kx4.a
            r0.getClass()
            java.lang.String r0 = "OkHttp-Received-Millis"
            defpackage.ia0.l = r0
            return
    }

    public ia0(defpackage.in6 r12) {
            r11 = this;
            java.lang.String r0 = "Cache corruption for "
            r12.getClass()
            r11.<init>()
            fe5 r1 = new fe5     // Catch: java.lang.Throwable -> L46
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L46
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r4 = r1.y(r2)     // Catch: java.lang.Throwable -> L46
            r5 = 0
            r6 = 0
            h03 r7 = new h03     // Catch: java.lang.IllegalArgumentException -> L25 java.lang.Throwable -> L46
            r7.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L25 java.lang.Throwable -> L46
            r7.e(r6, r4)     // Catch: java.lang.IllegalArgumentException -> L25 java.lang.Throwable -> L46
            i03 r7 = r7.b()     // Catch: java.lang.IllegalArgumentException -> L25 java.lang.Throwable -> L46
            goto L26
        L25:
            r7 = r6
        L26:
            if (r7 == 0) goto L11d
            r11.a = r7     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = r1.y(r2)     // Catch: java.lang.Throwable -> L46
            r11.c = r0     // Catch: java.lang.Throwable -> L46
            ww2 r0 = new ww2     // Catch: java.lang.Throwable -> L46
            r0.<init>(r5, r5)     // Catch: java.lang.Throwable -> L46
            int r4 = defpackage.g04.N(r1)     // Catch: java.lang.Throwable -> L46
            r7 = r5
        L3a:
            if (r7 >= r4) goto L49
            java.lang.String r8 = r1.y(r2)     // Catch: java.lang.Throwable -> L46
            r0.c(r8)     // Catch: java.lang.Throwable -> L46
            int r7 = r7 + 1
            goto L3a
        L46:
            r11 = move-exception
            goto L131
        L49:
            yw2 r0 = r0.f()     // Catch: java.lang.Throwable -> L46
            r11.b = r0     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = r1.y(r2)     // Catch: java.lang.Throwable -> L46
            ei r0 = defpackage.xk2.E(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r4 = r0.L     // Catch: java.lang.Throwable -> L46
            k55 r4 = (defpackage.k55) r4     // Catch: java.lang.Throwable -> L46
            r11.d = r4     // Catch: java.lang.Throwable -> L46
            int r4 = r0.B     // Catch: java.lang.Throwable -> L46
            r11.e = r4     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = r0.R     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L46
            r11.f = r0     // Catch: java.lang.Throwable -> L46
            ww2 r0 = new ww2     // Catch: java.lang.Throwable -> L46
            r0.<init>(r5, r5)     // Catch: java.lang.Throwable -> L46
            int r4 = defpackage.g04.N(r1)     // Catch: java.lang.Throwable -> L46
        L70:
            if (r5 >= r4) goto L7c
            java.lang.String r7 = r1.y(r2)     // Catch: java.lang.Throwable -> L46
            r0.c(r7)     // Catch: java.lang.Throwable -> L46
            int r5 = r5 + 1
            goto L70
        L7c:
            java.lang.String r4 = defpackage.ia0.k     // Catch: java.lang.Throwable -> L46
            java.lang.String r5 = r0.j(r4)     // Catch: java.lang.Throwable -> L46
            java.lang.String r7 = defpackage.ia0.l     // Catch: java.lang.Throwable -> L46
            java.lang.String r8 = r0.j(r7)     // Catch: java.lang.Throwable -> L46
            r0.r(r4)     // Catch: java.lang.Throwable -> L46
            r0.r(r7)     // Catch: java.lang.Throwable -> L46
            r9 = 0
            if (r5 == 0) goto L97
            long r4 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Throwable -> L46
            goto L98
        L97:
            r4 = r9
        L98:
            r11.i = r4     // Catch: java.lang.Throwable -> L46
            if (r8 == 0) goto La0
            long r9 = java.lang.Long.parseLong(r8)     // Catch: java.lang.Throwable -> L46
        La0:
            r11.j = r9     // Catch: java.lang.Throwable -> L46
            yw2 r0 = r0.f()     // Catch: java.lang.Throwable -> L46
            r11.g = r0     // Catch: java.lang.Throwable -> L46
            i03 r0 = r11.a     // Catch: java.lang.Throwable -> L46
            boolean r0 = r0.f()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L117
            java.lang.String r0 = r1.y(r2)     // Catch: java.lang.Throwable -> L46
            int r4 = r0.length()     // Catch: java.lang.Throwable -> L46
            if (r4 > 0) goto Lfb
            java.lang.String r0 = r1.y(r2)     // Catch: java.lang.Throwable -> L46
            cs1 r4 = defpackage.rq0.b     // Catch: java.lang.Throwable -> L46
            rq0 r0 = r4.r(r0)     // Catch: java.lang.Throwable -> L46
            java.util.List r4 = a(r1)     // Catch: java.lang.Throwable -> L46
            java.util.List r5 = a(r1)     // Catch: java.lang.Throwable -> L46
            boolean r6 = r1.e()     // Catch: java.lang.Throwable -> L46
            if (r6 != 0) goto Le0
            k67 r6 = defpackage.l67.Companion     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = r1.y(r2)     // Catch: java.lang.Throwable -> L46
            r6.getClass()     // Catch: java.lang.Throwable -> L46
            l67 r1 = defpackage.k67.a(r1)     // Catch: java.lang.Throwable -> L46
            goto Le2
        Le0:
            l67 r1 = defpackage.l67.SSL_3_0     // Catch: java.lang.Throwable -> L46
        Le2:
            r1.getClass()     // Catch: java.lang.Throwable -> L46
            java.util.List r2 = defpackage.az7.j(r4)     // Catch: java.lang.Throwable -> L46
            pv2 r3 = new pv2     // Catch: java.lang.Throwable -> L46
            java.util.List r4 = defpackage.az7.j(r5)     // Catch: java.lang.Throwable -> L46
            b5 r5 = new b5     // Catch: java.lang.Throwable -> L46
            r6 = 2
            r5.<init>(r6, r2)     // Catch: java.lang.Throwable -> L46
            r3.<init>(r1, r0, r4, r5)     // Catch: java.lang.Throwable -> L46
            r11.h = r3     // Catch: java.lang.Throwable -> L46
            goto L119
        Lfb:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r1.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = "expected \"\" but was \""
            r1.append(r2)     // Catch: java.lang.Throwable -> L46
            r1.append(r0)     // Catch: java.lang.Throwable -> L46
            r0 = 34
            r1.append(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L46
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L46
            throw r11     // Catch: java.lang.Throwable -> L46
        L117:
            r11.h = r6     // Catch: java.lang.Throwable -> L46
        L119:
            r12.close()
            return
        L11d:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = r0.concat(r4)     // Catch: java.lang.Throwable -> L46
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L46
            kx4 r0 = defpackage.kx4.a     // Catch: java.lang.Throwable -> L46
            kx4 r0 = defpackage.kx4.a     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "cache corruption"
            r2 = 5
            r0.i(r1, r2, r11)     // Catch: java.lang.Throwable -> L46
            throw r11     // Catch: java.lang.Throwable -> L46
        L131:
            throw r11     // Catch: java.lang.Throwable -> L132
        L132:
            r0 = move-exception
            defpackage.ge7.t(r12, r11)
            throw r0
    }

    public ia0(defpackage.wl5 r10) {
            r9 = this;
            r9.<init>()
            pa r0 = r10.A
            java.lang.Object r1 = r0.B
            i03 r1 = (defpackage.i03) r1
            r9.a = r1
            wl5 r1 = r10.e0
            r1.getClass()
            pa r1 = r1.A
            java.lang.Object r1 = r1.R
            yw2 r1 = (defpackage.yw2) r1
            yw2 r2 = r10.Y
            java.util.Set r3 = defpackage.g04.X(r2)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L25
            yw2 r1 = defpackage.yw2.B
            goto L49
        L25:
            ww2 r4 = new ww2
            r5 = 0
            r4.<init>(r5, r5)
            int r6 = r1.size()
        L2f:
            if (r5 >= r6) goto L45
            java.lang.String r7 = r1.b(r5)
            boolean r8 = r3.contains(r7)
            if (r8 == 0) goto L42
            java.lang.String r8 = r1.d(r5)
            r4.b(r7, r8)
        L42:
            int r5 = r5 + 1
            goto L2f
        L45:
            yw2 r1 = r4.f()
        L49:
            r9.b = r1
            java.lang.Object r0 = r0.L
            java.lang.String r0 = (java.lang.String) r0
            r9.c = r0
            k55 r0 = r10.B
            r9.d = r0
            int r0 = r10.R
            r9.e = r0
            java.lang.String r0 = r10.L
            r9.f = r0
            r9.g = r2
            pv2 r0 = r10.X
            r9.h = r0
            long r0 = r10.h0
            r9.i = r0
            long r0 = r10.i0
            r9.j = r0
            return
    }

    public static java.util.List a(defpackage.fe5 r8) {
            int r0 = defpackage.g04.N(r8)
            r1 = -1
            if (r0 != r1) goto La
            yt1 r8 = defpackage.yt1.A
            return r8
        La:
            java.lang.String r1 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch: java.security.cert.CertificateException -> L4a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.security.cert.CertificateException -> L4a
            r2.<init>(r0)     // Catch: java.security.cert.CertificateException -> L4a
            r3 = 0
            r4 = r3
        L17:
            if (r4 >= r0) goto L49
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r5 = r8.y(r5)     // Catch: java.security.cert.CertificateException -> L4a
            k80 r6 = new k80     // Catch: java.security.cert.CertificateException -> L4a
            r6.<init>()     // Catch: java.security.cert.CertificateException -> L4a
            da0 r7 = defpackage.da0.R     // Catch: java.security.cert.CertificateException -> L4a
            da0 r5 = defpackage.xd5.m(r5)     // Catch: java.security.cert.CertificateException -> L4a
            if (r5 == 0) goto L41
            r6.k0(r5)     // Catch: java.security.cert.CertificateException -> L4a
            j80 r5 = new j80     // Catch: java.security.cert.CertificateException -> L4a
            r5.<init>(r6, r3)     // Catch: java.security.cert.CertificateException -> L4a
            java.security.cert.Certificate r5 = r1.generateCertificate(r5)     // Catch: java.security.cert.CertificateException -> L4a
            r2.add(r5)     // Catch: java.security.cert.CertificateException -> L4a
            int r4 = r4 + 1
            goto L17
        L41:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.security.cert.CertificateException -> L4a
            java.lang.String r0 = "Corrupt certificate in cache entry"
            r8.<init>(r0)     // Catch: java.security.cert.CertificateException -> L4a
            throw r8     // Catch: java.security.cert.CertificateException -> L4a
        L49:
            return r2
        L4a:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            defpackage.e41.i(r8)
            r8 = 0
            return r8
    }

    public static void b(defpackage.ee5 r3, java.util.List r4) {
            int r0 = r4.size()     // Catch: java.security.cert.CertificateEncodingException -> L36
            long r0 = (long) r0     // Catch: java.security.cert.CertificateEncodingException -> L36
            r3.h0(r0)     // Catch: java.security.cert.CertificateEncodingException -> L36
            r0 = 10
            r3.writeByte(r0)     // Catch: java.security.cert.CertificateEncodingException -> L36
            java.util.Iterator r4 = r4.iterator()     // Catch: java.security.cert.CertificateEncodingException -> L36
        L11:
            boolean r1 = r4.hasNext()     // Catch: java.security.cert.CertificateEncodingException -> L36
            if (r1 == 0) goto L35
            java.lang.Object r1 = r4.next()     // Catch: java.security.cert.CertificateEncodingException -> L36
            java.security.cert.Certificate r1 = (java.security.cert.Certificate) r1     // Catch: java.security.cert.CertificateEncodingException -> L36
            byte[] r1 = r1.getEncoded()     // Catch: java.security.cert.CertificateEncodingException -> L36
            da0 r2 = defpackage.da0.R     // Catch: java.security.cert.CertificateEncodingException -> L36
            r1.getClass()     // Catch: java.security.cert.CertificateEncodingException -> L36
            da0 r1 = defpackage.xd5.t(r1)     // Catch: java.security.cert.CertificateEncodingException -> L36
            java.lang.String r1 = r1.a()     // Catch: java.security.cert.CertificateEncodingException -> L36
            r3.H(r1)     // Catch: java.security.cert.CertificateEncodingException -> L36
            r3.writeByte(r0)     // Catch: java.security.cert.CertificateEncodingException -> L36
            goto L11
        L35:
            return
        L36:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            defpackage.e41.i(r3)
            return
    }

    public final void c(defpackage.bk1 r12) {
            r11 = this;
            i03 r0 = r11.a
            pv2 r1 = r11.h
            yw2 r2 = r11.g
            yw2 r3 = r11.b
            r4 = 0
            ui6 r12 = r12.l(r4)
            ee5 r5 = new ee5
            r5.<init>(r12)
            java.lang.String r12 = r0.i     // Catch: java.lang.Throwable -> L4f
            r5.H(r12)     // Catch: java.lang.Throwable -> L4f
            r12 = 10
            r5.writeByte(r12)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = r11.c     // Catch: java.lang.Throwable -> L4f
            r5.H(r6)     // Catch: java.lang.Throwable -> L4f
            r5.writeByte(r12)     // Catch: java.lang.Throwable -> L4f
            int r6 = r3.size()     // Catch: java.lang.Throwable -> L4f
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L4f
            r5.h0(r6)     // Catch: java.lang.Throwable -> L4f
            r5.writeByte(r12)     // Catch: java.lang.Throwable -> L4f
            int r6 = r3.size()     // Catch: java.lang.Throwable -> L4f
            r7 = r4
        L34:
            java.lang.String r8 = ": "
            if (r7 >= r6) goto L52
            java.lang.String r9 = r3.b(r7)     // Catch: java.lang.Throwable -> L4f
            r5.H(r9)     // Catch: java.lang.Throwable -> L4f
            r5.H(r8)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r8 = r3.d(r7)     // Catch: java.lang.Throwable -> L4f
            r5.H(r8)     // Catch: java.lang.Throwable -> L4f
            r5.writeByte(r12)     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 + 1
            goto L34
        L4f:
            r11 = move-exception
            goto L106
        L52:
            k55 r3 = r11.d     // Catch: java.lang.Throwable -> L4f
            int r6 = r11.e     // Catch: java.lang.Throwable -> L4f
            java.lang.String r7 = r11.f     // Catch: java.lang.Throwable -> L4f
            r3.getClass()     // Catch: java.lang.Throwable -> L4f
            r7.getClass()     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r9.<init>()     // Catch: java.lang.Throwable -> L4f
            k55 r10 = defpackage.k55.HTTP_1_0     // Catch: java.lang.Throwable -> L4f
            if (r3 != r10) goto L6d
            java.lang.String r3 = "HTTP/1.0"
            r9.append(r3)     // Catch: java.lang.Throwable -> L4f
            goto L72
        L6d:
            java.lang.String r3 = "HTTP/1.1"
            r9.append(r3)     // Catch: java.lang.Throwable -> L4f
        L72:
            r3 = 32
            r9.append(r3)     // Catch: java.lang.Throwable -> L4f
            r9.append(r6)     // Catch: java.lang.Throwable -> L4f
            r9.append(r3)     // Catch: java.lang.Throwable -> L4f
            r9.append(r7)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r9.toString()     // Catch: java.lang.Throwable -> L4f
            r5.H(r3)     // Catch: java.lang.Throwable -> L4f
            r5.writeByte(r12)     // Catch: java.lang.Throwable -> L4f
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L4f
            int r3 = r3 + 2
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L4f
            r5.h0(r6)     // Catch: java.lang.Throwable -> L4f
            r5.writeByte(r12)     // Catch: java.lang.Throwable -> L4f
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L4f
        L9b:
            if (r4 >= r3) goto Lb4
            java.lang.String r6 = r2.b(r4)     // Catch: java.lang.Throwable -> L4f
            r5.H(r6)     // Catch: java.lang.Throwable -> L4f
            r5.H(r8)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = r2.d(r4)     // Catch: java.lang.Throwable -> L4f
            r5.H(r6)     // Catch: java.lang.Throwable -> L4f
            r5.writeByte(r12)     // Catch: java.lang.Throwable -> L4f
            int r4 = r4 + 1
            goto L9b
        Lb4:
            java.lang.String r2 = defpackage.ia0.k     // Catch: java.lang.Throwable -> L4f
            r5.H(r2)     // Catch: java.lang.Throwable -> L4f
            r5.H(r8)     // Catch: java.lang.Throwable -> L4f
            long r2 = r11.i     // Catch: java.lang.Throwable -> L4f
            r5.h0(r2)     // Catch: java.lang.Throwable -> L4f
            r5.writeByte(r12)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = defpackage.ia0.l     // Catch: java.lang.Throwable -> L4f
            r5.H(r2)     // Catch: java.lang.Throwable -> L4f
            r5.H(r8)     // Catch: java.lang.Throwable -> L4f
            long r2 = r11.j     // Catch: java.lang.Throwable -> L4f
            r5.h0(r2)     // Catch: java.lang.Throwable -> L4f
            r5.writeByte(r12)     // Catch: java.lang.Throwable -> L4f
            boolean r11 = r0.f()     // Catch: java.lang.Throwable -> L4f
            if (r11 == 0) goto L102
            r5.writeByte(r12)     // Catch: java.lang.Throwable -> L4f
            r1.getClass()     // Catch: java.lang.Throwable -> L4f
            rq0 r11 = r1.b     // Catch: java.lang.Throwable -> L4f
            java.lang.String r11 = r11.a     // Catch: java.lang.Throwable -> L4f
            r5.H(r11)     // Catch: java.lang.Throwable -> L4f
            r5.writeByte(r12)     // Catch: java.lang.Throwable -> L4f
            java.util.List r11 = r1.a()     // Catch: java.lang.Throwable -> L4f
            b(r5, r11)     // Catch: java.lang.Throwable -> L4f
            java.util.List r11 = r1.c     // Catch: java.lang.Throwable -> L4f
            b(r5, r11)     // Catch: java.lang.Throwable -> L4f
            l67 r11 = r1.a     // Catch: java.lang.Throwable -> L4f
            java.lang.String r11 = r11.javaName()     // Catch: java.lang.Throwable -> L4f
            r5.H(r11)     // Catch: java.lang.Throwable -> L4f
            r5.writeByte(r12)     // Catch: java.lang.Throwable -> L4f
        L102:
            r5.close()
            return
        L106:
            throw r11     // Catch: java.lang.Throwable -> L107
        L107:
            r12 = move-exception
            defpackage.ge7.t(r5, r11)
            throw r12
    }
}
