package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dk3  reason: default package */
/* loaded from: classes.dex */
public final class dk3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ dk3[] $VALUES;
    public static final dk3 DEFAULT = new dk3("DEFAULT", 0);
    public static final dk3 CUSTOM = new dk3("CUSTOM", 1);

    private static final /* synthetic */ dk3[] $values() {
        return new dk3[]{DEFAULT, CUSTOM};
    }

    static {
        dk3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private dk3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static dk3 valueOf(String str) {
        return (dk3) Enum.valueOf(dk3.class, str);
    }

    public static dk3[] values() {
        return (dk3[]) $VALUES.clone();
    }
}
