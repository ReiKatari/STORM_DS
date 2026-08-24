package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g3  reason: default package */
/* loaded from: classes.dex */
public final class g3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ g3[] $VALUES;
    private final int displayOrder;
    public static final g3 PendingSubmissions = new g3("PendingSubmissions", 0, 0);
    public static final g3 ActiveChallenges = new g3("ActiveChallenges", 1, 1);
    public static final g3 RecentlyUnlocked = new g3("RecentlyUnlocked", 2, 2);
    public static final g3 Unsynced = new g3("Unsynced", 3, 3);
    public static final g3 AlmostThere = new g3("AlmostThere", 4, 4);
    public static final g3 Locked = new g3("Locked", 5, 5);
    public static final g3 Unsupported = new g3("Unsupported", 6, 6);
    public static final g3 Unofficial = new g3("Unofficial", 7, 7);
    public static final g3 Unlocked = new g3("Unlocked", 8, 8);

    private static final /* synthetic */ g3[] $values() {
        return new g3[]{PendingSubmissions, ActiveChallenges, RecentlyUnlocked, Unsynced, AlmostThere, Locked, Unsupported, Unofficial, Unlocked};
    }

    static {
        g3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private g3(String str, int i, int i2) {
        this.displayOrder = i2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static g3 valueOf(String str) {
        return (g3) Enum.valueOf(g3.class, str);
    }

    public static g3[] values() {
        return (g3[]) $VALUES.clone();
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }
}
