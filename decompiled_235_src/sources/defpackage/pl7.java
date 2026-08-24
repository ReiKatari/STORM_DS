package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pl7  reason: default package */
/* loaded from: classes.dex */
public final class pl7 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ pl7[] $VALUES;
    public static final pl7 Lsq2 = new pl7("Lsq2", 0);
    public static final pl7 Impulse = new pl7("Impulse", 1);

    private static final /* synthetic */ pl7[] $values() {
        return new pl7[]{Lsq2, Impulse};
    }

    static {
        pl7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private pl7(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static pl7 valueOf(String str) {
        return (pl7) Enum.valueOf(pl7.class, str);
    }

    public static pl7[] values() {
        return (pl7[]) $VALUES.clone();
    }
}
