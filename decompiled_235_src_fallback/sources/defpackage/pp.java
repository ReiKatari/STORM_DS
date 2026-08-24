package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pp  reason: default package */
/* loaded from: classes.dex */
public abstract class pp {
    public static android.os.Handler a(android.os.Looper r0) {
            android.os.Handler r0 = android.os.Handler.createAsync(r0)
            return r0
    }

    public static android.os.Handler b(android.os.Looper r0) {
            android.os.Handler r0 = android.os.Handler.createAsync(r0)
            return r0
    }

    public static android.graphics.Bitmap c(android.graphics.Picture r0) {
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0)
            return r0
    }

    public static java.util.List d(android.view.DisplayCutout r0) {
            java.util.List r0 = r0.getBoundingRects()
            return r0
    }

    public static java.lang.String[] e(android.icu.text.DecimalFormatSymbols r0) {
            java.lang.String[] r0 = r0.getDigitStrings()
            return r0
    }

    public static long f(android.content.pm.PackageInfo r2) {
            long r0 = r2.getLongVersionCode()
            return r0
    }

    public static java.util.concurrent.Executor g(android.content.Context r0) {
            java.util.concurrent.Executor r0 = r0.getMainExecutor()
            return r0
    }

    public static void h(android.app.job.JobParameters r0) {
            r0.getNetwork()
            return
    }

    public static java.lang.String i() {
            java.lang.String r0 = android.app.Application.getProcessName()
            r0.getClass()
            return r0
    }

    public static int j(java.lang.Object r0) {
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            int r0 = r0.getResId()
            return r0
    }

    public static java.lang.String k(java.lang.Object r0) {
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            java.lang.String r0 = r0.getResPackage()
            return r0
    }

    public static int l(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetBottom()
            return r0
    }

    public static int m(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetLeft()
            return r0
    }

    public static int n(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetRight()
            return r0
    }

    public static int o(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetTop()
            return r0
    }

    public static int p(android.view.ViewConfiguration r0) {
            int r0 = r0.getScaledHoverSlop()
            return r0
    }

    public static android.text.PrecomputedText.Params q(defpackage.qs r0) {
            android.text.PrecomputedText$Params r0 = r0.getTextMetricsParams()
            return r0
    }

    public static int r(java.lang.Object r0) {
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            int r0 = r0.getType()
            return r0
    }

    public static android.net.Uri s(java.lang.Object r0) {
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            android.net.Uri r0 = r0.getUri()
            return r0
    }

    public static boolean t(android.os.Handler r1, defpackage.dj0 r2, long r3) {
            java.lang.String r0 = "retry_token"
            boolean r1 = r1.postDelayed(r2, r0, r3)
            return r1
    }

    public static void u(android.widget.TextView r0, int r1) {
            r0.setFirstBaselineToTopHeight(r1)
            return
    }

    public static void v(android.app.Notification.Action.Builder r1) {
            r0 = 0
            r1.setSemanticAction(r0)
            return
    }

    public static boolean w(android.view.ViewConfiguration r0) {
            boolean r0 = r0.shouldShowMenuShortcutsWhenKeyboardPresent()
            return r0
    }
}
