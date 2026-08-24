package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class TranslatorPreferencesFragment extends me.magnum.melonds.ui.settings.fragments.Hilt_TranslatorPreferencesFragment implements defpackage.q15 {
    public TranslatorPreferencesFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.q15
    public final java.lang.String getTitle() {
            r1 = this;
            r0 = 2131951763(0x7f130093, float:1.953995E38)
            java.lang.String r1 = r1.getString(r0)
            r1.getClass()
            return r1
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(android.os.Bundle r3, java.lang.String r4) {
            r2 = this;
            r3 = 2132148247(0x7f160017, float:1.9938467E38)
            r2.setPreferencesFromResource(r3, r4)
            java.lang.String r3 = "translator_tts_voice_engine"
            androidx.preference.Preference r3 = r2.findPreference(r3)
            androidx.preference.ListPreference r3 = (androidx.preference.ListPreference) r3
            java.lang.String r4 = "translator_local_voice_actor_studio"
            androidx.preference.Preference r4 = r2.findPreference(r4)
            androidx.preference.SwitchPreferenceCompat r4 = (androidx.preference.SwitchPreferenceCompat) r4
            if (r3 == 0) goto L21
            yw r0 = new yw
            r1 = 3
            r0.<init>(r1, r4, r2)
            r3.setOnPreferenceChangeListener(r0)
        L21:
            if (r4 == 0) goto L2c
            yw r0 = new yw
            r1 = 4
            r0.<init>(r1, r3, r2)
            r4.setOnPreferenceChangeListener(r0)
        L2c:
            return
    }
}
