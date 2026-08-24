package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ee6  reason: default package */
/* loaded from: classes.dex */
public final class ee6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ee6[] $VALUES;
    public static final ee6 NEAREST = new ee6("NEAREST", 0);
    public static final ee6 LINEAR = new ee6("LINEAR", 1);

    private static final /* synthetic */ ee6[] $values() {
        return new ee6[]{NEAREST, LINEAR};
    }

    static {
        ee6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ee6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ee6 valueOf(String str) {
        return (ee6) Enum.valueOf(ee6.class, str);
    }

    public static ee6[] values() {
        return (ee6[]) $VALUES.clone();
    }
}
