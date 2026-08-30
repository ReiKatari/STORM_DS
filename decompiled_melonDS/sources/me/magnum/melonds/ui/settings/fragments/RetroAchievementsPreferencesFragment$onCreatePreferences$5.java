package me.magnum.melonds.ui.settings.fragments;

import android.app.Dialog;
import android.content.Context;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.s0;
import cd.y0;
import mc.p;
import og.o;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@ec.e(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5", f = "RetroAchievementsPreferencesFragment.kt", l = {99}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RetroAchievementsPreferencesFragment$onCreatePreferences$5 extends ec.j implements p {
    public int X;
    public final /* synthetic */ RetroAchievementsPreferencesFragment Y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @ec.e(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1", f = "RetroAchievementsPreferencesFragment.kt", l = {100}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends ec.j implements p {
        public int X;
        public final /* synthetic */ RetroAchievementsPreferencesFragment Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, cc.c cVar) {
            super(2, cVar);
            this.Y = retroAchievementsPreferencesFragment;
        }

        @Override // mc.p
        public final Object j(Object obj, Object obj2) {
            return ((AnonymousClass1) t((cc.c) obj2, (u) obj)).v(y.f14813a);
        }

        @Override // ec.a
        public final cc.c t(cc.c cVar, Object obj) {
            return new AnonymousClass1(this.Y, cVar);
        }

        @Override // ec.a
        public final Object v(Object obj) {
            dc.a aVar = dc.a.COROUTINE_SUSPENDED;
            int i2 = this.X;
            if (i2 != 0) {
                if (i2 != 1) {
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
            } else {
                p7.j.I(obj);
                final RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = this.Y;
                y0 y0Var = retroAchievementsPreferencesFragment.i().f5677f;
                cd.i iVar = new cd.i() { // from class: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment.onCreatePreferences.5.1.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // cd.i
                    public final Object a(Object obj2, cc.c cVar) {
                        o oVar;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment2 = RetroAchievementsPreferencesFragment.this;
                        if (booleanValue) {
                            Context requireContext = retroAchievementsPreferencesFragment2.requireContext();
                            requireContext.getClass();
                            Dialog dialog = new Dialog(requireContext);
                            dialog.show();
                            oVar = dialog;
                        } else {
                            o oVar2 = retroAchievementsPreferencesFragment2.Z;
                            if (oVar2 != null) {
                                oVar2.dismiss();
                            }
                            oVar = null;
                        }
                        retroAchievementsPreferencesFragment2.Z = oVar;
                        return y.f14813a;
                    }
                };
                this.X = 1;
                if (y0Var.A.c(iVar, this) == aVar) {
                    return aVar;
                }
            }
            wa.b.a();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroAchievementsPreferencesFragment$onCreatePreferences$5(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, cc.c cVar) {
        super(2, cVar);
        this.Y = retroAchievementsPreferencesFragment;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((RetroAchievementsPreferencesFragment$onCreatePreferences$5) t((cc.c) obj2, (u) obj)).v(y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new RetroAchievementsPreferencesFragment$onCreatePreferences$5(this.Y, cVar);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.X;
        if (i2 != 0) {
            if (i2 == 1) {
                p7.j.I(obj);
            } else {
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            p7.j.I(obj);
            RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = this.Y;
            r lifecycle = retroAchievementsPreferencesFragment.getLifecycle();
            lifecycle.getClass();
            q qVar = q.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(retroAchievementsPreferencesFragment, null);
            this.X = 1;
            if (s0.i(lifecycle, qVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        }
        return y.f14813a;
    }
}
