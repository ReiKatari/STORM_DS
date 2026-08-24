package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tb7  reason: default package */
/* loaded from: classes.dex */
public final class tb7 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ tb7[] $VALUES;
    public static final tb7 ContinueTraversal = new tb7("ContinueTraversal", 0);
    public static final tb7 SkipSubtreeAndContinueTraversal = new tb7("SkipSubtreeAndContinueTraversal", 1);
    public static final tb7 CancelTraversal = new tb7("CancelTraversal", 2);

    private static final /* synthetic */ tb7[] $values() {
        return new tb7[]{ContinueTraversal, SkipSubtreeAndContinueTraversal, CancelTraversal};
    }

    static {
        tb7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private tb7(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static tb7 valueOf(String str) {
        return (tb7) Enum.valueOf(tb7.class, str);
    }

    public static tb7[] values() {
        return (tb7[]) $VALUES.clone();
    }
}
