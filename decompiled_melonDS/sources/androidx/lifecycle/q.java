package androidx.lifecycle;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q DESTROYED = new q("DESTROYED", 0);
    public static final q INITIALIZED = new q("INITIALIZED", 1);
    public static final q CREATED = new q("CREATED", 2);
    public static final q STARTED = new q("STARTED", 3);
    public static final q RESUMED = new q("RESUMED", 4);

    private static final /* synthetic */ q[] $values() {
        return new q[]{DESTROYED, INITIALIZED, CREATED, STARTED, RESUMED};
    }

    static {
        q[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private q(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    public final boolean isAtLeast(q qVar) {
        qVar.getClass();
        if (compareTo(qVar) >= 0) {
            return true;
        }
        return false;
    }
}
