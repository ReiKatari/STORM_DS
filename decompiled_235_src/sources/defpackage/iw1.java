package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iw1  reason: default package */
/* loaded from: classes.dex */
public final class iw1 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ iw1[] $VALUES;
    public static final iw1 GBAModeNotSupported = new iw1("GBAModeNotSupported", 0);
    public static final iw1 BadExceptionRegion = new iw1("BadExceptionRegion", 1);
    public static final iw1 PowerOff = new iw1("PowerOff", 2);

    private static final /* synthetic */ iw1[] $values() {
        return new iw1[]{GBAModeNotSupported, BadExceptionRegion, PowerOff};
    }

    static {
        iw1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private iw1(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static iw1 valueOf(String str) {
        return (iw1) Enum.valueOf(iw1.class, str);
    }

    public static iw1[] values() {
        return (iw1[]) $VALUES.clone();
    }
}
