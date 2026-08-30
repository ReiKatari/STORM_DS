package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public enum i2 {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;
    
    public static final g2 Companion = new Object();

    public static final i2 from(int i2) {
        Companion.getClass();
        return g2.b(i2);
    }

    public final void applyState(View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        if (g1.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int i2 = h2.f1337a[ordinal()];
        ViewGroup viewGroup2 = null;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        if (g1.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (g1.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
                return;
            }
            if (g1.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) parent;
            }
            if (viewGroup2 == null) {
                if (g1.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        ViewParent parent2 = view.getParent();
        if (parent2 instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent2;
        }
        if (viewGroup2 != null) {
            if (g1.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
            }
            viewGroup2.removeView(view);
        }
    }
}
