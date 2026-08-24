package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gi  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class gi {
    public static /* bridge */ /* synthetic */ java.lang.Class A() {
            java.lang.Class<android.view.inputmethod.DeleteGesture> r0 = android.view.inputmethod.DeleteGesture.class
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class B() {
            java.lang.Class<android.view.inputmethod.JoinOrSplitGesture> r0 = android.view.inputmethod.JoinOrSplitGesture.class
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class C() {
            java.lang.Class<android.view.inputmethod.InsertGesture> r0 = android.view.inputmethod.InsertGesture.class
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class D() {
            java.lang.Class<android.view.inputmethod.RemoveSpaceGesture> r0 = android.view.inputmethod.RemoveSpaceGesture.class
            return r0
    }

    public static /* bridge */ /* synthetic */ float a(android.window.BackEvent r0) {
            float r0 = r0.getTouchX()
            return r0
    }

    public static /* bridge */ /* synthetic */ int b(android.content.Context r0) {
            int r0 = r0.getDeviceId()
            return r0
    }

    public static /* bridge */ /* synthetic */ int c(android.view.ViewConfiguration r0) {
            int r0 = r0.getScaledHandwritingSlop()
            return r0
    }

    public static /* bridge */ /* synthetic */ int d(android.window.BackEvent r0) {
            int r0 = r0.getSwipeEdge()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.ColorSpace.Named e() {
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.BT2020_HLG
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.CameraCharacteristics.Key f() {
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.CaptureRequest.Key g() {
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_SETTINGS_OVERRIDE
            return r0
    }

    public static /* synthetic */ android.text.GraphemeClusterSegmentFinder h(java.lang.CharSequence r1, android.text.TextPaint r2) {
            android.text.GraphemeClusterSegmentFinder r0 = new android.text.GraphemeClusterSegmentFinder
            r0.<init>(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.text.SegmentFinder i(java.lang.Object r0) {
            android.text.SegmentFinder r0 = (android.text.SegmentFinder) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class j() {
            java.lang.Class<android.view.inputmethod.SelectGesture> r0 = android.view.inputmethod.SelectGesture.class
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object k(defpackage.cr0 r0, java.lang.Class r1) {
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    public static /* synthetic */ void l() {
            android.text.GraphemeClusterSegmentFinder r0 = new android.text.GraphemeClusterSegmentFinder
            return
    }

    public static /* bridge */ /* synthetic */ void m(android.hardware.camera2.CameraCaptureSession.CaptureCallback r0, android.hardware.camera2.CameraCaptureSession r1, android.hardware.camera2.CaptureRequest r2, long r3, long r5) {
            r0.onReadoutStarted(r1, r2, r3, r5)
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.hardware.camera2.params.ExtensionSessionConfiguration r0, android.hardware.camera2.params.OutputConfiguration r1) {
            r0.setPostviewOutputConfiguration(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void o(android.view.inputmethod.CursorAnchorInfo.Builder r0, float r1, float r2, float r3, float r4) {
            r0.addVisibleLineBounds(r1, r2, r3, r4)
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.view.inputmethod.EditorInfo r0, java.util.List r1) {
            r0.setSupportedHandwritingGestures(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void q(android.view.inputmethod.EditorInfo r0, java.util.Set r1) {
            r0.setSupportedHandwritingGesturePreviews(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean r(android.hardware.camera2.CameraExtensionCharacteristics r0, int r1) {
            boolean r0 = r0.isPostviewAvailable(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ int[] s(android.text.Layout r0, android.graphics.RectF r1, android.text.SegmentFinder r2, defpackage.hi r3) {
            int[] r0 = r0.getRangeForRect(r1, r2, r3)
            return r0
    }

    public static /* bridge */ /* synthetic */ float t(android.window.BackEvent r0) {
            float r0 = r0.getTouchY()
            return r0
    }

    public static /* bridge */ /* synthetic */ int u(android.view.ViewConfiguration r0) {
            int r0 = r0.getScaledHandwritingGestureLineMargin()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.ColorSpace.Named v() {
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.BT2020_PQ
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class w() {
            java.lang.Class<android.view.inputmethod.SelectRangeGesture> r0 = android.view.inputmethod.SelectRangeGesture.class
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean x(android.hardware.camera2.CameraExtensionCharacteristics r0, int r1) {
            boolean r0 = r0.isCaptureProcessProgressAvailable(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ float y(android.window.BackEvent r0) {
            float r0 = r0.getProgress()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class z() {
            java.lang.Class<android.view.inputmethod.DeleteRangeGesture> r0 = android.view.inputmethod.DeleteRangeGesture.class
            return r0
    }
}
