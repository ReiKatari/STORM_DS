package j0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 implements l2, b1, n0.g {
    public static final g B;
    public static final g L;
    public static final g R;
    public static final g X;
    public static final g Y;
    public static final g Z;

    /* renamed from: b0  reason: collision with root package name */
    public static final g f7328b0;

    /* renamed from: c0  reason: collision with root package name */
    public static final g f7329c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final g f7330d0;
    public final i1 A;

    static {
        Class cls = Integer.TYPE;
        B = new g("camerax.core.imageCapture.captureMode", cls, null);
        L = new g("camerax.core.imageCapture.flashMode", cls, null);
        R = new g("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        X = new g("camerax.core.imageCapture.outputFormat", Integer.class, null);
        Y = new g("camerax.core.imageCapture.imageReaderProxyProvider", d0.z0.class, null);
        Z = new g("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        f7328b0 = new g("camerax.core.imageCapture.flashType", cls, null);
        f7329c0 = new g("camerax.core.imageCapture.screenFlash", n0.h.class, null);
        f7330d0 = new g("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public z0(i1 i1Var) {
        this.A = i1Var;
    }

    @Override // j0.p1
    public final r0 x() {
        return this.A;
    }

    @Override // j0.a1
    public final int y() {
        return ((Integer) g(a1.f7148n)).intValue();
    }
}
