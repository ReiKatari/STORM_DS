package me.magnum.melonds.translator.capture;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ScreenCaptureService extends android.app.Service {
    public static volatile boolean A;
    public static volatile int B;
    public static volatile android.content.Intent L;
    public static android.media.projection.MediaProjection R;
    public static android.hardware.display.VirtualDisplay X;
    public static android.media.ImageReader Y;
    public static final android.os.Handler Z = null;
    public static volatile android.graphics.Bitmap d0;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            me.magnum.melonds.translator.capture.ScreenCaptureService.Z = r0
            return
    }

    public ScreenCaptureService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.app.Service
    public final void onDestroy() {
            r0 = this;
            super.onDestroy()
            defpackage.x31.q()
            return
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent r20, int r21, int r22) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            if (r1 == 0) goto Lc
            java.lang.String r3 = r1.getAction()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            java.lang.String r4 = "me.magnum.melonds.translator.STOP_CAPTURE"
            boolean r3 = defpackage.nb3.k(r3, r4)
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L21
            defpackage.x31.q()
            r0.stopForeground(r5)
            r0.stopSelf()
            return r4
        L21:
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r3 < r6) goto L3f
            defpackage.q66.p()
            android.app.NotificationChannel r6 = defpackage.q66.b()
            defpackage.oc3.m(r6)
            defpackage.oc3.z(r6)
            java.lang.Class<android.app.NotificationManager> r7 = android.app.NotificationManager.class
            java.lang.Object r7 = r0.getSystemService(r7)
            android.app.NotificationManager r7 = (android.app.NotificationManager) r7
            defpackage.oc3.n(r7, r6)
        L3f:
            xg4 r6 = new xg4
            java.lang.String r7 = "storm_ds_screen_capture"
            r6.<init>(r0, r7)
            java.lang.String r7 = "STORM DS Screen Translator"
            java.lang.CharSequence r7 = defpackage.xg4.b(r7)
            r6.e = r7
            java.lang.String r7 = "Screen translation active"
            java.lang.CharSequence r7 = defpackage.xg4.b(r7)
            r6.f = r7
            r7 = 2131230983(0x7f080107, float:1.8078034E38)
            android.app.Notification r8 = r6.t
            r8.icon = r7
            r7 = -1
            r6.h = r7
            r6.c(r4)
            android.app.Notification r6 = r6.a()
            r6.getClass()
            r8 = 29
            r9 = 0
            if (r3 < r8) goto L72
            r10 = 32
            goto L73
        L72:
            r10 = r9
        L73:
            r11 = 34
            if (r3 < r11) goto L7b
            defpackage.rp.x(r0, r6, r10)
            goto L86
        L7b:
            if (r3 < r8) goto L81
            defpackage.rp.v(r0, r6, r10)
            goto L86
        L81:
            r8 = 8842(0x228a, float:1.239E-41)
            r0.startForeground(r8, r6)
        L86:
            int r6 = me.magnum.melonds.translator.capture.ScreenCaptureService.B
            if (r6 == 0) goto L8d
            int r9 = me.magnum.melonds.translator.capture.ScreenCaptureService.B
            goto L95
        L8d:
            if (r1 == 0) goto L95
            java.lang.String r6 = "extra_result_code"
            int r9 = r1.getIntExtra(r6, r9)
        L95:
            android.content.Intent r6 = me.magnum.melonds.translator.capture.ScreenCaptureService.L
            if (r6 != 0) goto Lb3
            r6 = 33
            if (r3 < r6) goto La7
            if (r1 == 0) goto Lb4
            java.lang.Object r1 = defpackage.a81.l(r1)
            r2 = r1
            android.content.Intent r2 = (android.content.Intent) r2
            goto Lb4
        La7:
            if (r1 == 0) goto Lb4
            java.lang.String r2 = "extra_data_intent"
            android.os.Parcelable r1 = r1.getParcelableExtra(r2)
            r2 = r1
            android.content.Intent r2 = (android.content.Intent) r2
            goto Lb4
        Lb3:
            r2 = r6
        Lb4:
            if (r9 != r7) goto L18d
            if (r2 == 0) goto L18d
            android.media.projection.MediaProjection r1 = me.magnum.melonds.translator.capture.ScreenCaptureService.R
            if (r1 != 0) goto L18d
            java.lang.String r1 = "ScreenCaptureService"
            java.lang.String r6 = "MediaProjection and VirtualDisplay successfully initialized ("
            java.lang.String r7 = "media_projection"
            java.lang.Object r7 = r0.getSystemService(r7)     // Catch: java.lang.Throwable -> Ld8
            r7.getClass()     // Catch: java.lang.Throwable -> Ld8
            android.media.projection.MediaProjectionManager r7 = (android.media.projection.MediaProjectionManager) r7     // Catch: java.lang.Throwable -> Ld8
            android.media.projection.MediaProjection r10 = r7.getMediaProjection(r9, r2)     // Catch: java.lang.Throwable -> Ld8
            if (r10 != 0) goto Ldb
            java.lang.String r0 = "MediaProjectionManager.getMediaProjection returned null"
            android.util.Log.e(r1, r0)     // Catch: java.lang.Throwable -> Ld8
            goto L18d
        Ld8:
            r0 = move-exception
            goto L185
        Ldb:
            me.magnum.melonds.translator.capture.ScreenCaptureService.R = r10     // Catch: java.lang.Throwable -> Ld8
            t66 r2 = new t66     // Catch: java.lang.Throwable -> Ld8
            r2.<init>()     // Catch: java.lang.Throwable -> Ld8
            android.os.Handler r7 = me.magnum.melonds.translator.capture.ScreenCaptureService.Z     // Catch: java.lang.Throwable -> Ld8
            r10.registerCallback(r2, r7)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = "window"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch: java.lang.Throwable -> Ld8
            r2.getClass()     // Catch: java.lang.Throwable -> Ld8
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch: java.lang.Throwable -> Ld8
            android.util.DisplayMetrics r8 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> Ld8
            r8.<init>()     // Catch: java.lang.Throwable -> Ld8
            r9 = 30
            if (r3 < r9) goto L11f
            android.view.WindowMetrics r2 = defpackage.m2.n(r2)     // Catch: java.lang.Throwable -> Ld8
            android.graphics.Rect r2 = defpackage.m2.g(r2)     // Catch: java.lang.Throwable -> Ld8
            r2.getClass()     // Catch: java.lang.Throwable -> Ld8
            int r3 = r2.width()     // Catch: java.lang.Throwable -> Ld8
            r8.widthPixels = r3     // Catch: java.lang.Throwable -> Ld8
            int r2 = r2.height()     // Catch: java.lang.Throwable -> Ld8
            r8.heightPixels = r2     // Catch: java.lang.Throwable -> Ld8
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> Ld8
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> Ld8
            int r0 = r0.densityDpi     // Catch: java.lang.Throwable -> Ld8
            r8.densityDpi = r0     // Catch: java.lang.Throwable -> Ld8
            goto L126
        L11f:
            android.view.Display r0 = r2.getDefaultDisplay()     // Catch: java.lang.Throwable -> Ld8
            r0.getRealMetrics(r8)     // Catch: java.lang.Throwable -> Ld8
        L126:
            int r0 = r8.widthPixels     // Catch: java.lang.Throwable -> Ld8
            if (r0 >= r5) goto L12c
            r12 = r5
            goto L12d
        L12c:
            r12 = r0
        L12d:
            int r0 = r8.heightPixels     // Catch: java.lang.Throwable -> Ld8
            if (r0 >= r5) goto L133
            r13 = r5
            goto L134
        L133:
            r13 = r0
        L134:
            int r0 = r8.densityDpi     // Catch: java.lang.Throwable -> Ld8
            if (r0 >= r5) goto L13a
            r14 = r5
            goto L13b
        L13a:
            r14 = r0
        L13b:
            android.media.ImageReader r0 = android.media.ImageReader.newInstance(r12, r13, r5, r4)     // Catch: java.lang.Throwable -> Ld8
            r0.getClass()     // Catch: java.lang.Throwable -> Ld8
            r66 r2 = new r66     // Catch: java.lang.Throwable -> Ld8
            r2.<init>()     // Catch: java.lang.Throwable -> Ld8
            r0.setOnImageAvailableListener(r2, r7)     // Catch: java.lang.Throwable -> Ld8
            me.magnum.melonds.translator.capture.ScreenCaptureService.Y = r0     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r11 = "StormScreenCapture"
            android.view.Surface r16 = r0.getSurface()     // Catch: java.lang.Throwable -> Ld8
            r17 = 0
            r15 = 16
            r18 = r7
            android.hardware.display.VirtualDisplay r0 = r10.createVirtualDisplay(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> Ld8
            me.magnum.melonds.translator.capture.ScreenCaptureService.X = r0     // Catch: java.lang.Throwable -> Ld8
            me.magnum.melonds.translator.capture.ScreenCaptureService.A = r5     // Catch: java.lang.Throwable -> Ld8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld8
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Ld8
            r0.append(r12)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = "x"
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld8
            r0.append(r13)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = " @ "
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld8
            r0.append(r14)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = "dpi)"
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld8
            android.util.Log.i(r1, r0)     // Catch: java.lang.Throwable -> Ld8
            goto L18d
        L185:
            java.lang.String r2 = "Failed to initialize MediaProjection in service"
            android.util.Log.e(r1, r2, r0)
            defpackage.x31.q()
        L18d:
            return r5
    }
}
