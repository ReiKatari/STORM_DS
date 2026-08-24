package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mb7  reason: default package */
/* loaded from: classes.dex */
public final class mb7 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ mb7[] $VALUES;
    public static final lb7 Companion;
    private final String preferenceValue;
    public static final mb7 ON_DEMAND = new mb7("ON_DEMAND", 0, "on_demand");
    public static final mb7 AUTO_SCREEN_CHANGE = new mb7("AUTO_SCREEN_CHANGE", 1, "auto_screen_change");

    private static final /* synthetic */ mb7[] $values() {
        return new mb7[]{ON_DEMAND, AUTO_SCREEN_CHANGE};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [lb7, java.lang.Object] */
    static {
        mb7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private mb7(String str, int i, String str2) {
        this.preferenceValue = str2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static mb7 valueOf(String str) {
        return (mb7) Enum.valueOf(mb7.class, str);
    }

    public static mb7[] values() {
        return (mb7[]) $VALUES.clone();
    }

    public final String getPreferenceValue() {
        return this.preferenceValue;
    }
}
