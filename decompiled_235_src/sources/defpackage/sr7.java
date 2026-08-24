package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sr7  reason: default package */
/* loaded from: classes.dex */
public final class sr7 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ sr7[] $VALUES;
    public static final sr7 SYSTEM = new sr7("SYSTEM", 0);
    public static final sr7 CUSTOM = new sr7("CUSTOM", 1);

    private static final /* synthetic */ sr7[] $values() {
        return new sr7[]{SYSTEM, CUSTOM};
    }

    static {
        sr7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private sr7(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static sr7 valueOf(String str) {
        return (sr7) Enum.valueOf(sr7.class, str);
    }

    public static sr7[] values() {
        return (sr7[]) $VALUES.clone();
    }
}
