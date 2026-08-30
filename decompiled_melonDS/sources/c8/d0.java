package c8;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.graphics.Insets;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.work.impl.foreground.SystemForegroundService;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d0 {
    public static ContentCaptureSession a(View view) {
        return view.getContentCaptureSession();
    }

    public static boolean b() {
        return Trace.isEnabled();
    }

    public static AutofillId c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j2) {
        return contentCaptureSession.newAutofillId(autofillId, j2);
    }

    public static ViewStructure d(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j2) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j2);
    }

    public static void e(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static void g(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static void h(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static Insets i(int i2, int i10, int i11, int i12) {
        return Insets.of(i2, i10, i11, i12);
    }

    public static void j(SystemForegroundService systemForegroundService, int i2, Notification notification, int i10) {
        systemForegroundService.startForeground(i2, notification, i10);
    }

    public static void k(SystemForegroundService systemForegroundService, int i2, Notification notification, int i10) {
        try {
            systemForegroundService.startForeground(i2, notification, i10);
        } catch (ForegroundServiceStartNotAllowedException e6) {
            p8.v e10 = p8.v.e();
            String str = SystemForegroundService.X;
            if (e10.f11509a <= 5) {
                Log.w(str, "Unable to start foreground service", e6);
            }
        } catch (SecurityException e11) {
            p8.v e12 = p8.v.e();
            String str2 = SystemForegroundService.X;
            if (e12.f11509a <= 5) {
                Log.w(str2, "Unable to start foreground service", e11);
            }
        }
    }

    public static void l(ViewGroup viewGroup, boolean z10) {
        viewGroup.suppressLayout(z10);
    }
}
