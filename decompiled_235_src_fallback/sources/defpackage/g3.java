package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g3  reason: default package */
/* loaded from: classes.dex */
public enum g3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.g3[] $VALUES = null;
    public static final defpackage.g3 ActiveChallenges = null;
    public static final defpackage.g3 AlmostThere = null;
    public static final defpackage.g3 Locked = null;
    public static final defpackage.g3 PendingSubmissions = null;
    public static final defpackage.g3 RecentlyUnlocked = null;
    public static final defpackage.g3 Unlocked = null;
    public static final defpackage.g3 Unofficial = null;
    public static final defpackage.g3 Unsupported = null;
    public static final defpackage.g3 Unsynced = null;
    private final int displayOrder;

    private static final /* synthetic */ defpackage.g3[] $values() {
            g3 r0 = defpackage.g3.PendingSubmissions
            g3 r1 = defpackage.g3.ActiveChallenges
            g3 r2 = defpackage.g3.RecentlyUnlocked
            g3 r3 = defpackage.g3.Unsynced
            g3 r4 = defpackage.g3.AlmostThere
            g3 r5 = defpackage.g3.Locked
            g3 r6 = defpackage.g3.Unsupported
            g3 r7 = defpackage.g3.Unofficial
            g3 r8 = defpackage.g3.Unlocked
            g3[] r0 = new defpackage.g3[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            return r0
    }

    static {
            g3 r0 = new g3
            java.lang.String r1 = "PendingSubmissions"
            r2 = 0
            r0.<init>(r1, r2, r2)
            defpackage.g3.PendingSubmissions = r0
            g3 r0 = new g3
            java.lang.String r1 = "ActiveChallenges"
            r2 = 1
            r0.<init>(r1, r2, r2)
            defpackage.g3.ActiveChallenges = r0
            g3 r0 = new g3
            java.lang.String r1 = "RecentlyUnlocked"
            r2 = 2
            r0.<init>(r1, r2, r2)
            defpackage.g3.RecentlyUnlocked = r0
            g3 r0 = new g3
            java.lang.String r1 = "Unsynced"
            r2 = 3
            r0.<init>(r1, r2, r2)
            defpackage.g3.Unsynced = r0
            g3 r0 = new g3
            java.lang.String r1 = "AlmostThere"
            r2 = 4
            r0.<init>(r1, r2, r2)
            defpackage.g3.AlmostThere = r0
            g3 r0 = new g3
            java.lang.String r1 = "Locked"
            r2 = 5
            r0.<init>(r1, r2, r2)
            defpackage.g3.Locked = r0
            g3 r0 = new g3
            java.lang.String r1 = "Unsupported"
            r2 = 6
            r0.<init>(r1, r2, r2)
            defpackage.g3.Unsupported = r0
            g3 r0 = new g3
            java.lang.String r1 = "Unofficial"
            r2 = 7
            r0.<init>(r1, r2, r2)
            defpackage.g3.Unofficial = r0
            g3 r0 = new g3
            java.lang.String r1 = "Unlocked"
            r2 = 8
            r0.<init>(r1, r2, r2)
            defpackage.g3.Unlocked = r0
            g3[] r0 = $values()
            defpackage.g3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.g3.$ENTRIES = r0
            return
    }

    g3(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.displayOrder = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.g3.$ENTRIES
            return r0
    }

    public static defpackage.g3 valueOf(java.lang.String r1) {
            java.lang.Class<g3> r0 = defpackage.g3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            g3 r1 = (defpackage.g3) r1
            return r1
    }

    public static defpackage.g3[] values() {
            g3[] r0 = defpackage.g3.$VALUES
            java.lang.Object r0 = r0.clone()
            g3[] r0 = (defpackage.g3[]) r0
            return r0
    }

    public final int getDisplayOrder() {
            r0 = this;
            int r0 = r0.displayOrder
            return r0
    }
}
