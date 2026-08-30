package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tf3  reason: default package */
/* loaded from: classes.dex */
public final class tf3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ tf3[] $VALUES;
    public static final tf3 InMeasureBlock = new tf3("InMeasureBlock", 0);
    public static final tf3 InLayoutBlock = new tf3("InLayoutBlock", 1);
    public static final tf3 NotUsed = new tf3("NotUsed", 2);

    private static final /* synthetic */ tf3[] $values() {
        return new tf3[]{InMeasureBlock, InLayoutBlock, NotUsed};
    }

    static {
        tf3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private tf3(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static tf3 valueOf(String str) {
        return (tf3) Enum.valueOf(tf3.class, str);
    }

    public static tf3[] values() {
        return (tf3[]) $VALUES.clone();
    }
}
