package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jx5  reason: default package */
/* loaded from: classes.dex */
public final class jx5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ jx5[] $VALUES;
    public static final jx5 NONE = new jx5("NONE", 0);
    public static final jx5 LINEAR = new jx5("LINEAR", 1);

    private static final /* synthetic */ jx5[] $values() {
        return new jx5[]{NONE, LINEAR};
    }

    static {
        jx5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private jx5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static jx5 valueOf(String str) {
        return (jx5) Enum.valueOf(jx5.class, str);
    }

    public static jx5[] values() {
        return (jx5[]) $VALUES.clone();
    }
}
