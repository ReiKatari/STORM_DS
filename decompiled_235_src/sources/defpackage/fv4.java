package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fv4  reason: default package */
/* loaded from: classes.dex */
public final class fv4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ fv4[] $VALUES;
    public static final fv4 ADDED = new fv4("ADDED", 0);
    public static final fv4 DUPLICATE_SUBMISSION_ID = new fv4("DUPLICATE_SUBMISSION_ID", 1);
    public static final fv4 DUPLICATE_NATIVE_SUBMISSION_ID = new fv4("DUPLICATE_NATIVE_SUBMISSION_ID", 2);
    public static final fv4 DUPLICATE_LEADERBOARD_ATTEMPT_ID = new fv4("DUPLICATE_LEADERBOARD_ATTEMPT_ID", 3);
    public static final fv4 CONTEXT_MISMATCH = new fv4("CONTEXT_MISMATCH", 4);
    public static final fv4 CLOSED = new fv4("CLOSED", 5);

    private static final /* synthetic */ fv4[] $values() {
        return new fv4[]{ADDED, DUPLICATE_SUBMISSION_ID, DUPLICATE_NATIVE_SUBMISSION_ID, DUPLICATE_LEADERBOARD_ATTEMPT_ID, CONTEXT_MISMATCH, CLOSED};
    }

    static {
        fv4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private fv4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static fv4 valueOf(String str) {
        return (fv4) Enum.valueOf(fv4.class, str);
    }

    public static fv4[] values() {
        return (fv4[]) $VALUES.clone();
    }
}
