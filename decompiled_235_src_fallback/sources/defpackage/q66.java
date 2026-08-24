package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q66  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class q66 {
    public static /* bridge */ /* synthetic */ android.graphics.drawable.Icon A(android.app.RemoteAction r0) {
            android.graphics.drawable.Icon r0 = r0.getIcon()
            return r0
    }

    public static /* bridge */ /* synthetic */ void B() {
            java.nio.file.StandardOpenOption r0 = java.nio.file.StandardOpenOption.READ
            return
    }

    public static /* bridge */ /* synthetic */ void C(android.app.job.JobInfo.Builder r0, boolean r1) {
            r0.setRequiresStorageNotLow(r1)
            return
    }

    public static /* bridge */ /* synthetic */ int a(android.view.textclassifier.TextClassification r0) {
            int r0 = r0.hashCode()
            return r0
    }

    public static /* synthetic */ android.app.NotificationChannel b() {
            android.app.NotificationChannel r0 = new android.app.NotificationChannel
            java.lang.String r1 = "storm_ds_screen_capture"
            java.lang.String r2 = "STORM DS Screen Translator"
            r3 = 2
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.app.PendingIntent c(android.app.RemoteAction r0) {
            android.app.PendingIntent r0 = r0.getActionIntent()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.app.RemoteAction d(java.lang.Object r0) {
            android.app.RemoteAction r0 = (android.app.RemoteAction) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.Intent e(android.content.Context r0, com.google.android.gms.common.api.internal.zabx r1, android.content.IntentFilter r2, int r3) {
            android.content.Intent r0 = r0.registerReceiver(r1, r2, r3)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.Intent f(android.content.pm.ShortcutManager r0, android.content.pm.ShortcutInfo r1) {
            android.content.Intent r0 = r0.createShortcutResultIntent(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.Intent g(android.view.textclassifier.TextClassification r0) {
            android.content.Intent r0 = r0.getIntent()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.drawable.Drawable h(android.view.textclassifier.TextClassification r0) {
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.drawable.Icon i(android.app.RemoteAction r0) {
            android.graphics.drawable.Icon r0 = r0.getIcon()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.View.OnClickListener j(android.view.textclassifier.TextClassification r0) {
            android.view.View$OnClickListener r0 = r0.getOnClickListener()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextClassificationManager k(java.lang.Object r0) {
            android.view.textclassifier.TextClassificationManager r0 = (android.view.textclassifier.TextClassificationManager) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.CharSequence l(android.app.RemoteAction r0) {
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.CharSequence m(android.view.textclassifier.TextClassification r0) {
            java.lang.CharSequence r0 = r0.getLabel()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class n() {
            java.lang.Class<android.view.textclassifier.TextClassificationManager> r0 = android.view.textclassifier.TextClassificationManager.class
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String o(android.view.textclassifier.TextClassification r0) {
            java.lang.String r0 = r0.getText()
            return r0
    }

    public static /* synthetic */ void p() {
            android.app.NotificationChannel r0 = new android.app.NotificationChannel
            return
    }

    public static /* bridge */ /* synthetic */ void q(android.animation.AnimatorSet r0, long r1) {
            r0.setCurrentPlayTime(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void r(android.app.job.JobInfo.Builder r0, boolean r1) {
            r0.setRequiresBatteryNotLow(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void s(android.content.Context r0, android.content.Intent r1) {
            r0.startForegroundService(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void t(android.graphics.Paint r1) {
            r0 = 0
            r1.setFontVariationSettings(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void u(android.graphics.Paint r0, java.lang.String r1) {
            r0.setFontVariationSettings(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void v(android.text.StaticLayout.Builder r0, int r1) {
            r0.setJustificationMode(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void w(android.text.TextPaint r0, java.lang.String r1) {
            r0.setFontVariationSettings(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void x(android.view.ViewParent r0, android.view.View r1, android.view.View r2) {
            r0.onDescendantInvalidated(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void y(com.google.android.material.textfield.TextInputLayout r1) {
            r0 = 1
            r1.setImportantForAutofill(r0)
            return
    }

    public static /* bridge */ /* synthetic */ android.app.PendingIntent z(android.app.RemoteAction r0) {
            android.app.PendingIntent r0 = r0.getActionIntent()
            return r0
    }
}
