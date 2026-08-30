package me.magnum.melonds.domain.model;

import fc.a;
import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class ConsoleType {
    private static final /* synthetic */ a $ENTRIES;
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
        $ENTRIES = r.x($values);
    }

    private ConsoleType(String str, int i2, int i10) {
        this.consoleType = i10;
    }

    public static a getEntries() {
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
