package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gv6  reason: default package */
/* loaded from: classes.dex */
public final class gv6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ gv6[] $VALUES;
    public static final gv6 FEATURE_COMBINATION_TABLE = new gv6("FEATURE_COMBINATION_TABLE", 0);
    public static final gv6 CAPTURE_SESSION_TABLES = new gv6("CAPTURE_SESSION_TABLES", 1);

    private static final /* synthetic */ gv6[] $values() {
        return new gv6[]{FEATURE_COMBINATION_TABLE, CAPTURE_SESSION_TABLES};
    }

    static {
        gv6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private gv6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static gv6 valueOf(String str) {
        return (gv6) Enum.valueOf(gv6.class, str);
    }

    public static gv6[] values() {
        return (gv6[]) $VALUES.clone();
    }
}
