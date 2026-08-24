package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gn6  reason: default package */
/* loaded from: classes.dex */
public enum gn6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.gn6[] $VALUES = null;
    public static final defpackage.gn6 ALPHABETICALLY = null;
    public static final defpackage.gn6 MOST_PLAYED = null;
    public static final defpackage.gn6 RECENTLY_PLAYED = null;
    private final defpackage.hn6 defaultOrder;

    private static final /* synthetic */ defpackage.gn6[] $values() {
            gn6 r0 = defpackage.gn6.ALPHABETICALLY
            gn6 r1 = defpackage.gn6.RECENTLY_PLAYED
            gn6 r2 = defpackage.gn6.MOST_PLAYED
            gn6[] r0 = new defpackage.gn6[]{r0, r1, r2}
            return r0
    }

    static {
            gn6 r0 = new gn6
            r1 = 0
            hn6 r2 = defpackage.hn6.ASCENDING
            java.lang.String r3 = "ALPHABETICALLY"
            r0.<init>(r3, r1, r2)
            defpackage.gn6.ALPHABETICALLY = r0
            gn6 r0 = new gn6
            hn6 r1 = defpackage.hn6.DESCENDING
            java.lang.String r2 = "RECENTLY_PLAYED"
            r3 = 1
            r0.<init>(r2, r3, r1)
            defpackage.gn6.RECENTLY_PLAYED = r0
            gn6 r0 = new gn6
            java.lang.String r2 = "MOST_PLAYED"
            r3 = 2
            r0.<init>(r2, r3, r1)
            defpackage.gn6.MOST_PLAYED = r0
            gn6[] r0 = $values()
            defpackage.gn6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.gn6.$ENTRIES = r0
            return
    }

    gn6(java.lang.String r1, int r2, defpackage.hn6 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.defaultOrder = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.gn6.$ENTRIES
            return r0
    }

    public static defpackage.gn6 valueOf(java.lang.String r1) {
            java.lang.Class<gn6> r0 = defpackage.gn6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            gn6 r1 = (defpackage.gn6) r1
            return r1
    }

    public static defpackage.gn6[] values() {
            gn6[] r0 = defpackage.gn6.$VALUES
            java.lang.Object r0 = r0.clone()
            gn6[] r0 = (defpackage.gn6[]) r0
            return r0
    }

    public final defpackage.hn6 getDefaultOrder() {
            r0 = this;
            hn6 r0 = r0.defaultOrder
            return r0
    }
}
