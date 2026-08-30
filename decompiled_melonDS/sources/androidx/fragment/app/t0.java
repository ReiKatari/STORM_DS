package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ p1 A;
    public final /* synthetic */ u0 B;

    public t0(u0 u0Var, p1 p1Var) {
        this.B = u0Var;
        this.A = p1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        p1 p1Var = this.A;
        j0 j0Var = p1Var.f1392c;
        p1Var.k();
        q.j((ViewGroup) j0Var.mView.getParent(), this.B.A).i();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
