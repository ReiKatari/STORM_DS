package a6;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class p0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static i2 b(View view, i2 i2Var, Rect rect) {
        WindowInsets f8 = i2Var.f();
        if (f8 != null) {
            return i2.g(view, view.computeSystemWindowInsets(f8, rect));
        }
        rect.setEmpty();
        return i2Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static String e(View view) {
        return view.getTransitionName();
    }

    public static float f(View view) {
        return view.getZ();
    }

    public static boolean g(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void h(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void i(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void j(View view, float f8) {
        view.setElevation(f8);
    }

    public static void k(View view, v vVar) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener;
        if (vVar != null) {
            onApplyWindowInsetsListener = new o0(view, vVar);
        } else {
            onApplyWindowInsetsListener = null;
        }
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, onApplyWindowInsetsListener);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (onApplyWindowInsetsListener != null) {
            view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void l(View view, String str) {
        view.setTransitionName(str);
    }

    public static void m(View view) {
        view.stopNestedScroll();
    }
}
