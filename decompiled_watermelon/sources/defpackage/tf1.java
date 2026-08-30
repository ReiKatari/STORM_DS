package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tf1  reason: default package */
/* loaded from: classes.dex */
public final class tf1 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ tf1[] $VALUES;
    public static final tf1 OK = new tf1("OK", 0);
    public static final tf1 READ_ONLY = new tf1("READ_ONLY", 1);
    public static final tf1 NOT_FOUND = new tf1("NOT_FOUND", 2);

    private static final /* synthetic */ tf1[] $values() {
        return new tf1[]{OK, READ_ONLY, NOT_FOUND};
    }

    static {
        tf1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private tf1(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static tf1 valueOf(String str) {
        return (tf1) Enum.valueOf(tf1.class, str);
    }

    public static tf1[] values() {
        return (tf1[]) $VALUES.clone();
    }
}
