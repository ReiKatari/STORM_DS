package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ax5  reason: default package */
/* loaded from: classes.dex */
public final class ax5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ax5[] $VALUES;
    public static final ax5 None = new ax5("None", 0);
    public static final ax5 GbaRom = new ax5("GbaRom", 1);
    public static final ax5 RumblePak = new ax5("RumblePak", 2);
    public static final ax5 MemoryExpansion = new ax5("MemoryExpansion", 3);
    public static final ax5 AnalogInput = new ax5("AnalogInput", 4);

    private static final /* synthetic */ ax5[] $values() {
        return new ax5[]{None, GbaRom, RumblePak, MemoryExpansion, AnalogInput};
    }

    static {
        ax5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ax5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ax5 valueOf(String str) {
        return (ax5) Enum.valueOf(ax5.class, str);
    }

    public static ax5[] values() {
        return (ax5[]) $VALUES.clone();
    }
}
