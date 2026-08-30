package me.magnum.melonds.ui.settings.fragments;

import android.widget.Toast;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$8", f = "RetroAchievementsPreferencesFragment.kt", l = {227}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RetroAchievementsPreferencesFragment$onCreatePreferences$8 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ RetroAchievementsPreferencesFragment Y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @v81(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$8$1", f = "RetroAchievementsPreferencesFragment.kt", l = {228}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$8$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends nk6 implements aj2 {
        public int X;
        public final /* synthetic */ RetroAchievementsPreferencesFragment Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, j11 j11Var) {
            super(2, j11Var);
            this.Y = retroAchievementsPreferencesFragment;
        }

        @Override // defpackage.aj2
        public final Object j(Object obj, Object obj2) {
            return ((AnonymousClass1) t((j11) obj2, (o31) obj)).v(o27.a);
        }

        @Override // defpackage.m00
        public final j11 t(j11 j11Var, Object obj) {
            return new AnonymousClass1(this.Y, j11Var);
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
                o45 o45Var = retroAchievementsPreferencesFragment.k().i;
                w92 w92Var = new w92() { // from class: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment.onCreatePreferences.8.1.1
                    @Override // defpackage.w92
                    public final Object b(Object obj2, j11 j11Var) {
                        o27 o27Var = (o27) obj2;
                        Toast.makeText(RetroAchievementsPreferencesFragment.this.requireContext(), (int) R.string.retro_achievements_login_error_short, 1).show();
                        return o27.a;
                    }
                };
                this.X = 1;
                if (o45Var.A.a(w92Var, this) == p31Var) {
                    return p31Var;
                }
            }
            f81.c();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroAchievementsPreferencesFragment$onCreatePreferences$8(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, j11 j11Var) {
        super(2, j11Var);
        this.Y = retroAchievementsPreferencesFragment;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((RetroAchievementsPreferencesFragment$onCreatePreferences$8) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new RetroAchievementsPreferencesFragment$onCreatePreferences$8(this.Y, j11Var);
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
            qm3 qm3Var = qm3.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(retroAchievementsPreferencesFragment, null);
            this.X = 1;
            if (nl2.Q(lifecycle, qm3Var, anonymousClass1, this) == p31Var) {
                return p31Var;
            }
        }
        return o27.a;
    }
}
