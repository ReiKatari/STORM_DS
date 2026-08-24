package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cg2  reason: default package */
/* loaded from: classes.dex */
public enum cg2 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.cg2[] $VALUES = null;
    public static final defpackage.cg2 Clip = null;
    public static final defpackage.cg2 ExpandIndicator = null;
    public static final defpackage.cg2 ExpandOrCollapseIndicator = null;
    public static final defpackage.cg2 Visible = null;

    private static final /* synthetic */ defpackage.cg2[] $values() {
            cg2 r0 = defpackage.cg2.Visible
            cg2 r1 = defpackage.cg2.Clip
            cg2 r2 = defpackage.cg2.ExpandIndicator
            cg2 r3 = defpackage.cg2.ExpandOrCollapseIndicator
            cg2[] r0 = new defpackage.cg2[]{r0, r1, r2, r3}
            return r0
    }

    static {
            cg2 r0 = new cg2
            java.lang.String r1 = "Visible"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.cg2.Visible = r0
            cg2 r0 = new cg2
            java.lang.String r1 = "Clip"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.cg2.Clip = r0
            cg2 r0 = new cg2
            java.lang.String r1 = "ExpandIndicator"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.cg2.ExpandIndicator = r0
            cg2 r0 = new cg2
            java.lang.String r1 = "ExpandOrCollapseIndicator"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.cg2.ExpandOrCollapseIndicator = r0
            cg2[] r0 = $values()
            defpackage.cg2.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.cg2.$ENTRIES = r0
            return
    }

    cg2(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.cg2.$ENTRIES
            return r0
    }

    public static defpackage.cg2 valueOf(java.lang.String r1) {
            java.lang.Class<cg2> r0 = defpackage.cg2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            cg2 r1 = (defpackage.cg2) r1
            return r1
    }

    public static defpackage.cg2[] values() {
            cg2[] r0 = defpackage.cg2.$VALUES
            java.lang.Object r0 = r0.clone()
            cg2[] r0 = (defpackage.cg2[]) r0
            return r0
    }
}
