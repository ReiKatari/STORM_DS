package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qw5  reason: default package */
/* loaded from: classes.dex */
public enum qw5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.qw5[] $VALUES = null;
    public static final defpackage.qw5 ALL = null;
    public static final defpackage.qw5 DSIWARE_ONLY = null;
    public static final defpackage.qw5 DS_ONLY = null;
    public static final defpackage.qw5 FAVORITES = null;
    public static final defpackage.qw5 WITH_RETRO_ACHIEVEMENTS = null;

    private static final /* synthetic */ defpackage.qw5[] $values() {
            qw5 r0 = defpackage.qw5.ALL
            qw5 r1 = defpackage.qw5.FAVORITES
            qw5 r2 = defpackage.qw5.DS_ONLY
            qw5 r3 = defpackage.qw5.DSIWARE_ONLY
            qw5 r4 = defpackage.qw5.WITH_RETRO_ACHIEVEMENTS
            qw5[] r0 = new defpackage.qw5[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            qw5 r0 = new qw5
            java.lang.String r1 = "ALL"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.qw5.ALL = r0
            qw5 r0 = new qw5
            java.lang.String r1 = "FAVORITES"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.qw5.FAVORITES = r0
            qw5 r0 = new qw5
            java.lang.String r1 = "DS_ONLY"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.qw5.DS_ONLY = r0
            qw5 r0 = new qw5
            java.lang.String r1 = "DSIWARE_ONLY"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.qw5.DSIWARE_ONLY = r0
            qw5 r0 = new qw5
            java.lang.String r1 = "WITH_RETRO_ACHIEVEMENTS"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.qw5.WITH_RETRO_ACHIEVEMENTS = r0
            qw5[] r0 = $values()
            defpackage.qw5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.qw5.$ENTRIES = r0
            return
    }

    qw5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.qw5.$ENTRIES
            return r0
    }

    public static defpackage.qw5 valueOf(java.lang.String r1) {
            java.lang.Class<qw5> r0 = defpackage.qw5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            qw5 r1 = (defpackage.qw5) r1
            return r1
    }

    public static defpackage.qw5[] values() {
            qw5[] r0 = defpackage.qw5.$VALUES
            java.lang.Object r0 = r0.clone()
            qw5[] r0 = (defpackage.qw5[]) r0
            return r0
    }
}
