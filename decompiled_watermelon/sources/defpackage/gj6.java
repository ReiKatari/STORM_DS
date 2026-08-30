package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gj6  reason: default package */
/* loaded from: classes.dex */
public final class gj6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ gj6[] $VALUES;
    public static final gj6 WITHOUT_FEATURE_COMBO = new gj6("WITHOUT_FEATURE_COMBO", 0);
    public static final gj6 WITH_FEATURE_COMBO = new gj6("WITH_FEATURE_COMBO", 1);
    public static final gj6 WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT = new gj6("WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT", 2);

    private static final /* synthetic */ gj6[] $values() {
        return new gj6[]{WITHOUT_FEATURE_COMBO, WITH_FEATURE_COMBO, WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT};
    }

    static {
        gj6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private gj6(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static gj6 valueOf(String str) {
        return (gj6) Enum.valueOf(gj6.class, str);
    }

    public static gj6[] values() {
        return (gj6[]) $VALUES.clone();
    }
}
