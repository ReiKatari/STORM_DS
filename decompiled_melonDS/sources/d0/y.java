package d0;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y implements n0.k {
    public static final j0.g B = new j0.g("camerax.core.appConfig.cameraFactoryProvider", u.a.class, null);
    public static final j0.g L = new j0.g("camerax.core.appConfig.deviceSurfaceManagerProvider", u.b.class, null);
    public static final j0.g R = new j0.g("camerax.core.appConfig.useCaseConfigFactoryProvider", u.c.class, null);
    public static final j0.g X = new j0.g("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final j0.g Y = new j0.g("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    public static final j0.g Z;

    /* renamed from: b0  reason: collision with root package name */
    public static final j0.g f3500b0;

    /* renamed from: c0  reason: collision with root package name */
    public static final j0.g f3501c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final j0.g f3502d0;

    /* renamed from: e0  reason: collision with root package name */
    public static final j0.g f3503e0;

    /* renamed from: f0  reason: collision with root package name */
    public static final j0.g f3504f0;

    /* renamed from: g0  reason: collision with root package name */
    public static final j0.g f3505g0;
    public final j0.i1 A;

    static {
        Class cls = Integer.TYPE;
        Z = new j0.g("camerax.core.appConfig.minimumLoggingLevel", cls, null);
        f3500b0 = new j0.g("camerax.core.appConfig.availableCamerasLimiter", r.class, null);
        f3501c0 = new j0.g("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
        f3502d0 = new j0.g("camerax.core.appConfig.cameraProviderInitRetryPolicy", h1.class, null);
        f3503e0 = new j0.g("camerax.core.appConfig.quirksSettings", j0.l1.class, null);
        f3504f0 = new j0.g("camerax.core.appConfig.configImplType", cls, null);
        f3505g0 = new j0.g("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);
    }

    public y(j0.i1 i1Var) {
        this.A = i1Var;
    }

    public final r a() {
        return (r) this.A.h(f3500b0, null);
    }

    public final u.a b() {
        return (u.a) this.A.h(B, null);
    }

    public final long c() {
        return ((Long) this.A.h(f3501c0, -1L)).longValue();
    }

    public final u.b j() {
        return (u.b) this.A.h(L, null);
    }

    public final u.c o() {
        return (u.c) this.A.h(R, null);
    }

    @Override // j0.p1
    public final j0.r0 x() {
        return this.A;
    }
}
