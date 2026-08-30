package a6;

import android.content.Context;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g0 {
    public static Context a(Context context, int i2) {
        return context.createDeviceContext(i2);
    }

    public static AccessibilityNodeInfo.AccessibilityAction b() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float c(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.getAxisVelocity(i2);
    }

    public static void d(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int f(Context context) {
        return context.getDeviceId();
    }

    public static int g(Context context) {
        return context.getDeviceId();
    }

    public static int h(ViewConfiguration viewConfiguration, int i2, int i10, int i11) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i2, i10, i11);
    }

    public static int i(ViewConfiguration viewConfiguration, int i2, int i10, int i11) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i2, i10, i11);
    }

    public static boolean j(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean k(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static void l(AccessibilityEvent accessibilityEvent, boolean z10) {
        accessibilityEvent.setAccessibilityDataSensitive(z10);
    }

    public static void m(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
    }

    public static void n(TextView textView, int i2, float f8) {
        textView.setLineHeight(i2, f8);
    }
}
