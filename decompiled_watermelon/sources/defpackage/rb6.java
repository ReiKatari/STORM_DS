package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rb6  reason: default package */
/* loaded from: classes.dex */
public final class rb6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ rb6[] $VALUES;
    public static final rb6 ASCENDING = new rb6("ASCENDING", 0);
    public static final rb6 DESCENDING = new rb6("DESCENDING", 1);

    private static final /* synthetic */ rb6[] $values() {
        return new rb6[]{ASCENDING, DESCENDING};
    }

    static {
        rb6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private rb6(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static rb6 valueOf(String str) {
        return (rb6) Enum.valueOf(rb6.class, str);
    }

    public static rb6[] values() {
        return (rb6[]) $VALUES.clone();
    }
}
