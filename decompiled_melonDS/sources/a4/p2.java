package a4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p2 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ p2[] $VALUES;
    public static final p2 ContinueTraversal = new p2("ContinueTraversal", 0);
    public static final p2 SkipSubtreeAndContinueTraversal = new p2("SkipSubtreeAndContinueTraversal", 1);
    public static final p2 CancelTraversal = new p2("CancelTraversal", 2);

    private static final /* synthetic */ p2[] $values() {
        return new p2[]{ContinueTraversal, SkipSubtreeAndContinueTraversal, CancelTraversal};
    }

    static {
        p2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private p2(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static p2 valueOf(String str) {
        return (p2) Enum.valueOf(p2.class, str);
    }

    public static p2[] values() {
        return (p2[]) $VALUES.clone();
    }
}
