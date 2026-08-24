package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hv2  reason: default package */
/* loaded from: classes.dex */
public final class hv2 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ hv2[] $VALUES;
    public static final hv2 None = new hv2("None", 0);
    public static final hv2 Selection = new hv2("Selection", 1);
    public static final hv2 Cursor = new hv2("Cursor", 2);

    private static final /* synthetic */ hv2[] $values() {
        return new hv2[]{None, Selection, Cursor};
    }

    static {
        hv2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private hv2(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static hv2 valueOf(String str) {
        return (hv2) Enum.valueOf(hv2.class, str);
    }

    public static hv2[] values() {
        return (hv2[]) $VALUES.clone();
    }
}
