package me.magnum.melonds.ui.settings.fragments;

import androidx.lifecycle.a1;
import androidx.lifecycle.e1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class CheatsPreferencesFragment$special$$inlined$viewModels$default$5 extends nc.l implements mc.a {
    public final /* synthetic */ CheatsPreferencesFragment B;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheatsPreferencesFragment$special$$inlined$viewModels$default$5(CheatsPreferencesFragment cheatsPreferencesFragment, yb.f fVar) {
        super(0);
        this.B = cheatsPreferencesFragment;
        this.L = fVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yb.f, java.lang.Object] */
    @Override // mc.a
    public final Object b() {
        androidx.lifecycle.k kVar;
        a1 defaultViewModelProviderFactory;
        e1 e1Var = (e1) this.L.getValue();
        if (e1Var instanceof androidx.lifecycle.k) {
            kVar = (androidx.lifecycle.k) e1Var;
        } else {
            kVar = null;
        }
        if (kVar != null && (defaultViewModelProviderFactory = kVar.getDefaultViewModelProviderFactory()) != null) {
            return defaultViewModelProviderFactory;
        }
        return this.B.getDefaultViewModelProviderFactory();
    }
}
