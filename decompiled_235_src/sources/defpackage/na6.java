package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: na6  reason: default package */
/* loaded from: classes.dex */
public final class na6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ na6[] $VALUES;
    public static final na6 Left = new na6("Left", 0);
    public static final na6 Middle = new na6("Middle", 1);
    public static final na6 Right = new na6("Right", 2);

    private static final /* synthetic */ na6[] $values() {
        return new na6[]{Left, Middle, Right};
    }

    static {
        na6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private na6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static na6 valueOf(String str) {
        return (na6) Enum.valueOf(na6.class, str);
    }

    public static na6[] values() {
        return (na6[]) $VALUES.clone();
    }
}
