package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kk3  reason: default package */
/* loaded from: classes.dex */
public final class kk3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ kk3[] $VALUES;
    public static final kk3 Ltr = new kk3("Ltr", 0);
    public static final kk3 Rtl = new kk3("Rtl", 1);

    private static final /* synthetic */ kk3[] $values() {
        return new kk3[]{Ltr, Rtl};
    }

    static {
        kk3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private kk3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static kk3 valueOf(String str) {
        return (kk3) Enum.valueOf(kk3.class, str);
    }

    public static kk3[] values() {
        return (kk3[]) $VALUES.clone();
    }
}
