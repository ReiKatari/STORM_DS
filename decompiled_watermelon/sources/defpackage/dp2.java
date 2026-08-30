package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dp2  reason: default package */
/* loaded from: classes.dex */
public final class dp2 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ dp2[] $VALUES;
    public static final dp2 Cursor = new dp2("Cursor", 0);
    public static final dp2 SelectionStart = new dp2("SelectionStart", 1);
    public static final dp2 SelectionEnd = new dp2("SelectionEnd", 2);

    private static final /* synthetic */ dp2[] $values() {
        return new dp2[]{Cursor, SelectionStart, SelectionEnd};
    }

    static {
        dp2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private dp2(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static dp2 valueOf(String str) {
        return (dp2) Enum.valueOf(dp2.class, str);
    }

    public static dp2[] values() {
        return (dp2[]) $VALUES.clone();
    }
}
