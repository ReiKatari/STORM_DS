package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g51  reason: default package */
/* loaded from: classes.dex */
public final class g51 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ KeyEvent.Callback b;

    public g51(do6 do6Var, RomListActivity romListActivity) {
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
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) callback).p0;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                    return;
                }
                return;
            default:
                if (ij5.q(view2)) {
                    SplashScreenView l = ij5.l(view2);
                    l.getClass();
                    build = r74.m().build();
                    build.getClass();
                    Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    rootView = l.getRootView();
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
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.p0;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public g51(CoordinatorLayout coordinatorLayout) {
        this.b = coordinatorLayout;
    }

    private final void a(View view, View view2) {
    }
}
