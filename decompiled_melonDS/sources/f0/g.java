package f0;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
import d0.v1;
import j0.l2;
import m9.o;
import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final e Companion;
    private final int defaultImageFormat;
    private final Class<?> surfaceClass;
    public static final g PREVIEW = new g("PREVIEW", 0, SurfaceHolder.class, 34);
    public static final g IMAGE_CAPTURE = new g("IMAGE_CAPTURE", 1, null, 256);
    public static final g VIDEO_CAPTURE = new g("VIDEO_CAPTURE", 2, MediaCodec.class, 34);
    public static final g STREAM_SHARING = new g("STREAM_SHARING", 3, SurfaceTexture.class, 34);
    public static final g UNDEFINED = new g("UNDEFINED", 4, null, 34);

    private static final /* synthetic */ g[] $values() {
        return new g[]{PREVIEW, IMAGE_CAPTURE, VIDEO_CAPTURE, STREAM_SHARING, UNDEFINED};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, f0.e] */
    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
        Companion = new Object();
    }

    private g(String str, int i2, Class cls, int i10) {
        this.surfaceClass = cls;
        this.defaultImageFormat = i10;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static final g getFeatureGroupUseCaseType(v1 v1Var) {
        Companion.getClass();
        return e.a(v1Var);
    }

    public static /* synthetic */ int getImageFormat$default(g gVar, Integer num, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                num = null;
            }
            return gVar.getImageFormat(num);
        }
        o.v("Super calls with default arguments not supported in this target, function: getImageFormat");
        return 0;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final int getDefaultImageFormat() {
        return this.defaultImageFormat;
    }

    public final int getImageFormat(Integer num) {
        if (this == IMAGE_CAPTURE && num != null) {
            return num.intValue();
        }
        return this.defaultImageFormat;
    }

    public final Class<?> getSurfaceClass() {
        return this.surfaceClass;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i2 = f.f4518a[ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return "Undefined";
                        }
                        o.o();
                        return null;
                    }
                    return "StreamSharing";
                }
                return "VideoCapture";
            }
            return "ImageCapture";
        }
        return "Preview";
    }

    public static final g getFeatureGroupUseCaseType(l2 l2Var) {
        Companion.getClass();
        return e.b(l2Var);
    }
}
