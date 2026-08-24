package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ld0  reason: default package */
/* loaded from: classes.dex */
public final class ld0 {
    public final android.content.Context a;
    public final defpackage.t57 b;
    public final defpackage.vv4 c;
    public final defpackage.u63 d;
    public final defpackage.yx6 e;
    public final android.util.ArrayMap f;
    public final android.util.ArrayMap g;
    public final android.util.ArrayMap h;

    public ld0(android.content.Context r1, defpackage.t57 r2, defpackage.vv4 r3, defpackage.u63 r4, defpackage.yx6 r5) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            android.util.ArrayMap r1 = new android.util.ArrayMap
            r1.<init>()
            r0.f = r1
            android.util.ArrayMap r1 = new android.util.ArrayMap
            r1.<init>()
            r0.g = r1
            android.util.ArrayMap r1 = new android.util.ArrayMap
            r1.<init>()
            r0.h = r1
            return
    }

    public static final defpackage.nc0 a(defpackage.ld0 r8, java.lang.String r9, boolean r10, int r11) {
            java.lang.String r0 = "CXCP"
            java.lang.String r1 = "Failed to load extension metadata for "
            java.lang.String r2 = "Loaded extension metadata for "
            java.lang.String r3 = "Loading extension metadata for "
            yx6 r4 = r8.e
            r4.getClass()
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = defpackage.xf0.b(r9)
            r6.append(r7)
            java.lang.String r7 = "#readCameraExtensionMetadata"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.os.Trace.beginSection(r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = defpackage.xf0.b(r9)     // Catch: java.lang.Throwable -> L50
            r6.append(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L50
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L50
            android.hardware.camera2.CameraExtensionCharacteristics r8 = r8.e(r9)     // Catch: java.lang.Throwable -> L50
            nc0 r3 = new nc0     // Catch: java.lang.Throwable -> L50
            r3.<init>(r9, r11, r8)     // Catch: java.lang.Throwable -> L50
            long r6 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L50
            long r6 = r6 - r4
            r8 = 1
            if (r10 != 0) goto L52
            java.lang.String r10 = ""
            goto L56
        L50:
            r8 = move-exception
            goto L98
        L52:
            if (r10 != r8) goto L92
            java.lang.String r10 = " (redacted)"
        L56:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r11.<init>(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = defpackage.xf0.b(r9)     // Catch: java.lang.Throwable -> L50
            r11.append(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = " in "
            r11.append(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = "%.3f ms"
            double r4 = (double) r6     // Catch: java.lang.Throwable -> L50
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 / r6
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r4, r8)     // Catch: java.lang.Throwable -> L50
            r4 = 0
            java.lang.String r8 = java.lang.String.format(r4, r2, r8)     // Catch: java.lang.Throwable -> L50
            r11.append(r8)     // Catch: java.lang.Throwable -> L50
            r11.append(r10)     // Catch: java.lang.Throwable -> L50
            java.lang.String r8 = r11.toString()     // Catch: java.lang.Throwable -> L50
            android.util.Log.i(r0, r8)     // Catch: java.lang.Throwable -> L50
            android.os.Trace.endSection()
            return r3
        L92:
            ug r8 = new ug     // Catch: java.lang.Throwable -> L50
            r8.<init>()     // Catch: java.lang.Throwable -> L50
            throw r8     // Catch: java.lang.Throwable -> L50
        L98:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb3
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r11.<init>(r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r9 = defpackage.xf0.b(r9)     // Catch: java.lang.Throwable -> Lb3
            r11.append(r9)     // Catch: java.lang.Throwable -> Lb3
            r9 = 33
            r11.append(r9)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> Lb3
            r10.<init>(r9, r8)     // Catch: java.lang.Throwable -> Lb3
            throw r10     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
    }

    public static final defpackage.qc0 b(defpackage.ld0 r11, java.lang.String r12, boolean r13) {
            u63 r0 = r11.d
            java.lang.String r1 = "CXCP"
            java.lang.String r2 = "Failed to load metadata for "
            java.lang.String r3 = "Loaded metadata for "
            java.lang.String r4 = "Loading metadata for "
            yx6 r5 = r11.e
            r5.getClass()
            long r5 = android.os.SystemClock.elapsedRealtimeNanos()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = defpackage.xf0.b(r12)
            r7.append(r8)
            java.lang.String r8 = "#readCameraMetadata"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.os.Trace.beginSection(r7)     // Catch: java.lang.Throwable -> L141
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = defpackage.xf0.b(r12)     // Catch: java.lang.Throwable -> L77
            r8.append(r4)     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L77
            android.util.Log.d(r1, r4)     // Catch: java.lang.Throwable -> L77
            android.content.Context r4 = r11.a     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = "camera"
            java.lang.Object r4 = r4.getSystemService(r8)     // Catch: java.lang.Throwable -> L77
            r4.getClass()     // Catch: java.lang.Throwable -> L77
            android.hardware.camera2.CameraManager r4 = (android.hardware.camera2.CameraManager) r4     // Catch: java.lang.Throwable -> L77
            android.hardware.camera2.CameraCharacteristics r4 = r4.getCameraCharacteristics(r12)     // Catch: java.lang.Throwable -> L77
            r4.getClass()     // Catch: java.lang.Throwable -> L77
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L77
            r9 = 32
            if (r8 < r9) goto L81
            android.hardware.camera2.CameraCharacteristics$Key r8 = defpackage.n2.a()     // Catch: java.lang.Throwable -> L77
            java.lang.Object r8 = r4.get(r8)     // Catch: java.lang.Throwable -> L77
            if (r8 == 0) goto L81
            java.lang.Object r8 = r0.L     // Catch: java.lang.Throwable -> L77
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L77
            xf0 r9 = new xf0     // Catch: java.lang.Throwable -> L77
            r9.<init>(r12)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r8 = r8.get(r9)     // Catch: java.lang.Throwable -> L77
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L77
            if (r8 != 0) goto L7a
            du1 r8 = defpackage.du1.A     // Catch: java.lang.Throwable -> L77
            goto L7a
        L77:
            r11 = move-exception
            goto Lf6
        L7a:
            android.hardware.camera2.CameraCharacteristics$Key r9 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION     // Catch: java.lang.Throwable -> L77
            java.util.LinkedHashSet r8 = defpackage.ii2.L(r8, r9)     // Catch: java.lang.Throwable -> L77
            goto L90
        L81:
            java.lang.Object r8 = r0.L     // Catch: java.lang.Throwable -> L77
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L77
            xf0 r9 = new xf0     // Catch: java.lang.Throwable -> L77
            r9.<init>(r12)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r8 = r8.get(r9)     // Catch: java.lang.Throwable -> L77
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L77
        L90:
            if (r8 != 0) goto L97
            java.lang.Object r0 = r0.B     // Catch: java.lang.Throwable -> L77
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L77
            goto La1
        L97:
            java.lang.Object r0 = r0.B     // Catch: java.lang.Throwable -> L77
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L77
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L77
            java.util.LinkedHashSet r0 = defpackage.ii2.K(r0, r8)     // Catch: java.lang.Throwable -> L77
        La1:
            qc0 r8 = new qc0     // Catch: java.lang.Throwable -> L77
            r8.<init>(r12, r4, r11, r0)     // Catch: java.lang.Throwable -> L77
            long r9 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L77
            long r9 = r9 - r5
            r11 = 1
            if (r13 != 0) goto Lb1
            java.lang.String r13 = ""
            goto Lb5
        Lb1:
            if (r13 != r11) goto Lf0
            java.lang.String r13 = " (redacted)"
        Lb5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.String r3 = defpackage.xf0.b(r12)     // Catch: java.lang.Throwable -> L77
            r0.append(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.String r3 = " in "
            r0.append(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.String r3 = "%.3f ms"
            double r4 = (double) r9     // Catch: java.lang.Throwable -> L77
            r9 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 / r9
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Throwable -> L77
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L77
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r4, r11)     // Catch: java.lang.Throwable -> L77
            java.lang.String r11 = java.lang.String.format(r7, r3, r11)     // Catch: java.lang.Throwable -> L77
            r0.append(r11)     // Catch: java.lang.Throwable -> L77
            r0.append(r13)     // Catch: java.lang.Throwable -> L77
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> L77
            android.util.Log.i(r1, r11)     // Catch: java.lang.Throwable -> L77
            android.os.Trace.endSection()
            return r8
        Lf0:
            ug r11 = new ug     // Catch: java.lang.Throwable -> L77
            r11.<init>()     // Catch: java.lang.Throwable -> L77
            throw r11     // Catch: java.lang.Throwable -> L77
        Lf6:
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L141
            r0 = 28
            if (r13 != r0) goto L126
            boolean r13 = r11 instanceof java.lang.RuntimeException     // Catch: java.lang.Throwable -> L141
            r0 = 0
            if (r13 != 0) goto L102
            goto L11c
        L102:
            r13 = r11
            java.lang.RuntimeException r13 = (java.lang.RuntimeException) r13     // Catch: java.lang.Throwable -> L141
            java.lang.StackTraceElement[] r13 = r13.getStackTrace()     // Catch: java.lang.Throwable -> L141
            r13.getClass()     // Catch: java.lang.Throwable -> L141
            int r1 = r13.length     // Catch: java.lang.Throwable -> L141
            if (r1 != 0) goto L110
            goto L116
        L110:
            r13 = r13[r0]     // Catch: java.lang.Throwable -> L141
            java.lang.String r7 = r13.getMethodName()     // Catch: java.lang.Throwable -> L141
        L116:
            java.lang.String r13 = "_enableShutterSound"
            boolean r0 = defpackage.nb3.k(r7, r13)     // Catch: java.lang.Throwable -> L141
        L11c:
            if (r0 == 0) goto L126
            xl1 r11 = new xl1     // Catch: java.lang.Throwable -> L141
            java.lang.String r12 = "Failed to load metadata: Do Not Disturb mode is on!"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L141
            throw r11     // Catch: java.lang.Throwable -> L141
        L126:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L141
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L141
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L141
            java.lang.String r12 = defpackage.xf0.b(r12)     // Catch: java.lang.Throwable -> L141
            r0.append(r12)     // Catch: java.lang.Throwable -> L141
            r12 = 33
            r0.append(r12)     // Catch: java.lang.Throwable -> L141
            java.lang.String r12 = r0.toString()     // Catch: java.lang.Throwable -> L141
            r13.<init>(r12, r11)     // Catch: java.lang.Throwable -> L141
            throw r13     // Catch: java.lang.Throwable -> L141
        L141:
            r11 = move-exception
            android.os.Trace.endSection()
            throw r11
    }

    public static final boolean c(defpackage.ld0 r3) {
            vv4 r3 = r3.c
            r3.getClass()
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "robolectric"
            boolean r0 = defpackage.nb3.k(r0, r1)
            r1 = 1
            if (r0 == 0) goto L12
            r3 = r1
            goto L2c
        L12:
            boolean r0 = r3.b
            if (r0 != 0) goto L2a
            java.lang.String r0 = "CXCP#checkCameraPermission"
            android.os.Trace.beginSection(r0)
            android.content.Context r0 = r3.a
            java.lang.String r2 = "android.permission.CAMERA"
            int r0 = r0.checkSelfPermission(r2)
            if (r0 != 0) goto L27
            r3.b = r1
        L27:
            android.os.Trace.endSection()
        L2a:
            boolean r3 = r3.b
        L2c:
            r3 = r3 ^ r1
            return r3
    }

    public final defpackage.lg0 d(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = defpackage.xf0.b(r3)
            r0.append(r1)
            java.lang.String r1 = "#awaitMetadata"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L49
            android.util.ArrayMap r0 = r2.f     // Catch: java.lang.Throwable -> L49
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L49
            android.util.ArrayMap r1 = r2.f     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L3b
            lg0 r1 = (defpackage.lg0) r1     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            goto L43
        L2a:
            boolean r1 = c(r2)     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L3d
            r1 = 0
            qc0 r1 = b(r2, r3, r1)     // Catch: java.lang.Throwable -> L3b
            android.util.ArrayMap r2 = r2.f     // Catch: java.lang.Throwable -> L3b
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L3b
            goto L28
        L3b:
            r2 = move-exception
            goto L47
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            r0 = 1
            qc0 r1 = b(r2, r3, r0)     // Catch: java.lang.Throwable -> L49
        L43:
            android.os.Trace.endSection()
            return r1
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r2     // Catch: java.lang.Throwable -> L49
        L49:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
    }

    public final android.hardware.camera2.CameraExtensionCharacteristics e(java.lang.String r4) {
            r3 = this;
            android.util.ArrayMap r0 = r3.h
            monitor-enter(r0)
            android.util.ArrayMap r1 = r3.h     // Catch: java.lang.Throwable -> L41
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L41
            android.hardware.camera2.CameraExtensionCharacteristics r1 = defpackage.ma.e(r1)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L11
            monitor-exit(r0)
            return r1
        L11:
            monitor-exit(r0)
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Retrieving CameraExtensionCharacteristics for "
            r1.<init>(r2)
            java.lang.String r2 = defpackage.xf0.b(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            android.content.Context r3 = r3.a
            java.lang.String r0 = "camera"
            java.lang.Object r3 = r3.getSystemService(r0)
            r3.getClass()
            android.hardware.camera2.CameraManager r3 = (android.hardware.camera2.CameraManager) r3
            r4.getClass()
            android.hardware.camera2.CameraExtensionCharacteristics r3 = defpackage.ma.d(r3, r4)
            r3.getClass()
            return r3
        L41:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }
}
