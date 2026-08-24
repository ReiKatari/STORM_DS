package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hn3  reason: default package */
/* loaded from: classes.dex */
public final class hn3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ hn3[] $VALUES;
    public static final hn3 Horizontal = new hn3("Horizontal", 0);
    public static final hn3 Vertical = new hn3("Vertical", 1);

    private static final /* synthetic */ hn3[] $values() {
        return new hn3[]{Horizontal, Vertical};
    }

    static {
        hn3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private hn3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static hn3 valueOf(String str) {
        return (hn3) Enum.valueOf(hn3.class, str);
    }

    public static hn3[] values() {
        return (hn3[]) $VALUES.clone();
    }
}
