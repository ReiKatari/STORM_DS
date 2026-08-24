package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n06  reason: default package */
/* loaded from: classes.dex */
public final class n06 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ n06[] $VALUES;
    public static final n06 GRID = new n06("GRID", 0);
    public static final n06 LIST = new n06("LIST", 1);

    private static final /* synthetic */ n06[] $values() {
        return new n06[]{GRID, LIST};
    }

    static {
        n06[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private n06(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static n06 valueOf(String str) {
        return (n06) Enum.valueOf(n06.class, str);
    }

    public static n06[] values() {
        return (n06[]) $VALUES.clone();
    }
}
