package me.magnum.melonds.domain.model;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class VideoRenderer {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ VideoRenderer[] $VALUES;
    private final int renderer;
    public static final VideoRenderer SOFTWARE = new VideoRenderer("SOFTWARE", 0, 0);
    public static final VideoRenderer OPENGL = new VideoRenderer("OPENGL", 1, 1);
    public static final VideoRenderer VULKAN = new VideoRenderer("VULKAN", 2, 2);
    public static final VideoRenderer COMPUTE = new VideoRenderer("COMPUTE", 3, 3);

    private static final /* synthetic */ VideoRenderer[] $values() {
        return new VideoRenderer[]{SOFTWARE, OPENGL, VULKAN, COMPUTE};
    }

    static {
        VideoRenderer[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private VideoRenderer(String str, int i, int i2) {
        this.renderer = i2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static VideoRenderer valueOf(String str) {
        return (VideoRenderer) Enum.valueOf(VideoRenderer.class, str);
    }

    public static VideoRenderer[] values() {
        return (VideoRenderer[]) $VALUES.clone();
    }

    public final int getRenderer() {
        return this.renderer;
    }
}
