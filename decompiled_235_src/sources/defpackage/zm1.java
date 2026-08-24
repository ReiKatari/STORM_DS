package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zm1  reason: default package */
/* loaded from: classes.dex */
public final class zm1 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ zm1[] $VALUES;
    public static final zm1 Yes = new zm1("Yes", 0);
    public static final zm1 No = new zm1("No", 1);
    public static final zm1 NotInitialized = new zm1("NotInitialized", 2);

    private static final /* synthetic */ zm1[] $values() {
        return new zm1[]{Yes, No, NotInitialized};
    }

    static {
        zm1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private zm1(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static zm1 valueOf(String str) {
        return (zm1) Enum.valueOf(zm1.class, str);
    }

    public static zm1[] values() {
        return (zm1[]) $VALUES.clone();
    }
}
