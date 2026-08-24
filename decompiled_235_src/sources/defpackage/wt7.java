package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wt7  reason: default package */
/* loaded from: classes.dex */
public final class wt7 extends zt7 {
    public static final PathInterpolator e = new PathInterpolator(RecyclerView.B1, 1.1f, RecyclerView.B1, 1.0f);
    public static final q92 f = new q92(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(au7 au7Var, View view) {
        f55 k = k(view);
        if (k != null) {
            k.i0(au7Var);
            if (k.A == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(au7Var, viewGroup.getChildAt(i));
            }
        }
    }

    public static void g(View view, au7 au7Var, vu7 vu7Var, boolean z) {
        f55 k = k(view);
        if (k != null) {
            k.B = vu7Var;
            if (!z) {
                k.j0(au7Var);
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
                g(viewGroup.getChildAt(i), au7Var, vu7Var, z);
            }
        }
    }

    public static void h(View view, vu7 vu7Var, List list) {
        f55 k = k(view);
        if (k != null) {
            vu7Var = k.k0(vu7Var, list);
            if (k.A == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), vu7Var, list);
            }
        }
    }

    public static void i(View view, au7 au7Var, rr6 rr6Var) {
        f55 k = k(view);
        if (k != null) {
            k.l0(au7Var, rr6Var);
            if (k.A == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), au7Var, rr6Var);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static f55 k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof vt7) {
            return ((vt7) tag).a;
        }
        return null;
    }
}
