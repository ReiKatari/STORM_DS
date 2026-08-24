package me.magnum.melonds.domain.model;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class VideoFiltering {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ VideoFiltering[] $VALUES;
    public static final VideoFiltering NONE = new VideoFiltering("NONE", 0);
    public static final VideoFiltering LINEAR = new VideoFiltering("LINEAR", 1);
    public static final VideoFiltering XBR2 = new VideoFiltering("XBR2", 2);
    public static final VideoFiltering HQ2X = new VideoFiltering("HQ2X", 3);
    public static final VideoFiltering HQ4X = new VideoFiltering("HQ4X", 4);
    public static final VideoFiltering QUILEZ = new VideoFiltering("QUILEZ", 5);
    public static final VideoFiltering LCD = new VideoFiltering("LCD", 6);
    public static final VideoFiltering SCANLINES = new VideoFiltering("SCANLINES", 7);
    public static final VideoFiltering AI_UPSCALE = new VideoFiltering("AI_UPSCALE", 8);
    public static final VideoFiltering RETROARCH = new VideoFiltering("RETROARCH", 9);

    private static final /* synthetic */ VideoFiltering[] $values() {
        return new VideoFiltering[]{NONE, LINEAR, XBR2, HQ2X, HQ4X, QUILEZ, LCD, SCANLINES, AI_UPSCALE, RETROARCH};
    }

    static {
        VideoFiltering[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private VideoFiltering(String str, int i) {
    }

    public static t52 getEntries() {
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

    public final boolean isSupportedByRenderer(VideoRenderer videoRenderer) {
        videoRenderer.getClass();
        int i = nm7.a[videoRenderer.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return isSupportedByOpenGlSurface();
            }
            return isSupportedByVulkan();
        } else if (this != AI_UPSCALE && this != RETROARCH && this != SCANLINES) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean isSupportedByVulkan() {
        return true;
    }
}
