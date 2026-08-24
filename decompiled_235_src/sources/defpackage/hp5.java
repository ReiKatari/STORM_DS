package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hp5  reason: default package */
/* loaded from: classes.dex */
public final class hp5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ hp5[] $VALUES;
    public static final hp5 VULKAN_IR = new hp5("VULKAN_IR", 0);
    public static final hp5 NATIVE = new hp5("NATIVE", 1);

    private static final /* synthetic */ hp5[] $values() {
        return new hp5[]{VULKAN_IR, NATIVE};
    }

    static {
        hp5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private hp5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static hp5 valueOf(String str) {
        return (hp5) Enum.valueOf(hp5.class, str);
    }

    public static hp5[] values() {
        return (hp5[]) $VALUES.clone();
    }
}
