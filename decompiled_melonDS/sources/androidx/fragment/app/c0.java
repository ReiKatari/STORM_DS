package androidx.fragment.app;

import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 implements androidx.lifecycle.v {
    public final /* synthetic */ j0 A;

    public c0(j0 j0Var) {
        this.A = j0Var;
    }

    @Override // androidx.lifecycle.v
    public final void d(androidx.lifecycle.x xVar, androidx.lifecycle.p pVar) {
        View view;
        if (pVar == androidx.lifecycle.p.ON_STOP && (view = this.A.mView) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
