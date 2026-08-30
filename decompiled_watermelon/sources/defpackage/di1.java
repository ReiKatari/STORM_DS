package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: di1  reason: default package */
/* loaded from: classes.dex */
public final class di1 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ di1[] $VALUES;
    public static final di1 Up = new di1("Up", 0);
    public static final di1 Drag = new di1("Drag", 1);
    public static final di1 Timeout = new di1("Timeout", 2);
    public static final di1 Cancel = new di1("Cancel", 3);

    private static final /* synthetic */ di1[] $values() {
        return new di1[]{Up, Drag, Timeout, Cancel};
    }

    static {
        di1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private di1(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static di1 valueOf(String str) {
        return (di1) Enum.valueOf(di1.class, str);
    }

    public static di1[] values() {
        return (di1[]) $VALUES.clone();
    }
}
