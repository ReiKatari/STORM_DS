package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kl3  reason: default package */
/* loaded from: classes.dex */
public final class kl3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ kl3[] $VALUES;
    private final Float ratio;
    public static final kl3 RATIO_4_3 = new kl3("RATIO_4_3", 0, Float.valueOf(1.3333334f));
    public static final kl3 RATIO_16_9 = new kl3("RATIO_16_9", 1, Float.valueOf(1.7777778f));
    public static final kl3 UNRESTRICTED = new kl3("UNRESTRICTED", 2, null);

    private static final /* synthetic */ kl3[] $values() {
        return new kl3[]{RATIO_4_3, RATIO_16_9, UNRESTRICTED};
    }

    static {
        kl3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private kl3(String str, int i, Float f) {
        this.ratio = f;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static kl3 valueOf(String str) {
        return (kl3) Enum.valueOf(kl3.class, str);
    }

    public static kl3[] values() {
        return (kl3[]) $VALUES.clone();
    }

    public final Float getRatio() {
        return this.ratio;
    }
}
