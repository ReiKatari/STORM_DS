package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zd  reason: default package */
/* loaded from: classes.dex */
public final class zd extends android.hardware.camera2.CameraCaptureSession.StateCallback {
    public final defpackage.rd a;
    public final defpackage.le0 b;
    public final defpackage.id0 c;
    public final defpackage.u63 d;
    public final android.os.Handler e;
    public final defpackage.xw f;
    public final defpackage.xw g;

    public zd(defpackage.rd r1, defpackage.le0 r2, defpackage.zc6 r3, defpackage.id0 r4, defpackage.u63 r5, android.os.Handler r6) {
            r0 = this;
            r2.getClass()
            r4.getClass()
            r6.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r5
            r0.e = r6
            xw r1 = defpackage.g04.u(r3)
            r0.f = r1
            r1 = 0
            xw r1 = defpackage.g04.u(r1)
            r0.g = r1
            return
    }

    public final defpackage.me0 a(android.hardware.camera2.CameraCaptureSession r4, defpackage.id0 r5) {
            r3 = this;
            xw r0 = r3.g
            java.lang.Object r0 = r0.a
            me0 r0 = (defpackage.me0) r0
            if (r0 == 0) goto L9
            return r0
        L9:
            android.os.Handler r0 = r3.e
            boolean r1 = r4 instanceof android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession
            rd r2 = r3.a
            if (r1 == 0) goto L19
            qd r1 = new qd
            android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession r4 = (android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession) r4
            r1.<init>(r2, r4, r5, r0)
            goto L1e
        L19:
            pd r1 = new pd
            r1.<init>(r2, r4, r5, r0)
        L1e:
            xw r4 = r3.g
            r5 = 0
            boolean r4 = r4.a(r5, r1)
            if (r4 == 0) goto L28
            return r1
        L28:
            xw r3 = r3.g
            java.lang.Object r3 = r3.a
            r3.getClass()
            me0 r3 = (defpackage.me0) r3
            return r3
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(android.hardware.camera2.CameraCaptureSession r3) {
            r2 = this;
            r3.getClass()
            id0 r0 = r2.c
            r2.a(r3, r0)
            le0 r0 = r2.b
            id0 r1 = r2.c
            me0 r3 = r2.a(r3, r1)
            r0.c(r3)
            u63 r3 = r2.d
            if (r3 == 0) goto L3e
            rd r2 = r2.a
            java.lang.String r2 = r2.L
            r2.getClass()
            java.lang.Object r2 = r3.L
            xw r2 = (defpackage.xw) r2
            java.lang.Object r2 = r2.a
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r2.next()
            android.hardware.camera2.CameraCaptureSession$StateCallback r0 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r0
            java.lang.Object r1 = r3.B
            di5 r1 = (defpackage.di5) r1
            r0.onActive(r1)
            goto L2a
        L3e:
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(android.hardware.camera2.CameraCaptureSession r3) {
            r2 = this;
            r3.getClass()
            id0 r0 = r2.c
            r2.a(r3, r0)
            le0 r0 = r2.b
            id0 r1 = r2.c
            me0 r3 = r2.a(r3, r1)
            r0.f(r3)
            u63 r3 = r2.d
            if (r3 == 0) goto L57
            rd r2 = r2.a
            java.lang.String r2 = r2.L
            r2.getClass()
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 < r0) goto L4a
            java.lang.Object r2 = r3.B
            di5 r2 = (defpackage.di5) r2
            java.lang.Object r3 = r3.L
            xw r3 = (defpackage.xw) r3
            r2.getClass()
            r3.getClass()
            java.lang.Object r3 = r3.a
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L3a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r3.next()
            android.hardware.camera2.CameraCaptureSession$StateCallback r0 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r0
            defpackage.au.n(r0, r2)
            goto L3a
        L4a:
            boolean r2 = defpackage.kj2.G()
            if (r2 == 0) goto L57
            java.lang.String r2 = "onCaptureQueueEmpty called for unsupported OS version."
            java.lang.String r3 = "CXCP"
            android.util.Log.e(r3, r2)
        L57:
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(android.hardware.camera2.CameraCaptureSession r3) {
            r2 = this;
            r3.getClass()
            id0 r0 = r2.c
            r2.a(r3, r0)
            me0 r3 = r2.a(r3, r0)
            le0 r0 = r2.b
            r0.d(r3)
            xw r3 = r2.f
            r1 = 0
            java.lang.Object r3 = r3.b(r1)
            zc6 r3 = (defpackage.zc6) r3
            if (r3 == 0) goto L1f
            r3.a()
        L1f:
            r0.a()
            u63 r3 = r2.d
            if (r3 == 0) goto L2d
            rd r2 = r2.a
            java.lang.String r2 = r2.L
            r3.t(r2)
        L2d:
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(android.hardware.camera2.CameraCaptureSession r3) {
            r2 = this;
            r3.getClass()
            id0 r0 = r2.c
            me0 r3 = r2.a(r3, r0)
            le0 r0 = r2.b
            r0.h(r3)
            xw r3 = r2.f
            r1 = 0
            java.lang.Object r3 = r3.b(r1)
            zc6 r3 = (defpackage.zc6) r3
            if (r3 == 0) goto L1c
            r3.a()
        L1c:
            r0.a()
            u63 r3 = r2.d
            if (r3 == 0) goto L2a
            rd r2 = r2.a
            java.lang.String r2 = r2.L
            r3.u(r2)
        L2a:
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(android.hardware.camera2.CameraCaptureSession r2) {
            r1 = this;
            r2.getClass()
            id0 r0 = r1.c
            me0 r2 = r1.a(r2, r0)
            le0 r0 = r1.b
            r0.g(r2)
            xw r2 = r1.f
            r0 = 0
            java.lang.Object r2 = r2.b(r0)
            zc6 r2 = (defpackage.zc6) r2
            if (r2 == 0) goto L1c
            r2.a()
        L1c:
            u63 r2 = r1.d
            if (r2 == 0) goto L27
            rd r1 = r1.a
            java.lang.String r1 = r1.L
            r2.v(r1)
        L27:
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(android.hardware.camera2.CameraCaptureSession r3) {
            r2 = this;
            r3.getClass()
            id0 r0 = r2.c
            r2.a(r3, r0)
            le0 r0 = r2.b
            id0 r1 = r2.c
            me0 r3 = r2.a(r3, r1)
            r0.e(r3)
            u63 r3 = r2.d
            if (r3 == 0) goto L3e
            rd r2 = r2.a
            java.lang.String r2 = r2.L
            r2.getClass()
            java.lang.Object r2 = r3.L
            xw r2 = (defpackage.xw) r2
            java.lang.Object r2 = r2.a
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r2.next()
            android.hardware.camera2.CameraCaptureSession$StateCallback r0 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r0
            java.lang.Object r1 = r3.B
            di5 r1 = (defpackage.di5) r1
            r0.onReady(r1)
            goto L2a
        L3e:
            return
    }
}
