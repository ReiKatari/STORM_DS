package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fq7  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class fq7 {
    public static /* bridge */ /* synthetic */ android.graphics.Insets a(android.view.WindowInsets r0) {
            android.graphics.Insets r0 = r0.getTappableElementInsets()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.DisplayCutout b(android.view.Display r0) {
            android.view.DisplayCutout r0 = r0.getCutout()
            return r0
    }

    public static /* synthetic */ android.view.WindowInsets.Builder c(android.view.WindowInsets r1) {
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            r0.<init>(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsets d(android.view.WindowInsets.Builder r0) {
            android.view.WindowInsets r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsets e(android.view.WindowInsets r0, int r1, int r2, int r3, int r4) {
            android.view.WindowInsets r0 = r0.inset(r1, r2, r3, r4)
            return r0
    }

    public static /* bridge */ /* synthetic */ void f(android.graphics.Paint r0, android.graphics.BlendMode r1) {
            r0.setBlendMode(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void g(android.view.View r0, int r1) {
            r0.setTransitionVisibility(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void h(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setSystemWindowInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ android.graphics.Insets i(android.view.WindowInsets r0) {
            android.graphics.Insets r0 = r0.getMandatorySystemGestureInsets()
            return r0
    }

    public static /* bridge */ /* synthetic */ void j(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setStableInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ android.graphics.Insets k(android.view.WindowInsets r0) {
            android.graphics.Insets r0 = r0.getSystemGestureInsets()
            return r0
    }

    public static /* bridge */ /* synthetic */ void l(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setSystemGestureInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void m(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setMandatorySystemGestureInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setTappableElementInsets(r1)
            return
    }
}
