package p;

import android.view.ActionProvider;
import l.i0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o implements ActionProvider.VisibilityListener {

    /* renamed from: a  reason: collision with root package name */
    public i0 f11158a;

    /* renamed from: b  reason: collision with root package name */
    public final ActionProvider f11159b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f11159b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        i0 i0Var = this.f11158a;
        if (i0Var != null) {
            l lVar = ((n) i0Var.B).f11145n;
            lVar.f11117h = true;
            lVar.p(true);
        }
    }
}
