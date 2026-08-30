package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ts  reason: default package */
/* loaded from: classes.dex */
public final class ts {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ts[] $VALUES;
    public static final ts PRODUCTION = new ts("PRODUCTION", 0);
    public static final ts NIGHTLY = new ts("NIGHTLY", 1);

    private static final /* synthetic */ ts[] $values() {
        return new ts[]{PRODUCTION, NIGHTLY};
    }

    static {
        ts[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ts(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ts valueOf(String str) {
        return (ts) Enum.valueOf(ts.class, str);
    }

    public static ts[] values() {
        return (ts[]) $VALUES.clone();
    }
}
