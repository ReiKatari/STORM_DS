package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: be6  reason: default package */
/* loaded from: classes.dex */
public final class be6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ be6[] $VALUES;
    public static final be6 OPEN_GL = new be6("OPEN_GL", 0);
    public static final be6 VULKAN = new be6("VULKAN", 1);

    private static final /* synthetic */ be6[] $values() {
        return new be6[]{OPEN_GL, VULKAN};
    }

    static {
        be6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private be6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static be6 valueOf(String str) {
        return (be6) Enum.valueOf(be6.class, str);
    }

    public static be6[] values() {
        return (be6[]) $VALUES.clone();
    }
}
