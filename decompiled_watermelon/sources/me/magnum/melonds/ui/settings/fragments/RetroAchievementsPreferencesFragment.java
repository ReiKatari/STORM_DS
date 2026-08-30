package me.magnum.melonds.ui.settings.fragments;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.google.android.material.textfield.TextInputEditText;
import java.util.List;
import me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class RetroAchievementsPreferencesFragment extends Hilt_RetroAchievementsPreferencesFragment implements os4 {
    public final va7 Z;
    public id5 c0;
    public uq3 d0;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public static final class EndpointPreferenceState {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final kd5 d;

        public EndpointPreferenceState(boolean z, boolean z2, boolean z3, kd5 kd5Var) {
            kd5Var.getClass();
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = kd5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EndpointPreferenceState)) {
                return false;
            }
            EndpointPreferenceState endpointPreferenceState = (EndpointPreferenceState) obj;
            if (this.a == endpointPreferenceState.a && this.b == endpointPreferenceState.b && this.c == endpointPreferenceState.c && b53.x(this.d, endpointPreferenceState.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.d.hashCode() + ej6.c(ej6.c(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31);
        }

        public final String toString() {
            return "EndpointPreferenceState(isLoggedIn=" + this.a + ", isRetroAchievementsEnabled=" + this.b + ", isHardcoreEnabled=" + this.c + ", endpoint=" + this.d + ")";
        }
    }

    public RetroAchievementsPreferencesFragment() {
        gh3 H = yf2.H(wk3.NONE, new RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$2(new RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$1(this)));
        this.Z = new va7(q75.a(xd5.class), new RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$3(H), new RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$5(this, H), new RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$4(H));
    }

    @Override // defpackage.os4
    public final String getTitle() {
        String string = getString(R.string.retroachievements);
        string.getClass();
        return string;
    }

    public final xd5 k() {
        return (xd5) this.Z.getValue();
    }

    public final void l() {
        sb sbVar = new sb(requireContext());
        sbVar.A(R.string.retroachievements);
        sbVar.w(R.string.retroachievements_account_change_blocked_in_game);
        sbVar.z(17039370, null);
        sbVar.C();
    }

    public final void m(String str) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(requireContext(), (int) R.style.MaterialDialog);
        View inflate = LayoutInflater.from(contextThemeWrapper).inflate(R.layout.dialog_retroachievements_login, (ViewGroup) null, false);
        int i = R.id.text_password;
        TextInputEditText textInputEditText = (TextInputEditText) ep2.r(inflate, R.id.text_password);
        if (textInputEditText != null) {
            i = R.id.text_username;
            TextInputEditText textInputEditText2 = (TextInputEditText) ep2.r(inflate, R.id.text_username);
            if (textInputEditText2 != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                k91 k91Var = new k91(linearLayout, textInputEditText, textInputEditText2);
                if (str != null) {
                    textInputEditText2.setText(str);
                }
                sb sbVar = new sb(contextThemeWrapper);
                sbVar.A(R.string.login_with_retro_achievements);
                sbVar.B(linearLayout);
                sbVar.z(R.string.login, new aq1(5, this, k91Var));
                sbVar.x(R.string.cancel, new hm0(6));
                sbVar.C();
                return;
            }
        }
        c44.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.is4
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_retroachievements, str);
        Preference findPreference = findPreference("ra_login");
        findPreference.getClass();
        Preference findPreference2 = findPreference("ra_profile");
        findPreference2.getClass();
        Preference findPreference3 = findPreference("ra_enabled");
        findPreference3.getClass();
        SwitchPreference switchPreference = (SwitchPreference) findPreference3;
        Preference findPreference4 = findPreference("ra_hardcore_enabled");
        findPreference4.getClass();
        SwitchPreference switchPreference2 = (SwitchPreference) findPreference4;
        Preference findPreference5 = findPreference("ra_rich_presence");
        findPreference5.getClass();
        SwitchPreference switchPreference3 = (SwitchPreference) findPreference5;
        Preference findPreference6 = findPreference("ra_offline_backend");
        findPreference6.getClass();
        ListPreference listPreference = (ListPreference) findPreference6;
        Preference findPreference7 = findPreference("ra_offline_softcore_enabled");
        findPreference7.getClass();
        SwitchPreference switchPreference4 = (SwitchPreference) findPreference7;
        Preference findPreference8 = findPreference("ra_unofficial_enabled");
        findPreference8.getClass();
        Preference findPreference9 = findPreference("ra_encore_enabled");
        findPreference9.getClass();
        Preference findPreference10 = findPreference("ra_active_challenge_indicators");
        findPreference10.getClass();
        Preference findPreference11 = findPreference("ra_progress_indicators");
        findPreference11.getClass();
        Preference findPreference12 = findPreference("ra_leaderboard_indicators");
        findPreference12.getClass();
        List c0 = l07.c0(switchPreference2, findPreference8, findPreference9, listPreference, switchPreference4, findPreference10, findPreference11, findPreference12);
        sn2.k(switchPreference2, new gw(this, switchPreference3, 1));
        sn2.k(listPreference, new hw(4, this));
        findPreference.setOnPreferenceClickListener(new a31(19, this));
        tq5.w(hk2.y(this), null, null, new RetroAchievementsPreferencesFragment$onCreatePreferences$4(this, findPreference, null), 3);
        tq5.w(hk2.y(this), null, null, new RetroAchievementsPreferencesFragment$onCreatePreferences$5(this, (RetroAchievementsProfilePreference) findPreference2, null), 3);
        tq5.w(hk2.y(this), null, null, new RetroAchievementsPreferencesFragment$onCreatePreferences$6(this, switchPreference, switchPreference2, c0, switchPreference4, switchPreference3, listPreference, null), 3);
        tq5.w(hk2.y(this), null, null, new RetroAchievementsPreferencesFragment$onCreatePreferences$7(this, null), 3);
        tq5.w(hk2.y(this), null, null, new RetroAchievementsPreferencesFragment$onCreatePreferences$8(this, null), 3);
    }
}
