package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nx5  reason: default package */
/* loaded from: classes.dex */
public final class nx5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ nx5[] $VALUES;
    public static final nx5 GLOBAL = new nx5("GLOBAL", 0);
    public static final nx5 CUSTOM = new nx5("CUSTOM", 1);

    private static final /* synthetic */ nx5[] $values() {
        return new nx5[]{GLOBAL, CUSTOM};
    }

    static {
        nx5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private nx5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static nx5 valueOf(String str) {
        return (nx5) Enum.valueOf(nx5.class, str);
    }

    public static nx5[] values() {
        return (nx5[]) $VALUES.clone();
    }
}
