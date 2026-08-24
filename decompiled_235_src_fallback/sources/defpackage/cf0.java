package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cf0  reason: default package */
/* loaded from: classes.dex */
public final class cf0 {
    public final defpackage.rd0 a;

    public cf0(defpackage.rd0 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            return
    }

    public static java.util.ArrayList a(defpackage.cf0 r3) {
            xb0 r3 = r3.d()
            ed0 r3 = r3.b
            java.lang.Object r0 = r3.f
            monitor-enter(r0)
            java.util.ArrayList r1 = r3.g     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            if (r1 == 0) goto Lf
            goto L13
        Lf:
            java.util.ArrayList r1 = r3.d()
        L13:
            if (r1 != 0) goto L2e
            java.lang.String r3 = "CXCP"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to load cameraIds from "
            r0.<init>(r2)
            java.lang.String r2 = "CXCP-Camera2"
            java.lang.String r2 = defpackage.qd0.a(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
        L2e:
            return r1
        L2f:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public static defpackage.lg0 b(defpackage.cf0 r0, java.lang.String r1) {
            r0.getClass()
            r1.getClass()
            xb0 r0 = r0.d()
            ld0 r0 = r0.c
            lg0 r0 = r0.d(r1)
            return r0
    }

    public static java.util.Set c(defpackage.cf0 r6) {
            xb0 r6 = r6.d()
            ed0 r6 = r6.b
            java.lang.String r0 = "Loaded ConcurrentCameraIdsSet "
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 >= r2) goto L14
            r6.getClass()
            du1 r6 = defpackage.du1.A
            return r6
        L14:
            java.lang.Object r1 = r6.f
            monitor-enter(r1)
            monitor-exit(r1)
            n55 r6 = r6.a
            java.lang.Object r6 = r6.get()
            android.hardware.camera2.CameraManager r6 = (android.hardware.camera2.CameraManager) r6
            r6.getClass()     // Catch: android.hardware.camera2.CameraAccessException -> L8c
            java.util.Set r6 = defpackage.m2.r(r6)     // Catch: android.hardware.camera2.CameraAccessException -> L8c
            r6.getClass()     // Catch: android.hardware.camera2.CameraAccessException -> L8c
            java.lang.String r1 = "CXCP"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.hardware.camera2.CameraAccessException -> L8c
            r2.<init>(r0)     // Catch: android.hardware.camera2.CameraAccessException -> L8c
            r2.append(r6)     // Catch: android.hardware.camera2.CameraAccessException -> L8c
            java.lang.String r0 = r2.toString()     // Catch: android.hardware.camera2.CameraAccessException -> L8c
            android.util.Log.d(r1, r0)     // Catch: android.hardware.camera2.CameraAccessException -> L8c
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r2 = defpackage.ht0.v0(r6, r1)
            r0.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L4c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L87
            java.lang.Object r2 = r6.next()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = defpackage.ht0.v0(r2, r1)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L67:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            defpackage.xf0.a(r4)
            xf0 r5 = new xf0
            r5.<init>(r4)
            r3.add(r5)
            goto L67
        L7f:
            java.util.Set r2 = defpackage.gt0.p1(r3)
            r0.add(r2)
            goto L4c
        L87:
            java.util.Set r6 = defpackage.gt0.p1(r0)
            return r6
        L8c:
            r6 = move-exception
            java.lang.String r0 = "CXCP"
            java.lang.String r1 = "Failed to query CameraManager#getConcurrentStreamingCameraIds"
            android.util.Log.w(r0, r1, r6)
            r6 = 0
            return r6
    }

    public final defpackage.xb0 d() {
            r2 = this;
            rd0 r2 = r2.a
            java.lang.String r0 = "Failed to load CameraBackend "
            java.lang.String r1 = "getCameraBackend"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> L34
            xb0 r1 = r2.d     // Catch: java.lang.Throwable -> L34
            r1.getClass()     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "CXCP-Camera2"
            xb0 r2 = r2.a(r1)     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L1a
            android.os.Trace.endSection()
            return r2
        L1a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = defpackage.qd0.a(r1)     // Catch: java.lang.Throwable -> L34
            r2.append(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L34
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L34
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L34
            throw r0     // Catch: java.lang.Throwable -> L34
        L34:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
    }
}
