package me.magnum.melonds.domain.model;

import fc.a;
import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class AudioBitrate {
    private static final /* synthetic */ a $ENTRIES;
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
        $ENTRIES = r.x($values);
    }

    private AudioBitrate(String str, int i2, int i10) {
        this.bitrateValue = i10;
    }

    public static a getEntries() {
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
