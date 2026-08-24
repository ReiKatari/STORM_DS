package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o05  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o05 {
    public static /* bridge */ /* synthetic */ int a(android.graphics.Typeface r0) {
            int r0 = r0.getWeight()
            return r0
    }

    public static /* synthetic */ android.text.PrecomputedText.Params.Builder b(android.text.TextPaint r1) {
            android.text.PrecomputedText$Params$Builder r0 = new android.text.PrecomputedText$Params$Builder
            r0.<init>(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.DisplayCutout c(android.view.WindowInsets r0) {
            android.view.DisplayCutout r0 = r0.getDisplayCutout()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsets d(android.view.WindowInsets r0) {
            android.view.WindowInsets r0 = r0.consumeDisplayCutout()
            return r0
    }

    public static /* synthetic */ android.view.textclassifier.TextClassificationContext.Builder e(java.lang.String r1, java.lang.String r2) {
            android.view.textclassifier.TextClassificationContext$Builder r0 = new android.view.textclassifier.TextClassificationContext$Builder
            r0.<init>(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextClassificationContext f(android.view.textclassifier.TextClassificationContext.Builder r0) {
            android.view.textclassifier.TextClassificationContext r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextClassifier g(android.view.textclassifier.TextClassificationManager r0, android.view.textclassifier.TextClassificationContext r1) {
            android.view.textclassifier.TextClassifier r0 = r0.createTextClassificationSession(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String h() {
            java.lang.String r0 = android.app.Application.getProcessName()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.List i(android.view.textclassifier.TextClassification r0) {
            java.util.List r0 = r0.getActions()
            return r0
    }

    public static /* synthetic */ void j() {
            android.view.textclassifier.TextClassificationContext$Builder r0 = new android.view.textclassifier.TextClassificationContext$Builder
            return
    }

    public static /* bridge */ /* synthetic */ void k(android.app.job.JobInfo.Builder r1) {
            r0 = 1
            r1.setImportantWhileForeground(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void l(android.app.job.JobInfo.Builder r0, android.net.NetworkRequest r1) {
            r0.setRequiredNetwork(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void m(android.text.PrecomputedText.Params.Builder r0) {
            r0.build()
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.text.StaticLayout.Builder r1) {
            r0 = 1
            r1.setUseLineSpacingFromFallbacks(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void o(android.view.View r1) {
            r0 = 1
            r1.setAccessibilityHeading(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.view.View r0, int r1) {
            r0.setOutlineSpotShadowColor(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean q(android.app.RemoteAction r0) {
            boolean r0 = r0.shouldShowIcon()
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean r(java.lang.CharSequence r0) {
            boolean r0 = r0 instanceof android.text.PrecomputedText
            return r0
    }

    public static /* bridge */ /* synthetic */ void s(android.app.job.JobInfo.Builder r0, android.net.NetworkRequest r1) {
            r0.setRequiredNetwork(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void t(android.view.View r0) {
            r0.resetPivot()
            return
    }

    public static /* bridge */ /* synthetic */ void u(android.view.View r0, int r1) {
            r0.setOutlineAmbientShadowColor(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean v(android.app.RemoteAction r0) {
            boolean r0 = r0.shouldShowIcon()
            return r0
    }
}
