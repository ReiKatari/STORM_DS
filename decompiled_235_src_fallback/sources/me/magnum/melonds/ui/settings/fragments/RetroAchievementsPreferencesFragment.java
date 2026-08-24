package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RetroAchievementsPreferencesFragment extends me.magnum.melonds.ui.settings.fragments.Hilt_RetroAchievementsPreferencesFragment implements defpackage.q15 {
    public final defpackage.uo7 Z;
    public defpackage.cn5 d0;
    public defpackage.vx3 e0;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class EndpointPreferenceState {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final defpackage.en5 d;

        public EndpointPreferenceState(boolean r1, boolean r2, boolean r3, defpackage.en5 r4) {
                r0 = this;
                r4.getClass()
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment.EndpointPreferenceState
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$EndpointPreferenceState r5 = (me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment.EndpointPreferenceState) r5
                boolean r1 = r4.a
                boolean r3 = r5.a
                if (r1 == r3) goto L13
                return r2
            L13:
                boolean r1 = r4.b
                boolean r3 = r5.b
                if (r1 == r3) goto L1a
                return r2
            L1a:
                boolean r1 = r4.c
                boolean r3 = r5.c
                if (r1 == r3) goto L21
                return r2
            L21:
                en5 r4 = r4.d
                en5 r5 = r5.d
                boolean r4 = defpackage.nb3.k(r4, r5)
                if (r4 != 0) goto L2c
                return r2
            L2c:
                return r0
        }

        public final int hashCode() {
                r3 = this;
                boolean r0 = r3.a
                int r0 = java.lang.Boolean.hashCode(r0)
                r1 = 31
                int r0 = r0 * r1
                boolean r2 = r3.b
                int r0 = defpackage.xg6.e(r0, r2, r1)
                boolean r2 = r3.c
                int r0 = defpackage.xg6.e(r0, r2, r1)
                en5 r3 = r3.d
                int r3 = r3.hashCode()
                int r3 = r3 + r0
                return r3
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "EndpointPreferenceState(isLoggedIn="
                r0.<init>(r1)
                boolean r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = ", isRetroAchievementsEnabled="
                r0.append(r1)
                boolean r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = ", isHardcoreEnabled="
                r0.append(r1)
                boolean r1 = r2.c
                r0.append(r1)
                java.lang.String r1 = ", endpoint="
                r0.append(r1)
                en5 r2 = r2.d
                r0.append(r2)
                java.lang.String r2 = ")"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }
    }

    public RetroAchievementsPreferencesFragment() {
            r5 = this;
            r5.<init>()
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$1 r0 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$1
            r0.<init>(r5)
            xr3 r1 = defpackage.xr3.NONE
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$2 r2 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$2
            r2.<init>(r0)
            go3 r0 = defpackage.kj2.M(r1, r2)
            java.lang.Class<sn5> r1 = defpackage.sn5.class
            ar0 r1 = defpackage.gh5.a(r1)
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$3 r2 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$3
            r2.<init>(r0)
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$4 r3 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$4
            r3.<init>(r0)
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$5 r4 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$5
            r4.<init>(r5, r0)
            uo7 r0 = new uo7
            r0.<init>(r1, r2, r4, r3)
            r5.Z = r0
            return
    }

    @Override // defpackage.q15
    public final java.lang.String getTitle() {
            r1 = this;
            r0 = 2131952479(0x7f13035f, float:1.9541402E38)
            java.lang.String r1 = r1.getString(r0)
            r1.getClass()
            return r1
    }

    public final defpackage.sn5 k() {
            r0 = this;
            uo7 r0 = r0.Z
            java.lang.Object r0 = r0.getValue()
            sn5 r0 = (defpackage.sn5) r0
            return r0
    }

    public final void l() {
            r2 = this;
            zb r0 = new zb
            android.content.Context r2 = r2.requireContext()
            r0.<init>(r2)
            r2 = 2131952479(0x7f13035f, float:1.9541402E38)
            r0.z(r2)
            r2 = 2131952480(0x7f130360, float:1.9541404E38)
            r0.w(r2)
            r2 = 17039370(0x104000a, float:2.42446E-38)
            r1 = 0
            r0.y(r2, r1)
            r0.B()
            return
    }

    public final void m(java.lang.String r6) {
            r5 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r5.requireContext()
            r2 = 2132017493(0x7f140155, float:1.9673266E38)
            r0.<init>(r1, r2)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r2 = 2131623994(0x7f0e003a, float:1.8875155E38)
            r3 = 0
            r4 = 0
            android.view.View r1 = r1.inflate(r2, r4, r3)
            r2 = 2131427997(0x7f0b029d, float:1.8477626E38)
            android.view.View r3 = defpackage.gi2.B(r1, r2)
            com.google.android.material.textfield.TextInputEditText r3 = (com.google.android.material.textfield.TextInputEditText) r3
            if (r3 == 0) goto L69
            r2 = 2131428003(0x7f0b02a3, float:1.8477638E38)
            android.view.View r4 = defpackage.gi2.B(r1, r2)
            com.google.android.material.textfield.TextInputEditText r4 = (com.google.android.material.textfield.TextInputEditText) r4
            if (r4 == 0) goto L69
            yc1 r2 = new yc1
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2.<init>()
            r2.A = r3
            r2.B = r4
            if (r6 == 0) goto L3f
            r4.setText(r6)
        L3f:
            zb r6 = new zb
            r6.<init>(r0)
            r0 = 2131952164(0x7f130224, float:1.9540763E38)
            r6.z(r0)
            r6.A(r1)
            nu1 r0 = new nu1
            r1 = 4
            r0.<init>(r1, r5, r2)
            r5 = 2131952163(0x7f130223, float:1.954076E38)
            r6.y(r5, r0)
            qo0 r5 = new qo0
            r0 = 5
            r5.<init>(r0)
            r0 = 2131951750(0x7f130086, float:1.9539923E38)
            r6.x(r0, r5)
            r6.B()
            return
        L69:
            android.content.res.Resources r5 = r1.getResources()
            java.lang.String r5 = r5.getResourceName(r2)
            java.lang.String r6 = "Missing required view with ID: "
            java.lang.String r5 = r6.concat(r5)
            defpackage.u34.x(r5)
            return
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(android.os.Bundle r14, java.lang.String r15) {
            r13 = this;
            r14 = 2132148242(0x7f160012, float:1.9938456E38)
            r13.setPreferencesFromResource(r14, r15)
            java.lang.String r14 = "ra_login"
            androidx.preference.Preference r14 = r13.findPreference(r14)
            r14.getClass()
            java.lang.String r15 = "ra_profile"
            androidx.preference.Preference r15 = r13.findPreference(r15)
            r15.getClass()
            me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference r15 = (me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference) r15
            java.lang.String r0 = "ra_enabled"
            androidx.preference.Preference r0 = r13.findPreference(r0)
            r0.getClass()
            r3 = r0
            androidx.preference.SwitchPreference r3 = (androidx.preference.SwitchPreference) r3
            java.lang.String r0 = "ra_hardcore_enabled"
            androidx.preference.Preference r0 = r13.findPreference(r0)
            r0.getClass()
            r4 = r0
            androidx.preference.SwitchPreference r4 = (androidx.preference.SwitchPreference) r4
            java.lang.String r0 = "ra_rich_presence"
            androidx.preference.Preference r0 = r13.findPreference(r0)
            r0.getClass()
            r7 = r0
            androidx.preference.SwitchPreference r7 = (androidx.preference.SwitchPreference) r7
            java.lang.String r0 = "ra_offline_backend"
            androidx.preference.Preference r0 = r13.findPreference(r0)
            r0.getClass()
            r8 = r0
            androidx.preference.ListPreference r8 = (androidx.preference.ListPreference) r8
            java.lang.String r0 = "ra_offline_softcore_enabled"
            androidx.preference.Preference r0 = r13.findPreference(r0)
            r0.getClass()
            r6 = r0
            androidx.preference.SwitchPreference r6 = (androidx.preference.SwitchPreference) r6
            java.lang.String r0 = "ra_unofficial_enabled"
            androidx.preference.Preference r0 = r13.findPreference(r0)
            r0.getClass()
            java.lang.String r1 = "ra_encore_enabled"
            androidx.preference.Preference r1 = r13.findPreference(r1)
            r1.getClass()
            java.lang.String r2 = "ra_active_challenge_indicators"
            androidx.preference.Preference r2 = r13.findPreference(r2)
            r2.getClass()
            java.lang.String r5 = "ra_progress_indicators"
            androidx.preference.Preference r5 = r13.findPreference(r5)
            r5.getClass()
            java.lang.String r9 = "ra_leaderboard_indicators"
            androidx.preference.Preference r9 = r13.findPreference(r9)
            r9.getClass()
            r10 = 8
            androidx.preference.Preference[] r10 = new androidx.preference.Preference[r10]
            r11 = 0
            r10[r11] = r4
            r11 = 1
            r10[r11] = r0
            r0 = 2
            r10[r0] = r1
            r0 = 3
            r10[r0] = r8
            r1 = 4
            r10[r1] = r6
            r12 = 5
            r10[r12] = r2
            r2 = 6
            r10[r2] = r5
            r2 = 7
            r10[r2] = r9
            java.util.List r5 = defpackage.hf.c0(r10)
            yw r2 = new yw
            r2.<init>(r11, r13, r7)
            defpackage.yh2.g(r4, r2)
            zw r2 = new zw
            r2.<init>(r13, r1)
            defpackage.yh2.g(r8, r2)
            h61 r1 = new h61
            r2 = 18
            r1.<init>(r13, r2)
            r14.setOnPreferenceClickListener(r1)
            au3 r1 = defpackage.bl2.C(r13)
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4 r2 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4
            r10 = 0
            r2.<init>(r13, r14, r10)
            defpackage.hv.L(r1, r10, r10, r2, r0)
            au3 r14 = defpackage.bl2.C(r13)
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5 r1 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$5
            r1.<init>(r13, r15, r10)
            defpackage.hv.L(r14, r10, r10, r1, r0)
            au3 r14 = defpackage.bl2.C(r13)
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6 r1 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6
            r9 = 0
            r2 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            defpackage.hv.L(r14, r10, r10, r1, r0)
            au3 r13 = defpackage.bl2.C(r2)
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$7 r14 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$7
            r14.<init>(r2, r10)
            defpackage.hv.L(r13, r10, r10, r14, r0)
            au3 r13 = defpackage.bl2.C(r2)
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$8 r14 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$8
            r14.<init>(r2, r10)
            defpackage.hv.L(r13, r10, r10, r14, r0)
            return
    }
}
