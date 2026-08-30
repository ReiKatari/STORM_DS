package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: po0  reason: default package */
/* loaded from: classes.dex */
public final class po0 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ po0[] $VALUES;
    public static final po0 NONE = new po0("NONE", 0);
    public static final po0 ALL_JSON_OBJECTS = new po0("ALL_JSON_OBJECTS", 1);
    public static final po0 POLYMORPHIC = new po0("POLYMORPHIC", 2);

    private static final /* synthetic */ po0[] $values() {
        return new po0[]{NONE, ALL_JSON_OBJECTS, POLYMORPHIC};
    }

    static {
        po0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private po0(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static po0 valueOf(String str) {
        return (po0) Enum.valueOf(po0.class, str);
    }

    public static po0[] values() {
        return (po0[]) $VALUES.clone();
    }
}
