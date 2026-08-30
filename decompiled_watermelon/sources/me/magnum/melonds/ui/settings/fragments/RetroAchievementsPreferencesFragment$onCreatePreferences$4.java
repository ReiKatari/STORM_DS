package me.magnum.melonds.ui.settings.fragments;

import androidx.preference.Preference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4", f = "RetroAchievementsPreferencesFragment.kt", l = {130}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RetroAchievementsPreferencesFragment$onCreatePreferences$4 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ RetroAchievementsPreferencesFragment Y;
    public final /* synthetic */ Preference Z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @v81(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4$1", f = "RetroAchievementsPreferencesFragment.kt", l = {131}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends nk6 implements aj2 {
        public int X;
        public final /* synthetic */ RetroAchievementsPreferencesFragment Y;
        public final /* synthetic */ Preference Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, Preference preference, j11 j11Var) {
            super(2, j11Var);
            this.Y = retroAchievementsPreferencesFragment;
            this.Z = preference;
        }

        @Override // defpackage.aj2
        public final Object j(Object obj, Object obj2) {
            return ((AnonymousClass1) t((j11) obj2, (o31) obj)).v(o27.a);
        }

        @Override // defpackage.m00
        public final j11 t(j11 j11Var, Object obj) {
            return new AnonymousClass1(this.Y, this.Z, j11Var);
        }

        @Override // defpackage.m00
        public final Object v(Object obj) {
            p31 p31Var = p31.COROUTINE_SUSPENDED;
            int i = this.X;
            if (i != 0) {
                if (i != 1) {
                    defpackage.i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
            } else {
                me2.a0(obj);
                final RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = this.Y;
                final Preference preference = this.Z;
                w92 w92Var = new w92() { // from class: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment.onCreatePreferences.4.1.1
                    @Override // defpackage.w92
                    public final Object b(Object obj2, j11 j11Var) {
                        wc5 wc5Var = (wc5) obj2;
                        boolean z = wc5Var instanceof tc5;
                        RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment2 = retroAchievementsPreferencesFragment;
                        Preference preference2 = Preference.this;
                        if (z) {
                            preference2.setTitle(retroAchievementsPreferencesFragment2.getString(R.string.retroachievements_logout));
                            preference2.setSummary(retroAchievementsPreferencesFragment2.getString(R.string.retroachievements_login_status, ((tc5) wc5Var).a));
                            preference2.notifyDependencyChange(false);
                        } else if (wc5Var instanceof vc5) {
                            preference2.setTitle(retroAchievementsPreferencesFragment2.getString(R.string.login));
                            preference2.setSummary(retroAchievementsPreferencesFragment2.getString(R.string.retroachievements_login_expired_status));
                            preference2.notifyDependencyChange(true);
                        } else if (b53.x(wc5Var, uc5.a)) {
                            preference2.setTitle(retroAchievementsPreferencesFragment2.getString(R.string.login_with_retro_achievements));
                            preference2.setSummary(retroAchievementsPreferencesFragment2.getString(R.string.retroachievements_login_summary));
                            preference2.notifyDependencyChange(true);
                        } else if (b53.x(wc5Var, uc5.b)) {
                            preference2.setTitle(retroAchievementsPreferencesFragment2.getString(R.string.ellipsis));
                            preference2.setSummary(retroAchievementsPreferencesFragment2.getString(R.string.ellipsis));
                            preference2.notifyDependencyChange(true);
                        } else {
                            defpackage.i.c();
                            return null;
                        }
                        return o27.a;
                    }
                };
                this.X = 1;
                if (((ce6) retroAchievementsPreferencesFragment.k().d.getValue()).a(w92Var, this) == p31Var) {
                    return p31Var;
                }
            }
            f81.c();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroAchievementsPreferencesFragment$onCreatePreferences$4(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, Preference preference, j11 j11Var) {
        super(2, j11Var);
        this.Y = retroAchievementsPreferencesFragment;
        this.Z = preference;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((RetroAchievementsPreferencesFragment$onCreatePreferences$4) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new RetroAchievementsPreferencesFragment$onCreatePreferences$4(this.Y, this.Z, j11Var);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                defpackage.i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = this.Y;
            rm3 lifecycle = retroAchievementsPreferencesFragment.getLifecycle();
            lifecycle.getClass();
            qm3 qm3Var = qm3.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(retroAchievementsPreferencesFragment, this.Z, null);
            this.X = 1;
            if (nl2.Q(lifecycle, qm3Var, anonymousClass1, this) == p31Var) {
                return p31Var;
            }
        }
        return o27.a;
    }
}
