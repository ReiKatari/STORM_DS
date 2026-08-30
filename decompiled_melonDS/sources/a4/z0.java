package a4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ z0[] $VALUES;
    public static final z0 IsPlacedInLookahead = new z0("IsPlacedInLookahead", 0);
    public static final z0 IsPlacedInApproach = new z0("IsPlacedInApproach", 1);
    public static final z0 IsNotPlaced = new z0("IsNotPlaced", 2);

    private static final /* synthetic */ z0[] $values() {
        return new z0[]{IsPlacedInLookahead, IsPlacedInApproach, IsNotPlaced};
    }

    static {
        z0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private z0(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }
}
