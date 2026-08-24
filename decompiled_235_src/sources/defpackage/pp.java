package defpackage;

import android.app.Application;
import android.app.Notification;
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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pp  reason: default package */
/* loaded from: classes.dex */
public abstract class pp {
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

    public static PrecomputedText.Params q(qs qsVar) {
        return qsVar.getTextMetricsParams();
    }

    public static int r(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri s(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static boolean t(Handler handler, dj0 dj0Var, long j) {
        return handler.postDelayed(dj0Var, "retry_token", j);
    }

    public static void u(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void v(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static boolean w(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
