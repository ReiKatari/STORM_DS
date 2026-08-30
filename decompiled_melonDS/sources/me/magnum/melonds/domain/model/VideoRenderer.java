package me.magnum.melonds.domain.model;

import fc.a;
import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class VideoRenderer {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VideoRenderer[] $VALUES;
    private final int renderer;
    public static final VideoRenderer SOFTWARE = new VideoRenderer("SOFTWARE", 0, 0);
    public static final VideoRenderer OPENGL = new VideoRenderer("OPENGL", 1, 1);

    private static final /* synthetic */ VideoRenderer[] $values() {
        return new VideoRenderer[]{SOFTWARE, OPENGL};
    }

    static {
        VideoRenderer[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private VideoRenderer(String str, int i2, int i10) {
        this.renderer = i10;
    }

    public static a getEntries() {
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
