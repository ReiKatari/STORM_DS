package defpackage;

import android.content.DialogInterface;
import android.net.Uri;
import android.widget.Toast;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import androidx.preference.SwitchPreference;
import java.util.Set;
import me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment;
import me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gw implements ur4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BasePreferenceFragment b;
    public final /* synthetic */ Preference c;

    public /* synthetic */ gw(BasePreferenceFragment basePreferenceFragment, Preference preference, int i) {
        this.a = i;
        this.b = basePreferenceFragment;
        this.c = preference;
    }

    @Override // defpackage.ur4
    public final boolean a(Preference preference, Object obj) {
        SeekBarPreference seekBarPreference;
        Set set;
        Object L0;
        String str;
        int i = this.a;
        Uri uri = null;
        Preference preference2 = this.c;
        BasePreferenceFragment basePreferenceFragment = this.b;
        switch (i) {
            case 0:
                preference.getClass();
                obj.getClass();
                ((SeekBarPreference) preference2).setSummary(((AudioPreferencesFragment) basePreferenceFragment).getString(R.string.volume_percentage, Integer.valueOf((int) ((((Integer) obj).intValue() / seekBarPreference.L) * 100.0f))));
                return true;
            case 1:
                RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = (RetroAchievementsPreferencesFragment) basePreferenceFragment;
                SwitchPreference switchPreference = (SwitchPreference) preference2;
                preference.getClass();
                obj.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                id5 id5Var = retroAchievementsPreferencesFragment.c0;
                if (id5Var != null) {
                    if (id5Var.a().b == qd5.RA_OFFLINE_PROXY && booleanValue) {
                        Toast.makeText(retroAchievementsPreferencesFragment.requireContext(), (int) R.string.ra_offline_proxy_hardcore_not_supported, 1).show();
                        return false;
                    }
                    switchPreference.setVisible(!booleanValue);
                    if (booleanValue) {
                        switchPreference.e(true);
                    }
                    return true;
                }
                b53.g0("endpointProvider");
                throw null;
            case 2:
                final SystemPreferencesFragment systemPreferencesFragment = (SystemPreferencesFragment) basePreferenceFragment;
                final SwitchPreference switchPreference2 = (SwitchPreference) preference2;
                preference.getClass();
                if (systemPreferencesFragment.f0 || !b53.x(obj, Boolean.TRUE)) {
                    return true;
                }
                final Uri e = systemPreferencesFragment.k().e();
                if (e != null && systemPreferencesFragment.k().f(e)) {
                    sb sbVar = new sb(systemPreferencesFragment.requireContext());
                    sbVar.A(R.string.settings_mirror_detected_title);
                    sbVar.w(R.string.settings_mirror_detected_message);
                    sbVar.z(R.string.settings_mirror_restore, new DialogInterface.OnClickListener() { // from class: zl6
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            int i3 = r4;
                            Uri uri2 = e;
                            SwitchPreference switchPreference3 = switchPreference2;
                            SystemPreferencesFragment systemPreferencesFragment2 = systemPreferencesFragment;
                            switch (i3) {
                                case 0:
                                    systemPreferencesFragment2.f0 = true;
                                    switchPreference3.e(true);
                                    systemPreferencesFragment2.f0 = false;
                                    systemPreferencesFragment2.k().m(uri2);
                                    systemPreferencesFragment2.k().i();
                                    return;
                                default:
                                    systemPreferencesFragment2.f0 = true;
                                    switchPreference3.e(true);
                                    systemPreferencesFragment2.f0 = false;
                                    v16 k = systemPreferencesFragment2.k();
                                    String jSONObject = k.d().toString();
                                    jSONObject.getClass();
                                    k.p(uri2, jSONObject);
                                    systemPreferencesFragment2.k().i();
                                    return;
                            }
                        }
                    });
                    sbVar.x(R.string.settings_mirror_ignore, new DialogInterface.OnClickListener() { // from class: zl6
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            int i3 = r4;
                            Uri uri2 = e;
                            SwitchPreference switchPreference3 = switchPreference2;
                            SystemPreferencesFragment systemPreferencesFragment2 = systemPreferencesFragment;
                            switch (i3) {
                                case 0:
                                    systemPreferencesFragment2.f0 = true;
                                    switchPreference3.e(true);
                                    systemPreferencesFragment2.f0 = false;
                                    systemPreferencesFragment2.k().m(uri2);
                                    systemPreferencesFragment2.k().i();
                                    return;
                                default:
                                    systemPreferencesFragment2.f0 = true;
                                    switchPreference3.e(true);
                                    systemPreferencesFragment2.f0 = false;
                                    v16 k = systemPreferencesFragment2.k();
                                    String jSONObject = k.d().toString();
                                    jSONObject.getClass();
                                    k.p(uri2, jSONObject);
                                    systemPreferencesFragment2.k().i();
                                    return;
                            }
                        }
                    });
                    sbVar.C();
                    return false;
                }
                systemPreferencesFragment.f0 = true;
                switchPreference2.e(true);
                systemPreferencesFragment.f0 = false;
                systemPreferencesFragment.k().i();
                return false;
            default:
                VideoPreferencesFragment videoPreferencesFragment = (VideoPreferencesFragment) basePreferenceFragment;
                ListPreference listPreference = (ListPreference) preference2;
                preference.getClass();
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    set = null;
                }
                if (set != null && (L0 = tq0.L0(set)) != null) {
                    if (L0 instanceof String) {
                        str = (String) L0;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        uri = Uri.parse(str);
                    }
                }
                VideoPreferencesFragment.D(videoPreferencesFragment, listPreference, uri, false, 4);
                return true;
        }
    }
}
