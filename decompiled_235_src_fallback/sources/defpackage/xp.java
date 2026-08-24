package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xp  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class xp {
    public static /* bridge */ /* synthetic */ android.hardware.camera2.CameraCharacteristics.Key a() {
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.CameraDevice.CameraDeviceSetup b(android.hardware.camera2.CameraManager r0, java.lang.String r1) {
            android.hardware.camera2.CameraDevice$CameraDeviceSetup r0 = r0.getCameraDeviceSetup(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.CaptureRequest.Builder c(android.hardware.camera2.CameraDevice.CameraDeviceSetup r0, int r1) {
            android.hardware.camera2.CaptureRequest$Builder r0 = r0.createCaptureRequest(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.CaptureRequest.Key d() {
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.FLASH_STRENGTH_LEVEL
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.CaptureResult.Key e() {
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE
            return r0
    }

    public static /* synthetic */ android.hardware.camera2.params.OutputConfiguration f(int r1, android.util.Size r2) {
            android.hardware.camera2.params.OutputConfiguration r0 = new android.hardware.camera2.params.OutputConfiguration
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ android.hardware.camera2.params.SessionConfiguration g(int r1, java.util.List r2) {
            android.hardware.camera2.params.SessionConfiguration r0 = new android.hardware.camera2.params.SessionConfiguration
            r0.<init>(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.List h(android.hardware.camera2.CameraCharacteristics r0) {
            java.util.List r0 = r0.getAvailableSessionCharacteristicsKeys()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.List i(android.view.WindowInsets r0, int r1) {
            java.util.List r0 = r0.getBoundingRects(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ void j(android.app.PictureInPictureUiState r0) {
            r0.isTransitioningToPip()
            return
    }

    public static /* bridge */ /* synthetic */ void k(android.app.job.JobInfo.Builder r0, java.lang.String r1) {
            r0.setTraceTag(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void l(android.text.StaticLayout.Builder r1) {
            r0 = 0
            r1.setUseBoundsForWidth(r0)
            return
    }

    public static /* bridge */ /* synthetic */ boolean m(android.hardware.camera2.CameraDevice.CameraDeviceSetup r0, android.hardware.camera2.params.SessionConfiguration r1) {
            boolean r0 = r0.isSessionConfigurationSupported(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean n(android.hardware.camera2.CameraManager r0, java.lang.String r1) {
            boolean r0 = r0.isCameraDeviceSetupSupported(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.CameraCharacteristics.Key o() {
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.List p(android.view.WindowInsets r0, int r1) {
            java.util.List r0 = r0.getBoundingRectsIgnoringVisibility(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.CameraCharacteristics.Key q() {
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.INFO_SESSION_CONFIGURATION_QUERY_VERSION
            return r0
    }
}
