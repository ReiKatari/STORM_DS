package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gb3  reason: default package */
/* loaded from: classes.dex */
public final class gb3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ gb3[] $VALUES;
    public static final gb3 Min = new gb3("Min", 0);
    public static final gb3 Max = new gb3("Max", 1);

    private static final /* synthetic */ gb3[] $values() {
        return new gb3[]{Min, Max};
    }

    static {
        gb3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private gb3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static gb3 valueOf(String str) {
        return (gb3) Enum.valueOf(gb3.class, str);
    }

    public static gb3[] values() {
        return (gb3[]) $VALUES.clone();
    }
}
