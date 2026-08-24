package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u26  reason: default package */
/* loaded from: classes.dex */
public final class u26 implements v26 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ u26[] $VALUES;
    public static final u26 DEFAULT = new u26("DEFAULT", 0, null);
    public static final u26 DS = new u26("DS", 1, ConsoleType.DS);
    public static final u26 DSi = new u26("DSi", 2, ConsoleType.DSi);
    private final ConsoleType targetConsoleType;

    private static final /* synthetic */ u26[] $values() {
        return new u26[]{DEFAULT, DS, DSi};
    }

    static {
        u26[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private u26(String str, int i, ConsoleType consoleType) {
        this.targetConsoleType = consoleType;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static u26 valueOf(String str) {
        return (u26) Enum.valueOf(u26.class, str);
    }

    public static u26[] values() {
        return (u26[]) $VALUES.clone();
    }

    public final ConsoleType getTargetConsoleType() {
        return this.targetConsoleType;
    }

    @Override // defpackage.v26
    public ConsoleType getValue() {
        ConsoleType consoleType = this.targetConsoleType;
        consoleType.getClass();
        return consoleType;
    }

    @Override // defpackage.v26
    public u26 getDefault() {
        return DEFAULT;
    }
}
