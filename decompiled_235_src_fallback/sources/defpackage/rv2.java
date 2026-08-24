package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rv2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class rv2 {
    public static /* bridge */ /* synthetic */ float a(android.window.BackEvent r0) {
            float r0 = r0.getTouchX()
            return r0
    }

    public static /* bridge */ /* synthetic */ int b() {
            int r0 = android.view.WindowInsets.Type.systemOverlays()
            return r0
    }

    public static /* bridge */ /* synthetic */ int c(android.window.BackEvent r0) {
            int r0 = r0.getSwipeEdge()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.app.ActivityOptions d(android.app.ActivityOptions r1) {
            r0 = 1
            android.app.ActivityOptions r1 = r1.setPendingIntentBackgroundActivityStartMode(r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ android.app.job.JobScheduler e(android.app.job.JobScheduler r1) {
            java.lang.String r0 = "androidx.work.systemjobscheduler"
            android.app.job.JobScheduler r1 = r1.forNamespace(r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ android.content.Intent f(android.media.projection.MediaProjectionManager r0, android.media.projection.MediaProjectionConfig r1) {
            android.content.Intent r0 = r0.createScreenCaptureIntent(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RectF g(android.view.inputmethod.SelectRangeGesture r0) {
            android.graphics.RectF r0 = r0.getSelectionStartArea()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.media.projection.MediaProjectionConfig h() {
            android.media.projection.MediaProjectionConfig r0 = android.media.projection.MediaProjectionConfig.createConfigForDefaultDisplay()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.DeleteRangeGesture i(java.lang.Object r0) {
            android.view.inputmethod.DeleteRangeGesture r0 = (android.view.inputmethod.DeleteRangeGesture) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.SelectRangeGesture j(java.lang.Object r0) {
            android.view.inputmethod.SelectRangeGesture r0 = (android.view.inputmethod.SelectRangeGesture) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ void k(android.app.ActivityOptions r0, int r1) {
            r0.setPendingIntentBackgroundActivityStartMode(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void l(android.app.PendingIntent r0, android.os.Bundle r1) {
            r0.send(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean m(java.lang.Object r0) {
            boolean r0 = r0 instanceof android.view.inputmethod.SelectRangeGesture
            return r0
    }

    public static /* bridge */ /* synthetic */ float n(android.window.BackEvent r0) {
            float r0 = r0.getTouchY()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RectF o(android.view.inputmethod.SelectRangeGesture r0) {
            android.graphics.RectF r0 = r0.getSelectionEndArea()
            return r0
    }

    public static /* bridge */ /* synthetic */ void p(android.app.ActivityOptions r0, int r1) {
            r0.setPendingIntentCreatorBackgroundActivityStartMode(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean q(java.lang.Object r0) {
            boolean r0 = r0 instanceof android.view.inputmethod.DeleteRangeGesture
            return r0
    }

    public static /* bridge */ /* synthetic */ float r(android.window.BackEvent r0) {
            float r0 = r0.getProgress()
            return r0
    }
}
