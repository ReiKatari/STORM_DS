package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r35  reason: default package */
/* loaded from: classes.dex */
public final class r35 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ r35[] $VALUES;
    public static final r35 ACHIEVEMENT = new r35("ACHIEVEMENT", 0);
    public static final r35 LEADERBOARD = new r35("LEADERBOARD", 1);

    private static final /* synthetic */ r35[] $values() {
        return new r35[]{ACHIEVEMENT, LEADERBOARD};
    }

    static {
        r35[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private r35(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static r35 valueOf(String str) {
        return (r35) Enum.valueOf(r35.class, str);
    }

    public static r35[] values() {
        return (r35[]) $VALUES.clone();
    }
}
