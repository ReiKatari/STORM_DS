package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xr3  reason: default package */
/* loaded from: classes.dex */
public final class xr3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ xr3[] $VALUES;
    public static final xr3 SYNCHRONIZED = new xr3("SYNCHRONIZED", 0);
    public static final xr3 PUBLICATION = new xr3("PUBLICATION", 1);
    public static final xr3 NONE = new xr3("NONE", 2);

    private static final /* synthetic */ xr3[] $values() {
        return new xr3[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    static {
        xr3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private xr3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static xr3 valueOf(String str) {
        return (xr3) Enum.valueOf(xr3.class, str);
    }

    public static xr3[] values() {
        return (xr3[]) $VALUES.clone();
    }
}
