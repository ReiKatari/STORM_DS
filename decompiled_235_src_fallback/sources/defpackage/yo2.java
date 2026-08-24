package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yo2  reason: default package */
/* loaded from: classes.dex */
public enum yo2 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.yo2[] $VALUES = null;
    public static final defpackage.yo2 DEFAULT = null;
    public static final defpackage.yo2 UNKNOWN = null;
    public static final defpackage.yo2 YUV = null;

    private static /* synthetic */ defpackage.yo2[] $values() {
            yo2 r0 = defpackage.yo2.UNKNOWN
            yo2 r1 = defpackage.yo2.DEFAULT
            yo2 r2 = defpackage.yo2.YUV
            yo2[] r0 = new defpackage.yo2[]{r0, r1, r2}
            return r0
    }

    static {
            yo2 r0 = new yo2
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.yo2.UNKNOWN = r0
            yo2 r0 = new yo2
            java.lang.String r1 = "DEFAULT"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.yo2.DEFAULT = r0
            yo2 r0 = new yo2
            java.lang.String r1 = "YUV"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.yo2.YUV = r0
            yo2[] r0 = $values()
            defpackage.yo2.$VALUES = r0
            return
    }

    yo2(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.yo2 valueOf(java.lang.String r1) {
            java.lang.Class<yo2> r0 = defpackage.yo2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            yo2 r1 = (defpackage.yo2) r1
            return r1
    }

    public static defpackage.yo2[] values() {
            yo2[] r0 = defpackage.yo2.$VALUES
            java.lang.Object r0 = r0.clone()
            yo2[] r0 = (defpackage.yo2[]) r0
            return r0
    }
}
