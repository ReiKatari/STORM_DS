package me.magnum.melonds.domain.model.retroachievements;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RARuntimeBridgeMode {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ RARuntimeBridgeMode[] $VALUES;
    private final int nativeValue;
    public static final RARuntimeBridgeMode RC_CLIENT_ONLINE = new RARuntimeBridgeMode("RC_CLIENT_ONLINE", 0, 1);
    public static final RARuntimeBridgeMode RC_CLIENT_OFFLINE = new RARuntimeBridgeMode("RC_CLIENT_OFFLINE", 1, 2);

    private static final /* synthetic */ RARuntimeBridgeMode[] $values() {
        return new RARuntimeBridgeMode[]{RC_CLIENT_ONLINE, RC_CLIENT_OFFLINE};
    }

    static {
        RARuntimeBridgeMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private RARuntimeBridgeMode(String str, int i, int i2) {
        this.nativeValue = i2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static RARuntimeBridgeMode valueOf(String str) {
        return (RARuntimeBridgeMode) Enum.valueOf(RARuntimeBridgeMode.class, str);
    }

    public static RARuntimeBridgeMode[] values() {
        return (RARuntimeBridgeMode[]) $VALUES.clone();
    }

    public final int getNativeValue() {
        return this.nativeValue;
    }
}
