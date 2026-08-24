package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class AudioPreferencesFragment extends me.magnum.melonds.ui.settings.fragments.Hilt_AudioPreferencesFragment implements defpackage.q15 {
    public androidx.preference.ListPreference Z;
    public final defpackage.d9 d0;

    public AudioPreferencesFragment() {
            r3 = this;
            r3.<init>()
            c9 r0 = new c9
            r1 = 4
            r0.<init>(r1)
            k9 r1 = new k9
            r2 = 1
            r1.<init>(r3, r2)
            d9 r0 = r3.registerForActivityResult(r0, r1)
            r0.getClass()
            r3.d0 = r0
            return
    }

    @Override // defpackage.q15
    public final java.lang.String getTitle() {
            r1 = this;
            r0 = 2131951753(0x7f130089, float:1.953993E38)
            java.lang.String r1 = r1.getString(r0)
            r1.getClass()
            return r1
    }

    public final void k(boolean r3) {
            r2 = this;
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            if (r3 != 0) goto L2f
            boolean r3 = r2.shouldShowRequestPermissionRationale(r0)
            if (r3 == 0) goto L2f
            zb r3 = new zb
            android.content.Context r0 = r2.requireContext()
            r3.<init>(r0)
            r0 = 2131952212(0x7f130254, float:1.954086E38)
            r3.z(r0)
            r0 = 2131952213(0x7f130255, float:1.9540862E38)
            r3.w(r0)
            ax r0 = new ax
            r1 = 0
            r0.<init>(r2, r1)
            r2 = 2131952357(0x7f1302e5, float:1.9541154E38)
            r3.y(r2, r0)
            r3.B()
            return
        L2f:
            d9 r2 = r2.d0
            r2.a(r0)
            return
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(android.os.Bundle r4, java.lang.String r5) {
            r3 = this;
            r4 = 2132148234(0x7f16000a, float:1.993844E38)
            r3.setPreferencesFromResource(r4, r5)
            java.lang.String r4 = "volume"
            androidx.preference.Preference r5 = r3.findPreference(r4)
            androidx.preference.SeekBarPreference r5 = (androidx.preference.SeekBarPreference) r5
            java.lang.String r0 = "mic_source"
            androidx.preference.Preference r0 = r3.findPreference(r0)
            androidx.preference.ListPreference r0 = (androidx.preference.ListPreference) r0
            r3.Z = r0
            r0 = 0
            if (r5 == 0) goto L40
            int r1 = r5.A
            float r1 = (float) r1
            int r2 = r5.L
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 2131952898(0x7f130502, float:1.9542252E38)
            java.lang.String r1 = r3.getString(r2, r1)
            r5.setSummary(r1)
            yw r1 = new yw
            r1.<init>(r0, r3, r5)
            r5.setOnPreferenceChangeListener(r1)
        L40:
            androidx.preference.ListPreference r5 = r3.Z
            if (r5 == 0) goto L4c
            zw r1 = new zw
            r1.<init>(r3, r0)
            r5.setOnPreferenceChangeListener(r1)
        L4c:
            java.lang.String r5 = "audio_bitrate"
            java.lang.String r0 = "audio_latency"
            java.lang.String r1 = "audio_interpolation"
            java.lang.String[] r4 = new java.lang.String[]{r1, r5, r4, r0}
            r5 = 1
            java.lang.String r0 = "sound_enabled"
            r3.h(r0, r4, r5)
            return
    }
}
