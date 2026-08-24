package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RomsPreferencesFragment extends me.magnum.melonds.ui.settings.fragments.Hilt_RomsPreferencesFragment implements defpackage.q15 {
    public final defpackage.uo7 Z;
    public final defpackage.ex6 d0;
    public defpackage.wh7 e0;
    public defpackage.yj1 f0;
    public defpackage.jd6 g0;
    public androidx.preference.Preference h0;

    public RomsPreferencesFragment() {
            r5 = this;
            r5.<init>()
            me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$special$$inlined$viewModels$default$1 r0 = new me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$special$$inlined$viewModels$default$1
            r0.<init>(r5)
            xr3 r1 = defpackage.xr3.NONE
            me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$special$$inlined$viewModels$default$2 r2 = new me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$special$$inlined$viewModels$default$2
            r2.<init>(r0)
            go3 r0 = defpackage.kj2.M(r1, r2)
            java.lang.Class<yz5> r1 = defpackage.yz5.class
            ar0 r1 = defpackage.gh5.a(r1)
            me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$special$$inlined$viewModels$default$3 r2 = new me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$special$$inlined$viewModels$default$3
            r2.<init>(r0)
            me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$special$$inlined$viewModels$default$4 r3 = new me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$special$$inlined$viewModels$default$4
            r3.<init>(r0)
            me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$special$$inlined$viewModels$default$5 r4 = new me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$special$$inlined$viewModels$default$5
            r4.<init>(r5, r0)
            uo7 r0 = new uo7
            r0.<init>(r1, r2, r4, r3)
            r5.Z = r0
            er2 r0 = new er2
            r1 = 24
            r0.<init>(r5, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r5.d0 = r1
            return
    }

    @Override // defpackage.q15
    public final java.lang.String getTitle() {
            r1 = this;
            r0 = 2131951757(0x7f13008d, float:1.9539938E38)
            java.lang.String r1 = r1.getString(r0)
            r1.getClass()
            return r1
    }

    public final defpackage.jd6 k() {
            r0 = this;
            jd6 r0 = r0.g0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "settingsBackupManager"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }

    public final void l(androidx.preference.SeekBarPreference r5, int r6) {
            r4 = this;
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = (double) r6
            double r0 = java.lang.Math.pow(r0, r2)
            long r0 = (long) r0
            hj6 r6 = new hj6
            r2 = 134217728(0x8000000, double:6.63123685E-316)
            long r2 = r2 * r0
            r6.<init>(r2)
            android.content.Context r4 = r4.requireContext()
            r4.getClass()
            r0 = 0
            java.lang.String r4 = defpackage.oi2.x(r4, r6, r0)
            r5.setSummary(r4)
            return
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(android.os.Bundle r4, java.lang.String r5) {
            r3 = this;
            r4 = 2132148244(0x7f160014, float:1.993846E38)
            r3.setPreferencesFromResource(r4, r5)
            java.lang.String r4 = "rom_cache_max_size"
            androidx.preference.Preference r4 = r3.findPreference(r4)
            r4.getClass()
            androidx.preference.SeekBarPreference r4 = (androidx.preference.SeekBarPreference) r4
            java.lang.String r5 = "rom_cache_clear"
            androidx.preference.Preference r5 = r3.findPreference(r5)
            r5.getClass()
            r3.h0 = r5
            ex6 r5 = r3.d0
            java.lang.Object r5 = r5.getValue()
            p15 r5 = (defpackage.p15) r5
            java.lang.String r0 = "rom_search_dirs"
            androidx.preference.Preference r0 = r3.findPreference(r0)
            r0.getClass()
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r0 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference) r0
            z5 r1 = new z5
            r2 = 28
            r1.<init>(r3, r2)
            r5.c(r0, r1)
            int r5 = r4.A
            r3.l(r4, r5)
            zw r5 = new zw
            r0 = 5
            r5.<init>(r3, r0)
            r4.setOnPreferenceChangeListener(r5)
            androidx.preference.Preference r4 = r3.h0
            if (r4 == 0) goto L56
            h61 r5 = new h61
            r0 = 19
            r5.<init>(r3, r0)
            r4.setOnPreferenceClickListener(r5)
            return
        L56:
            java.lang.String r3 = "clearRomCachePreference"
            defpackage.nb3.a0(r3)
            r3 = 0
            throw r3
    }

    @Override // defpackage.k15, androidx.fragment.app.o
    public final void onViewCreated(android.view.View r2, android.os.Bundle r3) {
            r1 = this;
            r2.getClass()
            super.onViewCreated(r2, r3)
            au3 r2 = defpackage.bl2.C(r1)
            me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$onViewCreated$1 r3 = new me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$onViewCreated$1
            r0 = 0
            r3.<init>(r1, r0)
            r1 = 3
            defpackage.hv.L(r2, r0, r0, r3, r1)
            return
    }
}
