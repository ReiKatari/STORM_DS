package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bb7  reason: default package */
/* loaded from: classes.dex */
public abstract class bb7 extends w11 {
    public k70 a;

    @Override // defpackage.w11
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new k70(view);
        }
        k70 k70Var = this.a;
        View view2 = (View) k70Var.L;
        k70Var.A = view2.getTop();
        k70Var.B = view2.getLeft();
        k70 k70Var2 = this.a;
        View view3 = (View) k70Var2.L;
        WeakHashMap weakHashMap = aa7.a;
        view3.offsetTopAndBottom(0 - (view3.getTop() - k70Var2.A));
        view3.offsetLeftAndRight(0 - (view3.getLeft() - k70Var2.B));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
