package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: aw2  reason: default package */
/* loaded from: classes.dex */
public final class aw2 implements b57, jw2, q53 {
    public static final uw B;
    public static final uw L;
    public static final uw R;
    public static final uw X;
    public static final uw Y;
    public static final uw Z;
    public static final uw c0;
    public static final uw d0;
    public static final uw e0;
    public final ef4 A;

    static {
        Class cls = Integer.TYPE;
        B = new uw("camerax.core.imageCapture.captureMode", cls, null);
        L = new uw("camerax.core.imageCapture.flashMode", cls, null);
        R = new uw("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        X = new uw("camerax.core.imageCapture.outputFormat", Integer.class, null);
        Y = new uw("camerax.core.imageCapture.imageReaderProxyProvider", sw2.class, null);
        Z = new uw("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        c0 = new uw("camerax.core.imageCapture.flashType", cls, null);
        d0 = new uw("camerax.core.imageCapture.screenFlash", iv5.class, null);
        e0 = new uw("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public aw2(ef4 ef4Var) {
        this.A = ef4Var;
    }

    @Override // defpackage.l45
    public final cw0 w() {
        return this.A;
    }

    @Override // defpackage.fw2
    public final int x() {
        return ((Integer) g(fw2.l)).intValue();
    }
}
