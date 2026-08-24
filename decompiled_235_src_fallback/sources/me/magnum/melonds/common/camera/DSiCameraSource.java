package me.magnum.melonds.common.camera;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface DSiCameraSource {
    public static final int BackCamera = 0;
    public static final defpackage.d91 Companion = null;
    public static final int FrontCamera = 1;

    static {
            d91 r0 = defpackage.d91.a
            me.magnum.melonds.common.camera.DSiCameraSource.Companion = r0
            return
    }

    void captureFrame(int r1, byte[] r2, int r3, int r4, boolean r5);

    void dispose();

    boolean isAvailable();

    void startCamera(int r1);

    void stopCamera(int r1);
}
