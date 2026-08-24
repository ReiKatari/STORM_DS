package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n3  reason: default package */
/* loaded from: classes.dex */
public final class n3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ n3[] $VALUES;
    public static final n3 SUCCESS = new n3("SUCCESS", 0);
    public static final n3 FAILURE = new n3("FAILURE", 1);

    private static final /* synthetic */ n3[] $values() {
        return new n3[]{SUCCESS, FAILURE};
    }

    static {
        n3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private n3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static n3 valueOf(String str) {
        return (n3) Enum.valueOf(n3.class, str);
    }

    public static n3[] values() {
        return (n3[]) $VALUES.clone();
    }
}
