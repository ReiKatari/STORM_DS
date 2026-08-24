package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RomsPreferencesFragment extends Hilt_RomsPreferencesFragment implements q15 {
    public final uo7 Z;
    public final ex6 d0;
    public wh7 e0;
    public yj1 f0;
    public jd6 g0;
    public Preference h0;

    public RomsPreferencesFragment() {
        go3 M = kj2.M(xr3.NONE, new RomsPreferencesFragment$special$$inlined$viewModels$default$2(new RomsPreferencesFragment$special$$inlined$viewModels$default$1(this)));
        this.Z = new uo7(gh5.a(yz5.class), new RomsPreferencesFragment$special$$inlined$viewModels$default$3(M), new RomsPreferencesFragment$special$$inlined$viewModels$default$5(this, M), new RomsPreferencesFragment$special$$inlined$viewModels$default$4(M));
        this.d0 = new ex6(new er2(this, 24));
    }

    @Override // defpackage.q15
    public final String getTitle() {
        String string = getString(R.string.category_roms);
        string.getClass();
        return string;
    }

    public final jd6 k() {
        jd6 jd6Var = this.g0;
        if (jd6Var != null) {
            return jd6Var;
        }
        nb3.a0("settingsBackupManager");
        throw null;
    }

    public final void l(SeekBarPreference seekBarPreference, int i) {
        lj6 lj6Var = new lj6(134217728 * ((long) Math.pow(2.0d, i)));
        Context requireContext = requireContext();
        requireContext.getClass();
        seekBarPreference.setSummary(oi2.x(requireContext, lj6Var, 0));
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_roms, str);
        Preference findPreference = findPreference("rom_cache_max_size");
        findPreference.getClass();
        SeekBarPreference seekBarPreference = (SeekBarPreference) findPreference;
        Preference findPreference2 = findPreference("rom_cache_clear");
        findPreference2.getClass();
        this.h0 = findPreference2;
        Preference findPreference3 = findPreference("rom_search_dirs");
        findPreference3.getClass();
        ((p15) this.d0.getValue()).c((StoragePickerPreference) findPreference3, new z5(this, 28));
        l(seekBarPreference, seekBarPreference.A);
        seekBarPreference.setOnPreferenceChangeListener(new zw(this, 5));
        Preference preference = this.h0;
        if (preference != null) {
            preference.setOnPreferenceClickListener(new h61(this, 19));
        } else {
            nb3.a0("clearRomCachePreference");
            throw null;
        }
    }

    @Override // defpackage.k15, androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        hv.L(bl2.C(this), null, null, new RomsPreferencesFragment$onViewCreated$1(this, null), 3);
    }
}
