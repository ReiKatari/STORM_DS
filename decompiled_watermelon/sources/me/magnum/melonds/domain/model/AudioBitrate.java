package me.magnum.melonds.domain.model;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class AudioBitrate {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ AudioBitrate[] $VALUES;
    public static final AudioBitrate AUTO = new AudioBitrate("AUTO", 0, 0);
    public static final AudioBitrate BIT10 = new AudioBitrate("BIT10", 1, 1);
    public static final AudioBitrate BIT16 = new AudioBitrate("BIT16", 2, 2);
    private final int bitrateValue;

    private static final /* synthetic */ AudioBitrate[] $values() {
        return new AudioBitrate[]{AUTO, BIT10, BIT16};
    }

    static {
        AudioBitrate[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private AudioBitrate(String str, int i, int i2) {
        this.bitrateValue = i2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static AudioBitrate valueOf(String str) {
        return (AudioBitrate) Enum.valueOf(AudioBitrate.class, str);
    }

    public static AudioBitrate[] values() {
        return (AudioBitrate[]) $VALUES.clone();
    }

    public final int getBitrateValue() {
        return this.bitrateValue;
    }
}
