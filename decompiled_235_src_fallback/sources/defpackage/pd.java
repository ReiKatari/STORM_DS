package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pd  reason: default package */
/* loaded from: classes.dex */
public class pd implements defpackage.me0 {
    public final defpackage.bf0 A;
    public final android.hardware.camera2.CameraCaptureSession B;
    public final defpackage.id0 L;
    public final android.os.Handler R;

    public pd(defpackage.bf0 r1, android.hardware.camera2.CameraCaptureSession r2, defpackage.id0 r3, android.os.Handler r4) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            uw r0 = defpackage.ig0.a
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.uw.b
            r1.incrementAndGet(r0)
            return
    }

    @Override // defpackage.me0
    public final boolean E() {
            r17 = this;
            r0 = r17
            java.lang.String r1 = "%.3f ms"
            java.lang.String r2 = " - "
            java.lang.String r3 = "CXCP"
            java.lang.String r4 = "Failed to execute call: Unexpected exception: "
            java.lang.String r5 = "Failed to execute call: Camera encountered an error: "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "CXCP#abortCaptures-"
            r6.<init>(r7)
            bf0 r7 = r0.A
            java.lang.String r8 = r7.h()
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            r11 = 0
            r12 = 1
            android.os.Trace.beginSection(r6)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r7.h()     // Catch: java.lang.Throwable -> L3e
            id0 r13 = r0.L     // Catch: java.lang.Throwable -> L3e
            r14 = 0
            android.hardware.camera2.CameraCaptureSession r0 = r0.B     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L46
            r0.abortCaptures()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L46
            jg7 r0 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L46
            r15 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            goto Lce
        L3e:
            r0 = move-exception
            r15 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            goto Lec
        L46:
            r0 = move-exception
            r15 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            boolean r10 = r0 instanceof android.hardware.camera2.CameraAccessException     // Catch: java.lang.Throwable -> L97
            if (r10 == 0) goto L99
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = r0.getMessage()     // Catch: java.lang.Throwable -> L97
            r4.append(r5)     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L97
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L97
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0     // Catch: java.lang.Throwable -> L97
            int r4 = r0.getReason()     // Catch: java.lang.Throwable -> L97
            r5 = 3
            if (r4 == r12) goto L92
            r10 = 2
            if (r4 == r10) goto L91
            if (r4 == r5) goto L8f
            r5 = 4
            if (r4 == r5) goto L8d
            r5 = 5
            if (r4 == r5) goto L8b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = "Unexpected CameraAccessException: "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L97
            r4.append(r0)     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L97
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L97
            r5 = 11
            goto L92
        L8b:
            r5 = r10
            goto L92
        L8d:
            r5 = r12
            goto L92
        L8f:
            r5 = r14
            goto L92
        L91:
            r5 = 6
        L92:
            r13.a(r7, r5, r12)     // Catch: java.lang.Throwable -> L97
        L95:
            r0 = r11
            goto Lce
        L97:
            r0 = move-exception
            goto Lec
        L99:
            boolean r5 = r0 instanceof java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L97
            if (r5 != 0) goto Lb5
            boolean r5 = r0 instanceof java.lang.SecurityException     // Catch: java.lang.Throwable -> L97
            if (r5 != 0) goto Lb5
            boolean r5 = r0 instanceof java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L97
            if (r5 != 0) goto Lb5
            boolean r5 = r0 instanceof java.lang.NullPointerException     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto Laa
            goto Lb5
        Laa:
            boolean r4 = r0 instanceof java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L97
            if (r4 == 0) goto Lb4
            java.lang.String r0 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> L97
            goto L95
        Lb4:
            throw r0     // Catch: java.lang.Throwable -> L97
        Lb5:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L97
            r5.append(r0)     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L97
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L97
            r0 = 9
            r13.a(r7, r0, r14)     // Catch: java.lang.Throwable -> L97
            goto L95
        Lce:
            long r4 = defpackage.i61.d(r8)
            java.lang.StringBuilder r2 = defpackage.i61.r(r6, r2)
            double r4 = (double) r4
            double r4 = r4 / r15
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = defpackage.i61.p(r4, r12, r11, r1, r2)
            android.util.Log.d(r3, r1)
            if (r0 == 0) goto Lea
            goto Leb
        Lea:
            r12 = r14
        Leb:
            return r12
        Lec:
            long r4 = defpackage.i61.d(r8)
            java.lang.StringBuilder r2 = defpackage.i61.r(r6, r2)
            double r4 = (double) r4
            double r4 = r4 / r15
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = defpackage.i61.p(r4, r12, r11, r1, r2)
            android.util.Log.d(r3, r1)
            throw r0
    }

    @Override // defpackage.me0
    public final defpackage.bf0 L() {
            r0 = this;
            bf0 r0 = r0.A
            return r0
    }

    @Override // defpackage.me0
    public final java.lang.Integer Q(java.util.ArrayList r19, defpackage.vc0 r20) {
            r18 = this;
            r0 = r18
            java.lang.String r1 = "%.3f ms"
            java.lang.String r2 = " - "
            java.lang.String r3 = "CXCP"
            java.lang.String r4 = "Failed to execute call: Unexpected exception: "
            java.lang.String r5 = "Failed to execute call: Camera encountered an error: "
            r19.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "CXCP#captureBurst-"
            r6.<init>(r7)
            bf0 r7 = r0.A
            java.lang.String r8 = r7.h()
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            r12 = 1
            r13 = 0
            android.os.Trace.beginSection(r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = r7.h()     // Catch: java.lang.Throwable -> L4e
            id0 r14 = r0.L     // Catch: java.lang.Throwable -> L4e
            android.hardware.camera2.CameraCaptureSession r15 = r0.B     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            android.os.Handler r0 = r0.R     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            r10 = r19
            r11 = r20
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            int r0 = r15.captureBurst(r10, r11, r0)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            goto Ldd
        L49:
            r0 = move-exception
            goto Lf8
        L4c:
            r0 = move-exception
            goto L5c
        L4e:
            r0 = move-exception
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            goto Lf8
        L56:
            r0 = move-exception
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
        L5c:
            boolean r10 = r0 instanceof android.hardware.camera2.CameraAccessException     // Catch: java.lang.Throwable -> L49
            r11 = 0
            if (r10 == 0) goto La8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r0.getMessage()     // Catch: java.lang.Throwable -> L49
            r4.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L49
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L49
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0     // Catch: java.lang.Throwable -> L49
            int r4 = r0.getReason()     // Catch: java.lang.Throwable -> L49
            r5 = 3
            if (r4 == r12) goto La2
            r10 = 2
            if (r4 == r10) goto La0
            if (r4 == r5) goto La3
            r5 = 4
            if (r4 == r5) goto L9e
            r5 = 5
            if (r4 == r5) goto L9c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = "Unexpected CameraAccessException: "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L49
            r4.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L49
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L49
            r11 = 11
            goto La3
        L9c:
            r11 = r10
            goto La3
        L9e:
            r11 = r12
            goto La3
        La0:
            r11 = 6
            goto La3
        La2:
            r11 = r5
        La3:
            r14.a(r7, r11, r12)     // Catch: java.lang.Throwable -> L49
        La6:
            r0 = r13
            goto Ldd
        La8:
            boolean r5 = r0 instanceof java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto Lc4
            boolean r5 = r0 instanceof java.lang.SecurityException     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto Lc4
            boolean r5 = r0 instanceof java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto Lc4
            boolean r5 = r0 instanceof java.lang.NullPointerException     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto Lb9
            goto Lc4
        Lb9:
            boolean r4 = r0 instanceof java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto Lc3
            java.lang.String r0 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> L49
            goto La6
        Lc3:
            throw r0     // Catch: java.lang.Throwable -> L49
        Lc4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L49
            r5.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L49
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L49
            r0 = 9
            r14.a(r7, r0, r11)     // Catch: java.lang.Throwable -> L49
            goto La6
        Ldd:
            long r4 = defpackage.i61.d(r8)
            java.lang.StringBuilder r2 = defpackage.i61.r(r6, r2)
            double r4 = (double) r4
            double r4 = r4 / r16
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = defpackage.i61.p(r4, r12, r13, r1, r2)
            android.util.Log.d(r3, r1)
            return r0
        Lf8:
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

    @Override // defpackage.me0
    public final boolean V(java.util.List r19) {
            r18 = this;
            r0 = r18
            java.lang.String r1 = "%.3f ms"
            java.lang.String r2 = " - "
            java.lang.String r3 = "CXCP"
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            r6 = 0
            if (r4 < r5) goto L143
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "CXCP#finalizeOutputConfigurations-"
            r4.<init>(r5)
            bf0 r5 = r0.A
            java.lang.String r7 = r5.h()
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            long r7 = android.os.SystemClock.elapsedRealtimeNanos()
            r11 = 0
            r12 = 1
            android.os.Trace.beginSection(r4)     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = r5.h()     // Catch: java.lang.Throwable -> L72
            id0 r13 = r0.L     // Catch: java.lang.Throwable -> L72
            android.hardware.camera2.CameraCaptureSession r0 = r0.B     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L7a
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L7a
            r15 = 10
            r9 = r19
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            int r10 = defpackage.ht0.v0(r9, r15)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
            r14.<init>(r10)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
        L4a:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
            if (r10 == 0) goto L6b
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
            xi r10 = (defpackage.xi) r10     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
            java.lang.Class<android.hardware.camera2.params.OutputConfiguration> r15 = android.hardware.camera2.params.OutputConfiguration.class
            ar0 r15 = defpackage.gh5.a(r15)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
            java.lang.Object r10 = r10.e(r15)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
            android.hardware.camera2.params.OutputConfiguration r10 = (android.hardware.camera2.params.OutputConfiguration) r10     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
            r14.add(r10)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
            goto L4a
        L66:
            r0 = move-exception
            goto L128
        L69:
            r0 = move-exception
            goto L80
        L6b:
            defpackage.k2.o(r0, r14)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
            jg7 r0 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
            goto L10a
        L72:
            r0 = move-exception
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            goto L128
        L7a:
            r0 = move-exception
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
        L80:
            boolean r9 = r0 instanceof android.hardware.camera2.CameraAccessException     // Catch: java.lang.Throwable -> L66
            if (r9 == 0) goto Ld0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r9.<init>()     // Catch: java.lang.Throwable -> L66
            java.lang.String r10 = "Failed to execute call: Camera encountered an error: "
            r9.append(r10)     // Catch: java.lang.Throwable -> L66
            java.lang.String r10 = r0.getMessage()     // Catch: java.lang.Throwable -> L66
            r9.append(r10)     // Catch: java.lang.Throwable -> L66
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L66
            android.util.Log.w(r3, r9)     // Catch: java.lang.Throwable -> L66
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0     // Catch: java.lang.Throwable -> L66
            int r9 = r0.getReason()     // Catch: java.lang.Throwable -> L66
            r10 = 3
            if (r9 == r12) goto Lcb
            r14 = 2
            if (r9 == r14) goto Lca
            if (r9 == r10) goto Lc8
            r10 = 4
            if (r9 == r10) goto Lc6
            r10 = 5
            if (r9 == r10) goto Lc4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            java.lang.String r10 = "Unexpected CameraAccessException: "
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L66
            r9.append(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L66
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L66
            r10 = 11
            goto Lcb
        Lc4:
            r10 = r14
            goto Lcb
        Lc6:
            r10 = r12
            goto Lcb
        Lc8:
            r10 = r6
            goto Lcb
        Lca:
            r10 = 6
        Lcb:
            r13.a(r5, r10, r12)     // Catch: java.lang.Throwable -> L66
        Lce:
            r0 = r11
            goto L10a
        Ld0:
            boolean r9 = r0 instanceof java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L66
            if (r9 != 0) goto Lec
            boolean r9 = r0 instanceof java.lang.SecurityException     // Catch: java.lang.Throwable -> L66
            if (r9 != 0) goto Lec
            boolean r9 = r0 instanceof java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L66
            if (r9 != 0) goto Lec
            boolean r9 = r0 instanceof java.lang.NullPointerException     // Catch: java.lang.Throwable -> L66
            if (r9 == 0) goto Le1
            goto Lec
        Le1:
            boolean r5 = r0 instanceof java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L66
            if (r5 == 0) goto Leb
            java.lang.String r0 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> L66
            goto Lce
        Leb:
            throw r0     // Catch: java.lang.Throwable -> L66
        Lec:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r9.<init>()     // Catch: java.lang.Throwable -> L66
            java.lang.String r10 = "Failed to execute call: Unexpected exception: "
            r9.append(r10)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L66
            r9.append(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L66
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L66
            r0 = 9
            r13.a(r5, r0, r6)     // Catch: java.lang.Throwable -> L66
            goto Lce
        L10a:
            long r7 = defpackage.i61.d(r7)
            java.lang.StringBuilder r2 = defpackage.i61.r(r4, r2)
            double r4 = (double) r7
            double r4 = r4 / r16
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = defpackage.i61.p(r4, r12, r11, r1, r2)
            android.util.Log.d(r3, r1)
            if (r0 == 0) goto L127
            r6 = r12
        L127:
            return r6
        L128:
            long r5 = defpackage.i61.d(r7)
            java.lang.StringBuilder r2 = defpackage.i61.r(r4, r2)
            double r4 = (double) r5
            double r4 = r4 / r16
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = defpackage.i61.p(r4, r12, r11, r1, r2)
            android.util.Log.d(r3, r1)
            throw r0
        L143:
            java.lang.String r0 = "Attempting to call finalizeOutputConfigurations before O is not supported and may lead to to unexpected behavior if an application is expects this call to succeed."
            defpackage.i.m(r0)
            return r6
    }

    @Override // defpackage.me0
    public final boolean W() {
            r17 = this;
            r0 = r17
            java.lang.String r1 = "%.3f ms"
            java.lang.String r2 = " - "
            java.lang.String r3 = "CXCP"
            java.lang.String r4 = "Failed to execute call: Unexpected exception: "
            java.lang.String r5 = "Failed to execute call: Camera encountered an error: "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "CXCP#stopRepeating-"
            r6.<init>(r7)
            bf0 r7 = r0.A
            java.lang.String r8 = r7.h()
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            r11 = 0
            r12 = 1
            android.os.Trace.beginSection(r6)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r7.h()     // Catch: java.lang.Throwable -> L3e
            id0 r13 = r0.L     // Catch: java.lang.Throwable -> L3e
            r14 = 0
            android.hardware.camera2.CameraCaptureSession r0 = r0.B     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L46
            r0.stopRepeating()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L46
            jg7 r0 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L46
            r15 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            goto Lce
        L3e:
            r0 = move-exception
            r15 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            goto Lec
        L46:
            r0 = move-exception
            r15 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            boolean r10 = r0 instanceof android.hardware.camera2.CameraAccessException     // Catch: java.lang.Throwable -> L97
            if (r10 == 0) goto L99
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = r0.getMessage()     // Catch: java.lang.Throwable -> L97
            r4.append(r5)     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L97
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L97
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0     // Catch: java.lang.Throwable -> L97
            int r4 = r0.getReason()     // Catch: java.lang.Throwable -> L97
            r5 = 3
            if (r4 == r12) goto L92
            r10 = 2
            if (r4 == r10) goto L91
            if (r4 == r5) goto L8f
            r5 = 4
            if (r4 == r5) goto L8d
            r5 = 5
            if (r4 == r5) goto L8b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = "Unexpected CameraAccessException: "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L97
            r4.append(r0)     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L97
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L97
            r5 = 11
            goto L92
        L8b:
            r5 = r10
            goto L92
        L8d:
            r5 = r12
            goto L92
        L8f:
            r5 = r14
            goto L92
        L91:
            r5 = 6
        L92:
            r13.a(r7, r5, r12)     // Catch: java.lang.Throwable -> L97
        L95:
            r0 = r11
            goto Lce
        L97:
            r0 = move-exception
            goto Lec
        L99:
            boolean r5 = r0 instanceof java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L97
            if (r5 != 0) goto Lb5
            boolean r5 = r0 instanceof java.lang.SecurityException     // Catch: java.lang.Throwable -> L97
            if (r5 != 0) goto Lb5
            boolean r5 = r0 instanceof java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L97
            if (r5 != 0) goto Lb5
            boolean r5 = r0 instanceof java.lang.NullPointerException     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto Laa
            goto Lb5
        Laa:
            boolean r4 = r0 instanceof java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L97
            if (r4 == 0) goto Lb4
            java.lang.String r0 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> L97
            goto L95
        Lb4:
            throw r0     // Catch: java.lang.Throwable -> L97
        Lb5:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L97
            r5.append(r0)     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L97
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L97
            r0 = 9
            r13.a(r7, r0, r14)     // Catch: java.lang.Throwable -> L97
            goto L95
        Lce:
            long r4 = defpackage.i61.d(r8)
            java.lang.StringBuilder r2 = defpackage.i61.r(r6, r2)
            double r4 = (double) r4
            double r4 = r4 / r15
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = defpackage.i61.p(r4, r12, r11, r1, r2)
            android.util.Log.d(r3, r1)
            if (r0 == 0) goto Lea
            goto Leb
        Lea:
            r12 = r14
        Leb:
            return r12
        Lec:
            long r4 = defpackage.i61.d(r8)
            java.lang.StringBuilder r2 = defpackage.i61.r(r6, r2)
            double r4 = (double) r4
            double r4 = r4 / r15
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = defpackage.i61.p(r4, r12, r11, r1, r2)
            android.util.Log.d(r3, r1)
            throw r0
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            android.hardware.camera2.CameraCaptureSession r0 = r0.B
            r0.close()
            return
    }

    @Override // defpackage.me0
    public final java.lang.Integer d0(android.hardware.camera2.CaptureRequest r19, defpackage.vc0 r20) {
            r18 = this;
            r0 = r18
            java.lang.String r1 = "%.3f ms"
            java.lang.String r2 = " - "
            java.lang.String r3 = "CXCP"
            java.lang.String r4 = "Failed to execute call: Unexpected exception: "
            java.lang.String r5 = "Failed to execute call: Camera encountered an error: "
            r19.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "CXCP#capture-"
            r6.<init>(r7)
            bf0 r7 = r0.A
            java.lang.String r8 = r7.h()
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            r12 = 1
            r13 = 0
            android.os.Trace.beginSection(r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = r7.h()     // Catch: java.lang.Throwable -> L4e
            id0 r14 = r0.L     // Catch: java.lang.Throwable -> L4e
            android.hardware.camera2.CameraCaptureSession r15 = r0.B     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            android.os.Handler r0 = r0.R     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            r10 = r19
            r11 = r20
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            int r0 = r15.capture(r10, r11, r0)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            goto Ldd
        L49:
            r0 = move-exception
            goto Lf8
        L4c:
            r0 = move-exception
            goto L5c
        L4e:
            r0 = move-exception
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            goto Lf8
        L56:
            r0 = move-exception
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
        L5c:
            boolean r10 = r0 instanceof android.hardware.camera2.CameraAccessException     // Catch: java.lang.Throwable -> L49
            r11 = 0
            if (r10 == 0) goto La8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r0.getMessage()     // Catch: java.lang.Throwable -> L49
            r4.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L49
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L49
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0     // Catch: java.lang.Throwable -> L49
            int r4 = r0.getReason()     // Catch: java.lang.Throwable -> L49
            r5 = 3
            if (r4 == r12) goto La2
            r10 = 2
            if (r4 == r10) goto La0
            if (r4 == r5) goto La3
            r5 = 4
            if (r4 == r5) goto L9e
            r5 = 5
            if (r4 == r5) goto L9c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = "Unexpected CameraAccessException: "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L49
            r4.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L49
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L49
            r11 = 11
            goto La3
        L9c:
            r11 = r10
            goto La3
        L9e:
            r11 = r12
            goto La3
        La0:
            r11 = 6
            goto La3
        La2:
            r11 = r5
        La3:
            r14.a(r7, r11, r12)     // Catch: java.lang.Throwable -> L49
        La6:
            r0 = r13
            goto Ldd
        La8:
            boolean r5 = r0 instanceof java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto Lc4
            boolean r5 = r0 instanceof java.lang.SecurityException     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto Lc4
            boolean r5 = r0 instanceof java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto Lc4
            boolean r5 = r0 instanceof java.lang.NullPointerException     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto Lb9
            goto Lc4
        Lb9:
            boolean r4 = r0 instanceof java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto Lc3
            java.lang.String r0 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> L49
            goto La6
        Lc3:
            throw r0     // Catch: java.lang.Throwable -> L49
        Lc4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L49
            r5.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L49
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L49
            r0 = 9
            r14.a(r7, r0, r11)     // Catch: java.lang.Throwable -> L49
            goto La6
        Ldd:
            long r4 = defpackage.i61.d(r8)
            java.lang.StringBuilder r2 = defpackage.i61.r(r6, r2)
            double r4 = (double) r4
            double r4 = r4 / r16
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = defpackage.i61.p(r4, r12, r13, r1, r2)
            android.util.Log.d(r3, r1)
            return r0
        Lf8:
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

    @Override // defpackage.hh7
    public java.lang.Object e(defpackage.ar0 r2) {
            r1 = this;
            java.lang.Class<android.hardware.camera2.CameraCaptureSession> r0 = android.hardware.camera2.CameraCaptureSession.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lf
            android.hardware.camera2.CameraCaptureSession r1 = r1.B
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // defpackage.me0
    public final android.view.Surface getInputSurface() {
            r0 = this;
            android.hardware.camera2.CameraCaptureSession r0 = r0.B
            android.view.Surface r0 = r0.getInputSurface()
            return r0
    }

    @Override // defpackage.me0
    public final java.lang.Integer i(android.hardware.camera2.CaptureRequest r19, defpackage.vc0 r20) {
            r18 = this;
            r0 = r18
            java.lang.String r1 = "%.3f ms"
            java.lang.String r2 = " - "
            java.lang.String r3 = "CXCP"
            java.lang.String r4 = "Failed to execute call: Unexpected exception: "
            java.lang.String r5 = "Failed to execute call: Camera encountered an error: "
            r19.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "CXCP#setRepeatingRequest-"
            r6.<init>(r7)
            bf0 r7 = r0.A
            java.lang.String r8 = r7.h()
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            r12 = 1
            r13 = 0
            android.os.Trace.beginSection(r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = r7.h()     // Catch: java.lang.Throwable -> L4e
            id0 r14 = r0.L     // Catch: java.lang.Throwable -> L4e
            android.hardware.camera2.CameraCaptureSession r15 = r0.B     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            android.os.Handler r0 = r0.R     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            r10 = r19
            r11 = r20
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            int r0 = r15.setRepeatingRequest(r10, r11, r0)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            goto Ldd
        L49:
            r0 = move-exception
            goto Lf8
        L4c:
            r0 = move-exception
            goto L5c
        L4e:
            r0 = move-exception
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            goto Lf8
        L56:
            r0 = move-exception
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
        L5c:
            boolean r10 = r0 instanceof android.hardware.camera2.CameraAccessException     // Catch: java.lang.Throwable -> L49
            r11 = 0
            if (r10 == 0) goto La8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r0.getMessage()     // Catch: java.lang.Throwable -> L49
            r4.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L49
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L49
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0     // Catch: java.lang.Throwable -> L49
            int r4 = r0.getReason()     // Catch: java.lang.Throwable -> L49
            r5 = 3
            if (r4 == r12) goto La2
            r10 = 2
            if (r4 == r10) goto La0
            if (r4 == r5) goto La3
            r5 = 4
            if (r4 == r5) goto L9e
            r5 = 5
            if (r4 == r5) goto L9c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = "Unexpected CameraAccessException: "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L49
            r4.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L49
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L49
            r11 = 11
            goto La3
        L9c:
            r11 = r10
            goto La3
        L9e:
            r11 = r12
            goto La3
        La0:
            r11 = 6
            goto La3
        La2:
            r11 = r5
        La3:
            r14.a(r7, r11, r12)     // Catch: java.lang.Throwable -> L49
        La6:
            r0 = r13
            goto Ldd
        La8:
            boolean r5 = r0 instanceof java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto Lc4
            boolean r5 = r0 instanceof java.lang.SecurityException     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto Lc4
            boolean r5 = r0 instanceof java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto Lc4
            boolean r5 = r0 instanceof java.lang.NullPointerException     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto Lb9
            goto Lc4
        Lb9:
            boolean r4 = r0 instanceof java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto Lc3
            java.lang.String r0 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> L49
            goto La6
        Lc3:
            throw r0     // Catch: java.lang.Throwable -> L49
        Lc4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L49
            r5.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L49
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L49
            r0 = 9
            r14.a(r7, r0, r11)     // Catch: java.lang.Throwable -> L49
            goto La6
        Ldd:
            long r4 = defpackage.i61.d(r8)
            java.lang.StringBuilder r2 = defpackage.i61.r(r6, r2)
            double r4 = (double) r4
            double r4 = r4 / r16
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = defpackage.i61.p(r4, r12, r13, r1, r2)
            android.util.Log.d(r3, r1)
            return r0
        Lf8:
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

    @Override // defpackage.me0
    public final java.lang.Integer o(java.util.ArrayList r19, defpackage.vc0 r20) {
            r18 = this;
            r0 = r18
            java.lang.String r1 = "%.3f ms"
            java.lang.String r2 = " - "
            java.lang.String r3 = "CXCP"
            java.lang.String r4 = "Failed to execute call: Unexpected exception: "
            java.lang.String r5 = "Failed to execute call: Camera encountered an error: "
            r19.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "CXCP#setRepeatingBurst-"
            r6.<init>(r7)
            bf0 r7 = r0.A
            java.lang.String r8 = r7.h()
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            r12 = 1
            r13 = 0
            android.os.Trace.beginSection(r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = r7.h()     // Catch: java.lang.Throwable -> L4e
            id0 r14 = r0.L     // Catch: java.lang.Throwable -> L4e
            android.hardware.camera2.CameraCaptureSession r15 = r0.B     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            android.os.Handler r0 = r0.R     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            r10 = r19
            r11 = r20
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            int r0 = r15.setRepeatingBurst(r10, r11, r0)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            goto Ldd
        L49:
            r0 = move-exception
            goto Lf8
        L4c:
            r0 = move-exception
            goto L5c
        L4e:
            r0 = move-exception
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            goto Lf8
        L56:
            r0 = move-exception
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
        L5c:
            boolean r10 = r0 instanceof android.hardware.camera2.CameraAccessException     // Catch: java.lang.Throwable -> L49
            r11 = 0
            if (r10 == 0) goto La8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r0.getMessage()     // Catch: java.lang.Throwable -> L49
            r4.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L49
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L49
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0     // Catch: java.lang.Throwable -> L49
            int r4 = r0.getReason()     // Catch: java.lang.Throwable -> L49
            r5 = 3
            if (r4 == r12) goto La2
            r10 = 2
            if (r4 == r10) goto La0
            if (r4 == r5) goto La3
            r5 = 4
            if (r4 == r5) goto L9e
            r5 = 5
            if (r4 == r5) goto L9c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = "Unexpected CameraAccessException: "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L49
            r4.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L49
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L49
            r11 = 11
            goto La3
        L9c:
            r11 = r10
            goto La3
        L9e:
            r11 = r12
            goto La3
        La0:
            r11 = 6
            goto La3
        La2:
            r11 = r5
        La3:
            r14.a(r7, r11, r12)     // Catch: java.lang.Throwable -> L49
        La6:
            r0 = r13
            goto Ldd
        La8:
            boolean r5 = r0 instanceof java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto Lc4
            boolean r5 = r0 instanceof java.lang.SecurityException     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto Lc4
            boolean r5 = r0 instanceof java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto Lc4
            boolean r5 = r0 instanceof java.lang.NullPointerException     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto Lb9
            goto Lc4
        Lb9:
            boolean r4 = r0 instanceof java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto Lc3
            java.lang.String r0 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> L49
            goto La6
        Lc3:
            throw r0     // Catch: java.lang.Throwable -> L49
        Lc4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L49
            r5.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L49
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L49
            r0 = 9
            r14.a(r7, r0, r11)     // Catch: java.lang.Throwable -> L49
            goto La6
        Ldd:
            long r4 = defpackage.i61.d(r8)
            java.lang.StringBuilder r2 = defpackage.i61.r(r6, r2)
            double r4 = (double) r4
            double r4 = r4 / r16
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = defpackage.i61.p(r4, r12, r13, r1, r2)
            android.util.Log.d(r3, r1)
            return r0
        Lf8:
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
}
