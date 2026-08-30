package a6;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l1 extends o1 {

    /* renamed from: e  reason: collision with root package name */
    public static final PathInterpolator f483e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f  reason: collision with root package name */
    public static final t6.a f484f = new t6.a(0);

    /* renamed from: g  reason: collision with root package name */
    public static final DecelerateInterpolator f485g = new DecelerateInterpolator(1.5f);

    /* renamed from: h  reason: collision with root package name */
    public static final AccelerateInterpolator f486h = new AccelerateInterpolator(1.5f);

    public static void f(p1 p1Var, View view) {
        pd.g k10 = k(view);
        if (k10 != null) {
            k10.a(p1Var);
            if (k10.B == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                f(p1Var, viewGroup.getChildAt(i2));
            }
        }
    }

    public static void g(View view, p1 p1Var, i2 i2Var, boolean z10) {
        pd.g k10 = k(view);
        if (k10 != null) {
            k10.A = i2Var;
            if (!z10) {
                k10.b(p1Var);
                if (k10.B == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                g(viewGroup.getChildAt(i2), p1Var, i2Var, z10);
            }
        }
    }

    public static void h(View view, i2 i2Var, List list) {
        pd.g k10 = k(view);
        if (k10 != null) {
            i2Var = k10.c(i2Var, list);
            if (k10.B == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), i2Var, list);
            }
        }
    }

    public static void i(View view, p1 p1Var, a0.g gVar) {
        pd.g k10 = k(view);
        if (k10 != null) {
            k10.d(p1Var, gVar);
            if (k10.B == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                i(viewGroup.getChildAt(i2), p1Var, gVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static pd.g k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof k1) {
            return ((k1) tag).f481a;
        }
        return null;
    }
}
