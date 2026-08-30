package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zv4  reason: default package */
/* loaded from: classes.dex */
public final class zv4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ zv4[] $VALUES;
    public static final zv4 ACCEPTABLE = new zv4("ACCEPTABLE", 0);
    public static final zv4 OPTIONAL = new zv4("OPTIONAL", 1);
    public static final zv4 COLLECTION = new zv4("COLLECTION", 2);
    public static final zv4 LIST_ELEMENT = new zv4("LIST_ELEMENT", 3);
    public static final zv4 NOT_NULL = new zv4("NOT_NULL", 4);

    private static final /* synthetic */ zv4[] $values() {
        return new zv4[]{ACCEPTABLE, OPTIONAL, COLLECTION, LIST_ELEMENT, NOT_NULL};
    }

    static {
        zv4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private zv4(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static zv4 valueOf(String str) {
        return (zv4) Enum.valueOf(zv4.class, str);
    }

    public static zv4[] values() {
        return (zv4[]) $VALUES.clone();
    }
}
