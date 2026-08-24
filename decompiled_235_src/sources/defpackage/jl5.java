package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jl5  reason: default package */
/* loaded from: classes.dex */
public final class jl5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ jl5[] $VALUES;
    public static final jl5 Ltr = new jl5("Ltr", 0);
    public static final jl5 Rtl = new jl5("Rtl", 1);

    private static final /* synthetic */ jl5[] $values() {
        return new jl5[]{Ltr, Rtl};
    }

    static {
        jl5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private jl5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static jl5 valueOf(String str) {
        return (jl5) Enum.valueOf(jl5.class, str);
    }

    public static jl5[] values() {
        return (jl5[]) $VALUES.clone();
    }
}
