package defpackage;

import android.app.Application;
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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dp  reason: default package */
/* loaded from: classes.dex */
public abstract class dp {
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

    public static String i() {
        String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }

    public static int j(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String k(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int l(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int m(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int n(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int o(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int p(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params q(ds dsVar) {
        return dsVar.getTextMetricsParams();
    }

    public static Uri r(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static boolean s(Handler handler, ug0 ug0Var, long j) {
        return handler.postDelayed(ug0Var, "retry_token", j);
    }

    public static void t(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static boolean u(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
