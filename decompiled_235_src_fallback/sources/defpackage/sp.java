package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sp  reason: default package */
/* loaded from: classes.dex */
public final class sp {
    public static final defpackage.sp a = null;

    static {
            sp r0 = new sp
            r0.<init>()
            defpackage.sp.a = r0
            return
    }

    public final int a(android.view.Window r2) {
            r1 = this;
            android.view.WindowManager r1 = r2.getWindowManager()
            android.view.WindowMetrics r1 = r1.getCurrentWindowMetrics()
            android.view.WindowInsets r2 = r1.getWindowInsets()
            int r0 = android.view.WindowInsets.Type.systemBars()
            android.graphics.Insets r2 = r2.getInsets(r0)
            int r0 = r2.top
            int r2 = r2.bottom
            int r0 = r0 + r2
            android.graphics.Rect r1 = r1.getBounds()
            int r1 = r1.height()
            int r1 = r1 - r0
            return r1
    }

    public final void b(android.view.WindowManager.LayoutParams r1, int r2) {
            r0 = this;
            r1.setFitInsetsSides(r2)
            return
    }

    public final void c(android.view.WindowManager.LayoutParams r1, int r2) {
            r0 = this;
            r1.setFitInsetsTypes(r2)
            return
    }
}
