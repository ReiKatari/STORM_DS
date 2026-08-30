package me.magnum.melonds.ui.settings.fragments;

import a7.v;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.s0;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import me.magnum.melonds.R;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import nc.u;
import oe.n0;
import oe.o0;
import yb.n;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class RomsPreferencesFragment extends Hilt_RomsPreferencesFragment implements ci.l {
    public final v Y;
    public final n Z;

    /* renamed from: b0  reason: collision with root package name */
    public sd.i f9601b0;

    /* renamed from: c0  reason: collision with root package name */
    public sd.d f9602c0;

    /* renamed from: d0  reason: collision with root package name */
    public Preference f9603d0;

    public RomsPreferencesFragment() {
        yb.f s10 = p7.a.s(yb.h.NONE, new RomsPreferencesFragment$special$$inlined$viewModels$default$2(new RomsPreferencesFragment$special$$inlined$viewModels$default$1(this)));
        this.Y = new v(u.a(gi.f.class), new RomsPreferencesFragment$special$$inlined$viewModels$default$3(s10), new RomsPreferencesFragment$special$$inlined$viewModels$default$5(this, s10), new RomsPreferencesFragment$special$$inlined$viewModels$default$4(s10));
        this.Z = new n(new e(this, 3));
    }

    @Override // ci.l
    public final String getTitle() {
        String string = getString(R.string.category_roms);
        string.getClass();
        return string;
    }

    public final void i(SeekBarPreference seekBarPreference, int i2) {
        o0 o0Var = new o0(new n0(128L).A * ((long) Math.pow(2.0d, i2)));
        Context requireContext = requireContext();
        requireContext.getClass();
        seekBarPreference.setSummary(d0.d.S(requireContext, o0Var, 0));
    }

    @Override // androidx.preference.a0
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_roms, str);
        Preference findPreference = findPreference("rom_cache_max_size");
        findPreference.getClass();
        SeekBarPreference seekBarPreference = (SeekBarPreference) findPreference;
        Preference findPreference2 = findPreference("rom_cache_clear");
        findPreference2.getClass();
        this.f9603d0 = findPreference2;
        Preference findPreference3 = findPreference("rom_search_dirs");
        findPreference3.getClass();
        ((ci.k) this.Z.getValue()).b((StoragePickerPreference) findPreference3);
        i(seekBarPreference, seekBarPreference.A);
        seekBarPreference.setOnPreferenceChangeListener(new a(4, this));
        Preference preference = this.f9603d0;
        if (preference != null) {
            preference.setOnPreferenceClickListener(new c(this, 2));
        } else {
            nc.k.f("clearRomCachePreference");
            throw null;
        }
    }

    @Override // androidx.preference.a0, androidx.fragment.app.j0
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        x.v(s0.f(this), null, null, new RomsPreferencesFragment$onViewCreated$1(this, null), 3);
    }
}
