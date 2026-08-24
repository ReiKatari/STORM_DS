package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RomsPreferencesFragment$special$$inlined$viewModels$default$4 extends aj3 implements on2 {
    public final /* synthetic */ go3 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RomsPreferencesFragment$special$$inlined$viewModels$default$4(go3 go3Var) {
        super(0);
        this.B = go3Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        mw2 mw2Var;
        bp7 bp7Var = (bp7) this.B.getValue();
        if (bp7Var instanceof mw2) {
            mw2Var = (mw2) bp7Var;
        } else {
            mw2Var = null;
        }
        if (mw2Var != null) {
            return mw2Var.getDefaultViewModelCreationExtras();
        }
        return h71.b;
    }
}
