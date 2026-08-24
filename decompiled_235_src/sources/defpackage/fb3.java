package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fb3  reason: default package */
/* loaded from: classes.dex */
public final class fb3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ fb3[] $VALUES;
    public static final fb3 Min = new fb3("Min", 0);
    public static final fb3 Max = new fb3("Max", 1);

    private static final /* synthetic */ fb3[] $values() {
        return new fb3[]{Min, Max};
    }

    static {
        fb3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private fb3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static fb3 valueOf(String str) {
        return (fb3) Enum.valueOf(fb3.class, str);
    }

    public static fb3[] values() {
        return (fb3[]) $VALUES.clone();
    }
}
