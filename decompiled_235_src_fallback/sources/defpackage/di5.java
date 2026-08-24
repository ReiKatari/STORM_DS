package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: di5  reason: default package */
/* loaded from: classes.dex */
public final class di5 extends android.hardware.camera2.CameraCaptureSession {
    public static java.lang.String e(java.lang.String r2) {
            java.lang.String r0 = "Current capture session is running on extensions mode which isn't allowed to invoke the "
            java.lang.String r1 = " function!"
            java.lang.String r2 = defpackage.lb1.A(r0, r2, r1)
            return r2
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void abortCaptures() {
            r1 = this;
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "abortCaptures"
            java.lang.String r0 = e(r0)
            r1.<init>(r0)
            throw r1
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int capture(android.hardware.camera2.CaptureRequest r1, android.hardware.camera2.CameraCaptureSession.CaptureCallback r2, android.os.Handler r3) {
            r0 = this;
            r1.getClass()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "capture"
            java.lang.String r1 = e(r1)
            r0.<init>(r1)
            throw r0
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int captureBurst(java.util.List r1, android.hardware.camera2.CameraCaptureSession.CaptureCallback r2, android.os.Handler r3) {
            r0 = this;
            r1.getClass()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "captureBurst"
            java.lang.String r1 = e(r1)
            r0.<init>(r1)
            throw r0
    }

    @Override // android.hardware.camera2.CameraCaptureSession, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "close"
            java.lang.String r0 = e(r0)
            r1.<init>(r0)
            throw r1
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void finalizeOutputConfigurations(java.util.List r1) {
            r0 = this;
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "finalizeOutputConfigurations"
            java.lang.String r1 = e(r1)
            r0.<init>(r1)
            throw r0
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final android.hardware.camera2.CameraDevice getDevice() {
            r1 = this;
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "getDevice"
            java.lang.String r0 = e(r0)
            r1.<init>(r0)
            throw r1
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final android.view.Surface getInputSurface() {
            r1 = this;
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "getInputSurface"
            java.lang.String r0 = e(r0)
            r1.<init>(r0)
            throw r1
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final boolean isReprocessable() {
            r1 = this;
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "isReprocessable"
            java.lang.String r0 = e(r0)
            r1.<init>(r0)
            throw r1
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void prepare(android.view.Surface r1) {
            r0 = this;
            r1.getClass()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "prepare"
            java.lang.String r1 = e(r1)
            r0.<init>(r1)
            throw r0
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int setRepeatingBurst(java.util.List r1, android.hardware.camera2.CameraCaptureSession.CaptureCallback r2, android.os.Handler r3) {
            r0 = this;
            r1.getClass()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "setRepeatingBurst"
            java.lang.String r1 = e(r1)
            r0.<init>(r1)
            throw r0
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int setRepeatingRequest(android.hardware.camera2.CaptureRequest r1, android.hardware.camera2.CameraCaptureSession.CaptureCallback r2, android.os.Handler r3) {
            r0 = this;
            r1.getClass()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "setRepeatingRequest"
            java.lang.String r1 = e(r1)
            r0.<init>(r1)
            throw r0
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void stopRepeating() {
            r1 = this;
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "stopRepeating"
            java.lang.String r0 = e(r0)
            r1.<init>(r0)
            throw r1
    }
}
