package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ck5  reason: default package */
/* loaded from: classes.dex */
public final class ck5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ck5[] $VALUES;
    public static final ck5 Restart = new ck5("Restart", 0);
    public static final ck5 Reverse = new ck5("Reverse", 1);

    private static final /* synthetic */ ck5[] $values() {
        return new ck5[]{Restart, Reverse};
    }

    static {
        ck5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ck5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ck5 valueOf(String str) {
        return (ck5) Enum.valueOf(ck5.class, str);
    }

    public static ck5[] values() {
        return (ck5[]) $VALUES.clone();
    }
}
