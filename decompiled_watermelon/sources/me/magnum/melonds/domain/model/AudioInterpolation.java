package me.magnum.melonds.domain.model;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class AudioInterpolation {
    private static final /* synthetic */ e12 $ENTRIES;
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
        $ENTRIES = l.C($values);
    }

    private AudioInterpolation(String str, int i, int i2) {
        this.interpolationValue = i2;
    }

    public static e12 getEntries() {
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
