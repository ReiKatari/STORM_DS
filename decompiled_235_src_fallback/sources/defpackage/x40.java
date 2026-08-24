package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x40  reason: default package */
/* loaded from: classes.dex */
public final class x40 implements me.magnum.melonds.common.camera.DSiCameraSource {
    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void captureFrame(int r1, byte[] r2, int r3, int r4, boolean r5) {
            r0 = this;
            r2.getClass()
            int r0 = r2.length
            int r0 = r0 + (-1)
            r1 = 2
            r3 = 0
            int r0 = defpackage.nj2.s(r3, r0, r1)
            if (r0 < 0) goto L1c
            r1 = r3
        Lf:
            r2[r1] = r3
            int r4 = r1 + 1
            r5 = 127(0x7f, float:1.78E-43)
            r2[r4] = r5
            if (r1 == r0) goto L1c
            int r1 = r1 + 2
            goto Lf
        L1c:
            return
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void dispose() {
            r0 = this;
            return
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final boolean isAvailable() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void startCamera(int r1) {
            r0 = this;
            return
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void stopCamera(int r1) {
            r0 = this;
            return
    }
}
