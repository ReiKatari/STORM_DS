package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.u;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kc6  reason: default package */
/* loaded from: classes.dex */
public enum kc6 {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;
    
    public static final ic6 Companion = new Object();

    public static final kc6 from(int i) {
        Companion.getClass();
        return ic6.b(i);
    }

    public final void applyState(View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        if (u.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int i = jc6.a[ordinal()];
        ViewGroup viewGroup2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (u.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (u.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
                return;
            }
            if (u.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) parent;
            }
            if (viewGroup2 == null) {
                if (u.K(2)) {
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
            if (u.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
            }
            viewGroup2.removeView(view);
        }
    }
}
