package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bd5  reason: default package */
/* loaded from: classes.dex */
public enum bd5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.bd5[] $VALUES = null;
    public static final defpackage.bd5 ACHIEVEMENT = null;
    public static final defpackage.bd5 LEADERBOARD = null;

    private static final /* synthetic */ defpackage.bd5[] $values() {
            bd5 r0 = defpackage.bd5.ACHIEVEMENT
            bd5 r1 = defpackage.bd5.LEADERBOARD
            bd5[] r0 = new defpackage.bd5[]{r0, r1}
            return r0
    }

    static {
            bd5 r0 = new bd5
            java.lang.String r1 = "ACHIEVEMENT"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.bd5.ACHIEVEMENT = r0
            bd5 r0 = new bd5
            java.lang.String r1 = "LEADERBOARD"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.bd5.LEADERBOARD = r0
            bd5[] r0 = $values()
            defpackage.bd5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.bd5.$ENTRIES = r0
            return
    }

    bd5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.bd5.$ENTRIES
            return r0
    }

    public static defpackage.bd5 valueOf(java.lang.String r1) {
            java.lang.Class<bd5> r0 = defpackage.bd5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            bd5 r1 = (defpackage.bd5) r1
            return r1
    }

    public static defpackage.bd5[] values() {
            bd5[] r0 = defpackage.bd5.$VALUES
            java.lang.Object r0 = r0.clone()
            bd5[] r0 = (defpackage.bd5[]) r0
            return r0
    }
}
