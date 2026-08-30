package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ep5  reason: default package */
/* loaded from: classes.dex */
public final class ep5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ep5[] $VALUES;
    public static final ep5 ARM9 = new ep5("ARM9", 0);
    public static final ep5 ARM7 = new ep5("ARM7", 1);
    public static final ep5 BANNER = new ep5("BANNER", 2);

    private static final /* synthetic */ ep5[] $values() {
        return new ep5[]{ARM9, ARM7, BANNER};
    }

    static {
        ep5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ep5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ep5 valueOf(String str) {
        return (ep5) Enum.valueOf(ep5.class, str);
    }

    public static ep5[] values() {
        return (ep5[]) $VALUES.clone();
    }
}
