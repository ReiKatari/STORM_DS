package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hv2  reason: default package */
/* loaded from: classes.dex */
public enum hv2 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.hv2[] $VALUES = null;
    public static final defpackage.hv2 Cursor = null;
    public static final defpackage.hv2 None = null;
    public static final defpackage.hv2 Selection = null;

    private static final /* synthetic */ defpackage.hv2[] $values() {
            hv2 r0 = defpackage.hv2.None
            hv2 r1 = defpackage.hv2.Selection
            hv2 r2 = defpackage.hv2.Cursor
            hv2[] r0 = new defpackage.hv2[]{r0, r1, r2}
            return r0
    }

    static {
            hv2 r0 = new hv2
            java.lang.String r1 = "None"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.hv2.None = r0
            hv2 r0 = new hv2
            java.lang.String r1 = "Selection"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.hv2.Selection = r0
            hv2 r0 = new hv2
            java.lang.String r1 = "Cursor"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.hv2.Cursor = r0
            hv2[] r0 = $values()
            defpackage.hv2.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.hv2.$ENTRIES = r0
            return
    }

    hv2(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.hv2.$ENTRIES
            return r0
    }

    public static defpackage.hv2 valueOf(java.lang.String r1) {
            java.lang.Class<hv2> r0 = defpackage.hv2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            hv2 r1 = (defpackage.hv2) r1
            return r1
    }

    public static defpackage.hv2[] values() {
            hv2[] r0 = defpackage.hv2.$VALUES
            java.lang.Object r0 = r0.clone()
            hv2[] r0 = (defpackage.hv2[]) r0
            return r0
    }
}
