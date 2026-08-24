package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sd0  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class sd0 {
    public static /* bridge */ /* synthetic */ int A(android.view.ContentInfo r0) {
            int r0 = r0.getSource()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.Surface B(android.view.ScrollCaptureSession r0) {
            android.view.Surface r0 = r0.getSurface()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextClassification C(android.view.textclassifier.TextSelection r0) {
            android.view.textclassifier.TextClassification r0 = r0.getTextClassification()
            return r0
    }

    public static /* bridge */ /* synthetic */ int[] D(android.net.NetworkRequest r0) {
            int[] r0 = r0.getCapabilities()
            return r0
    }

    public static /* bridge */ /* synthetic */ int a(android.content.res.Configuration r0) {
            int r0 = r0.fontWeightAdjustment
            return r0
    }

    public static /* bridge */ /* synthetic */ int b(android.view.ContentInfo r0) {
            int r0 = r0.getFlags()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.ClipData c(android.view.ContentInfo r0) {
            android.content.ClipData r0 = r0.getClip()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RenderEffect d() {
            r0 = 0
            android.graphics.RenderEffect r0 = android.graphics.RenderEffect.createOffsetEffect(r0, r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RenderEffect e(float r0, float r1, android.graphics.Shader.TileMode r2) {
            android.graphics.RenderEffect r0 = android.graphics.RenderEffect.createBlurEffect(r0, r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.CameraExtensionSession f(java.lang.Object r0) {
            android.hardware.camera2.CameraExtensionSession r0 = (android.hardware.camera2.CameraExtensionSession) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.Vibrator g(android.os.VibratorManager r0) {
            android.os.Vibrator r0 = r0.getDefaultVibrator()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.Vibrator h(android.os.VibratorManager r0, int r1) {
            android.os.Vibrator r0 = r0.getVibrator(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.VibratorManager i(android.view.InputDevice r0) {
            android.os.VibratorManager r0 = r0.getVibratorManager()
            return r0
    }

    public static /* synthetic */ android.view.ContentInfo.Builder j(android.content.ClipData r1, int r2) {
            android.view.ContentInfo$Builder r0 = new android.view.ContentInfo$Builder
            r0.<init>(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.ContentInfo k(android.view.ContentInfo.Builder r0) {
            android.view.ContentInfo r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.ContentInfo l(java.lang.Object r0) {
            android.view.ContentInfo r0 = (android.view.ContentInfo) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.RoundedCorner m(android.view.Display r0, int r1) {
            android.view.RoundedCorner r0 = r0.getRoundedCorner(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.ScrollCaptureSession n(java.lang.Object r0) {
            android.view.ScrollCaptureSession r0 = (android.view.ScrollCaptureSession) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.Surface o(android.view.ScrollCaptureSession r0) {
            android.view.Surface r0 = r0.getSurface()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextClassification p(android.view.textclassifier.TextSelection r0) {
            android.view.textclassifier.TextClassification r0 = r0.getTextClassification()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String q() {
            java.lang.String r0 = android.os.Build.SOC_MANUFACTURER
            return r0
    }

    public static /* bridge */ /* synthetic */ void r(android.graphics.Canvas r0, android.graphics.NinePatch r1, android.graphics.Rect r2, android.graphics.Paint r3) {
            r0.drawPatch(r1, r2, r3)
            return
    }

    public static /* bridge */ /* synthetic */ void s(android.graphics.Canvas r0, android.graphics.NinePatch r1, android.graphics.RectF r2, android.graphics.Paint r3) {
            r0.drawPatch(r1, r2, r3)
            return
    }

    public static /* bridge */ /* synthetic */ void t(android.graphics.Canvas r0, int[] r1, int r2, float[] r3, int r4, int r5, android.graphics.fonts.Font r6, android.graphics.Paint r7) {
            r0.drawGlyphs(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static /* bridge */ /* synthetic */ void u(android.view.ContentInfo.Builder r0, int r1) {
            r0.setFlags(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void v(android.view.ContentInfo.Builder r0, android.net.Uri r1) {
            r0.setLinkUri(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void w(android.view.ContentInfo.Builder r0, android.os.Bundle r1) {
            r0.setExtras(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void x(android.view.textclassifier.TextSelection.Request.Builder r1) {
            r0 = 1
            r1.setIncludeTextClassification(r0)
            return
    }

    public static /* bridge */ /* synthetic */ int[] y(android.net.NetworkRequest r0) {
            int[] r0 = r0.getTransportTypes()
            return r0
    }

    public static /* bridge */ /* synthetic */ int[] z(android.os.VibratorManager r0) {
            int[] r0 = r0.getVibratorIds()
            return r0
    }
}
