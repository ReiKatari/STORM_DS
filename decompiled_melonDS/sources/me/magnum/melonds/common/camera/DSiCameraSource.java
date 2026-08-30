package me.magnum.melonds.common.camera;

import td.b;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface DSiCameraSource {
    public static final int BackCamera = 0;
    public static final b Companion = b.f13175a;
    public static final int FrontCamera = 1;

    void captureFrame(int i2, byte[] bArr, int i10, int i11, boolean z10);

    void dispose();

    boolean isAvailable();

    void startCamera(int i2);

    void stopCamera(int i2);
}
