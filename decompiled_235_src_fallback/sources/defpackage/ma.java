package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ma  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ma {
    public static /* bridge */ /* synthetic */ android.view.RoundedCorner A(android.view.WindowInsets r1) {
            r0 = 1
            android.view.RoundedCorner r1 = r1.getRoundedCorner(r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ java.lang.Class B() {
            java.lang.Class<android.hardware.camera2.CameraExtensionSession> r0 = android.hardware.camera2.CameraExtensionSession.class
            return r0
    }

    public static /* synthetic */ void C() {
            android.hardware.camera2.params.MultiResolutionStreamInfo r0 = new android.hardware.camera2.params.MultiResolutionStreamInfo
            return
    }

    public static /* bridge */ /* synthetic */ void D(android.hardware.camera2.CameraExtensionSession r0) {
            r0.close()
            return
    }

    public static /* bridge */ /* synthetic */ int a(android.hardware.camera2.CameraExtensionSession r0, android.hardware.camera2.CaptureRequest r1, java.util.concurrent.Executor r2, android.hardware.camera2.CameraExtensionSession$ExtensionCaptureCallback r3) {
            int r0 = r0.setRepeatingRequest(r1, r2, r3)
            return r0
    }

    public static /* bridge */ /* synthetic */ int b(android.view.RoundedCorner r0) {
            int r0 = r0.getRadius()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.BitmapRegionDecoder c(java.io.InputStream r0) {
            android.graphics.BitmapRegionDecoder r0 = android.graphics.BitmapRegionDecoder.newInstance(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.CameraExtensionCharacteristics d(android.hardware.camera2.CameraManager r0, java.lang.String r1) {
            android.hardware.camera2.CameraExtensionCharacteristics r0 = r0.getCameraExtensionCharacteristics(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.CameraExtensionCharacteristics e(java.lang.Object r0) {
            android.hardware.camera2.CameraExtensionCharacteristics r0 = (android.hardware.camera2.CameraExtensionCharacteristics) r0
            return r0
    }

    public static /* synthetic */ android.hardware.camera2.params.ExtensionSessionConfiguration f(int r1, java.util.ArrayList r2, defpackage.pi r3, android.hardware.camera2.CameraExtensionSession$StateCallback r4) {
            android.hardware.camera2.params.ExtensionSessionConfiguration r0 = new android.hardware.camera2.params.ExtensionSessionConfiguration
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ android.hardware.camera2.params.InputConfiguration g(int r1, java.util.ArrayList r2) {
            android.hardware.camera2.params.InputConfiguration r0 = new android.hardware.camera2.params.InputConfiguration
            r0.<init>(r2, r1)
            return r0
    }

    public static /* synthetic */ android.hardware.camera2.params.MultiResolutionStreamInfo h(int r1, int r2, java.lang.String r3) {
            android.hardware.camera2.params.MultiResolutionStreamInfo r0 = new android.hardware.camera2.params.MultiResolutionStreamInfo
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.RoundedCorner i(android.view.WindowInsets r1) {
            r0 = 0
            android.view.RoundedCorner r1 = r1.getRoundedCorner(r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ android.view.translation.TranslationRequestValue j(defpackage.fp r0) {
            android.view.translation.TranslationRequestValue r0 = android.view.translation.TranslationRequestValue.forText(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.translation.TranslationResponseValue k(android.view.translation.ViewTranslationResponse r1) {
            java.lang.String r0 = "android:text"
            android.view.translation.TranslationResponseValue r1 = r1.getValue(r0)
            return r1
    }

    public static /* synthetic */ android.view.translation.ViewTranslationRequest.Builder l(android.view.autofill.AutofillId r1, long r2) {
            android.view.translation.ViewTranslationRequest$Builder r0 = new android.view.translation.ViewTranslationRequest$Builder
            r0.<init>(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.translation.ViewTranslationRequest m(android.view.translation.ViewTranslationRequest.Builder r0) {
            android.view.translation.ViewTranslationRequest r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.translation.ViewTranslationResponse n(java.lang.Object r0) {
            android.view.translation.ViewTranslationResponse r0 = (android.view.translation.ViewTranslationResponse) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.CharSequence o(android.view.translation.TranslationResponseValue r0) {
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class p() {
            java.lang.Class<android.hardware.camera2.CameraExtensionCharacteristics> r0 = android.hardware.camera2.CameraExtensionCharacteristics.class
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String q() {
            java.lang.String r0 = android.os.Build.SOC_MODEL
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.List r(android.hardware.camera2.CameraExtensionCharacteristics r0) {
            java.util.List r0 = r0.getSupportedExtensions()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Map s(android.hardware.camera2.TotalCaptureResult r0) {
            java.util.Map r0 = r0.getPhysicalCameraTotalResults()
            return r0
    }

    public static /* synthetic */ void t() {
            android.view.translation.ViewTranslationRequest$Builder r0 = new android.view.translation.ViewTranslationRequest$Builder
            return
    }

    public static /* bridge */ /* synthetic */ void u(android.hardware.camera2.CameraDevice r0, android.hardware.camera2.params.ExtensionSessionConfiguration r1) {
            r0.createExtensionSession(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void v(android.hardware.camera2.CameraExtensionSession r0) {
            r0.stopRepeating()
            return
    }

    public static /* bridge */ /* synthetic */ void w(android.view.View r0) {
            r0.clearViewTranslationCallback()
            return
    }

    public static /* bridge */ /* synthetic */ void x(android.view.View r0, android.view.translation.ViewTranslationCallback r1) {
            r0.setViewTranslationCallback(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void y(android.view.translation.ViewTranslationRequest.Builder r1, android.view.translation.TranslationRequestValue r2) {
            java.lang.String r0 = "android:text"
            r1.setValue(r0, r2)
            return
    }

    public static /* bridge */ /* synthetic */ int z(android.hardware.camera2.CameraExtensionSession r0, android.hardware.camera2.CaptureRequest r1, java.util.concurrent.Executor r2, android.hardware.camera2.CameraExtensionSession$ExtensionCaptureCallback r3) {
            int r0 = r0.capture(r1, r2, r3)
            return r0
    }
}
