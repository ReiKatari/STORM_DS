package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l67  reason: default package */
/* loaded from: classes.dex */
public enum l67 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.l67[] $VALUES = null;
    public static final defpackage.k67 Companion = null;
    public static final defpackage.l67 SSL_3_0 = null;
    public static final defpackage.l67 TLS_1_0 = null;
    public static final defpackage.l67 TLS_1_1 = null;
    public static final defpackage.l67 TLS_1_2 = null;
    public static final defpackage.l67 TLS_1_3 = null;
    private final java.lang.String javaName;

    private static final /* synthetic */ defpackage.l67[] $values() {
            l67 r0 = defpackage.l67.TLS_1_3
            l67 r1 = defpackage.l67.TLS_1_2
            l67 r2 = defpackage.l67.TLS_1_1
            l67 r3 = defpackage.l67.TLS_1_0
            l67 r4 = defpackage.l67.SSL_3_0
            l67[] r0 = new defpackage.l67[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            l67 r0 = new l67
            r1 = 0
            java.lang.String r2 = "TLSv1.3"
            java.lang.String r3 = "TLS_1_3"
            r0.<init>(r3, r1, r2)
            defpackage.l67.TLS_1_3 = r0
            l67 r0 = new l67
            r1 = 1
            java.lang.String r2 = "TLSv1.2"
            java.lang.String r3 = "TLS_1_2"
            r0.<init>(r3, r1, r2)
            defpackage.l67.TLS_1_2 = r0
            l67 r0 = new l67
            r1 = 2
            java.lang.String r2 = "TLSv1.1"
            java.lang.String r3 = "TLS_1_1"
            r0.<init>(r3, r1, r2)
            defpackage.l67.TLS_1_1 = r0
            l67 r0 = new l67
            r1 = 3
            java.lang.String r2 = "TLSv1"
            java.lang.String r3 = "TLS_1_0"
            r0.<init>(r3, r1, r2)
            defpackage.l67.TLS_1_0 = r0
            l67 r0 = new l67
            r1 = 4
            java.lang.String r2 = "SSLv3"
            java.lang.String r3 = "SSL_3_0"
            r0.<init>(r3, r1, r2)
            defpackage.l67.SSL_3_0 = r0
            l67[] r0 = $values()
            defpackage.l67.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.l67.$ENTRIES = r0
            k67 r0 = new k67
            r0.<init>()
            defpackage.l67.Companion = r0
            return
    }

    l67(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.javaName = r3
            return
    }

    public static final defpackage.l67 forJavaName(java.lang.String r1) {
            k67 r0 = defpackage.l67.Companion
            r0.getClass()
            l67 r1 = defpackage.k67.a(r1)
            return r1
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.l67.$ENTRIES
            return r0
    }

    public static defpackage.l67 valueOf(java.lang.String r1) {
            java.lang.Class<l67> r0 = defpackage.l67.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            l67 r1 = (defpackage.l67) r1
            return r1
    }

    public static defpackage.l67[] values() {
            l67[] r0 = defpackage.l67.$VALUES
            java.lang.Object r0 = r0.clone()
            l67[] r0 = (defpackage.l67[]) r0
            return r0
    }

    @defpackage.di1
    /* renamed from: -deprecated_javaName  reason: not valid java name */
    public final java.lang.String m4deprecated_javaName() {
            r0 = this;
            java.lang.String r0 = r0.javaName
            return r0
    }

    public final java.lang.String javaName() {
            r0 = this;
            java.lang.String r0 = r0.javaName
            return r0
    }
}
