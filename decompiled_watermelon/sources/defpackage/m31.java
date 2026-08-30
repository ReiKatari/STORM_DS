package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m31  reason: default package */
/* loaded from: classes.dex */
public final class m31 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ m31[] $VALUES;
    public static final m31 CPU_ACQUIRED = new m31("CPU_ACQUIRED", 0);
    public static final m31 BLOCKING = new m31("BLOCKING", 1);
    public static final m31 PARKING = new m31("PARKING", 2);
    public static final m31 DORMANT = new m31("DORMANT", 3);
    public static final m31 TERMINATED = new m31("TERMINATED", 4);

    private static final /* synthetic */ m31[] $values() {
        return new m31[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
    }

    static {
        m31[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private m31(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static m31 valueOf(String str) {
        return (m31) Enum.valueOf(m31.class, str);
    }

    public static m31[] values() {
        return (m31[]) $VALUES.clone();
    }
}
