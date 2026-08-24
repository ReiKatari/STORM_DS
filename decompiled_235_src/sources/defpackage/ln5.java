package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ln5  reason: default package */
/* loaded from: classes.dex */
public final class ln5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ln5[] $VALUES;
    public static final kn5 Companion;
    private final String preferenceValue;
    public static final ln5 BUILT_IN = new ln5("BUILT_IN", 0, "built_in");
    public static final ln5 RA_OFFLINE_PROXY = new ln5("RA_OFFLINE_PROXY", 1, "ra_offline_proxy");

    private static final /* synthetic */ ln5[] $values() {
        return new ln5[]{BUILT_IN, RA_OFFLINE_PROXY};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kn5, java.lang.Object] */
    static {
        ln5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private ln5(String str, int i, String str2) {
        this.preferenceValue = str2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ln5 valueOf(String str) {
        return (ln5) Enum.valueOf(ln5.class, str);
    }

    public static ln5[] values() {
        return (ln5[]) $VALUES.clone();
    }

    public final String getPreferenceValue() {
        return this.preferenceValue;
    }
}
