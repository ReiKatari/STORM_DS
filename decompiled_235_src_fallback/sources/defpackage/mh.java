package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mh  reason: default package */
/* loaded from: classes.dex */
public final class mh implements defpackage.sk0 {
    public final defpackage.t57 a;
    public final defpackage.kf0 b;
    public final defpackage.jr6 c;
    public final defpackage.ld0 d;
    public final defpackage.ks6 e;

    public mh(defpackage.t57 r1, defpackage.kf0 r2, defpackage.jr6 r3, defpackage.ld0 r4, defpackage.ks6 r5) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r4.getClass()
            r5.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    @Override // defpackage.sk0
    public final defpackage.rk0 a(defpackage.bf0 r13, java.util.Map r14, defpackage.yk0 r15) {
            r12 = this;
            r13.getClass()
            r14.getClass()
            r15.getClass()
            kf0 r2 = r12.b
            int r3 = r2.h
            r4 = 2
            r6 = 0
            if (r3 != r4) goto L1e1
            java.util.Map r2 = r2.g
            k54 r3 = defpackage.ug0.a
            java.lang.Object r2 = r2.get(r3)
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L20
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L21
        L20:
            r2 = r6
        L21:
            if (r2 == 0) goto L1db
            int r2 = r2.intValue()
            kf0 r3 = r12.b
            java.util.ArrayList r3 = r3.d
            if (r3 != 0) goto L1d5
            ld0 r3 = r12.d
            java.lang.String r4 = r13.h()
            lg0 r3 = r3.d(r4)
            qc0 r3 = (defpackage.qc0) r3
            go3 r4 = r3.Z
            java.lang.Object r4 = r4.getValue()
            java.util.Set r4 = (java.util.Set) r4
            ks6 r7 = r12.e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            boolean r8 = r4.contains(r8)
            if (r8 != 0) goto L71
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r13)
            java.lang.String r9 = " does not support extension mode "
            r8.append(r9)
            r8.append(r2)
            java.lang.String r9 = ". Supported extensions are "
            r8.append(r9)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r7.getClass()
            java.lang.String r7 = "CXCP"
            android.util.Log.w(r7, r4)
        L71:
            kf0 r4 = r12.b
            ji0 r4 = r4.e
            if (r4 == 0) goto L13d
            android.util.ArrayMap r4 = r3.Y
            monitor-enter(r4)
            android.util.ArrayMap r7 = r3.Y     // Catch: java.lang.Throwable -> L13a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L13a
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Throwable -> L13a
            nc0 r7 = (defpackage.nc0) r7     // Catch: java.lang.Throwable -> L13a
            monitor-exit(r4)
            r4 = 1
            if (r7 == 0) goto L8b
            goto Le8
        L8b:
            ld0 r7 = r3.L
            java.lang.String r8 = r3.A
            r8.getClass()
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 31
            if (r9 < r10) goto L12e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = defpackage.xf0.b(r8)
            r9.append(r10)
            java.lang.String r10 = "#awaitExtensionMetadata"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.os.Trace.beginSection(r9)     // Catch: java.lang.Throwable -> L129
            android.util.ArrayMap r9 = r7.g     // Catch: java.lang.Throwable -> L129
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L129
            android.util.ArrayMap r10 = r7.g     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r10 = r10.get(r8)     // Catch: java.lang.Throwable -> Ld1
            nc0 r10 = (defpackage.nc0) r10     // Catch: java.lang.Throwable -> Ld1
            if (r10 == 0) goto Lc0
        Lbd:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L129
            r7 = r10
            goto Ld8
        Lc0:
            boolean r10 = defpackage.ld0.c(r7)     // Catch: java.lang.Throwable -> Ld1
            if (r10 != 0) goto Ld3
            r10 = 0
            nc0 r10 = defpackage.ld0.a(r7, r8, r10, r2)     // Catch: java.lang.Throwable -> Ld1
            android.util.ArrayMap r7 = r7.g     // Catch: java.lang.Throwable -> Ld1
            r7.put(r8, r10)     // Catch: java.lang.Throwable -> Ld1
            goto Lbd
        Ld1:
            r0 = move-exception
            goto L127
        Ld3:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L129
            nc0 r7 = defpackage.ld0.a(r7, r8, r4, r2)     // Catch: java.lang.Throwable -> L129
        Ld8:
            android.os.Trace.endSection()
            android.util.ArrayMap r8 = r3.Y
            monitor-enter(r8)
            android.util.ArrayMap r3 = r3.Y     // Catch: java.lang.Throwable -> L124
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L124
            r3.put(r9, r7)     // Catch: java.lang.Throwable -> L124
            monitor-exit(r8)
        Le8:
            ks6 r3 = r12.e
            go3 r7 = r7.R
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L111
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r13)
            java.lang.String r8 = " does not support Postview streams"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r3.getClass()
            java.lang.String r3 = "CXCP"
            android.util.Log.w(r3, r7)
        L111:
            kf0 r3 = r12.b
            ji0 r3 = r3.e
            java.util.List r3 = r3.a
            int r3 = r3.size()
            if (r3 != r4) goto L11e
            goto L13d
        L11e:
            java.lang.String r0 = "Postview streams can only have one OutputStream.config object"
            defpackage.i.m(r0)
            return r6
        L124:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L127:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L129
            throw r0     // Catch: java.lang.Throwable -> L129
        L129:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L12e:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Extension sessions are only supported on Android S or higher. Device SDK is "
            java.lang.String r1 = defpackage.lb1.g(r9, r1)
            r0.<init>(r1)
            throw r0
        L13a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L13d:
            kf0 r3 = r12.b
            jr6 r4 = r12.c
            cp4 r11 = defpackage.l.k(r3, r4, r14)
            java.util.ArrayList r3 = r11.a
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L168
            java.lang.String r1 = "CXCP"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to create OutputConfigurations for "
            r2.<init>(r3)
            kf0 r0 = r12.b
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r1, r0)
            r15.a()
            d90 r0 = defpackage.d90.q0
            return r0
        L168:
            java.util.LinkedHashMap r3 = r11.b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L1cf
            l82 r9 = new l82
            r9.<init>(r15)
            r3 = r2
            k82 r2 = new k82
            r4 = r3
            java.util.ArrayList r3 = r11.a
            r6 = r4
            pi r4 = new pi
            t57 r7 = r12.a
            android.os.Handler r7 = r7.a()
            r4.<init>(r7)
            kf0 r0 = r12.b
            r7 = r6
            int r6 = r0.f
            java.util.Map r0 = r0.g
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            xi r10 = r11.c
            r5 = r15
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = r13.e0(r2)
            if (r0 != 0) goto L1c5
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to create ExtensionCaptureSession from "
            r2.<init>(r3)
            r2.append(r13)
            java.lang.String r1 = " for "
            r2.append(r1)
            r2.append(r15)
            r1 = 33
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r0, r1)
            r15.a()
            d90 r0 = defpackage.d90.q0
            return r0
        L1c5:
            qk0 r0 = new qk0
            java.util.LinkedHashMap r1 = r11.b
            java.util.LinkedHashMap r2 = r11.d
            r0.<init>(r1, r2)
            return r0
        L1cf:
            java.lang.String r0 = "Deferred output is not supported for Extensions"
            defpackage.i.m(r0)
            return r6
        L1d5:
            java.lang.String r0 = "Reprocessing is not supported for Extensions"
            defpackage.i.m(r0)
            return r6
        L1db:
            java.lang.String r0 = "The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph."
            defpackage.i.m(r0)
            return r6
        L1e1:
            java.lang.String r1 = "Unsupported session mode: "
            kf0 r0 = r12.b
            int r0 = r0.h
            java.lang.String r0 = defpackage.q60.Z(r0)
            java.lang.String r2 = " for Extension CameraGraph"
            defpackage.u34.h(r0, r2, r1)
            return r6
    }
}
