package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q94  reason: default package */
/* loaded from: classes.dex */
public final class q94 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ q94[] $VALUES;
    public static final q94 ENABLED = new q94("ENABLED", 0);
    public static final q94 DISABLED_NOT_LOGGED_IN = new q94("DISABLED_NOT_LOGGED_IN", 1);
    public static final q94 DISABLED_NO_CACHE = new q94("DISABLED_NO_CACHE", 2);

    private static final /* synthetic */ q94[] $values() {
        return new q94[]{ENABLED, DISABLED_NOT_LOGGED_IN, DISABLED_NO_CACHE};
    }

    static {
        q94[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private q94(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static q94 valueOf(String str) {
        return (q94) Enum.valueOf(q94.class, str);
    }

    public static q94[] values() {
        return (q94[]) $VALUES.clone();
    }
}
