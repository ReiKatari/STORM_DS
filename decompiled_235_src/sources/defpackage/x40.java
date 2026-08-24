package defpackage;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x40  reason: default package */
/* loaded from: classes.dex */
public final class x40 implements DSiCameraSource {
    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void captureFrame(int i, byte[] bArr, int i2, int i3, boolean z) {
        bArr.getClass();
        int s = nj2.s(0, bArr.length - 1, 2);
        if (s >= 0) {
            int i4 = 0;
            while (true) {
                bArr[i4] = 0;
                bArr[i4 + 1] = Byte.MAX_VALUE;
                if (i4 != s) {
                    i4 += 2;
                } else {
                    return;
                }
            }
        }
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final boolean isAvailable() {
        return true;
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void dispose() {
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void startCamera(int i) {
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void stopCamera(int i) {
    }
}
