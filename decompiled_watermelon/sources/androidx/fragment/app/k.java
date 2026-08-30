package androidx.fragment.app;

import android.os.Bundle;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class k extends tf2 {
    public final /* synthetic */ o a;

    public k(o oVar) {
        this.a = oVar;
    }

    @Override // defpackage.tf2
    public final void a() {
        Bundle bundle;
        o oVar = this.a;
        oVar.mSavedStateRegistryController.a();
        st5.b(oVar);
        Bundle bundle2 = oVar.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("registryState");
        } else {
            bundle = null;
        }
        oVar.mSavedStateRegistryController.b(bundle);
    }
}
