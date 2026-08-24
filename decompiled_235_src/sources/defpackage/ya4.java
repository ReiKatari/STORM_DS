package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ya4  reason: default package */
/* loaded from: classes.dex */
public final class ya4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ya4[] $VALUES;
    public static final ya4 Default = new ya4("Default", 0);
    public static final ya4 UserInput = new ya4("UserInput", 1);
    public static final ya4 PreventUserInput = new ya4("PreventUserInput", 2);

    private static final /* synthetic */ ya4[] $values() {
        return new ya4[]{Default, UserInput, PreventUserInput};
    }

    static {
        ya4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ya4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ya4 valueOf(String str) {
        return (ya4) Enum.valueOf(ya4.class, str);
    }

    public static ya4[] values() {
        return (ya4[]) $VALUES.clone();
    }
}
