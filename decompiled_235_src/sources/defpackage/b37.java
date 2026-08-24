package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b37  reason: default package */
/* loaded from: classes.dex */
public final class b37 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ b37[] $VALUES;
    public static final b37 Filled = new b37("Filled", 0);
    public static final b37 Outlined = new b37("Outlined", 1);

    private static final /* synthetic */ b37[] $values() {
        return new b37[]{Filled, Outlined};
    }

    static {
        b37[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private b37(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static b37 valueOf(String str) {
        return (b37) Enum.valueOf(b37.class, str);
    }

    public static b37[] values() {
        return (b37[]) $VALUES.clone();
    }
}
