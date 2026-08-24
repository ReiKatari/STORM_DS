package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rp  reason: default package */
/* loaded from: classes.dex */
public abstract class rp {
    public static void a(int r0, java.lang.String r1) {
            android.os.Trace.beginAsyncSection(r1, r0)
            return
    }

    public static void b(int r0, java.lang.String r1) {
            android.os.Trace.endAsyncSection(r1, r0)
            return
    }

    public static android.view.contentcapture.ContentCaptureSession c(android.view.View r0) {
            android.view.contentcapture.ContentCaptureSession r0 = r0.getContentCaptureSession()
            return r0
    }

    public static java.lang.String d(android.content.Context r0) {
            java.lang.String r0 = r0.getOpPackageName()
            return r0
    }

    public static int e(android.view.accessibility.AccessibilityManager r0, int r1, int r2) {
            int r0 = r0.getRecommendedTimeoutMillis(r1, r2)
            return r0
    }

    public static boolean f() {
            boolean r0 = android.os.Trace.isEnabled()
            return r0
    }

    public static boolean g() {
            boolean r0 = android.os.Trace.isEnabled()
            return r0
    }

    public static android.view.autofill.AutofillId h(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, long r2) {
            android.view.autofill.AutofillId r0 = r0.newAutofillId(r1, r2)
            return r0
    }

    public static android.view.ViewStructure i(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, long r2) {
            android.view.ViewStructure r0 = r0.newVirtualViewStructure(r1, r2)
            return r0
    }

    public static void j(android.view.contentcapture.ContentCaptureSession r0, android.view.ViewStructure r1) {
            r0.notifyViewAppeared(r1)
            return
    }

    public static void k(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1) {
            r0.notifyViewDisappeared(r1)
            return
    }

    public static void l(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, java.lang.String r2) {
            r0.notifyViewTextChanged(r1, r2)
            return
    }

    public static void m(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, long[] r2) {
            r0.notifyViewsDisappeared(r1, r2)
            return
    }

    public static android.graphics.Insets n(int r0, int r1, int r2, int r3) {
            android.graphics.Insets r0 = android.graphics.Insets.of(r0, r1, r2, r3)
            return r0
    }

    public static void o(android.content.res.Resources.Theme r0) {
            r0.rebase()
            return
    }

    public static final void p(android.app.Activity r0, defpackage.g35.a r1) {
            r0.registerActivityLifecycleCallbacks(r1)
            return
    }

    public static void q(android.app.Notification.Builder r0, boolean r1) {
            r0.setAllowSystemGeneratedContextualActions(r1)
            return
    }

    public static void r(android.app.Notification.Builder r1) {
            r0 = 0
            r1.setBubbleMetadata(r0)
            return
    }

    public static void s(android.app.Notification.Action.Builder r1) {
            r0 = 0
            r1.setContextual(r0)
            return
    }

    public static void t(int r2, java.lang.String r3) {
            long r0 = (long) r2
            android.os.Trace.setCounter(r3, r0)
            return
    }

    public static void u(androidx.work.impl.foreground.SystemForegroundService r0, int r1, android.app.Notification r2, int r3) {
            r0.startForeground(r1, r2, r3)
            return
    }

    public static void v(me.magnum.melonds.translator.capture.ScreenCaptureService r2, android.app.Notification r3, int r4) {
            r0 = 8842(0x228a, float:1.239E-41)
            if (r4 == 0) goto Le
            r1 = -1
            if (r4 != r1) goto L8
            goto Le
        L8:
            r4 = r4 & 255(0xff, float:3.57E-43)
            r2.startForeground(r0, r3, r4)
            return
        Le:
            r2.startForeground(r0, r3, r4)
            return
    }

    public static void w(androidx.work.impl.foreground.SystemForegroundService r2, int r3, android.app.Notification r4, int r5) {
            java.lang.String r0 = "Unable to start foreground service"
            r1 = 5
            r2.startForeground(r3, r4, r5)     // Catch: java.lang.SecurityException -> L7 android.app.ForegroundServiceStartNotAllowedException -> L16
            return
        L7:
            r2 = move-exception
            ga0 r3 = defpackage.ga0.f()
            java.lang.String r4 = androidx.work.impl.foreground.SystemForegroundService.X
            int r3 = r3.b
            if (r3 > r1) goto L24
            android.util.Log.w(r4, r0, r2)
            goto L24
        L16:
            r2 = move-exception
            ga0 r3 = defpackage.ga0.f()
            java.lang.String r4 = androidx.work.impl.foreground.SystemForegroundService.X
            int r3 = r3.b
            if (r3 > r1) goto L24
            android.util.Log.w(r4, r0, r2)
        L24:
            return
    }

    public static void x(me.magnum.melonds.translator.capture.ScreenCaptureService r2, android.app.Notification r3, int r4) {
            r0 = 8842(0x228a, float:1.239E-41)
            if (r4 == 0) goto L10
            r1 = -1
            if (r4 != r1) goto L8
            goto L10
        L8:
            r1 = 1073745919(0x40000fff, float:2.0009763)
            r4 = r4 & r1
            r2.startForeground(r0, r3, r4)
            return
        L10:
            r2.startForeground(r0, r3, r4)
            return
    }

    public static void y(android.view.ViewGroup r0, boolean r1) {
            r0.suppressLayout(r1)
            return
    }
}
