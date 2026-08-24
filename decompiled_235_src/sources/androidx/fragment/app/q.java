package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class q implements View.OnAttachStateChangeListener {
    public final /* synthetic */ x A;
    public final /* synthetic */ r B;

    public q(r rVar, x xVar) {
        this.B = rVar;
        this.A = xVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        x xVar = this.A;
        o oVar = xVar.c;
        xVar.k();
        h.j((ViewGroup) oVar.mView.getParent(), this.B.A).i();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
