package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class CustomFirmwarePreferencesFragment extends me.magnum.melonds.ui.settings.fragments.Hilt_CustomFirmwarePreferencesFragment implements defpackage.q15 {
    public final defpackage.uo7 Z;
    public final defpackage.ex6 d0;
    public defpackage.wh7 e0;
    public defpackage.yj1 f0;
    public defpackage.m40 g0;

    public CustomFirmwarePreferencesFragment() {
            r5 = this;
            r5.<init>()
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$1 r0 = new me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$1
            r0.<init>(r5)
            xr3 r1 = defpackage.xr3.NONE
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$2 r2 = new me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$2
            r2.<init>(r0)
            go3 r0 = defpackage.kj2.M(r1, r2)
            java.lang.Class<k81> r1 = defpackage.k81.class
            ar0 r1 = defpackage.gh5.a(r1)
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$3 r2 = new me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$3
            r2.<init>(r0)
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$4 r3 = new me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$4
            r3.<init>(r0)
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$5 r4 = new me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$5
            r4.<init>(r5, r0)
            uo7 r0 = new uo7
            r0.<init>(r1, r2, r4, r3)
            r5.Z = r0
            a5 r0 = new a5
            r1 = 21
            r0.<init>(r5, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r5.d0 = r1
            return
    }

    @Override // defpackage.q15
    public final java.lang.String getTitle() {
            r1 = this;
            r0 = 2131951835(0x7f1300db, float:1.9540096E38)
            java.lang.String r1 = r1.getString(r0)
            r1.getClass()
            return r1
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(android.os.Bundle r5, java.lang.String r6) {
            r4 = this;
            r5 = 2132148236(0x7f16000c, float:1.9938444E38)
            r4.setPreferencesFromResource(r5, r6)
            java.lang.String r5 = "bios_dir"
            androidx.preference.Preference r5 = r4.findPreference(r5)
            r5.getClass()
            me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference r5 = (me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference) r5
            java.lang.String r6 = "dsi_bios_dir"
            androidx.preference.Preference r6 = r4.findPreference(r6)
            r6.getClass()
            me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference r6 = (me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference) r6
            ex6 r0 = r4.d0
            java.lang.Object r1 = r0.getValue()
            p15 r1 = (defpackage.p15) r1
            r2 = 0
            r1.c(r5, r2)
            java.lang.Object r0 = r0.getValue()
            p15 r0 = (defpackage.p15) r0
            r0.c(r6, r2)
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 r0 = new me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1
            r0.<init>(r4)
            r5.Z = r0
            r6.Z = r0
            java.lang.String r0 = "auto_download_ds_bios"
            androidx.preference.Preference r0 = r4.findPreference(r0)
            java.lang.String r1 = "auto_download_dsi_bios"
            androidx.preference.Preference r1 = r4.findPreference(r1)
            if (r0 == 0) goto L51
            me.magnum.melonds.ui.settings.fragments.a r2 = new me.magnum.melonds.ui.settings.fragments.a
            r3 = 0
            r2.<init>(r4, r5, r3)
            r0.setOnPreferenceClickListener(r2)
        L51:
            r5 = 1
            if (r1 == 0) goto L5c
            me.magnum.melonds.ui.settings.fragments.a r0 = new me.magnum.melonds.ui.settings.fragments.a
            r0.<init>(r4, r6, r5)
            r1.setOnPreferenceClickListener(r0)
        L5c:
            java.lang.String r6 = "show_bios"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.String r0 = "use_custom_bios"
            r4.h(r0, r6, r5)
            return
    }
}
