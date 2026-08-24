package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j55  reason: default package */
/* loaded from: classes.dex */
public final class j55 {
    public static defpackage.k55 a(java.lang.String r3) {
            r3.getClass()
            k55 r0 = defpackage.k55.HTTP_1_0
            java.lang.String r1 = defpackage.k55.access$getProtocol$p(r0)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L10
            return r0
        L10:
            k55 r0 = defpackage.k55.HTTP_1_1
            java.lang.String r1 = defpackage.k55.access$getProtocol$p(r0)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L1d
            return r0
        L1d:
            k55 r0 = defpackage.k55.H2_PRIOR_KNOWLEDGE
            java.lang.String r1 = defpackage.k55.access$getProtocol$p(r0)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L2a
            return r0
        L2a:
            k55 r0 = defpackage.k55.HTTP_2
            java.lang.String r1 = defpackage.k55.access$getProtocol$p(r0)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L37
            return r0
        L37:
            k55 r0 = defpackage.k55.SPDY_3
            java.lang.String r1 = defpackage.k55.access$getProtocol$p(r0)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L44
            return r0
        L44:
            k55 r0 = defpackage.k55.QUIC
            java.lang.String r1 = defpackage.k55.access$getProtocol$p(r0)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L51
            return r0
        L51:
            k55 r0 = defpackage.k55.HTTP_3
            java.lang.String r1 = defpackage.k55.access$getProtocol$p(r0)
            r2 = 0
            boolean r1 = defpackage.xs6.g0(r3, r1, r2)
            if (r1 == 0) goto L5f
            return r0
        L5f:
            java.lang.String r0 = "Unexpected protocol: "
            java.lang.String r3 = r0.concat(r3)
            defpackage.e41.i(r3)
            r3 = 0
            return r3
    }
}
