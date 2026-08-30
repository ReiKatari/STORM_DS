package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mj6  reason: default package */
/* loaded from: classes.dex */
public final class mj6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ mj6[] $VALUES;
    public static final mj6 FEATURE_COMBINATION_TABLE = new mj6("FEATURE_COMBINATION_TABLE", 0);
    public static final mj6 CAPTURE_SESSION_TABLES = new mj6("CAPTURE_SESSION_TABLES", 1);

    private static final /* synthetic */ mj6[] $values() {
        return new mj6[]{FEATURE_COMBINATION_TABLE, CAPTURE_SESSION_TABLES};
    }

    static {
        mj6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private mj6(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static mj6 valueOf(String str) {
        return (mj6) Enum.valueOf(mj6.class, str);
    }

    public static mj6[] values() {
        return (mj6[]) $VALUES.clone();
    }
}
