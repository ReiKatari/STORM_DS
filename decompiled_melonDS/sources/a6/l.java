package a6;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l {
    public static Context a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static Icon b(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static String c(Context context) {
        return context.getAttributionTag();
    }

    public static Display d(l.i iVar) {
        try {
            return iVar.getDisplay();
        } catch (UnsupportedOperationException unused) {
            Log.w("ContextCompat", "The context:" + iVar + " is not associated with any display. Return a fallback display instead.");
            return ((DisplayManager) iVar.getSystemService(DisplayManager.class)).getDisplay(0);
        }
    }

    public static CharSequence e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static Insets f(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void g(Window window, boolean z10) {
        int i2;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z10) {
            i2 = systemUiVisibility & (-257);
        } else {
            i2 = systemUiVisibility | 256;
        }
        decorView.setSystemUiVisibility(i2);
        window.setDecorFitsSystemWindows(z10);
    }

    public static void h(Window window, boolean z10) {
        window.setDecorFitsSystemWindows(z10);
    }

    public static void i(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
