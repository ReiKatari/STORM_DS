package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class j2 {
    public static /* bridge */ /* synthetic */ void A(android.view.accessibility.AccessibilityNodeInfo r0, boolean r1) {
            r0.setHeading(r1)
            return
    }

    public static /* bridge */ /* synthetic */ int B(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetBottom()
            return r0
    }

    public static /* bridge */ /* synthetic */ int C(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetRight()
            return r0
    }

    public static /* bridge */ /* synthetic */ int D(android.view.DisplayCutout r0) {
            int r0 = r0.hashCode()
            return r0
    }

    public static /* bridge */ /* synthetic */ int a(android.hardware.camera2.params.OutputConfiguration r0) {
            int r0 = r0.getMaxSharedSurfaceCount()
            return r0
    }

    public static /* bridge */ /* synthetic */ int b(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetTop()
            return r0
    }

    public static /* synthetic */ android.hardware.camera2.params.SessionConfiguration c(int r1, java.util.ArrayList r2, java.util.concurrent.Executor r3, defpackage.zd r4) {
            android.hardware.camera2.params.SessionConfiguration r0 = new android.hardware.camera2.params.SessionConfiguration
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.params.SessionConfiguration d(java.lang.Object r0) {
            android.hardware.camera2.params.SessionConfiguration r0 = (android.hardware.camera2.params.SessionConfiguration) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.Handler e(android.os.Looper r0) {
            android.os.Handler r0 = android.os.Handler.createAsync(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.DisplayCutout f(java.lang.Object r0) {
            android.view.DisplayCutout r0 = (android.view.DisplayCutout) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction g() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.CharSequence h(android.view.accessibility.AccessibilityNodeInfo r0) {
            java.lang.CharSequence r0 = r0.getTooltipText()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.List i(android.hardware.camera2.CameraCharacteristics r0) {
            java.util.List r0 = r0.getAvailablePhysicalCameraRequestKeys()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Map j(android.hardware.camera2.TotalCaptureResult r0) {
            java.util.Map r0 = r0.getPhysicalCameraResults()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Set k(android.hardware.camera2.CameraCharacteristics r0) {
            java.util.Set r0 = r0.getPhysicalCameraIds()
            return r0
    }

    public static /* bridge */ /* synthetic */ void l(android.content.ClipboardManager r0) {
            r0.clearPrimaryClip()
            return
    }

    public static /* bridge */ /* synthetic */ void m(android.hardware.camera2.CameraDevice r0, android.hardware.camera2.params.SessionConfiguration r1) {
            r0.createCaptureSession(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.hardware.camera2.CameraManager r0, java.lang.String r1, java.util.concurrent.Executor r2, android.hardware.camera2.CameraDevice.StateCallback r3) {
            r0.openCamera(r1, r2, r3)
            return
    }

    public static /* bridge */ /* synthetic */ void o(android.hardware.camera2.CameraManager r0, java.util.concurrent.Executor r1, android.hardware.camera2.CameraManager.AvailabilityCallback r2) {
            r0.registerAvailabilityCallback(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.hardware.camera2.params.OutputConfiguration r0, java.lang.String r1) {
            r0.setPhysicalCameraId(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void q(android.hardware.camera2.params.SessionConfiguration r0, android.hardware.camera2.CaptureRequest r1) {
            r0.setSessionParameters(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void r(android.hardware.camera2.params.SessionConfiguration r0, android.hardware.camera2.params.InputConfiguration r1) {
            r0.setInputConfiguration(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void s(android.view.ViewStructure r0, int r1) {
            r0.setMaxTextLength(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void t(android.view.WindowManager.LayoutParams r1) {
            r0 = 1
            r1.layoutInDisplayCutoutMode = r0
            return
    }

    public static /* bridge */ /* synthetic */ void u(android.view.accessibility.AccessibilityNodeInfo r0, java.lang.CharSequence r1) {
            r0.setPaneTitle(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void v(android.view.accessibility.AccessibilityNodeInfo r0, boolean r1) {
            r0.setScreenReaderFocusable(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean w(java.lang.Object r0) {
            boolean r0 = r0 instanceof android.view.DisplayCutout
            return r0
    }

    public static /* bridge */ /* synthetic */ int x(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetLeft()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction y() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.List z(android.hardware.camera2.CameraCharacteristics r0) {
            java.util.List r0 = r0.getAvailableSessionKeys()
            return r0
    }
}
