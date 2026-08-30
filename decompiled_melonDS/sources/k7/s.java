package k7;

import android.app.ActivityManager;
import android.content.Context;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s AUTOMATIC = new s("AUTOMATIC", 0);
    public static final s TRUNCATE = new s("TRUNCATE", 1);
    public static final s WRITE_AHEAD_LOGGING = new s("WRITE_AHEAD_LOGGING", 2);

    private static final /* synthetic */ s[] $values() {
        return new s[]{AUTOMATIC, TRUNCATE, WRITE_AHEAD_LOGGING};
    }

    static {
        s[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private s(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    public final s resolve$room_runtime(Context context) {
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
