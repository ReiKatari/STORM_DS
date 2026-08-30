package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e3  reason: default package */
/* loaded from: classes.dex */
public final class e3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ e3[] $VALUES;
    private final int displayOrder;
    public static final e3 PendingSubmissions = new e3("PendingSubmissions", 0, 0);
    public static final e3 ActiveChallenges = new e3("ActiveChallenges", 1, 1);
    public static final e3 RecentlyUnlocked = new e3("RecentlyUnlocked", 2, 2);
    public static final e3 Unsynced = new e3("Unsynced", 3, 3);
    public static final e3 AlmostThere = new e3("AlmostThere", 4, 4);
    public static final e3 Locked = new e3("Locked", 5, 5);
    public static final e3 Unsupported = new e3("Unsupported", 6, 6);
    public static final e3 Unofficial = new e3("Unofficial", 7, 7);
    public static final e3 Unlocked = new e3("Unlocked", 8, 8);

    private static final /* synthetic */ e3[] $values() {
        return new e3[]{PendingSubmissions, ActiveChallenges, RecentlyUnlocked, Unsynced, AlmostThere, Locked, Unsupported, Unofficial, Unlocked};
    }

    static {
        e3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private e3(String str, int i, int i2) {
        this.displayOrder = i2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static e3 valueOf(String str) {
        return (e3) Enum.valueOf(e3.class, str);
    }

    public static e3[] values() {
        return (e3[]) $VALUES.clone();
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }
}
