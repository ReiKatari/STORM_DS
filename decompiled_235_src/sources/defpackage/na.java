package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: na  reason: default package */
/* loaded from: classes.dex */
public final class na {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ na[] $VALUES;
    private final String displayName;
    public static final na ADRENO_8XX = new na("ADRENO_8XX", 0, "Adreno 8xx (Snapdragon 8 Elite / Gen 4)");
    public static final na ADRENO_7XX = new na("ADRENO_7XX", 1, "Adreno 7xx (Snapdragon 8 Gen 1/2/3, 7+ Gen 2)");
    public static final na ADRENO_6XX = new na("ADRENO_6XX", 2, "Adreno 6xx (Snapdragon 865/870/888, 778G)");
    public static final na ADRENO_OTHER = new na("ADRENO_OTHER", 3, "Qualcomm Adreno (Legacy/Other)");
    public static final na NON_ADRENO = new na("NON_ADRENO", 4, "Не-Adreno GPU");

    private static final /* synthetic */ na[] $values() {
        return new na[]{ADRENO_8XX, ADRENO_7XX, ADRENO_6XX, ADRENO_OTHER, NON_ADRENO};
    }

    static {
        na[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private na(String str, int i, String str2) {
        this.displayName = str2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static na valueOf(String str) {
        return (na) Enum.valueOf(na.class, str);
    }

    public static na[] values() {
        return (na[]) $VALUES.clone();
    }

    public final String getDisplayName() {
        return this.displayName;
    }
}
