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
import com.stormds.emulator.R;
import java.util.List;
import me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RetroAchievementsPreferencesFragment extends Hilt_RetroAchievementsPreferencesFragment implements q15 {
    public final uo7 Z;
    public cn5 d0;
    public vx3 e0;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class EndpointPreferenceState {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final en5 d;

        public EndpointPreferenceState(boolean z, boolean z2, boolean z3, en5 en5Var) {
            en5Var.getClass();
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = en5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EndpointPreferenceState)) {
                return false;
            }
            EndpointPreferenceState endpointPreferenceState = (EndpointPreferenceState) obj;
            if (this.a == endpointPreferenceState.a && this.b == endpointPreferenceState.b && this.c == endpointPreferenceState.c && nb3.k(this.d, endpointPreferenceState.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.d.hashCode() + xg6.e(xg6.e(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31);
        }

        public final String toString() {
            return "EndpointPreferenceState(isLoggedIn=" + this.a + ", isRetroAchievementsEnabled=" + this.b + ", isHardcoreEnabled=" + this.c + ", endpoint=" + this.d + ")";
        }
    }

    public RetroAchievementsPreferencesFragment() {
        go3 M = kj2.M(xr3.NONE, new RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$2(new RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$1(this)));
        this.Z = new uo7(gh5.a(sn5.class), new RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$3(M), new RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$5(this, M), new RetroAchievementsPreferencesFragment$special$$inlined$viewModels$default$4(M));
    }

    @Override // defpackage.q15
    public final String getTitle() {
        String string = getString(R.string.retroachievements);
        string.getClass();
        return string;
    }

    public final sn5 k() {
        return (sn5) this.Z.getValue();
    }

    public final void l() {
        zb zbVar = new zb(requireContext());
        zbVar.z(R.string.retroachievements);
        zbVar.w(R.string.retroachievements_account_change_blocked_in_game);
        zbVar.y(17039370, null);
        zbVar.B();
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [yc1, java.lang.Object] */
    public final void m(String str) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(requireContext(), (int) R.style.MaterialDialog);
        View inflate = LayoutInflater.from(contextThemeWrapper).inflate(R.layout.dialog_retroachievements_login, (ViewGroup) null, false);
        int i = R.id.text_password;
        TextInputEditText textInputEditText = (TextInputEditText) gi2.B(inflate, R.id.text_password);
        if (textInputEditText != null) {
            i = R.id.text_username;
            TextInputEditText textInputEditText2 = (TextInputEditText) gi2.B(inflate, R.id.text_username);
            if (textInputEditText2 != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                ?? obj = new Object();
                obj.A = textInputEditText;
                obj.B = textInputEditText2;
                if (str != null) {
                    textInputEditText2.setText(str);
                }
                zb zbVar = new zb(contextThemeWrapper);
                zbVar.z(R.string.login_with_retro_achievements);
                zbVar.A(linearLayout);
                zbVar.y(R.string.login, new nu1(4, this, obj));
                zbVar.x(R.string.cancel, new qo0(5));
                zbVar.B();
                return;
            }
        }
        u34.x("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.k15
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
        List c0 = hf.c0(switchPreference2, findPreference8, findPreference9, listPreference, switchPreference4, findPreference10, findPreference11, findPreference12);
        yh2.g(switchPreference2, new yw(1, this, switchPreference3));
        yh2.g(listPreference, new zw(this, 4));
        findPreference.setOnPreferenceClickListener(new h61(this, 18));
        hv.L(bl2.C(this), null, null, new RetroAchievementsPreferencesFragment$onCreatePreferences$4(this, findPreference, null), 3);
        hv.L(bl2.C(this), null, null, new RetroAchievementsPreferencesFragment$onCreatePreferences$5(this, (RetroAchievementsProfilePreference) findPreference2, null), 3);
        hv.L(bl2.C(this), null, null, new RetroAchievementsPreferencesFragment$onCreatePreferences$6(this, switchPreference, switchPreference2, c0, switchPreference4, switchPreference3, listPreference, null), 3);
        hv.L(bl2.C(this), null, null, new RetroAchievementsPreferencesFragment$onCreatePreferences$7(this, null), 3);
        hv.L(bl2.C(this), null, null, new RetroAchievementsPreferencesFragment$onCreatePreferences$8(this, null), 3);
    }
}
