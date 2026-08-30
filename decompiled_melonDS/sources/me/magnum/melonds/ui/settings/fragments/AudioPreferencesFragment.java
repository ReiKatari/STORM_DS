package me.magnum.melonds.ui.settings.fragments;

import android.os.Bundle;
import androidx.fragment.app.b1;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class AudioPreferencesFragment extends BasePreferenceFragment implements ci.l {
    public ListPreference A;
    public final h.c B;

    public AudioPreferencesFragment() {
        h.c registerForActivityResult = registerForActivityResult(new b1(3), new f(this, 2));
        registerForActivityResult.getClass();
        this.B = registerForActivityResult;
    }

    @Override // ci.l
    public final String getTitle() {
        String string = getString(R.string.category_audio);
        string.getClass();
        return string;
    }

    public final void h(boolean z10) {
        if (!z10 && shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
            bk.a aVar = new bk.a(requireContext());
            aVar.w(R.string.microphone_permission_required);
            aVar.t(R.string.microphone_permission_required_info);
            aVar.v(R.string.ok, new b(this, 0));
            aVar.y();
            return;
        }
        this.B.a("android.permission.RECORD_AUDIO");
    }

    @Override // androidx.preference.a0
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_audio, str);
        Preference findPreference = findPreference("volume");
        findPreference.getClass();
        SeekBarPreference seekBarPreference = (SeekBarPreference) findPreference;
        Preference findPreference2 = findPreference("mic_source");
        findPreference2.getClass();
        this.A = (ListPreference) findPreference2;
        seekBarPreference.setSummary(getString(R.string.volume_percentage, Integer.valueOf((int) ((seekBarPreference.A / seekBarPreference.L) * 100.0f))));
        seekBarPreference.setOnPreferenceChangeListener(new ci.h(this, seekBarPreference, 2));
        ListPreference listPreference = this.A;
        if (listPreference != null) {
            listPreference.setOnPreferenceChangeListener(new a(0, this));
        } else {
            nc.k.f("micSourcePreference");
            throw null;
        }
    }
}
