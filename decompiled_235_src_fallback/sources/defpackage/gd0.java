package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gd0  reason: default package */
/* loaded from: classes.dex */
public final class gd0 {
    public final defpackage.t57 a;
    public final defpackage.nd0 b;
    public final defpackage.mp5 c;

    public gd0(defpackage.t57 r1, defpackage.nd0 r2, defpackage.mp5 r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static final void a(defpackage.gd0 r5, defpackage.bf0 r6) {
            android.graphics.SurfaceTexture r5 = new android.graphics.SurfaceTexture
            r0 = 0
            r5.<init>(r0)
            r1 = 640(0x280, float:8.97E-43)
            r2 = 480(0x1e0, float:6.73E-43)
            r5.setDefaultBufferSize(r1, r2)
            android.view.Surface r1 = new android.view.Surface
            r1.<init>(r5)
            sw r0 = defpackage.g04.s(r0)
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r3 = 1
            r2.<init>(r3)
            fd0 r3 = new fd0
            r3.<init>(r2, r0, r1, r5)
            java.util.List r4 = defpackage.hf.b0(r1)
            boolean r6 = r6.N(r4, r3)
            if (r6 == 0) goto L2f
            r2.await()
            return
        L2f:
            java.lang.String r6 = "CXCP"
            java.lang.String r2 = "Failed to create a blank capture session! Surfaces may not be disconnected properly."
            android.util.Log.e(r6, r2)
            boolean r6 = r0.a()
            if (r6 == 0) goto L42
            r1.release()
            r5.release()
        L42:
            return
    }

    public final void b(defpackage.bf0 r7, android.hardware.camera2.CameraDevice r8, defpackage.vd r9, defpackage.bx r10, boolean r11, boolean r12) {
            r6 = this;
            r10.getClass()
            r0 = 0
            java.lang.Class<android.hardware.camera2.CameraDevice> r1 = android.hardware.camera2.CameraDevice.class
            if (r7 == 0) goto L13
            ar0 r2 = defpackage.gh5.a(r1)
            java.lang.Object r2 = r7.e(r2)
            android.hardware.camera2.CameraDevice r2 = (android.hardware.camera2.CameraDevice) r2
            goto L14
        L13:
            r2 = r0
        L14:
            if (r2 == 0) goto L11a
            java.lang.String r3 = r2.getId()
            r3.getClass()
            defpackage.xf0.a(r3)
            if (r8 == 0) goto L4f
            java.lang.String r4 = r8.getId()
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L2d
            goto L4f
        L2d:
            java.lang.String r6 = "Unwrapped camera device has camera ID "
            java.lang.String r7 = ", but the wrapped camera device has camera ID "
            java.lang.StringBuilder r6 = defpackage.i61.t(r6, r3, r7)
            java.lang.String r7 = r8.getId()
            r6.append(r7)
            r7 = 33
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L4f:
            int r8 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r8 < r3) goto L60
            r7.getClass()
            if (r8 >= r3) goto L5b
            goto L60
        L5b:
            java.util.concurrent.CopyOnWriteArrayList r8 = r10.e
            r8.remove(r7)
        L60:
            java.lang.String r8 = "Creating an empty capture session before closing "
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r3 = "handleQuirksBeforeClosing("
            r10.<init>(r3)
            r10.append(r2)
            r3 = 41
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            java.lang.String r3 = "CXCP"
            android.util.Log.d(r3, r10)
            java.lang.String r10 = r7.h()
            if (r11 == 0) goto L9c
            java.lang.String r4 = "Camera2DeviceCloserImpl#reopenCameraDevice"
            android.os.Trace.beginSection(r4)     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = "Reopening camera device"
            android.util.Log.d(r3, r4)     // Catch: java.lang.Throwable -> L97
            r6.c(r2, r9)     // Catch: java.lang.Throwable -> L97
            mp5 r4 = r6.c     // Catch: java.lang.Throwable -> L97
            uz r4 = r4.a(r10, r6)     // Catch: java.lang.Throwable -> L97
            android.os.Trace.endSection()
            goto La1
        L97:
            r6 = move-exception
            android.os.Trace.endSection()
            throw r6
        L9c:
            uz r4 = new uz
            r4.<init>(r7, r9)
        La1:
            bf0 r5 = r4.a
            vd r4 = r4.b
            if (r5 == 0) goto Ldb
            if (r4 != 0) goto Laa
            goto Ldb
        Laa:
            if (r12 == 0) goto Ld5
            java.lang.String r12 = "Camera2DeviceCloserImpl#createCaptureSession"
            android.os.Trace.beginSection(r12)     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            r12.<init>(r8)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r8 = defpackage.xf0.b(r10)     // Catch: java.lang.Throwable -> Ld0
            r12.append(r8)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r8 = r12.toString()     // Catch: java.lang.Throwable -> Ld0
            android.util.Log.d(r3, r8)     // Catch: java.lang.Throwable -> Ld0
            a(r6, r5)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r8 = "Created an empty capture session."
            android.util.Log.d(r3, r8)     // Catch: java.lang.Throwable -> Ld0
            android.os.Trace.endSection()
            goto Ld5
        Ld0:
            r6 = move-exception
            android.os.Trace.endSection()
            throw r6
        Ld5:
            vr4 r0 = new vr4
            r0.<init>(r5, r4)
            goto Le0
        Ldb:
            java.lang.String r8 = "Failed to retain an opened camera device!"
            android.util.Log.e(r3, r8)
        Le0:
            if (r0 != 0) goto Lf1
            java.lang.String r6 = "Failed to handle quirks before closing the camera device!"
            android.util.Log.e(r3, r6)
            r7.u()
            r7.a0()
            r9.d(r2)
            return
        Lf1:
            java.lang.Object r8 = r0.A
            bf0 r8 = (defpackage.bf0) r8
            java.lang.Object r10 = r0.B
            vd r10 = (defpackage.vd) r10
            ar0 r12 = defpackage.gh5.a(r1)
            java.lang.Object r8 = r8.e(r12)
            if (r8 == 0) goto L114
            android.hardware.camera2.CameraDevice r8 = (android.hardware.camera2.CameraDevice) r8
            r7.u()
            r6.c(r8, r10)
            r7.a0()
            if (r11 == 0) goto L11f
            r9.d(r2)
            return
        L114:
            java.lang.String r6 = "Required value was null."
            defpackage.i.m(r6)
            return
        L11a:
            if (r8 == 0) goto L11f
            r6.c(r8, r9)
        L11f:
            return
    }

