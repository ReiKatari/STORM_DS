package n2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r1 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ r1[] $VALUES;
    public static final r1 ShutDown = new r1("ShutDown", 0);
    public static final r1 ShuttingDown = new r1("ShuttingDown", 1);
    public static final r1 Inactive = new r1("Inactive", 2);
    public static final r1 InactivePendingWork = new r1("InactivePendingWork", 3);
    public static final r1 Idle = new r1("Idle", 4);
    public static final r1 PendingWork = new r1("PendingWork", 5);

    private static final /* synthetic */ r1[] $values() {
        return new r1[]{ShutDown, ShuttingDown, Inactive, InactivePendingWork, Idle, PendingWork};
    }

    static {
        r1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private r1(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static r1 valueOf(String str) {
        return (r1) Enum.valueOf(r1.class, str);
    }

    public static r1[] values() {
        return (r1[]) $VALUES.clone();
    }
}
