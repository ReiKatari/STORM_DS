package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xa4  reason: default package */
/* loaded from: classes.dex */
public final class xa4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ xa4[] $VALUES;
    public static final xa4 Default = new xa4("Default", 0);
    public static final xa4 UserInput = new xa4("UserInput", 1);
    public static final xa4 PreventUserInput = new xa4("PreventUserInput", 2);

    private static final /* synthetic */ xa4[] $values() {
        return new xa4[]{Default, UserInput, PreventUserInput};
    }

    static {
        xa4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private xa4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static xa4 valueOf(String str) {
        return (xa4) Enum.valueOf(xa4.class, str);
    }

    public static xa4[] values() {
        return (xa4[]) $VALUES.clone();
    }
}
