package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: py4  reason: default package */
/* loaded from: classes.dex */
public final class py4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ py4[] $VALUES;
    public static final py4 Initial = new py4("Initial", 0);
    public static final py4 Main = new py4("Main", 1);
    public static final py4 Final = new py4("Final", 2);

    private static final /* synthetic */ py4[] $values() {
        return new py4[]{Initial, Main, Final};
    }

    static {
        py4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private py4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static py4 valueOf(String str) {
        return (py4) Enum.valueOf(py4.class, str);
    }

    public static py4[] values() {
        return (py4[]) $VALUES.clone();
    }
}
