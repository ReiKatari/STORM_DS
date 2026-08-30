package me.magnum.melonds.domain.model;

import fc.a;
import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class AudioInterpolation {
    private static final /* synthetic */ a $ENTRIES;
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
        $ENTRIES = r.x($values);
    }

    private AudioInterpolation(String str, int i2, int i10) {
        this.interpolationValue = i10;
    }

    public static a getEntries() {
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
