package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u43  reason: default package */
/* loaded from: classes.dex */
public final class u43 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ u43[] $VALUES;
    public static final u43 Min = new u43("Min", 0);
    public static final u43 Max = new u43("Max", 1);

    private static final /* synthetic */ u43[] $values() {
        return new u43[]{Min, Max};
    }

    static {
        u43[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private u43(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static u43 valueOf(String str) {
        return (u43) Enum.valueOf(u43.class, str);
    }

    public static u43[] values() {
        return (u43[]) $VALUES.clone();
    }
}
