package me.magnum.melonds.common.camera;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface DSiCameraSource {
    public static final int BackCamera = 0;
    public static final d91 Companion = d91.a;
    public static final int FrontCamera = 1;

    void captureFrame(int i, byte[] bArr, int i2, int i3, boolean z);

    void dispose();

    boolean isAvailable();

    void startCamera(int i);

    void stopCamera(int i);
}
