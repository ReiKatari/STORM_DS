package androidx.fragment.app;

import android.os.Bundle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 extends h0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j0 f1248a;

    public a0(j0 j0Var) {
        this.f1248a = j0Var;
    }

    @Override // androidx.fragment.app.h0
    public final void a() {
        Bundle bundle;
        j0 j0Var = this.f1248a;
        j0Var.mSavedStateRegistryController.a();
        androidx.lifecycle.s0.c(j0Var);
        Bundle bundle2 = j0Var.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("registryState");
        } else {
            bundle = null;
        }
        j0Var.mSavedStateRegistryController.b(bundle);
    }
}
