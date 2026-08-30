package b6;

import android.animation.ValueAnimator;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ boolean A(l6.a aVar) {
        return ValueAnimator.unregisterDurationScaleChangeListener(aVar);
    }

    public static /* bridge */ /* synthetic */ boolean D(l6.a aVar) {
        return ValueAnimator.registerDurationScaleChangeListener(aVar);
    }

    public static /* bridge */ /* synthetic */ float a() {
        return ValueAnimator.getDurationScale();
    }

    public static /* bridge */ /* synthetic */ PackageInfo d(PackageManager packageManager, String str, PackageManager.PackageInfoFlags packageInfoFlags) {
        return packageManager.getPackageInfo(str, packageInfoFlags);
    }

    public static /* bridge */ /* synthetic */ PackageManager.PackageInfoFlags e(long j2) {
        return PackageManager.PackageInfoFlags.of(j2);
    }

    public static /* synthetic */ LineBreakConfig.Builder f() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout h(CharSequence charSequence, TextPaint textPaint, int i2, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z10, TextUtils.TruncateAt truncateAt, int i10) {
        return new BoringLayout(charSequence, textPaint, i2, alignment, 1.0f, 0.0f, metrics, z10, truncateAt, i10, true);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction j() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
    }

    public static /* synthetic */ EditorBoundsInfo.Builder l() {
        return new EditorBoundsInfo.Builder();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback o(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher q(d.k kVar) {
        return kVar.getOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher r(d.m mVar) {
        return mVar.getOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher s(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ void v(OnBackInvokedDispatcher onBackInvokedDispatcher, int i2, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(i2, onBackInvokedCallback);
    }

    public static /* bridge */ /* synthetic */ void x(OnBackInvokedDispatcher onBackInvokedDispatcher, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }

    public static /* bridge */ /* synthetic */ boolean y(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static /* bridge */ /* synthetic */ boolean z(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }
}
