package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k25  reason: default package */
/* loaded from: classes.dex */
public final class k25 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ k25[] $VALUES;
    public static final k25 ONLINE_LIVE = new k25("ONLINE_LIVE", 0);
    public static final k25 OFFLINE_ACCUMULATING = new k25("OFFLINE_ACCUMULATING", 1);
    public static final k25 PENDING_RA_SUBMISSIONS = new k25("PENDING_RA_SUBMISSIONS", 2);
    public static final k25 RECONCILING_RA_SUBMISSIONS = new k25("RECONCILING_RA_SUBMISSIONS", 3);

    private static final /* synthetic */ k25[] $values() {
        return new k25[]{ONLINE_LIVE, OFFLINE_ACCUMULATING, PENDING_RA_SUBMISSIONS, RECONCILING_RA_SUBMISSIONS};
    }

    static {
        k25[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private k25(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static k25 valueOf(String str) {
        return (k25) Enum.valueOf(k25.class, str);
    }

    public static k25[] values() {
        return (k25[]) $VALUES.clone();
    }
}
