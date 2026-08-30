package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zj2  reason: default package */
/* loaded from: classes.dex */
public final class zj2 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ zj2[] $VALUES;
    public static final zj2 DISABLED_NOT_LOGGED_IN = new zj2("DISABLED_NOT_LOGGED_IN", 0);
    public static final zj2 DISABLED_BY_SETTING = new zj2("DISABLED_BY_SETTING", 1);
    public static final zj2 DISABLED_LOGIN_EXPIRED = new zj2("DISABLED_LOGIN_EXPIRED", 2);
    public static final zj2 DISABLED_LOAD_ERROR = new zj2("DISABLED_LOAD_ERROR", 3);
    public static final zj2 DISABLED_GAME_NOT_FOUND = new zj2("DISABLED_GAME_NOT_FOUND", 4);
    public static final zj2 ENABLED_NO_ACHIEVEMENTS = new zj2("ENABLED_NO_ACHIEVEMENTS", 5);
    public static final zj2 ENABLED_FULL = new zj2("ENABLED_FULL", 6);

    private static final /* synthetic */ zj2[] $values() {
        return new zj2[]{DISABLED_NOT_LOGGED_IN, DISABLED_BY_SETTING, DISABLED_LOGIN_EXPIRED, DISABLED_LOAD_ERROR, DISABLED_GAME_NOT_FOUND, ENABLED_NO_ACHIEVEMENTS, ENABLED_FULL};
    }

    static {
        zj2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private zj2(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static zj2 valueOf(String str) {
        return (zj2) Enum.valueOf(zj2.class, str);
    }

    public static zj2[] values() {
        return (zj2[]) $VALUES.clone();
    }
}
