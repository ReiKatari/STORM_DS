package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f6  reason: default package */
/* loaded from: classes.dex */
public final class f6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ f6[] $VALUES;
    public static final e6 Companion;
    private final e3 bucket;
    private final int displayOrder;
    public static final f6 All = new f6("All", 0, 0, null);
    public static final f6 PendingSubmissions = new f6("PendingSubmissions", 1, 1, e3.PendingSubmissions);
    public static final f6 ActiveChallenges = new f6("ActiveChallenges", 2, 2, e3.ActiveChallenges);
    public static final f6 RecentlyUnlocked = new f6("RecentlyUnlocked", 3, 3, e3.RecentlyUnlocked);
    public static final f6 Unsynced = new f6("Unsynced", 4, 4, e3.Unsynced);
    public static final f6 AlmostThere = new f6("AlmostThere", 5, 5, e3.AlmostThere);
    public static final f6 Locked = new f6("Locked", 6, 6, e3.Locked);
    public static final f6 Unsupported = new f6("Unsupported", 7, 7, e3.Unsupported);
    public static final f6 Unofficial = new f6("Unofficial", 8, 8, e3.Unofficial);
    public static final f6 Unlocked = new f6("Unlocked", 9, 9, e3.Unlocked);

    private static final /* synthetic */ f6[] $values() {
        return new f6[]{All, PendingSubmissions, ActiveChallenges, RecentlyUnlocked, Unsynced, AlmostThere, Locked, Unsupported, Unofficial, Unlocked};
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [e6, java.lang.Object] */
    static {
        f6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
    }

    private f6(String str, int i, int i2, e3 e3Var) {
        this.displayOrder = i2;
        this.bucket = e3Var;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static f6 valueOf(String str) {
        return (f6) Enum.valueOf(f6.class, str);
    }

    public static f6[] values() {
        return (f6[]) $VALUES.clone();
    }

    public final e3 getBucket() {
        return this.bucket;
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final boolean matches(e3 e3Var) {
        e3Var.getClass();
        e3 e3Var2 = this.bucket;
        if (e3Var2 != null && e3Var2 != e3Var) {
            return false;
        }
        return true;
    }
}
