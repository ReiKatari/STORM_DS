package a4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 InMeasureBlock = new k0("InMeasureBlock", 0);
    public static final k0 InLayoutBlock = new k0("InLayoutBlock", 1);
    public static final k0 NotUsed = new k0("NotUsed", 2);

    private static final /* synthetic */ k0[] $values() {
        return new k0[]{InMeasureBlock, InLayoutBlock, NotUsed};
    }

    static {
        k0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private k0(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}
