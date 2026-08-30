package me.magnum.melonds.domain.model;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class VideoFiltering {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ VideoFiltering[] $VALUES;
    public static final VideoFiltering NONE = new VideoFiltering("NONE", 0);
    public static final VideoFiltering LINEAR = new VideoFiltering("LINEAR", 1);
    public static final VideoFiltering XBR2 = new VideoFiltering("XBR2", 2);
    public static final VideoFiltering HQ2X = new VideoFiltering("HQ2X", 3);
    public static final VideoFiltering HQ4X = new VideoFiltering("HQ4X", 4);
    public static final VideoFiltering QUILEZ = new VideoFiltering("QUILEZ", 5);
    public static final VideoFiltering LCD = new VideoFiltering("LCD", 6);
    public static final VideoFiltering SCANLINES = new VideoFiltering("SCANLINES", 7);
    public static final VideoFiltering RETROARCH = new VideoFiltering("RETROARCH", 8);

    private static final /* synthetic */ VideoFiltering[] $values() {
        return new VideoFiltering[]{NONE, LINEAR, XBR2, HQ2X, HQ4X, QUILEZ, LCD, SCANLINES, RETROARCH};
    }

    static {
        VideoFiltering[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private VideoFiltering(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static VideoFiltering valueOf(String str) {
        return (VideoFiltering) Enum.valueOf(VideoFiltering.class, str);
    }

    public static VideoFiltering[] values() {
        return (VideoFiltering[]) $VALUES.clone();
    }

    public final boolean isSupportedByOpenGlSurface() {
        if (this != SCANLINES) {
            return true;
        }
        return false;
    }

    public final boolean isSupportedByVulkan() {
        return true;
    }
}
