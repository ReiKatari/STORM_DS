package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w10  reason: default package */
/* loaded from: classes.dex */
public final class w10 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ w10[] $VALUES;
    public static final w10 EXPONENTIAL = new w10("EXPONENTIAL", 0);
    public static final w10 LINEAR = new w10("LINEAR", 1);

    private static final /* synthetic */ w10[] $values() {
        return new w10[]{EXPONENTIAL, LINEAR};
    }

    static {
        w10[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private w10(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static w10 valueOf(String str) {
        return (w10) Enum.valueOf(w10.class, str);
    }

    public static w10[] values() {
        return (w10[]) $VALUES.clone();
    }
}
