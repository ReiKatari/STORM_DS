package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class RomsPreferencesFragment$special$$inlined$viewModels$default$4 extends ic3 implements ki2 {
    public final /* synthetic */ gh3 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RomsPreferencesFragment$special$$inlined$viewModels$default$4(gh3 gh3Var) {
        super(0);
        this.B = gh3Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        lq2 lq2Var;
        ab7 ab7Var = (ab7) this.B.getValue();
        if (ab7Var instanceof lq2) {
            lq2Var = (lq2) ab7Var;
        } else {
            lq2Var = null;
        }
        if (lq2Var != null) {
            return lq2Var.getDefaultViewModelCreationExtras();
        }
        return x31.b;
    }
}
