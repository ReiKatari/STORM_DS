package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ni4  reason: default package */
/* loaded from: classes.dex */
public final class ni4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ni4[] $VALUES;
    public static final ni4 ENABLED = new ni4("ENABLED", 0);
    public static final ni4 DISABLED_NOT_LOGGED_IN = new ni4("DISABLED_NOT_LOGGED_IN", 1);
    public static final ni4 DISABLED_NO_CACHE = new ni4("DISABLED_NO_CACHE", 2);

    private static final /* synthetic */ ni4[] $values() {
        return new ni4[]{ENABLED, DISABLED_NOT_LOGGED_IN, DISABLED_NO_CACHE};
    }

    static {
        ni4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ni4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ni4 valueOf(String str) {
        return (ni4) Enum.valueOf(ni4.class, str);
    }

    public static ni4[] values() {
        return (ni4[]) $VALUES.clone();
    }
}
