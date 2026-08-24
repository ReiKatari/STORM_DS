package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bd5  reason: default package */
/* loaded from: classes.dex */
public final class bd5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ bd5[] $VALUES;
    public static final bd5 ACHIEVEMENT = new bd5("ACHIEVEMENT", 0);
    public static final bd5 LEADERBOARD = new bd5("LEADERBOARD", 1);

    private static final /* synthetic */ bd5[] $values() {
        return new bd5[]{ACHIEVEMENT, LEADERBOARD};
    }

    static {
        bd5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private bd5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static bd5 valueOf(String str) {
        return (bd5) Enum.valueOf(bd5.class, str);
    }

    public static bd5[] values() {
        return (bd5[]) $VALUES.clone();
    }
}
