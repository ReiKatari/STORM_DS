package me.magnum.melonds.ui.settings.fragments;

import android.os.Bundle;
import androidx.preference.ListPreference;
import androidx.preference.SeekBarPreference;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class AudioPreferencesFragment extends Hilt_AudioPreferencesFragment implements q15 {
    public ListPreference Z;
    public final d9 d0;

    public AudioPreferencesFragment() {
        d9 registerForActivityResult = registerForActivityResult(new c9(4), new k9(this, 1));
        registerForActivityResult.getClass();
        this.d0 = registerForActivityResult;
    }

    @Override // defpackage.q15
    public final String getTitle() {
        String string = getString(R.string.category_audio);
        string.getClass();
        return string;
    }

    public final void k(boolean z) {
        if (!z && shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
            zb zbVar = new zb(requireContext());
            zbVar.z(R.string.microphone_permission_required);
            zbVar.w(R.string.microphone_permission_required_info);
            zbVar.y(R.string.ok, new ax(this, 0));
            zbVar.B();
            return;
        }
        this.d0.a("android.permission.RECORD_AUDIO");
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_audio, str);
        SeekBarPreference seekBarPreference = (SeekBarPreference) findPreference("volume");
        this.Z = (ListPreference) findPreference("mic_source");
        if (seekBarPreference != null) {
            seekBarPreference.setSummary(getString(R.string.volume_percentage, Integer.valueOf((int) ((seekBarPreference.A / seekBarPreference.L) * 100.0f))));
            seekBarPreference.setOnPreferenceChangeListener(new yw(0, this, seekBarPreference));
        }
        ListPreference listPreference = this.Z;
        if (listPreference != null) {
            listPreference.setOnPreferenceChangeListener(new zw(this, 0));
        }
        h("sound_enabled", new String[]{"audio_interpolation", "audio_bitrate", "volume", "audio_latency"}, true);
    }
}
