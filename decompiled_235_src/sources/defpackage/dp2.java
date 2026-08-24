package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dp2  reason: default package */
/* loaded from: classes.dex */
public final class dp2 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ dp2[] $VALUES;
    public static final dp2 DISABLED_NOT_LOGGED_IN = new dp2("DISABLED_NOT_LOGGED_IN", 0);
    public static final dp2 DISABLED_BY_SETTING = new dp2("DISABLED_BY_SETTING", 1);
    public static final dp2 DISABLED_LOGIN_EXPIRED = new dp2("DISABLED_LOGIN_EXPIRED", 2);
    public static final dp2 DISABLED_LOAD_ERROR = new dp2("DISABLED_LOAD_ERROR", 3);
    public static final dp2 DISABLED_GAME_NOT_FOUND = new dp2("DISABLED_GAME_NOT_FOUND", 4);
    public static final dp2 ENABLED_NO_ACHIEVEMENTS = new dp2("ENABLED_NO_ACHIEVEMENTS", 5);
    public static final dp2 ENABLED_FULL = new dp2("ENABLED_FULL", 6);

    private static final /* synthetic */ dp2[] $values() {
        return new dp2[]{DISABLED_NOT_LOGGED_IN, DISABLED_BY_SETTING, DISABLED_LOGIN_EXPIRED, DISABLED_LOAD_ERROR, DISABLED_GAME_NOT_FOUND, ENABLED_NO_ACHIEVEMENTS, ENABLED_FULL};
    }

    static {
        dp2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private dp2(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static dp2 valueOf(String str) {
        return (dp2) Enum.valueOf(dp2.class, str);
    }

    public static dp2[] values() {
        return (dp2[]) $VALUES.clone();
    }
}
