package defpackage;

import android.app.ActivityManager;
import android.content.Context;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rq5  reason: default package */
/* loaded from: classes.dex */
public final class rq5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ rq5[] $VALUES;
    public static final rq5 AUTOMATIC = new rq5("AUTOMATIC", 0);
    public static final rq5 TRUNCATE = new rq5("TRUNCATE", 1);
    public static final rq5 WRITE_AHEAD_LOGGING = new rq5("WRITE_AHEAD_LOGGING", 2);

    private static final /* synthetic */ rq5[] $values() {
        return new rq5[]{AUTOMATIC, TRUNCATE, WRITE_AHEAD_LOGGING};
    }

    static {
        rq5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private rq5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static rq5 valueOf(String str) {
        return (rq5) Enum.valueOf(rq5.class, str);
    }

    public static rq5[] values() {
        return (rq5[]) $VALUES.clone();
    }

    public final rq5 resolve$room_runtime(Context context) {
        ActivityManager activityManager;
        context.getClass();
        if (this != AUTOMATIC) {
            return this;
        }
        Object systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null && !activityManager.isLowRamDevice()) {
            return WRITE_AHEAD_LOGGING;
        }
        return TRUNCATE;
    }
}
