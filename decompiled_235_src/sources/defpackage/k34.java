package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k34  reason: default package */
/* loaded from: classes.dex */
public final class k34 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ k34[] $VALUES;
    public static final k34 Min = new k34("Min", 0);
    public static final k34 Max = new k34("Max", 1);

    private static final /* synthetic */ k34[] $values() {
        return new k34[]{Min, Max};
    }

    static {
        k34[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private k34(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static k34 valueOf(String str) {
        return (k34) Enum.valueOf(k34.class, str);
    }

    public static k34[] values() {
        return (k34[]) $VALUES.clone();
    }
}
