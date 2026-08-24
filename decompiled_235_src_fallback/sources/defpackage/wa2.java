package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wa2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class wa2 {
    public static /* bridge */ /* synthetic */ java.lang.Class A() {
            java.lang.Class<java.time.LocalTime> r0 = java.time.LocalTime.class
            return r0
    }

    public static /* bridge */ /* synthetic */ java.time.Instant B() {
            java.time.Instant r0 = java.time.Instant.now()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class C() {
            java.lang.Class<java.time.ZoneOffset> r0 = java.time.ZoneOffset.class
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class D() {
            java.lang.Class<java.time.ZoneId> r0 = java.time.ZoneId.class
            return r0
    }

    public static /* bridge */ /* synthetic */ int a(java.time.Duration r0) {
            int r0 = r0.getNano()
            return r0
    }

    public static /* bridge */ /* synthetic */ int b(java.time.Year r0) {
            int r0 = r0.getValue()
            return r0
    }

    public static /* bridge */ /* synthetic */ long c(java.nio.file.attribute.FileTime r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r2.to(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ long d(java.time.Duration r2) {
            long r0 = r2.getSeconds()
            return r0
    }

    public static /* bridge */ /* synthetic */ long e(java.time.Instant r2) {
            long r0 = r2.getEpochSecond()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.app.NotificationChannel f(android.app.NotificationManager r1) {
            java.lang.String r0 = "com.google.android.gms.availability"
            android.app.NotificationChannel r1 = r1.getNotificationChannel(r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ android.app.NotificationChannel g(android.app.NotificationManager r0, java.lang.String r1) {
            android.app.NotificationChannel r0 = r0.getNotificationChannel(r1)
            return r0
    }

    public static /* synthetic */ android.app.NotificationChannel h(java.lang.String r3) {
            android.app.NotificationChannel r0 = new android.app.NotificationChannel
            java.lang.String r1 = "com.google.android.gms.availability"
            r2 = 4
            r0.<init>(r1, r3, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.CaptureRequest.Key i() {
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_ENABLE_ZSL
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.autofill.AutofillValue j(java.lang.CharSequence r0) {
            android.view.autofill.AutofillValue r0 = android.view.autofill.AutofillValue.forText(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.CharSequence k(android.app.NotificationChannel r0) {
            java.lang.CharSequence r0 = r0.getName()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class l() {
            java.lang.Class<java.time.LocalDate> r0 = java.time.LocalDate.class
            return r0
    }

    public static /* bridge */ /* synthetic */ java.nio.file.attribute.FileTime m(long r0) {
            java.nio.file.attribute.FileTime r0 = java.nio.file.attribute.FileTime.fromMillis(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.nio.file.attribute.FileTime n(java.time.Instant r0) {
            java.nio.file.attribute.FileTime r0 = java.nio.file.attribute.FileTime.from(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.time.Duration o(long r0, long r2) {
            java.time.Duration r0 = java.time.Duration.ofSeconds(r0, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.time.Duration p(java.lang.Object r0) {
            java.time.Duration r0 = (java.time.Duration) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ java.time.Instant q() {
            java.time.Instant r0 = java.time.Instant.EPOCH
            return r0
    }

    public static /* bridge */ /* synthetic */ java.time.Instant r(long r0, long r2) {
            java.time.Instant r0 = java.time.Instant.ofEpochSecond(r0, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.time.Year s(int r0) {
            java.time.Year r0 = java.time.Year.of(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.time.Year t(java.lang.Object r0) {
            java.time.Year r0 = (java.time.Year) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ void u() {
            java.time.Instant r0 = java.time.Instant.EPOCH
            java.nio.file.attribute.FileTime.from(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void v(android.app.NotificationChannel r0, java.lang.String r1) {
            r0.setName(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void w(android.app.NotificationManager r0, android.app.NotificationChannel r1) {
            r0.createNotificationChannel(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void x(android.view.Window r0, android.graphics.Rect r1, android.graphics.Bitmap r2, defpackage.bq2 r3, android.os.Handler r4) {
            android.view.PixelCopy.request(r0, r1, r2, r3, r4)
            return
    }

    public static /* bridge */ /* synthetic */ boolean y(android.content.pm.PackageManager r0) {
            boolean r0 = r0.isInstantApp()
            return r0
    }

    public static /* bridge */ /* synthetic */ long z(java.nio.file.attribute.FileTime r2) {
            long r0 = r2.toMillis()
            return r0
    }
}
