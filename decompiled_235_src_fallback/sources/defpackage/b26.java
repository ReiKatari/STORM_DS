package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b26  reason: default package */
/* loaded from: classes.dex */
public final class b26 {
    public final defpackage.ea a;
    public final java.net.Proxy b;
    public final java.net.InetSocketAddress c;

    public b26(defpackage.ea r1, java.net.Proxy r2, java.net.InetSocketAddress r3) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.b26
            if (r0 == 0) goto L26
            b26 r3 = (defpackage.b26) r3
            ea r0 = r3.a
            ea r1 = r2.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            java.net.Proxy r0 = r3.b
            java.net.Proxy r1 = r2.b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            java.net.InetSocketAddress r3 = r3.c
            java.net.InetSocketAddress r2 = r2.c
            boolean r2 = defpackage.nb3.k(r3, r2)
            if (r2 == 0) goto L26
            r2 = 1
            return r2
        L26:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            ea r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            java.net.Proxy r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.InetSocketAddress r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ea r1 = r11.a
            i03 r1 = r1.h
            java.lang.String r2 = r1.d
            java.net.InetSocketAddress r3 = r11.c
            java.net.InetAddress r4 = r3.getAddress()
            if (r4 == 0) goto L1e
            java.lang.String r4 = r4.getHostAddress()
            if (r4 == 0) goto L1e
            java.lang.String r4 = defpackage.wy7.b(r4)
            goto L1f
        L1e:
            r4 = 0
        L1f:
            r5 = 58
            boolean r6 = defpackage.qs6.k0(r2, r5)
            java.lang.String r7 = "]"
            java.lang.String r8 = "["
            if (r6 == 0) goto L35
            r0.append(r8)
            r0.append(r2)
            r0.append(r7)
            goto L38
        L35:
            r0.append(r2)
        L38:
            int r6 = r1.e
            int r9 = r3.getPort()
            java.lang.String r10 = ":"
            if (r6 != r9) goto L48
            boolean r6 = r2.equals(r4)
            if (r6 == 0) goto L50
        L48:
            r0.append(r10)
            int r1 = r1.e
            r0.append(r1)
        L50:
            boolean r1 = r2.equals(r4)
            if (r1 != 0) goto L90
            java.net.Proxy r11 = r11.b
            java.net.Proxy r1 = java.net.Proxy.NO_PROXY
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L66
            java.lang.String r11 = " at "
            r0.append(r11)
            goto L6b
        L66:
            java.lang.String r11 = " via proxy "
            r0.append(r11)
        L6b:
            if (r4 != 0) goto L73
            java.lang.String r11 = "<unresolved>"
            r0.append(r11)
            goto L86
        L73:
            boolean r11 = defpackage.qs6.k0(r4, r5)
            if (r11 == 0) goto L83
            r0.append(r8)
            r0.append(r4)
            r0.append(r7)
            goto L86
        L83:
            r0.append(r4)
        L86:
            r0.append(r10)
            int r11 = r3.getPort()
            r0.append(r11)
        L90:
            java.lang.String r11 = r0.toString()
            return r11
    }
}
