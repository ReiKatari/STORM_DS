package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y72  reason: default package */
/* loaded from: classes.dex */
public final class y72 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ y72[] $VALUES;
    public static final y72 REPLACE = new y72("REPLACE", 0);
    public static final y72 KEEP = new y72("KEEP", 1);
    public static final y72 APPEND = new y72("APPEND", 2);
    public static final y72 APPEND_OR_REPLACE = new y72("APPEND_OR_REPLACE", 3);

    private static final /* synthetic */ y72[] $values() {
        return new y72[]{REPLACE, KEEP, APPEND, APPEND_OR_REPLACE};
    }

    static {
        y72[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private y72(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static y72 valueOf(String str) {
        return (y72) Enum.valueOf(y72.class, str);
    }

    public static y72[] values() {
        return (y72[]) $VALUES.clone();
    }
}
