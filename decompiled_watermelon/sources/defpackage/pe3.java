package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pe3  reason: default package */
/* loaded from: classes.dex */
public final class pe3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ pe3[] $VALUES;
    private final Float ratio;
    public static final pe3 RATIO_4_3 = new pe3("RATIO_4_3", 0, Float.valueOf(1.3333334f));
    public static final pe3 RATIO_16_9 = new pe3("RATIO_16_9", 1, Float.valueOf(1.7777778f));
    public static final pe3 UNRESTRICTED = new pe3("UNRESTRICTED", 2, null);

    private static final /* synthetic */ pe3[] $values() {
        return new pe3[]{RATIO_4_3, RATIO_16_9, UNRESTRICTED};
    }

    static {
        pe3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private pe3(String str, int i, Float f) {
        this.ratio = f;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static pe3 valueOf(String str) {
        return (pe3) Enum.valueOf(pe3.class, str);
    }

    public static pe3[] values() {
        return (pe3[]) $VALUES.clone();
    }

    public final Float getRatio() {
        return this.ratio;
    }
}