    public final void c(android.hardware.camera2.CameraDevice r8, defpackage.vd r9) {
            r7 = this;
            java.lang.String r0 = r8.getId()
            r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "closeCameraDevice("
            r1.<init>(r2)
            r1.append(r0)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "CXCP"
            android.util.Log.d(r2, r1)
            zg5 r1 = new zg5
            r1.<init>()
            en r3 = new en
            r4 = 0
            r5 = 1
            r3.<init>(r8, r1, r4, r5)
            t57 r4 = r7.a
            r5 = 7000(0x1b58, double:3.4585E-320)
            java.lang.Object r3 = r4.b(r5, r3)
            jg7 r3 = (defpackage.jg7) r3
            if (r3 != 0) goto L4d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to close CameraDevice("
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ") after 7000ms. The camera is likely in a bad state."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r2, r0)
        L4d:
            java.lang.String r8 = r8.getId()
            r8.getClass()
            defpackage.xf0.a(r8)
            nd0 r7 = r7.b
            r7.getClass()
            ks6 r0 = r7.b
            r0.getClass()
            kg0 r0 = defpackage.lg0.g
            ld0 r7 = r7.a
            lg0 r7 = r7.d(r8)
            r0.getClass()
            boolean r7 = defpackage.kg0.c(r7)
            if (r7 == 0) goto Lc7
            boolean r7 = r1.A
            if (r7 == 0) goto Lc7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Waiting for OnClosed from "
            r7.<init>(r0)
            java.lang.String r0 = defpackage.xf0.b(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r2, r7)
            java.util.concurrent.CountDownLatch r7 = r9.r
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0 = 2000(0x7d0, double:9.88E-321)
            boolean r7 = r7.await(r0, r9)
            if (r7 == 0) goto Lad
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "Received OnClosed for "
            r7.<init>(r9)
            java.lang.String r8 = defpackage.xf0.b(r8)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r2, r7)
            return
        Lad:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed to close "
            r7.<init>(r9)
            java.lang.String r8 = defpackage.xf0.b(r8)
            r7.append(r8)
            java.lang.String r8 = " after 2000ms!"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.w(r2, r7)
        Lc7:
            return
    }
}
