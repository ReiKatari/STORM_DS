package me.magnum.melonds.ui.settings.fragments;

import android.widget.Toast;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupExternalLayoutLauncher$1$1$3$1", f = "SystemPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SystemPreferencesFragment$backupExternalLayoutLauncher$1$1$3$1 extends hw6 implements eo2 {
    public final /* synthetic */ SystemPreferencesFragment X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemPreferencesFragment$backupExternalLayoutLauncher$1$1$3$1(SystemPreferencesFragment systemPreferencesFragment, r41 r41Var) {
        super(2, r41Var);
        this.X = systemPreferencesFragment;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        jg7 jg7Var = jg7.a;
        ((SystemPreferencesFragment$backupExternalLayoutLauncher$1$1$3$1) q((r41) obj2, (w61) obj)).s(jg7Var);
        return jg7Var;
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new SystemPreferencesFragment$backupExternalLayoutLauncher$1$1$3$1(this.X, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        Toast.makeText(this.X.requireContext(), (int) R.string.external_layout_backup_error, 0).show();
        return jg7.a;
    }
}
