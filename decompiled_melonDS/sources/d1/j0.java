package d1;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 Default = new j0("Default", 0);
    public static final j0 UserInput = new j0("UserInput", 1);
    public static final j0 PreventUserInput = new j0("PreventUserInput", 2);

    private static final /* synthetic */ j0[] $values() {
        return new j0[]{Default, UserInput, PreventUserInput};
    }

    static {
        j0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private j0(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}
