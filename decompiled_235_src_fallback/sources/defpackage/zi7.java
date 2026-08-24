package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zi7  reason: default package */
/* loaded from: classes.dex */
public interface zi7 extends defpackage.kz6, defpackage.j23 {
    public static final defpackage.xx G = null;
    public static final defpackage.xx H = null;
    public static final defpackage.xx I = null;
    public static final defpackage.xx J = null;
    public static final defpackage.xx K = null;
    public static final defpackage.xx M = null;
    public static final defpackage.xx N = null;
    public static final defpackage.xx O = null;
    public static final defpackage.xx P = null;
    public static final defpackage.xx Q = null;
    public static final defpackage.xx S = null;
    public static final defpackage.xx T = null;
    public static final defpackage.xx U = null;
    public static final defpackage.xx V = null;
    public static final defpackage.xx W = null;
    public static final defpackage.xx a0 = null;
    public static final defpackage.xx b0 = null;

    static {
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.defaultSessionConfig"
            java.lang.Class<rc6> r2 = defpackage.rc6.class
            r3 = 0
            r0.<init>(r1, r2, r3)
            defpackage.zi7.G = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.defaultCaptureConfig"
            java.lang.Class<ek0> r2 = defpackage.ek0.class
            r0.<init>(r1, r2, r3)
            defpackage.zi7.H = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.sessionConfigUnpacker"
            java.lang.Class<wi0> r2 = defpackage.wi0.class
            r0.<init>(r1, r2, r3)
            defpackage.zi7.I = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.captureConfigUnpacker"
            java.lang.Class<vi0> r2 = defpackage.vi0.class
            r0.<init>(r1, r2, r3)
            defpackage.zi7.J = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.surfaceOccupancyPriority"
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0.<init>(r1, r2, r3)
            defpackage.zi7.K = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.sessionType"
            r0.<init>(r1, r2, r3)
            defpackage.zi7.M = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.targetFrameRate"
            java.lang.Class<android.util.Range> r4 = android.util.Range.class
            r0.<init>(r1, r4, r3)
            defpackage.zi7.N = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.isStrictFrameRateRequired"
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            r0.<init>(r1, r4, r3)
            defpackage.zi7.O = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.resolutionToMaxFrameRate"
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            r0.<init>(r1, r5, r3)
            defpackage.zi7.P = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.zslDisabled"
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r0.<init>(r1, r5, r3)
            defpackage.zi7.Q = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.highResolutionDisabled"
            r0.<init>(r1, r5, r3)
            defpackage.zi7.S = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.captureType"
            java.lang.Class<bj7> r5 = defpackage.bj7.class
            r0.<init>(r1, r5, r3)
            defpackage.zi7.T = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.previewStabilizationMode"
            r0.<init>(r1, r2, r3)
            defpackage.zi7.U = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.videoStabilizationMode"
            r0.<init>(r1, r2, r3)
            defpackage.zi7.V = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.isVideoQualitySelectorDefault"
            r0.<init>(r1, r4, r3)
            defpackage.zi7.W = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.takePictureManagerProvider"
            java.lang.Class<xi7> r2 = defpackage.xi7.class
            r0.<init>(r1, r2, r3)
            defpackage.zi7.a0 = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.streamUseCase"
            java.lang.Class<tr6> r2 = defpackage.tr6.class
            r0.<init>(r1, r2, r3)
            defpackage.zi7.b0 = r0
            return
    }

    default int A(android.util.Size r3) {
            r2 = this;
            xx r0 = defpackage.zi7.P
            r1 = 0
            java.lang.Object r2 = r2.b(r0, r1)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L1f
            boolean r0 = r2.containsKey(r3)
            if (r0 == 0) goto L1f
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.util.Objects.requireNonNull(r2)
            int r2 = r2.intValue()
            return r2
        L1f:
            r2 = 2147483647(0x7fffffff, float:NaN)
            return r2
    }

    default int E() {
            r2 = this;
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            xx r1 = defpackage.zi7.U
            java.lang.Object r2 = r2.b(r1, r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    default defpackage.tr6 w() {
            r2 = this;
            xx r0 = defpackage.zi7.b0
            tr6 r1 = defpackage.tr6.DEFAULT
            java.lang.Object r2 = r2.b(r0, r1)
            tr6 r2 = (defpackage.tr6) r2
            java.util.Objects.requireNonNull(r2)
            return r2
    }

    default defpackage.bj7 x() {
            r1 = this;
            xx r0 = defpackage.zi7.T
            java.lang.Object r1 = r1.e(r0)
            bj7 r1 = (defpackage.bj7) r1
            return r1
    }

    default int y() {
            r2 = this;
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            xx r1 = defpackage.zi7.V
            java.lang.Object r2 = r2.b(r1, r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }
}
