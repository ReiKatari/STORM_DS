package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ld3  reason: default package */
/* loaded from: classes.dex */
public final class ld3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ld3[] $VALUES;
    public static final ld3 DEFAULT = new ld3("DEFAULT", 0);
    public static final ld3 CUSTOM = new ld3("CUSTOM", 1);

    private static final /* synthetic */ ld3[] $values() {
        return new ld3[]{DEFAULT, CUSTOM};
    }

    static {
        ld3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ld3(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ld3 valueOf(String str) {
        return (ld3) Enum.valueOf(ld3.class, str);
    }

    public static ld3[] values() {
        return (ld3[]) $VALUES.clone();
    }
}
