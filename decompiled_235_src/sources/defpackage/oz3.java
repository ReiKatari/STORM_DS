package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oz3  reason: default package */
/* loaded from: classes.dex */
public final class oz3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ oz3[] $VALUES;
    public static final oz3 IsPlacedInLookahead = new oz3("IsPlacedInLookahead", 0);
    public static final oz3 IsPlacedInApproach = new oz3("IsPlacedInApproach", 1);
    public static final oz3 IsNotPlaced = new oz3("IsNotPlaced", 2);

    private static final /* synthetic */ oz3[] $values() {
        return new oz3[]{IsPlacedInLookahead, IsPlacedInApproach, IsNotPlaced};
    }

    static {
        oz3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private oz3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static oz3 valueOf(String str) {
        return (oz3) Enum.valueOf(oz3.class, str);
    }

    public static oz3[] values() {
        return (oz3[]) $VALUES.clone();
    }
}
