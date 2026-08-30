package j0;

import android.util.Range;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface l2 extends n0.k, a1 {
    public static final g C = new g("camerax.core.useCase.defaultSessionConfig", w1.class, null);
    public static final g D = new g("camerax.core.useCase.defaultCaptureConfig", p0.class, null);
    public static final g E = new g("camerax.core.useCase.sessionConfigUnpacker", w.e0.class, null);
    public static final g F = new g("camerax.core.useCase.captureConfigUnpacker", w.b0.class, null);
    public static final g G;
    public static final g H;
    public static final g I;
    public static final g J;
    public static final g K;
    public static final g M;
    public static final g N;
    public static final g O;
    public static final g P;
    public static final g Q;
    public static final g S;

    static {
        Class cls = Integer.TYPE;
        G = new g("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        H = new g("camerax.core.useCase.sessionType", cls, null);
        I = new g("camerax.core.useCase.targetFrameRate", Range.class, null);
        J = new g("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
        Class cls2 = Boolean.TYPE;
        K = new g("camerax.core.useCase.zslDisabled", cls2, null);
        M = new g("camerax.core.useCase.highResolutionDisabled", cls2, null);
        N = new g("camerax.core.useCase.captureType", n2.class, null);
        O = new g("camerax.core.useCase.previewStabilizationMode", cls, null);
        P = new g("camerax.core.useCase.videoStabilizationMode", cls, null);
        Q = new g("camerax.core.useCase.takePictureManagerProvider", k2.class, null);
        S = new g("camerax.core.useCase.streamUseCase", z1.class, null);
    }

    default int B() {
        return ((Integer) h(O, 0)).intValue();
    }

    default z1 n() {
        z1 z1Var = (z1) h(S, z1.DEFAULT);
        Objects.requireNonNull(z1Var);
        return z1Var;
    }

    default n2 r() {
        return (n2) g(N);
    }
}
