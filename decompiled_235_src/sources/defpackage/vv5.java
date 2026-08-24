package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vv5  reason: default package */
/* loaded from: classes.dex */
public final class vv5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ vv5[] $VALUES;
    private final int tabIndex;
    public static final vv5 CONFIG = new vv5("CONFIG", 0, 0);
    public static final vv5 CHEATS = new vv5("CHEATS", 1, 1);
    public static final vv5 RETRO_ACHIEVEMENTS = new vv5("RETRO_ACHIEVEMENTS", 2, 2);
    public static final vv5 OFFLINE_ACHIEVEMENTS = new vv5("OFFLINE_ACHIEVEMENTS", 3, 3);

    private static final /* synthetic */ vv5[] $values() {
        return new vv5[]{CONFIG, CHEATS, RETRO_ACHIEVEMENTS, OFFLINE_ACHIEVEMENTS};
    }

    static {
        vv5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private vv5(String str, int i, int i2) {
        this.tabIndex = i2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static vv5 valueOf(String str) {
        return (vv5) Enum.valueOf(vv5.class, str);
    }

    public static vv5[] values() {
        return (vv5[]) $VALUES.clone();
    }

    public final int getTabIndex() {
        return this.tabIndex;
    }
}
