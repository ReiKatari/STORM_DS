package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jr5  reason: default package */
/* loaded from: classes.dex */
public final class jr5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ jr5[] $VALUES;
    public static final jr5 PATH = new jr5("PATH", 0);
    public static final jr5 QUERY = new jr5("QUERY", 1);

    private static final /* synthetic */ jr5[] $values() {
        return new jr5[]{PATH, QUERY};
    }

    static {
        jr5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private jr5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static jr5 valueOf(String str) {
        return (jr5) Enum.valueOf(jr5.class, str);
    }

    public static jr5[] values() {
        return (jr5[]) $VALUES.clone();
    }
}
