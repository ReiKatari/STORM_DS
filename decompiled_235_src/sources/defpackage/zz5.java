package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zz5  reason: default package */
/* loaded from: classes.dex */
public final class zz5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ zz5[] $VALUES;
    public static final zz5 ARM9 = new zz5("ARM9", 0);
    public static final zz5 ARM7 = new zz5("ARM7", 1);
    public static final zz5 BANNER = new zz5("BANNER", 2);

    private static final /* synthetic */ zz5[] $values() {
        return new zz5[]{ARM9, ARM7, BANNER};
    }

    static {
        zz5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private zz5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static zz5 valueOf(String str) {
        return (zz5) Enum.valueOf(zz5.class, str);
    }

    public static zz5[] values() {
        return (zz5[]) $VALUES.clone();
    }
}
