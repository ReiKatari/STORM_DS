package me.magnum.melonds.ui.settings.fragments;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import com.smp.masterswitchpreference.MasterSwitchPreferenceFragment;
import me.magnum.melonds.ui.settings.fragments.RewindPreferencesFragment;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class RewindPreferencesFragment extends MasterSwitchPreferenceFragment implements os4 {
    public static final /* synthetic */ int A = 0;

    @Override // defpackage.os4
    public final String getTitle() {
        String string = getString(R.string.rewind);
        string.getClass();
        return string;
    }

    public final void j(Preference preference, int i, int i2, w76 w76Var) {
        w76 w76Var2;
        int i3 = i2 * 10;
        if (w76Var != null) {
            w76Var2 = new w76(((float) w76Var.A) * 0.2f);
        } else {
            w76Var2 = null;
        }
        long j = 20971520 * (i3 / i);
        w76 w76Var3 = new w76(j);
        Context requireContext = requireContext();
        requireContext.getClass();
        String N = gk2.N(requireContext, w76Var3, 2);
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.rewind_max_memory_usage, N));
        if (w76Var2 != null && b53.F(j, w76Var2.A) > 0) {
            sb.append('\n');
            sb.append(getString(R.string.rewind_memory_usage_above_recommended_limit));
        }
        preference.setSummary(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.smp.masterswitchpreference.MasterSwitchPreferenceFragment, defpackage.is4
    public final void onCreatePreferences(Bundle bundle, String str) {
        w76 w76Var;
        super.onCreatePreferences(bundle, str);
        Preference findPreference = findPreference("rewind_period");
        findPreference.getClass();
        final SeekBarPreference seekBarPreference = (SeekBarPreference) findPreference;
        Preference findPreference2 = findPreference("rewind_window");
        findPreference2.getClass();
        final SeekBarPreference seekBarPreference2 = (SeekBarPreference) findPreference2;
        final Preference findPreference3 = findPreference("rewind_info");
        findPreference3.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ActivityManager activityManager = (ActivityManager) requireContext.getSystemService(ActivityManager.class);
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            w76Var = new w76(memoryInfo.totalMem);
        } else {
            w76Var = null;
        }
        final s76 s76Var = w76Var;
        seekBarPreference.setOnPreferenceChangeListener(new ur4(this) { // from class: wf5
            public final /* synthetic */ RewindPreferencesFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.ur4
            public final boolean a(Preference preference, Object obj) {
                int i = r6;
                SeekBarPreference seekBarPreference3 = seekBarPreference;
                s76 s76Var2 = s76Var;
                SeekBarPreference seekBarPreference4 = seekBarPreference2;
                Preference preference2 = findPreference3;
                RewindPreferencesFragment rewindPreferencesFragment = this.b;
                switch (i) {
                    case 0:
                        int i2 = RewindPreferencesFragment.A;
                        preference.getClass();
                        obj.getClass();
                        rewindPreferencesFragment.j(preference2, ((Integer) obj).intValue(), seekBarPreference4.A, s76Var2);
                        seekBarPreference3.setSummary(rewindPreferencesFragment.getString(R.string.rewind_time_seconds, String.valueOf(((Number) obj).intValue())));
                        return true;
                    default:
                        int i3 = RewindPreferencesFragment.A;
                        preference.getClass();
                        int i4 = seekBarPreference4.A;
                        obj.getClass();
                        rewindPreferencesFragment.j(preference2, i4, ((Integer) obj).intValue(), s76Var2);
                        seekBarPreference3.setSummary(rewindPreferencesFragment.getString(R.string.rewind_time_seconds, String.valueOf(((Number) obj).intValue() * 10)));
                        return true;
                }
            }
        });
        seekBarPreference2.setOnPreferenceChangeListener(new ur4(this) { // from class: wf5
            public final /* synthetic */ RewindPreferencesFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.ur4
            public final boolean a(Preference preference, Object obj) {
                int i = r6;
                SeekBarPreference seekBarPreference3 = seekBarPreference2;
                s76 s76Var2 = s76Var;
                SeekBarPreference seekBarPreference4 = seekBarPreference;
                Preference preference2 = findPreference3;
                RewindPreferencesFragment rewindPreferencesFragment = this.b;
                switch (i) {
                    case 0:
                        int i2 = RewindPreferencesFragment.A;
                        preference.getClass();
                        obj.getClass();
                        rewindPreferencesFragment.j(preference2, ((Integer) obj).intValue(), seekBarPreference4.A, s76Var2);
                        seekBarPreference3.setSummary(rewindPreferencesFragment.getString(R.string.rewind_time_seconds, String.valueOf(((Number) obj).intValue())));
                        return true;
                    default:
                        int i3 = RewindPreferencesFragment.A;
                        preference.getClass();
                        int i4 = seekBarPreference4.A;
                        obj.getClass();
                        rewindPreferencesFragment.j(preference2, i4, ((Integer) obj).intValue(), s76Var2);
                        seekBarPreference3.setSummary(rewindPreferencesFragment.getString(R.string.rewind_time_seconds, String.valueOf(((Number) obj).intValue() * 10)));
                        return true;
                }
            }
        });
        seekBarPreference.setSummary(getString(R.string.rewind_time_seconds, String.valueOf(seekBarPreference.A)));
        seekBarPreference2.setSummary(getString(R.string.rewind_time_seconds, String.valueOf(seekBarPreference2.A * 10)));
        j(findPreference3, seekBarPreference.A, seekBarPreference2.A, s76Var);
    }
}
