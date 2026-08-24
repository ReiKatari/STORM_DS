package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m2 {
    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction A() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER
            return r0
    }

    public static /* bridge */ /* synthetic */ void B(android.graphics.Outline r0, android.graphics.Path r1) {
            r0.setPath(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void C(android.util.CloseGuard r0) {
            r0.warnIfOpen()
            return
    }

    public static /* bridge */ /* synthetic */ void D(android.view.WindowInsetsController r0, defpackage.an6 r1) {
            r0.removeOnControllableInsetsChangedListener(r1)
            return
    }

    public static /* bridge */ /* synthetic */ int a() {
            int r0 = android.view.WindowInsets.Type.ime()
            return r0
    }

    public static /* bridge */ /* synthetic */ int b(android.app.ApplicationExitInfo r0) {
            int r0 = r0.getReason()
            return r0
    }

    public static /* bridge */ /* synthetic */ long c(android.app.ApplicationExitInfo r2) {
            long r0 = r2.getTimestamp()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.app.ApplicationExitInfo d(java.lang.Object r0) {
            android.app.ApplicationExitInfo r0 = (android.app.ApplicationExitInfo) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.Context e(android.content.Context r1, int r2) {
            r0 = 0
            android.content.Context r1 = r1.createWindowContext(r2, r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ android.graphics.Bitmap.CompressFormat f() {
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.WEBP_LOSSLESS
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Rect g(android.view.WindowMetrics r0) {
            android.graphics.Rect r0 = r0.getBounds()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.CameraCharacteristics.Key h() {
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.CaptureRequest.Key i() {
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_ZOOM_RATIO
            return r0
    }

    public static /* synthetic */ android.util.CloseGuard j() {
            android.util.CloseGuard r0 = new android.util.CloseGuard
            r0.<init>()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.util.CloseGuard k(java.lang.Object r0) {
            android.util.CloseGuard r0 = (android.util.CloseGuard) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsets l(android.view.WindowMetrics r0) {
            android.view.WindowInsets r0 = r0.getWindowInsets()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsetsController m(android.view.View r0) {
            android.view.WindowInsetsController r0 = r0.getWindowInsetsController()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowMetrics n(android.view.WindowManager r0) {
            android.view.WindowMetrics r0 = r0.getCurrentWindowMetrics()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction o() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String p(android.content.Context r0) {
            java.lang.String r0 = r0.getAttributionTag()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.List q(android.app.ActivityManager r2) {
            r0 = 0
            r1 = 0
            java.util.List r2 = r2.getHistoricalProcessExitReasons(r0, r1, r1)
            return r2
    }

    public static /* bridge */ /* synthetic */ java.util.Set r(android.hardware.camera2.CameraManager r0) {
            java.util.Set r0 = r0.getConcurrentCameraIds()
            return r0
    }

    public static /* bridge */ /* synthetic */ void s(android.graphics.Outline r0, android.graphics.Path r1) {
            r0.setPath(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void t(android.hardware.camera2.CameraDevice r0, int r1) {
            r0.setCameraAudioRestriction(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void u(android.util.CloseGuard r1) {
            java.lang.String r0 = "response.body().close()"
            r1.open(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void v(android.view.WindowInsetsController r0, defpackage.an6 r1) {
            r0.addOnControllableInsetsChangedListener(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean w(android.graphics.Canvas r0, float r1, float r2, float r3, float r4) {
            boolean r0 = r0.quickReject(r1, r2, r3, r4)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean x(android.graphics.Canvas r0, android.graphics.Path r1) {
            boolean r0 = r0.quickReject(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean y(android.graphics.Canvas r0, android.graphics.RectF r1) {
            boolean r0 = r0.quickReject(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean z(android.net.NetworkRequest r0, android.net.NetworkCapabilities r1) {
            boolean r0 = r0.canBeSatisfiedBy(r1)
            return r0
    }
}
