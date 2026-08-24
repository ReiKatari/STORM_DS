package me.magnum.melonds.ui.settings.fragments;

import me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5", f = "RetroAchievementsPreferencesFragment.kt", l = {159}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RetroAchievementsPreferencesFragment$onCreatePreferences$5 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ RetroAchievementsPreferencesFragment Y;
    public final /* synthetic */ RetroAchievementsProfilePreference Z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @mc1(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1", f = "RetroAchievementsPreferencesFragment.kt", l = {165}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends hw6 implements eo2 {
        public int X;
        public final /* synthetic */ RetroAchievementsPreferencesFragment Y;
        public final /* synthetic */ RetroAchievementsProfilePreference Z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        @mc1(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1$1", f = "RetroAchievementsPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C00061 extends hw6 implements fo2 {
            public /* synthetic */ qm5 X;
            public /* synthetic */ lb5 Y;

            /* JADX WARN: Type inference failed for: r1v1, types: [hw6, me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1$1] */
            @Override // defpackage.fo2
            public final Object e(Object obj, Object obj2, Object obj3) {
                ?? hw6Var = new hw6(3, (r41) obj3);
                hw6Var.X = (qm5) obj;
                hw6Var.Y = (lb5) obj2;
                return hw6Var.s(jg7.a);
            }

            @Override // defpackage.d20
            public final Object s(Object obj) {
                qm5 qm5Var = this.X;
                lb5 lb5Var = this.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (lb5Var != null && (qm5Var instanceof nm5) && nb3.k(((nm5) qm5Var).a, lb5Var.a)) {
                    return lb5Var;
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public final /* synthetic */ class AnonymousClass2 implements ne2, no2 {
            public final /* synthetic */ RetroAchievementsProfilePreference A;

            public AnonymousClass2(RetroAchievementsProfilePreference retroAchievementsProfilePreference) {
                this.A = retroAchievementsProfilePreference;
            }

            @Override // defpackage.ne2
            public final Object a(Object obj, r41 r41Var) {
                boolean z;
                lb5 lb5Var = (lb5) obj;
                RetroAchievementsProfilePreference retroAchievementsProfilePreference = this.A;
                retroAchievementsProfilePreference.A.setValue(lb5Var);
                if (lb5Var != null) {
                    z = true;
                } else {
                    z = false;
                }
                retroAchievementsProfilePreference.setVisible(z);
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                return jg7.a;
            }

            @Override // defpackage.no2
            public final ao2 b() {
                return new u9(2, 4, RetroAchievementsProfilePreference.class, this.A, "setProfile", "setProfile(Lme/magnum/rcheevosapi/model/RAUserProfile;)V");
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof ne2) && (obj instanceof no2)) {
                    return b().equals(((no2) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, RetroAchievementsProfilePreference retroAchievementsProfilePreference, r41 r41Var) {
            super(2, r41Var);
            this.Y = retroAchievementsPreferencesFragment;
            this.Z = retroAchievementsProfilePreference;
        }

        @Override // defpackage.eo2
        public final Object o(Object obj, Object obj2) {
            return ((AnonymousClass1) q((r41) obj2, (w61) obj)).s(jg7.a);
        }

        @Override // defpackage.d20
        public final r41 q(r41 r41Var, Object obj) {
            return new AnonymousClass1(this.Y, this.Z, r41Var);
        }

        @Override // defpackage.d20
        public final Object s(Object obj) {
            x61 x61Var = x61.COROUTINE_SUSPENDED;
            int i = this.X;
            jg7 jg7Var = jg7.a;
            if (i != 0) {
                if (i == 1) {
                    oi2.Y(obj);
                    return jg7Var;
                }
                defpackage.i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oi2.Y(obj);
            RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = this.Y;
            de5 de5Var = retroAchievementsPreferencesFragment.k().e;
            hw6 hw6Var = new hw6(3, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.Z);
            this.X = 1;
            Object o = nb3.o(this, anonymousClass2, jz.R, new o12(hw6Var, (r41) null, 5), new le2[]{(rp6) retroAchievementsPreferencesFragment.k().d.getValue(), de5Var});
            if (o != x61Var) {
                o = jg7Var;
            }
            if (o == x61Var) {
                return x61Var;
            }
            return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroAchievementsPreferencesFragment$onCreatePreferences$5(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, RetroAchievementsProfilePreference retroAchievementsProfilePreference, r41 r41Var) {
        super(2, r41Var);
        this.Y = retroAchievementsPreferencesFragment;
        this.Z = retroAchievementsProfilePreference;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((RetroAchievementsPreferencesFragment$onCreatePreferences$5) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new RetroAchievementsPreferencesFragment$onCreatePreferences$5(this.Y, this.Z, r41Var);
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
            tt3 tt3Var = tt3.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(retroAchievementsPreferencesFragment, this.Z, null);
            this.X = 1;
            if (np2.c0(lifecycle, tt3Var, anonymousClass1, this) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }
}
