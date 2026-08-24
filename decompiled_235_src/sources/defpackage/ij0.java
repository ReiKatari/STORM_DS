package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ij0  reason: default package */
/* loaded from: classes.dex */
public final class ij0 implements kz6 {
    public static final xx B = new xx("camerax.core.appConfig.cameraFactoryProvider", jf0.class, null);
    public static final xx L = new xx("camerax.core.appConfig.deviceSurfaceManagerProvider", zc0.class, null);
    public static final xx R = new xx("camerax.core.appConfig.useCaseConfigFactoryProvider", ad0.class, null);
    public static final xx X = new xx("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final xx Y = new xx("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    public static final xx Z = new xx("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);
    public static final xx d0 = new xx("camerax.core.appConfig.availableCamerasLimiter", mh0.class, null);
    public static final xx e0 = new xx("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
    public static final xx f0 = new xx("camerax.core.appConfig.cameraProviderInitRetryPolicy", jp5.class, null);
    public static final xx g0 = new xx("camerax.core.appConfig.quirksSettings", v65.class, null);
    public static final xx h0 = new xx("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);
    public final go4 A;

    public ij0(go4 go4Var) {
        this.A = go4Var;
    }

    public final mh0 a() {
        return (mh0) this.A.b(d0, null);
    }

    public final jf0 d() {
        return (jf0) this.A.b(B, null);
    }

    public final long k() {
        return ((Long) this.A.b(e0, -1L)).longValue();
    }

    public final zc0 l() {
        return (zc0) this.A.b(L, null);
    }

    public final ad0 m() {
        return (ad0) this.A.b(R, null);
    }

    @Override // defpackage.yd5
    public final yy0 p() {
        return this.A;
    }
}
