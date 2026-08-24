package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class k2 {
    public static /* bridge */ /* synthetic */ android.graphics.Bitmap.Config A() {
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.HARDWARE
            return r0
    }

    public static /* bridge */ /* synthetic */ void B(android.os.Vibrator r0, android.os.VibrationEffect r1) {
            r0.vibrate(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean C(android.view.autofill.AutofillValue r0) {
            boolean r0 = r0.getToggleValue()
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean D(android.view.autofill.AutofillValue r0) {
            boolean r0 = r0.isText()
            return r0
    }

    public static /* bridge */ /* synthetic */ int a(android.content.res.Configuration r0) {
            int r0 = r0.colorMode
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Bitmap.Config b() {
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_F16
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Bitmap c(int r6, int r7, android.graphics.Bitmap.Config r8, android.graphics.ColorSpace r9) {
            r0 = 0
            r4 = 1
            r1 = r6
            r2 = r7
            r3 = r8
            r5 = r9
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static /* synthetic */ android.hardware.camera2.params.OutputConfiguration d(android.util.Size r1, java.lang.Class r2) {
            android.hardware.camera2.params.OutputConfiguration r0 = new android.hardware.camera2.params.OutputConfiguration
            r0.<init>(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.VibrationEffect e(int r0, long r1) {
            android.os.VibrationEffect r0 = android.os.VibrationEffect.createOneShot(r1, r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.VibrationEffect f(long[] r1) {
            r0 = -1
            android.os.VibrationEffect r1 = android.os.VibrationEffect.createWaveform(r1, r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction g() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.autofill.AutofillId h(defpackage.te r0) {
            android.view.autofill.AutofillId r0 = r0.getAutofillId()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.autofill.AutofillManager i(java.lang.Object r0) {
            android.view.autofill.AutofillManager r0 = (android.view.autofill.AutofillManager) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.autofill.AutofillValue j(java.lang.Object r0) {
            android.view.autofill.AutofillValue r0 = (android.view.autofill.AutofillValue) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.CharSequence k(android.view.autofill.AutofillValue r0) {
            java.lang.CharSequence r0 = r0.getTextValue()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class l() {
            java.lang.Class<android.view.autofill.AutofillManager> r0 = android.view.autofill.AutofillManager.class
            return r0
    }

    public static /* bridge */ /* synthetic */ void m(defpackage.te r1) {
            r0 = 1
            r1.setImportantForAutofill(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.content.res.Configuration r0, int r1) {
            r0.colorMode = r1
            return
    }

    public static /* bridge */ /* synthetic */ void o(android.hardware.camera2.CameraCaptureSession r0, java.util.ArrayList r1) {
            r0.finalizeOutputConfigurations(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.hardware.camera2.params.OutputConfiguration r0) {
            r0.enableSurfaceSharing()
            return
    }

    public static /* bridge */ /* synthetic */ void q(android.hardware.camera2.params.OutputConfiguration r0, android.view.Surface r1) {
            r0.addSurface(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void r(android.os.Vibrator r0, android.os.VibrationEffect r1) {
            r0.vibrate(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void s(android.view.View r0, int r1) {
            r0.setFocusable(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void t(android.view.View r0, boolean r1) {
            r0.setDefaultFocusHighlightEnabled(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void u(android.view.accessibility.AccessibilityNodeInfo r0, java.lang.CharSequence r1) {
            r0.setHintText(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void v(android.view.accessibility.AccessibilityNodeInfo r0, java.util.ArrayList r1) {
            r0.setAvailableExtraData(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void w(android.view.accessibility.AccessibilityNodeInfo r0, boolean r1) {
            r0.setShowingHintText(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean x(android.os.Vibrator r0) {
            boolean r0 = r0.hasAmplitudeControl()
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean y(android.view.accessibility.AccessibilityNodeInfo r0) {
            boolean r0 = r0.isShowingHintText()
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean z(android.view.autofill.AutofillValue r0) {
            boolean r0 = r0.isToggle()
            return r0
    }
}
