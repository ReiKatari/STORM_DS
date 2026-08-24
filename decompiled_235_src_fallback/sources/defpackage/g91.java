package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g91  reason: default package */
/* loaded from: classes.dex */
public final class g91 implements me.magnum.melonds.common.camera.DSiCameraSource {
    public final java.util.Map a;
    public final defpackage.kd6 b;
    public final defpackage.o41 c;
    public me.magnum.melonds.common.camera.DSiCameraSource d;
    public defpackage.nc1 e;

    public g91(java.util.Map r3, defpackage.kd6 r4) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            r2.b = r4
            xe1 r3 = defpackage.xk1.a
            jv2 r3 = defpackage.e04.a
            jv2 r3 = r3.Y
            o41 r3 = defpackage.g04.i(r3)
            r2.c = r3
            f91 r4 = defpackage.f91.t
            r2.e = r4
            a6 r4 = new a6
            r0 = 13
            r1 = 0
            r4.<init>(r2, r1, r0)
            r2 = 3
            defpackage.hv.L(r3, r1, r1, r4, r2)
            return
    }

    public final void a() {
            r2 = this;
            nc1 r0 = r2.e
            boolean r1 = r0 instanceof defpackage.e91
            if (r1 == 0) goto L11
            me.magnum.melonds.common.camera.DSiCameraSource r2 = r2.d
            if (r2 == 0) goto L11
            e91 r0 = (defpackage.e91) r0
            int r0 = r0.t
            r2.stopCamera(r0)
        L11:
            return
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void captureFrame(int r1, byte[] r2, int r3, int r4, boolean r5) {
            r0 = this;
            r2.getClass()
            me.magnum.melonds.common.camera.DSiCameraSource r0 = r0.d
            if (r0 == 0) goto La
            r0.captureFrame(r1, r2, r3, r4, r5)
        La:
            return
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void dispose() {
            r3 = this;
            r0 = 0
            r3.d = r0
            java.util.Map r1 = r3.a
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()
            me.magnum.melonds.common.camera.DSiCameraSource r2 = (me.magnum.melonds.common.camera.DSiCameraSource) r2
            r2.dispose()
            goto Lf
        L1f:
            o41 r3 = r3.c
            defpackage.g04.x(r3, r0)
            return
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final boolean isAvailable() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void startCamera(int r2) {
            r1 = this;
            e91 r0 = new e91
            r0.<init>(r2)
            r1.e = r0
            me.magnum.melonds.common.camera.DSiCameraSource r1 = r1.d
            if (r1 == 0) goto Le
            r1.startCamera(r2)
        Le:
            return
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void stopCamera(int r2) {
            r1 = this;
            f91 r0 = defpackage.f91.t
            r1.e = r0
            me.magnum.melonds.common.camera.DSiCameraSource r1 = r1.d
            if (r1 == 0) goto Lb
            r1.stopCamera(r2)
        Lb:
            return
    }
}
