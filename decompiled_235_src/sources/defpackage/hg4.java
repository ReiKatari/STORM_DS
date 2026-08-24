package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hg4  reason: default package */
/* loaded from: classes.dex */
public final class hg4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ hg4[] $VALUES;
    public static final hg4 Min = new hg4("Min", 0);
    public static final hg4 Max = new hg4("Max", 1);

    private static final /* synthetic */ hg4[] $values() {
        return new hg4[]{Min, Max};
    }

    static {
        hg4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private hg4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static hg4 valueOf(String str) {
        return (hg4) Enum.valueOf(hg4.class, str);
    }

    public static hg4[] values() {
        return (hg4[]) $VALUES.clone();
    }
}
