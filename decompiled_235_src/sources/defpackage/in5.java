package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: in5  reason: default package */
/* loaded from: classes.dex */
public final class in5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ in5[] $VALUES;
    public static final in5 FETCHING_LATEST_DATA = new in5("FETCHING_LATEST_DATA", 0);

    private static final /* synthetic */ in5[] $values() {
        return new in5[]{FETCHING_LATEST_DATA};
    }

    static {
        in5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private in5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static in5 valueOf(String str) {
        return (in5) Enum.valueOf(in5.class, str);
    }

    public static in5[] values() {
        return (in5[]) $VALUES.clone();
    }
}
