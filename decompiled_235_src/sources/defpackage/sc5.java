package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sc5  reason: default package */
/* loaded from: classes.dex */
public final class sc5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ sc5[] $VALUES;
    public static final sc5 MANUAL_SYNC = new sc5("MANUAL_SYNC", 0);
    public static final sc5 RESUMABLE_EXIT = new sc5("RESUMABLE_EXIT", 1);
    public static final sc5 TERMINAL_EXIT = new sc5("TERMINAL_EXIT", 2);

    private static final /* synthetic */ sc5[] $values() {
        return new sc5[]{MANUAL_SYNC, RESUMABLE_EXIT, TERMINAL_EXIT};
    }

    static {
        sc5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private sc5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static sc5 valueOf(String str) {
        return (sc5) Enum.valueOf(sc5.class, str);
    }

    public static sc5[] values() {
        return (sc5[]) $VALUES.clone();
    }
}
