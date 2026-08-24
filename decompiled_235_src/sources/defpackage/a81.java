package defpackage;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.text.LineBreakConfig;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.text.StaticLayout;
import android.view.inputmethod.EditorBoundsInfo;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a81  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a81 {
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

    public static /* bridge */ /* synthetic */ Object l(Intent intent) {
        return intent.getParcelableExtra("extra_data_intent", Intent.class);
    }

    public static /* bridge */ /* synthetic */ void n(StaticLayout.Builder builder, LineBreakConfig lineBreakConfig) {
        builder.setLineBreakConfig(lineBreakConfig);
    }

    public static /* bridge */ /* synthetic */ boolean r(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static /* bridge */ /* synthetic */ PackageInfo s(PackageManager packageManager, String str, PackageManager.PackageInfoFlags packageInfoFlags) {
        return packageManager.getPackageInfo(str, packageInfoFlags);
    }

    public static /* bridge */ /* synthetic */ LineBreakConfig.Builder t(LineBreakConfig.Builder builder, int i) {
        return builder.setLineBreakWordStyle(i);
    }
}
