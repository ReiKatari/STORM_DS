package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: od  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class od {
    public static /* bridge */ /* synthetic */ android.graphics.BlendMode A() {
            android.graphics.BlendMode r0 = android.graphics.BlendMode.OVERLAY
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.BlendMode B() {
            android.graphics.BlendMode r0 = android.graphics.BlendMode.DARKEN
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.BlendMode C() {
            android.graphics.BlendMode r0 = android.graphics.BlendMode.LIGHTEN
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.BlendMode D() {
            android.graphics.BlendMode r0 = android.graphics.BlendMode.COLOR_DODGE
            return r0
    }

    public static /* bridge */ /* synthetic */ long a(defpackage.te r2) {
            long r0 = r2.getUniqueDrawingId()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.BlendMode b() {
            android.graphics.BlendMode r0 = android.graphics.BlendMode.XOR
            return r0
    }

    public static /* synthetic */ android.graphics.BlendModeColorFilter c(int r1, android.graphics.BlendMode r2) {
            android.graphics.BlendModeColorFilter r0 = new android.graphics.BlendModeColorFilter
            r0.<init>(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.media.ImageWriter d(int r1, android.view.Surface r2) {
            r0 = 1
            android.media.ImageWriter r1 = android.media.ImageWriter.newInstance(r2, r0, r1)
            return r1
    }

    public static /* bridge */ /* synthetic */ android.os.VibrationEffect e() {
            r0 = 0
            android.os.VibrationEffect r0 = android.os.VibrationEffect.createPredefined(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.text.TextDirectionHeuristic f(android.widget.TextView r0) {
            android.text.TextDirectionHeuristic r0 = r0.getTextDirectionHeuristic()
            return r0
    }

    public static /* synthetic */ void g() {
            android.graphics.BlendModeColorFilter r0 = new android.graphics.BlendModeColorFilter
            return
    }

    public static /* bridge */ /* synthetic */ void h(long r0, java.lang.String r2) {
            android.os.Trace.setCounter(r2, r0)
            return
    }

    public static /* bridge */ /* synthetic */ void i(android.graphics.Canvas r0) {
            r0.disableZ()
            return
    }

    public static /* bridge */ /* synthetic */ void j(android.graphics.Canvas r0, int r1, android.graphics.BlendMode r2) {
            r0.drawColor(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void k(android.graphics.Canvas r0, long r1) {
            r0.drawColor(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void l(android.graphics.Canvas r0, long r1, android.graphics.BlendMode r3) {
            r0.drawColor(r1, r3)
            return
    }

    public static /* bridge */ /* synthetic */ void m(android.graphics.Canvas r0, android.graphics.RectF r1, float r2, float r3, android.graphics.RectF r4, float r5, float r6, android.graphics.Paint r7) {
            r0.drawDoubleRoundRect(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.graphics.Canvas r0, android.graphics.RectF r1, float[] r2, android.graphics.RectF r3, float[] r4, android.graphics.Paint r5) {
            r0.drawDoubleRoundRect(r1, r2, r3, r4, r5)
            return
    }

    public static /* bridge */ /* synthetic */ void o(android.graphics.Canvas r0, android.graphics.RenderNode r1) {
            r0.drawRenderNode(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.graphics.Canvas r0, android.graphics.text.MeasuredText r1, int r2, int r3, int r4, int r5, float r6, float r7, boolean r8, android.graphics.Paint r9) {
            r0.drawTextRun(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static /* bridge */ /* synthetic */ void q(android.view.View r1) {
            r0 = 0
            r1.setForceDarkAllowed(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void r(android.view.View r0, android.graphics.Matrix r1) {
            r0.transformMatrixToGlobal(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean s(android.widget.TextView r0) {
            boolean r0 = r0.isHorizontallyScrollable()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.BlendMode t() {
            android.graphics.BlendMode r0 = android.graphics.BlendMode.PLUS
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.VibrationEffect u() {
            r0 = 2
            android.os.VibrationEffect r0 = android.os.VibrationEffect.createPredefined(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ void v(android.graphics.Canvas r0) {
            r0.enableZ()
            return
    }

    public static /* bridge */ /* synthetic */ android.graphics.BlendMode w() {
            android.graphics.BlendMode r0 = android.graphics.BlendMode.MODULATE
            return r0
    }

    public static /* bridge */ /* synthetic */ void x(android.graphics.Canvas r0) {
            r0.enableZ()
            return
    }

    public static /* bridge */ /* synthetic */ android.graphics.BlendMode y() {
            android.graphics.BlendMode r0 = android.graphics.BlendMode.SCREEN
            return r0
    }

    public static /* bridge */ /* synthetic */ void z(android.graphics.Canvas r0) {
            r0.disableZ()
            return
    }
}
