package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ya7  reason: default package */
/* loaded from: classes.dex */
public final class ya7 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ya7[] $VALUES;
    public static final xa7 Companion;
    private final String preferenceValue;
    public static final ya7 SMART_BACKGROUND_MATCH = new ya7("SMART_BACKGROUND_MATCH", 0, "smart_background_match");
    public static final ya7 SEMI_TRANSPARENT = new ya7("SEMI_TRANSPARENT", 1, "semi_transparent");
    public static final ya7 TRANSLUCENT_BUBBLE = new ya7("TRANSLUCENT_BUBBLE", 2, "translucent_bubble");
    public static final ya7 OUTLINE_ONLY = new ya7("OUTLINE_ONLY", 3, "outline_only");

    private static final /* synthetic */ ya7[] $values() {
        return new ya7[]{SMART_BACKGROUND_MATCH, SEMI_TRANSPARENT, TRANSLUCENT_BUBBLE, OUTLINE_ONLY};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, xa7] */
    static {
        ya7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private ya7(String str, int i, String str2) {
        this.preferenceValue = str2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ya7 valueOf(String str) {
        return (ya7) Enum.valueOf(ya7.class, str);
    }

    public static ya7[] values() {
        return (ya7[]) $VALUES.clone();
    }

    public final String getPreferenceValue() {
        return this.preferenceValue;
    }
}
