package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k55  reason: default package */
/* loaded from: classes.dex */
public enum k55 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.k55[] $VALUES = null;
    public static final defpackage.j55 Companion = null;
    public static final defpackage.k55 H2_PRIOR_KNOWLEDGE = null;
    public static final defpackage.k55 HTTP_1_0 = null;
    public static final defpackage.k55 HTTP_1_1 = null;
    public static final defpackage.k55 HTTP_2 = null;
    public static final defpackage.k55 HTTP_3 = null;
    public static final defpackage.k55 QUIC = null;
    @defpackage.di1
    public static final defpackage.k55 SPDY_3 = null;
    private final java.lang.String protocol;

    private static final /* synthetic */ defpackage.k55[] $values() {
            k55 r0 = defpackage.k55.HTTP_1_0
            k55 r1 = defpackage.k55.HTTP_1_1
            k55 r2 = defpackage.k55.SPDY_3
            k55 r3 = defpackage.k55.HTTP_2
            k55 r4 = defpackage.k55.H2_PRIOR_KNOWLEDGE
            k55 r5 = defpackage.k55.QUIC
            k55 r6 = defpackage.k55.HTTP_3
            k55[] r0 = new defpackage.k55[]{r0, r1, r2, r3, r4, r5, r6}
            return r0
    }

    static {
            k55 r0 = new k55
            r1 = 0
            java.lang.String r2 = "http/1.0"
            java.lang.String r3 = "HTTP_1_0"
            r0.<init>(r3, r1, r2)
            defpackage.k55.HTTP_1_0 = r0
            k55 r0 = new k55
            r1 = 1
            java.lang.String r2 = "http/1.1"
            java.lang.String r3 = "HTTP_1_1"
            r0.<init>(r3, r1, r2)
            defpackage.k55.HTTP_1_1 = r0
            k55 r0 = new k55
            r1 = 2
            java.lang.String r2 = "spdy/3.1"
            java.lang.String r3 = "SPDY_3"
            r0.<init>(r3, r1, r2)
            defpackage.k55.SPDY_3 = r0
            k55 r0 = new k55
            r1 = 3
            java.lang.String r2 = "h2"
            java.lang.String r3 = "HTTP_2"
            r0.<init>(r3, r1, r2)
            defpackage.k55.HTTP_2 = r0
            k55 r0 = new k55
            r1 = 4
            java.lang.String r2 = "h2_prior_knowledge"
            java.lang.String r3 = "H2_PRIOR_KNOWLEDGE"
            r0.<init>(r3, r1, r2)
            defpackage.k55.H2_PRIOR_KNOWLEDGE = r0
            k55 r0 = new k55
            r1 = 5
            java.lang.String r2 = "quic"
            java.lang.String r3 = "QUIC"
            r0.<init>(r3, r1, r2)
            defpackage.k55.QUIC = r0
            k55 r0 = new k55
            r1 = 6
            java.lang.String r2 = "h3"
            java.lang.String r3 = "HTTP_3"
            r0.<init>(r3, r1, r2)
            defpackage.k55.HTTP_3 = r0
            k55[] r0 = $values()
            defpackage.k55.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.k55.$ENTRIES = r0
            j55 r0 = new j55
            r0.<init>()
            defpackage.k55.Companion = r0
            return
    }

    k55(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.protocol = r3
            return
    }

    public static final /* synthetic */ java.lang.String access$getProtocol$p(defpackage.k55 r0) {
            java.lang.String r0 = r0.protocol
            return r0
    }

    public static final defpackage.k55 get(java.lang.String r1) {
            j55 r0 = defpackage.k55.Companion
            r0.getClass()
            k55 r1 = defpackage.j55.a(r1)
            return r1
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.k55.$ENTRIES
            return r0
    }

    public static defpackage.k55 valueOf(java.lang.String r1) {
            java.lang.Class<k55> r0 = defpackage.k55.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            k55 r1 = (defpackage.k55) r1
            return r1
    }

    public static defpackage.k55[] values() {
            k55[] r0 = defpackage.k55.$VALUES
            java.lang.Object r0 = r0.clone()
            k55[] r0 = (defpackage.k55[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.protocol
            return r0
    }
}
