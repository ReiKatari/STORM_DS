package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class CheatsPreferencesFragment$special$$inlined$viewModels$default$5 extends ic3 implements ki2 {
    public final /* synthetic */ CheatsPreferencesFragment B;
    public final /* synthetic */ gh3 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheatsPreferencesFragment$special$$inlined$viewModels$default$5(CheatsPreferencesFragment cheatsPreferencesFragment, gh3 gh3Var) {
        super(0);
        this.B = cheatsPreferencesFragment;
        this.L = gh3Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        lq2 lq2Var;
        xa7 defaultViewModelProviderFactory;
        ab7 ab7Var = (ab7) this.L.getValue();
        if (ab7Var instanceof lq2) {
            lq2Var = (lq2) ab7Var;
        } else {
            lq2Var = null;
        }
        if (lq2Var != null && (defaultViewModelProviderFactory = lq2Var.getDefaultViewModelProviderFactory()) != null) {
            return defaultViewModelProviderFactory;
        }
        return this.B.getDefaultViewModelProviderFactory();
    }
}
