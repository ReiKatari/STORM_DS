package k5;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.preference.Preference;
import me.magnum.melonds.ui.romlist.RomListActivity;
import q.i1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7966a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f7967b;

    public c(w5.a aVar, RomListActivity romListActivity) {
        this.f7967b = romListActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        WindowInsets build;
        View rootView;
        switch (this.f7966a) {
            case 0:
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) this.f7967b).f1184n0;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                    return;
                }
                return;
            default:
                if (m4.b.o(view2)) {
                    SplashScreenView i2 = m4.b.i(view2);
                    i2.getClass();
                    build = i1.l().build();
                    build.getClass();
                    Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Preference.DEFAULT_ORDER, Preference.DEFAULT_ORDER);
                    rootView = i2.getRootView();
                    if (build == rootView.computeSystemWindowInsets(build, rect)) {
                        rect.isEmpty();
                    }
                    View decorView = ((RomListActivity) this.f7967b).getWindow().getDecorView();
                    decorView.getClass();
                    ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
                    return;
                }
                return;
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        switch (this.f7966a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f7967b;
                coordinatorLayout.p(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f1184n0;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public c(CoordinatorLayout coordinatorLayout) {
        this.f7967b = coordinatorLayout;
    }

    private final void a(View view, View view2) {
    }
}
