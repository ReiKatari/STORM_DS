package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wl7  reason: default package */
/* loaded from: classes.dex */
public final class wl7 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ wl7[] $VALUES;
    public static final wl7 ALPHA = new wl7("ALPHA", 0);
    public static final wl7 BETA = new wl7("BETA", 1);
    public static final wl7 RC = new wl7("RC", 2);
    public static final wl7 FINAL = new wl7("FINAL", 3);
    public static final wl7 NIGHTLY = new wl7("NIGHTLY", 4);

    private static final /* synthetic */ wl7[] $values() {
        return new wl7[]{ALPHA, BETA, RC, FINAL, NIGHTLY};
    }

    static {
        wl7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private wl7(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static wl7 valueOf(String str) {
        return (wl7) Enum.valueOf(wl7.class, str);
    }

    public static wl7[] values() {
        return (wl7[]) $VALUES.clone();
    }
}
