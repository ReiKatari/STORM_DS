package defpackage;

import android.util.Range;
import android.util.Size;
import androidx.preference.Preference;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b57  reason: default package */
/* loaded from: classes.dex */
public interface b57 extends an6, fw2 {
    public static final uw F = new uw("camerax.core.useCase.defaultSessionConfig", d16.class, null);
    public static final uw G = new uw("camerax.core.useCase.defaultCaptureConfig", wh0.class, null);
    public static final uw H = new uw("camerax.core.useCase.sessionConfigUnpacker", ng0.class, null);
    public static final uw I = new uw("camerax.core.useCase.captureConfigUnpacker", mg0.class, null);
    public static final uw J;
    public static final uw K;
    public static final uw M;
    public static final uw N;
    public static final uw O;
    public static final uw P;
    public static final uw Q;
    public static final uw S;
    public static final uw T;
    public static final uw U;
    public static final uw V;
    public static final uw W;
    public static final uw a0;

    static {
        Class cls = Integer.TYPE;
        J = new uw("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        K = new uw("camerax.core.useCase.sessionType", cls, null);
        M = new uw("camerax.core.useCase.targetFrameRate", Range.class, null);
        N = new uw("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
        O = new uw("camerax.core.useCase.resolutionToMaxFrameRate", Map.class, null);
        Class cls2 = Boolean.TYPE;
        P = new uw("camerax.core.useCase.zslDisabled", cls2, null);
        Q = new uw("camerax.core.useCase.highResolutionDisabled", cls2, null);
        S = new uw("camerax.core.useCase.captureType", d57.class, null);
        T = new uw("camerax.core.useCase.previewStabilizationMode", cls, null);
        U = new uw("camerax.core.useCase.videoStabilizationMode", cls, null);
        V = new uw("camerax.core.useCase.isVideoQualitySelectorDefault", Boolean.class, null);
        W = new uw("camerax.core.useCase.takePictureManagerProvider", z47.class, null);
        a0 = new uw("camerax.core.useCase.streamUseCase", cg6.class, null);
    }

    default cg6 l() {
        cg6 cg6Var = (cg6) d(a0, cg6.DEFAULT);
        Objects.requireNonNull(cg6Var);
        return cg6Var;
    }

    default d57 n() {
        return (d57) g(S);
    }

    default int o() {
        return ((Integer) d(U, 0)).intValue();
    }

    default int q(Size size) {
        Map map = (Map) d(O, null);
        if (map != null && map.containsKey(size)) {
            Integer num = (Integer) map.get(size);
            Objects.requireNonNull(num);
            return num.intValue();
        }
        return Preference.DEFAULT_ORDER;
    }

    default int z() {
        return ((Integer) d(T, 0)).intValue();
    }
}
