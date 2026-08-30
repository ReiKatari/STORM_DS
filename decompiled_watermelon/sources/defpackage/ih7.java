package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ih7  reason: default package */
/* loaded from: classes.dex */
public final class ih7 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ih7[] $VALUES;
    public static final ih7 ENQUEUED = new ih7("ENQUEUED", 0);
    public static final ih7 RUNNING = new ih7("RUNNING", 1);
    public static final ih7 SUCCEEDED = new ih7("SUCCEEDED", 2);
    public static final ih7 FAILED = new ih7("FAILED", 3);
    public static final ih7 BLOCKED = new ih7("BLOCKED", 4);
    public static final ih7 CANCELLED = new ih7("CANCELLED", 5);

    private static final /* synthetic */ ih7[] $values() {
        return new ih7[]{ENQUEUED, RUNNING, SUCCEEDED, FAILED, BLOCKED, CANCELLED};
    }

    static {
        ih7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ih7(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ih7 valueOf(String str) {
        return (ih7) Enum.valueOf(ih7.class, str);
    }

    public static ih7[] values() {
        return (ih7[]) $VALUES.clone();
    }

    public final boolean isFinished() {
        if (this != SUCCEEDED && this != FAILED && this != CANCELLED) {
            return false;
        }
        return true;
    }
}
