package defpackage;

import android.animation.ValueAnimator;
import android.hardware.camera2.params.OutputConfiguration;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m2 {
    public static /* bridge */ /* synthetic */ void B(OutputConfiguration outputConfiguration, long j) {
        outputConfiguration.setStreamUseCase(j);
    }

    public static /* bridge */ /* synthetic */ BoringLayout.Metrics e(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static /* synthetic */ BoringLayout f(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, RecyclerView.A1, metrics, z, truncateAt, i2, true);
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback l(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher p(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ void r(OutputConfiguration outputConfiguration, int i) {
        outputConfiguration.setMirrorMode(i);
    }

    public static /* bridge */ /* synthetic */ void s(OutputConfiguration outputConfiguration, long j) {
        outputConfiguration.setDynamicRangeProfile(j);
    }

    public static /* bridge */ /* synthetic */ boolean x(ao aoVar) {
        return ValueAnimator.unregisterDurationScaleChangeListener(aoVar);
    }

    public static /* bridge */ /* synthetic */ boolean y(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }
}
