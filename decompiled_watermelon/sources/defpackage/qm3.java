package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qm3  reason: default package */
/* loaded from: classes.dex */
public final class qm3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ qm3[] $VALUES;
    public static final qm3 DESTROYED = new qm3("DESTROYED", 0);
    public static final qm3 INITIALIZED = new qm3("INITIALIZED", 1);
    public static final qm3 CREATED = new qm3("CREATED", 2);
    public static final qm3 STARTED = new qm3("STARTED", 3);
    public static final qm3 RESUMED = new qm3("RESUMED", 4);

    private static final /* synthetic */ qm3[] $values() {
        return new qm3[]{DESTROYED, INITIALIZED, CREATED, STARTED, RESUMED};
    }

    static {
        qm3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private qm3(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static qm3 valueOf(String str) {
        return (qm3) Enum.valueOf(qm3.class, str);
    }

    public static qm3[] values() {
        return (qm3[]) $VALUES.clone();
    }

    public final boolean isAtLeast(qm3 qm3Var) {
        qm3Var.getClass();
        if (compareTo(qm3Var) >= 0) {
            return true;
        }
        return false;
    }
}
