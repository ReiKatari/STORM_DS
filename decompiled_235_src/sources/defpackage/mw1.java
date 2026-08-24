package defpackage;

import com.google.mlkit.common.MlKitException;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mw1  reason: default package */
/* loaded from: classes.dex */
public final class mw1 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ mw1[] $VALUES;
    private final int event;
    public static final mw1 EventRumbleStart = new mw1("EventRumbleStart", 0, 100);
    public static final mw1 EventRumbleStop = new mw1("EventRumbleStop", 1, MlKitException.NOT_ENOUGH_SPACE);
    public static final mw1 EventEmulatorStop = new mw1("EventEmulatorStop", 2, MlKitException.MODEL_HASH_MISMATCH);
    public static final mw1 EventRendererInitFailed = new mw1("EventRendererInitFailed", 3, 103);
    public static final mw1 EventVulkanCompileProgress = new mw1("EventVulkanCompileProgress", 4, 104);
    public static final mw1 EventRAAchievementPrimed = new mw1("EventRAAchievementPrimed", 5, MlKitException.CODE_SCANNER_UNAVAILABLE);
    public static final mw1 EventRAAchievementTriggered = new mw1("EventRAAchievementTriggered", 6, MlKitException.CODE_SCANNER_CANCELLED);
    public static final mw1 EventRAAchievementUnprimed = new mw1("EventRAAchievementUnprimed", 7, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED);
    public static final mw1 EventRAAchievementProgressUpdated = new mw1("EventRAAchievementProgressUpdated", 8, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE);
    public static final mw1 EventRAGameCompleted = new mw1("EventRAGameCompleted", 9, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS);
    public static final mw1 EventRASubsetCompleted = new mw1("EventRASubsetCompleted", 10, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR);
    public static final mw1 EventRAServerError = new mw1("EventRAServerError", 11, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR);
    public static final mw1 EventRADisconnected = new mw1("EventRADisconnected", 12, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD);
    public static final mw1 EventRAReconnected = new mw1("EventRAReconnected", 13, 208);
    public static final mw1 EventRALeaderboardAttemptStarted = new mw1("EventRALeaderboardAttemptStarted", 14, 210);
    public static final mw1 EventRALeaderboardAttemptUpdated = new mw1("EventRALeaderboardAttemptUpdated", 15, 211);
    public static final mw1 EventRALeaderboardAttemptCanceled = new mw1("EventRALeaderboardAttemptCanceled", 16, 212);
    public static final mw1 EventRALeaderboardAttemptCompleted = new mw1("EventRALeaderboardAttemptCompleted", 17, 213);
    public static final mw1 EventRAAchievementProgressIndicatorHidden = new mw1("EventRAAchievementProgressIndicatorHidden", 18, 214);
    public static final mw1 EventRALeaderboardTrackerHidden = new mw1("EventRALeaderboardTrackerHidden", 19, 215);
    public static final mw1 EventRALeaderboardAttemptSubmitted = new mw1("EventRALeaderboardAttemptSubmitted", 20, 216);
    public static final mw1 EventRALeaderboardScoreboard = new mw1("EventRALeaderboardScoreboard", 21, 217);
    public static final mw1 EventRALeaderboardSubmissionFailed = new mw1("EventRALeaderboardSubmissionFailed", 22, 218);
    public static final mw1 EventRALeaderboardRuntimeReset = new mw1("EventRALeaderboardRuntimeReset", 23, 219);
    public static final mw1 EventRAPendingSubmissionAdded = new mw1("EventRAPendingSubmissionAdded", 24, 220);
    public static final mw1 EventRAPendingSubmissionResolved = new mw1("EventRAPendingSubmissionResolved", 25, 221);
    public static final mw1 EventRAPendingSubmissionBarrier = new mw1("EventRAPendingSubmissionBarrier", 26, 222);

    private static final /* synthetic */ mw1[] $values() {
        return new mw1[]{EventRumbleStart, EventRumbleStop, EventEmulatorStop, EventRendererInitFailed, EventVulkanCompileProgress, EventRAAchievementPrimed, EventRAAchievementTriggered, EventRAAchievementUnprimed, EventRAAchievementProgressUpdated, EventRAGameCompleted, EventRASubsetCompleted, EventRAServerError, EventRADisconnected, EventRAReconnected, EventRALeaderboardAttemptStarted, EventRALeaderboardAttemptUpdated, EventRALeaderboardAttemptCanceled, EventRALeaderboardAttemptCompleted, EventRAAchievementProgressIndicatorHidden, EventRALeaderboardTrackerHidden, EventRALeaderboardAttemptSubmitted, EventRALeaderboardScoreboard, EventRALeaderboardSubmissionFailed, EventRALeaderboardRuntimeReset, EventRAPendingSubmissionAdded, EventRAPendingSubmissionResolved, EventRAPendingSubmissionBarrier};
    }

    static {
        mw1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private mw1(String str, int i, int i2) {
        this.event = i2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static mw1 valueOf(String str) {
        return (mw1) Enum.valueOf(mw1.class, str);
    }

    public static mw1[] values() {
        return (mw1[]) $VALUES.clone();
    }

    public final int getEvent() {
        return this.event;
    }
}
