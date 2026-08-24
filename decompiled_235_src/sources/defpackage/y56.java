package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y56  reason: default package */
/* loaded from: classes.dex */
public final class y56 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ y56[] $VALUES;
    public static final y56 FILL = new y56("FILL", 0);
    public static final y56 FIT = new y56("FIT", 1);

    private static final /* synthetic */ y56[] $values() {
        return new y56[]{FILL, FIT};
    }

    static {
        y56[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private y56(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static y56 valueOf(String str) {
        return (y56) Enum.valueOf(y56.class, str);
    }

    public static y56[] values() {
        return (y56[]) $VALUES.clone();
    }
}
