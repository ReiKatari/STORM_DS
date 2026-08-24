package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rd  reason: default package */
/* loaded from: classes.dex */
public final class rd implements defpackage.bf0 {
    public final defpackage.lg0 A;
    public final android.hardware.camera2.CameraDevice B;
    public final java.lang.String L;
    public final defpackage.id0 R;
    public final defpackage.u63 X;
    public final defpackage.t57 Y;
    public final defpackage.sw Z;
    public final defpackage.xw d0;

    public rd(defpackage.lg0 r1, android.hardware.camera2.CameraDevice r2, java.lang.String r3, defpackage.id0 r4, defpackage.u63 r5, defpackage.t57 r6) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r4.getClass()
            r6.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r0.Y = r6
            r1 = 0
            sw r1 = defpackage.g04.s(r1)
            r0.Z = r1
            r1 = 0
            xw r1 = defpackage.g04.u(r1)
            r0.d0 = r1
            return
    }

    @Override // defpackage.bf0
    public final boolean A(defpackage.uc6 r26) {
            r25 = this;
            r1 = r25
            r7 = r26
            java.lang.String r8 = "%.3f ms"
            java.lang.String r9 = " - "
            android.hardware.camera2.CameraDevice r10 = r1.B
            java.lang.String r11 = "CXCP"
            java.util.List r12 = r7.b
            le0 r0 = r7.e
            vr4 r0 = r1.a(r0)
            java.lang.Object r2 = r0.A
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Object r0 = r0.B
            r3 = r0
            zc6 r3 = (defpackage.zc6) r3
            r13 = 0
            if (r2 != 0) goto L25
            return r13
        L25:
            if (r3 == 0) goto L2a
            r1.b(r3)
        L2a:
            java.lang.String r0 = "CXCP#createCaptureSession-"
            java.lang.String r14 = r1.L
            java.lang.String r15 = defpackage.i61.m(r0, r14)
            long r16 = android.os.SystemClock.elapsedRealtimeNanos()
            r18 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            android.os.Trace.beginSection(r15)     // Catch: java.lang.Throwable -> L271
            id0 r5 = r1.R     // Catch: java.lang.Throwable -> L271
            int r0 = r7.a     // Catch: java.lang.Throwable -> L18b java.lang.Exception -> L18f
            java.util.ArrayList r6 = r7.c     // Catch: java.lang.Throwable -> L18b java.lang.Exception -> L18f
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L18b java.lang.Exception -> L18f
            r20 = r8
            r8 = 10
            int r2 = defpackage.ht0.v0(r6, r8)     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L181
            r13.<init>(r2)     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L181
            int r2 = r6.size()     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L181
            r4 = 0
        L56:
            if (r4 >= r2) goto L86
            java.lang.Object r22 = r6.get(r4)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7f
            int r4 = r4 + 1
            r8 = r22
            xi r8 = (defpackage.xi) r8     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7f
            java.lang.Class<android.hardware.camera2.params.OutputConfiguration> r22 = android.hardware.camera2.params.OutputConfiguration.class
            r23 = r0
            ar0 r0 = defpackage.gh5.a(r22)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7f
            java.lang.Object r0 = r8.e(r0)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7f
            android.hardware.camera2.params.OutputConfiguration r0 = (android.hardware.camera2.params.OutputConfiguration) r0     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7f
            r13.add(r0)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7f
            r0 = r23
            r8 = 10
            goto L56
        L78:
            r0 = move-exception
            r6 = r9
            r5 = r20
        L7c:
            r7 = 0
            goto L276
        L7f:
            r0 = move-exception
            r24 = r5
        L82:
            r21 = r9
            goto L196
        L86:
            r23 = r0
            java.util.concurrent.Executor r8 = r7.d     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L181
            zd r0 = new zd     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L181
            le0 r2 = r7.e     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L181
            id0 r4 = r1.R     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L181
            r6 = r5
            u63 r5 = r1.X     // Catch: java.lang.Throwable -> L181 java.lang.Exception -> L186
            r22 = r0
            t57 r0 = r1.Y     // Catch: java.lang.Throwable -> L181 java.lang.Exception -> L186
            android.os.Handler r0 = r0.a()     // Catch: java.lang.Throwable -> L181 java.lang.Exception -> L186
            r24 = r6
            r21 = r9
            r9 = r23
            r6 = r0
            r0 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            r8.getClass()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            android.hardware.camera2.params.SessionConfiguration r0 = defpackage.j2.c(r9, r13, r8, r0)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            if (r12 == 0) goto Le7
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            r4 = 31
            if (r2 < r4) goto Lc7
            android.hardware.camera2.params.InputConfiguration r2 = defpackage.vy7.q0(r14, r12)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            defpackage.j2.r(r0, r2)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            goto Le7
        Lbe:
            r0 = move-exception
        Lbf:
            r5 = r20
            r6 = r21
            goto L7c
        Lc4:
            r0 = move-exception
            goto L196
        Lc7:
            android.hardware.camera2.params.InputConfiguration r2 = new android.hardware.camera2.params.InputConfiguration     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            java.lang.Object r4 = defpackage.gt0.b1(r12)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            j63 r4 = (defpackage.j63) r4     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            int r4 = r4.a     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            java.lang.Object r5 = defpackage.gt0.b1(r12)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            j63 r5 = (defpackage.j63) r5     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            int r5 = r5.b     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            java.lang.Object r6 = defpackage.gt0.b1(r12)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            j63 r6 = (defpackage.j63) r6     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            int r6 = r6.c     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            r2.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            defpackage.j2.r(r0, r2)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
        Le7:
            java.lang.String r2 = "createCaptureRequest"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L17c
            int r2 = r7.f     // Catch: java.lang.Throwable -> L17c
            android.hardware.camera2.CaptureRequest$Builder r2 = r10.createCaptureRequest(r2)     // Catch: java.lang.Throwable -> L17c
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            r2.getClass()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            lg0 r4 = r1.A     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            qc0 r4 = (defpackage.qc0) r4     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            go3 r4 = r4.e0     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            r6 = 10
            int r6 = defpackage.ht0.v0(r4, r6)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
        L115:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            if (r6 == 0) goto L129
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            android.hardware.camera2.CaptureRequest$Key r6 = (android.hardware.camera2.CaptureRequest.Key) r6     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            r5.add(r6)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            goto L115
        L129:
            java.util.Map r4 = r7.g     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
        L133:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            if (r6 == 0) goto L15c
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            boolean r8 = r7 instanceof android.hardware.camera2.CaptureRequest.Key     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            if (r8 == 0) goto L133
            r8 = r7
            android.hardware.camera2.CaptureRequest$Key r8 = (android.hardware.camera2.CaptureRequest.Key) r8     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            boolean r8 = r5.contains(r8)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            if (r8 == 0) goto L133
            defpackage.yh2.Q(r2, r7, r6)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            goto L133
        L15c:
            android.hardware.camera2.CaptureRequest r2 = r2.build()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            r2.getClass()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            defpackage.j2.q(r0, r2)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            java.lang.String r2 = "Api28Compat.createCaptureSession"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L177
            defpackage.j2.m(r10, r0)     // Catch: java.lang.Throwable -> L177
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            jg7 r2 = defpackage.jg7.a     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            r0 = r2
        L174:
            r2 = 0
            goto L22e
        L177:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            throw r0     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
        L17c:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
            throw r0     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc4
        L181:
            r0 = move-exception
        L182:
            r21 = r9
            goto Lbf
        L186:
            r0 = move-exception
            r24 = r6
            goto L82
        L18b:
            r0 = move-exception
            r20 = r8
            goto L182
        L18f:
            r0 = move-exception
            r24 = r5
            r20 = r8
            goto L82
        L196:
            boolean r2 = r0 instanceof android.hardware.camera2.CameraAccessException     // Catch: java.lang.Throwable -> Lbe
            if (r2 == 0) goto L1f1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe
            r2.<init>()     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = "Failed to execute call: Camera encountered an error: "
            r2.append(r4)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> Lbe
            r2.append(r4)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lbe
            android.util.Log.w(r11, r2)     // Catch: java.lang.Throwable -> Lbe
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0     // Catch: java.lang.Throwable -> Lbe
            int r2 = r0.getReason()     // Catch: java.lang.Throwable -> Lbe
            r4 = 3
            r5 = 1
            if (r2 == r5) goto L1ea
            r5 = 2
            if (r2 == r5) goto L1e8
            if (r2 == r4) goto L1e4
            r4 = 4
            if (r2 == r4) goto L1e0
            r4 = 5
            if (r2 == r4) goto L1de
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = "Unexpected CameraAccessException: "
            r2.<init>(r4)     // Catch: java.lang.Throwable -> Lbe
            r2.append(r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lbe
            android.util.Log.w(r11, r0)     // Catch: java.lang.Throwable -> Lbe
            r4 = 11
        L1da:
            r6 = r24
        L1dc:
            r5 = 1
            goto L1ec
        L1de:
            r4 = r5
            goto L1da
        L1e0:
            r6 = r24
            r4 = 1
            goto L1dc
        L1e4:
            r6 = r24
            r4 = 0
            goto L1dc
        L1e8:
            r4 = 6
            goto L1da
        L1ea:
            r6 = r24
        L1ec:
            r6.a(r14, r4, r5)     // Catch: java.lang.Throwable -> Lbe
        L1ef:
            r0 = 0
            goto L174
        L1f1:
            r6 = r24
            boolean r2 = r0 instanceof java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lbe
            if (r2 != 0) goto L20f
            boolean r2 = r0 instanceof java.lang.SecurityException     // Catch: java.lang.Throwable -> Lbe
            if (r2 != 0) goto L20f
            boolean r2 = r0 instanceof java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> Lbe
            if (r2 != 0) goto L20f
            boolean r2 = r0 instanceof java.lang.NullPointerException     // Catch: java.lang.Throwable -> Lbe
            if (r2 == 0) goto L204
            goto L20f
        L204:
            boolean r2 = r0 instanceof java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbe
            if (r2 == 0) goto L20e
            java.lang.String r0 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r11, r0)     // Catch: java.lang.Throwable -> Lbe
            goto L1ef
        L20e:
            throw r0     // Catch: java.lang.Throwable -> Lbe
        L20f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe
            r2.<init>()     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = "Failed to execute call: Unexpected exception: "
            r2.append(r4)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> Lbe
            r2.append(r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lbe
            android.util.Log.w(r11, r0)     // Catch: java.lang.Throwable -> Lbe
            r0 = 9
            r2 = 0
            r6.a(r14, r0, r2)     // Catch: java.lang.Throwable -> Lbe
            r0 = 0
        L22e:
            long r4 = defpackage.i61.d(r16)
            r6 = r21
            java.lang.StringBuilder r6 = defpackage.i61.r(r15, r6)
            double r4 = (double) r4
            double r4 = r4 / r18
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r5 = r20
            r7 = 0
            r8 = 1
            java.lang.String r4 = defpackage.i61.p(r4, r8, r7, r5, r6)
            android.util.Log.d(r11, r4)
            if (r0 != 0) goto L26b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to create capture session from "
            r4.<init>(r5)
            r4.append(r10)
            java.lang.String r5 = ". Finalizing previous session"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r11, r4)
            if (r3 == 0) goto L26b
            r1.c(r3)
        L26b:
            if (r0 == 0) goto L26f
            r13 = 1
            goto L270
        L26f:
            r13 = r2
        L270:
            return r13
        L271:
            r0 = move-exception
            r5 = r8
            r6 = r9
            goto L7c
        L276:
            long r1 = defpackage.i61.d(r16)
            java.lang.StringBuilder r3 = defpackage.i61.r(r15, r6)
            double r1 = (double) r1
            double r1 = r1 / r18
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r8 = 1
            java.lang.String r1 = defpackage.i61.p(r1, r8, r7, r5, r3)
            android.util.Log.d(r11, r1)
            throw r0
    }

    @Override // defpackage.bf0
    public final android.hardware.camera2.CaptureRequest.Builder D(int r19) {
            r18 = this;
            r0 = r18
            java.lang.String r1 = "%.3f ms"
            java.lang.String r2 = " - "
            java.lang.String r3 = "CXCP"
            java.lang.String r4 = "Failed to execute call: Unexpected exception: "
            java.lang.String r5 = "Failed to execute call: Camera encountered an error: "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "CXCP#createCaptureRequest-"
            r6.<init>(r7)
            java.lang.String r7 = r0.L
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            r12 = 1
            r13 = 0
            android.os.Trace.beginSection(r6)     // Catch: java.lang.Throwable -> L36
            id0 r14 = r0.R     // Catch: java.lang.Throwable -> L36
            android.hardware.camera2.CameraDevice r0 = r0.B     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3e
            r15 = r19
            android.hardware.camera2.CaptureRequest$Builder r0 = r0.createCaptureRequest(r15)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3e
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            goto Lc7
        L36:
            r0 = move-exception
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            goto Le2
        L3e:
            r0 = move-exception
            boolean r15 = r0 instanceof android.hardware.camera2.CameraAccessException     // Catch: java.lang.Throwable -> L36
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r10 = 0
            if (r15 == 0) goto L92
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = r0.getMessage()     // Catch: java.lang.Throwable -> L90
            r4.append(r5)     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L90
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L90
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0     // Catch: java.lang.Throwable -> L90
            int r4 = r0.getReason()     // Catch: java.lang.Throwable -> L90
            r5 = 3
            if (r4 == r12) goto L8a
            r11 = 2
            if (r4 == r11) goto L88
            if (r4 == r5) goto L8b
            r5 = 4
            if (r4 == r5) goto L86
            r5 = 5
            if (r4 == r5) goto L84
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = "Unexpected CameraAccessException: "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L90
            r4.append(r0)     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L90
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L90
            r10 = 11
            goto L8b
        L84:
            r10 = r11
            goto L8b
        L86:
            r10 = r12
            goto L8b
        L88:
            r10 = 6
            goto L8b
        L8a:
            r10 = r5
        L8b:
            r14.a(r7, r10, r12)     // Catch: java.lang.Throwable -> L90
        L8e:
            r0 = r13
            goto Lc7
        L90:
            r0 = move-exception
            goto Le2
        L92:
            boolean r5 = r0 instanceof java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L90
            if (r5 != 0) goto Lae
            boolean r5 = r0 instanceof java.lang.SecurityException     // Catch: java.lang.Throwable -> L90
            if (r5 != 0) goto Lae
            boolean r5 = r0 instanceof java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L90
            if (r5 != 0) goto Lae
            boolean r5 = r0 instanceof java.lang.NullPointerException     // Catch: java.lang.Throwable -> L90
            if (r5 == 0) goto La3
            goto Lae
        La3:
            boolean r4 = r0 instanceof java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto Lad
            java.lang.String r0 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> L90
            goto L8e
        Lad:
            throw r0     // Catch: java.lang.Throwable -> L90
        Lae:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L90
            r5.append(r0)     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L90
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L90
            r0 = 9
            r14.a(r7, r0, r10)     // Catch: java.lang.Throwable -> L90
            goto L8e
        Lc7:
            long r4 = defpackage.i61.d(r8)
            java.lang.StringBuilder r2 = defpackage.i61.r(r6, r2)
            double r4 = (double) r4
            double r4 = r4 / r16
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = defpackage.i61.p(r4, r12, r13, r1, r2)
            android.util.Log.d(r3, r1)
            return r0
        Le2:
            long r4 = defpackage.i61.d(r8)
            java.lang.StringBuilder r2 = defpackage.i61.r(r6, r2)
            double r4 = (double) r4
            double r4 = r4 / r16
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = defpackage.i61.p(r4, r12, r13, r1, r2)
            android.util.Log.d(r3, r1)
            throw r0
    }

    @Override // defpackage.bf0
    public final boolean F(java.util.ArrayList r26, defpackage.le0 r27) {
            r25 = this;
            r1 = r25
            java.lang.String r7 = "%.3f ms"
            java.lang.String r8 = " - "
            t57 r9 = r1.Y
            android.hardware.camera2.CameraDevice r10 = r1.B
            java.lang.String r11 = "CXCP"
            java.lang.String r12 = "Failed to execute call: Unexpected exception: "
            java.lang.String r13 = "Failed to execute call: Camera encountered an error: "
            r27.getClass()
            r2 = r27
            vr4 r0 = r1.a(r2)
            java.lang.Object r3 = r0.A
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.Object r0 = r0.B
            r4 = r0
            zc6 r4 = (defpackage.zc6) r4
            r14 = 0
            if (r3 != 0) goto L2a
            return r14
        L2a:
            if (r4 == 0) goto L2f
            r1.b(r4)
        L2f:
            java.lang.String r0 = "CXCP#createConstrainedHighSpeedCaptureSession-"
            java.lang.String r15 = r1.L
            java.lang.String r3 = defpackage.i61.m(r0, r15)
            long r16 = android.os.SystemClock.elapsedRealtimeNanos()
            r18 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r5 = 0
            r6 = 1
            android.os.Trace.beginSection(r3)     // Catch: java.lang.Throwable -> L158
            id0 r14 = r1.R     // Catch: java.lang.Throwable -> L158
            zd r0 = new zd     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r20 = r3
            r3 = r4
            id0 r4 = r1.R     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L87
            r21 = r5
            u63 r5 = r1.X     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L87
            r22 = r6
            android.os.Handler r6 = r9.a()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L7c
            r23 = r9
            r24 = r20
            r9 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            android.os.Handler r2 = r23.a()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            r4 = r26
            r10.createConstrainedHighSpeedCaptureSession(r4, r0, r2)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            jg7 r5 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            r2 = 0
            goto L118
        L6f:
            r0 = move-exception
        L70:
            r4 = r24
            goto L15b
        L74:
            r0 = move-exception
            goto L96
        L76:
            r0 = move-exception
            r24 = r20
            r9 = r22
            goto L70
        L7c:
            r0 = move-exception
            r24 = r20
            r9 = r22
            goto L96
        L82:
            r0 = move-exception
            r9 = r6
            r24 = r20
            goto L70
        L87:
            r0 = move-exception
            r9 = r6
            r24 = r20
            goto L96
        L8c:
            r0 = move-exception
            r24 = r3
            r9 = r6
            goto L70
        L91:
            r0 = move-exception
            r24 = r3
            r3 = r4
            r9 = r6
        L96:
            boolean r2 = r0 instanceof android.hardware.camera2.CameraAccessException     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto Le2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r2.<init>(r13)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L6f
            r2.append(r4)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6f
            android.util.Log.w(r11, r2)     // Catch: java.lang.Throwable -> L6f
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0     // Catch: java.lang.Throwable -> L6f
            int r2 = r0.getReason()     // Catch: java.lang.Throwable -> L6f
            r6 = 3
            if (r2 == r9) goto Ldc
            r4 = 2
            if (r2 == r4) goto Ldb
            if (r2 == r6) goto Ld9
            r5 = 4
            if (r2 == r5) goto Ld7
            r5 = 5
            if (r2 == r5) goto Ld5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "Unexpected CameraAccessException: "
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L6f
            r2.append(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L6f
            android.util.Log.w(r11, r0)     // Catch: java.lang.Throwable -> L6f
            r6 = 11
            goto Ldc
        Ld5:
            r6 = r4
            goto Ldc
        Ld7:
            r6 = r9
            goto Ldc
        Ld9:
            r6 = 0
            goto Ldc
        Ldb:
            r6 = 6
        Ldc:
            r14.a(r15, r6, r9)     // Catch: java.lang.Throwable -> L6f
        Ldf:
            r2 = 0
        Le0:
            r5 = 0
            goto L118
        Le2:
            boolean r2 = r0 instanceof java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6f
            if (r2 != 0) goto Lfe
            boolean r2 = r0 instanceof java.lang.SecurityException     // Catch: java.lang.Throwable -> L6f
            if (r2 != 0) goto Lfe
            boolean r2 = r0 instanceof java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L6f
            if (r2 != 0) goto Lfe
            boolean r2 = r0 instanceof java.lang.NullPointerException     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto Lf3
            goto Lfe
        Lf3:
            boolean r2 = r0 instanceof java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto Lfd
            java.lang.String r0 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r11, r0)     // Catch: java.lang.Throwable -> L6f
            goto Ldf
        Lfd:
            throw r0     // Catch: java.lang.Throwable -> L6f
        Lfe:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r2.<init>(r12)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L6f
            r2.append(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L6f
            android.util.Log.w(r11, r0)     // Catch: java.lang.Throwable -> L6f
            r0 = 9
            r2 = 0
            r14.a(r15, r0, r2)     // Catch: java.lang.Throwable -> L6f
            goto Le0
        L118:
            long r12 = defpackage.i61.d(r16)
            r4 = r24
            java.lang.StringBuilder r0 = defpackage.i61.r(r4, r8)
            double r12 = (double) r12
            double r12 = r12 / r18
            java.lang.Double r4 = java.lang.Double.valueOf(r12)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r6 = 0
            java.lang.String r0 = defpackage.i61.p(r4, r9, r6, r7, r0)
            android.util.Log.d(r11, r0)
            if (r5 != 0) goto L152
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to create capture session from "
            r0.<init>(r4)
            r0.append(r10)
            java.lang.String r4 = ". Finalizing previous session"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r11, r0)
            if (r3 == 0) goto L152
            r1.c(r3)
        L152:
            if (r5 == 0) goto L156
            r14 = r9
            goto L157
        L156:
            r14 = r2
        L157:
            return r14
        L158:
            r0 = move-exception
            r4 = r3
            r9 = r6
        L15b:
            long r1 = defpackage.i61.d(r16)
            java.lang.StringBuilder r3 = defpackage.i61.r(r4, r8)
            double r1 = (double) r1
            double r1 = r1 / r18
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r6 = 0
            java.lang.String r1 = defpackage.i61.p(r1, r9, r6, r7, r3)
            android.util.Log.d(r11, r1)
            throw r0
    }

    @Override // defpackage.bf0
    public final boolean N(java.util.List r26, defpackage.le0 r27) {
            r25 = this;
            r1 = r25
            java.lang.String r7 = "%.3f ms"
            java.lang.String r8 = " - "
            t57 r9 = r1.Y
            android.hardware.camera2.CameraDevice r10 = r1.B
            java.lang.String r11 = "CXCP"
            java.lang.String r12 = "Failed to execute call: Unexpected exception: "
            java.lang.String r13 = "Failed to execute call: Camera encountered an error: "
            r27.getClass()
            r2 = r27
            vr4 r0 = r1.a(r2)
            java.lang.Object r3 = r0.A
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.Object r0 = r0.B
            r4 = r0
            zc6 r4 = (defpackage.zc6) r4
            r14 = 0
            if (r3 != 0) goto L2a
            return r14
        L2a:
            if (r4 == 0) goto L2f
            r1.b(r4)
        L2f:
            java.lang.String r0 = "CXCP#createCaptureSession-"
            java.lang.String r15 = r1.L
            java.lang.String r3 = defpackage.i61.m(r0, r15)
            long r16 = android.os.SystemClock.elapsedRealtimeNanos()
            r18 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r5 = 0
            r6 = 1
            android.os.Trace.beginSection(r3)     // Catch: java.lang.Throwable -> L158
            id0 r14 = r1.R     // Catch: java.lang.Throwable -> L158
            zd r0 = new zd     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r20 = r3
            r3 = r4
            id0 r4 = r1.R     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L87
            r21 = r5
            u63 r5 = r1.X     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L87
            r22 = r6
            android.os.Handler r6 = r9.a()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L7c
            r23 = r9
            r24 = r20
            r9 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            android.os.Handler r2 = r23.a()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            r4 = r26
            r10.createCaptureSession(r4, r0, r2)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            jg7 r5 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            r2 = 0
            goto L118
        L6f:
            r0 = move-exception
        L70:
            r4 = r24
            goto L15b
        L74:
            r0 = move-exception
            goto L96
        L76:
            r0 = move-exception
            r24 = r20
            r9 = r22
            goto L70
        L7c:
            r0 = move-exception
            r24 = r20
            r9 = r22
            goto L96
        L82:
            r0 = move-exception
            r9 = r6
            r24 = r20
            goto L70
        L87:
            r0 = move-exception
            r9 = r6
            r24 = r20
            goto L96
        L8c:
            r0 = move-exception
            r24 = r3
            r9 = r6
            goto L70
        L91:
            r0 = move-exception
            r24 = r3
            r3 = r4
            r9 = r6
        L96:
            boolean r2 = r0 instanceof android.hardware.camera2.CameraAccessException     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto Le2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r2.<init>(r13)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L6f
            r2.append(r4)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6f
            android.util.Log.w(r11, r2)     // Catch: java.lang.Throwable -> L6f
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0     // Catch: java.lang.Throwable -> L6f
            int r2 = r0.getReason()     // Catch: java.lang.Throwable -> L6f
            r6 = 3
            if (r2 == r9) goto Ldc
            r4 = 2
            if (r2 == r4) goto Ldb
            if (r2 == r6) goto Ld9
            r5 = 4
            if (r2 == r5) goto Ld7
            r5 = 5
            if (r2 == r5) goto Ld5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "Unexpected CameraAccessException: "
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L6f
            r2.append(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L6f
            android.util.Log.w(r11, r0)     // Catch: java.lang.Throwable -> L6f
            r6 = 11
            goto Ldc
        Ld5:
            r6 = r4
            goto Ldc
        Ld7:
            r6 = r9
            goto Ldc
        Ld9:
            r6 = 0
            goto Ldc
        Ldb:
            r6 = 6
        Ldc:
            r14.a(r15, r6, r9)     // Catch: java.lang.Throwable -> L6f
        Ldf:
            r2 = 0
        Le0:
            r5 = 0
            goto L118
        Le2:
            boolean r2 = r0 instanceof java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6f
            if (r2 != 0) goto Lfe
            boolean r2 = r0 instanceof java.lang.SecurityException     // Catch: java.lang.Throwable -> L6f
            if (r2 != 0) goto Lfe
            boolean r2 = r0 instanceof java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L6f
            if (r2 != 0) goto Lfe
            boolean r2 = r0 instanceof java.lang.NullPointerException     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto Lf3
            goto Lfe
        Lf3:
            boolean r2 = r0 instanceof java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto Lfd
            java.lang.String r0 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r11, r0)     // Catch: java.lang.Throwable -> L6f
            goto Ldf
        Lfd:
            throw r0     // Catch: java.lang.Throwable -> L6f
        Lfe:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r2.<init>(r12)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L6f
            r2.append(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L6f
            android.util.Log.w(r11, r0)     // Catch: java.lang.Throwable -> L6f
            r0 = 9
            r2 = 0
            r14.a(r15, r0, r2)     // Catch: java.lang.Throwable -> L6f
            goto Le0
        L118:
            long r12 = defpackage.i61.d(r16)
            r4 = r24
            java.lang.StringBuilder r0 = defpackage.i61.r(r4, r8)
            double r12 = (double) r12
            double r12 = r12 / r18
            java.lang.Double r4 = java.lang.Double.valueOf(r12)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r6 = 0
            java.lang.String r0 = defpackage.i61.p(r4, r9, r6, r7, r0)
            android.util.Log.d(r11, r0)
            if (r5 != 0) goto L152
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to create capture session from "
            r0.<init>(r4)
            r0.append(r10)
            java.lang.String r4 = ". Finalizing previous session"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r11, r0)
            if (r3 == 0) goto L152
            r1.c(r3)
        L152:
            if (r5 == 0) goto L156
            r14 = r9
            goto L157
        L156:
            r14 = r2
        L157:
            return r14
        L158:
            r0 = move-exception
            r4 = r3
            r9 = r6
        L15b:
            long r1 = defpackage.i61.d(r16)
            java.lang.StringBuilder r3 = defpackage.i61.r(r4, r8)
            double r1 = (double) r1
            double r1 = r1 / r18
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r6 = 0
            java.lang.String r1 = defpackage.i61.p(r1, r9, r6, r7, r3)
            android.util.Log.d(r11, r1)
            throw r0
    }

    @Override // defpackage.bf0
    public final boolean U(java.util.ArrayList r22, defpackage.le0 r23) {
            r21 = this;
            r1 = r21
            r0 = r22
            java.lang.String r7 = "%.3f ms"
            java.lang.String r8 = " - "
            t57 r9 = r1.Y
            android.hardware.camera2.CameraDevice r10 = r1.B
            java.lang.String r11 = "CXCP"
            r23.getClass()
            r2 = r23
            vr4 r3 = r1.a(r2)
            java.lang.Object r4 = r3.A
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.Object r3 = r3.B
            zc6 r3 = (defpackage.zc6) r3
            r12 = 0
            if (r4 != 0) goto L27
            return r12
        L27:
            if (r3 == 0) goto L2c
            r1.b(r3)
        L2c:
            java.lang.String r4 = "CXCP#createCaptureSessionByOutputConfigurations-"
            java.lang.String r13 = r1.L
            java.lang.String r14 = defpackage.i61.m(r4, r13)
            long r15 = android.os.SystemClock.elapsedRealtimeNanos()
            r17 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            android.os.Trace.beginSection(r14)     // Catch: java.lang.Throwable -> L72
            id0 r6 = r1.R     // Catch: java.lang.Throwable -> L72
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L76
            r4 = 10
            int r4 = defpackage.ht0.v0(r0, r4)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L76
            r12.<init>(r4)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L76
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L76
            r5 = 0
        L52:
            if (r5 >= r4) goto L7b
            java.lang.Object r19 = r0.get(r5)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L76
            int r5 = r5 + 1
            r0 = r19
            xi r0 = (defpackage.xi) r0     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L76
            java.lang.Class<android.hardware.camera2.params.OutputConfiguration> r19 = android.hardware.camera2.params.OutputConfiguration.class
            ar0 r2 = defpackage.gh5.a(r19)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L76
            java.lang.Object r0 = r0.e(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L76
            android.hardware.camera2.params.OutputConfiguration r0 = (android.hardware.camera2.params.OutputConfiguration) r0     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L76
            r12.add(r0)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L76
            r0 = r22
            r2 = r23
            goto L52
        L72:
            r0 = move-exception
            r9 = 1
            goto L176
        L76:
            r0 = move-exception
            r20 = r6
        L79:
            r9 = 1
            goto La6
        L7b:
            zd r0 = new zd     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L76
            id0 r4 = r1.R     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L76
            u63 r5 = r1.X     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L76
            r2 = r6
            android.os.Handler r6 = r9.a()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> La2
            r20 = r2
            r19 = r9
            r9 = 1
            r2 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
            android.os.Handler r2 = r19.a()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
            r10.createCaptureSessionByOutputConfigurations(r12, r0, r2)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
            jg7 r4 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
            r0 = r4
        L9a:
            r4 = 0
            goto L138
        L9d:
            r0 = move-exception
            goto L176
        La0:
            r0 = move-exception
            goto La6
        La2:
            r0 = move-exception
            r20 = r2
            goto L79
        La6:
            boolean r2 = r0 instanceof android.hardware.camera2.CameraAccessException     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto Lfb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r2.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = "Failed to execute call: Camera encountered an error: "
            r2.append(r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L9d
            r2.append(r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9d
            android.util.Log.w(r11, r2)     // Catch: java.lang.Throwable -> L9d
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0     // Catch: java.lang.Throwable -> L9d
            int r2 = r0.getReason()     // Catch: java.lang.Throwable -> L9d
            r5 = 3
            if (r2 == r9) goto Le9
            r4 = 2
            if (r2 == r4) goto Lf4
            if (r2 == r5) goto Lf0
            r5 = 4
            if (r2 == r5) goto Lee
            r5 = 5
            if (r2 == r5) goto Lec
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = "Unexpected CameraAccessException: "
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L9d
            r2.append(r0)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L9d
            android.util.Log.w(r11, r0)     // Catch: java.lang.Throwable -> L9d
            r5 = 11
        Le9:
            r2 = r20
            goto Lf6
        Lec:
            r5 = r4
            goto Le9
        Lee:
            r5 = r9
            goto Le9
        Lf0:
            r2 = r20
            r5 = 0
            goto Lf6
        Lf4:
            r5 = 6
            goto Le9
        Lf6:
            r2.a(r13, r5, r9)     // Catch: java.lang.Throwable -> L9d
        Lf9:
            r0 = 0
            goto L9a
        Lfb:
            r2 = r20
            boolean r4 = r0 instanceof java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L9d
            if (r4 != 0) goto L119
            boolean r4 = r0 instanceof java.lang.SecurityException     // Catch: java.lang.Throwable -> L9d
            if (r4 != 0) goto L119
            boolean r4 = r0 instanceof java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L9d
            if (r4 != 0) goto L119
            boolean r4 = r0 instanceof java.lang.NullPointerException     // Catch: java.lang.Throwable -> L9d
            if (r4 == 0) goto L10e
            goto L119
        L10e:
            boolean r2 = r0 instanceof java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L118
            java.lang.String r0 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r11, r0)     // Catch: java.lang.Throwable -> L9d
            goto Lf9
        L118:
            throw r0     // Catch: java.lang.Throwable -> L9d
        L119:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r4.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = "Failed to execute call: Unexpected exception: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L9d
            r4.append(r0)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L9d
            android.util.Log.w(r11, r0)     // Catch: java.lang.Throwable -> L9d
            r0 = 9
            r4 = 0
            r2.a(r13, r0, r4)     // Catch: java.lang.Throwable -> L9d
            r0 = 0
        L138:
            long r5 = defpackage.i61.d(r15)
            java.lang.StringBuilder r2 = defpackage.i61.r(r14, r8)
            double r5 = (double) r5
            double r5 = r5 / r17
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r6 = 0
            java.lang.String r2 = defpackage.i61.p(r5, r9, r6, r7, r2)
            android.util.Log.d(r11, r2)
            if (r0 != 0) goto L170
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to create capture session from "
            r2.<init>(r5)
            r2.append(r10)
            java.lang.String r5 = ". Finalizing previous session"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r11, r2)
            if (r3 == 0) goto L170
            r1.c(r3)
        L170:
            if (r0 == 0) goto L174
            r12 = r9
            goto L175
        L174:
            r12 = r4
        L175:
            return r12
        L176:
            long r1 = defpackage.i61.d(r15)
            java.lang.StringBuilder r3 = defpackage.i61.r(r14, r8)
            double r1 = (double) r1
            double r1 = r1 / r17
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r6 = 0
            java.lang.String r1 = defpackage.i61.p(r1, r9, r6, r7, r3)
            android.util.Log.d(r11, r1)
            throw r0
    }

    @Override // defpackage.bf0
    public final boolean Z(defpackage.j63 r23, java.util.ArrayList r24, defpackage.le0 r25) {
            r22 = this;
            r1 = r22
            r0 = r23
            r2 = r24
            java.lang.String r7 = "%.3f ms"
            java.lang.String r8 = " - "
            t57 r9 = r1.Y
            android.hardware.camera2.CameraDevice r10 = r1.B
            java.lang.String r11 = "CXCP"
            r25.getClass()
            r3 = r25
            vr4 r4 = r1.a(r3)
            java.lang.Object r5 = r4.A
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.Object r4 = r4.B
            zc6 r4 = (defpackage.zc6) r4
            r12 = 0
            if (r5 != 0) goto L29
            return r12
        L29:
            if (r4 == 0) goto L2e
            r1.b(r4)
        L2e:
            java.lang.String r5 = "CXCP#createReprocessableCaptureSessionByConfigurations-"
            java.lang.String r13 = r1.L
            java.lang.String r14 = defpackage.i61.m(r5, r13)
            long r15 = android.os.SystemClock.elapsedRealtimeNanos()
            r17 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            android.os.Trace.beginSection(r14)     // Catch: java.lang.Throwable -> L81
            id0 r12 = r1.R     // Catch: java.lang.Throwable -> L81
            r19 = r9
            android.hardware.camera2.params.InputConfiguration r9 = new android.hardware.camera2.params.InputConfiguration     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            int r5 = r0.a     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            int r6 = r0.b     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            int r0 = r0.c     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            r9.<init>(r5, r6, r0)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            r5 = 10
            int r5 = defpackage.ht0.v0(r2, r5)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            int r5 = r2.size()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            r6 = 0
        L61:
            if (r6 >= r5) goto L8b
            java.lang.Object r20 = r2.get(r6)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            int r6 = r6 + 1
            r2 = r20
            xi r2 = (defpackage.xi) r2     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            java.lang.Class<android.hardware.camera2.params.OutputConfiguration> r20 = android.hardware.camera2.params.OutputConfiguration.class
            ar0 r3 = defpackage.gh5.a(r20)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            java.lang.Object r2 = r2.e(r3)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            android.hardware.camera2.params.OutputConfiguration r2 = (android.hardware.camera2.params.OutputConfiguration) r2     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            r0.add(r2)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            r2 = r24
            r3 = r25
            goto L61
        L81:
            r0 = move-exception
            r20 = r15
            goto L182
        L86:
            r0 = move-exception
            r3 = r4
        L88:
            r20 = r15
            goto Lb2
        L8b:
            r2 = r0
            zd r0 = new zd     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            r3 = r4
            id0 r4 = r1.R     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> Lb0
            u63 r5 = r1.X     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> Lb0
            android.os.Handler r6 = r19.a()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> Lb0
            r20 = r15
            r15 = r2
            r2 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            android.os.Handler r2 = r19.a()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            r10.createReprocessableCaptureSessionByConfigurations(r9, r15, r0, r2)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            jg7 r5 = defpackage.jg7.a     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            r2 = 0
            goto L143
        Lab:
            r0 = move-exception
            goto L182
        Lae:
            r0 = move-exception
            goto Lb2
        Lb0:
            r0 = move-exception
            goto L88
        Lb2:
            boolean r2 = r0 instanceof android.hardware.camera2.CameraAccessException     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto L108
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lab
            r2.<init>()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = "Failed to execute call: Camera encountered an error: "
            r2.append(r4)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> Lab
            r2.append(r4)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lab
            android.util.Log.w(r11, r2)     // Catch: java.lang.Throwable -> Lab
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0     // Catch: java.lang.Throwable -> Lab
            int r2 = r0.getReason()     // Catch: java.lang.Throwable -> Lab
            r6 = 3
            r4 = 1
            if (r2 == r4) goto L102
            r4 = 2
            if (r2 == r4) goto L100
            if (r2 == r6) goto Lfd
            r5 = 4
            if (r2 == r5) goto Lfa
            r5 = 5
            if (r2 == r5) goto Lf8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = "Unexpected CameraAccessException: "
            r2.<init>(r4)     // Catch: java.lang.Throwable -> Lab
            r2.append(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lab
            android.util.Log.w(r11, r0)     // Catch: java.lang.Throwable -> Lab
            r6 = 11
        Lf6:
            r4 = 1
            goto L102
        Lf8:
            r6 = r4
            goto Lf6
        Lfa:
            r4 = 1
            r6 = 1
            goto L102
        Lfd:
            r4 = 1
            r6 = 0
            goto L102
        L100:
            r6 = 6
            goto Lf6
        L102:
            r12.a(r13, r6, r4)     // Catch: java.lang.Throwable -> Lab
        L105:
            r2 = 0
        L106:
            r5 = 0
            goto L143
        L108:
            boolean r2 = r0 instanceof java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lab
            if (r2 != 0) goto L124
            boolean r2 = r0 instanceof java.lang.SecurityException     // Catch: java.lang.Throwable -> Lab
            if (r2 != 0) goto L124
            boolean r2 = r0 instanceof java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> Lab
            if (r2 != 0) goto L124
            boolean r2 = r0 instanceof java.lang.NullPointerException     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto L119
            goto L124
        L119:
            boolean r2 = r0 instanceof java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto L123
            java.lang.String r0 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r11, r0)     // Catch: java.lang.Throwable -> Lab
            goto L105
        L123:
            throw r0     // Catch: java.lang.Throwable -> Lab
        L124:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lab
            r2.<init>()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = "Failed to execute call: Unexpected exception: "
            r2.append(r4)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> Lab
            r2.append(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lab
            android.util.Log.w(r11, r0)     // Catch: java.lang.Throwable -> Lab
            r0 = 9
            r2 = 0
            r12.a(r13, r0, r2)     // Catch: java.lang.Throwable -> Lab
            goto L106
        L143:
            long r12 = defpackage.i61.d(r20)
            java.lang.StringBuilder r0 = defpackage.i61.r(r14, r8)
            double r8 = (double) r12
            double r8 = r8 / r17
            java.lang.Double r4 = java.lang.Double.valueOf(r8)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r6 = 0
            r8 = 1
            java.lang.String r0 = defpackage.i61.p(r4, r8, r6, r7, r0)
            android.util.Log.d(r11, r0)
            if (r5 != 0) goto L17c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to create reprocess session from "
            r0.<init>(r4)
            r0.append(r10)
            java.lang.String r4 = ". Finalizing previous session"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r11, r0)
            if (r3 == 0) goto L17c
            r1.c(r3)
        L17c:
            if (r5 == 0) goto L180
            r12 = 1
            goto L181
        L180:
            r12 = r2
        L181:
            return r12
        L182:
            long r1 = defpackage.i61.d(r20)
            java.lang.StringBuilder r3 = defpackage.i61.r(r14, r8)
            double r1 = (double) r1
            double r1 = r1 / r17
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r4 = 1
            r6 = 0
            java.lang.String r1 = defpackage.i61.p(r1, r4, r6, r7, r3)
            android.util.Log.d(r11, r1)
            throw r0
    }

    public final defpackage.vr4 a(defpackage.zc6 r3) {
            r2 = this;
            sw r0 = r2.Z
            boolean r0 = r0.b()
            if (r0 == 0) goto L14
            r2.c(r3)
            vr4 r2 = new vr4
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0 = 0
            r2.<init>(r3, r0)
            return r2
        L14:
            vr4 r0 = new vr4
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            xw r2 = r2.d0
            java.lang.Object r2 = r2.b(r3)
            r0.<init>(r1, r2)
            return r0
    }

    @Override // defpackage.bf0
    public final void a0() {
            r2 = this;
            sw r0 = r2.Z
            boolean r0 = r0.b()
            if (r0 == 0) goto L17
            xw r0 = r2.d0
            r1 = 0
            java.lang.Object r0 = r0.b(r1)
            zc6 r0 = (defpackage.zc6) r0
            if (r0 == 0) goto L16
            r2.c(r0)
        L16:
            return
        L17:
            java.lang.String r2 = "Check failed."
            defpackage.i.m(r2)
            return
    }

    public final void b(defpackage.zc6 r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "#onSessionDisconnected"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            android.os.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> L1b
            r2.b()     // Catch: java.lang.Throwable -> L1b
            android.os.Trace.endSection()
            return
        L1b:
            r1 = move-exception
            android.os.Trace.endSection()
            throw r1
    }

    public final void c(defpackage.zc6 r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "#onSessionFinalized"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            android.os.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> L1b
            r2.a()     // Catch: java.lang.Throwable -> L1b
            android.os.Trace.endSection()
            return
        L1b:
            r1 = move-exception
            android.os.Trace.endSection()
            throw r1
    }

    @Override // defpackage.hh7
    public final java.lang.Object e(defpackage.ar0 r2) {
            r1 = this;
            java.lang.Class<android.hardware.camera2.CameraDevice> r0 = android.hardware.camera2.CameraDevice.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lf
            android.hardware.camera2.CameraDevice r1 = r1.B
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // defpackage.bf0
    public final boolean e0(defpackage.k82 r26) {
            r25 = this;
            r1 = r25
            r7 = r26
            pi r6 = r7.b
            java.lang.String r8 = "%.3f ms"
            java.lang.String r9 = " - "
            android.hardware.camera2.CameraDevice r10 = r1.B
            java.lang.String r11 = "CXCP"
            java.lang.Integer r0 = r7.f
            l82 r2 = r7.g
            vr4 r3 = r1.a(r2)
            java.lang.Object r4 = r3.A
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.Object r3 = r3.B
            zc6 r3 = (defpackage.zc6) r3
            r12 = 0
            if (r4 != 0) goto L26
            return r12
        L26:
            if (r3 == 0) goto L2b
            r1.b(r3)
        L2b:
            java.lang.String r4 = "CXCP#createExtensionSession-"
            java.lang.String r13 = r1.L
            java.lang.String r14 = defpackage.i61.m(r4, r13)
            long r15 = android.os.SystemClock.elapsedRealtimeNanos()
            r17 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            android.os.Trace.beginSection(r14)     // Catch: java.lang.Throwable -> L1ab
            id0 r12 = r1.R     // Catch: java.lang.Throwable -> L1ab
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> Ld1 java.lang.Exception -> Ld5
            java.util.ArrayList r4 = r7.a     // Catch: java.lang.Throwable -> Ld1 java.lang.Exception -> Ld5
            r19 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lcd
            r5 = 10
            int r5 = defpackage.ht0.v0(r4, r5)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lcd
            r15.<init>(r5)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lcd
            int r5 = r4.size()     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lcd
            r21 = r0
            r0 = 0
        L5b:
            java.lang.Class<android.hardware.camera2.params.OutputConfiguration> r22 = android.hardware.camera2.params.OutputConfiguration.class
            if (r0 >= r5) goto L88
            java.lang.Object r23 = r4.get(r0)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L84
            int r0 = r0 + 1
            r24 = r0
            r0 = r23
            xi r0 = (defpackage.xi) r0     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L84
            r23 = r2
            ar0 r2 = defpackage.gh5.a(r22)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L84
            java.lang.Object r0 = r0.e(r2)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L84
            android.hardware.camera2.params.OutputConfiguration r0 = (android.hardware.camera2.params.OutputConfiguration) r0     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L84
            r15.add(r0)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L84
            r2 = r23
            r0 = r24
            goto L5b
        L7f:
            r0 = move-exception
            r6 = r8
        L81:
            r7 = 0
            goto L1b1
        L84:
            r0 = move-exception
        L85:
            r16 = r8
            goto Ld9
        L88:
            r23 = r2
            nh r0 = new nh     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lcd
            id0 r4 = r1.R     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lcd
            u63 r5 = r1.X     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lcd
            r16 = r8
            r8 = r21
            r2 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb
            android.hardware.camera2.params.ExtensionSessionConfiguration r0 = defpackage.ma.f(r8, r15, r6, r0)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb
            xi r2 = r7.h     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb
            if (r2 == 0) goto Lc5
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb
            r5 = 34
            if (r4 < r5) goto Lc5
            ar0 r4 = defpackage.gh5.a(r22)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb
            java.lang.Object r2 = r2.e(r4)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb
            android.hardware.camera2.params.OutputConfiguration r2 = (android.hardware.camera2.params.OutputConfiguration) r2     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb
            if (r2 == 0) goto Lbd
            defpackage.gi.n(r0, r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb
            goto Lc5
        Lb7:
            r0 = move-exception
        Lb8:
            r6 = r16
            goto L81
        Lbb:
            r0 = move-exception
            goto Ld9
        Lbd:
            java.lang.String r0 = "Failed to unwrap Postview OutputConfiguration"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb
            throw r2     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb
        Lc5:
            defpackage.ma.u(r10, r0)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb
            jg7 r4 = defpackage.jg7.a     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb
            r2 = 0
            goto L16a
        Lcd:
            r0 = move-exception
        Lce:
            r16 = r8
            goto Lb8
        Ld1:
            r0 = move-exception
            r19 = r15
            goto Lce
        Ld5:
            r0 = move-exception
            r19 = r15
            goto L85
        Ld9:
            boolean r2 = r0 instanceof android.hardware.camera2.CameraAccessException     // Catch: java.lang.Throwable -> Lb7
            if (r2 == 0) goto L12f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r2.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = "Failed to execute call: Camera encountered an error: "
            r2.append(r4)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> Lb7
            r2.append(r4)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lb7
            android.util.Log.w(r11, r2)     // Catch: java.lang.Throwable -> Lb7
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0     // Catch: java.lang.Throwable -> Lb7
            int r2 = r0.getReason()     // Catch: java.lang.Throwable -> Lb7
            r5 = 3
            r4 = 1
            if (r2 == r4) goto L129
            r4 = 2
            if (r2 == r4) goto L127
            if (r2 == r5) goto L124
            r5 = 4
            if (r2 == r5) goto L121
            r5 = 5
            if (r2 == r5) goto L11f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = "Unexpected CameraAccessException: "
            r2.<init>(r4)     // Catch: java.lang.Throwable -> Lb7
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lb7
            android.util.Log.w(r11, r0)     // Catch: java.lang.Throwable -> Lb7
            r5 = 11
        L11d:
            r4 = 1
            goto L129
        L11f:
            r5 = r4
            goto L11d
        L121:
            r4 = 1
            r5 = 1
            goto L129
        L124:
            r4 = 1
            r5 = 0
            goto L129
        L127:
            r5 = 6
            goto L11d
        L129:
            r12.a(r13, r5, r4)     // Catch: java.lang.Throwable -> Lb7
        L12c:
            r2 = 0
        L12d:
            r4 = 0
            goto L16a
        L12f:
            boolean r2 = r0 instanceof java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb7
            if (r2 != 0) goto L14b
            boolean r2 = r0 instanceof java.lang.SecurityException     // Catch: java.lang.Throwable -> Lb7
            if (r2 != 0) goto L14b
            boolean r2 = r0 instanceof java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> Lb7
            if (r2 != 0) goto L14b
            boolean r2 = r0 instanceof java.lang.NullPointerException     // Catch: java.lang.Throwable -> Lb7
            if (r2 == 0) goto L140
            goto L14b
        L140:
            boolean r2 = r0 instanceof java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb7
            if (r2 == 0) goto L14a
            java.lang.String r0 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r11, r0)     // Catch: java.lang.Throwable -> Lb7
            goto L12c
        L14a:
            throw r0     // Catch: java.lang.Throwable -> Lb7
        L14b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r2.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = "Failed to execute call: Unexpected exception: "
            r2.append(r4)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> Lb7
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lb7
            android.util.Log.w(r11, r0)     // Catch: java.lang.Throwable -> Lb7
            r0 = 9
            r2 = 0
            r12.a(r13, r0, r2)     // Catch: java.lang.Throwable -> Lb7
            goto L12d
        L16a:
            long r5 = defpackage.i61.d(r19)
            java.lang.StringBuilder r0 = defpackage.i61.r(r14, r9)
            double r5 = (double) r5
            double r5 = r5 / r17
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r6 = r16
            r7 = 0
            r8 = 1
            java.lang.String r0 = defpackage.i61.p(r5, r8, r7, r6, r0)
            android.util.Log.d(r11, r0)
            if (r4 != 0) goto L1a5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to create extension session from "
            r0.<init>(r5)
            r0.append(r10)
            java.lang.String r5 = ". Finalizing previous session"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r11, r0)
            if (r3 == 0) goto L1a5
            r1.c(r3)
        L1a5:
            if (r4 == 0) goto L1a9
            r12 = 1
            goto L1aa
        L1a9:
            r12 = r2
        L1aa:
            return r12
        L1ab:
            r0 = move-exception
            r6 = r8
            r19 = r15
            goto L81
        L1b1:
            long r1 = defpackage.i61.d(r19)
            java.lang.StringBuilder r3 = defpackage.i61.r(r14, r9)
            double r1 = (double) r1
            double r1 = r1 / r17
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r4 = 1
            java.lang.String r1 = defpackage.i61.p(r1, r4, r7, r6, r3)
            android.util.Log.d(r11, r1)
            throw r0
    }

    @Override // defpackage.bf0
    public final java.lang.String h() {
            r0 = this;
            java.lang.String r0 = r0.L
            return r0
    }

    @Override // defpackage.bf0
    public final boolean j0(android.hardware.camera2.params.InputConfiguration r26, java.util.ArrayList r27, defpackage.le0 r28) {
            r25 = this;
            r1 = r25
            java.lang.String r7 = "%.3f ms"
            java.lang.String r8 = " - "
            t57 r9 = r1.Y
            android.hardware.camera2.CameraDevice r10 = r1.B
            java.lang.String r11 = "CXCP"
            java.lang.String r12 = "Failed to execute call: Unexpected exception: "
            java.lang.String r13 = "Failed to execute call: Camera encountered an error: "
            r28.getClass()
            r2 = r28
            vr4 r0 = r1.a(r2)
            java.lang.Object r3 = r0.A
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.Object r0 = r0.B
            r4 = r0
            zc6 r4 = (defpackage.zc6) r4
            r14 = 0
            if (r3 != 0) goto L2a
            return r14
        L2a:
            if (r4 == 0) goto L2f
            r1.b(r4)
        L2f:
            java.lang.String r0 = "CXCP#createReprocessableCaptureSession-"
            java.lang.String r15 = r1.L
            java.lang.String r3 = defpackage.i61.m(r0, r15)
            long r16 = android.os.SystemClock.elapsedRealtimeNanos()
            r18 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r5 = 0
            r6 = 1
            android.os.Trace.beginSection(r3)     // Catch: java.lang.Throwable -> L15a
            id0 r14 = r1.R     // Catch: java.lang.Throwable -> L15a
            zd r0 = new zd     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L93
            r20 = r3
            r3 = r4
            id0 r4 = r1.R     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L89
            r21 = r5
            u63 r5 = r1.X     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L89
            r22 = r6
            android.os.Handler r6 = r9.a()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7e
            r23 = r9
            r24 = r20
            r9 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L76
            android.os.Handler r2 = r23.a()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L76
            r4 = r26
            r5 = r27
            r10.createReprocessableCaptureSession(r4, r5, r0, r2)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L76
            jg7 r5 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L76
            r2 = 0
            goto L11a
        L71:
            r0 = move-exception
        L72:
            r4 = r24
            goto L15d
        L76:
            r0 = move-exception
            goto L98
        L78:
            r0 = move-exception
            r24 = r20
            r9 = r22
            goto L72
        L7e:
            r0 = move-exception
            r24 = r20
            r9 = r22
            goto L98
        L84:
            r0 = move-exception
            r9 = r6
            r24 = r20
            goto L72
        L89:
            r0 = move-exception
            r9 = r6
            r24 = r20
            goto L98
        L8e:
            r0 = move-exception
            r24 = r3
            r9 = r6
            goto L72
        L93:
            r0 = move-exception
            r24 = r3
            r3 = r4
            r9 = r6
        L98:
            boolean r2 = r0 instanceof android.hardware.camera2.CameraAccessException     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto Le4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r2.<init>(r13)     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L71
            r2.append(r4)     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L71
            android.util.Log.w(r11, r2)     // Catch: java.lang.Throwable -> L71
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0     // Catch: java.lang.Throwable -> L71
            int r2 = r0.getReason()     // Catch: java.lang.Throwable -> L71
            r6 = 3
            if (r2 == r9) goto Lde
            r4 = 2
            if (r2 == r4) goto Ldd
            if (r2 == r6) goto Ldb
            r5 = 4
            if (r2 == r5) goto Ld9
            r5 = 5
            if (r2 == r5) goto Ld7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = "Unexpected CameraAccessException: "
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L71
            r2.append(r0)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L71
            android.util.Log.w(r11, r0)     // Catch: java.lang.Throwable -> L71
            r6 = 11
            goto Lde
        Ld7:
            r6 = r4
            goto Lde
        Ld9:
            r6 = r9
            goto Lde
        Ldb:
            r6 = 0
            goto Lde
        Ldd:
            r6 = 6
        Lde:
            r14.a(r15, r6, r9)     // Catch: java.lang.Throwable -> L71
        Le1:
            r2 = 0
        Le2:
            r5 = 0
            goto L11a
        Le4:
            boolean r2 = r0 instanceof java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L100
            boolean r2 = r0 instanceof java.lang.SecurityException     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L100
            boolean r2 = r0 instanceof java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L100
            boolean r2 = r0 instanceof java.lang.NullPointerException     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto Lf5
            goto L100
        Lf5:
            boolean r2 = r0 instanceof java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto Lff
            java.lang.String r0 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r11, r0)     // Catch: java.lang.Throwable -> L71
            goto Le1
        Lff:
            throw r0     // Catch: java.lang.Throwable -> L71
        L100:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r2.<init>(r12)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L71
            r2.append(r0)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L71
            android.util.Log.w(r11, r0)     // Catch: java.lang.Throwable -> L71
            r0 = 9
            r2 = 0
            r14.a(r15, r0, r2)     // Catch: java.lang.Throwable -> L71
            goto Le2
        L11a:
            long r12 = defpackage.i61.d(r16)
            r4 = r24
            java.lang.StringBuilder r0 = defpackage.i61.r(r4, r8)
            double r12 = (double) r12
            double r12 = r12 / r18
            java.lang.Double r4 = java.lang.Double.valueOf(r12)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r6 = 0
            java.lang.String r0 = defpackage.i61.p(r4, r9, r6, r7, r0)
            android.util.Log.d(r11, r0)
            if (r5 != 0) goto L154
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to create reprocess session from "
            r0.<init>(r4)
            r0.append(r10)
            java.lang.String r4 = ". Finalizing previous session"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r11, r0)
            if (r3 == 0) goto L154
            r1.c(r3)
        L154:
            if (r5 == 0) goto L158
            r14 = r9
            goto L159
        L158:
            r14 = r2
        L159:
            return r14
        L15a:
            r0 = move-exception
            r4 = r3
            r9 = r6
        L15d:
            long r1 = defpackage.i61.d(r16)
            java.lang.StringBuilder r3 = defpackage.i61.r(r4, r8)
            double r1 = (double) r1
            double r1 = r1 / r18
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r6 = 0
            java.lang.String r1 = defpackage.i61.p(r1, r9, r6, r7, r3)
            android.util.Log.d(r11, r1)
            throw r0
    }

    @Override // defpackage.bf0
    public final android.hardware.camera2.CaptureRequest.Builder k(android.hardware.camera2.TotalCaptureResult r19) {
            r18 = this;
            r0 = r18
            java.lang.String r1 = "%.3f ms"
            java.lang.String r2 = " - "
            java.lang.String r3 = "CXCP"
            java.lang.String r4 = "Failed to execute call: Unexpected exception: "
            java.lang.String r5 = "Failed to execute call: Camera encountered an error: "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "CXCP#createReprocessCaptureRequest-"
            r6.<init>(r7)
            java.lang.String r7 = r0.L
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            r12 = 1
            r13 = 0
            android.os.Trace.beginSection(r6)     // Catch: java.lang.Throwable -> L36
            id0 r14 = r0.R     // Catch: java.lang.Throwable -> L36
            android.hardware.camera2.CameraDevice r0 = r0.B     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3e
            r15 = r19
            android.hardware.camera2.CaptureRequest$Builder r0 = r0.createReprocessCaptureRequest(r15)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3e
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            goto Lc7
        L36:
            r0 = move-exception
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            goto Le2
        L3e:
            r0 = move-exception
            boolean r15 = r0 instanceof android.hardware.camera2.CameraAccessException     // Catch: java.lang.Throwable -> L36
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r10 = 0
            if (r15 == 0) goto L92
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = r0.getMessage()     // Catch: java.lang.Throwable -> L90
            r4.append(r5)     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L90
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L90
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0     // Catch: java.lang.Throwable -> L90
            int r4 = r0.getReason()     // Catch: java.lang.Throwable -> L90
            r5 = 3
            if (r4 == r12) goto L8a
            r11 = 2
            if (r4 == r11) goto L88
            if (r4 == r5) goto L8b
            r5 = 4
            if (r4 == r5) goto L86
            r5 = 5
            if (r4 == r5) goto L84
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = "Unexpected CameraAccessException: "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L90
            r4.append(r0)     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L90
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L90
            r10 = 11
            goto L8b
        L84:
            r10 = r11
            goto L8b
        L86:
            r10 = r12
            goto L8b
        L88:
            r10 = 6
            goto L8b
        L8a:
            r10 = r5
        L8b:
            r14.a(r7, r10, r12)     // Catch: java.lang.Throwable -> L90
        L8e:
            r0 = r13
            goto Lc7
        L90:
            r0 = move-exception
            goto Le2
        L92:
            boolean r5 = r0 instanceof java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L90
            if (r5 != 0) goto Lae
            boolean r5 = r0 instanceof java.lang.SecurityException     // Catch: java.lang.Throwable -> L90
            if (r5 != 0) goto Lae
            boolean r5 = r0 instanceof java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L90
            if (r5 != 0) goto Lae
            boolean r5 = r0 instanceof java.lang.NullPointerException     // Catch: java.lang.Throwable -> L90
            if (r5 == 0) goto La3
            goto Lae
        La3:
            boolean r4 = r0 instanceof java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto Lad
            java.lang.String r0 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> L90
            goto L8e
        Lad:
            throw r0     // Catch: java.lang.Throwable -> L90
        Lae:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L90
            r5.append(r0)     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L90
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L90
            r0 = 9
            r14.a(r7, r0, r10)     // Catch: java.lang.Throwable -> L90
            goto L8e
        Lc7:
            long r4 = defpackage.i61.d(r8)
            java.lang.StringBuilder r2 = defpackage.i61.r(r6, r2)
            double r4 = (double) r4
            double r4 = r4 / r16
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = defpackage.i61.p(r4, r12, r13, r1, r2)
            android.util.Log.d(r3, r1)
            return r0
        Le2:
            long r4 = defpackage.i61.d(r8)
            java.lang.StringBuilder r2 = defpackage.i61.r(r6, r2)
            double r4 = (double) r4
            double r4 = r4 / r16
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = defpackage.i61.p(r4, r12, r13, r1, r2)
            android.util.Log.d(r3, r1)
            throw r0
    }

    @Override // defpackage.bf0
    public final void n(int r8) {
            r7 = this;
            java.lang.String r0 = "Failed to execute call: Unexpected exception: "
            java.lang.String r1 = "Failed to execute call: Camera encountered an error: "
            java.lang.String r2 = "setCameraAudioRestriction"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = r7.L     // Catch: java.lang.Throwable -> L9b
            id0 r3 = r7.R     // Catch: java.lang.Throwable -> L9b
            android.hardware.camera2.CameraDevice r7 = r7.B     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L9b
            defpackage.m2.t(r7, r8)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L9b
            goto L97
        L14:
            r7 = move-exception
            boolean r8 = r7 instanceof android.hardware.camera2.CameraAccessException     // Catch: java.lang.Throwable -> L9b
            r4 = 0
            java.lang.String r5 = "CXCP"
            if (r8 == 0) goto L63
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = r7.getMessage()     // Catch: java.lang.Throwable -> L9b
            r8.append(r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L9b
            android.util.Log.w(r5, r8)     // Catch: java.lang.Throwable -> L9b
            android.hardware.camera2.CameraAccessException r7 = (android.hardware.camera2.CameraAccessException) r7     // Catch: java.lang.Throwable -> L9b
            int r8 = r7.getReason()     // Catch: java.lang.Throwable -> L9b
            r0 = 1
            r1 = 3
            if (r8 == r0) goto L5e
            r6 = 2
            if (r8 == r6) goto L5c
            if (r8 == r1) goto L5f
            r1 = 4
            if (r8 == r1) goto L5a
            r1 = 5
            if (r8 == r1) goto L58
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "Unexpected CameraAccessException: "
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L9b
            r8.append(r7)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L9b
            android.util.Log.w(r5, r7)     // Catch: java.lang.Throwable -> L9b
            r4 = 11
            goto L5f
        L58:
            r4 = r6
            goto L5f
        L5a:
            r4 = r0
            goto L5f
        L5c:
            r4 = 6
            goto L5f
        L5e:
            r4 = r1
        L5f:
            r3.a(r2, r4, r0)     // Catch: java.lang.Throwable -> L9b
            goto L97
        L63:
            boolean r8 = r7 instanceof java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L9b
            if (r8 != 0) goto L7f
            boolean r8 = r7 instanceof java.lang.SecurityException     // Catch: java.lang.Throwable -> L9b
            if (r8 != 0) goto L7f
            boolean r8 = r7 instanceof java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L9b
            if (r8 != 0) goto L7f
            boolean r8 = r7 instanceof java.lang.NullPointerException     // Catch: java.lang.Throwable -> L9b
            if (r8 == 0) goto L74
            goto L7f
        L74:
            boolean r8 = r7 instanceof java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9b
            if (r8 == 0) goto L7e
            java.lang.String r7 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r5, r7)     // Catch: java.lang.Throwable -> L9b
            goto L97
        L7e:
            throw r7     // Catch: java.lang.Throwable -> L9b
        L7f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L9b
            r8.append(r7)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L9b
            android.util.Log.w(r5, r7)     // Catch: java.lang.Throwable -> L9b
            r7 = 9
            r3.a(r2, r7, r4)     // Catch: java.lang.Throwable -> L9b
        L97:
            android.os.Trace.endSection()
            return
        L9b:
            r7 = move-exception
            android.os.Trace.endSection()
            throw r7
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AndroidCameraDevice(camera="
            r0.<init>(r1)
            java.lang.String r2 = r2.L
            java.lang.String r2 = defpackage.xf0.b(r2)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.bf0
    public final void u() {
            r1 = this;
            sw r0 = r1.Z
            boolean r0 = r0.a()
            if (r0 == 0) goto L13
            xw r0 = r1.d0
            java.lang.Object r0 = r0.a
            zc6 r0 = (defpackage.zc6) r0
            if (r0 == 0) goto L13
            r1.b(r0)
        L13:
            return
    }
}
