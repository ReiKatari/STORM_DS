package v9;

import a6.x0;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d1.g2;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a extends k5.a {

    /* renamed from: a  reason: collision with root package name */
    public g2 f13780a;

    @Override // k5.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        r(coordinatorLayout, view, i2);
        if (this.f13780a == null) {
            this.f13780a = new g2(view);
        }
        g2 g2Var = this.f13780a;
        View view2 = (View) g2Var.L;
        g2Var.A = view2.getTop();
        g2Var.B = view2.getLeft();
        g2 g2Var2 = this.f13780a;
        View view3 = (View) g2Var2.L;
        WeakHashMap weakHashMap = x0.f533a;
        view3.offsetTopAndBottom(0 - (view3.getTop() - g2Var2.A));
        view3.offsetLeftAndRight(0 - (view3.getLeft() - g2Var2.B));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i2) {
        coordinatorLayout.q(view, i2);
    }
}
