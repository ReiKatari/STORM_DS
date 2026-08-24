package me.magnum.melonds.ui.settings.fragments;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import com.smp.masterswitchpreference.MasterSwitchPreferenceFragment;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.settings.fragments.RewindPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RewindPreferencesFragment extends MasterSwitchPreferenceFragment implements q15 {
    public static final /* synthetic */ int A = 0;

    @Override // defpackage.q15
    public final String getTitle() {
        String string = getString(R.string.rewind);
        string.getClass();
        return string;
    }

    public final void j(Preference preference, int i, int i2, lj6 lj6Var) {
        lj6 lj6Var2;
        int i3 = i2 * 10;
        if (lj6Var != null) {
            lj6Var2 = new lj6(((float) lj6Var.A) * 0.2f);
        } else {
            lj6Var2 = null;
        }
        long j = 20971520 * (i3 / i);
        lj6 lj6Var3 = new lj6(j);
        Context requireContext = requireContext();
        requireContext.getClass();
        String x = oi2.x(requireContext, lj6Var3, 2);
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.rewind_max_memory_usage, x));
        if (lj6Var2 != null && nb3.q(j, lj6Var2.A) > 0) {
            sb.append('\n');
            sb.append(getString(R.string.rewind_memory_usage_above_recommended_limit));
        }
        preference.setSummary(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.smp.masterswitchpreference.MasterSwitchPreferenceFragment, defpackage.k15
    public final void onCreatePreferences(Bundle bundle, String str) {
        lj6 lj6Var;
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
            lj6Var = new lj6(memoryInfo.totalMem);
        } else {
            lj6Var = null;
        }
        final hj6 hj6Var = lj6Var;
        seekBarPreference.setOnPreferenceChangeListener(new x05(this) { // from class: up5
            public final /* synthetic */ RewindPreferencesFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.x05
            public final boolean a(Preference preference, Object obj) {
                int i = r6;
                SeekBarPreference seekBarPreference3 = seekBarPreference;
                hj6 hj6Var2 = hj6Var;
                SeekBarPreference seekBarPreference4 = seekBarPreference2;
                Preference preference2 = findPreference3;
                RewindPreferencesFragment rewindPreferencesFragment = this.b;
                switch (i) {
                    case 0:
                        int i2 = RewindPreferencesFragment.A;
                        preference.getClass();
                        obj.getClass();
                        rewindPreferencesFragment.j(preference2, ((Integer) obj).intValue(), seekBarPreference4.A, hj6Var2);
                        seekBarPreference3.setSummary(rewindPreferencesFragment.getString(R.string.rewind_time_seconds, String.valueOf(((Number) obj).intValue())));
                        return true;
                    default:
                        int i3 = RewindPreferencesFragment.A;
                        preference.getClass();
                        int i4 = seekBarPreference4.A;
                        obj.getClass();
                        rewindPreferencesFragment.j(preference2, i4, ((Integer) obj).intValue(), hj6Var2);
                        seekBarPreference3.setSummary(rewindPreferencesFragment.getString(R.string.rewind_time_seconds, String.valueOf(((Number) obj).intValue() * 10)));
                        return true;
                }
            }
        });
        seekBarPreference2.setOnPreferenceChangeListener(new x05(this) { // from class: up5
            public final /* synthetic */ RewindPreferencesFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.x05
            public final boolean a(Preference preference, Object obj) {
                int i = r6;
                SeekBarPreference seekBarPreference3 = seekBarPreference2;
                hj6 hj6Var2 = hj6Var;
                SeekBarPreference seekBarPreference4 = seekBarPreference;
                Preference preference2 = findPreference3;
                RewindPreferencesFragment rewindPreferencesFragment = this.b;
                switch (i) {
                    case 0:
                        int i2 = RewindPreferencesFragment.A;
                        preference.getClass();
                        obj.getClass();
                        rewindPreferencesFragment.j(preference2, ((Integer) obj).intValue(), seekBarPreference4.A, hj6Var2);
                        seekBarPreference3.setSummary(rewindPreferencesFragment.getString(R.string.rewind_time_seconds, String.valueOf(((Number) obj).intValue())));
                        return true;
                    default:
                        int i3 = RewindPreferencesFragment.A;
                        preference.getClass();
                        int i4 = seekBarPreference4.A;
                        obj.getClass();
                        rewindPreferencesFragment.j(preference2, i4, ((Integer) obj).intValue(), hj6Var2);
                        seekBarPreference3.setSummary(rewindPreferencesFragment.getString(R.string.rewind_time_seconds, String.valueOf(((Number) obj).intValue() * 10)));
                        return true;
                }
            }
        });
        seekBarPreference.setSummary(getString(R.string.rewind_time_seconds, String.valueOf(seekBarPreference.A)));
        seekBarPreference2.setSummary(getString(R.string.rewind_time_seconds, String.valueOf(seekBarPreference2.A * 10)));
        j(findPreference3, seekBarPreference.A, seekBarPreference2.A, hj6Var);
    }
}
