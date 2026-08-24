package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zq0  reason: default package */
/* loaded from: classes.dex */
public final class zq0 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ zq0[] $VALUES;
    public static final zq0 NONE = new zq0("NONE", 0);
    public static final zq0 ALL_JSON_OBJECTS = new zq0("ALL_JSON_OBJECTS", 1);
    public static final zq0 POLYMORPHIC = new zq0("POLYMORPHIC", 2);

    private static final /* synthetic */ zq0[] $values() {
        return new zq0[]{NONE, ALL_JSON_OBJECTS, POLYMORPHIC};
    }

    static {
        zq0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private zq0(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static zq0 valueOf(String str) {
        return (zq0) Enum.valueOf(zq0.class, str);
    }

    public static zq0[] values() {
        return (zq0[]) $VALUES.clone();
    }
}
