package me.magnum.melonds.ui.settings.fragments;

import me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5", f = "RetroAchievementsPreferencesFragment.kt", l = {159}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RetroAchievementsPreferencesFragment$onCreatePreferences$5 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ RetroAchievementsPreferencesFragment Y;
    public final /* synthetic */ RetroAchievementsProfilePreference Z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @v81(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1", f = "RetroAchievementsPreferencesFragment.kt", l = {165}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends nk6 implements aj2 {
        public int X;
        public final /* synthetic */ RetroAchievementsPreferencesFragment Y;
        public final /* synthetic */ RetroAchievementsProfilePreference Z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
        @v81(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1$1", f = "RetroAchievementsPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C00061 extends nk6 implements bj2 {
            public /* synthetic */ wc5 X;
            public /* synthetic */ b25 Y;

            /* JADX WARN: Type inference failed for: r1v1, types: [me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1$1, nk6] */
            @Override // defpackage.bj2
            public final Object i(Object obj, Object obj2, Object obj3) {
                ?? nk6Var = new nk6(3, (j11) obj3);
                nk6Var.X = (wc5) obj;
                nk6Var.Y = (b25) obj2;
                return nk6Var.v(o27.a);
            }

            @Override // defpackage.m00
            public final Object v(Object obj) {
                wc5 wc5Var = this.X;
                b25 b25Var = this.Y;
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (b25Var != null && (wc5Var instanceof tc5) && b53.x(((tc5) wc5Var).a, b25Var.a)) {
                    return b25Var;
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
        /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public final /* synthetic */ class AnonymousClass2 implements w92, jj2 {
            public final /* synthetic */ RetroAchievementsProfilePreference A;

            public AnonymousClass2(RetroAchievementsProfilePreference retroAchievementsProfilePreference) {
                this.A = retroAchievementsProfilePreference;
            }

            @Override // defpackage.jj2
            public final wi2 a() {
                return new t9(2, 4, RetroAchievementsProfilePreference.class, this.A, "setProfile", "setProfile(Lme/magnum/rcheevosapi/model/RAUserProfile;)V");
            }

            @Override // defpackage.w92
            public final Object b(Object obj, j11 j11Var) {
                boolean z;
                b25 b25Var = (b25) obj;
                RetroAchievementsProfilePreference retroAchievementsProfilePreference = this.A;
                retroAchievementsProfilePreference.A.setValue(b25Var);
                if (b25Var != null) {
                    z = true;
                } else {
                    z = false;
                }
                retroAchievementsProfilePreference.setVisible(z);
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                return o27.a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof w92) && (obj instanceof jj2)) {
                    return a().equals(((jj2) obj).a());
                }
                return false;
            }

            public final int hashCode() {
                return a().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, RetroAchievementsProfilePreference retroAchievementsProfilePreference, j11 j11Var) {
            super(2, j11Var);
            this.Y = retroAchievementsPreferencesFragment;
            this.Z = retroAchievementsProfilePreference;
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
            o27 o27Var = o27.a;
            if (i != 0) {
                if (i == 1) {
                    me2.a0(obj);
                    return o27Var;
                }
                defpackage.i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            me2.a0(obj);
            RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = this.Y;
            q45 q45Var = retroAchievementsPreferencesFragment.k().e;
            nk6 nk6Var = new nk6(3, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.Z);
            this.X = 1;
            Object G = n40.G(this, anonymousClass2, ux.R, new dx1(nk6Var, (j11) null, 5), new u92[]{(ce6) retroAchievementsPreferencesFragment.k().d.getValue(), q45Var});
            if (G != p31Var) {
                G = o27Var;
            }
            if (G == p31Var) {
                return p31Var;
            }
            return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroAchievementsPreferencesFragment$onCreatePreferences$5(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, RetroAchievementsProfilePreference retroAchievementsProfilePreference, j11 j11Var) {
        super(2, j11Var);
        this.Y = retroAchievementsPreferencesFragment;
        this.Z = retroAchievementsProfilePreference;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((RetroAchievementsPreferencesFragment$onCreatePreferences$5) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new RetroAchievementsPreferencesFragment$onCreatePreferences$5(this.Y, this.Z, j11Var);
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
