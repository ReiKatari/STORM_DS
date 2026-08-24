package me.magnum.melonds.domain.model;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ConsoleType {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ConsoleType[] $VALUES;
    public static final ConsoleType DS = new ConsoleType("DS", 0, 0);
    public static final ConsoleType DSi = new ConsoleType("DSi", 1, 1);
    private final int consoleType;

    private static final /* synthetic */ ConsoleType[] $values() {
        return new ConsoleType[]{DS, DSi};
    }

    static {
        ConsoleType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ConsoleType(String str, int i, int i2) {
        this.consoleType = i2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ConsoleType valueOf(String str) {
        return (ConsoleType) Enum.valueOf(ConsoleType.class, str);
    }

    public static ConsoleType[] values() {
        return (ConsoleType[]) $VALUES.clone();
    }

    public final int getConsoleType() {
        return this.consoleType;
    }
}
