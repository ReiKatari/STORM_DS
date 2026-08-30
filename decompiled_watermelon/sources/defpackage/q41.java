package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.text.LineBreakConfig;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.text.StaticLayout;
import android.view.inputmethod.EditorBoundsInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q41  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class q41 {
    public static /* bridge */ /* synthetic */ PackageManager.PackageInfoFlags b(long j) {
        return PackageManager.PackageInfoFlags.of(j);
    }

    public static /* synthetic */ LineBreakConfig.Builder c() {
        return new LineBreakConfig.Builder();
    }

    public static /* bridge */ /* synthetic */ LineBreakConfig.Builder d(LineBreakConfig.Builder builder, int i) {
        return builder.setLineBreakStyle(i);
    }

    public static /* bridge */ /* synthetic */ LineBreakConfig e(LineBreakConfig.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ CameraCharacteristics.Key f() {
        return CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
    }

    public static /* bridge */ /* synthetic */ DynamicRangeProfiles g(Object obj) {
        return (DynamicRangeProfiles) obj;
    }

    public static /* synthetic */ EditorBoundsInfo.Builder h() {
        return new EditorBoundsInfo.Builder();
    }

    public static /* bridge */ /* synthetic */ void l(StaticLayout.Builder builder, LineBreakConfig lineBreakConfig) {
        builder.setLineBreakConfig(lineBreakConfig);
    }

    public static /* bridge */ /* synthetic */ void m(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(i, onBackInvokedCallback);
    }

    public static /* bridge */ /* synthetic */ void o(OnBackInvokedDispatcher onBackInvokedDispatcher, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }

    public static /* bridge */ /* synthetic */ boolean p(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static /* bridge */ /* synthetic */ PackageInfo q(PackageManager packageManager, String str, PackageManager.PackageInfoFlags packageInfoFlags) {
        return packageManager.getPackageInfo(str, packageInfoFlags);
    }

    public static /* bridge */ /* synthetic */ LineBreakConfig.Builder r(LineBreakConfig.Builder builder, int i) {
        return builder.setLineBreakWordStyle(i);
    }
}
