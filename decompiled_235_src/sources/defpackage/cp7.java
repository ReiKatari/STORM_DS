package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cp7  reason: default package */
/* loaded from: classes.dex */
public abstract class cp7 extends e51 {
    public r90 a;

    @Override // defpackage.e51
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        v(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new r90(view);
        }
        r90 r90Var = this.a;
        View view2 = (View) r90Var.L;
        r90Var.A = view2.getTop();
        r90Var.B = view2.getLeft();
        r90 r90Var2 = this.a;
        View view3 = (View) r90Var2.L;
        WeakHashMap weakHashMap = ao7.a;
        view3.offsetTopAndBottom(0 - (view3.getTop() - r90Var2.A));
        view3.offsetLeftAndRight(0 - (view3.getLeft() - r90Var2.B));
        return true;
    }

    public void v(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
