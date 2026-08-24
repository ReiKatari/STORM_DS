package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lo4  reason: default package */
/* loaded from: classes.dex */
public final class lo4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ lo4[] $VALUES;
    public static final lo4 Vertical = new lo4("Vertical", 0);
    public static final lo4 Horizontal = new lo4("Horizontal", 1);

    private static final /* synthetic */ lo4[] $values() {
        return new lo4[]{Vertical, Horizontal};
    }

    static {
        lo4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private lo4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static lo4 valueOf(String str) {
        return (lo4) Enum.valueOf(lo4.class, str);
    }

    public static lo4[] values() {
        return (lo4[]) $VALUES.clone();
    }
}
