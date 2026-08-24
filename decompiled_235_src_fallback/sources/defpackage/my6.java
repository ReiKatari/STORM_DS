package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: my6  reason: default package */
/* loaded from: classes.dex */
public enum my6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.my6[] $VALUES = null;
    public static final defpackage.my6 Divider = null;
    public static final defpackage.my6 Indicator = null;
    public static final defpackage.my6 Tabs = null;

    private static final /* synthetic */ defpackage.my6[] $values() {
            my6 r0 = defpackage.my6.Tabs
            my6 r1 = defpackage.my6.Divider
            my6 r2 = defpackage.my6.Indicator
            my6[] r0 = new defpackage.my6[]{r0, r1, r2}
            return r0
    }

    static {
            my6 r0 = new my6
            java.lang.String r1 = "Tabs"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.my6.Tabs = r0
            my6 r0 = new my6
            java.lang.String r1 = "Divider"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.my6.Divider = r0
            my6 r0 = new my6
            java.lang.String r1 = "Indicator"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.my6.Indicator = r0
            my6[] r0 = $values()
            defpackage.my6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.my6.$ENTRIES = r0
            return
    }

    my6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.my6.$ENTRIES
            return r0
    }

    public static defpackage.my6 valueOf(java.lang.String r1) {
            java.lang.Class<my6> r0 = defpackage.my6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            my6 r1 = (defpackage.my6) r1
            return r1
    }

    public static defpackage.my6[] values() {
            my6[] r0 = defpackage.my6.$VALUES
            java.lang.Object r0 = r0.clone()
            my6[] r0 = (defpackage.my6[]) r0
            return r0
    }
}
