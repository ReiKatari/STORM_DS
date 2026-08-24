package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q2  reason: default package */
/* loaded from: classes.dex */
public abstract class q2 {
    public static android.content.Context a(android.content.Context r0, java.lang.String r1) {
            android.content.Context r0 = r0.createAttributionContext(r1)
            return r0
    }

    public static android.graphics.drawable.Icon b(android.net.Uri r0) {
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(r0)
            return r0
    }

    public static java.lang.String c(android.content.Context r0) {
            java.lang.String r0 = r0.getAttributionTag()
            return r0
    }

    public static android.view.Display d(defpackage.jq r2) {
            android.view.Display r2 = r2.getDisplay()     // Catch: java.lang.UnsupportedOperationException -> L5
            return r2
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The context:"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " is not associated with any display. Return a fallback display instead."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ContextCompat"
            android.util.Log.w(r1, r0)
            java.lang.Class<android.hardware.display.DisplayManager> r0 = android.hardware.display.DisplayManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2
            r0 = 0
            android.view.Display r2 = r2.getDisplay(r0)
            return r2
    }

    public static void e(int r0) {
            android.os.ext.SdkExtensions.getExtensionVersion(r0)
            return
    }

    public static java.lang.CharSequence f(android.view.accessibility.AccessibilityNodeInfo r0) {
            java.lang.CharSequence r0 = r0.getStateDescription()
            return r0
    }

    public static android.graphics.Insets g(android.view.DisplayCutout r0) {
            android.graphics.Insets r0 = r0.getWaterfallInsets()
            return r0
    }

    public static void h(android.view.Window r2, boolean r3) {
            android.view.View r0 = r2.getDecorView()
            int r1 = r0.getSystemUiVisibility()
            if (r3 == 0) goto Ld
            r1 = r1 & (-257(0xfffffffffffffeff, float:NaN))
            goto Lf
        Ld:
            r1 = r1 | 256(0x100, float:3.59E-43)
        Lf:
            r0.setSystemUiVisibility(r1)
            r2.setDecorFitsSystemWindows(r3)
            return
    }

    public static void i(android.view.Window r0, boolean r1) {
            r0.setDecorFitsSystemWindows(r1)
            return
    }

    public static void j(android.view.View r1) {
            r0 = 1
            r1.setImportantForContentCapture(r0)
            return
    }

    public static void k(android.view.inputmethod.EditorInfo r1, java.lang.CharSequence r2) {
            r0 = 0
            r1.setInitialSurroundingSubText(r2, r0)
            return
    }

    public static void l(android.view.accessibility.AccessibilityNodeInfo r0, java.lang.CharSequence r1) {
            r0.setStateDescription(r1)
            return
    }
}
