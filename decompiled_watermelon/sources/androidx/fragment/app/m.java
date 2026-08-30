package androidx.fragment.app;

import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class m implements dn3 {
    public final /* synthetic */ o A;

    public m(o oVar) {
        this.A = oVar;
    }

    @Override // defpackage.dn3
    public final void d(fn3 fn3Var, pm3 pm3Var) {
        View view;
        if (pm3Var == pm3.ON_STOP && (view = this.A.mView) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
