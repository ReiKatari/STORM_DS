package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ti1  reason: default package */
/* loaded from: classes.dex */
public final class ti1 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ti1[] $VALUES;
    public static final ti1 Yes = new ti1("Yes", 0);
    public static final ti1 No = new ti1("No", 1);
    public static final ti1 NotInitialized = new ti1("NotInitialized", 2);

    private static final /* synthetic */ ti1[] $values() {
        return new ti1[]{Yes, No, NotInitialized};
    }

    static {
        ti1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ti1(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ti1 valueOf(String str) {
        return (ti1) Enum.valueOf(ti1.class, str);
    }

    public static ti1[] values() {
        return (ti1[]) $VALUES.clone();
    }
}
