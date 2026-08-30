package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cm1  reason: default package */
/* loaded from: classes.dex */
public final class cm1 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ cm1[] $VALUES;
    public static final cm1 OFF = new cm1("OFF", 0);
    public static final cm1 INTERNAL_TOP_EXTERNAL_BOTTOM = new cm1("INTERNAL_TOP_EXTERNAL_BOTTOM", 1);
    public static final cm1 INTERNAL_BOTTOM_EXTERNAL_TOP = new cm1("INTERNAL_BOTTOM_EXTERNAL_TOP", 2);

    private static final /* synthetic */ cm1[] $values() {
        return new cm1[]{OFF, INTERNAL_TOP_EXTERNAL_BOTTOM, INTERNAL_BOTTOM_EXTERNAL_TOP};
    }

    static {
        cm1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private cm1(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static cm1 valueOf(String str) {
        return (cm1) Enum.valueOf(cm1.class, str);
    }

    public static cm1[] values() {
        return (cm1[]) $VALUES.clone();
    }
}
