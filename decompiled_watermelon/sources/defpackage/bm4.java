package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bm4  reason: default package */
/* loaded from: classes.dex */
public final class bm4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ bm4[] $VALUES;
    public static final bm4 ADDED = new bm4("ADDED", 0);
    public static final bm4 DUPLICATE_SUBMISSION_ID = new bm4("DUPLICATE_SUBMISSION_ID", 1);
    public static final bm4 DUPLICATE_NATIVE_SUBMISSION_ID = new bm4("DUPLICATE_NATIVE_SUBMISSION_ID", 2);
    public static final bm4 DUPLICATE_LEADERBOARD_ATTEMPT_ID = new bm4("DUPLICATE_LEADERBOARD_ATTEMPT_ID", 3);
    public static final bm4 CONTEXT_MISMATCH = new bm4("CONTEXT_MISMATCH", 4);
    public static final bm4 CLOSED = new bm4("CLOSED", 5);

    private static final /* synthetic */ bm4[] $values() {
        return new bm4[]{ADDED, DUPLICATE_SUBMISSION_ID, DUPLICATE_NATIVE_SUBMISSION_ID, DUPLICATE_LEADERBOARD_ATTEMPT_ID, CONTEXT_MISMATCH, CLOSED};
    }

    static {
        bm4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private bm4(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static bm4 valueOf(String str) {
        return (bm4) Enum.valueOf(bm4.class, str);
    }

    public static bm4[] values() {
        return (bm4[]) $VALUES.clone();
    }
}
