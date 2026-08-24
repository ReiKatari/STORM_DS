package me.magnum.melonds.ui.settings.fragments;

import android.widget.Toast;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$8", f = "RetroAchievementsPreferencesFragment.kt", l = {227}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RetroAchievementsPreferencesFragment$onCreatePreferences$8 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ RetroAchievementsPreferencesFragment Y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @mc1(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$8$1", f = "RetroAchievementsPreferencesFragment.kt", l = {228}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$8$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends hw6 implements eo2 {
        public int X;
        public final /* synthetic */ RetroAchievementsPreferencesFragment Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, r41 r41Var) {
            super(2, r41Var);
            this.Y = retroAchievementsPreferencesFragment;
        }

        @Override // defpackage.eo2
        public final Object o(Object obj, Object obj2) {
            return ((AnonymousClass1) q((r41) obj2, (w61) obj)).s(jg7.a);
        }

        @Override // defpackage.d20
        public final r41 q(r41 r41Var, Object obj) {
            return new AnonymousClass1(this.Y, r41Var);
        }

        @Override // defpackage.d20
        public final Object s(Object obj) {
            x61 x61Var = x61.COROUTINE_SUSPENDED;
            int i = this.X;
            if (i != 0) {
                if (i != 1) {
                    defpackage.i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
            } else {
                oi2.Y(obj);
                final RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = this.Y;
                be5 be5Var = retroAchievementsPreferencesFragment.k().i;
                ne2 ne2Var = new ne2() { // from class: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment.onCreatePreferences.8.1.1
                    @Override // defpackage.ne2
                    public final Object a(Object obj2, r41 r41Var) {
                        jg7 jg7Var = (jg7) obj2;
                        Toast.makeText(RetroAchievementsPreferencesFragment.this.requireContext(), (int) R.string.retro_achievements_login_error_short, 1).show();
                        return jg7.a;
                    }
                };
                this.X = 1;
                if (be5Var.A.b(ne2Var, this) == x61Var) {
                    return x61Var;
                }
            }
            e41.c();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroAchievementsPreferencesFragment$onCreatePreferences$8(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, r41 r41Var) {
        super(2, r41Var);
        this.Y = retroAchievementsPreferencesFragment;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((RetroAchievementsPreferencesFragment$onCreatePreferences$8) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new RetroAchievementsPreferencesFragment$onCreatePreferences$8(this.Y, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                defpackage.i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = this.Y;
            ut3 lifecycle = retroAchievementsPreferencesFragment.getLifecycle();
            lifecycle.getClass();
            tt3 tt3Var = tt3.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(retroAchievementsPreferencesFragment, null);
            this.X = 1;
            if (np2.c0(lifecycle, tt3Var, anonymousClass1, this) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }
}
