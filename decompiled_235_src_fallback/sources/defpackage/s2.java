package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s2  reason: default package */
/* loaded from: classes.dex */
public abstract class s2 {
    public static int a(android.view.accessibility.AccessibilityNodeInfo r0) {
            int r0 = r0.getChecked()
            return r0
    }

    public static int b(android.view.accessibility.AccessibilityNodeInfo r0) {
            int r0 = r0.getExpandedState()
            return r0
    }

    public static java.lang.CharSequence c(android.view.accessibility.AccessibilityNodeInfo r0) {
            java.lang.CharSequence r0 = r0.getSupplementalDescription()
            return r0
    }

    public static boolean d(android.view.accessibility.AccessibilityNodeInfo r0) {
            boolean r0 = r0.isFieldRequired()
            return r0
    }

    public static void e(android.app.Notification.Builder r1) {
            r0 = 0
            r1.setShortCriticalText(r0)
            return
    }
}
