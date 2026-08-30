package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cs5  reason: default package */
/* loaded from: classes.dex */
public final class cs5 implements ds5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ cs5[] $VALUES;
    public static final cs5 DEFAULT = new cs5("DEFAULT", 0, null);
    public static final cs5 DS = new cs5("DS", 1, ConsoleType.DS);
    public static final cs5 DSi = new cs5("DSi", 2, ConsoleType.DSi);
    private final ConsoleType targetConsoleType;

    private static final /* synthetic */ cs5[] $values() {
        return new cs5[]{DEFAULT, DS, DSi};
    }

    static {
        cs5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private cs5(String str, int i, ConsoleType consoleType) {
        this.targetConsoleType = consoleType;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static cs5 valueOf(String str) {
        return (cs5) Enum.valueOf(cs5.class, str);
    }

    public static cs5[] values() {
        return (cs5[]) $VALUES.clone();
    }

    public final ConsoleType getTargetConsoleType() {
        return this.targetConsoleType;
    }

    @Override // defpackage.ds5
    public ConsoleType getValue() {
        ConsoleType consoleType = this.targetConsoleType;
        consoleType.getClass();
        return consoleType;
    }

    @Override // defpackage.ds5
    public cs5 getDefault() {
        return DEFAULT;
    }
}
