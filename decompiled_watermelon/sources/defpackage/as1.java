package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: as1  reason: default package */
/* loaded from: classes.dex */
public final class as1 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ as1[] $VALUES;
    private final int event;
    public static final as1 EventRumbleStart = new as1("EventRumbleStart", 0, 100);
    public static final as1 EventRumbleStop = new as1("EventRumbleStop", 1, 101);
    public static final as1 EventEmulatorStop = new as1("EventEmulatorStop", 2, 102);
    public static final as1 EventRendererInitFailed = new as1("EventRendererInitFailed", 3, 103);
    public static final as1 EventVulkanCompileProgress = new as1("EventVulkanCompileProgress", 4, 104);
    public static final as1 EventRAAchievementPrimed = new as1("EventRAAchievementPrimed", 5, 200);
    public static final as1 EventRAAchievementTriggered = new as1("EventRAAchievementTriggered", 6, 201);
    public static final as1 EventRAAchievementUnprimed = new as1("EventRAAchievementUnprimed", 7, 202);
    public static final as1 EventRAAchievementProgressUpdated = new as1("EventRAAchievementProgressUpdated", 8, 203);
    public static final as1 EventRAGameCompleted = new as1("EventRAGameCompleted", 9, 204);
    public static final as1 EventRASubsetCompleted = new as1("EventRASubsetCompleted", 10, 205);
    public static final as1 EventRAServerError = new as1("EventRAServerError", 11, 206);
    public static final as1 EventRADisconnected = new as1("EventRADisconnected", 12, 207);
    public static final as1 EventRAReconnected = new as1("EventRAReconnected", 13, 208);
    public static final as1 EventRALeaderboardAttemptStarted = new as1("EventRALeaderboardAttemptStarted", 14, 210);
    public static final as1 EventRALeaderboardAttemptUpdated = new as1("EventRALeaderboardAttemptUpdated", 15, 211);
    public static final as1 EventRALeaderboardAttemptCanceled = new as1("EventRALeaderboardAttemptCanceled", 16, 212);
    public static final as1 EventRALeaderboardAttemptCompleted = new as1("EventRALeaderboardAttemptCompleted", 17, 213);
    public static final as1 EventRAAchievementProgressIndicatorHidden = new as1("EventRAAchievementProgressIndicatorHidden", 18, 214);
    public static final as1 EventRALeaderboardTrackerHidden = new as1("EventRALeaderboardTrackerHidden", 19, 215);
    public static final as1 EventRALeaderboardAttemptSubmitted = new as1("EventRALeaderboardAttemptSubmitted", 20, 216);
    public static final as1 EventRALeaderboardScoreboard = new as1("EventRALeaderboardScoreboard", 21, 217);
    public static final as1 EventRALeaderboardSubmissionFailed = new as1("EventRALeaderboardSubmissionFailed", 22, 218);
    public static final as1 EventRALeaderboardRuntimeReset = new as1("EventRALeaderboardRuntimeReset", 23, 219);
    public static final as1 EventRAPendingSubmissionAdded = new as1("EventRAPendingSubmissionAdded", 24, 220);
    public static final as1 EventRAPendingSubmissionResolved = new as1("EventRAPendingSubmissionResolved", 25, 221);
    public static final as1 EventRAPendingSubmissionBarrier = new as1("EventRAPendingSubmissionBarrier", 26, 222);

    private static final /* synthetic */ as1[] $values() {
        return new as1[]{EventRumbleStart, EventRumbleStop, EventEmulatorStop, EventRendererInitFailed, EventVulkanCompileProgress, EventRAAchievementPrimed, EventRAAchievementTriggered, EventRAAchievementUnprimed, EventRAAchievementProgressUpdated, EventRAGameCompleted, EventRASubsetCompleted, EventRAServerError, EventRADisconnected, EventRAReconnected, EventRALeaderboardAttemptStarted, EventRALeaderboardAttemptUpdated, EventRALeaderboardAttemptCanceled, EventRALeaderboardAttemptCompleted, EventRAAchievementProgressIndicatorHidden, EventRALeaderboardTrackerHidden, EventRALeaderboardAttemptSubmitted, EventRALeaderboardScoreboard, EventRALeaderboardSubmissionFailed, EventRALeaderboardRuntimeReset, EventRAPendingSubmissionAdded, EventRAPendingSubmissionResolved, EventRAPendingSubmissionBarrier};
    }

    static {
        as1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private as1(String str, int i, int i2) {
        this.event = i2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static as1 valueOf(String str) {
        return (as1) Enum.valueOf(as1.class, str);
    }

    public static as1[] values() {
        return (as1[]) $VALUES.clone();
    }

    public final int getEvent() {
        return this.event;
    }
}
