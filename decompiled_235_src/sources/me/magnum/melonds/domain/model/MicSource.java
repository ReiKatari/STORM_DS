package me.magnum.melonds.domain.model;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MicSource {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ MicSource[] $VALUES;
    private final int sourceValue;
    public static final MicSource NONE = new MicSource("NONE", 0, 0);
    public static final MicSource BLOW = new MicSource("BLOW", 1, 1);
    public static final MicSource DEVICE = new MicSource("DEVICE", 2, 2);

    private static final /* synthetic */ MicSource[] $values() {
        return new MicSource[]{NONE, BLOW, DEVICE};
    }

    static {
        MicSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private MicSource(String str, int i, int i2) {
        this.sourceValue = i2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static MicSource valueOf(String str) {
        return (MicSource) Enum.valueOf(MicSource.class, str);
    }

    public static MicSource[] values() {
        return (MicSource[]) $VALUES.clone();
    }

    public final int getSourceValue() {
        return this.sourceValue;
    }
}
