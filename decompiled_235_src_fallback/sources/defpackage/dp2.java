package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dp2  reason: default package */
/* loaded from: classes.dex */
public enum dp2 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.dp2[] $VALUES = null;
    public static final defpackage.dp2 DISABLED_BY_SETTING = null;
    public static final defpackage.dp2 DISABLED_GAME_NOT_FOUND = null;
    public static final defpackage.dp2 DISABLED_LOAD_ERROR = null;
    public static final defpackage.dp2 DISABLED_LOGIN_EXPIRED = null;
    public static final defpackage.dp2 DISABLED_NOT_LOGGED_IN = null;
    public static final defpackage.dp2 ENABLED_FULL = null;
    public static final defpackage.dp2 ENABLED_NO_ACHIEVEMENTS = null;

    private static final /* synthetic */ defpackage.dp2[] $values() {
            dp2 r0 = defpackage.dp2.DISABLED_NOT_LOGGED_IN
            dp2 r1 = defpackage.dp2.DISABLED_BY_SETTING
            dp2 r2 = defpackage.dp2.DISABLED_LOGIN_EXPIRED
            dp2 r3 = defpackage.dp2.DISABLED_LOAD_ERROR
            dp2 r4 = defpackage.dp2.DISABLED_GAME_NOT_FOUND
            dp2 r5 = defpackage.dp2.ENABLED_NO_ACHIEVEMENTS
            dp2 r6 = defpackage.dp2.ENABLED_FULL
            dp2[] r0 = new defpackage.dp2[]{r0, r1, r2, r3, r4, r5, r6}
            return r0
    }

    static {
            dp2 r0 = new dp2
            java.lang.String r1 = "DISABLED_NOT_LOGGED_IN"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.dp2.DISABLED_NOT_LOGGED_IN = r0
            dp2 r0 = new dp2
            java.lang.String r1 = "DISABLED_BY_SETTING"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.dp2.DISABLED_BY_SETTING = r0
            dp2 r0 = new dp2
            java.lang.String r1 = "DISABLED_LOGIN_EXPIRED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.dp2.DISABLED_LOGIN_EXPIRED = r0
            dp2 r0 = new dp2
            java.lang.String r1 = "DISABLED_LOAD_ERROR"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.dp2.DISABLED_LOAD_ERROR = r0
            dp2 r0 = new dp2
            java.lang.String r1 = "DISABLED_GAME_NOT_FOUND"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.dp2.DISABLED_GAME_NOT_FOUND = r0
            dp2 r0 = new dp2
            java.lang.String r1 = "ENABLED_NO_ACHIEVEMENTS"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.dp2.ENABLED_NO_ACHIEVEMENTS = r0
            dp2 r0 = new dp2
            java.lang.String r1 = "ENABLED_FULL"
            r2 = 6
            r0.<init>(r1, r2)
            defpackage.dp2.ENABLED_FULL = r0
            dp2[] r0 = $values()
            defpackage.dp2.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.dp2.$ENTRIES = r0
            return
    }

    dp2(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.dp2.$ENTRIES
            return r0
    }

    public static defpackage.dp2 valueOf(java.lang.String r1) {
            java.lang.Class<dp2> r0 = defpackage.dp2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            dp2 r1 = (defpackage.dp2) r1
            return r1
    }

    public static defpackage.dp2[] values() {
            dp2[] r0 = defpackage.dp2.$VALUES
            java.lang.Object r0 = r0.clone()
            dp2[] r0 = (defpackage.dp2[]) r0
            return r0
    }
}
