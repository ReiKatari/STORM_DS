package me.magnum.melonds.common.camera;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public interface DSiCameraSource {
    public static final int BackCamera = 0;
    public static final p51 Companion = p51.a;
    public static final int FrontCamera = 1;

    void captureFrame(int i, byte[] bArr, int i2, int i3, boolean z);

    void dispose();

    boolean isAvailable();

    void startCamera(int i);

    void stopCamera(int i);
}
