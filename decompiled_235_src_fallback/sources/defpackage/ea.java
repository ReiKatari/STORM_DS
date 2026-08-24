package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ea  reason: default package */
/* loaded from: classes.dex */
public final class ea {
    public final defpackage.d90 a;
    public final javax.net.SocketFactory b;
    public final javax.net.ssl.SSLSocketFactory c;
    public final javax.net.ssl.HostnameVerifier d;
    public final defpackage.il0 e;
    public final defpackage.xd5 f;
    public final java.net.ProxySelector g;
    public final defpackage.i03 h;
    public final java.util.List i;
    public final java.util.List j;

    public ea(java.lang.String r1, int r2, defpackage.d90 r3, javax.net.SocketFactory r4, javax.net.ssl.SSLSocketFactory r5, javax.net.ssl.HostnameVerifier r6, defpackage.il0 r7, defpackage.xd5 r8, java.util.List r9, java.util.List r10, java.net.ProxySelector r11) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r4.getClass()
            r8.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r0.<init>()
            r0.a = r3
            r0.b = r4
            r0.c = r5
            r0.d = r6
            r0.e = r7
            r0.f = r8
            r0.g = r11
            h03 r3 = new h03
            r4 = 0
            r3.<init>(r4)
            java.lang.String r6 = "http"
            java.lang.String r7 = "https"
            if (r5 == 0) goto L34
            r5 = r7
            goto L35
        L34:
            r5 = r6
        L35:
            boolean r8 = r5.equalsIgnoreCase(r6)
            r11 = 0
            if (r8 == 0) goto L3f
            r3.c = r6
            goto L47
        L3f:
            boolean r6 = r5.equalsIgnoreCase(r7)
            if (r6 == 0) goto L84
            r3.c = r7
        L47:
            r5 = 7
            java.lang.String r4 = defpackage.jw2.x(r4, r4, r5, r1)
            java.lang.String r4 = defpackage.wy7.b(r4)
            if (r4 == 0) goto L7a
            r3.f = r4
            r1 = 1
            if (r1 > r2) goto L70
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r2 >= r1) goto L70
            r3.b = r2
            i03 r1 = r3.b()
            r0.h = r1
            java.util.List r1 = defpackage.az7.j(r9)
            r0.i = r1
            java.util.List r1 = defpackage.az7.j(r10)
            r0.j = r1
            return
        L70:
            java.lang.String r0 = "unexpected port: "
            java.lang.String r0 = defpackage.lb1.g(r2, r0)
            defpackage.i.f(r0)
            throw r11
        L7a:
            java.lang.String r0 = "unexpected host: "
            java.lang.String r0 = r0.concat(r1)
            defpackage.i.h(r0)
            throw r11
        L84:
            java.lang.String r0 = "unexpected scheme: "
            java.lang.String r0 = r0.concat(r5)
            defpackage.i.h(r0)
            throw r11
    }

    public final boolean a(defpackage.ea r3) {
            r2 = this;
            r3.getClass()
            d90 r0 = r2.a
            d90 r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L5f
            xd5 r0 = r2.f
            xd5 r1 = r3.f
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L5f
            java.util.List r0 = r2.i
            java.util.List r1 = r3.i
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L5f
            java.util.List r0 = r2.j
            java.util.List r1 = r3.j
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L5f
            java.net.ProxySelector r0 = r2.g
            java.net.ProxySelector r1 = r3.g
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L5f
            javax.net.ssl.SSLSocketFactory r0 = r2.c
            javax.net.ssl.SSLSocketFactory r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L5f
            javax.net.ssl.HostnameVerifier r0 = r2.d
            javax.net.ssl.HostnameVerifier r1 = r3.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L5f
            il0 r0 = r2.e
            il0 r1 = r3.e
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L5f
            i03 r2 = r2.h
            int r2 = r2.e
            i03 r3 = r3.h
            int r3 = r3.e
            if (r2 != r3) goto L5f
            r2 = 1
            return r2
        L5f:
            r2 = 0
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.ea
            if (r0 == 0) goto L18
            ea r3 = (defpackage.ea) r3
            i03 r0 = r3.h
            i03 r1 = r2.h
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 == 0) goto L18
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L18
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            i03 r0 = r3.h
            java.lang.String r0 = r0.i
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = defpackage.xg6.d(r1, r2, r0)
            d90 r1 = r3.a
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * r2
            xd5 r0 = r3.f
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * r2
            java.util.List r1 = r3.i
            int r0 = defpackage.i61.b(r0, r1, r2)
            java.util.List r1 = r3.j
            int r0 = defpackage.i61.b(r0, r1, r2)
            java.net.ProxySelector r1 = r3.g
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 961
            javax.net.ssl.SSLSocketFactory r0 = r3.c
            int r0 = java.util.Objects.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * r2
            javax.net.ssl.HostnameVerifier r1 = r3.d
            int r1 = java.util.Objects.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * r2
            il0 r3 = r3.e
            int r3 = java.util.Objects.hashCode(r3)
            int r3 = r3 + r1
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Address{"
            r0.<init>(r1)
            i03 r1 = r3.h
            java.lang.String r2 = r1.d
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            int r1 = r1.e
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "proxySelector="
            r1.<init>(r2)
            java.net.ProxySelector r3 = r3.g
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
