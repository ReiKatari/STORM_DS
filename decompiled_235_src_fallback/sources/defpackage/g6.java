package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g6  reason: default package */
/* loaded from: classes.dex */
public enum g6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.g6[] $VALUES = null;
    public static final defpackage.g6 ActiveChallenges = null;
    public static final defpackage.g6 All = null;
    public static final defpackage.g6 AlmostThere = null;
    public static final defpackage.e6 Companion = null;
    public static final defpackage.g6 Locked = null;
    public static final defpackage.g6 PendingSubmissions = null;
    public static final defpackage.g6 RecentlyUnlocked = null;
    public static final defpackage.g6 Unlocked = null;
    public static final defpackage.g6 Unofficial = null;
    public static final defpackage.g6 Unsupported = null;
    public static final defpackage.g6 Unsynced = null;
    private final defpackage.g3 bucket;
    private final int displayOrder;

    private static final /* synthetic */ defpackage.g6[] $values() {
            g6 r0 = defpackage.g6.All
            g6 r1 = defpackage.g6.Unlocked
            g6 r2 = defpackage.g6.Locked
            g6 r3 = defpackage.g6.ActiveChallenges
            g6 r4 = defpackage.g6.RecentlyUnlocked
            g6 r5 = defpackage.g6.PendingSubmissions
            g6 r6 = defpackage.g6.Unsynced
            g6 r7 = defpackage.g6.AlmostThere
            g6 r8 = defpackage.g6.Unsupported
            g6 r9 = defpackage.g6.Unofficial
            g6[] r0 = new defpackage.g6[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            return r0
    }

    static {
            g6 r0 = new g6
            r1 = 0
            r2 = 0
            java.lang.String r3 = "All"
            r0.<init>(r3, r1, r1, r2)
            defpackage.g6.All = r0
            g6 r0 = new g6
            r1 = 1
            g3 r2 = defpackage.g3.Unlocked
            java.lang.String r3 = "Unlocked"
            r0.<init>(r3, r1, r1, r2)
            defpackage.g6.Unlocked = r0
            g6 r0 = new g6
            r1 = 2
            g3 r2 = defpackage.g3.Locked
            java.lang.String r3 = "Locked"
            r0.<init>(r3, r1, r1, r2)
            defpackage.g6.Locked = r0
            g6 r0 = new g6
            r1 = 3
            g3 r2 = defpackage.g3.ActiveChallenges
            java.lang.String r3 = "ActiveChallenges"
            r0.<init>(r3, r1, r1, r2)
            defpackage.g6.ActiveChallenges = r0
            g6 r0 = new g6
            r1 = 4
            g3 r2 = defpackage.g3.RecentlyUnlocked
            java.lang.String r3 = "RecentlyUnlocked"
            r0.<init>(r3, r1, r1, r2)
            defpackage.g6.RecentlyUnlocked = r0
            g6 r0 = new g6
            r1 = 5
            g3 r2 = defpackage.g3.PendingSubmissions
            java.lang.String r3 = "PendingSubmissions"
            r0.<init>(r3, r1, r1, r2)
            defpackage.g6.PendingSubmissions = r0
            g6 r0 = new g6
            r1 = 6
            g3 r2 = defpackage.g3.Unsynced
            java.lang.String r3 = "Unsynced"
            r0.<init>(r3, r1, r1, r2)
            defpackage.g6.Unsynced = r0
            g6 r0 = new g6
            r1 = 7
            g3 r2 = defpackage.g3.AlmostThere
            java.lang.String r3 = "AlmostThere"
            r0.<init>(r3, r1, r1, r2)
            defpackage.g6.AlmostThere = r0
            g6 r0 = new g6
            r1 = 8
            g3 r2 = defpackage.g3.Unsupported
            java.lang.String r3 = "Unsupported"
            r0.<init>(r3, r1, r1, r2)
            defpackage.g6.Unsupported = r0
            g6 r0 = new g6
            r1 = 9
            g3 r2 = defpackage.g3.Unofficial
            java.lang.String r3 = "Unofficial"
            r0.<init>(r3, r1, r1, r2)
            defpackage.g6.Unofficial = r0
            g6[] r0 = $values()
            defpackage.g6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.g6.$ENTRIES = r0
            e6 r0 = new e6
            r0.<init>()
            defpackage.g6.Companion = r0
            return
    }

    g6(java.lang.String r1, int r2, int r3, defpackage.g3 r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.displayOrder = r3
            r0.bucket = r4
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.g6.$ENTRIES
            return r0
    }

    public static defpackage.g6 valueOf(java.lang.String r1) {
            java.lang.Class<g6> r0 = defpackage.g6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            g6 r1 = (defpackage.g6) r1
            return r1
    }

    public static defpackage.g6[] values() {
            g6[] r0 = defpackage.g6.$VALUES
            java.lang.Object r0 = r0.clone()
            g6[] r0 = (defpackage.g6[]) r0
            return r0
    }

    public final defpackage.g3 getBucket() {
            r0 = this;
            g3 r0 = r0.bucket
            return r0
    }

    public final int getDisplayOrder() {
            r0 = this;
            int r0 = r0.displayOrder
            return r0
    }

    public final boolean matches(defpackage.g3 r5) {
            r4 = this;
            r5.getClass()
            int[] r0 = defpackage.f6.a
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L3b
            r2 = 2
            r3 = 0
            if (r0 == r2) goto L2d
            r2 = 3
            if (r0 == r2) goto L1e
            g3 r4 = r4.bucket
            if (r4 == 0) goto L1d
            if (r4 != r5) goto L1c
            goto L1d
        L1c:
            return r3
        L1d:
            return r1
        L1e:
            g3 r4 = defpackage.g3.Locked
            if (r5 == r4) goto L2c
            g3 r4 = defpackage.g3.AlmostThere
            if (r5 == r4) goto L2c
            g3 r4 = defpackage.g3.ActiveChallenges
            if (r5 != r4) goto L2b
            goto L2c
        L2b:
            return r3
        L2c:
            return r1
        L2d:
            g3 r4 = defpackage.g3.Unlocked
            if (r5 == r4) goto L3b
            g3 r4 = defpackage.g3.RecentlyUnlocked
            if (r5 == r4) goto L3b
            g3 r4 = defpackage.g3.PendingSubmissions
            if (r5 != r4) goto L3a
            goto L3b
        L3a:
            return r3
        L3b:
            return r1
    }
}
