package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ic5  reason: default package */
/* loaded from: classes.dex */
public final class ic5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ic5[] $VALUES;
    public static final hc5 Companion;
    private final int wireValue;
    public static final ic5 ACHIEVEMENT = new ic5("ACHIEVEMENT", 0, 1);
    public static final ic5 LEADERBOARD = new ic5("LEADERBOARD", 1, 2);

    private static final /* synthetic */ ic5[] $values() {
        return new ic5[]{ACHIEVEMENT, LEADERBOARD};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, hc5] */
    static {
        ic5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private ic5(String str, int i, int i2) {
        this.wireValue = i2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ic5 valueOf(String str) {
        return (ic5) Enum.valueOf(ic5.class, str);
    }

    public static ic5[] values() {
        return (ic5[]) $VALUES.clone();
    }

    public final int getWireValue() {
        return this.wireValue;
    }
}
