package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a81  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a81 {
    public static /* bridge */ /* synthetic */ android.content.pm.PackageInfo a(android.content.pm.PackageManager r0, java.lang.String r1, android.content.pm.PackageManager.PackageInfoFlags r2) {
            android.content.pm.PackageInfo r0 = r0.getPackageArchiveInfo(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.pm.PackageManager.PackageInfoFlags b(long r0) {
            android.content.pm.PackageManager$PackageInfoFlags r0 = android.content.pm.PackageManager.PackageInfoFlags.of(r0)
            return r0
    }

    public static /* synthetic */ android.graphics.text.LineBreakConfig.Builder c() {
            android.graphics.text.LineBreakConfig$Builder r0 = new android.graphics.text.LineBreakConfig$Builder
            r0.<init>()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.text.LineBreakConfig.Builder d(android.graphics.text.LineBreakConfig.Builder r0, int r1) {
            android.graphics.text.LineBreakConfig$Builder r0 = r0.setLineBreakStyle(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.text.LineBreakConfig e(android.graphics.text.LineBreakConfig.Builder r0) {
            android.graphics.text.LineBreakConfig r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.CameraCharacteristics.Key f() {
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES
            return r0
    }

    public static /* bridge */ /* synthetic */ android.hardware.camera2.params.DynamicRangeProfiles g(java.lang.Object r0) {
            android.hardware.camera2.params.DynamicRangeProfiles r0 = (android.hardware.camera2.params.DynamicRangeProfiles) r0
            return r0
    }

    public static /* synthetic */ android.view.inputmethod.EditorBoundsInfo.Builder h() {
            android.view.inputmethod.EditorBoundsInfo$Builder r0 = new android.view.inputmethod.EditorBoundsInfo$Builder
            r0.<init>()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.window.OnBackInvokedDispatcher i(defpackage.ac r0) {
            android.window.OnBackInvokedDispatcher r0 = r0.getOnBackInvokedDispatcher()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.window.OnBackInvokedDispatcher j(defpackage.z82 r0) {
            android.window.OnBackInvokedDispatcher r0 = r0.getOnBackInvokedDispatcher()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.window.OnBackInvokedDispatcher k(android.view.View r0) {
            android.window.OnBackInvokedDispatcher r0 = r0.findOnBackInvokedDispatcher()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object l(android.content.Intent r2) {
            java.lang.String r0 = "extra_data_intent"
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.Object r2 = r2.getParcelableExtra(r0, r1)
            return r2
    }

    public static /* bridge */ /* synthetic */ java.util.Set m(android.hardware.camera2.params.DynamicRangeProfiles r0) {
            java.util.Set r0 = r0.getSupportedProfiles()
            return r0
    }

    public static /* bridge */ /* synthetic */ void n(android.text.StaticLayout.Builder r0, android.graphics.text.LineBreakConfig r1) {
            r0.setLineBreakConfig(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void o(android.window.OnBackInvokedDispatcher r0, int r1, android.window.OnBackInvokedCallback r2) {
            r0.registerOnBackInvokedCallback(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.window.OnBackInvokedDispatcher r1, defpackage.vp r2) {
            r0 = 0
            r1.registerOnBackInvokedCallback(r0, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void q(android.window.OnBackInvokedDispatcher r0, android.window.OnBackInvokedCallback r1) {
            r0.unregisterOnBackInvokedCallback(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean r(android.text.StaticLayout r0) {
            boolean r0 = r0.isFallbackLineSpacingEnabled()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.pm.PackageInfo s(android.content.pm.PackageManager r0, java.lang.String r1, android.content.pm.PackageManager.PackageInfoFlags r2) {
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.text.LineBreakConfig.Builder t(android.graphics.text.LineBreakConfig.Builder r0, int r1) {
            android.graphics.text.LineBreakConfig$Builder r0 = r0.setLineBreakWordStyle(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ void u(android.window.OnBackInvokedDispatcher r1, android.window.OnBackInvokedCallback r2) {
            r0 = 0
            r1.registerOnBackInvokedCallback(r0, r2)
            return
    }
}
