package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class SystemPreferencesFragment extends me.magnum.melonds.ui.settings.fragments.Hilt_SystemPreferencesFragment implements defpackage.q15 {
    public defpackage.wh7 Z;
    public defpackage.yj1 d0;
    public defpackage.jd6 e0;
    public final defpackage.ex6 f0;
    public boolean g0;
    public final defpackage.d9 h0;
    public final defpackage.d9 i0;
    public final defpackage.d9 j0;
    public final defpackage.d9 k0;

    public SystemPreferencesFragment() {
            r4 = this;
            r4.<init>()
            t46 r0 = new t46
            r1 = 11
            r0.<init>(r4, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r4.f0 = r1
            c9 r0 = new c9
            r1 = 2
            r0.<init>(r1)
            me.magnum.melonds.ui.settings.fragments.c r2 = new me.magnum.melonds.ui.settings.fragments.c
            r3 = 0
            r2.<init>(r4, r3)
            d9 r0 = r4.registerForActivityResult(r0, r2)
            r0.getClass()
            r4.h0 = r0
            c9 r0 = new c9
            r0.<init>(r1)
            me.magnum.melonds.ui.settings.fragments.c r2 = new me.magnum.melonds.ui.settings.fragments.c
            r3 = 1
            r2.<init>(r4, r3)
            d9 r0 = r4.registerForActivityResult(r0, r2)
            r0.getClass()
            r4.i0 = r0
            c9 r0 = new c9
            r0.<init>(r1)
            me.magnum.melonds.ui.settings.fragments.c r2 = new me.magnum.melonds.ui.settings.fragments.c
            r2.<init>(r4, r1)
            d9 r0 = r4.registerForActivityResult(r0, r2)
            r0.getClass()
            r4.j0 = r0
            c9 r0 = new c9
            r0.<init>(r1)
            me.magnum.melonds.ui.settings.fragments.c r1 = new me.magnum.melonds.ui.settings.fragments.c
            r2 = 3
            r1.<init>(r4, r2)
            d9 r0 = r4.registerForActivityResult(r0, r1)
            r0.getClass()
            r4.k0 = r0
            return
    }

    @Override // defpackage.q15
    public final java.lang.String getTitle() {
            r1 = this;
            r0 = 2131951761(0x7f130091, float:1.9539946E38)
            java.lang.String r1 = r1.getString(r0)
            r1.getClass()
            return r1
    }

    public final defpackage.jd6 k() {
            r0 = this;
            jd6 r0 = r0.e0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "settingsBackupManager"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(android.os.Bundle r6, java.lang.String r7) {
            r5 = this;
            r6 = 2132148246(0x7f160016, float:1.9938465E38)
            r5.setPreferencesFromResource(r6, r7)
            java.lang.String r6 = "enable_jit"
            androidx.preference.Preference r6 = r5.findPreference(r6)
            r6.getClass()
            androidx.preference.SwitchPreference r6 = (androidx.preference.SwitchPreference) r6
            java.lang.String r7 = "save_internal_config_as_file"
            androidx.preference.Preference r7 = r5.findPreference(r7)
            r7.getClass()
            androidx.preference.SwitchPreference r7 = (androidx.preference.SwitchPreference) r7
            java.lang.String r0 = "system_dldi_sd_card_dir"
            androidx.preference.Preference r0 = r5.findPreference(r0)
            r0.getClass()
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r0 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference) r0
            java.lang.String r1 = "app_language"
            androidx.preference.Preference r1 = r5.findPreference(r1)
            androidx.preference.ListPreference r1 = (androidx.preference.ListPreference) r1
            r2 = 1
            if (r1 == 0) goto L3a
            l15 r3 = new l15
            r3.<init>(r2)
            r1.setOnPreferenceChangeListener(r3)
        L3a:
            java.lang.String[] r1 = android.os.Build.SUPPORTED_64_BIT_ABIS
            r1.getClass()
            int r1 = r1.length
            r3 = 0
            if (r1 != 0) goto L49
            r6.e(r3)
            r6.setVisible(r3)
        L49:
            ex6 r6 = r5.f0
            java.lang.Object r1 = r6.getValue()
            p15 r1 = (defpackage.p15) r1
            r4 = 0
            r1.c(r0, r4)
            java.lang.Object r6 = r6.getValue()
            p15 r6 = (defpackage.p15) r6
            java.lang.String r0 = "system_dldi_sd_card_image_size"
            androidx.preference.Preference r0 = r5.findPreference(r0)
            r6.getClass()
            defpackage.p15.a(r0)
            java.lang.String r6 = "pref_open_dldi_file_manager"
            androidx.preference.Preference r6 = r5.findPreference(r6)
            r0 = 2
            if (r6 == 0) goto L78
            vx6 r1 = new vx6
            r1.<init>(r5, r0)
            r6.setOnPreferenceClickListener(r1)
        L78:
            yw r6 = new yw
            r6.<init>(r0, r5, r7)
            r7.setOnPreferenceChangeListener(r6)
            java.lang.String r6 = "backup_internal_layout"
            androidx.preference.Preference r6 = r5.findPreference(r6)
            if (r6 == 0) goto L91
            vx6 r7 = new vx6
            r0 = 3
            r7.<init>(r5, r0)
            r6.setOnPreferenceClickListener(r7)
        L91:
            java.lang.String r6 = "backup_external_layout"
            androidx.preference.Preference r6 = r5.findPreference(r6)
            if (r6 == 0) goto La2
            vx6 r7 = new vx6
            r0 = 4
            r7.<init>(r5, r0)
            r6.setOnPreferenceClickListener(r7)
        La2:
            java.lang.String r6 = "restore_internal_layout"
            androidx.preference.Preference r6 = r5.findPreference(r6)
            if (r6 == 0) goto Lb2
            vx6 r7 = new vx6
            r7.<init>(r5, r3)
            r6.setOnPreferenceClickListener(r7)
        Lb2:
            java.lang.String r6 = "restore_external_layout"
            androidx.preference.Preference r6 = r5.findPreference(r6)
            if (r6 == 0) goto Lc2
            vx6 r7 = new vx6
            r7.<init>(r5, r2)
            r6.setOnPreferenceClickListener(r7)
        Lc2:
            return
    }
}
