package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lf  reason: default package */
/* loaded from: classes.dex */
public final class lf {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ lf[] $VALUES;
    public static final lf SHOW_ORIGINAL = new lf("SHOW_ORIGINAL", 0);
    public static final lf SHOW_TRANSLATED = new lf("SHOW_TRANSLATED", 1);

    private static final /* synthetic */ lf[] $values() {
        return new lf[]{SHOW_ORIGINAL, SHOW_TRANSLATED};
    }

    static {
        lf[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private lf(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static lf valueOf(String str) {
        return (lf) Enum.valueOf(lf.class, str);
    }

    public static lf[] values() {
        return (lf[]) $VALUES.clone();
    }
}
