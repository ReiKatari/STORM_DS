package td;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements DSiCameraSource {
    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void captureFrame(int i2, byte[] bArr, int i10, int i11, boolean z10) {
        bArr.getClass();
        int E = a.a.E(0, bArr.length - 1, 2);
        if (E >= 0) {
            int i12 = 0;
            while (true) {
                bArr[i12] = 0;
                bArr[i12 + 1] = Byte.MAX_VALUE;
                if (i12 != E) {
                    i12 += 2;
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
    public final void startCamera(int i2) {
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void stopCamera(int i2) {
    }
}
