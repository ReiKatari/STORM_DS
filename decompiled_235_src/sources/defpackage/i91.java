package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i91  reason: default package */
/* loaded from: classes.dex */
public final class i91 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ i91[] $VALUES;
    public static final i91 NONE = new i91("NONE", 0);
    public static final i91 MAIN = new i91("MAIN", 1);
    public static final i91 IMPORT = new i91("IMPORT", 2);
    public static final i91 EXPORT = new i91("EXPORT", 3);

    private static final /* synthetic */ i91[] $values() {
        return new i91[]{NONE, MAIN, IMPORT, EXPORT};
    }

    static {
        i91[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private i91(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static i91 valueOf(String str) {
        return (i91) Enum.valueOf(i91.class, str);
    }

    public static i91[] values() {
        return (i91[]) $VALUES.clone();
    }
}
