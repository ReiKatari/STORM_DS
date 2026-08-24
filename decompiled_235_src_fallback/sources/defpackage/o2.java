package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o2 {
    public static /* bridge */ /* synthetic */ java.util.Set A(android.hardware.camera2.CameraExtensionCharacteristics r0, int r1) {
            java.util.Set r0 = r0.getAvailableCaptureRequestKeys(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ void B(android.hardware.camera2.params.OutputConfiguration r0, long r1) {
            r0.setStreamUseCase(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void C(android.view.Choreographer r0, android.view.Choreographer$VsyncCallback r1) {
            r0.removeVsyncCallback(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean D(defpackage.no r0) {
            boolean r0 = android.animation.ValueAnimator.registerDurationScaleChangeListener(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ float a() {
            float r0 = android.animation.ValueAnimator.getDurationScale()
            return r0
    }

    public static /* bridge */ /* synthetic */ long b(android.view.Choreographer.FrameData r2) {
            long r0 = r2.getFrameTimeNanos()
            return r0
    }

    public static /* bridge */ /* synthetic */ long c(android.view.Choreographer.FrameTimeline r2) {
            long r0 = r2.getDeadlineNanos()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.CameraCharacteristics.Key d() {
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES
            return r0
    }

    public static /* bridge */ /* synthetic */ android.text.BoringLayout.Metrics e(java.lang.CharSequence r2, android.text.TextPaint r3, android.text.TextDirectionHeuristic r4) {
            r0 = 1
            r1 = 0
            android.text.BoringLayout$Metrics r2 = android.text.BoringLayout.isBoring(r2, r3, r4, r0, r1)
            return r2
    }

    public static /* synthetic */ android.text.BoringLayout f(java.lang.CharSequence r12, android.text.TextPaint r13, int r14, android.text.Layout.Alignment r15, android.text.BoringLayout.Metrics r16, boolean r17, android.text.TextUtils.TruncateAt r18, int r19) {
            android.text.BoringLayout r0 = new android.text.BoringLayout
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r11 = 1
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.Choreographer.FrameTimeline g(android.view.Choreographer.FrameData r0) {
            android.view.Choreographer$FrameTimeline r0 = r0.getPreferredFrameTimeline()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction h() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.CursorAnchorInfo.Builder i(android.view.inputmethod.CursorAnchorInfo.Builder r0, android.view.inputmethod.EditorBoundsInfo r1) {
            android.view.inputmethod.CursorAnchorInfo$Builder r0 = r0.setEditorBoundsInfo(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.EditorBoundsInfo.Builder j(android.view.inputmethod.EditorBoundsInfo.Builder r0, android.graphics.RectF r1) {
            android.view.inputmethod.EditorBoundsInfo$Builder r0 = r0.setEditorBounds(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.EditorBoundsInfo k(android.view.inputmethod.EditorBoundsInfo.Builder r0) {
            android.view.inputmethod.EditorBoundsInfo r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.window.OnBackInvokedCallback l(java.lang.Object r0) {
            android.window.OnBackInvokedCallback r0 = (android.window.OnBackInvokedCallback) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.window.OnBackInvokedDispatcher m(defpackage.mv0 r0) {
            android.window.OnBackInvokedDispatcher r0 = r0.getOnBackInvokedDispatcher()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.window.OnBackInvokedDispatcher n(defpackage.qv0 r0) {
            android.window.OnBackInvokedDispatcher r0 = r0.getOnBackInvokedDispatcher()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.window.OnBackInvokedDispatcher o(android.app.Activity r0) {
            android.window.OnBackInvokedDispatcher r0 = r0.getOnBackInvokedDispatcher()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.window.OnBackInvokedDispatcher p(java.lang.Object r0) {
            android.window.OnBackInvokedDispatcher r0 = (android.window.OnBackInvokedDispatcher) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Set q(android.hardware.camera2.CameraExtensionCharacteristics r0, int r1) {
            java.util.Set r0 = r0.getAvailableCaptureResultKeys(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ void r(android.hardware.camera2.params.OutputConfiguration r0, int r1) {
            r0.setMirrorMode(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void s(android.hardware.camera2.params.OutputConfiguration r0, long r1) {
            r0.setDynamicRangeProfile(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void t(android.view.Choreographer r0, android.view.Choreographer$VsyncCallback r1) {
            r0.postVsyncCallback(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void u(android.view.inputmethod.InputMethodManager r0, android.view.View r1) {
            r0.startStylusHandwriting(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void v(android.window.OnBackInvokedDispatcher r1, defpackage.vp r2) {
            r0 = 1000000(0xf4240, float:1.401298E-39)
            r1.registerOnBackInvokedCallback(r0, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void w(android.window.OnBackInvokedDispatcher r0, android.window.OnBackInvokedCallback r1) {
            r0.unregisterOnBackInvokedCallback(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean x(defpackage.no r0) {
            boolean r0 = android.animation.ValueAnimator.unregisterDurationScaleChangeListener(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean y(android.text.BoringLayout r0) {
            boolean r0 = r0.isFallbackLineSpacingEnabled()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.EditorBoundsInfo.Builder z(android.view.inputmethod.EditorBoundsInfo.Builder r0, android.graphics.RectF r1) {
            android.view.inputmethod.EditorBoundsInfo$Builder r0 = r0.setHandwritingBounds(r1)
            return r0
    }
}
