package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vv5  reason: default package */
/* loaded from: classes.dex */
public enum vv5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.vv5[] $VALUES = null;
    public static final defpackage.vv5 CHEATS = null;
    public static final defpackage.vv5 CONFIG = null;
    public static final defpackage.vv5 OFFLINE_ACHIEVEMENTS = null;
    public static final defpackage.vv5 RETRO_ACHIEVEMENTS = null;
    private final int tabIndex;

    private static final /* synthetic */ defpackage.vv5[] $values() {
            vv5 r0 = defpackage.vv5.CONFIG
            vv5 r1 = defpackage.vv5.CHEATS
            vv5 r2 = defpackage.vv5.RETRO_ACHIEVEMENTS
            vv5 r3 = defpackage.vv5.OFFLINE_ACHIEVEMENTS
            vv5[] r0 = new defpackage.vv5[]{r0, r1, r2, r3}
            return r0
    }

    static {
            vv5 r0 = new vv5
            java.lang.String r1 = "CONFIG"
            r2 = 0
            r0.<init>(r1, r2, r2)
            defpackage.vv5.CONFIG = r0
            vv5 r0 = new vv5
            java.lang.String r1 = "CHEATS"
            r2 = 1
            r0.<init>(r1, r2, r2)
            defpackage.vv5.CHEATS = r0
            vv5 r0 = new vv5
            java.lang.String r1 = "RETRO_ACHIEVEMENTS"
            r2 = 2
            r0.<init>(r1, r2, r2)
            defpackage.vv5.RETRO_ACHIEVEMENTS = r0
            vv5 r0 = new vv5
            java.lang.String r1 = "OFFLINE_ACHIEVEMENTS"
            r2 = 3
            r0.<init>(r1, r2, r2)
            defpackage.vv5.OFFLINE_ACHIEVEMENTS = r0
            vv5[] r0 = $values()
            defpackage.vv5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.vv5.$ENTRIES = r0
            return
    }

    vv5(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.tabIndex = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.vv5.$ENTRIES
            return r0
    }

    public static defpackage.vv5 valueOf(java.lang.String r1) {
            java.lang.Class<vv5> r0 = defpackage.vv5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            vv5 r1 = (defpackage.vv5) r1
            return r1
    }

    public static defpackage.vv5[] values() {
            vv5[] r0 = defpackage.vv5.$VALUES
            java.lang.Object r0 = r0.clone()
            vv5[] r0 = (defpackage.vv5[]) r0
            return r0
    }

    public final int getTabIndex() {
            r0 = this;
            int r0 = r0.tabIndex
            return r0
    }
}
