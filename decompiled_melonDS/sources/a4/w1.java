package a4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w1 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ w1[] $VALUES;
    public static final w1 Width = new w1("Width", 0);
    public static final w1 Height = new w1("Height", 1);

    private static final /* synthetic */ w1[] $values() {
        return new w1[]{Width, Height};
    }

    static {
        w1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private w1(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static w1 valueOf(String str) {
        return (w1) Enum.valueOf(w1.class, str);
    }

    public static w1[] values() {
        return (w1[]) $VALUES.clone();
    }
}
