package me.magnum.melonds.ui.settings.fragments;

import android.os.Bundle;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class AudioPreferencesFragment extends BasePreferenceFragment implements os4 {
    public ListPreference B;
    public final c9 L;

    public AudioPreferencesFragment() {
        c9 registerForActivityResult = registerForActivityResult(new b9(3), new j9(1, this));
        registerForActivityResult.getClass();
        this.L = registerForActivityResult;
    }

    @Override // defpackage.os4
    public final String getTitle() {
        String string = getString(R.string.category_audio);
        string.getClass();
        return string;
    }

    public final void j(boolean z) {
        if (!z && shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
            sb sbVar = new sb(requireContext());
            sbVar.A(R.string.microphone_permission_required);
            sbVar.w(R.string.microphone_permission_required_info);
            sbVar.z(R.string.ok, new iw(0, this));
            sbVar.C();
            return;
        }
        this.L.a("android.permission.RECORD_AUDIO");
    }

    @Override // defpackage.is4
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_audio, str);
        Preference findPreference = findPreference("volume");
        findPreference.getClass();
        SeekBarPreference seekBarPreference = (SeekBarPreference) findPreference;
        Preference findPreference2 = findPreference("mic_source");
        findPreference2.getClass();
        this.B = (ListPreference) findPreference2;
        seekBarPreference.setSummary(getString(R.string.volume_percentage, Integer.valueOf((int) ((seekBarPreference.A / seekBarPreference.L) * 100.0f))));
        seekBarPreference.setOnPreferenceChangeListener(new gw(this, seekBarPreference, 0));
        ListPreference listPreference = this.B;
        if (listPreference != null) {
            listPreference.setOnPreferenceChangeListener(new hw(0, this));
            h("sound_enabled", new String[]{"audio_interpolation", "audio_bitrate", "volume", "audio_latency"}, true);
            return;
        }
        b53.g0("micSourcePreference");
        throw null;
    }
}
