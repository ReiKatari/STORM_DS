package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qm3  reason: default package */
/* loaded from: classes.dex */
public final class qm3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ qm3[] $VALUES;
    public static final qm3 InMeasureBlock = new qm3("InMeasureBlock", 0);
    public static final qm3 InLayoutBlock = new qm3("InLayoutBlock", 1);
    public static final qm3 NotUsed = new qm3("NotUsed", 2);

    private static final /* synthetic */ qm3[] $values() {
        return new qm3[]{InMeasureBlock, InLayoutBlock, NotUsed};
    }

    static {
        qm3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private qm3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static qm3 valueOf(String str) {
        return (qm3) Enum.valueOf(qm3.class, str);
    }

    public static qm3[] values() {
        return (qm3[]) $VALUES.clone();
    }
}
