package me.magnum.melonds.ui.settings.fragments;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.p;
import me.magnum.melonds.R;
import me.magnum.melonds.ui.inputsetup.InputSetupActivity;
import me.magnum.melonds.ui.layouts.LayoutListActivity;
import me.magnum.melonds.ui.settings.preferences.SoftwareInputBehaviourPreference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class InputPreferencesFragment extends Hilt_InputPreferencesFragment implements ci.l {
    public ce.c Y;
    public SoftwareInputBehaviourPreference Z;

    @Override // ci.l
    public final String getTitle() {
        String string = getString(R.string.input);
        string.getClass();
        return string;
    }

    @Override // androidx.preference.a0
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_input, str);
        Preference findPreference = findPreference("soft_input_behaviour");
        findPreference.getClass();
        this.Z = (SoftwareInputBehaviourPreference) findPreference;
        Preference findPreference2 = findPreference("input_touch_haptic_feedback_enabled");
        findPreference2.getClass();
        SwitchPreference switchPreference = (SwitchPreference) findPreference2;
        Preference findPreference3 = findPreference("input_touch_haptic_feedback_strength");
        findPreference3.getClass();
        SeekBarPreference seekBarPreference = (SeekBarPreference) findPreference3;
        Preference findPreference4 = findPreference("input_key_mapping");
        findPreference4.getClass();
        Preference findPreference5 = findPreference("input_layouts");
        findPreference5.getClass();
        ce.c cVar = this.Y;
        if (cVar != null) {
            if (!cVar.f2870a.c()) {
                switchPreference.setVisible(false);
            }
            seekBarPreference.setVisible(false);
            seekBarPreference.setOnPreferenceChangeListener(new a(2, this));
            findPreference4.setOnPreferenceClickListener(new p(this) { // from class: me.magnum.melonds.ui.settings.fragments.h
                public final /* synthetic */ InputPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // androidx.preference.p
                public final void a(Preference preference) {
                    switch (r2) {
                        case 0:
                            InputPreferencesFragment inputPreferencesFragment = this.B;
                            inputPreferencesFragment.startActivity(new Intent(inputPreferencesFragment.requireContext(), InputSetupActivity.class));
                            return;
                        default:
                            InputPreferencesFragment inputPreferencesFragment2 = this.B;
                            inputPreferencesFragment2.startActivity(new Intent(inputPreferencesFragment2.requireContext(), LayoutListActivity.class));
                            return;
                    }
                }
            });
            findPreference5.setOnPreferenceClickListener(new p(this) { // from class: me.magnum.melonds.ui.settings.fragments.h
                public final /* synthetic */ InputPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // androidx.preference.p
                public final void a(Preference preference) {
                    switch (r2) {
                        case 0:
                            InputPreferencesFragment inputPreferencesFragment = this.B;
                            inputPreferencesFragment.startActivity(new Intent(inputPreferencesFragment.requireContext(), InputSetupActivity.class));
                            return;
                        default:
                            InputPreferencesFragment inputPreferencesFragment2 = this.B;
                            inputPreferencesFragment2.startActivity(new Intent(inputPreferencesFragment2.requireContext(), LayoutListActivity.class));
                            return;
                    }
                }
            });
            return;
        }
        nc.k.f("vibrator");
        throw null;
    }

    @Override // androidx.fragment.app.j0
    public final void onResume() {
        super.onResume();
        SoftwareInputBehaviourPreference softwareInputBehaviourPreference = this.Z;
        String str = null;
        if (softwareInputBehaviourPreference != null) {
            if (softwareInputBehaviourPreference != null) {
                SharedPreferences sharedPreferences = softwareInputBehaviourPreference.getSharedPreferences();
                if (sharedPreferences != null) {
                    SoftwareInputBehaviourPreference softwareInputBehaviourPreference2 = this.Z;
                    if (softwareInputBehaviourPreference2 != null) {
                        str = sharedPreferences.getString(softwareInputBehaviourPreference2.getKey(), "hide_system_buttons_when_controller_connected");
                    } else {
                        nc.k.f("softInputBehaviourPreference");
                        throw null;
                    }
                }
                softwareInputBehaviourPreference.f(str);
                return;
            }
            nc.k.f("softInputBehaviourPreference");
            throw null;
        }
        nc.k.f("softInputBehaviourPreference");
        throw null;
    }
}
