package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.smp.masterswitchpreference.MasterSwitchPreference;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class GeneralPreferencesFragment extends Hilt_GeneralPreferencesFragment implements q15 {
    public final ex6 Z = new ex6(new er2(this, 0));
    public wh7 d0;
    public yj1 e0;
    public jd6 f0;
    public MasterSwitchPreference g0;
    public ListPreference h0;
    public final d9 i0;
    public final d9 j0;
    public final fr2 k0;

    /* JADX WARN: Type inference failed for: r0v5, types: [fr2] */
    public GeneralPreferencesFragment() {
        d9 registerForActivityResult = registerForActivityResult(new c9(2), new b(this, 0));
        registerForActivityResult.getClass();
        this.i0 = registerForActivityResult;
        d9 registerForActivityResult2 = registerForActivityResult(new c9(2), new b(this, 1));
        registerForActivityResult2.getClass();
        this.j0 = registerForActivityResult2;
        this.k0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: fr2
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                boolean k = nb3.k(str, "ra_hardcore_enabled");
                GeneralPreferencesFragment generalPreferencesFragment = GeneralPreferencesFragment.this;
                if (!k) {
                    ListPreference listPreference = generalPreferencesFragment.h0;
                    if (listPreference != null) {
                        if (!nb3.k(str, listPreference.getKey())) {
                            return;
                        }
                    } else {
                        nb3.a0("frameLimitSpeedPreference");
                        throw null;
                    }
                }
                generalPreferencesFragment.k();
            }
        };
    }

    @Override // defpackage.q15
    public final String getTitle() {
        String string = getString(R.string.category_general);
        string.getClass();
        return string;
    }

    public final void k() {
        boolean z = v15.a(requireContext()).getBoolean("ra_hardcore_enabled", false);
        ListPreference listPreference = this.h0;
        if (listPreference != null) {
            listPreference.setVisible(!z);
            if (!z) {
                ListPreference listPreference2 = this.h0;
                if (listPreference2 != null) {
                    if (listPreference2 != null) {
                        CharSequence f = listPreference2.f();
                        if (f == null) {
                            f = getString(R.string.not_set);
                            f.getClass();
                        }
                        listPreference2.setSummary(f);
                        return;
                    }
                    nb3.a0("frameLimitSpeedPreference");
                    throw null;
                }
                nb3.a0("frameLimitSpeedPreference");
                throw null;
            }
            return;
        }
        nb3.a0("frameLimitSpeedPreference");
        throw null;
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_general, str);
        addPreferencesFromResource(R.xml.pref_general_updates);
        Preference findPreference = findPreference("enable_rewind");
        findPreference.getClass();
        this.g0 = (MasterSwitchPreference) findPreference;
        Preference findPreference2 = findPreference("frame_limit_speed_multiplier");
        findPreference2.getClass();
        this.h0 = (ListPreference) findPreference2;
        Preference findPreference3 = findPreference("enable_sustained_performance");
        findPreference3.getClass();
        SwitchPreference switchPreference = (SwitchPreference) findPreference3;
        ListPreference listPreference = (ListPreference) findPreference("theme");
        ex6 ex6Var = this.Z;
        if (listPreference != null) {
            ((p15) ex6Var.getValue()).getClass();
            p15.a(listPreference);
            listPreference.setOnPreferenceChangeListener(new zw(this, 1));
        }
        p15 p15Var = (p15) ex6Var.getValue();
        MasterSwitchPreference masterSwitchPreference = this.g0;
        if (masterSwitchPreference != null) {
            p15Var.getClass();
            p15.a(masterSwitchPreference);
            p15 p15Var2 = (p15) ex6Var.getValue();
            ListPreference listPreference2 = this.h0;
            if (listPreference2 != null) {
                p15Var2.getClass();
                p15.a(listPreference2);
                k();
                Context requireContext = requireContext();
                requireContext.getClass();
                Object systemService = requireContext.getSystemService("power");
                systemService.getClass();
                switchPreference.setVisible(((PowerManager) systemService).isSustainedPerformanceModeSupported());
                ListPreference listPreference3 = this.h0;
                if (listPreference3 != null) {
                    SharedPreferences sharedPreferences = listPreference3.getSharedPreferences();
                    if (sharedPreferences != null) {
                        sharedPreferences.registerOnSharedPreferenceChangeListener(this.k0);
                    }
                    Preference findPreference4 = findPreference("backup_settings");
                    if (findPreference4 != null) {
                        findPreference4.setOnPreferenceClickListener(new y05(this) { // from class: gr2
                            public final /* synthetic */ GeneralPreferencesFragment B;

                            {
                                this.B = this;
                            }

                            @Override // defpackage.y05
                            public final void i(Preference preference) {
                                int i = r2;
                                GeneralPreferencesFragment generalPreferencesFragment = this.B;
                                switch (i) {
                                    case 0:
                                        generalPreferencesFragment.i0.a(null);
                                        return;
                                    default:
                                        generalPreferencesFragment.j0.a(null);
                                        return;
                                }
                            }
                        });
                    }
                    Preference findPreference5 = findPreference("restore_settings");
                    if (findPreference5 != null) {
                        findPreference5.setOnPreferenceClickListener(new y05(this) { // from class: gr2
                            public final /* synthetic */ GeneralPreferencesFragment B;

                            {
                                this.B = this;
                            }

                            @Override // defpackage.y05
                            public final void i(Preference preference) {
                                int i = r2;
                                GeneralPreferencesFragment generalPreferencesFragment = this.B;
                                switch (i) {
                                    case 0:
                                        generalPreferencesFragment.i0.a(null);
                                        return;
                                    default:
                                        generalPreferencesFragment.j0.a(null);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                nb3.a0("frameLimitSpeedPreference");
                throw null;
            }
            nb3.a0("frameLimitSpeedPreference");
            throw null;
        }
        nb3.a0("rewindPreference");
        throw null;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        ListPreference listPreference = this.h0;
        if (listPreference != null) {
            SharedPreferences sharedPreferences = listPreference.getSharedPreferences();
            if (sharedPreferences != null) {
                sharedPreferences.unregisterOnSharedPreferenceChangeListener(this.k0);
            }
            super.onDestroy();
            return;
        }
        nb3.a0("frameLimitSpeedPreference");
        throw null;
    }

    @Override // me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment, androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        MasterSwitchPreference masterSwitchPreference = this.g0;
        Boolean bool = null;
        if (masterSwitchPreference != null) {
            x05 onPreferenceChangeListener = masterSwitchPreference.getOnPreferenceChangeListener();
            if (onPreferenceChangeListener != null) {
                MasterSwitchPreference masterSwitchPreference2 = this.g0;
                if (masterSwitchPreference2 != null) {
                    if (masterSwitchPreference2 != null) {
                        SharedPreferences sharedPreferences = masterSwitchPreference2.getSharedPreferences();
                        if (sharedPreferences != null) {
                            MasterSwitchPreference masterSwitchPreference3 = this.g0;
                            if (masterSwitchPreference3 != null) {
                                bool = Boolean.valueOf(sharedPreferences.getBoolean(masterSwitchPreference3.getKey(), false));
                            } else {
                                nb3.a0("rewindPreference");
                                throw null;
                            }
                        }
                        onPreferenceChangeListener.a(masterSwitchPreference2, bool);
                    } else {
                        nb3.a0("rewindPreference");
                        throw null;
                    }
                } else {
                    nb3.a0("rewindPreference");
                    throw null;
                }
            }
            k();
            return;
        }
        nb3.a0("rewindPreference");
        throw null;
    }
}
