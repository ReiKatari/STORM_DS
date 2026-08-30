package q4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z StartInput = new z("StartInput", 0);
    public static final z StopInput = new z("StopInput", 1);
    public static final z ShowKeyboard = new z("ShowKeyboard", 2);
    public static final z HideKeyboard = new z("HideKeyboard", 3);

    private static final /* synthetic */ z[] $values() {
        return new z[]{StartInput, StopInput, ShowKeyboard, HideKeyboard};
    }

    static {
        z[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private z(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
