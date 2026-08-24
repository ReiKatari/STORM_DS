package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: av6  reason: default package */
/* loaded from: classes.dex */
public final class av6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ av6[] $VALUES;
    public static final av6 WITHOUT_FEATURE_COMBO = new av6("WITHOUT_FEATURE_COMBO", 0);
    public static final av6 WITH_FEATURE_COMBO = new av6("WITH_FEATURE_COMBO", 1);
    public static final av6 WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT = new av6("WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT", 2);

    private static final /* synthetic */ av6[] $values() {
        return new av6[]{WITHOUT_FEATURE_COMBO, WITH_FEATURE_COMBO, WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT};
    }

    static {
        av6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private av6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static av6 valueOf(String str) {
        return (av6) Enum.valueOf(av6.class, str);
    }

    public static av6[] values() {
        return (av6[]) $VALUES.clone();
    }
}
