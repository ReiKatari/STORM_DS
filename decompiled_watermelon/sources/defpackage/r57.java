package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r57  reason: default package */
/* loaded from: classes.dex */
public final class r57 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ r57[] $VALUES;
    public static final p57 Companion;
    private final Class<?> surfaceClass;
    public static final r57 PREVIEW = new r57("PREVIEW", 0, SurfaceHolder.class);
    public static final r57 IMAGE_CAPTURE = new r57("IMAGE_CAPTURE", 1, null);
    public static final r57 IMAGE_ANALYSIS = new r57("IMAGE_ANALYSIS", 2, null);
    public static final r57 VIDEO_CAPTURE = new r57("VIDEO_CAPTURE", 3, MediaCodec.class);
    public static final r57 STREAM_SHARING = new r57("STREAM_SHARING", 4, SurfaceTexture.class);
    public static final r57 UNDEFINED = new r57("UNDEFINED", 5, null);

    private static final /* synthetic */ r57[] $values() {
        return new r57[]{PREVIEW, IMAGE_CAPTURE, IMAGE_ANALYSIS, VIDEO_CAPTURE, STREAM_SHARING, UNDEFINED};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [p57, java.lang.Object] */
    static {
        r57[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
    }

    private r57(String str, int i, Class cls) {
        this.surfaceClass = cls;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static final r57 getFeatureGroupUseCaseType(f47 f47Var) {
        Companion.getClass();
        return p57.a(f47Var);
    }

    public static r57 valueOf(String str) {
        return (r57) Enum.valueOf(r57.class, str);
    }

    public static r57[] values() {
        return (r57[]) $VALUES.clone();
    }

    public final Class<?> getSurfaceClass() {
        return this.surfaceClass;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (q57.a[ordinal()]) {
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
            case ig7.b /* 6 */:
                return "Undefined";
            default:
                i.c();
                return null;
        }
    }

    public static final r57 getFeatureGroupUseCaseType(b57 b57Var) {
        Companion.getClass();
        return p57.b(b57Var);
    }
}
