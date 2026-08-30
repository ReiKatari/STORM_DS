package a6;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Bitmap c(Picture picture) {
        return Bitmap.createBitmap(picture);
    }

    public static List d(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String[] e(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long f(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static Executor g(Context context) {
        return context.getMainExecutor();
    }

    public static void h(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    public static int i(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String j(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int k(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int l(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int m(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int n(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int o(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params p(q.z0 z0Var) {
        return z0Var.getTextMetricsParams();
    }

    public static Uri q(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static boolean r(Handler handler, d0.u uVar, long j2) {
        return handler.postDelayed(uVar, "retry_token", j2);
    }

    public static void s(TextView textView, int i2) {
        textView.setFirstBaselineToTopHeight(i2);
    }

    public static boolean t(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
