package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t43  reason: default package */
/* loaded from: classes.dex */
public final class t43 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ t43[] $VALUES;
    public static final t43 Yes = new t43("Yes", 0);
    public static final t43 No = new t43("No", 1);
    public static final t43 NotInitialized = new t43("NotInitialized", 2);

    private static final /* synthetic */ t43[] $values() {
        return new t43[]{Yes, No, NotInitialized};
    }

    static {
        t43[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private t43(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static t43 valueOf(String str) {
        return (t43) Enum.valueOf(t43.class, str);
    }

    public static t43[] values() {
        return (t43[]) $VALUES.clone();
    }
}
