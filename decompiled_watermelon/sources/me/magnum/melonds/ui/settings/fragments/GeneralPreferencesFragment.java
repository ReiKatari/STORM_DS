package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.smp.masterswitchpreference.MasterSwitchPreference;
import me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class GeneralPreferencesFragment extends Hilt_GeneralPreferencesFragment implements os4 {
    public final il6 Z = new il6(new b5(27, this));
    public y37 c0;
    public uf1 d0;
    public v16 e0;
    public MasterSwitchPreference f0;
    public ListPreference g0;
    public final c9 h0;
    public final c9 i0;
    public final zk2 j0;

    /* JADX WARN: Type inference failed for: r0v5, types: [zk2] */
    public GeneralPreferencesFragment() {
        c9 registerForActivityResult = registerForActivityResult(new b9(1), new a(this, 0));
        registerForActivityResult.getClass();
        this.h0 = registerForActivityResult;
        c9 registerForActivityResult2 = registerForActivityResult(new b9(1), new a(this, 1));
        registerForActivityResult2.getClass();
        this.i0 = registerForActivityResult2;
        this.j0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: zk2
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                boolean x = b53.x(str, "ra_hardcore_enabled");
                GeneralPreferencesFragment generalPreferencesFragment = GeneralPreferencesFragment.this;
                if (!x) {
                    ListPreference listPreference = generalPreferencesFragment.g0;
                    if (listPreference != null) {
                        if (!b53.x(str, listPreference.getKey())) {
                            return;
                        }
                    } else {
                        b53.g0("frameLimitSpeedPreference");
                        throw null;
                    }
                }
                generalPreferencesFragment.k();
            }
        };
    }

    @Override // defpackage.os4
    public final String getTitle() {
        String string = getString(R.string.category_general);
        string.getClass();
        return string;
    }

    public final void k() {
        boolean z = ts4.a(requireContext()).getBoolean("ra_hardcore_enabled", false);
        ListPreference listPreference = this.g0;
        if (listPreference != null) {
            listPreference.setVisible(!z);
            if (!z) {
                ListPreference listPreference2 = this.g0;
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
                    b53.g0("frameLimitSpeedPreference");
                    throw null;
                }
                b53.g0("frameLimitSpeedPreference");
                throw null;
            }
            return;
        }
        b53.g0("frameLimitSpeedPreference");
        throw null;
    }

    @Override // defpackage.is4
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_general, str);
        addPreferencesFromResource(R.xml.pref_general_updates);
        Preference findPreference = findPreference("enable_rewind");
        findPreference.getClass();
        this.f0 = (MasterSwitchPreference) findPreference;
        Preference findPreference2 = findPreference("frame_limit_speed_multiplier");
        findPreference2.getClass();
        this.g0 = (ListPreference) findPreference2;
        Preference findPreference3 = findPreference("enable_sustained_performance");
        findPreference3.getClass();
        SwitchPreference switchPreference = (SwitchPreference) findPreference3;
        il6 il6Var = this.Z;
        ns4 ns4Var = (ns4) il6Var.getValue();
        MasterSwitchPreference masterSwitchPreference = this.f0;
        if (masterSwitchPreference != null) {
            ns4Var.getClass();
            ns4.a(masterSwitchPreference);
            ns4 ns4Var2 = (ns4) il6Var.getValue();
            ListPreference listPreference = this.g0;
            if (listPreference != null) {
                ns4Var2.getClass();
                ns4.a(listPreference);
                k();
                Context requireContext = requireContext();
                requireContext.getClass();
                Object systemService = requireContext.getSystemService("power");
                systemService.getClass();
                switchPreference.setVisible(((PowerManager) systemService).isSustainedPerformanceModeSupported());
                ListPreference listPreference2 = this.g0;
                if (listPreference2 != null) {
                    SharedPreferences sharedPreferences = listPreference2.getSharedPreferences();
                    if (sharedPreferences != null) {
                        sharedPreferences.registerOnSharedPreferenceChangeListener(this.j0);
                    }
                    Preference findPreference4 = findPreference("backup_settings");
                    if (findPreference4 != null) {
                        findPreference4.setOnPreferenceClickListener(new vr4(this) { // from class: al2
                            public final /* synthetic */ GeneralPreferencesFragment B;

                            {
                                this.B = this;
                            }

                            @Override // defpackage.vr4
                            public final void c(Preference preference) {
                                int i = r2;
                                GeneralPreferencesFragment generalPreferencesFragment = this.B;
                                switch (i) {
                                    case 0:
                                        generalPreferencesFragment.h0.a(null);
                                        return;
                                    default:
                                        generalPreferencesFragment.i0.a(null);
                                        return;
                                }
                            }
                        });
                    }
                    Preference findPreference5 = findPreference("restore_settings");
                    if (findPreference5 != null) {
                        findPreference5.setOnPreferenceClickListener(new vr4(this) { // from class: al2
                            public final /* synthetic */ GeneralPreferencesFragment B;

                            {
                                this.B = this;
                            }

                            @Override // defpackage.vr4
                            public final void c(Preference preference) {
                                int i = r2;
                                GeneralPreferencesFragment generalPreferencesFragment = this.B;
                                switch (i) {
                                    case 0:
                                        generalPreferencesFragment.h0.a(null);
                                        return;
                                    default:
                                        generalPreferencesFragment.i0.a(null);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                b53.g0("frameLimitSpeedPreference");
                throw null;
            }
            b53.g0("frameLimitSpeedPreference");
            throw null;
        }
        b53.g0("rewindPreference");
        throw null;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        ListPreference listPreference = this.g0;
        if (listPreference != null) {
            SharedPreferences sharedPreferences = listPreference.getSharedPreferences();
            if (sharedPreferences != null) {
                sharedPreferences.unregisterOnSharedPreferenceChangeListener(this.j0);
            }
            super.onDestroy();
            return;
        }
        b53.g0("frameLimitSpeedPreference");
        throw null;
    }

    @Override // me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment, androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        MasterSwitchPreference masterSwitchPreference = this.f0;
        Boolean bool = null;
        if (masterSwitchPreference != null) {
            ur4 onPreferenceChangeListener = masterSwitchPreference.getOnPreferenceChangeListener();
            if (onPreferenceChangeListener != null) {
                MasterSwitchPreference masterSwitchPreference2 = this.f0;
                if (masterSwitchPreference2 != null) {
                    if (masterSwitchPreference2 != null) {
                        SharedPreferences sharedPreferences = masterSwitchPreference2.getSharedPreferences();
                        if (sharedPreferences != null) {
                            MasterSwitchPreference masterSwitchPreference3 = this.f0;
                            if (masterSwitchPreference3 != null) {
                                bool = Boolean.valueOf(sharedPreferences.getBoolean(masterSwitchPreference3.getKey(), false));
                            } else {
                                b53.g0("rewindPreference");
                                throw null;
                            }
                        }
                        onPreferenceChangeListener.a(masterSwitchPreference2, bool);
                    } else {
                        b53.g0("rewindPreference");
                        throw null;
                    }
                } else {
                    b53.g0("rewindPreference");
                    throw null;
                }
            }
            k();
            return;
        }
        b53.g0("rewindPreference");
        throw null;
    }
}
