package defpackage;

import android.app.ActivityManager;
import android.content.Context;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l16  reason: default package */
/* loaded from: classes.dex */
public final class l16 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ l16[] $VALUES;
    public static final l16 AUTOMATIC = new l16("AUTOMATIC", 0);
    public static final l16 TRUNCATE = new l16("TRUNCATE", 1);
    public static final l16 WRITE_AHEAD_LOGGING = new l16("WRITE_AHEAD_LOGGING", 2);

    private static final /* synthetic */ l16[] $values() {
        return new l16[]{AUTOMATIC, TRUNCATE, WRITE_AHEAD_LOGGING};
    }

    static {
        l16[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private l16(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static l16 valueOf(String str) {
        return (l16) Enum.valueOf(l16.class, str);
    }

    public static l16[] values() {
        return (l16[]) $VALUES.clone();
    }

    public final l16 resolve$room_runtime(Context context) {
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
