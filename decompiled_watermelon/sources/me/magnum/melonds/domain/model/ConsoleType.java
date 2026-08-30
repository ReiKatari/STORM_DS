package me.magnum.melonds.domain.model;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class ConsoleType {
    private static final /* synthetic */ e12 $ENTRIES;
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
        $ENTRIES = l.C($values);
    }

    private ConsoleType(String str, int i, int i2) {
        this.consoleType = i2;
    }

    public static e12 getEntries() {
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
