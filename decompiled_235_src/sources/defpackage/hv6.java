package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hv6  reason: default package */
/* loaded from: classes.dex */
public final class hv6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ hv6[] $VALUES;
    public static final hv6 PRIV = new hv6("PRIV", 0);
    public static final hv6 YUV = new hv6("YUV", 1);
    public static final hv6 JPEG = new hv6("JPEG", 2);
    public static final hv6 JPEG_R = new hv6("JPEG_R", 3);
    public static final hv6 RAW = new hv6("RAW", 4);

    private static final /* synthetic */ hv6[] $values() {
        return new hv6[]{PRIV, YUV, JPEG, JPEG_R, RAW};
    }

    static {
        hv6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private hv6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static hv6 valueOf(String str) {
        return (hv6) Enum.valueOf(hv6.class, str);
    }

    public static hv6[] values() {
        return (hv6[]) $VALUES.clone();
    }
}
