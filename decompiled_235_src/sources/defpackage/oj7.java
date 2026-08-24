package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oj7  reason: default package */
/* loaded from: classes.dex */
public final class oj7 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ oj7[] $VALUES;
    public static final mj7 Companion;
    private final Class<?> surfaceClass;
    public static final oj7 PREVIEW = new oj7("PREVIEW", 0, SurfaceHolder.class);
    public static final oj7 IMAGE_CAPTURE = new oj7("IMAGE_CAPTURE", 1, null);
    public static final oj7 IMAGE_ANALYSIS = new oj7("IMAGE_ANALYSIS", 2, null);
    public static final oj7 VIDEO_CAPTURE = new oj7("VIDEO_CAPTURE", 3, MediaCodec.class);
    public static final oj7 STREAM_SHARING = new oj7("STREAM_SHARING", 4, SurfaceTexture.class);
    public static final oj7 UNDEFINED = new oj7("UNDEFINED", 5, null);

    private static final /* synthetic */ oj7[] $values() {
        return new oj7[]{PREVIEW, IMAGE_CAPTURE, IMAGE_ANALYSIS, VIDEO_CAPTURE, STREAM_SHARING, UNDEFINED};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, mj7] */
    static {
        oj7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private oj7(String str, int i, Class cls) {
        this.surfaceClass = cls;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static final oj7 getFeatureGroupUseCaseType(di7 di7Var) {
        Companion.getClass();
        return mj7.a(di7Var);
    }

    public static oj7 valueOf(String str) {
        return (oj7) Enum.valueOf(oj7.class, str);
    }

    public static oj7[] values() {
        return (oj7[]) $VALUES.clone();
    }

    public final Class<?> getSurfaceClass() {
        return this.surfaceClass;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (nj7.a[ordinal()]) {
            case 1:
                return "Preview";
            case 2:
                return "ImageCapture";
            case 3:
                return "ImageAnalysis";
            case 4:
                return "VideoCapture";
            case 5:
                return "StreamSharing";
            case 6:
                return "Undefined";
            default:
                i.d();
                return null;
        }
    }

    public static final oj7 getFeatureGroupUseCaseType(zi7 zi7Var) {
        Companion.getClass();
        return mj7.b(zi7Var);
    }
}
