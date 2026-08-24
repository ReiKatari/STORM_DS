package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import androidx.preference.SwitchPreference;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.inputsetup.InputSetupActivity;
import me.magnum.melonds.ui.layouts.LayoutListActivity;
import me.magnum.melonds.ui.settings.fragments.InputPreferencesFragment;
import me.magnum.melonds.ui.settings.preferences.InGameLockedPreference;
import me.magnum.melonds.ui.settings.preferences.SoftwareInputBehaviourPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class InputPreferencesFragment extends Hilt_InputPreferencesFragment implements q15 {
    public u87 Z;
    public SoftwareInputBehaviourPreference d0;

    @Override // defpackage.q15
    public final String getTitle() {
        String string = getString(R.string.input);
        string.getClass();
        return string;
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_input, str);
        Preference findPreference = findPreference("soft_input_behaviour");
        findPreference.getClass();
        this.d0 = (SoftwareInputBehaviourPreference) findPreference;
        Preference findPreference2 = findPreference("input_touch_haptic_feedback_enabled");
        findPreference2.getClass();
        SwitchPreference switchPreference = (SwitchPreference) findPreference2;
        Preference findPreference3 = findPreference("input_touch_haptic_feedback_strength");
        findPreference3.getClass();
        SeekBarPreference seekBarPreference = (SeekBarPreference) findPreference3;
        Preference findPreference4 = findPreference("input_key_mapping");
        findPreference4.getClass();
        InGameLockedPreference inGameLockedPreference = (InGameLockedPreference) findPreference4;
        Preference findPreference5 = findPreference("input_layouts");
        findPreference5.getClass();
        InGameLockedPreference inGameLockedPreference2 = (InGameLockedPreference) findPreference5;
        inGameLockedPreference.A = requireActivity().getIntent().getBooleanExtra("lock_input_mapping", false);
        inGameLockedPreference.B = R.string.cannot_change_use_rom_settings;
        inGameLockedPreference2.A = requireActivity().getIntent().getBooleanExtra("lock_input_layout", false);
        inGameLockedPreference2.B = R.string.cannot_change_use_rom_settings;
        u87 u87Var = this.Z;
        if (u87Var != null) {
            if (!u87Var.a.c()) {
                switchPreference.setVisible(false);
            }
            seekBarPreference.setVisible(false);
            seekBarPreference.setOnPreferenceChangeListener(new zw(this, 2));
            inGameLockedPreference.setOnPreferenceClickListener(new y05(this) { // from class: a73
                public final /* synthetic */ InputPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // defpackage.y05
                public final void i(Preference preference) {
                    int i = r2;
                    InputPreferencesFragment inputPreferencesFragment = this.B;
                    switch (i) {
                        case 0:
                            int i2 = InputSetupActivity.D0;
                            Context requireContext = inputPreferencesFragment.requireContext();
                            requireContext.getClass();
                            inputPreferencesFragment.startActivity(new Intent(requireContext, InputSetupActivity.class));
                            return;
                        default:
                            inputPreferencesFragment.startActivity(new Intent(inputPreferencesFragment.requireContext(), LayoutListActivity.class));
                            return;
                    }
                }
            });
            inGameLockedPreference2.setOnPreferenceClickListener(new y05(this) { // from class: a73
                public final /* synthetic */ InputPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // defpackage.y05
                public final void i(Preference preference) {
                    int i = r2;
                    InputPreferencesFragment inputPreferencesFragment = this.B;
                    switch (i) {
                        case 0:
                            int i2 = InputSetupActivity.D0;
                            Context requireContext = inputPreferencesFragment.requireContext();
                            requireContext.getClass();
                            inputPreferencesFragment.startActivity(new Intent(requireContext, InputSetupActivity.class));
                            return;
                        default:
                            inputPreferencesFragment.startActivity(new Intent(inputPreferencesFragment.requireContext(), LayoutListActivity.class));
                            return;
                    }
                }
            });
            return;
        }
        nb3.a0("vibrator");
        throw null;
    }

    @Override // me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment, androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        SoftwareInputBehaviourPreference softwareInputBehaviourPreference = this.d0;
        String str = null;
        if (softwareInputBehaviourPreference != null) {
            if (softwareInputBehaviourPreference != null) {
                SharedPreferences sharedPreferences = softwareInputBehaviourPreference.getSharedPreferences();
                if (sharedPreferences != null) {
                    SoftwareInputBehaviourPreference softwareInputBehaviourPreference2 = this.d0;
                    if (softwareInputBehaviourPreference2 != null) {
                        str = sharedPreferences.getString(softwareInputBehaviourPreference2.getKey(), "hide_system_buttons_when_controller_connected");
                    } else {
                        nb3.a0("softInputBehaviourPreference");
                        throw null;
                    }
                }
                softwareInputBehaviourPreference.h(str);
                return;
            }
            nb3.a0("softInputBehaviourPreference");
            throw null;
        }
        nb3.a0("softInputBehaviourPreference");
        throw null;
    }
}
