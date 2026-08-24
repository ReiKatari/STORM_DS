package androidx.fragment.app;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class m implements fu3 {
    public final /* synthetic */ o A;

    public m(o oVar) {
        this.A = oVar;
    }

    @Override // defpackage.fu3
    public final void h(hu3 hu3Var, st3 st3Var) {
        View view;
        if (st3Var == st3.ON_STOP && (view = this.A.mView) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
