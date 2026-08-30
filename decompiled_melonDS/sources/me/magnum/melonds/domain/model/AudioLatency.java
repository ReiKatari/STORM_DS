package me.magnum.melonds.domain.model;

import fc.a;
import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class AudioLatency {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AudioLatency[] $VALUES;
    private final int latencyValue;
    public static final AudioLatency LOW = new AudioLatency("LOW", 0, 0);
    public static final AudioLatency MEDIUM = new AudioLatency("MEDIUM", 1, 1);
    public static final AudioLatency HIGH = new AudioLatency("HIGH", 2, 2);

    private static final /* synthetic */ AudioLatency[] $values() {
        return new AudioLatency[]{LOW, MEDIUM, HIGH};
    }

    static {
        AudioLatency[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private AudioLatency(String str, int i2, int i10) {
        this.latencyValue = i10;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static AudioLatency valueOf(String str) {
        return (AudioLatency) Enum.valueOf(AudioLatency.class, str);
    }

    public static AudioLatency[] values() {
        return (AudioLatency[]) $VALUES.clone();
    }

    public final int getLatencyValue() {
        return this.latencyValue;
    }
}
