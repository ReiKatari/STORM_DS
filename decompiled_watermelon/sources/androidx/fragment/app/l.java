package androidx.fragment.app;

import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class l extends ag2 {
    public final /* synthetic */ o A;

    public l(o oVar) {
        this.A = oVar;
    }

    @Override // defpackage.ag2
    public final View d(int i) {
        o oVar = this.A;
        View view = oVar.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        defpackage.i.n(wh1.k("Fragment ", oVar, " does not have a view"));
        return null;
    }

    @Override // defpackage.ag2
    public final boolean e() {
        if (this.A.mView != null) {
            return true;
        }
        return false;
    }
}
