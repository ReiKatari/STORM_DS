package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yz0  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class yz0 {
    public static /* bridge */ /* synthetic */ void A(android.graphics.RenderNode r0, float r1) {
            r0.setAlpha(r1)
            return
    }

    public static /* bridge */ /* synthetic */ int B(android.graphics.Insets r0) {
            int r0 = r0.right
            return r0
    }

    public static /* bridge */ /* synthetic */ void C(android.graphics.RenderNode r0, float r1) {
            r0.setScaleX(r1)
            return
    }

    public static /* bridge */ /* synthetic */ int D(android.graphics.Insets r0) {
            int r0 = r0.bottom
            return r0
    }

    public static /* bridge */ /* synthetic */ int a(android.graphics.Insets r0) {
            int r0 = r0.left
            return r0
    }

    public static /* bridge */ /* synthetic */ int b(android.text.TextPaint r7, java.lang.CharSequence r8, int r9, int r10) {
            r4 = 0
            r6 = 2
            r2 = 0
            r0 = r7
            r1 = r8
            r3 = r9
            r5 = r10
            int r7 = r0.getTextRunCursor(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static /* bridge */ /* synthetic */ android.content.res.AssetFileDescriptor c(android.content.ContentResolver r2, android.net.Uri r3, android.os.Bundle r4) {
            java.lang.String r0 = "image/*"
            r1 = 0
            android.content.res.AssetFileDescriptor r2 = r2.openTypedAssetFile(r3, r0, r4, r1)
            return r2
    }

    public static /* bridge */ /* synthetic */ android.content.res.ColorStateList d(android.graphics.drawable.ColorStateListDrawable r0) {
            android.content.res.ColorStateList r0 = r0.getColorStateList()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.drawable.ColorStateListDrawable e(android.graphics.drawable.Drawable r0) {
            android.graphics.drawable.ColorStateListDrawable r0 = (android.graphics.drawable.ColorStateListDrawable) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.DisplayCutout f(android.view.Display r0) {
            android.view.DisplayCutout r0 = r0.getCutout()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.contentcapture.ContentCaptureSession g(java.lang.Object r0) {
            android.view.contentcapture.ContentCaptureSession r0 = (android.view.contentcapture.ContentCaptureSession) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ void h(android.graphics.RenderNode r0) {
            r0.discardDisplayList()
            return
    }

    public static /* bridge */ /* synthetic */ void i(android.graphics.RenderNode r0, float r1) {
            r0.setScaleY(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void j(android.graphics.RenderNode r0, android.graphics.Matrix r1) {
            r0.getMatrix(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void k(android.graphics.RenderNode r0, android.graphics.Outline r1) {
            r0.setOutline(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void l(android.graphics.RenderNode r0, boolean r1) {
            r0.setClipToBounds(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void m(android.graphics.drawable.Drawable r0, android.graphics.BlendMode r1) {
            r0.setTintBlendMode(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.view.Window r1) {
            r0 = 0
            r1.setStatusBarContrastEnforced(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void o(android.view.Window r0, java.util.List r1) {
            r0.setSystemGestureExclusionRects(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.view.Window r0, boolean r1) {
            r0.setNavigationBarContrastEnforced(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void q(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.content.Context r8, int[] r9, android.util.AttributeSet r10, android.content.res.TypedArray r11) {
            r5 = 2130968951(0x7f040177, float:1.754657E38)
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
            return
    }

    public static /* bridge */ /* synthetic */ void r(me.magnum.melonds.ui.emulator.RuntimeLayoutView r0, java.util.List r1) {
            r0.setSystemGestureExclusionRects(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean s(android.content.Context r0, android.content.Intent r1, android.content.ServiceConnection r2, int r3, java.util.concurrent.Executor r4) {
            boolean r0 = r0.bindService(r1, r3, r4, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean t(android.graphics.RenderNode r0) {
            boolean r0 = r0.hasDisplayList()
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean u(android.graphics.drawable.Drawable r0) {
            boolean r0 = r0 instanceof android.graphics.drawable.ColorStateListDrawable
            return r0
    }

    public static /* bridge */ /* synthetic */ int v(android.graphics.Insets r0) {
            int r0 = r0.left
            return r0
    }

    public static /* bridge */ /* synthetic */ int w(android.text.TextPaint r7, java.lang.CharSequence r8, int r9, int r10) {
            r4 = 0
            r6 = 0
            r2 = 0
            r0 = r7
            r1 = r8
            r3 = r9
            r5 = r10
            int r7 = r0.getTextRunCursor(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static /* bridge */ /* synthetic */ void x(android.graphics.RenderNode r0, float r1) {
            r0.setTranslationY(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void y(android.graphics.RenderNode r0, boolean r1) {
            r0.setClipToOutline(r1)
            return
    }

    public static /* bridge */ /* synthetic */ int z(android.graphics.Insets r0) {
            int r0 = r0.top
            return r0
    }
}
