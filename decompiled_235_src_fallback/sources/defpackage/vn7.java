package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vn7  reason: default package */
/* loaded from: classes.dex */
public abstract class vn7 {
    public static java.lang.CharSequence a(android.view.View r0) {
            java.lang.CharSequence r0 = r0.getAccessibilityPaneTitle()
            return r0
    }

    public static boolean b(android.view.View r0) {
            boolean r0 = r0.isAccessibilityHeading()
            return r0
    }

    public static boolean c(android.view.View r0) {
            boolean r0 = r0.isScreenReaderFocusable()
            return r0
    }

    public static void d(android.view.View r0, boolean r1) {
            r0.setAccessibilityHeading(r1)
            return
    }

    public static void e(android.view.View r0, java.lang.CharSequence r1) {
            r0.setAccessibilityPaneTitle(r1)
            return
    }

    public static void f(android.view.View r0, boolean r1) {
            r0.setScreenReaderFocusable(r1)
            return
    }
}
