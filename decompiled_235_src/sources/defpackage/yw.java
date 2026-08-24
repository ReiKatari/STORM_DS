package defpackage;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.Uri;
import android.widget.Toast;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.TranslatorPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yw implements x05 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yw(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.x05
    public final boolean a(Preference preference, Object obj) {
        SeekBarPreference seekBarPreference;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putBoolean;
        SharedPreferences.Editor putBoolean2;
        SharedPreferences.Editor putBoolean3;
        Boolean bool;
        boolean z;
        SharedPreferences.Editor edit2;
        SharedPreferences.Editor putString;
        SharedPreferences.Editor putBoolean4;
        SharedPreferences.Editor putBoolean5;
        SharedPreferences.Editor edit3;
        SharedPreferences.Editor putString2;
        SharedPreferences.Editor putBoolean6;
        SharedPreferences.Editor putBoolean7;
        int i = this.a;
        String str = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                preference.getClass();
                obj.getClass();
                ((SeekBarPreference) obj2).setSummary(((AudioPreferencesFragment) obj3).getString(R.string.volume_percentage, Integer.valueOf((int) ((((Integer) obj).intValue() / seekBarPreference.L) * 100.0f))));
                return true;
            case 1:
                RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = (RetroAchievementsPreferencesFragment) obj3;
                SwitchPreference switchPreference = (SwitchPreference) obj2;
                preference.getClass();
                obj.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                cn5 cn5Var = retroAchievementsPreferencesFragment.d0;
                if (cn5Var != null) {
                    if (cn5Var.a().b == ln5.RA_OFFLINE_PROXY && booleanValue) {
                        Toast.makeText(retroAchievementsPreferencesFragment.requireContext(), (int) R.string.ra_offline_proxy_hardcore_not_supported, 1).show();
                        return false;
                    }
                    switchPreference.setVisible(!booleanValue);
                    if (booleanValue) {
                        switchPreference.e(true);
                    }
                    return true;
                }
                nb3.a0("endpointProvider");
                throw null;
            case 2:
                final SystemPreferencesFragment systemPreferencesFragment = (SystemPreferencesFragment) obj3;
                final SwitchPreference switchPreference2 = (SwitchPreference) obj2;
                preference.getClass();
                if (systemPreferencesFragment.g0 || !nb3.k(obj, Boolean.TRUE)) {
                    return true;
                }
                final Uri e = systemPreferencesFragment.k().e();
                if (e != null && systemPreferencesFragment.k().f(e)) {
                    zb zbVar = new zb(systemPreferencesFragment.requireContext());
                    zbVar.z(R.string.settings_mirror_detected_title);
                    zbVar.w(R.string.settings_mirror_detected_message);
                    zbVar.y(R.string.settings_mirror_restore, new DialogInterface.OnClickListener() { // from class: wx6
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            int i3 = r4;
                            Uri uri = e;
                            SwitchPreference switchPreference3 = switchPreference2;
                            SystemPreferencesFragment systemPreferencesFragment2 = systemPreferencesFragment;
                            switch (i3) {
                                case 0:
                                    systemPreferencesFragment2.g0 = true;
                                    switchPreference3.e(true);
                                    systemPreferencesFragment2.g0 = false;
                                    systemPreferencesFragment2.k().m(uri);
                                    systemPreferencesFragment2.k().i();
                                    return;
                                default:
                                    systemPreferencesFragment2.g0 = true;
                                    switchPreference3.e(true);
                                    systemPreferencesFragment2.g0 = false;
                                    jd6 k = systemPreferencesFragment2.k();
                                    String jSONObject = k.d().toString();
                                    jSONObject.getClass();
                                    k.p(uri, jSONObject);
                                    systemPreferencesFragment2.k().i();
                                    return;
                            }
                        }
                    });
                    zbVar.x(R.string.settings_mirror_ignore, new DialogInterface.OnClickListener() { // from class: wx6
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            int i3 = r4;
                            Uri uri = e;
                            SwitchPreference switchPreference3 = switchPreference2;
                            SystemPreferencesFragment systemPreferencesFragment2 = systemPreferencesFragment;
                            switch (i3) {
                                case 0:
                                    systemPreferencesFragment2.g0 = true;
                                    switchPreference3.e(true);
                                    systemPreferencesFragment2.g0 = false;
                                    systemPreferencesFragment2.k().m(uri);
                                    systemPreferencesFragment2.k().i();
                                    return;
                                default:
                                    systemPreferencesFragment2.g0 = true;
                                    switchPreference3.e(true);
                                    systemPreferencesFragment2.g0 = false;
                                    jd6 k = systemPreferencesFragment2.k();
                                    String jSONObject = k.d().toString();
                                    jSONObject.getClass();
                                    k.p(uri, jSONObject);
                                    systemPreferencesFragment2.k().i();
                                    return;
                            }
                        }
                    });
                    zbVar.B();
                    return false;
                }
                systemPreferencesFragment.g0 = true;
                switchPreference2.e(true);
                systemPreferencesFragment.g0 = false;
                systemPreferencesFragment.k().i();
                return false;
            case 3:
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj3;
                TranslatorPreferencesFragment translatorPreferencesFragment = (TranslatorPreferencesFragment) obj2;
                preference.getClass();
                if (obj instanceof String) {
                    str = (String) obj;
                }
                if (str == null) {
                    str = "neural_edge";
                }
                boolean equals = str.equals("neural_edge");
                boolean z2 = !str.equals("single");
                boolean equals2 = str.equals("local_multi");
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.e(equals2);
                }
                SharedPreferences d = translatorPreferencesFragment.getPreferenceManager().d();
                if (d != null && (edit = d.edit()) != null && (putBoolean = edit.putBoolean("translator_tts_neural_enabled", equals)) != null && (putBoolean2 = putBoolean.putBoolean("translator_tts_multi_voice", z2)) != null && (putBoolean3 = putBoolean2.putBoolean("translator_local_voice_actor_studio", equals2)) != null) {
                    putBoolean3.apply();
                }
                return true;
            default:
                ListPreference listPreference = (ListPreference) obj3;
                TranslatorPreferencesFragment translatorPreferencesFragment2 = (TranslatorPreferencesFragment) obj2;
                preference.getClass();
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                } else {
                    bool = null;
                }
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                if (z) {
                    if (listPreference != null) {
                        listPreference.h("local_multi");
                    }
                    SharedPreferences d2 = translatorPreferencesFragment2.getPreferenceManager().d();
                    if (d2 != null && (edit3 = d2.edit()) != null && (putString2 = edit3.putString("translator_tts_voice_engine", "local_multi")) != null && (putBoolean6 = putString2.putBoolean("translator_tts_neural_enabled", false)) != null && (putBoolean7 = putBoolean6.putBoolean("translator_tts_multi_voice", true)) != null) {
                        putBoolean7.apply();
                    }
                } else {
                    if (listPreference != null) {
                        str = listPreference.e0;
                    }
                    if (nb3.k(str, "local_multi")) {
                        listPreference.h("neural_edge");
                        SharedPreferences d3 = translatorPreferencesFragment2.getPreferenceManager().d();
                        if (d3 != null && (edit2 = d3.edit()) != null && (putString = edit2.putString("translator_tts_voice_engine", "neural_edge")) != null && (putBoolean4 = putString.putBoolean("translator_tts_neural_enabled", true)) != null && (putBoolean5 = putBoolean4.putBoolean("translator_tts_multi_voice", true)) != null) {
                            putBoolean5.apply();
                        }
                    }
                }
                return true;
        }
    }
}
