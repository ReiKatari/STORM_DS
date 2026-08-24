package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cv4  reason: default package */
/* loaded from: classes.dex */
public final class cv4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ cv4[] $VALUES;
    public static final cv4 RETRYABLE = new cv4("RETRYABLE", 0);
    public static final cv4 PERMANENT_FAILURE = new cv4("PERMANENT_FAILURE", 1);

    private static final /* synthetic */ cv4[] $values() {
        return new cv4[]{RETRYABLE, PERMANENT_FAILURE};
    }

    static {
        cv4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private cv4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static cv4 valueOf(String str) {
        return (cv4) Enum.valueOf(cv4.class, str);
    }

    public static cv4[] values() {
        return (cv4[]) $VALUES.clone();
    }
}
