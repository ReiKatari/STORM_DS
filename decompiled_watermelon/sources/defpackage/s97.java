package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s97  reason: default package */
/* loaded from: classes.dex */
public abstract class s97 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static vf7 b(View view, vf7 vf7Var, Rect rect) {
        WindowInsets f = vf7Var.f();
        if (f != null) {
            return vf7.g(view, view.computeSystemWindowInsets(f, rect));
        }
        rect.setEmpty();
        return vf7Var;
    }

    public static void c(View view, bc4 bc4Var) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener;
        if (bc4Var != null) {
            onApplyWindowInsetsListener = new r97(view, bc4Var);
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
}
