package f1;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f1 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ f1[] $VALUES;
    public static final f1 Default = new f1("Default", 0);
    public static final f1 UserInput = new f1("UserInput", 1);
    public static final f1 PreventUserInput = new f1("PreventUserInput", 2);

    private static final /* synthetic */ f1[] $values() {
        return new f1[]{Default, UserInput, PreventUserInput};
    }

    static {
        f1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private f1(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) $VALUES.clone();
    }
}
