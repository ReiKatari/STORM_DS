package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: th  reason: default package */
/* loaded from: classes.dex */
public final class th implements defpackage.hh7, defpackage.je0 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;
    public final defpackage.hh7 L;

    public th(android.hardware.camera2.TotalCaptureResult r3, java.lang.String r4, defpackage.yk5 r5) {
            r2 = this;
            r0 = 0
            r2.A = r0
            r4.getClass()
            r5.getClass()
            r2.<init>()
            r2.B = r3
            uh r5 = new uh
            r5.<init>(r3, r4)
            r2.L = r5
            java.lang.String r2 = "physicalCaptureResults"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L7a
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L7a
            r4 = 31
            if (r2 < r4) goto L28
            java.util.Map r2 = defpackage.ma.s(r3)     // Catch: java.lang.Throwable -> L7a
            r2.getClass()     // Catch: java.lang.Throwable -> L7a
            goto L33
        L28:
            r4 = 28
            if (r2 < r4) goto L31
            java.util.Map r2 = defpackage.j2.j(r3)     // Catch: java.lang.Throwable -> L7a
            goto L33
        L31:
            zt1 r2 = defpackage.zt1.A     // Catch: java.lang.Throwable -> L7a
        L33:
            if (r2 == 0) goto L76
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r3 == 0) goto L3c
            goto L76
        L3c:
            android.util.ArrayMap r3 = new android.util.ArrayMap     // Catch: java.lang.Throwable -> L7a
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L7a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7a
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L7a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L7a
        L4d:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L7a
            if (r4 == 0) goto L76
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L7a
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L7a
            defpackage.xf0.a(r5)     // Catch: java.lang.Throwable -> L7a
            xf0 r0 = new xf0     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L7a
            uh r1 = new uh     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L7a
            android.hardware.camera2.CaptureResult r4 = (android.hardware.camera2.CaptureResult) r4     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L7a
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L7a
            goto L4d
        L76:
            android.os.Trace.endSection()
            return
        L7a:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
    }

    public th(defpackage.yk5 r2, defpackage.th r3) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r2.getClass()
            r1.<init>()
            r1.B = r2
            r1.L = r3
            return
    }

    @Override // defpackage.je0
    public defpackage.sy6 a() {
            r2 = this;
            java.lang.Object r2 = r2.B
            yk5 r2 = (defpackage.yk5) r2
            k54 r0 = defpackage.uy6.a
            sy6 r1 = defpackage.sy6.b
            java.lang.Object r2 = r2.a(r0, r1)
            sy6 r2 = (defpackage.sy6) r2
            return r2
    }

    @Override // defpackage.je0
    public defpackage.ie0 b() {
            r5 = this;
            hh7 r5 = r5.L
            th r5 = (defpackage.th) r5
            uh r5 = r5.j()
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.FLASH_STATE
            r0.getClass()
            r5.getClass()
            android.hardware.camera2.CaptureResult r5 = r5.A
            java.lang.Object r0 = r5.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L1b
            goto L21
        L1b:
            int r1 = r0.intValue()
            if (r1 == 0) goto L8b
        L21:
            if (r0 != 0) goto L24
            goto L2c
        L24:
            int r1 = r0.intValue()
            r2 = 1
            if (r1 != r2) goto L2c
            goto L8b
        L2c:
            if (r0 != 0) goto L2f
            goto L39
        L2f:
            int r1 = r0.intValue()
            r2 = 2
            if (r1 != r2) goto L39
            ie0 r5 = defpackage.ie0.READY
            return r5
        L39:
            if (r0 != 0) goto L3c
            goto L43
        L3c:
            int r1 = r0.intValue()
            r2 = 3
            if (r1 == r2) goto L88
        L43:
            if (r0 != 0) goto L46
            goto L4e
        L46:
            int r1 = r0.intValue()
            r2 = 4
            if (r1 != r2) goto L4e
            goto L88
        L4e:
            if (r0 != 0) goto L53
            ie0 r5 = defpackage.ie0.UNKNOWN
            return r5
        L53:
            java.lang.String r1 = "CXCP"
            boolean r2 = defpackage.kj2.F(r1)
            if (r2 == 0) goto L85
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown flash state ("
            r2.<init>(r3)
            int r0 = r0.intValue()
            r2.append(r0)
            java.lang.String r0 = ") for "
            r2.append(r0)
            long r3 = r5.getFrameNumber()
            java.lang.String r5 = defpackage.nm2.a(r3)
            r2.append(r5)
            r5 = 33
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.util.Log.d(r1, r5)
        L85:
            ie0 r5 = defpackage.ie0.UNKNOWN
            return r5
        L88:
            ie0 r5 = defpackage.ie0.FIRED
            return r5
        L8b:
            ie0 r5 = defpackage.ie0.NONE
            return r5
    }

    @Override // defpackage.je0
    public long c() {
            r3 = this;
            hh7 r3 = r3.L
            th r3 = (defpackage.th) r3
            uh r3 = r3.j()
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP
            r0.getClass()
            r1 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.getClass()
            android.hardware.camera2.CaptureResult r3 = r3.A
            java.lang.Object r3 = r3.get(r0)
            if (r3 != 0) goto L1f
            goto L20
        L1f:
            r1 = r3
        L20:
            java.lang.Number r1 = (java.lang.Number) r1
            long r0 = r1.longValue()
            return r0
    }

    @Override // defpackage.je0
    public defpackage.he0 d() {
            r5 = this;
            hh7 r5 = r5.L
            th r5 = (defpackage.th) r5
            uh r5 = r5.j()
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AWB_STATE
            r0.getClass()
            r5.getClass()
            android.hardware.camera2.CaptureResult r5 = r5.A
            java.lang.Object r0 = r5.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L1b
            goto L24
        L1b:
            int r1 = r0.intValue()
            if (r1 != 0) goto L24
            he0 r5 = defpackage.he0.INACTIVE
            return r5
        L24:
            if (r0 != 0) goto L27
            goto L31
        L27:
            int r1 = r0.intValue()
            r2 = 1
            if (r1 != r2) goto L31
            he0 r5 = defpackage.he0.METERING
            return r5
        L31:
            if (r0 != 0) goto L34
            goto L3e
        L34:
            int r1 = r0.intValue()
            r2 = 2
            if (r1 != r2) goto L3e
            he0 r5 = defpackage.he0.CONVERGED
            return r5
        L3e:
            if (r0 != 0) goto L41
            goto L4b
        L41:
            int r1 = r0.intValue()
            r2 = 3
            if (r1 != r2) goto L4b
            he0 r5 = defpackage.he0.LOCKED
            return r5
        L4b:
            if (r0 != 0) goto L50
            he0 r5 = defpackage.he0.UNKNOWN
            return r5
        L50:
            java.lang.String r1 = "CXCP"
            boolean r2 = defpackage.kj2.F(r1)
            if (r2 == 0) goto L82
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown AWB state ("
            r2.<init>(r3)
            int r0 = r0.intValue()
            r2.append(r0)
            java.lang.String r0 = ") for "
            r2.append(r0)
            long r3 = r5.getFrameNumber()
            java.lang.String r5 = defpackage.nm2.a(r3)
            r2.append(r5)
            r5 = 33
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.util.Log.d(r1, r5)
        L82:
            he0 r5 = defpackage.he0.UNKNOWN
            return r5
    }

    @Override // defpackage.hh7
    public final java.lang.Object e(defpackage.ar0 r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Class<th> r0 = defpackage.th.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r0 = r2.equals(r0)
            hh7 r1 = r1.L
            th r1 = (defpackage.th) r1
            if (r0 == 0) goto L16
            goto L1a
        L16:
            java.lang.Object r1 = r1.e(r2)
        L1a:
            return r1
        L1b:
            java.lang.Object r1 = r1.B
            android.hardware.camera2.TotalCaptureResult r1 = (android.hardware.camera2.TotalCaptureResult) r1
            java.lang.Class<android.hardware.camera2.CaptureResult> r0 = android.hardware.camera2.CaptureResult.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2c
            goto L3a
        L2c:
            java.lang.Class<android.hardware.camera2.TotalCaptureResult> r0 = android.hardware.camera2.TotalCaptureResult.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L39
            goto L3a
        L39:
            r1 = 0
        L3a:
            return r1
    }

    @Override // defpackage.je0
    public defpackage.fe0 f() {
            r5 = this;
            hh7 r5 = r5.L
            th r5 = (defpackage.th) r5
            uh r5 = r5.j()
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            r0.getClass()
            r5.getClass()
            android.hardware.camera2.CaptureResult r5 = r5.A
            java.lang.Object r0 = r5.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L1b
            goto L24
        L1b:
            int r1 = r0.intValue()
            if (r1 != 0) goto L24
            fe0 r5 = defpackage.fe0.INACTIVE
            return r5
        L24:
            if (r0 != 0) goto L27
            goto L2e
        L27:
            int r1 = r0.intValue()
            r2 = 1
            if (r1 == r2) goto L9a
        L2e:
            if (r0 != 0) goto L31
            goto L39
        L31:
            int r1 = r0.intValue()
            r2 = 5
            if (r1 != r2) goto L39
            goto L9a
        L39:
            if (r0 != 0) goto L3c
            goto L46
        L3c:
            int r1 = r0.intValue()
            r2 = 4
            if (r1 != r2) goto L46
            fe0 r5 = defpackage.fe0.FLASH_REQUIRED
            return r5
        L46:
            if (r0 != 0) goto L49
            goto L53
        L49:
            int r1 = r0.intValue()
            r2 = 2
            if (r1 != r2) goto L53
            fe0 r5 = defpackage.fe0.CONVERGED
            return r5
        L53:
            if (r0 != 0) goto L56
            goto L60
        L56:
            int r1 = r0.intValue()
            r2 = 3
            if (r1 != r2) goto L60
            fe0 r5 = defpackage.fe0.LOCKED
            return r5
        L60:
            if (r0 != 0) goto L65
            fe0 r5 = defpackage.fe0.UNKNOWN
            return r5
        L65:
            java.lang.String r1 = "CXCP"
            boolean r2 = defpackage.kj2.F(r1)
            if (r2 == 0) goto L97
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown AE state ("
            r2.<init>(r3)
            int r0 = r0.intValue()
            r2.append(r0)
            java.lang.String r0 = ") for "
            r2.append(r0)
            long r3 = r5.getFrameNumber()
            java.lang.String r5 = defpackage.nm2.a(r3)
            r2.append(r5)
            r5 = 33
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.util.Log.d(r1, r5)
        L97:
            fe0 r5 = defpackage.fe0.UNKNOWN
            return r5
        L9a:
            fe0 r5 = defpackage.fe0.SEARCHING
            return r5
    }

    @Override // defpackage.je0
    public defpackage.ge0 g() {
            r5 = this;
            hh7 r5 = r5.L
            th r5 = (defpackage.th) r5
            uh r5 = r5.j()
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
            r0.getClass()
            r5.getClass()
            android.hardware.camera2.CaptureResult r5 = r5.A
            java.lang.Object r0 = r5.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L1b
            goto L24
        L1b:
            int r1 = r0.intValue()
            if (r1 != 0) goto L24
            ge0 r5 = defpackage.ge0.INACTIVE
            return r5
        L24:
            if (r0 != 0) goto L27
            goto L2e
        L27:
            int r1 = r0.intValue()
            r2 = 3
            if (r1 == r2) goto La8
        L2e:
            if (r0 != 0) goto L31
            goto L3a
        L31:
            int r1 = r0.intValue()
            r2 = 1
            if (r1 != r2) goto L3a
            goto La8
        L3a:
            if (r0 != 0) goto L3d
            goto L47
        L3d:
            int r1 = r0.intValue()
            r2 = 4
            if (r1 != r2) goto L47
            ge0 r5 = defpackage.ge0.LOCKED_FOCUSED
            return r5
        L47:
            if (r0 != 0) goto L4a
            goto L54
        L4a:
            int r1 = r0.intValue()
            r2 = 5
            if (r1 != r2) goto L54
            ge0 r5 = defpackage.ge0.LOCKED_NOT_FOCUSED
            return r5
        L54:
            if (r0 != 0) goto L57
            goto L61
        L57:
            int r1 = r0.intValue()
            r2 = 2
            if (r1 != r2) goto L61
            ge0 r5 = defpackage.ge0.PASSIVE_FOCUSED
            return r5
        L61:
            if (r0 != 0) goto L64
            goto L6e
        L64:
            int r1 = r0.intValue()
            r2 = 6
            if (r1 != r2) goto L6e
            ge0 r5 = defpackage.ge0.PASSIVE_NOT_FOCUSED
            return r5
        L6e:
            if (r0 != 0) goto L73
            ge0 r5 = defpackage.ge0.UNKNOWN
            return r5
        L73:
            java.lang.String r1 = "CXCP"
            boolean r2 = defpackage.kj2.F(r1)
            if (r2 == 0) goto La5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown AF state ("
            r2.<init>(r3)
            int r0 = r0.intValue()
            r2.append(r0)
            java.lang.String r0 = ") for "
            r2.append(r0)
            long r3 = r5.getFrameNumber()
            java.lang.String r5 = defpackage.nm2.a(r3)
            r2.append(r5)
            r5 = 33
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.util.Log.d(r1, r5)
        La5:
            ge0 r5 = defpackage.ge0.UNKNOWN
            return r5
        La8:
            ge0 r5 = defpackage.ge0.SCANNING
            return r5
    }

    public defpackage.uh j() {
            r0 = this;
            hh7 r0 = r0.L
            uh r0 = (defpackage.uh) r0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = super.toString()
            return r3
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FrameInfo(camera: "
            r0.<init>(r1)
            hh7 r3 = r3.L
            uh r3 = (defpackage.uh) r3
            java.lang.String r1 = r3.B
            java.lang.String r1 = defpackage.xf0.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", frameNumber: "
            r0.append(r1)
            android.hardware.camera2.CaptureResult r3 = r3.A
            long r1 = r3.getFrameNumber()
            r0.append(r1)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
