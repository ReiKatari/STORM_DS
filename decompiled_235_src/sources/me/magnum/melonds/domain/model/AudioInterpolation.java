package me.magnum.melonds.domain.model;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class AudioInterpolation {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ AudioInterpolation[] $VALUES;
    private final int interpolationValue;
    public static final AudioInterpolation NONE = new AudioInterpolation("NONE", 0, 0);
    public static final AudioInterpolation LINEAR = new AudioInterpolation("LINEAR", 1, 1);
    public static final AudioInterpolation COSINE = new AudioInterpolation("COSINE", 2, 2);
    public static final AudioInterpolation CUBIC = new AudioInterpolation("CUBIC", 3, 3);

    private static final /* synthetic */ AudioInterpolation[] $values() {
        return new AudioInterpolation[]{NONE, LINEAR, COSINE, CUBIC};
    }

    static {
        AudioInterpolation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private AudioInterpolation(String str, int i, int i2) {
        this.interpolationValue = i2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static AudioInterpolation valueOf(String str) {
        return (AudioInterpolation) Enum.valueOf(AudioInterpolation.class, str);
    }

    public static AudioInterpolation[] values() {
        return (AudioInterpolation[]) $VALUES.clone();
    }

    public final int getInterpolationValue() {
        return this.interpolationValue;
    }
}
