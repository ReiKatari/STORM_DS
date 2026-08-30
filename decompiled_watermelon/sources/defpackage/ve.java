package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ve  reason: default package */
/* loaded from: classes.dex */
public final class ve {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ve[] $VALUES;
    public static final ve SHOW_ORIGINAL = new ve("SHOW_ORIGINAL", 0);
    public static final ve SHOW_TRANSLATED = new ve("SHOW_TRANSLATED", 1);

    private static final /* synthetic */ ve[] $values() {
        return new ve[]{SHOW_ORIGINAL, SHOW_TRANSLATED};
    }

    static {
        ve[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ve(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ve valueOf(String str) {
        return (ve) Enum.valueOf(ve.class, str);
    }

    public static ve[] values() {
        return (ve[]) $VALUES.clone();
    }
}
