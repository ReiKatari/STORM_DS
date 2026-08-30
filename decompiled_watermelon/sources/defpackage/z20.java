package defpackage;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z20  reason: default package */
/* loaded from: classes.dex */
public final class z20 implements DSiCameraSource {
    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void captureFrame(int i, byte[] bArr, int i2, int i3, boolean z) {
        bArr.getClass();
        int E = cg2.E(0, bArr.length - 1, 2);
        if (E >= 0) {
            int i4 = 0;
            while (true) {
                bArr[i4] = 0;
                bArr[i4 + 1] = Byte.MAX_VALUE;
                if (i4 != E) {
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
