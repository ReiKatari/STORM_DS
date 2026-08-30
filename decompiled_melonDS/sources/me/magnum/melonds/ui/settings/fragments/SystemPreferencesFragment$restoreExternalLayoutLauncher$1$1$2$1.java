package me.magnum.melonds.ui.settings.fragments;

import mc.p;
import me.magnum.melonds.R;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@ec.e(c = "me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$restoreExternalLayoutLauncher$1$1$2$1", f = "SystemPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SystemPreferencesFragment$restoreExternalLayoutLauncher$1$1$2$1 extends ec.j implements p {
    public final /* synthetic */ SystemPreferencesFragment X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemPreferencesFragment$restoreExternalLayoutLauncher$1$1$2$1(SystemPreferencesFragment systemPreferencesFragment, cc.c cVar) {
        super(2, cVar);
        this.X = systemPreferencesFragment;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        cc.c cVar = (cc.c) obj2;
        y yVar = y.f14813a;
        ((SystemPreferencesFragment$restoreExternalLayoutLauncher$1$1$2$1) t(cVar, (u) obj)).v(yVar);
        return yVar;
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new SystemPreferencesFragment$restoreExternalLayoutLauncher$1$1$2$1(this.X, cVar);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        p7.j.I(obj);
        bk.a aVar2 = new bk.a(this.X.requireContext());
        aVar2.t(R.string.external_layout_restore_success);
        aVar2.v(17039370, null);
        aVar2.y();
        return y.f14813a;
    }
}
