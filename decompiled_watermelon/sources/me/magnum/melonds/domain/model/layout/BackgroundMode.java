package me.magnum.melonds.domain.model.layout;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class BackgroundMode {
    private static final /* synthetic */ e12 $ENTRIES;
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
        $ENTRIES = l.C($values);
    }

    private BackgroundMode(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static BackgroundMode valueOf(String str) {
        return (BackgroundMode) Enum.valueOf(BackgroundMode.class, str);
    }

    public static BackgroundMode[] values() {
        return (BackgroundMode[]) $VALUES.clone();
    }
}
