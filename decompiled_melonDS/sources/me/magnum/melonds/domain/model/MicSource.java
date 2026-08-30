package me.magnum.melonds.domain.model;

import fc.a;
import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class MicSource {
    private static final /* synthetic */ a $ENTRIES;
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
        $ENTRIES = r.x($values);
    }

    private MicSource(String str, int i2, int i10) {
        this.sourceValue = i10;
    }

    public static a getEntries() {
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
