package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kq7  reason: default package */
/* loaded from: classes.dex */
public final class kq7 implements defpackage.bf0 {
    public final defpackage.rd A;
    public final java.lang.Object B;
    public boolean L;

    public kq7(defpackage.rd r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.B = r1
            return
    }

    @Override // defpackage.bf0
    public final boolean A(defpackage.uc6 r3) {
            r2 = this;
            java.lang.Object r0 = r2.B
            monitor-enter(r0)
            boolean r1 = r2.L     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            java.lang.String r2 = "CXCP"
            java.lang.String r1 = "createCaptureSession failed: Virtual device disconnected"
            android.util.Log.w(r2, r1)     // Catch: java.lang.Throwable -> L15
            le0 r2 = r3.e     // Catch: java.lang.Throwable -> L15
            r2.a()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            goto L1d
        L15:
            r2 = move-exception
            goto L1f
        L17:
            rd r2 = r2.A     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.A(r3)     // Catch: java.lang.Throwable -> L15
        L1d:
            monitor-exit(r0)
            return r2
        L1f:
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.bf0
    public final android.hardware.camera2.CaptureRequest.Builder D(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.B
            monitor-enter(r0)
            boolean r1 = r2.L     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            java.lang.String r2 = "CXCP"
            java.lang.String r3 = "createCaptureRequest failed: Virtual device disconnected"
            android.util.Log.w(r2, r3)     // Catch: java.lang.Throwable -> L10
            r2 = 0
            goto L18
        L10:
            r2 = move-exception
            goto L1a
        L12:
            rd r2 = r2.A     // Catch: java.lang.Throwable -> L10
            android.hardware.camera2.CaptureRequest$Builder r2 = r2.D(r3)     // Catch: java.lang.Throwable -> L10
        L18:
            monitor-exit(r0)
            return r2
        L1a:
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.bf0
    public final boolean F(java.util.ArrayList r3, defpackage.le0 r4) {
            r2 = this;
            r4.getClass()
            java.lang.Object r0 = r2.B
            monitor-enter(r0)
            boolean r1 = r2.L     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            java.lang.String r2 = "CXCP"
            java.lang.String r3 = "createConstrainedHighSpeedCaptureSession failed: Virtual device disconnected"
            android.util.Log.w(r2, r3)     // Catch: java.lang.Throwable -> L18
            yk0 r4 = (defpackage.yk0) r4     // Catch: java.lang.Throwable -> L18
            r4.a()     // Catch: java.lang.Throwable -> L18
            r2 = 0
            goto L20
        L18:
            r2 = move-exception
            goto L22
        L1a:
            rd r2 = r2.A     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.F(r3, r4)     // Catch: java.lang.Throwable -> L18
        L20:
            monitor-exit(r0)
            return r2
        L22:
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.bf0
    public final boolean N(java.util.List r3, defpackage.le0 r4) {
            r2 = this;
            r4.getClass()
            java.lang.Object r0 = r2.B
            monitor-enter(r0)
            boolean r1 = r2.L     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            java.lang.String r2 = "CXCP"
            java.lang.String r3 = "createCaptureSession failed: Virtual device disconnected"
            android.util.Log.w(r2, r3)     // Catch: java.lang.Throwable -> L16
            r4.a()     // Catch: java.lang.Throwable -> L16
            r2 = 0
            goto L1e
        L16:
            r2 = move-exception
            goto L20
        L18:
            rd r2 = r2.A     // Catch: java.lang.Throwable -> L16
            boolean r2 = r2.N(r3, r4)     // Catch: java.lang.Throwable -> L16
        L1e:
            monitor-exit(r0)
            return r2
        L20:
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.bf0
    public final boolean U(java.util.ArrayList r3, defpackage.le0 r4) {
            r2 = this;
            r4.getClass()
            java.lang.Object r0 = r2.B
            monitor-enter(r0)
            boolean r1 = r2.L     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            java.lang.String r2 = "CXCP"
            java.lang.String r3 = "createCaptureSessionByOutputConfigurations failed: Virtual device disconnected"
            android.util.Log.w(r2, r3)     // Catch: java.lang.Throwable -> L18
            yk0 r4 = (defpackage.yk0) r4     // Catch: java.lang.Throwable -> L18
            r4.a()     // Catch: java.lang.Throwable -> L18
            r2 = 0
            goto L20
        L18:
            r2 = move-exception
            goto L22
        L1a:
            rd r2 = r2.A     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.U(r3, r4)     // Catch: java.lang.Throwable -> L18
        L20:
            monitor-exit(r0)
            return r2
        L22:
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.bf0
    public final boolean Z(defpackage.j63 r3, java.util.ArrayList r4, defpackage.le0 r5) {
            r2 = this;
            r5.getClass()
            java.lang.Object r0 = r2.B
            monitor-enter(r0)
            boolean r1 = r2.L     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            java.lang.String r2 = "CXCP"
            java.lang.String r3 = "createReprocessableCaptureSessionByConfigurations failed: Virtual device disconnected"
            android.util.Log.w(r2, r3)     // Catch: java.lang.Throwable -> L18
            yk0 r5 = (defpackage.yk0) r5     // Catch: java.lang.Throwable -> L18
            r5.a()     // Catch: java.lang.Throwable -> L18
            r2 = 0
            goto L20
        L18:
            r2 = move-exception
            goto L22
        L1a:
            rd r2 = r2.A     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.Z(r3, r4, r5)     // Catch: java.lang.Throwable -> L18
        L20:
            monitor-exit(r0)
            return r2
        L22:
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.bf0
    public final void a0() {
            r0 = this;
            rd r0 = r0.A
            r0.a0()
            return
    }

    @Override // defpackage.hh7
    public final java.lang.Object e(defpackage.ar0 r1) {
            r0 = this;
            rd r0 = r0.A
            java.lang.Object r0 = r0.e(r1)
            return r0
    }

    @Override // defpackage.bf0
    public final boolean e0(defpackage.k82 r3) {
            r2 = this;
            java.lang.Object r0 = r2.B
            monitor-enter(r0)
            boolean r1 = r2.L     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            java.lang.String r2 = "CXCP"
            java.lang.String r1 = "createExtensionSession failed: Virtual device disconnected"
            android.util.Log.w(r2, r1)     // Catch: java.lang.Throwable -> L15
            l82 r2 = r3.g     // Catch: java.lang.Throwable -> L15
            r2.a()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            goto L1d
        L15:
            r2 = move-exception
            goto L1f
        L17:
            rd r2 = r2.A     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.e0(r3)     // Catch: java.lang.Throwable -> L15
        L1d:
            monitor-exit(r0)
            return r2
        L1f:
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.bf0
    public final java.lang.String h() {
            r0 = this;
            rd r0 = r0.A
            java.lang.String r0 = r0.L
            return r0
    }

    @Override // defpackage.bf0
    public final boolean j0(android.hardware.camera2.params.InputConfiguration r3, java.util.ArrayList r4, defpackage.le0 r5) {
            r2 = this;
            r5.getClass()
            java.lang.Object r0 = r2.B
            monitor-enter(r0)
            boolean r1 = r2.L     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            java.lang.String r2 = "CXCP"
            java.lang.String r3 = "createReprocessableCaptureSession failed: Virtual device disconnected"
            android.util.Log.w(r2, r3)     // Catch: java.lang.Throwable -> L18
            yk0 r5 = (defpackage.yk0) r5     // Catch: java.lang.Throwable -> L18
            r5.a()     // Catch: java.lang.Throwable -> L18
            r2 = 0
            goto L20
        L18:
            r2 = move-exception
            goto L22
        L1a:
            rd r2 = r2.A     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.j0(r3, r4, r5)     // Catch: java.lang.Throwable -> L18
        L20:
            monitor-exit(r0)
            return r2
        L22:
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.bf0
    public final android.hardware.camera2.CaptureRequest.Builder k(android.hardware.camera2.TotalCaptureResult r3) {
            r2 = this;
            java.lang.Object r0 = r2.B
            monitor-enter(r0)
            boolean r1 = r2.L     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            java.lang.String r2 = "CXCP"
            java.lang.String r3 = "createReprocessCaptureRequest failed: Virtual device disconnected"
            android.util.Log.w(r2, r3)     // Catch: java.lang.Throwable -> L10
            r2 = 0
            goto L18
        L10:
            r2 = move-exception
            goto L1a
        L12:
            rd r2 = r2.A     // Catch: java.lang.Throwable -> L10
            android.hardware.camera2.CaptureRequest$Builder r2 = r2.k(r3)     // Catch: java.lang.Throwable -> L10
        L18:
            monitor-exit(r0)
            return r2
        L1a:
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.bf0
    public final void n(int r1) {
            r0 = this;
            rd r0 = r0.A
            r0.n(r1)
            return
    }

    @Override // defpackage.bf0
    public final void u() {
            r0 = this;
            rd r0 = r0.A
            r0.u()
            return
    }
}
