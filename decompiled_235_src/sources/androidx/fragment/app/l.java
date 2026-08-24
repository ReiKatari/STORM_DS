package androidx.fragment.app;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class l extends zk2 {
    public final /* synthetic */ o A;

    public l(o oVar) {
        this.A = oVar;
    }

    @Override // defpackage.zk2
    public final View c(int i) {
        o oVar = this.A;
        View view = oVar.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        defpackage.i.m(lb1.l("Fragment ", oVar, " does not have a view"));
        return null;
    }

    @Override // defpackage.zk2
    public final boolean j() {
        if (this.A.mView != null) {
            return true;
        }
        return false;
    }
}
