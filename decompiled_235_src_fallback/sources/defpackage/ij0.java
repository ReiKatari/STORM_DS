package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ij0  reason: default package */
/* loaded from: classes.dex */
public final class ij0 implements defpackage.kz6 {
    public static final defpackage.xx B = null;
    public static final defpackage.xx L = null;
    public static final defpackage.xx R = null;
    public static final defpackage.xx X = null;
    public static final defpackage.xx Y = null;
    public static final defpackage.xx Z = null;
    public static final defpackage.xx d0 = null;
    public static final defpackage.xx e0 = null;
    public static final defpackage.xx f0 = null;
    public static final defpackage.xx g0 = null;
    public static final defpackage.xx h0 = null;
    public final defpackage.go4 A;

    static {
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.appConfig.cameraFactoryProvider"
            java.lang.Class<jf0> r2 = defpackage.jf0.class
            r3 = 0
            r0.<init>(r1, r2, r3)
            defpackage.ij0.B = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.appConfig.deviceSurfaceManagerProvider"
            java.lang.Class<zc0> r2 = defpackage.zc0.class
            r0.<init>(r1, r2, r3)
            defpackage.ij0.L = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.appConfig.useCaseConfigFactoryProvider"
            java.lang.Class<ad0> r2 = defpackage.ad0.class
            r0.<init>(r1, r2, r3)
            defpackage.ij0.R = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.appConfig.cameraExecutor"
            java.lang.Class<java.util.concurrent.Executor> r2 = java.util.concurrent.Executor.class
            r0.<init>(r1, r2, r3)
            defpackage.ij0.X = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.appConfig.schedulerHandler"
            java.lang.Class<android.os.Handler> r2 = android.os.Handler.class
            r0.<init>(r1, r2, r3)
            defpackage.ij0.Y = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.appConfig.minimumLoggingLevel"
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0.<init>(r1, r2, r3)
            defpackage.ij0.Z = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.appConfig.availableCamerasLimiter"
            java.lang.Class<mh0> r2 = defpackage.mh0.class
            r0.<init>(r1, r2, r3)
            defpackage.ij0.d0 = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming"
            java.lang.Class r2 = java.lang.Long.TYPE
            r0.<init>(r1, r2, r3)
            defpackage.ij0.e0 = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.appConfig.cameraProviderInitRetryPolicy"
            java.lang.Class<jp5> r2 = defpackage.jp5.class
            r0.<init>(r1, r2, r3)
            defpackage.ij0.f0 = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.appConfig.quirksSettings"
            java.lang.Class<v65> r2 = defpackage.v65.class
            r0.<init>(r1, r2, r3)
            defpackage.ij0.g0 = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.appConfig.repeatingStreamForced"
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r0.<init>(r1, r2, r3)
            defpackage.ij0.h0 = r0
            return
    }

    public ij0(defpackage.go4 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    public final defpackage.mh0 a() {
            r2 = this;
            go4 r2 = r2.A
            xx r0 = defpackage.ij0.d0
            r1 = 0
            java.lang.Object r2 = r2.b(r0, r1)
            mh0 r2 = (defpackage.mh0) r2
            return r2
    }

    public final defpackage.jf0 d() {
            r2 = this;
            go4 r2 = r2.A
            xx r0 = defpackage.ij0.B
            r1 = 0
            java.lang.Object r2 = r2.b(r0, r1)
            jf0 r2 = (defpackage.jf0) r2
            return r2
    }

    public final long k() {
            r2 = this;
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            go4 r2 = r2.A
            xx r1 = defpackage.ij0.e0
            java.lang.Object r2 = r2.b(r1, r0)
            java.lang.Long r2 = (java.lang.Long) r2
            long r0 = r2.longValue()
            return r0
    }

    public final defpackage.zc0 l() {
            r2 = this;
            go4 r2 = r2.A
            xx r0 = defpackage.ij0.L
            r1 = 0
            java.lang.Object r2 = r2.b(r0, r1)
            zc0 r2 = (defpackage.zc0) r2
            return r2
    }

    public final defpackage.ad0 m() {
            r2 = this;
            go4 r2 = r2.A
            xx r0 = defpackage.ij0.R
            r1 = 0
            java.lang.Object r2 = r2.b(r0, r1)
            ad0 r2 = (defpackage.ad0) r2
            return r2
    }

    @Override // defpackage.yd5
    public final defpackage.yy0 p() {
            r0 = this;
            go4 r0 = r0.A
            return r0
    }
}
