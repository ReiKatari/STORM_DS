package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yr1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class yr1 {
    public static /* bridge */ /* synthetic */ int A(android.text.PrecomputedText.Params r0) {
            int r0 = r0.getHyphenationFrequency()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.text.PrecomputedText.Params.Builder B(android.text.PrecomputedText.Params.Builder r0, int r1) {
            android.text.PrecomputedText$Params$Builder r0 = r0.setHyphenationFrequency(r1)
            return r0
    }

    public static /* synthetic */ void C() {
            android.view.textclassifier.TextSelection$Request$Builder r0 = new android.view.textclassifier.TextSelection$Request$Builder
            return
    }

    public static /* bridge */ /* synthetic */ boolean D(android.net.NetworkRequest r0, int r1) {
            boolean r0 = r0.hasCapability(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ int a(android.text.PrecomputedText.Params r0) {
            int r0 = r0.getBreakStrategy()
            return r0
    }

    public static /* bridge */ /* synthetic */ long b(android.content.pm.PackageInfo r2) {
            long r0 = r2.getLongVersionCode()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.pm.SigningInfo c(android.content.pm.PackageInfo r0) {
            android.content.pm.SigningInfo r0 = r0.signingInfo
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Bitmap d(android.graphics.ImageDecoder.Source r0, defpackage.g23 r1) {
            android.graphics.Bitmap r0 = android.graphics.ImageDecoder.decodeBitmap(r0, r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.ImageDecoder.Source e(android.content.ContentResolver r0, android.net.Uri r1) {
            android.graphics.ImageDecoder$Source r0 = android.graphics.ImageDecoder.createSource(r0, r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Typeface f(android.graphics.Typeface r0, int r1, boolean r2) {
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.text.PrecomputedText.Params.Builder g(android.text.PrecomputedText.Params.Builder r0, int r1) {
            android.text.PrecomputedText$Params$Builder r0 = r0.setBreakStrategy(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.text.PrecomputedText.Params.Builder h(android.text.PrecomputedText.Params.Builder r0, android.text.TextDirectionHeuristic r1) {
            android.text.PrecomputedText$Params$Builder r0 = r0.setTextDirection(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.text.TextDirectionHeuristic i(android.text.PrecomputedText.Params r0) {
            android.text.TextDirectionHeuristic r0 = r0.getTextDirection()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.text.TextPaint j(android.text.PrecomputedText.Params r0) {
            android.text.TextPaint r0 = r0.getTextPaint()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.util.Size k(android.graphics.ImageDecoder.ImageInfo r0) {
            android.util.Size r0 = r0.getSize()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextClassification.Request.Builder l(android.view.textclassifier.TextClassification.Request.Builder r0, android.os.LocaleList r1) {
            android.view.textclassifier.TextClassification$Request$Builder r0 = r0.setDefaultLocales(r1)
            return r0
    }

    public static /* synthetic */ android.view.textclassifier.TextClassification.Request.Builder m(java.lang.CharSequence r1, int r2, int r3) {
            android.view.textclassifier.TextClassification$Request$Builder r0 = new android.view.textclassifier.TextClassification$Request$Builder
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextClassification.Request n(android.view.textclassifier.TextClassification.Request.Builder r0) {
            android.view.textclassifier.TextClassification$Request r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextClassification o(android.view.textclassifier.TextClassifier r0, android.view.textclassifier.TextClassification.Request r1) {
            android.view.textclassifier.TextClassification r0 = r0.classifyText(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextSelection.Request.Builder p(android.view.textclassifier.TextSelection.Request.Builder r0, android.os.LocaleList r1) {
            android.view.textclassifier.TextSelection$Request$Builder r0 = r0.setDefaultLocales(r1)
            return r0
    }

    public static /* synthetic */ android.view.textclassifier.TextSelection.Request.Builder q(java.lang.CharSequence r1, int r2, int r3) {
            android.view.textclassifier.TextSelection$Request$Builder r0 = new android.view.textclassifier.TextSelection$Request$Builder
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextSelection.Request r(android.view.textclassifier.TextSelection.Request.Builder r0) {
            android.view.textclassifier.TextSelection$Request r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextSelection s(android.view.textclassifier.TextClassifier r0, android.view.textclassifier.TextSelection.Request r1) {
            android.view.textclassifier.TextSelection r0 = r0.suggestSelection(r1)
            return r0
    }

    public static /* synthetic */ void t() {
            android.view.textclassifier.TextClassification$Request$Builder r0 = new android.view.textclassifier.TextClassification$Request$Builder
            return
    }

    public static /* bridge */ /* synthetic */ void u(android.graphics.ImageDecoder r0, int r1, int r2) {
            r0.setTargetSize(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void v(android.graphics.ImageDecoder r0, android.graphics.Rect r1) {
            r0.setCrop(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void w(android.view.WindowManager.LayoutParams r1) {
            r0 = 3
            r1.layoutInDisplayCutoutMode = r0
            return
    }

    public static /* bridge */ /* synthetic */ boolean x(android.net.NetworkRequest r0, int r1) {
            boolean r0 = r0.hasTransport(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean y(android.view.textclassifier.TextClassifier r0) {
            boolean r0 = r0.isDestroyed()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.pm.Signature[] z(android.content.pm.SigningInfo r0) {
            android.content.pm.Signature[] r0 = r0.getSigningCertificateHistory()
            return r0
    }
}
