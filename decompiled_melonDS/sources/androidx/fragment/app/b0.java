package androidx.fragment.app;

import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 extends r0 {
    public final /* synthetic */ j0 A;

    public b0(j0 j0Var) {
        this.A = j0Var;
    }

    @Override // androidx.fragment.app.r0
    public final View d(int i2) {
        j0 j0Var = this.A;
        View view = j0Var.mView;
        if (view != null) {
            return view.findViewById(i2);
        }
        a0.j.p(w.d.n("Fragment ", j0Var, " does not have a view"));
        return null;
    }

    @Override // androidx.fragment.app.r0
    public final boolean e() {
        if (this.A.mView != null) {
            return true;
        }
        return false;
    }
}
