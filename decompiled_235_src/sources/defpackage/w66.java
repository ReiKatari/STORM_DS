package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w66  reason: default package */
/* loaded from: classes.dex */
public final class w66 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ w66[] $VALUES;
    public static final w66 SEAMLESS = new w66("SEAMLESS", 0);
    public static final w66 GAP = new w66("GAP", 1);

    private static final /* synthetic */ w66[] $values() {
        return new w66[]{SEAMLESS, GAP};
    }

    static {
        w66[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private w66(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static w66 valueOf(String str) {
        return (w66) Enum.valueOf(w66.class, str);
    }

    public static w66[] values() {
        return (w66[]) $VALUES.clone();
    }
}
