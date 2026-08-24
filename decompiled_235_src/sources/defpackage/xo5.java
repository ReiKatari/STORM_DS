package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xo5  reason: default package */
/* loaded from: classes.dex */
public final class xo5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ xo5[] $VALUES;
    public static final xo5 NoNetwork = new xo5("NoNetwork", 0);
    public static final xo5 NotEnoughSpace = new xo5("NotEnoughSpace", 1);
    public static final xo5 HttpError = new xo5("HttpError", 2);
    public static final xo5 Truncated = new xo5("Truncated", 3);
    public static final xo5 CorruptArchive = new xo5("CorruptArchive", 4);

    private static final /* synthetic */ xo5[] $values() {
        return new xo5[]{NoNetwork, NotEnoughSpace, HttpError, Truncated, CorruptArchive};
    }

    static {
        xo5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private xo5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static xo5 valueOf(String str) {
        return (xo5) Enum.valueOf(xo5.class, str);
    }

    public static xo5[] values() {
        return (xo5[]) $VALUES.clone();
    }
}
