package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i31  reason: default package */
/* loaded from: classes.dex */
public final class i31 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ i31[] $VALUES;
    public static final i31 VIEW_APPEAR = new i31("VIEW_APPEAR", 0);
    public static final i31 VIEW_DISAPPEAR = new i31("VIEW_DISAPPEAR", 1);

    private static final /* synthetic */ i31[] $values() {
        return new i31[]{VIEW_APPEAR, VIEW_DISAPPEAR};
    }

    static {
        i31[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private i31(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static i31 valueOf(String str) {
        return (i31) Enum.valueOf(i31.class, str);
    }

    public static i31[] values() {
        return (i31[]) $VALUES.clone();
    }
}
