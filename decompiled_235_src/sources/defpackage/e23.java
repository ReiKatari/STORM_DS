package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e23  reason: default package */
/* loaded from: classes.dex */
public final class e23 implements zi7, n23, dc3 {
    public static final xx B;
    public static final xx L;
    public static final xx R;
    public static final xx X;
    public static final xx Y;
    public static final xx Z;
    public static final xx d0;
    public static final xx e0;
    public static final xx f0;
    public final go4 A;

    static {
        Class cls = Integer.TYPE;
        B = new xx("camerax.core.imageCapture.captureMode", cls, null);
        L = new xx("camerax.core.imageCapture.flashMode", cls, null);
        R = new xx("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        X = new xx("camerax.core.imageCapture.outputFormat", Integer.class, null);
        Y = new xx("camerax.core.imageCapture.imageReaderProxyProvider", w23.class, null);
        Z = new xx("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        d0 = new xx("camerax.core.imageCapture.flashType", cls, null);
        e0 = new xx("camerax.core.imageCapture.screenFlash", v66.class, null);
        f0 = new xx("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public e23(go4 go4Var) {
        this.A = go4Var;
    }

    @Override // defpackage.yd5
    public final yy0 p() {
        return this.A;
    }

    @Override // defpackage.j23
    public final int q() {
        return ((Integer) e(j23.l)).intValue();
    }
}
