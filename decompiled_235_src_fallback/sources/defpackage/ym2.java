package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ym2  reason: default package */
/* loaded from: classes.dex */
public enum ym2 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ym2[] $VALUES = null;
    public static final defpackage.ym2 ON_CONFIGURE = null;
    public static final defpackage.ym2 ON_CREATE = null;
    public static final defpackage.ym2 ON_DOWNGRADE = null;
    public static final defpackage.ym2 ON_OPEN = null;
    public static final defpackage.ym2 ON_UPGRADE = null;

    private static final /* synthetic */ defpackage.ym2[] $values() {
            ym2 r0 = defpackage.ym2.ON_CONFIGURE
            ym2 r1 = defpackage.ym2.ON_CREATE
            ym2 r2 = defpackage.ym2.ON_UPGRADE
            ym2 r3 = defpackage.ym2.ON_DOWNGRADE
            ym2 r4 = defpackage.ym2.ON_OPEN
            ym2[] r0 = new defpackage.ym2[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            ym2 r0 = new ym2
            java.lang.String r1 = "ON_CONFIGURE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ym2.ON_CONFIGURE = r0
            ym2 r0 = new ym2
            java.lang.String r1 = "ON_CREATE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ym2.ON_CREATE = r0
            ym2 r0 = new ym2
            java.lang.String r1 = "ON_UPGRADE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ym2.ON_UPGRADE = r0
            ym2 r0 = new ym2
            java.lang.String r1 = "ON_DOWNGRADE"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.ym2.ON_DOWNGRADE = r0
            ym2 r0 = new ym2
            java.lang.String r1 = "ON_OPEN"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.ym2.ON_OPEN = r0
            ym2[] r0 = $values()
            defpackage.ym2.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ym2.$ENTRIES = r0
            return
    }

    ym2(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ym2.$ENTRIES
            return r0
    }

    public static defpackage.ym2 valueOf(java.lang.String r1) {
            java.lang.Class<ym2> r0 = defpackage.ym2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ym2 r1 = (defpackage.ym2) r1
            return r1
    }

    public static defpackage.ym2[] values() {
            ym2[] r0 = defpackage.ym2.$VALUES
            java.lang.Object r0 = r0.clone()
            ym2[] r0 = (defpackage.ym2[]) r0
            return r0
    }
}
