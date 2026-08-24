package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: my6  reason: default package */
/* loaded from: classes.dex */
public final class my6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ my6[] $VALUES;
    public static final my6 Tabs = new my6("Tabs", 0);
    public static final my6 Divider = new my6("Divider", 1);
    public static final my6 Indicator = new my6("Indicator", 2);

    private static final /* synthetic */ my6[] $values() {
        return new my6[]{Tabs, Divider, Indicator};
    }

    static {
        my6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private my6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static my6 valueOf(String str) {
        return (my6) Enum.valueOf(my6.class, str);
    }

    public static my6[] values() {
        return (my6[]) $VALUES.clone();
    }
}
