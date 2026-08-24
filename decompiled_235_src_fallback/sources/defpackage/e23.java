package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e23  reason: default package */
/* loaded from: classes.dex */
public final class e23 implements defpackage.zi7, defpackage.n23, defpackage.dc3 {
    public static final defpackage.xx B = null;
    public static final defpackage.xx L = null;
    public static final defpackage.xx R = null;
    public static final defpackage.xx X = null;
    public static final defpackage.xx Y = null;
    public static final defpackage.xx Z = null;
    public static final defpackage.xx d0 = null;
    public static final defpackage.xx e0 = null;
    public static final defpackage.xx f0 = null;
    public final defpackage.go4 A;

    static {
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageCapture.captureMode"
            java.lang.Class r2 = java.lang.Integer.TYPE
            r3 = 0
            r0.<init>(r1, r2, r3)
            defpackage.e23.B = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageCapture.flashMode"
            r0.<init>(r1, r2, r3)
            defpackage.e23.L = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageCapture.bufferFormat"
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            r0.<init>(r1, r4, r3)
            defpackage.e23.R = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageCapture.outputFormat"
            r0.<init>(r1, r4, r3)
            defpackage.e23.X = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageCapture.imageReaderProxyProvider"
            java.lang.Class<w23> r4 = defpackage.w23.class
            r0.<init>(r1, r4, r3)
            defpackage.e23.Y = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageCapture.useSoftwareJpegEncoder"
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r0.<init>(r1, r4, r3)
            defpackage.e23.Z = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageCapture.flashType"
            r0.<init>(r1, r2, r3)
            defpackage.e23.d0 = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageCapture.screenFlash"
            java.lang.Class<v66> r2 = defpackage.v66.class
            r0.<init>(r1, r2, r3)
            defpackage.e23.e0 = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.useCase.isPostviewEnabled"
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r0.<init>(r1, r2, r3)
            defpackage.e23.f0 = r0
            return
    }

    public e23(defpackage.go4 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.yd5
    public final defpackage.yy0 p() {
            r0 = this;
            go4 r0 = r0.A
            return r0
    }

    @Override // defpackage.j23
    public final int q() {
            r1 = this;
            xx r0 = defpackage.j23.l
            java.lang.Object r1 = r1.e(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }
}
