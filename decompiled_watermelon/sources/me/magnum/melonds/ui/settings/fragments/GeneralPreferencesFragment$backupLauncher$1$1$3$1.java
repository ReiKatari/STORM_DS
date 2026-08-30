package me.magnum.melonds.ui.settings.fragments;

import android.widget.Toast;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1$3$1", f = "GeneralPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class GeneralPreferencesFragment$backupLauncher$1$1$3$1 extends nk6 implements aj2 {
    public final /* synthetic */ GeneralPreferencesFragment X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralPreferencesFragment$backupLauncher$1$1$3$1(GeneralPreferencesFragment generalPreferencesFragment, j11 j11Var) {
        super(2, j11Var);
        this.X = generalPreferencesFragment;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        o27 o27Var = o27.a;
        ((GeneralPreferencesFragment$backupLauncher$1$1$3$1) t((j11) obj2, (o31) obj)).v(o27Var);
        return o27Var;
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new GeneralPreferencesFragment$backupLauncher$1$1$3$1(this.X, j11Var);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        Toast.makeText(this.X.requireContext(), (int) R.string.settings_backup_error, 0).show();
        return o27.a;
    }
}
