package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lq6  reason: default package */
/* loaded from: classes.dex */
public final class lq6 implements me.magnum.melonds.common.camera.DSiCameraSource {
    public final android.content.Context a;
    public final defpackage.kd6 b;
    public final defpackage.o40 c;
    public final defpackage.o41 d;
    public defpackage.ap6 e;
    public final byte[] f;

    public lq6(android.content.Context r1, defpackage.kd6 r2, defpackage.o40 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            xe1 r1 = defpackage.xk1.a
            de1 r1 = defpackage.de1.L
            gu6 r2 = defpackage.oi2.c()
            r1.getClass()
            l61 r1 = defpackage.jw2.y(r1, r2)
            o41 r1 = defpackage.g04.i(r1)
            r0.d = r1
            r1 = 614400(0x96000, float:8.60958E-40)
            byte[] r1 = new byte[r1]
            r0.f = r1
            return
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void captureFrame(int r1, byte[] r2, int r3, int r4, boolean r5) {
            r0 = this;
            r2.getClass()
            r1 = 0
            byte[] r0 = r0.f
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
            return
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void dispose() {
            r1 = this;
            o41 r1 = r1.d
            r0 = 0
            defpackage.g04.x(r1, r0)
            return
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final boolean isAvailable() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void startCamera(int r4) {
            r3 = this;
            ns3 r4 = new ns3
            r0 = 11
            r1 = 0
            r4.<init>(r3, r1, r0)
            r0 = 3
            o41 r2 = r3.d
            ap6 r4 = defpackage.hv.L(r2, r1, r1, r4, r0)
            r3.e = r4
            return
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void stopCamera(int r2) {
            r1 = this;
            ap6 r2 = r1.e
            r0 = 0
            if (r2 == 0) goto L8
            r2.h(r0)
        L8:
            r1.e = r0
            return
    }
}
