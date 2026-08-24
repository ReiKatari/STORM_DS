package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g6  reason: default package */
/* loaded from: classes.dex */
public final class g6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ g6[] $VALUES;
    public static final e6 Companion;
    private final g3 bucket;
    private final int displayOrder;
    public static final g6 All = new g6("All", 0, 0, null);
    public static final g6 Unlocked = new g6("Unlocked", 1, 1, g3.Unlocked);
    public static final g6 Locked = new g6("Locked", 2, 2, g3.Locked);
    public static final g6 ActiveChallenges = new g6("ActiveChallenges", 3, 3, g3.ActiveChallenges);
    public static final g6 RecentlyUnlocked = new g6("RecentlyUnlocked", 4, 4, g3.RecentlyUnlocked);
    public static final g6 PendingSubmissions = new g6("PendingSubmissions", 5, 5, g3.PendingSubmissions);
    public static final g6 Unsynced = new g6("Unsynced", 6, 6, g3.Unsynced);
    public static final g6 AlmostThere = new g6("AlmostThere", 7, 7, g3.AlmostThere);
    public static final g6 Unsupported = new g6("Unsupported", 8, 8, g3.Unsupported);
    public static final g6 Unofficial = new g6("Unofficial", 9, 9, g3.Unofficial);

    private static final /* synthetic */ g6[] $values() {
        return new g6[]{All, Unlocked, Locked, ActiveChallenges, RecentlyUnlocked, PendingSubmissions, Unsynced, AlmostThere, Unsupported, Unofficial};
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [e6, java.lang.Object] */
    static {
        g6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private g6(String str, int i, int i2, g3 g3Var) {
        this.displayOrder = i2;
        this.bucket = g3Var;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static g6 valueOf(String str) {
        return (g6) Enum.valueOf(g6.class, str);
    }

    public static g6[] values() {
        return (g6[]) $VALUES.clone();
    }

    public final g3 getBucket() {
        return this.bucket;
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final boolean matches(g3 g3Var) {
        g3Var.getClass();
        int i = f6.a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    g3 g3Var2 = this.bucket;
                    if (g3Var2 == null || g3Var2 == g3Var) {
                        return true;
                    }
                    return false;
                } else if (g3Var == g3.Locked || g3Var == g3.AlmostThere || g3Var == g3.ActiveChallenges) {
                    return true;
                } else {
                    return false;
                }
            } else if (g3Var != g3.Unlocked && g3Var != g3.RecentlyUnlocked && g3Var != g3.PendingSubmissions) {
                return false;
            }
        }
        return true;
    }
}
