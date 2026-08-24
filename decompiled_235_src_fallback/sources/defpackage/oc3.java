package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oc3  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class oc3 {
    public static /* bridge */ /* synthetic */ void A(android.view.autofill.AutofillManager r0, defpackage.te r1, int r2, android.graphics.Rect r3) {
            r0.notifyViewEntered(r1, r2, r3)
            return
    }

    public static /* bridge */ /* synthetic */ int B(java.time.Period r0) {
            int r0 = r0.getDays()
            return r0
    }

    public static /* bridge */ /* synthetic */ void C() {
            java.nio.file.StandardOpenOption r0 = java.nio.file.StandardOpenOption.APPEND
            return
    }

    public static /* bridge */ /* synthetic */ void D() {
            java.nio.file.LinkOption r0 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            return
    }

    public static /* bridge */ /* synthetic */ int a(android.view.textclassifier.TextSelection r0) {
            int r0 = r0.getSelectionStartIndex()
            return r0
    }

    public static /* bridge */ /* synthetic */ int b(java.time.Period r0) {
            int r0 = r0.getYears()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextClassification c(java.lang.Object r0) {
            android.view.textclassifier.TextClassification r0 = (android.view.textclassifier.TextClassification) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextClassifier d(java.lang.Object r0) {
            android.view.textclassifier.TextClassifier r0 = (android.view.textclassifier.TextClassifier) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextSelection e(java.lang.Object r0) {
            android.view.textclassifier.TextSelection r0 = (android.view.textclassifier.TextSelection) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String f(android.text.TextPaint r0) {
            java.lang.String r0 = r0.getFontVariationSettings()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String g(java.lang.reflect.Parameter r0) {
            java.lang.String r0 = r0.getName()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.nio.file.Path h(java.lang.String r0, java.lang.String[] r1) {
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.time.Period i(int r0, int r1, int r2) {
            java.time.Period r0 = java.time.Period.of(r0, r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.time.Period j(java.lang.Object r0) {
            java.time.Period r0 = (java.time.Period) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ java.time.ZoneOffset k(java.time.OffsetTime r0) {
            java.time.ZoneOffset r0 = r0.getOffset()
            return r0
    }

    public static /* bridge */ /* synthetic */ void l() {
            java.nio.file.StandardOpenOption r0 = java.nio.file.StandardOpenOption.CREATE
            return
    }

    public static /* bridge */ /* synthetic */ void m(android.app.NotificationChannel r1) {
            java.lang.String r0 = "Active screen translation service"
            r1.setDescription(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.app.NotificationManager r0, android.app.NotificationChannel r1) {
            r0.createNotificationChannel(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void o(android.view.autofill.AutofillManager r0) {
            r0.commit()
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.view.autofill.AutofillManager r0, defpackage.te r1, int r2) {
            r0.notifyViewExited(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void q(android.view.autofill.AutofillManager r0, defpackage.te r1, int r2, android.graphics.Rect r3) {
            r0.requestAutofill(r1, r2, r3)
            return
    }

    public static /* bridge */ /* synthetic */ void r(android.view.autofill.AutofillManager r0, defpackage.te r1, int r2, android.view.autofill.AutofillValue r3) {
            r0.notifyValueChanged(r1, r2, r3)
            return
    }

    public static /* bridge */ /* synthetic */ void s(java.lang.Object r0) {
            android.app.RemoteAction r0 = (android.app.RemoteAction) r0
            return
    }

    public static /* bridge */ /* synthetic */ boolean t(android.content.pm.PackageManager r0, java.lang.String r1) {
            boolean r0 = r0.isInstantApp(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean u(java.lang.reflect.Parameter r0) {
            boolean r0 = r0.isNamePresent()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.reflect.Parameter[] v(java.lang.reflect.Method r0) {
            java.lang.reflect.Parameter[] r0 = r0.getParameters()
            return r0
    }

    public static /* bridge */ /* synthetic */ int w(android.view.textclassifier.TextSelection r0) {
            int r0 = r0.getSelectionEndIndex()
            return r0
    }

    public static /* bridge */ /* synthetic */ int x(java.time.Period r0) {
            int r0 = r0.getMonths()
            return r0
    }

    public static /* bridge */ /* synthetic */ void y() {
            java.nio.file.StandardOpenOption r0 = java.nio.file.StandardOpenOption.TRUNCATE_EXISTING
            return
    }

    public static /* bridge */ /* synthetic */ void z(android.app.NotificationChannel r1) {
            r0 = 0
            r1.setShowBadge(r0)
            return
    }
}
