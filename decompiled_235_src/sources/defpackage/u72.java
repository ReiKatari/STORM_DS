package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u72  reason: default package */
/* loaded from: classes.dex */
public final class u72 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ u72[] $VALUES;
    public static final u72 IGNORE = new u72("IGNORE", 0);
    public static final u72 RESPECT_PERFORMANCE = new u72("RESPECT_PERFORMANCE", 1);
    public static final u72 RESPECT_ALL = new u72("RESPECT_ALL", 2);

    private static final /* synthetic */ u72[] $values() {
        return new u72[]{IGNORE, RESPECT_PERFORMANCE, RESPECT_ALL};
    }

    static {
        u72[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private u72(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static u72 valueOf(String str) {
        return (u72) Enum.valueOf(u72.class, str);
    }

    public static u72[] values() {
        return (u72[]) $VALUES.clone();
    }
}
