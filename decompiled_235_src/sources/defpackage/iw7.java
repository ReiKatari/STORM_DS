package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iw7  reason: default package */
/* loaded from: classes.dex */
public final class iw7 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ iw7[] $VALUES;
    public static final iw7 ENQUEUED = new iw7("ENQUEUED", 0);
    public static final iw7 RUNNING = new iw7("RUNNING", 1);
    public static final iw7 SUCCEEDED = new iw7("SUCCEEDED", 2);
    public static final iw7 FAILED = new iw7("FAILED", 3);
    public static final iw7 BLOCKED = new iw7("BLOCKED", 4);
    public static final iw7 CANCELLED = new iw7("CANCELLED", 5);

    private static final /* synthetic */ iw7[] $values() {
        return new iw7[]{ENQUEUED, RUNNING, SUCCEEDED, FAILED, BLOCKED, CANCELLED};
    }

    static {
        iw7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private iw7(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static iw7 valueOf(String str) {
        return (iw7) Enum.valueOf(iw7.class, str);
    }

    public static iw7[] values() {
        return (iw7[]) $VALUES.clone();
    }

    public final boolean isFinished() {
        if (this != SUCCEEDED && this != FAILED && this != CANCELLED) {
            return false;
        }
        return true;
    }
}
