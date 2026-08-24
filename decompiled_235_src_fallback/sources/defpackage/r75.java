package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r75  reason: default package */
/* loaded from: classes.dex */
public enum r75 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.r75[] $VALUES = null;
    public static final defpackage.r75 Bonus = null;
    public static final defpackage.r75 Challenge = null;
    public static final defpackage.r75 Core = null;
    public static final defpackage.r75 Exclusive = null;
    public static final defpackage.r75 Specialty = null;

    private static final /* synthetic */ defpackage.r75[] $values() {
            r75 r0 = defpackage.r75.Core
            r75 r1 = defpackage.r75.Bonus
            r75 r2 = defpackage.r75.Specialty
            r75 r3 = defpackage.r75.Exclusive
            r75 r4 = defpackage.r75.Challenge
            r75[] r0 = new defpackage.r75[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            r75 r0 = new r75
            java.lang.String r1 = "Core"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.r75.Core = r0
            r75 r0 = new r75
            java.lang.String r1 = "Bonus"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.r75.Bonus = r0
            r75 r0 = new r75
            java.lang.String r1 = "Specialty"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.r75.Specialty = r0
            r75 r0 = new r75
            java.lang.String r1 = "Exclusive"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.r75.Exclusive = r0
            r75 r0 = new r75
            java.lang.String r1 = "Challenge"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.r75.Challenge = r0
            r75[] r0 = $values()
            defpackage.r75.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.r75.$ENTRIES = r0
            return
    }

    r75(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.r75.$ENTRIES
            return r0
    }

    public static defpackage.r75 valueOf(java.lang.String r1) {
            java.lang.Class<r75> r0 = defpackage.r75.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            r75 r1 = (defpackage.r75) r1
            return r1
    }

    public static defpackage.r75[] values() {
            r75[] r0 = defpackage.r75.$VALUES
            java.lang.Object r0 = r0.clone()
            r75[] r0 = (defpackage.r75[]) r0
            return r0
    }
}
