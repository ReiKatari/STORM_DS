package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.preference.Preference;
import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y11  reason: default package */
/* loaded from: classes.dex */
public final class y11 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ KeyEvent.Callback b;

    public y11(nc6 nc6Var, RomListActivity romListActivity) {
        this.b = romListActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        WindowInsets build;
        View rootView;
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) callback).o0;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                    return;
                }
                return;
            default:
                if (dr5.n(view2)) {
                    SplashScreenView j = dr5.j(view2);
                    j.getClass();
                    build = zq4.k().build();
                    build.getClass();
                    Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Preference.DEFAULT_ORDER, Preference.DEFAULT_ORDER);
                    rootView = j.getRootView();
                    if (build == rootView.computeSystemWindowInsets(build, rect)) {
                        rect.isEmpty();
                    }
                    View decorView = ((RomListActivity) callback).getWindow().getDecorView();
                    decorView.getClass();
                    ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
                    return;
                }
                return;
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        switch (this.a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
                coordinatorLayout.p(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.o0;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public y11(CoordinatorLayout coordinatorLayout) {
        this.b = coordinatorLayout;
    }

    private final void a(View view, View view2) {
    }
}
