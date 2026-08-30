package defpackage;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o2  reason: default package */
/* loaded from: classes.dex */
public abstract class o2 {
    public static Context a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static Icon b(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static String c(Context context) {
        return context.getAttributionTag();
    }

    public static Display d(xp xpVar) {
        try {
            return xpVar.getDisplay();
        } catch (UnsupportedOperationException unused) {
            Log.w("ContextCompat", "The context:" + xpVar + " is not associated with any display. Return a fallback display instead.");
            return ((DisplayManager) xpVar.getSystemService(DisplayManager.class)).getDisplay(0);
        }
    }

    public static void e(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static CharSequence f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static Insets g(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void h(Window window, boolean z) {
        int i;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility & (-257);
        } else {
            i = systemUiVisibility | 256;
        }
        decorView.setSystemUiVisibility(i);
        window.setDecorFitsSystemWindows(z);
    }

    public static void i(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void j(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void k(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void l(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
