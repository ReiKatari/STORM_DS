package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: py2  reason: default package */
/* loaded from: classes.dex */
public final class py2 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ py2[] $VALUES;
    public static final py2 Yes = new py2("Yes", 0);
    public static final py2 No = new py2("No", 1);
    public static final py2 NotInitialized = new py2("NotInitialized", 2);

    private static final /* synthetic */ py2[] $values() {
        return new py2[]{Yes, No, NotInitialized};
    }

    static {
        py2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private py2(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static py2 valueOf(String str) {
        return (py2) Enum.valueOf(py2.class, str);
    }

    public static py2[] values() {
        return (py2[]) $VALUES.clone();
    }
}
