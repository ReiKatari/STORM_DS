package me.magnum.melonds.ui.settings.fragments;

import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$restoreLauncher$1$1$2$1", f = "GeneralPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class GeneralPreferencesFragment$restoreLauncher$1$1$2$1 extends hw6 implements eo2 {
    public final /* synthetic */ GeneralPreferencesFragment X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralPreferencesFragment$restoreLauncher$1$1$2$1(GeneralPreferencesFragment generalPreferencesFragment, r41 r41Var) {
        super(2, r41Var);
        this.X = generalPreferencesFragment;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        jg7 jg7Var = jg7.a;
        ((GeneralPreferencesFragment$restoreLauncher$1$1$2$1) q((r41) obj2, (w61) obj)).s(jg7Var);
        return jg7Var;
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new GeneralPreferencesFragment$restoreLauncher$1$1$2$1(this.X, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        zb zbVar = new zb(this.X.requireContext());
        zbVar.w(R.string.settings_restore_success);
        zbVar.y(17039370, null);
        zbVar.B();
        return jg7.a;
    }
}
