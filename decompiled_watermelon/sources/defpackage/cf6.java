package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cf6  reason: default package */
/* loaded from: classes.dex */
public final class cf6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ cf6[] $VALUES;
    public static final cf6 Unknown = new cf6("Unknown", 0);
    public static final cf6 Fixed = new cf6("Fixed", 1);
    public static final cf6 NotApplicable = new cf6("NotApplicable", 2);
    public static final cf6 NotFixed = new cf6("NotFixed", 3);

    private static final /* synthetic */ cf6[] $values() {
        return new cf6[]{Unknown, Fixed, NotApplicable, NotFixed};
    }

    static {
        cf6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private cf6(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static cf6 valueOf(String str) {
        return (cf6) Enum.valueOf(cf6.class, str);
    }

    public static cf6[] values() {
        return (cf6[]) $VALUES.clone();
    }
}
