package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hq1  reason: default package */
/* loaded from: classes.dex */
public enum hq1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.hq1[] $VALUES = null;
    public static final defpackage.hq1 BOTH = null;
    public static final defpackage.hq1 BOTTOM = null;
    public static final defpackage.hq1 TOP = null;

    private static final /* synthetic */ defpackage.hq1[] $values() {
            hq1 r0 = defpackage.hq1.BOTH
            hq1 r1 = defpackage.hq1.TOP
            hq1 r2 = defpackage.hq1.BOTTOM
            hq1[] r0 = new defpackage.hq1[]{r0, r1, r2}
            return r0
    }

    static {
            hq1 r0 = new hq1
            java.lang.String r1 = "BOTH"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.hq1.BOTH = r0
            hq1 r0 = new hq1
            java.lang.String r1 = "TOP"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.hq1.TOP = r0
            hq1 r0 = new hq1
            java.lang.String r1 = "BOTTOM"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.hq1.BOTTOM = r0
            hq1[] r0 = $values()
            defpackage.hq1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.hq1.$ENTRIES = r0
            return
    }

    hq1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.hq1.$ENTRIES
            return r0
    }

    public static defpackage.hq1 valueOf(java.lang.String r1) {
            java.lang.Class<hq1> r0 = defpackage.hq1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            hq1 r1 = (defpackage.hq1) r1
            return r1
    }

    public static defpackage.hq1[] values() {
            hq1[] r0 = defpackage.hq1.$VALUES
            java.lang.Object r0 = r0.clone()
            hq1[] r0 = (defpackage.hq1[]) r0
            return r0
    }
}
