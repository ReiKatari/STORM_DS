package af;

import me.magnum.melonds.domain.model.ConsoleType;
import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements g {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f DEFAULT = new f("DEFAULT", 0, null);
    public static final f DS = new f("DS", 1, ConsoleType.DS);
    public static final f DSi = new f("DSi", 2, ConsoleType.DSi);
    private final ConsoleType targetConsoleType;

    private static final /* synthetic */ f[] $values() {
        return new f[]{DEFAULT, DS, DSi};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private f(String str, int i2, ConsoleType consoleType) {
        this.targetConsoleType = consoleType;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final ConsoleType getTargetConsoleType() {
        return this.targetConsoleType;
    }

    @Override // af.g
    public ConsoleType getValue() {
        ConsoleType consoleType = this.targetConsoleType;
        consoleType.getClass();
        return consoleType;
    }

    @Override // af.g
    public f getDefault() {
        return DEFAULT;
    }
}
