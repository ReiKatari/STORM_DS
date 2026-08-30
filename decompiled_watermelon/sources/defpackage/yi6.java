package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yi6  reason: default package */
/* loaded from: classes.dex */
public final class yi6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ yi6[] $VALUES;
    public static final yi6 END = new yi6("END", 0);
    public static final yi6 ROLLBACK = new yi6("ROLLBACK", 1);
    public static final yi6 BEGIN_EXCLUSIVE = new yi6("BEGIN_EXCLUSIVE", 2);
    public static final yi6 BEGIN_IMMEDIATE = new yi6("BEGIN_IMMEDIATE", 3);
    public static final yi6 BEGIN_DEFERRED = new yi6("BEGIN_DEFERRED", 4);

    private static final /* synthetic */ yi6[] $values() {
        return new yi6[]{END, ROLLBACK, BEGIN_EXCLUSIVE, BEGIN_IMMEDIATE, BEGIN_DEFERRED};
    }

    static {
        yi6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private yi6(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static yi6 valueOf(String str) {
        return (yi6) Enum.valueOf(yi6.class, str);
    }

    public static yi6[] values() {
        return (yi6[]) $VALUES.clone();
    }
}
