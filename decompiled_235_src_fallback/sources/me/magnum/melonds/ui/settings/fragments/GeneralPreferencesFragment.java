package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class GeneralPreferencesFragment extends me.magnum.melonds.ui.settings.fragments.Hilt_GeneralPreferencesFragment implements defpackage.q15 {
    public final defpackage.ex6 Z;
    public defpackage.wh7 d0;
    public defpackage.yj1 e0;
    public defpackage.jd6 f0;
    public com.smp.masterswitchpreference.MasterSwitchPreference g0;
    public androidx.preference.ListPreference h0;
    public final defpackage.d9 i0;
    public final defpackage.d9 j0;
    public final defpackage.fr2 k0;

    public GeneralPreferencesFragment() {
            r4 = this;
            r4.<init>()
            er2 r0 = new er2
            r1 = 0
            r0.<init>(r4, r1)
            ex6 r2 = new ex6
            r2.<init>(r0)
            r4.Z = r2
            c9 r0 = new c9
            r2 = 2
            r0.<init>(r2)
            me.magnum.melonds.ui.settings.fragments.b r3 = new me.magnum.melonds.ui.settings.fragments.b
            r3.<init>(r4, r1)
            d9 r0 = r4.registerForActivityResult(r0, r3)
            r0.getClass()
            r4.i0 = r0
            c9 r0 = new c9
            r0.<init>(r2)
            me.magnum.melonds.ui.settings.fragments.b r1 = new me.magnum.melonds.ui.settings.fragments.b
            r2 = 1
            r1.<init>(r4, r2)
            d9 r0 = r4.registerForActivityResult(r0, r1)
            r0.getClass()
            r4.j0 = r0
            fr2 r0 = new fr2
            r0.<init>(r4)
            r4.k0 = r0
            return
    }

    @Override // defpackage.q15
    public final java.lang.String getTitle() {
            r1 = this;
            r0 = 2131951755(0x7f13008b, float:1.9539933E38)
            java.lang.String r1 = r1.getString(r0)
            r1.getClass()
            return r1
    }

    public final void k() {
            r5 = this;
            android.content.Context r0 = r5.requireContext()
            android.content.SharedPreferences r0 = defpackage.v15.a(r0)
            java.lang.String r1 = "ra_hardcore_enabled"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            androidx.preference.ListPreference r1 = r5.h0
            r2 = 0
            java.lang.String r3 = "frameLimitSpeedPreference"
            if (r1 == 0) goto L40
            r4 = r0 ^ 1
            r1.setVisible(r4)
            if (r0 != 0) goto L3f
            androidx.preference.ListPreference r0 = r5.h0
            if (r0 == 0) goto L3b
            if (r0 == 0) goto L37
            java.lang.CharSequence r1 = r0.f()
            if (r1 != 0) goto L33
            r1 = 2131952302(0x7f1302ae, float:1.9541043E38)
            java.lang.String r1 = r5.getString(r1)
            r1.getClass()
        L33:
            r0.setSummary(r1)
            return
        L37:
            defpackage.nb3.a0(r3)
            throw r2
        L3b:
            defpackage.nb3.a0(r3)
            throw r2
        L3f:
            return
        L40:
            defpackage.nb3.a0(r3)
            throw r2
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(android.os.Bundle r5, java.lang.String r6) {
            r4 = this;
            r5 = 2132148237(0x7f16000d, float:1.9938446E38)
            r4.setPreferencesFromResource(r5, r6)
            r5 = 2132148238(0x7f16000e, float:1.9938448E38)
            r4.addPreferencesFromResource(r5)
            java.lang.String r5 = "enable_rewind"
            androidx.preference.Preference r5 = r4.findPreference(r5)
            r5.getClass()
            com.smp.masterswitchpreference.MasterSwitchPreference r5 = (com.smp.masterswitchpreference.MasterSwitchPreference) r5
            r4.g0 = r5
            java.lang.String r5 = "frame_limit_speed_multiplier"
            androidx.preference.Preference r5 = r4.findPreference(r5)
            r5.getClass()
            androidx.preference.ListPreference r5 = (androidx.preference.ListPreference) r5
            r4.h0 = r5
            java.lang.String r5 = "enable_sustained_performance"
            androidx.preference.Preference r5 = r4.findPreference(r5)
            r5.getClass()
            androidx.preference.SwitchPreference r5 = (androidx.preference.SwitchPreference) r5
            java.lang.String r6 = "theme"
            androidx.preference.Preference r6 = r4.findPreference(r6)
            androidx.preference.ListPreference r6 = (androidx.preference.ListPreference) r6
            r0 = 1
            ex6 r1 = r4.Z
            if (r6 == 0) goto L52
            java.lang.Object r2 = r1.getValue()
            p15 r2 = (defpackage.p15) r2
            r2.getClass()
            defpackage.p15.a(r6)
            zw r2 = new zw
            r2.<init>(r4, r0)
            r6.setOnPreferenceChangeListener(r2)
        L52:
            java.lang.Object r6 = r1.getValue()
            p15 r6 = (defpackage.p15) r6
            com.smp.masterswitchpreference.MasterSwitchPreference r2 = r4.g0
            r3 = 0
            if (r2 == 0) goto Lca
            r6.getClass()
            defpackage.p15.a(r2)
            java.lang.Object r6 = r1.getValue()
            p15 r6 = (defpackage.p15) r6
            androidx.preference.ListPreference r1 = r4.h0
            java.lang.String r2 = "frameLimitSpeedPreference"
            if (r1 == 0) goto Lc6
            r6.getClass()
            defpackage.p15.a(r1)
            r4.k()
            android.content.Context r6 = r4.requireContext()
            r6.getClass()
            java.lang.String r1 = "power"
            java.lang.Object r6 = r6.getSystemService(r1)
            r6.getClass()
            android.os.PowerManager r6 = (android.os.PowerManager) r6
            boolean r6 = r6.isSustainedPerformanceModeSupported()
            r5.setVisible(r6)
            androidx.preference.ListPreference r5 = r4.h0
            if (r5 == 0) goto Lc2
            android.content.SharedPreferences r5 = r5.getSharedPreferences()
            if (r5 == 0) goto La0
            fr2 r6 = r4.k0
            r5.registerOnSharedPreferenceChangeListener(r6)
        La0:
            java.lang.String r5 = "backup_settings"
            androidx.preference.Preference r5 = r4.findPreference(r5)
            if (r5 == 0) goto Lb1
            gr2 r6 = new gr2
            r1 = 0
            r6.<init>(r4, r1)
            r5.setOnPreferenceClickListener(r6)
        Lb1:
            java.lang.String r5 = "restore_settings"
            androidx.preference.Preference r5 = r4.findPreference(r5)
            if (r5 == 0) goto Lc1
            gr2 r6 = new gr2
            r6.<init>(r4, r0)
            r5.setOnPreferenceClickListener(r6)
        Lc1:
            return
        Lc2:
            defpackage.nb3.a0(r2)
            throw r3
        Lc6:
            defpackage.nb3.a0(r2)
            throw r3
        Lca:
            java.lang.String r4 = "rewindPreference"
            defpackage.nb3.a0(r4)
            throw r3
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
            r2 = this;
            androidx.preference.ListPreference r0 = r2.h0
            if (r0 == 0) goto L13
            android.content.SharedPreferences r0 = r0.getSharedPreferences()
            if (r0 == 0) goto Lf
            fr2 r1 = r2.k0
            r0.unregisterOnSharedPreferenceChangeListener(r1)
        Lf:
            super.onDestroy()
            return
        L13:
            java.lang.String r2 = "frameLimitSpeedPreference"
            defpackage.nb3.a0(r2)
            r2 = 0
            throw r2
    }

    @Override // me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment, androidx.fragment.app.o
    public final void onResume() {
            r6 = this;
            super.onResume()
            com.smp.masterswitchpreference.MasterSwitchPreference r0 = r6.g0
            java.lang.String r1 = "rewindPreference"
            r2 = 0
            if (r0 == 0) goto L42
            x05 r0 = r0.getOnPreferenceChangeListener()
            if (r0 == 0) goto L3e
            com.smp.masterswitchpreference.MasterSwitchPreference r3 = r6.g0
            if (r3 == 0) goto L3a
            if (r3 == 0) goto L36
            android.content.SharedPreferences r4 = r3.getSharedPreferences()
            if (r4 == 0) goto L32
            com.smp.masterswitchpreference.MasterSwitchPreference r5 = r6.g0
            if (r5 == 0) goto L2e
            java.lang.String r1 = r5.getKey()
            r2 = 0
            boolean r1 = r4.getBoolean(r1, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            goto L32
        L2e:
            defpackage.nb3.a0(r1)
            throw r2
        L32:
            r0.a(r3, r2)
            goto L3e
        L36:
            defpackage.nb3.a0(r1)
            throw r2
        L3a:
            defpackage.nb3.a0(r1)
            throw r2
        L3e:
            r6.k()
            return
        L42:
            defpackage.nb3.a0(r1)
            throw r2
    }
}
