package me.magnum.melonds.ui.settings.fragments;

import android.os.Bundle;
import androidx.preference.ListPreference;
import androidx.preference.SwitchPreferenceCompat;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class TranslatorPreferencesFragment extends Hilt_TranslatorPreferencesFragment implements q15 {
    @Override // defpackage.q15
    public final String getTitle() {
        String string = getString(R.string.category_translator);
        string.getClass();
        return string;
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_translator, str);
        ListPreference listPreference = (ListPreference) findPreference("translator_tts_voice_engine");
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) findPreference("translator_local_voice_actor_studio");
        if (listPreference != null) {
            listPreference.setOnPreferenceChangeListener(new yw(3, switchPreferenceCompat, this));
        }
        if (switchPreferenceCompat != null) {
            switchPreferenceCompat.setOnPreferenceChangeListener(new yw(4, listPreference, this));
        }
    }
}
