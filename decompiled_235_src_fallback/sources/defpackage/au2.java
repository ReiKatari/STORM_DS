package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: au2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class au2 {
    public static /* bridge */ /* synthetic */ void A(android.graphics.RenderNode r0, float r1) {
            r0.setTranslationX(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void B(android.graphics.RenderNode r1) {
            r0 = 0
            r1.setClipToBounds(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void C(android.graphics.RenderNode r0, float r1) {
            r0.setRotationZ(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void D(android.graphics.RenderNode r1) {
            r0 = 0
            r1.setRotationY(r0)
            return
    }

    public static /* bridge */ /* synthetic */ float a(android.view.MotionEvent r1) {
            r0 = 0
            float r1 = r1.getRawX(r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ float b(android.view.MotionEvent r0, int r1) {
            float r0 = r0.getRawX(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ int c(android.graphics.Insets r0) {
            int r0 = r0.top
            return r0
    }

    public static /* bridge */ /* synthetic */ int d(android.view.MotionEvent r0) {
            int r0 = r0.getClassification()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RecordingCanvas e(android.graphics.RenderNode r0) {
            android.graphics.RecordingCanvas r0 = r0.beginRecording()
            return r0
    }

    public static /* synthetic */ android.graphics.RenderNode f() {
            android.graphics.RenderNode r0 = new android.graphics.RenderNode
            java.lang.String r1 = "graphicsLayer"
            r0.<init>(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ void g(android.graphics.Canvas r0, android.graphics.RenderNode r1) {
            r0.drawRenderNode(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void h(android.graphics.Paint r0, android.graphics.BlendMode r1) {
            r0.setBlendMode(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void i(android.graphics.RenderNode r1) {
            r0 = 1
            r1.setHasOverlappingRendering(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void j(android.graphics.RenderNode r0, float r1) {
            r0.setPivotX(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void k(android.graphics.RenderNode r0, int r1) {
            r0.setAmbientShadowColor(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void l(android.graphics.RenderNode r0, int r1, int r2, int r3, int r4) {
            r0.setPosition(r1, r2, r3, r4)
            return
    }

    public static /* bridge */ /* synthetic */ void m(android.graphics.RenderNode r1, android.graphics.Paint r2) {
            r0 = 1
            r1.setUseCompositingLayer(r0, r2)
            return
    }

    public static /* bridge */ /* synthetic */ float n(android.view.MotionEvent r1) {
            r0 = 0
            float r1 = r1.getRawY(r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ float o(android.view.MotionEvent r0, int r1) {
            float r0 = r0.getRawY(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ int p(android.graphics.Insets r0) {
            int r0 = r0.right
            return r0
    }

    public static /* bridge */ /* synthetic */ void q(android.graphics.RenderNode r1) {
            r0 = 0
            r1.setHasOverlappingRendering(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void r(android.graphics.RenderNode r0, float r1) {
            r0.setPivotY(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void s(android.graphics.RenderNode r0, int r1) {
            r0.setSpotShadowColor(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void t(android.graphics.RenderNode r1, android.graphics.Paint r2) {
            r0 = 0
            r1.setUseCompositingLayer(r0, r2)
            return
    }

    public static /* bridge */ /* synthetic */ int u(android.graphics.Insets r0) {
            int r0 = r0.bottom
            return r0
    }

    public static /* bridge */ /* synthetic */ void v(android.graphics.RenderNode r1) {
            r0 = 0
            r1.setRotationX(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void w(android.graphics.RenderNode r0, float r1) {
            r0.setCameraDistance(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void x(android.graphics.RenderNode r0) {
            r0.resetPivot()
            return
    }

    public static /* bridge */ /* synthetic */ void y(android.graphics.RenderNode r0, float r1) {
            r0.setElevation(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void z(android.graphics.RenderNode r0) {
            r0.endRecording()
            return
    }
}
