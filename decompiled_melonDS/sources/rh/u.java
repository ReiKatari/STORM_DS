package rh;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    private final Float ratio;
    public static final u RATIO_4_3 = new u("RATIO_4_3", 0, Float.valueOf(1.3333334f));
    public static final u RATIO_16_9 = new u("RATIO_16_9", 1, Float.valueOf(1.7777778f));
    public static final u UNRESTRICTED = new u("UNRESTRICTED", 2, null);

    private static final /* synthetic */ u[] $values() {
        return new u[]{RATIO_4_3, RATIO_16_9, UNRESTRICTED};
    }

    static {
        u[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private u(String str, int i2, Float f8) {
        this.ratio = f8;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }

    public final Float getRatio() {
        return this.ratio;
    }
}
