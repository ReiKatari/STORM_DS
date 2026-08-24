package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: td  reason: default package */
/* loaded from: classes.dex */
public final class td implements defpackage.me0, defpackage.hh7, java.lang.AutoCloseable {
    public final defpackage.bf0 A;
    public final android.hardware.camera2.CameraExtensionSession B;
    public final defpackage.id0 L;
    public final java.util.concurrent.Executor R;
    public final defpackage.ww X;
    public final java.util.HashMap Y;

    public td(defpackage.rd r1, android.hardware.camera2.CameraExtensionSession r2, defpackage.id0 r3, defpackage.pi r4) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            uw r1 = defpackage.ig0.a
            r1.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.uw.b
            r2.incrementAndGet(r1)
            ww r1 = new ww
            r1.<init>()
            r2 = 0
            r1.a = r2
            r0.X = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.Y = r1
            return
    }

    @Override // defpackage.me0
    public final boolean E() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.me0
    public final defpackage.bf0 L() {
            r0 = this;
            bf0 r0 = r0.A
            return r0
    }

    @Override // defpackage.me0
    public final java.lang.Integer Q(java.util.ArrayList r4, defpackage.vc0 r5) {
            r3 = this;
            r4.getClass()
            int r0 = r4.size()
            r1 = 0
        L8:
            if (r1 >= r0) goto L16
            java.lang.Object r2 = r4.get(r1)
            int r1 = r1 + 1
            android.hardware.camera2.CaptureRequest r2 = (android.hardware.camera2.CaptureRequest) r2
            r3.d0(r2, r5)
            goto L8
        L16:
            r3 = 0
            return r3
    }

    @Override // defpackage.me0
    public final boolean V(java.util.List r1) {
            r0 = this;
            java.lang.String r0 = "CXCP"
            java.lang.String r1 = "CameraExtensionSession does not support finalizeOutputConfigurations()"
            android.util.Log.w(r0, r1)
            r0 = 0
            return r0
    }

    @Override // defpackage.me0
    public final boolean W() {
            r9 = this;
            bf0 r0 = r9.A
            java.lang.String r0 = r0.h()
            r1 = 0
            r2 = 1
            android.hardware.camera2.CameraExtensionSession r3 = r9.B     // Catch: java.lang.Exception -> L11
            defpackage.ma.v(r3)     // Catch: java.lang.Exception -> L11
            jg7 r9 = defpackage.jg7.a     // Catch: java.lang.Exception -> L11
            goto L9b
        L11:
            r3 = move-exception
            boolean r4 = r3 instanceof android.hardware.camera2.CameraAccessException
            r5 = 0
            java.lang.String r6 = "CXCP"
            id0 r9 = r9.L
            if (r4 == 0) goto L64
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to execute call: Camera encountered an error: "
            r4.<init>(r7)
            java.lang.String r7 = r3.getMessage()
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r6, r4)
            android.hardware.camera2.CameraAccessException r3 = (android.hardware.camera2.CameraAccessException) r3
            int r4 = r3.getReason()
            r7 = 3
            if (r4 == r2) goto L5f
            r8 = 2
            if (r4 == r8) goto L5e
            if (r4 == r7) goto L5c
            r7 = 4
            if (r4 == r7) goto L5a
            r7 = 5
            if (r4 == r7) goto L58
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "Unexpected CameraAccessException: "
            r4.<init>(r7)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r6, r3)
            r7 = 11
            goto L5f
        L58:
            r7 = r8
            goto L5f
        L5a:
            r7 = r2
            goto L5f
        L5c:
            r7 = r1
            goto L5f
        L5e:
            r7 = 6
        L5f:
            r9.a(r0, r7, r2)
        L62:
            r9 = r5
            goto L9b
        L64:
            boolean r4 = r3 instanceof java.lang.IllegalArgumentException
            if (r4 != 0) goto L80
            boolean r4 = r3 instanceof java.lang.SecurityException
            if (r4 != 0) goto L80
            boolean r4 = r3 instanceof java.lang.UnsupportedOperationException
            if (r4 != 0) goto L80
            boolean r4 = r3 instanceof java.lang.NullPointerException
            if (r4 == 0) goto L75
            goto L80
        L75:
            boolean r9 = r3 instanceof java.lang.IllegalStateException
            if (r9 == 0) goto L7f
            java.lang.String r9 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r6, r9)
            goto L62
        L7f:
            throw r3
        L80:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to execute call: Unexpected exception: "
            r4.<init>(r7)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r6, r3)
            r3 = 9
            r9.a(r0, r3, r1)
            goto L62
        L9b:
            if (r9 == 0) goto L9e
            r1 = r2
        L9e:
            return r1
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            android.hardware.camera2.CameraExtensionSession r0 = r0.B
            defpackage.ma.D(r0)
            return
    }

    @Override // defpackage.me0
    public final java.lang.Integer d0(android.hardware.camera2.CaptureRequest r7, defpackage.vc0 r8) {
            r6 = this;
            r7.getClass()
            bf0 r0 = r6.A
            java.lang.String r0 = r0.h()
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1d
            android.hardware.camera2.CameraExtensionSession r2 = r6.B
            java.util.concurrent.Executor r3 = r6.R
            r4 = 33
            if (r1 < r4) goto L1f
            sd r1 = new sd     // Catch: java.lang.Exception -> L1d
            r1.<init>(r6, r8)     // Catch: java.lang.Exception -> L1d
            int r7 = defpackage.ma.z(r2, r7, r3, r1)     // Catch: java.lang.Exception -> L1d
            goto L2d
        L1d:
            r7 = move-exception
            goto L32
        L1f:
            sd r1 = new sd     // Catch: java.lang.Exception -> L1d
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L1d
            r4.<init>()     // Catch: java.lang.Exception -> L1d
            r1.<init>(r6, r8, r4)     // Catch: java.lang.Exception -> L1d
            int r7 = defpackage.ma.z(r2, r7, r3, r1)     // Catch: java.lang.Exception -> L1d
        L2d:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L1d
            return r6
        L32:
            boolean r8 = r7 instanceof android.hardware.camera2.CameraAccessException
            r1 = 0
            java.lang.String r2 = "CXCP"
            id0 r6 = r6.L
            if (r8 == 0) goto L84
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to execute call: Camera encountered an error: "
            r8.<init>(r3)
            java.lang.String r3 = r7.getMessage()
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r2, r8)
            android.hardware.camera2.CameraAccessException r7 = (android.hardware.camera2.CameraAccessException) r7
            int r8 = r7.getReason()
            r3 = 1
            r4 = 3
            if (r8 == r3) goto L7f
            r5 = 2
            if (r8 == r5) goto L7d
            if (r8 == r4) goto L80
            r1 = 4
            if (r8 == r1) goto L7b
            r1 = 5
            if (r8 == r1) goto L79
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected CameraAccessException: "
            r8.<init>(r1)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.w(r2, r7)
            r1 = 11
            goto L80
        L79:
            r1 = r5
            goto L80
        L7b:
            r1 = r3
            goto L80
        L7d:
            r1 = 6
            goto L80
        L7f:
            r1 = r4
        L80:
            r6.a(r0, r1, r3)
            goto Lba
        L84:
            boolean r8 = r7 instanceof java.lang.IllegalArgumentException
            if (r8 != 0) goto La0
            boolean r8 = r7 instanceof java.lang.SecurityException
            if (r8 != 0) goto La0
            boolean r8 = r7 instanceof java.lang.UnsupportedOperationException
            if (r8 != 0) goto La0
            boolean r8 = r7 instanceof java.lang.NullPointerException
            if (r8 == 0) goto L95
            goto La0
        L95:
            boolean r6 = r7 instanceof java.lang.IllegalStateException
            if (r6 == 0) goto L9f
            java.lang.String r6 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r2, r6)
            goto Lba
        L9f:
            throw r7
        La0:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to execute call: Unexpected exception: "
            r8.<init>(r3)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.w(r2, r7)
            r7 = 9
            r6.a(r0, r7, r1)
        Lba:
            r6 = 0
            return r6
    }

    @Override // defpackage.hh7
    public final java.lang.Object e(defpackage.ar0 r2) {
            r1 = this;
            java.lang.Class r0 = defpackage.ma.B()
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L11
            android.hardware.camera2.CameraExtensionSession r1 = r1.B
            return r1
        L11:
            r1 = 0
            return r1
    }

    @Override // defpackage.me0
    public final android.view.Surface getInputSurface() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.me0
    public final java.lang.Integer i(android.hardware.camera2.CaptureRequest r7, defpackage.vc0 r8) {
            r6 = this;
            r7.getClass()
            bf0 r0 = r6.A
            java.lang.String r0 = r0.h()
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1d
            android.hardware.camera2.CameraExtensionSession r2 = r6.B
            java.util.concurrent.Executor r3 = r6.R
            r4 = 33
            if (r1 < r4) goto L1f
            sd r1 = new sd     // Catch: java.lang.Exception -> L1d
            r1.<init>(r6, r8)     // Catch: java.lang.Exception -> L1d
            int r7 = defpackage.ma.a(r2, r7, r3, r1)     // Catch: java.lang.Exception -> L1d
            goto L2d
        L1d:
            r7 = move-exception
            goto L32
        L1f:
            sd r1 = new sd     // Catch: java.lang.Exception -> L1d
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L1d
            r4.<init>()     // Catch: java.lang.Exception -> L1d
            r1.<init>(r6, r8, r4)     // Catch: java.lang.Exception -> L1d
            int r7 = defpackage.ma.a(r2, r7, r3, r1)     // Catch: java.lang.Exception -> L1d
        L2d:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L1d
            return r6
        L32:
            boolean r8 = r7 instanceof android.hardware.camera2.CameraAccessException
            r1 = 0
            java.lang.String r2 = "CXCP"
            id0 r6 = r6.L
            if (r8 == 0) goto L84
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to execute call: Camera encountered an error: "
            r8.<init>(r3)
            java.lang.String r3 = r7.getMessage()
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r2, r8)
            android.hardware.camera2.CameraAccessException r7 = (android.hardware.camera2.CameraAccessException) r7
            int r8 = r7.getReason()
            r3 = 1
            r4 = 3
            if (r8 == r3) goto L7f
            r5 = 2
            if (r8 == r5) goto L7d
            if (r8 == r4) goto L80
            r1 = 4
            if (r8 == r1) goto L7b
            r1 = 5
            if (r8 == r1) goto L79
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected CameraAccessException: "
            r8.<init>(r1)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.w(r2, r7)
            r1 = 11
            goto L80
        L79:
            r1 = r5
            goto L80
        L7b:
            r1 = r3
            goto L80
        L7d:
            r1 = 6
            goto L80
        L7f:
            r1 = r4
        L80:
            r6.a(r0, r1, r3)
            goto Lba
        L84:
            boolean r8 = r7 instanceof java.lang.IllegalArgumentException
            if (r8 != 0) goto La0
            boolean r8 = r7 instanceof java.lang.SecurityException
            if (r8 != 0) goto La0
            boolean r8 = r7 instanceof java.lang.UnsupportedOperationException
            if (r8 != 0) goto La0
            boolean r8 = r7 instanceof java.lang.NullPointerException
            if (r8 == 0) goto L95
            goto La0
        L95:
            boolean r6 = r7 instanceof java.lang.IllegalStateException
            if (r6 == 0) goto L9f
            java.lang.String r6 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r2, r6)
            goto Lba
        L9f:
            throw r7
        La0:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to execute call: Unexpected exception: "
            r8.<init>(r3)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.w(r2, r7)
            r7 = 9
            r6.a(r0, r7, r1)
        Lba:
            r6 = 0
            return r6
    }

    @Override // defpackage.me0
    public final java.lang.Integer o(java.util.ArrayList r3, defpackage.vc0 r4) {
            r2 = this;
            r3.getClass()
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto L15
            java.lang.Object r3 = defpackage.gt0.b1(r3)
            android.hardware.camera2.CaptureRequest r3 = (android.hardware.camera2.CaptureRequest) r3
            java.lang.Integer r2 = r2.i(r3, r4)
            return r2
        L15:
            java.lang.String r2 = "CameraExtensionSession does not support setRepeatingBurst for more than oneCaptureRequest"
            defpackage.i.m(r2)
            r2 = 0
            return r2
    }
}
