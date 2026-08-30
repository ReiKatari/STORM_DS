package me.magnum.melonds.domain.model;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class AudioLatency {
    private static final /* synthetic */ e12 $ENTRIES;
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
        $ENTRIES = l.C($values);
    }

    private AudioLatency(String str, int i, int i2) {
        this.latencyValue = i2;
    }

    public static e12 getEntries() {
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
