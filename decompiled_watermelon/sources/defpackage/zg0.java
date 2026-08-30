package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zg0  reason: default package */
/* loaded from: classes.dex */
public final class zg0 implements an6 {
    public static final uw B = new uw("camerax.core.appConfig.cameraFactoryProvider", ad0.class, null);
    public static final uw L = new uw("camerax.core.appConfig.deviceSurfaceManagerProvider", ra0.class, null);
    public static final uw R = new uw("camerax.core.appConfig.useCaseConfigFactoryProvider", sa0.class, null);
    public static final uw X = new uw("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final uw Y = new uw("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    public static final uw Z = new uw("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);
    public static final uw c0 = new uw("camerax.core.appConfig.availableCamerasLimiter", df0.class, null);
    public static final uw d0 = new uw("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
    public static final uw e0 = new uw("camerax.core.appConfig.cameraProviderInitRetryPolicy", nf5.class, null);
    public static final uw f0 = new uw("camerax.core.appConfig.quirksSettings", lx4.class, null);
    public static final uw g0 = new uw("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);
    public final ef4 A;

    public zg0(ef4 ef4Var) {
        this.A = ef4Var;
    }

    public final df0 b() {
        return (df0) this.A.d(c0, null);
    }

    public final ad0 f() {
        return (ad0) this.A.d(B, null);
    }

    public final long j() {
        return ((Long) this.A.d(d0, -1L)).longValue();
    }

    public final ra0 m() {
        return (ra0) this.A.d(L, null);
    }

    public final sa0 r() {
        return (sa0) this.A.d(R, null);
    }

    @Override // defpackage.l45
    public final cw0 w() {
        return this.A;
    }
}
