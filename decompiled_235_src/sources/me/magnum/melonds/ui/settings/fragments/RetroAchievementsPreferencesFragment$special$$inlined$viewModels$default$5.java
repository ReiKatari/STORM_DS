package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$5 extends aj3 implements on2 {
    public final /* synthetic */ RetroAchievementsPreferencesFragment B;
    public final /* synthetic */ go3 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$5(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, go3 go3Var) {
        super(0);
        this.B = retroAchievementsPreferencesFragment;
        this.L = go3Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        mw2 mw2Var;
        yo7 defaultViewModelProviderFactory;
        bp7 bp7Var = (bp7) this.L.getValue();
        if (bp7Var instanceof mw2) {
            mw2Var = (mw2) bp7Var;
        } else {
            mw2Var = null;
        }
        if (mw2Var != null && (defaultViewModelProviderFactory = mw2Var.getDefaultViewModelProviderFactory()) != null) {
            return defaultViewModelProviderFactory;
        }
        return this.B.getDefaultViewModelProviderFactory();
    }
}
