package pf;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    private final int event;
    public static final k EventRumbleStart = new k("EventRumbleStart", 0, 100);
    public static final k EventRumbleStop = new k("EventRumbleStop", 1, 101);
    public static final k EventEmulatorStop = new k("EventEmulatorStop", 2, 102);
    public static final k EventRAAchievementPrimed = new k("EventRAAchievementPrimed", 3, 200);
    public static final k EventRAAchievementTriggered = new k("EventRAAchievementTriggered", 4, 201);
    public static final k EventRAAchievementUnprimed = new k("EventRAAchievementUnprimed", 5, 202);
    public static final k EventRAAchievementProgressUpdated = new k("EventRAAchievementProgressUpdated", 6, 203);
    public static final k EventRALeaderboardAttemptStarted = new k("EventRALeaderboardAttemptStarted", 7, 210);
    public static final k EventRALeaderboardAttemptUpdated = new k("EventRALeaderboardAttemptUpdated", 8, 211);
    public static final k EventRALeaderboardAttemptCanceled = new k("EventRALeaderboardAttemptCanceled", 9, 212);
    public static final k EventRALeaderboardAttemptCompleted = new k("EventRALeaderboardAttemptCompleted", 10, 213);

    private static final /* synthetic */ k[] $values() {
        return new k[]{EventRumbleStart, EventRumbleStop, EventEmulatorStop, EventRAAchievementPrimed, EventRAAchievementTriggered, EventRAAchievementUnprimed, EventRAAchievementProgressUpdated, EventRALeaderboardAttemptStarted, EventRALeaderboardAttemptUpdated, EventRALeaderboardAttemptCanceled, EventRALeaderboardAttemptCompleted};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private k(String str, int i2, int i10) {
        this.event = i10;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public final int getEvent() {
        return this.event;
    }
}
