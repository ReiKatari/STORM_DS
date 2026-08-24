package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zm6  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class zm6 {
    public static /* bridge */ /* synthetic */ int A() {
            int r0 = android.view.WindowInsets.Type.systemGestures()
            return r0
    }

    public static /* bridge */ /* synthetic */ int B() {
            int r0 = android.view.WindowInsets.Type.mandatorySystemGestures()
            return r0
    }

    public static /* bridge */ /* synthetic */ int C() {
            int r0 = android.view.WindowInsets.Type.tappableElement()
            return r0
    }

    public static /* bridge */ /* synthetic */ int D() {
            int r0 = android.view.WindowInsets.Type.displayCutout()
            return r0
    }

    public static /* bridge */ /* synthetic */ float a(android.view.WindowInsetsAnimation r0) {
            float r0 = r0.getInterpolatedFraction()
            return r0
    }

    public static /* bridge */ /* synthetic */ int b() {
            int r0 = android.view.WindowInsets.Type.statusBars()
            return r0
    }

    public static /* bridge */ /* synthetic */ int c(android.view.WindowInsetsAnimation r0) {
            int r0 = r0.getTypeMask()
            return r0
    }

    public static /* bridge */ /* synthetic */ long d(android.view.WindowInsetsAnimation r2) {
            long r0 = r2.getDurationMillis()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Insets e(android.view.WindowInsets r0, int r1) {
            android.graphics.Insets r0 = r0.getInsetsIgnoringVisibility(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Insets f(android.view.WindowInsetsAnimation.Bounds r0) {
            android.graphics.Insets r0 = r0.getUpperBound()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsets g() {
            android.view.WindowInsets r0 = android.view.WindowInsets.CONSUMED
            return r0
    }

    public static /* synthetic */ android.view.WindowInsetsAnimation.Bounds h(android.graphics.Insets r1, android.graphics.Insets r2) {
            android.view.WindowInsetsAnimation$Bounds r0 = new android.view.WindowInsetsAnimation$Bounds
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ android.view.WindowInsetsAnimation i(int r1, android.view.animation.Interpolator r2, long r3) {
            android.view.WindowInsetsAnimation r0 = new android.view.WindowInsetsAnimation
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsetsAnimation j(java.lang.Object r0) {
            android.view.WindowInsetsAnimation r0 = (android.view.WindowInsetsAnimation) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsetsController k(android.view.Window r0) {
            android.view.WindowInsetsController r0 = r0.getInsetsController()
            return r0
    }

    public static /* synthetic */ void l() {
            android.view.WindowInsetsAnimation$Bounds r0 = new android.view.WindowInsetsAnimation$Bounds
            return
    }

    public static /* bridge */ /* synthetic */ void m(android.view.View r0, defpackage.xt7 r1) {
            r0.setWindowInsetsAnimationCallback(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.view.WindowInsets.Builder r0, int r1, android.graphics.Insets r2) {
            r0.setInsets(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void o(android.view.WindowInsetsAnimation r0, float r1) {
            r0.setFraction(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.view.WindowInsetsController r1) {
            r0 = 2
            r1.setSystemBarsBehavior(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void q(android.view.WindowInsetsController r0, int r1) {
            r0.hide(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void r(android.view.WindowInsetsController r0, int r1, int r2) {
            r0.setSystemBarsAppearance(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ boolean s(android.view.WindowInsets r0, int r1) {
            boolean r0 = r0.isVisible(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ float t(android.view.WindowInsetsAnimation r0) {
            float r0 = r0.getAlpha()
            return r0
    }

    public static /* bridge */ /* synthetic */ int u() {
            int r0 = android.view.WindowInsets.Type.navigationBars()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Insets v(android.view.WindowInsets r0, int r1) {
            android.graphics.Insets r0 = r0.getInsets(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Insets w(android.view.WindowInsetsAnimation.Bounds r0) {
            android.graphics.Insets r0 = r0.getLowerBound()
            return r0
    }

    public static /* bridge */ /* synthetic */ void x(android.view.WindowInsetsController r0, int r1) {
            r0.show(r1)
            return
    }

    public static /* bridge */ /* synthetic */ float y(android.view.WindowInsetsAnimation r0) {
            float r0 = r0.getFraction()
            return r0
    }

    public static /* bridge */ /* synthetic */ int z() {
            int r0 = android.view.WindowInsets.Type.captionBar()
            return r0
    }
}
