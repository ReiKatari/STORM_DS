package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jq1  reason: default package */
/* loaded from: classes.dex */
public enum jq1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.jq1[] $VALUES = null;
    public static final defpackage.jq1 INTERNAL_BOTTOM_EXTERNAL_TOP = null;
    public static final defpackage.jq1 INTERNAL_TOP_EXTERNAL_BOTTOM = null;
    public static final defpackage.jq1 OFF = null;

    private static final /* synthetic */ defpackage.jq1[] $values() {
            jq1 r0 = defpackage.jq1.OFF
            jq1 r1 = defpackage.jq1.INTERNAL_TOP_EXTERNAL_BOTTOM
            jq1 r2 = defpackage.jq1.INTERNAL_BOTTOM_EXTERNAL_TOP
            jq1[] r0 = new defpackage.jq1[]{r0, r1, r2}
            return r0
    }

    static {
            jq1 r0 = new jq1
            java.lang.String r1 = "OFF"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.jq1.OFF = r0
            jq1 r0 = new jq1
            java.lang.String r1 = "INTERNAL_TOP_EXTERNAL_BOTTOM"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.jq1.INTERNAL_TOP_EXTERNAL_BOTTOM = r0
            jq1 r0 = new jq1
            java.lang.String r1 = "INTERNAL_BOTTOM_EXTERNAL_TOP"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.jq1.INTERNAL_BOTTOM_EXTERNAL_TOP = r0
            jq1[] r0 = $values()
            defpackage.jq1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.jq1.$ENTRIES = r0
            return
    }

    jq1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.jq1.$ENTRIES
            return r0
    }

    public static defpackage.jq1 valueOf(java.lang.String r1) {
            java.lang.Class<jq1> r0 = defpackage.jq1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            jq1 r1 = (defpackage.jq1) r1
            return r1
    }

    public static defpackage.jq1[] values() {
            jq1[] r0 = defpackage.jq1.$VALUES
            java.lang.Object r0 = r0.clone()
            jq1[] r0 = (defpackage.jq1[]) r0
            return r0
    }
}
