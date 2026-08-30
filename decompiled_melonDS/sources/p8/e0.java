package p8;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 ENQUEUED = new e0("ENQUEUED", 0);
    public static final e0 RUNNING = new e0("RUNNING", 1);
    public static final e0 SUCCEEDED = new e0("SUCCEEDED", 2);
    public static final e0 FAILED = new e0("FAILED", 3);
    public static final e0 BLOCKED = new e0("BLOCKED", 4);
    public static final e0 CANCELLED = new e0("CANCELLED", 5);

    private static final /* synthetic */ e0[] $values() {
        return new e0[]{ENQUEUED, RUNNING, SUCCEEDED, FAILED, BLOCKED, CANCELLED};
    }

    static {
        e0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private e0(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }

    public final boolean isFinished() {
        if (this != SUCCEEDED && this != FAILED && this != CANCELLED) {
            return false;
        }
        return true;
    }
}
