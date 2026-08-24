package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hn6  reason: default package */
/* loaded from: classes.dex */
public enum hn6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.hn6[] $VALUES = null;
    public static final defpackage.hn6 ASCENDING = null;
    public static final defpackage.hn6 DESCENDING = null;

    private static final /* synthetic */ defpackage.hn6[] $values() {
            hn6 r0 = defpackage.hn6.ASCENDING
            hn6 r1 = defpackage.hn6.DESCENDING
            hn6[] r0 = new defpackage.hn6[]{r0, r1}
            return r0
    }

    static {
            hn6 r0 = new hn6
            java.lang.String r1 = "ASCENDING"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.hn6.ASCENDING = r0
            hn6 r0 = new hn6
            java.lang.String r1 = "DESCENDING"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.hn6.DESCENDING = r0
            hn6[] r0 = $values()
            defpackage.hn6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.hn6.$ENTRIES = r0
            return
    }

    hn6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.hn6.$ENTRIES
            return r0
    }

    public static defpackage.hn6 valueOf(java.lang.String r1) {
            java.lang.Class<hn6> r0 = defpackage.hn6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            hn6 r1 = (defpackage.hn6) r1
            return r1
    }

    public static defpackage.hn6[] values() {
            hn6[] r0 = defpackage.hn6.$VALUES
            java.lang.Object r0 = r0.clone()
            hn6[] r0 = (defpackage.hn6[]) r0
            return r0
    }
}
