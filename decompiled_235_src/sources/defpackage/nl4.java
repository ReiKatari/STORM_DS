package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nl4  reason: default package */
/* loaded from: classes.dex */
public final class nl4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ nl4[] $VALUES;
    public static final nl4 SKIP = new nl4("SKIP", 0);
    public static final nl4 TERMINATE = new nl4("TERMINATE", 1);

    private static final /* synthetic */ nl4[] $values() {
        return new nl4[]{SKIP, TERMINATE};
    }

    static {
        nl4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private nl4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static nl4 valueOf(String str) {
        return (nl4) Enum.valueOf(nl4.class, str);
    }

    public static nl4[] values() {
        return (nl4[]) $VALUES.clone();
    }
}
