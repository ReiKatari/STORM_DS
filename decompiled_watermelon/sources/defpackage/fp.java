package defpackage;

import android.app.Activity;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.work.impl.foreground.SystemForegroundService;
import defpackage.cu4;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fp  reason: default package */
/* loaded from: classes.dex */
public abstract class fp {
    public static void a(int i, String str) {
        Trace.beginAsyncSection(str, i);
    }

    public static void b(int i, String str) {
        Trace.endAsyncSection(str, i);
    }

    public static ContentCaptureSession c(View view) {
        return view.getContentCaptureSession();
    }

    public static String d(Context context) {
        return context.getOpPackageName();
    }

    public static int e(AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }

    public static boolean f() {
        return Trace.isEnabled();
    }

    public static boolean g() {
        return Trace.isEnabled();
    }

    public static AutofillId h(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static ViewStructure i(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static void j(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void k(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static void l(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static void m(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static Insets n(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void o(Resources.Theme theme) {
        theme.rebase();
    }

    public static final void p(Activity activity, cu4.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }

    public static void q(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void r(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void s(int i, String str) {
        Trace.setCounter(str, i);
    }

    public static void t(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static void u(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            y70 f = y70.f();
            String str = SystemForegroundService.X;
            if (f.b <= 5) {
                Log.w(str, "Unable to start foreground service", e);
            }
        } catch (SecurityException e2) {
            y70 f2 = y70.f();
            String str2 = SystemForegroundService.X;
            if (f2.b <= 5) {
                Log.w(str2, "Unable to start foreground service", e2);
            }
        }
    }

    public static void v(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }
}
