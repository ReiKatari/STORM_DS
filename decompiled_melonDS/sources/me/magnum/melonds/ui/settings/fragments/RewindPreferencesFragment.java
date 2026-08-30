package me.magnum.melonds.ui.settings.fragments;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import androidx.preference.o;
import com.smp.masterswitchpreference.MasterSwitchPreferenceFragment;
import me.magnum.melonds.R;
import oe.k0;
import oe.n0;
import oe.o0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class RewindPreferencesFragment extends MasterSwitchPreferenceFragment implements ci.l {
    public static final /* synthetic */ int A = 0;

    @Override // ci.l
    public final String getTitle() {
        String string = getString(R.string.rewind);
        string.getClass();
        return string;
    }

    public final void j(Preference preference, int i2, int i10, o0 o0Var) {
        o0 o0Var2;
        int i11 = i10 * 10;
        if (o0Var != null) {
            o0Var2 = new o0(((float) o0Var.A) * 0.2f);
        } else {
            o0Var2 = null;
        }
        long j2 = new n0(20L).A * (i11 / i2);
        o0 o0Var3 = new o0(j2);
        Context requireContext = requireContext();
        requireContext.getClass();
        String S = d0.d.S(requireContext, o0Var3, 2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getString(R.string.rewind_max_memory_usage, S));
        if (o0Var2 != null && nc.k.c(j2, o0Var2.A) > 0) {
            sb2.append('\n');
            sb2.append(getString(R.string.rewind_memory_usage_above_recommended_limit));
        }
        preference.setSummary(sb2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.smp.masterswitchpreference.MasterSwitchPreferenceFragment, androidx.preference.a0
    public final void onCreatePreferences(Bundle bundle, String str) {
        o0 o0Var;
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
            o0Var = new o0(memoryInfo.totalMem);
        } else {
            o0Var = null;
        }
        final k0 k0Var = o0Var;
        seekBarPreference.setOnPreferenceChangeListener(new o(this) { // from class: me.magnum.melonds.ui.settings.fragments.i

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ RewindPreferencesFragment f9623b;

            {
                this.f9623b = this;
            }

            @Override // androidx.preference.o
            public final boolean a(Preference preference, Object obj) {
                int i2 = r6;
                SeekBarPreference seekBarPreference3 = seekBarPreference;
                k0 k0Var2 = k0Var;
                SeekBarPreference seekBarPreference4 = seekBarPreference2;
                Preference preference2 = findPreference3;
                RewindPreferencesFragment rewindPreferencesFragment = this.f9623b;
                switch (i2) {
                    case 0:
                        int i10 = RewindPreferencesFragment.A;
                        preference.getClass();
                        obj.getClass();
                        rewindPreferencesFragment.j(preference2, ((Integer) obj).intValue(), seekBarPreference4.A, k0Var2);
                        seekBarPreference3.setSummary(rewindPreferencesFragment.getString(R.string.rewind_time_seconds, String.valueOf(((Number) obj).intValue())));
                        return true;
                    default:
                        int i11 = RewindPreferencesFragment.A;
                        preference.getClass();
                        int i12 = seekBarPreference4.A;
                        obj.getClass();
                        rewindPreferencesFragment.j(preference2, i12, ((Integer) obj).intValue(), k0Var2);
                        seekBarPreference3.setSummary(rewindPreferencesFragment.getString(R.string.rewind_time_seconds, String.valueOf(((Number) obj).intValue() * 10)));
                        return true;
                }
            }
        });
        seekBarPreference2.setOnPreferenceChangeListener(new o(this) { // from class: me.magnum.melonds.ui.settings.fragments.i

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ RewindPreferencesFragment f9623b;

            {
                this.f9623b = this;
            }

            @Override // androidx.preference.o
            public final boolean a(Preference preference, Object obj) {
                int i2 = r6;
                SeekBarPreference seekBarPreference3 = seekBarPreference2;
                k0 k0Var2 = k0Var;
                SeekBarPreference seekBarPreference4 = seekBarPreference;
                Preference preference2 = findPreference3;
                RewindPreferencesFragment rewindPreferencesFragment = this.f9623b;
                switch (i2) {
                    case 0:
                        int i10 = RewindPreferencesFragment.A;
                        preference.getClass();
                        obj.getClass();
                        rewindPreferencesFragment.j(preference2, ((Integer) obj).intValue(), seekBarPreference4.A, k0Var2);
                        seekBarPreference3.setSummary(rewindPreferencesFragment.getString(R.string.rewind_time_seconds, String.valueOf(((Number) obj).intValue())));
                        return true;
                    default:
                        int i11 = RewindPreferencesFragment.A;
                        preference.getClass();
                        int i12 = seekBarPreference4.A;
                        obj.getClass();
                        rewindPreferencesFragment.j(preference2, i12, ((Integer) obj).intValue(), k0Var2);
                        seekBarPreference3.setSummary(rewindPreferencesFragment.getString(R.string.rewind_time_seconds, String.valueOf(((Number) obj).intValue() * 10)));
                        return true;
                }
            }
        });
        seekBarPreference.setSummary(getString(R.string.rewind_time_seconds, String.valueOf(seekBarPreference.A)));
        seekBarPreference2.setSummary(getString(R.string.rewind_time_seconds, String.valueOf(seekBarPreference2.A * 10)));
        j(findPreference3, seekBarPreference.A, seekBarPreference2.A, k0Var);
    }
}
