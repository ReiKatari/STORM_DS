package me.magnum.melonds.ui.settings.fragments;

import a7.v;
import android.os.Bundle;
import androidx.lifecycle.s0;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import k7.w;
import me.magnum.melonds.R;
import nc.u;
import og.o;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class RetroAchievementsPreferencesFragment extends Hilt_RetroAchievementsPreferencesFragment implements ci.l {
    public final v Y;
    public o Z;

    public RetroAchievementsPreferencesFragment() {
        yb.f s10 = p7.a.s(yb.h.NONE, new RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$2(new RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$1(this)));
        this.Y = new v(u.a(gi.e.class), new RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$3(s10), new RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$5(this, s10), new RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$4(s10));
    }

    @Override // ci.l
    public final String getTitle() {
        String string = getString(R.string.retroachievements);
        string.getClass();
        return string;
    }

    public final gi.e i() {
        return (gi.e) this.Y.getValue();
    }

    @Override // androidx.preference.a0
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_retroachievements, str);
        Preference findPreference = findPreference("ra_login");
        findPreference.getClass();
        Preference findPreference2 = findPreference("ra_hardcore_enabled");
        findPreference2.getClass();
        SwitchPreference switchPreference = (SwitchPreference) findPreference2;
        Preference findPreference3 = findPreference("ra_rich_presence");
        findPreference3.getClass();
        SwitchPreference switchPreference2 = (SwitchPreference) findPreference3;
        w.f(switchPreference, new a(3, switchPreference2));
        findPreference.setOnPreferenceClickListener(new c(this, 1));
        x.v(s0.f(this), null, null, new RetroAchievementsPreferencesFragment$onCreatePreferences$3(this, findPreference, null), 3);
        x.v(s0.f(this), null, null, new RetroAchievementsPreferencesFragment$onCreatePreferences$4(this, switchPreference, switchPreference2, null), 3);
        x.v(s0.f(this), null, null, new RetroAchievementsPreferencesFragment$onCreatePreferences$5(this, null), 3);
        x.v(s0.f(this), null, null, new RetroAchievementsPreferencesFragment$onCreatePreferences$6(this, null), 3);
    }
}
