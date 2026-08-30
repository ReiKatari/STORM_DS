package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class RomsPreferencesFragment extends Hilt_RomsPreferencesFragment implements os4 {
    public final va7 Z;
    public final il6 c0;
    public y37 d0;
    public uf1 e0;
    public v16 f0;
    public Preference g0;

    public RomsPreferencesFragment() {
        gh3 H = yf2.H(wk3.NONE, new RomsPreferencesFragment$special$$inlined$viewModels$default$2(new RomsPreferencesFragment$special$$inlined$viewModels$default$1(this)));
        this.Z = new va7(q75.a(dp5.class), new RomsPreferencesFragment$special$$inlined$viewModels$default$3(H), new RomsPreferencesFragment$special$$inlined$viewModels$default$5(this, H), new RomsPreferencesFragment$special$$inlined$viewModels$default$4(H));
        this.c0 = new il6(new bz2(17, this));
    }

    @Override // defpackage.os4
    public final String getTitle() {
        String string = getString(R.string.category_roms);
        string.getClass();
        return string;
    }

    public final v16 k() {
        v16 v16Var = this.f0;
        if (v16Var != null) {
            return v16Var;
        }
        b53.g0("settingsBackupManager");
        throw null;
    }

    public final void l(SeekBarPreference seekBarPreference, int i) {
        w76 w76Var = new w76(134217728 * ((long) Math.pow(2.0d, i)));
        Context requireContext = requireContext();
        requireContext.getClass();
        seekBarPreference.setSummary(gk2.N(requireContext, w76Var, 0));
    }

    @Override // defpackage.is4
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_roms, str);
        Preference findPreference = findPreference("rom_cache_max_size");
        findPreference.getClass();
        SeekBarPreference seekBarPreference = (SeekBarPreference) findPreference;
        Preference findPreference2 = findPreference("rom_cache_clear");
        findPreference2.getClass();
        this.g0 = findPreference2;
        Preference findPreference3 = findPreference("rom_search_dirs");
        findPreference3.getClass();
        ((ns4) this.c0.getValue()).c((StoragePickerPreference) findPreference3, new z5(28, this));
        l(seekBarPreference, seekBarPreference.A);
        seekBarPreference.setOnPreferenceChangeListener(new hw(5, this));
        Preference preference = this.g0;
        if (preference != null) {
            preference.setOnPreferenceClickListener(new a31(20, this));
        } else {
            b53.g0("clearRomCachePreference");
            throw null;
        }
    }

    @Override // defpackage.is4, androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        tq5.w(hk2.y(this), null, null, new RomsPreferencesFragment$onViewCreated$1(this, null), 3);
    }
}
