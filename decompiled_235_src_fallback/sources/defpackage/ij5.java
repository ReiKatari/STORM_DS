package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ij5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ij5 {
    public static /* bridge */ /* synthetic */ int a(android.graphics.text.PositionedGlyphs r0) {
            int r0 = r0.glyphCount()
            return r0
    }

    public static /* bridge */ /* synthetic */ int b(android.view.RoundedCorner r0) {
            int r0 = r0.getPosition()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Point c(android.view.RoundedCorner r0) {
            android.graphics.Point r0 = r0.getCenter()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Shader.TileMode d() {
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.DECAL
            return r0
    }

    public static /* synthetic */ android.graphics.fonts.Font.Builder e(android.graphics.fonts.Font r1) {
            android.graphics.fonts.Font$Builder r0 = new android.graphics.fonts.Font$Builder
            r0.<init>(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.fonts.Font f(android.graphics.text.PositionedGlyphs r1) {
            r0 = 0
            android.graphics.fonts.Font r1 = r1.getFont(r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ android.graphics.text.PositionedGlyphs g(android.graphics.Paint r9) {
            r6 = 0
            r7 = 0
            java.lang.String r0 = " "
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 1
            r5 = 0
            r8 = r9
            android.graphics.text.PositionedGlyphs r9 = android.graphics.text.TextRunShaper.shapeTextRun(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.CameraCharacteristics.Key h() {
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.StrictMode.VmPolicy.Builder i(android.os.StrictMode.VmPolicy.Builder r0) {
            android.os.StrictMode$VmPolicy$Builder r0 = r0.permitUnsafeIntentLaunch()
            return r0
    }

    public static /* synthetic */ android.view.ScrollCaptureTarget j(defpackage.te r1, android.graphics.Rect r2, android.graphics.Point r3, android.view.ScrollCaptureCallback r4) {
            android.view.ScrollCaptureTarget r0 = new android.view.ScrollCaptureTarget
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.View k(android.window.SplashScreenView r0) {
            android.view.View r0 = r0.getRootView()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.window.SplashScreenView l(android.view.View r0) {
            android.window.SplashScreenView r0 = (android.window.SplashScreenView) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ void m(android.app.job.JobInfo.Builder r1) {
            r0 = 1
            r1.setExpedited(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.graphics.RenderNode r0, android.graphics.RenderEffect r1) {
            r0.setRenderEffect(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void o(android.view.ScrollCaptureTarget r0, android.graphics.Rect r1) {
            r0.setScrollBounds(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.view.View r0, android.graphics.RenderEffect r1) {
            r0.setRenderEffect(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean q(android.view.View r0) {
            boolean r0 = r0 instanceof android.window.SplashScreenView
            return r0
    }

    public static /* bridge */ /* synthetic */ int r(android.view.RoundedCorner r0) {
            int r0 = r0.getRadius()
            return r0
    }
}
