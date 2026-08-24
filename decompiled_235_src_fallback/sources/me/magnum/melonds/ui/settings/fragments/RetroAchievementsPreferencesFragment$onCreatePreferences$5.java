package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5", f = "RetroAchievementsPreferencesFragment.kt", l = {159}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RetroAchievementsPreferencesFragment$onCreatePreferences$5 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment Y;
    public final /* synthetic */ me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference Z;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1", f = "RetroAchievementsPreferencesFragment.kt", l = {165}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends defpackage.hw6 implements defpackage.eo2 {
        public int X;
        public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment Y;
        public final /* synthetic */ me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference Z;

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        @defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1$1", f = "RetroAchievementsPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        final class C00061 extends defpackage.hw6 implements defpackage.fo2 {
            public /* synthetic */ defpackage.qm5 X;
            public /* synthetic */ defpackage.lb5 Y;

            @Override // defpackage.fo2
            public final java.lang.Object e(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
                    r1 = this;
                    qm5 r2 = (defpackage.qm5) r2
                    lb5 r3 = (defpackage.lb5) r3
                    r41 r4 = (defpackage.r41) r4
                    me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1$1 r1 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1$1
                    r0 = 3
                    r1.<init>(r0, r4)
                    r1.X = r2
                    r1.Y = r3
                    jg7 r2 = defpackage.jg7.a
                    java.lang.Object r1 = r1.s(r2)
                    return r1
            }

            @Override // defpackage.d20
            public final java.lang.Object s(java.lang.Object r3) {
                    r2 = this;
                    qm5 r0 = r2.X
                    lb5 r2 = r2.Y
                    x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
                    defpackage.oi2.Y(r3)
                    if (r2 == 0) goto L1c
                    boolean r3 = r0 instanceof defpackage.nm5
                    if (r3 == 0) goto L1c
                    nm5 r0 = (defpackage.nm5) r0
                    java.lang.String r3 = r0.a
                    java.lang.String r0 = r2.a
                    boolean r3 = defpackage.nb3.k(r3, r0)
                    if (r3 == 0) goto L1c
                    return r2
                L1c:
                    r2 = 0
                    return r2
            }
        }

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        final /* synthetic */ class AnonymousClass2 implements defpackage.ne2, defpackage.no2 {
            public final /* synthetic */ me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference A;

            public AnonymousClass2(me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference r1) {
                    r0 = this;
                    r0.<init>()
                    r0.A = r1
                    return
            }

            @Override // defpackage.ne2
            public final java.lang.Object a(java.lang.Object r1, defpackage.r41 r2) {
                    r0 = this;
                    lb5 r1 = (defpackage.lb5) r1
                    me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference r0 = r0.A
                    vs4 r2 = r0.A
                    r2.setValue(r1)
                    if (r1 == 0) goto Ld
                    r1 = 1
                    goto Le
                Ld:
                    r1 = 0
                Le:
                    r0.setVisible(r1)
                    x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
                    jg7 r0 = defpackage.jg7.a
                    return r0
            }

            @Override // defpackage.no2
            public final defpackage.ao2 b() {
                    r7 = this;
                    u9 r0 = new u9
                    java.lang.String r6 = "setProfile(Lme/magnum/rcheevosapi/model/RAUserProfile;)V"
                    r2 = 4
                    r1 = 2
                    java.lang.Class<me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference> r3 = me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference.class
                    me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference r4 = r7.A
                    java.lang.String r5 = "setProfile"
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r0
            }

            public final boolean equals(java.lang.Object r2) {
                    r1 = this;
                    boolean r0 = r2 instanceof defpackage.ne2
                    if (r0 == 0) goto L17
                    boolean r0 = r2 instanceof defpackage.no2
                    if (r0 == 0) goto L17
                    ao2 r1 = r1.b()
                    no2 r2 = (defpackage.no2) r2
                    ao2 r2 = r2.b()
                    boolean r1 = r1.equals(r2)
                    return r1
                L17:
                    r1 = 0
                    return r1
            }

            public final int hashCode() {
                    r0 = this;
                    ao2 r0 = r0.b()
                    int r0 = r0.hashCode()
                    return r0
            }
        }

        public AnonymousClass1(me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment r1, me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference r2, defpackage.r41 r3) {
                r0 = this;
                r0.Y = r1
                r0.Z = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // defpackage.eo2
        public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                w61 r1 = (defpackage.w61) r1
                r41 r2 = (defpackage.r41) r2
                r41 r0 = r0.q(r2, r1)
                me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1 r0 = (me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5.AnonymousClass1) r0
                jg7 r1 = defpackage.jg7.a
                java.lang.Object r0 = r0.s(r1)
                return r0
        }

        @Override // defpackage.d20
        public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
                r1 = this;
                me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1 r3 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1
                me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment r0 = r1.Y
                me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference r1 = r1.Z
                r3.<init>(r0, r1, r2)
                return r3
        }

        @Override // defpackage.d20
        public final java.lang.Object s(java.lang.Object r10) {
                r9 = this;
                x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
                int r1 = r9.X
                jg7 r2 = defpackage.jg7.a
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L16
                if (r1 != r4) goto L10
                defpackage.oi2.Y(r10)
                return r2
            L10:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.i.m(r9)
                return r3
            L16:
                defpackage.oi2.Y(r10)
                me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment r10 = r9.Y
                sn5 r1 = r10.k()
                ex6 r1 = r1.d
                java.lang.Object r1 = r1.getValue()
                rp6 r1 = (defpackage.rp6) r1
                sn5 r10 = r10.k()
                de5 r10 = r10.e
                me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1$1 r5 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1$1
                r6 = 3
                r5.<init>(r6, r3)
                me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1$2 r6 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1$2
                me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference r7 = r9.Z
                r6.<init>(r7)
                r9.X = r4
                r7 = 2
                le2[] r7 = new defpackage.le2[r7]
                r8 = 0
                r7[r8] = r1
                r7[r4] = r10
                jz r10 = defpackage.jz.R
                o12 r1 = new o12
                r4 = 5
                r1.<init>(r5, r3, r4)
                java.lang.Object r9 = defpackage.nb3.o(r9, r6, r10, r1, r7)
                if (r9 != r0) goto L53
                goto L54
            L53:
                r9 = r2
            L54:
                if (r9 != r0) goto L57
                return r0
            L57:
                return r2
        }
    }

    public RetroAchievementsPreferencesFragment$onCreatePreferences$5(me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment r1, me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference r2, defpackage.r41 r3) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5 r0 = (me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5 r3 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment r0 = r1.Y
            me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference r1 = r1.Z
            r3.<init>(r0, r1, r2)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r7.X
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 != r3) goto Le
            defpackage.oi2.Y(r8)
            goto L32
        Le:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r2
        L14:
            defpackage.oi2.Y(r8)
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment r8 = r7.Y
            ut3 r1 = r8.getLifecycle()
            r1.getClass()
            tt3 r4 = defpackage.tt3.STARTED
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1 r5 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5$1
            me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference r6 = r7.Z
            r5.<init>(r8, r6, r2)
            r7.X = r3
            java.lang.Object r7 = defpackage.np2.c0(r1, r4, r5, r7)
            if (r7 != r0) goto L32
            return r0
        L32:
            jg7 r7 = defpackage.jg7.a
            return r7
    }
}
