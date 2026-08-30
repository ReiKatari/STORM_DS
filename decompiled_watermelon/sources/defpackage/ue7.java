package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ue7  reason: default package */
/* loaded from: classes.dex */
public final class ue7 extends ye7 {
    public static final PathInterpolator e = new PathInterpolator(RecyclerView.A1, 1.1f, RecyclerView.A1, 1.0f);
    public static final x42 f = new x42(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(ze7 ze7Var, View view) {
        yv4 k = k(view);
        if (k != null) {
            k.i0(ze7Var);
            if (k.A == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(ze7Var, viewGroup.getChildAt(i));
            }
        }
    }

    public static void g(View view, ze7 ze7Var, vf7 vf7Var, boolean z) {
        yv4 k = k(view);
        if (k != null) {
            k.B = vf7Var;
            if (!z) {
                k.j0(ze7Var);
                if (k.A == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), ze7Var, vf7Var, z);
            }
        }
    }

    public static void h(View view, vf7 vf7Var, List list) {
        yv4 k = k(view);
        if (k != null) {
            vf7Var = k.k0(vf7Var, list);
            if (k.A == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), vf7Var, list);
            }
        }
    }

    public static void i(View view, ze7 ze7Var, wv6 wv6Var) {
        yv4 k = k(view);
        if (k != null) {
            k.l0(ze7Var, wv6Var);
            if (k.A == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), ze7Var, wv6Var);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static yv4 k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof te7) {
            return ((te7) tag).a;
        }
        return null;
    }
}
