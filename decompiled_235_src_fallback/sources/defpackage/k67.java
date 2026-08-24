package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k67  reason: default package */
/* loaded from: classes.dex */
public final class k67 {
    public static defpackage.l67 a(java.lang.String r2) {
            r2.getClass()
            int r0 = r2.hashCode()
            r1 = 79201641(0x4b88569, float:4.338071E-36)
            if (r0 == r1) goto L41
            r1 = 79923350(0x4c38896, float:4.5969714E-36)
            if (r0 == r1) goto L36
            switch(r0) {
                case -503070503: goto L2b;
                case -503070502: goto L20;
                case -503070501: goto L15;
                default: goto L14;
            }
        L14:
            goto L4c
        L15:
            java.lang.String r0 = "TLSv1.3"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4c
            l67 r2 = defpackage.l67.TLS_1_3
            return r2
        L20:
            java.lang.String r0 = "TLSv1.2"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4c
            l67 r2 = defpackage.l67.TLS_1_2
            return r2
        L2b:
            java.lang.String r0 = "TLSv1.1"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4c
            l67 r2 = defpackage.l67.TLS_1_1
            return r2
        L36:
            java.lang.String r0 = "TLSv1"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4c
            l67 r2 = defpackage.l67.TLS_1_0
            return r2
        L41:
            java.lang.String r0 = "SSLv3"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4c
            l67 r2 = defpackage.l67.SSL_3_0
            return r2
        L4c:
            java.lang.String r0 = "Unexpected TLS version: "
            java.lang.String r2 = r0.concat(r2)
            defpackage.i.h(r2)
            r2 = 0
            return r2
    }
}
