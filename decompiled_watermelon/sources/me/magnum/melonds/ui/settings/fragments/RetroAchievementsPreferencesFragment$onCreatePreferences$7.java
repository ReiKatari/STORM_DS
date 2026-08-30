package me.magnum.melonds.ui.settings.fragments;

import android.app.Dialog;
import android.content.Context;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$7", f = "RetroAchievementsPreferencesFragment.kt", l = {212}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RetroAchievementsPreferencesFragment$onCreatePreferences$7 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ RetroAchievementsPreferencesFragment Y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @v81(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$7$1", f = "RetroAchievementsPreferencesFragment.kt", l = {213}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$7$1  reason: invalid class name */
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
                q45 q45Var = retroAchievementsPreferencesFragment.k().g;
                w92 w92Var = new w92() { // from class: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment.onCreatePreferences.7.1.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.w92
                    public final Object b(Object obj2, j11 j11Var) {
                        uq3 uq3Var;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment2 = RetroAchievementsPreferencesFragment.this;
                        if (booleanValue) {
                            Context requireContext = retroAchievementsPreferencesFragment2.requireContext();
                            requireContext.getClass();
                            Dialog dialog = new Dialog(requireContext);
                            dialog.show();
                            uq3Var = dialog;
                        } else {
                            uq3 uq3Var2 = retroAchievementsPreferencesFragment2.d0;
                            if (uq3Var2 != null) {
                                uq3Var2.dismiss();
                            }
                            uq3Var = null;
                        }
                        retroAchievementsPreferencesFragment2.d0 = uq3Var;
                        return o27.a;
                    }
                };
                this.X = 1;
                if (q45Var.A.a(w92Var, this) == p31Var) {
                    return p31Var;
                }
            }
            f81.c();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroAchievementsPreferencesFragment$onCreatePreferences$7(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, j11 j11Var) {
        super(2, j11Var);
        this.Y = retroAchievementsPreferencesFragment;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((RetroAchievementsPreferencesFragment$onCreatePreferences$7) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new RetroAchievementsPreferencesFragment$onCreatePreferences$7(this.Y, j11Var);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(retroAchievementsPreferencesFragment, null);
            this.X = 1;
            if (nl2.Q(lifecycle, qm3Var, anonymousClass1, this) == p31Var) {
                return p31Var;
            }
        }
        return o27.a;
    }
}
