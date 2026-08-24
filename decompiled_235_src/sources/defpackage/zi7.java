package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zi7  reason: default package */
/* loaded from: classes.dex */
public interface zi7 extends kz6, j23 {
    public static final xx G = new xx("camerax.core.useCase.defaultSessionConfig", rc6.class, null);
    public static final xx H = new xx("camerax.core.useCase.defaultCaptureConfig", ek0.class, null);
    public static final xx I = new xx("camerax.core.useCase.sessionConfigUnpacker", wi0.class, null);
    public static final xx J = new xx("camerax.core.useCase.captureConfigUnpacker", vi0.class, null);
    public static final xx K;
    public static final xx M;
    public static final xx N;
    public static final xx O;
    public static final xx P;
    public static final xx Q;
    public static final xx S;
    public static final xx T;
    public static final xx U;
    public static final xx V;
    public static final xx W;
    public static final xx a0;
    public static final xx b0;

    static {
        Class cls = Integer.TYPE;
        K = new xx("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        M = new xx("camerax.core.useCase.sessionType", cls, null);
        N = new xx("camerax.core.useCase.targetFrameRate", Range.class, null);
        O = new xx("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
        P = new xx("camerax.core.useCase.resolutionToMaxFrameRate", Map.class, null);
        Class cls2 = Boolean.TYPE;
        Q = new xx("camerax.core.useCase.zslDisabled", cls2, null);
        S = new xx("camerax.core.useCase.highResolutionDisabled", cls2, null);
        T = new xx("camerax.core.useCase.captureType", bj7.class, null);
        U = new xx("camerax.core.useCase.previewStabilizationMode", cls, null);
        V = new xx("camerax.core.useCase.videoStabilizationMode", cls, null);
        W = new xx("camerax.core.useCase.isVideoQualitySelectorDefault", Boolean.class, null);
        a0 = new xx("camerax.core.useCase.takePictureManagerProvider", xi7.class, null);
        b0 = new xx("camerax.core.useCase.streamUseCase", tr6.class, null);
    }

    default int A(Size size) {
        Map map = (Map) b(P, null);
        if (map != null && map.containsKey(size)) {
            Integer num = (Integer) map.get(size);
            Objects.requireNonNull(num);
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    default int E() {
        return ((Integer) b(U, 0)).intValue();
    }

    default tr6 w() {
        tr6 tr6Var = (tr6) b(b0, tr6.DEFAULT);
        Objects.requireNonNull(tr6Var);
        return tr6Var;
    }

    default bj7 x() {
        return (bj7) e(T);
    }

    default int y() {
        return ((Integer) b(V, 0)).intValue();
    }
}
