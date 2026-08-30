package me.magnum.melonds.ui.settings.fragments;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.s0;
import androidx.preference.Preference;
import cd.o1;
import m9.o;
import mc.p;
import me.magnum.melonds.R;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@ec.e(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$3", f = "RetroAchievementsPreferencesFragment.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RetroAchievementsPreferencesFragment$onCreatePreferences$3 extends ec.j implements p {
    public int X;
    public final /* synthetic */ RetroAchievementsPreferencesFragment Y;
    public final /* synthetic */ Preference Z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @ec.e(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$3$1", f = "RetroAchievementsPreferencesFragment.kt", l = {65}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends ec.j implements p {
        public int X;
        public final /* synthetic */ RetroAchievementsPreferencesFragment Y;
        public final /* synthetic */ Preference Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, Preference preference, cc.c cVar) {
            super(2, cVar);
            this.Y = retroAchievementsPreferencesFragment;
            this.Z = preference;
        }

        @Override // mc.p
        public final Object j(Object obj, Object obj2) {
            return ((AnonymousClass1) t((cc.c) obj2, (u) obj)).v(y.f14813a);
        }

        @Override // ec.a
        public final cc.c t(cc.c cVar, Object obj) {
            return new AnonymousClass1(this.Y, this.Z, cVar);
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
                final Preference preference = this.Z;
                cd.i iVar = new cd.i() { // from class: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment.onCreatePreferences.3.1.1
                    @Override // cd.i
                    public final Object a(Object obj2, cc.c cVar) {
                        ei.c cVar2 = (ei.c) obj2;
                        boolean z10 = cVar2 instanceof ei.a;
                        RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment2 = retroAchievementsPreferencesFragment;
                        Preference preference2 = Preference.this;
                        if (z10) {
                            preference2.setTitle(retroAchievementsPreferencesFragment2.getString(R.string.retroachievements_logout));
                            preference2.setSummary(retroAchievementsPreferencesFragment2.getString(R.string.retroachievements_login_status, ((ei.a) cVar2).f4501a));
                            preference2.notifyDependencyChange(false);
                        } else if (nc.k.a(cVar2, ei.b.f4502a)) {
                            preference2.setTitle(retroAchievementsPreferencesFragment2.getString(R.string.login_with_retro_achievements));
                            preference2.setSummary(retroAchievementsPreferencesFragment2.getString(R.string.retroachievements_login_summary));
                            preference2.notifyDependencyChange(true);
                        } else if (nc.k.a(cVar2, ei.b.f4503b)) {
                            preference2.setTitle(retroAchievementsPreferencesFragment2.getString(R.string.ellipsis));
                            preference2.setSummary(retroAchievementsPreferencesFragment2.getString(R.string.ellipsis));
                            preference2.notifyDependencyChange(true);
                        } else {
                            o.o();
                            return null;
                        }
                        return y.f14813a;
                    }
                };
                this.X = 1;
                if (((o1) retroAchievementsPreferencesFragment.i().f5675d.getValue()).c(iVar, this) == aVar) {
                    return aVar;
                }
            }
            wa.b.a();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroAchievementsPreferencesFragment$onCreatePreferences$3(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, Preference preference, cc.c cVar) {
        super(2, cVar);
        this.Y = retroAchievementsPreferencesFragment;
        this.Z = preference;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((RetroAchievementsPreferencesFragment$onCreatePreferences$3) t((cc.c) obj2, (u) obj)).v(y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new RetroAchievementsPreferencesFragment$onCreatePreferences$3(this.Y, this.Z, cVar);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(retroAchievementsPreferencesFragment, this.Z, null);
            this.X = 1;
            if (s0.i(lifecycle, qVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        }
        return y.f14813a;
    }
}
