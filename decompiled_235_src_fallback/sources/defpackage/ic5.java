package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ic5  reason: default package */
/* loaded from: classes.dex */
public enum ic5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ic5[] $VALUES = null;
    public static final defpackage.ic5 ACHIEVEMENT = null;
    public static final defpackage.hc5 Companion = null;
    public static final defpackage.ic5 LEADERBOARD = null;
    private final int wireValue;

    private static final /* synthetic */ defpackage.ic5[] $values() {
            ic5 r0 = defpackage.ic5.ACHIEVEMENT
            ic5 r1 = defpackage.ic5.LEADERBOARD
            ic5[] r0 = new defpackage.ic5[]{r0, r1}
            return r0
    }

    static {
            ic5 r0 = new ic5
            java.lang.String r1 = "ACHIEVEMENT"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            defpackage.ic5.ACHIEVEMENT = r0
            ic5 r0 = new ic5
            java.lang.String r1 = "LEADERBOARD"
            r2 = 2
            r0.<init>(r1, r3, r2)
            defpackage.ic5.LEADERBOARD = r0
            ic5[] r0 = $values()
            defpackage.ic5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ic5.$ENTRIES = r0
            hc5 r0 = new hc5
            r0.<init>()
            defpackage.ic5.Companion = r0
            return
    }

    ic5(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.wireValue = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ic5.$ENTRIES
            return r0
    }

    public static defpackage.ic5 valueOf(java.lang.String r1) {
            java.lang.Class<ic5> r0 = defpackage.ic5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ic5 r1 = (defpackage.ic5) r1
            return r1
    }

    public static defpackage.ic5[] values() {
            ic5[] r0 = defpackage.ic5.$VALUES
            java.lang.Object r0 = r0.clone()
            ic5[] r0 = (defpackage.ic5[]) r0
            return r0
    }

    public final int getWireValue() {
            r0 = this;
            int r0 = r0.wireValue
            return r0
    }
}
