package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r74  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class r74 {
    public static /* bridge */ /* synthetic */ void A(android.view.View r0, android.graphics.Matrix r1) {
            r0.transformMatrixToGlobal(r1)
            return
    }

    public static /* synthetic */ android.graphics.fonts.FontFamily.Builder B(android.graphics.fonts.Font r1) {
            android.graphics.fonts.FontFamily$Builder r0 = new android.graphics.fonts.FontFamily$Builder
            r0.<init>(r1)
            return r0
    }

    public static /* synthetic */ void C() {
            android.graphics.fonts.Font$Builder r0 = new android.graphics.fonts.Font$Builder
            return
    }

    public static /* bridge */ /* synthetic */ void D(android.view.View r0, android.graphics.Matrix r1) {
            r0.transformMatrixToLocal(r1)
            return
    }

    public static /* bridge */ /* synthetic */ float a(android.view.MotionEvent r0, int r1) {
            float r0 = r0.getRawY(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ float b(android.view.View r0) {
            float r0 = r0.getTransitionAlpha()
            return r0
    }

    public static /* bridge */ /* synthetic */ int c(android.view.MotionEvent r0) {
            int r0 = r0.getClassification()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RecordingCanvas d(android.graphics.RenderNode r0) {
            android.graphics.RecordingCanvas r0 = r0.beginRecording()
            return r0
    }

    public static /* synthetic */ android.graphics.RenderNode e() {
            android.graphics.RenderNode r0 = new android.graphics.RenderNode
            java.lang.String r1 = "AndroidEdgeEffectOverscrollEffect"
            r0.<init>(r1)
            return r0
    }

    public static /* synthetic */ android.graphics.Typeface.CustomFallbackBuilder f(android.graphics.fonts.FontFamily r1) {
            android.graphics.Typeface$CustomFallbackBuilder r0 = new android.graphics.Typeface$CustomFallbackBuilder
            r0.<init>(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Typeface g(android.graphics.Typeface.CustomFallbackBuilder r0) {
            android.graphics.Typeface r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.drawable.Drawable h(android.widget.EditText r0) {
            android.graphics.drawable.Drawable r0 = r0.getTextCursorDrawable()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.fonts.Font.Builder i(android.graphics.fonts.Font.Builder r0, java.lang.String r1) {
            android.graphics.fonts.Font$Builder r0 = r0.setFontVariationSettings(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.fonts.Font j(android.graphics.fonts.Font.Builder r0) {
            android.graphics.fonts.Font r0 = r0.build()
            return r0
    }

    public static /* synthetic */ android.graphics.fonts.FontFamily.Builder k(android.graphics.fonts.Font r1) {
            android.graphics.fonts.FontFamily$Builder r0 = new android.graphics.fonts.FontFamily$Builder
            r0.<init>(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.fonts.FontFamily l(android.graphics.fonts.FontFamily.Builder r0) {
            android.graphics.fonts.FontFamily r0 = r0.build()
            return r0
    }

    public static /* synthetic */ android.view.WindowInsets.Builder m() {
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            r0.<init>()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsets n(android.view.WindowInsets.Builder r0) {
            android.view.WindowInsets r0 = r0.build()
            return r0
    }

    public static /* synthetic */ void o() {
            android.graphics.fonts.FontFamily$Builder r0 = new android.graphics.fonts.FontFamily$Builder
            return
    }

    public static /* bridge */ /* synthetic */ void p(defpackage.c05 r0, java.util.ArrayList r1) {
            r0.setSystemGestureExclusionRects(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void q(android.app.Activity r0, defpackage.ik5.a r1) {
            r0.registerActivityLifecycleCallbacks(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void r(android.content.pm.ShortcutInfo.Builder r1) {
            r0 = 0
            r1.setLongLived(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void s(android.graphics.Canvas r0, android.graphics.RenderNode r1) {
            r0.drawRenderNode(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void t(android.graphics.Paint r0, java.lang.CharSequence r1, int r2, int r3, android.graphics.Rect r4) {
            r0.getTextBounds(r1, r2, r3, r4)
            return
    }

    public static /* bridge */ /* synthetic */ void u(android.graphics.RenderNode r0) {
            r0.endRecording()
            return
    }

    public static /* bridge */ /* synthetic */ void v(android.graphics.RenderNode r1, int r2, int r3) {
            r0 = 0
            r1.setPosition(r0, r0, r2, r3)
            return
    }

    public static /* bridge */ /* synthetic */ void w(android.graphics.Typeface.CustomFallbackBuilder r0, android.graphics.fonts.FontFamily r1) {
            r0.addCustomFallback(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void x(android.graphics.Typeface.CustomFallbackBuilder r0, java.lang.String r1) {
            r0.setSystemFallback(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void y(android.view.View r0, float r1) {
            r0.setTransitionAlpha(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void z(android.view.View r0, int r1, int r2, int r3, int r4) {
            r0.setLeftTopRightBottom(r1, r2, r3, r4)
            return
    }
}
