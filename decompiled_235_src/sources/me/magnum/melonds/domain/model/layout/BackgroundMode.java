package me.magnum.melonds.domain.model.layout;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class BackgroundMode {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ BackgroundMode[] $VALUES;
    public static final BackgroundMode STRETCH = new BackgroundMode("STRETCH", 0);
    public static final BackgroundMode FIT_CENTER = new BackgroundMode("FIT_CENTER", 1);
    public static final BackgroundMode FIT_TOP = new BackgroundMode("FIT_TOP", 2);
    public static final BackgroundMode FIT_LEFT = new BackgroundMode("FIT_LEFT", 3);
    public static final BackgroundMode FIT_BOTTOM = new BackgroundMode("FIT_BOTTOM", 4);
    public static final BackgroundMode FIT_RIGHT = new BackgroundMode("FIT_RIGHT", 5);

    private static final /* synthetic */ BackgroundMode[] $values() {
        return new BackgroundMode[]{STRETCH, FIT_CENTER, FIT_TOP, FIT_LEFT, FIT_BOTTOM, FIT_RIGHT};
    }

    static {
        BackgroundMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private BackgroundMode(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static BackgroundMode valueOf(String str) {
        return (BackgroundMode) Enum.valueOf(BackgroundMode.class, str);
    }

    public static BackgroundMode[] values() {
        return (BackgroundMode[]) $VALUES.clone();
    }
}
