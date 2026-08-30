package me.magnum.melonds.ui.settings.fragments;

import android.widget.Toast;
import mc.p;
import me.magnum.melonds.R;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@ec.e(c = "me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1$3$1", f = "GeneralPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class GeneralPreferencesFragment$backupLauncher$1$1$3$1 extends ec.j implements p {
    public final /* synthetic */ GeneralPreferencesFragment X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralPreferencesFragment$backupLauncher$1$1$3$1(GeneralPreferencesFragment generalPreferencesFragment, cc.c cVar) {
        super(2, cVar);
        this.X = generalPreferencesFragment;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        cc.c cVar = (cc.c) obj2;
        y yVar = y.f14813a;
        ((GeneralPreferencesFragment$backupLauncher$1$1$3$1) t(cVar, (u) obj)).v(yVar);
        return yVar;
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new GeneralPreferencesFragment$backupLauncher$1$1$3$1(this.X, cVar);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        p7.j.I(obj);
        Toast.makeText(this.X.requireContext(), (int) R.string.settings_backup_error, 0).show();
        return y.f14813a;
    }
}
