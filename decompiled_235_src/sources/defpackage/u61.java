package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u61  reason: default package */
/* loaded from: classes.dex */
public final class u61 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ u61[] $VALUES;
    public static final u61 CPU_ACQUIRED = new u61("CPU_ACQUIRED", 0);
    public static final u61 BLOCKING = new u61("BLOCKING", 1);
    public static final u61 PARKING = new u61("PARKING", 2);
    public static final u61 DORMANT = new u61("DORMANT", 3);
    public static final u61 TERMINATED = new u61("TERMINATED", 4);

    private static final /* synthetic */ u61[] $values() {
        return new u61[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
    }

    static {
        u61[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private u61(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static u61 valueOf(String str) {
        return (u61) Enum.valueOf(u61.class, str);
    }

    public static u61[] values() {
        return (u61[]) $VALUES.clone();
    }
}
