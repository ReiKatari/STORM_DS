package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hv6  reason: default package */
/* loaded from: classes.dex */
public enum hv6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.hv6[] $VALUES = null;
    public static final defpackage.hv6 JPEG = null;
    public static final defpackage.hv6 JPEG_R = null;
    public static final defpackage.hv6 PRIV = null;
    public static final defpackage.hv6 RAW = null;
    public static final defpackage.hv6 YUV = null;

    private static final /* synthetic */ defpackage.hv6[] $values() {
            hv6 r0 = defpackage.hv6.PRIV
            hv6 r1 = defpackage.hv6.YUV
            hv6 r2 = defpackage.hv6.JPEG
            hv6 r3 = defpackage.hv6.JPEG_R
            hv6 r4 = defpackage.hv6.RAW
            hv6[] r0 = new defpackage.hv6[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            hv6 r0 = new hv6
            java.lang.String r1 = "PRIV"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.hv6.PRIV = r0
            hv6 r0 = new hv6
            java.lang.String r1 = "YUV"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.hv6.YUV = r0
            hv6 r0 = new hv6
            java.lang.String r1 = "JPEG"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.hv6.JPEG = r0
            hv6 r0 = new hv6
            java.lang.String r1 = "JPEG_R"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.hv6.JPEG_R = r0
            hv6 r0 = new hv6
            java.lang.String r1 = "RAW"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.hv6.RAW = r0
            hv6[] r0 = $values()
            defpackage.hv6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.hv6.$ENTRIES = r0
            return
    }

    hv6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.hv6.$ENTRIES
            return r0
    }

    public static defpackage.hv6 valueOf(java.lang.String r1) {
            java.lang.Class<hv6> r0 = defpackage.hv6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            hv6 r1 = (defpackage.hv6) r1
            return r1
    }

    public static defpackage.hv6[] values() {
            hv6[] r0 = defpackage.hv6.$VALUES
            java.lang.Object r0 = r0.clone()
            hv6[] r0 = (defpackage.hv6[]) r0
            return r0
    }
}
