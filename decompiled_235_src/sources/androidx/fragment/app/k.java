package androidx.fragment.app;

import android.os.Bundle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class k extends sk2 {
    public final /* synthetic */ o a;

    public k(o oVar) {
        this.a = oVar;
    }

    @Override // defpackage.sk2
    public final void a() {
        Bundle bundle;
        o oVar = this.a;
        oVar.mSavedStateRegistryController.a();
        y46.b(oVar);
        Bundle bundle2 = oVar.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("registryState");
        } else {
            bundle = null;
        }
        oVar.mSavedStateRegistryController.b(bundle);
    }
}
