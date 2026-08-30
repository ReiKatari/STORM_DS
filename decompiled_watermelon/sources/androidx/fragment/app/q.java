package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
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
