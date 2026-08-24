package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c2  reason: default package */
/* loaded from: classes.dex */
public abstract class c2 {
    public static android.content.Context a(android.content.Context r0, int r1) {
            android.content.Context r0 = r0.createDeviceContext(r1)
            return r0
    }

    public static android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction b() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION
            return r0
    }

    public static float c(android.view.VelocityTracker r0, int r1) {
            float r0 = r0.getAxisVelocity(r1)
            return r0
    }

    public static void d(android.view.accessibility.AccessibilityNodeInfo r0, android.graphics.Rect r1) {
            r0.getBoundsInWindow(r1)
            return
    }

    public static java.lang.CharSequence e(android.view.accessibility.AccessibilityNodeInfo r0) {
            java.lang.CharSequence r0 = r0.getContainerTitle()
            return r0
    }

    public static int f(android.content.Context r0) {
            int r0 = r0.getDeviceId()
            return r0
    }

    public static int g(android.view.ViewConfiguration r0, int r1, int r2, int r3) {
            int r0 = r0.getScaledMaximumFlingVelocity(r1, r2, r3)
            return r0
    }

    public static int h(android.view.ViewConfiguration r0, int r1, int r2, int r3) {
            int r0 = r0.getScaledMinimumFlingVelocity(r1, r2, r3)
            return r0
    }

    public static boolean i(android.view.accessibility.AccessibilityNodeInfo r0) {
            boolean r0 = r0.isAccessibilityDataSensitive()
            return r0
    }

    public static boolean j(android.view.accessibility.AccessibilityManager r0) {
            boolean r0 = r0.isRequestFromAccessibilityTool()
            return r0
    }

    public static void k(android.view.accessibility.AccessibilityEvent r0, boolean r1) {
            r0.setAccessibilityDataSensitive(r1)
            return
    }

    public static void l(android.view.accessibility.AccessibilityNodeInfo r0, boolean r1) {
            r0.setAccessibilityDataSensitive(r1)
            return
    }

    public static void m(android.widget.TextView r0, int r1, float r2) {
            r0.setLineHeight(r1, r2)
            return
    }
}
