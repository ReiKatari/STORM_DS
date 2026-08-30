package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rb5  reason: default package */
/* loaded from: classes.dex */
public final class rb5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ rb5[] $VALUES;
    public static final rb5 Ltr = new rb5("Ltr", 0);
    public static final rb5 Rtl = new rb5("Rtl", 1);

    private static final /* synthetic */ rb5[] $values() {
        return new rb5[]{Ltr, Rtl};
    }

    static {
        rb5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private rb5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static rb5 valueOf(String str) {
        return (rb5) Enum.valueOf(rb5.class, str);
    }

    public static rb5[] values() {
        return (rb5[]) $VALUES.clone();
    }
}
