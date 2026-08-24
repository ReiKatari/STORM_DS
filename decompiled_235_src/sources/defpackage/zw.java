package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import androidx.fragment.app.p;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import com.stormds.emulator.R;
import java.util.Set;
import me.magnum.melonds.domain.model.MicSource;
import me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.InputPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zw implements x05 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zw(VideoPreferencesFragment videoPreferencesFragment, StoragePickerPreference storagePickerPreference) {
        this.a = 6;
        this.b = storagePickerPreference;
    }

    @Override // defpackage.x05
    public final boolean a(Preference preference, Object obj) {
        int i;
        String str;
        int i2 = this.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                AudioPreferencesFragment audioPreferencesFragment = (AudioPreferencesFragment) obj2;
                preference.getClass();
                obj.getClass();
                if (((MicSource) jw2.o((String) obj, MicSource.values())) == MicSource.DEVICE) {
                    Context requireContext = audioPreferencesFragment.requireContext();
                    requireContext.getClass();
                    if (ge7.s(requireContext, "android.permission.RECORD_AUDIO") != 0) {
                        audioPreferencesFragment.k(false);
                        return false;
                    }
                }
                return true;
            case 1:
                GeneralPreferencesFragment generalPreferencesFragment = (GeneralPreferencesFragment) obj2;
                preference.getClass();
                vs4 vs4Var = ht.a;
                Context requireContext2 = generalPreferencesFragment.requireContext();
                requireContext2.getClass();
                obj.getClass();
                String str2 = (String) obj;
                g57.Companion.getClass();
                ht.a.setValue(e57.a(str2));
                requireContext2.getSharedPreferences(v15.b(requireContext2), 0).edit().putString("theme", str2).apply();
                p activity = generalPreferencesFragment.getActivity();
                if (activity != null) {
                    activity.recreate();
                }
                return true;
            case 2:
                preference.getClass();
                obj.getClass();
                int intValue = ((Integer) obj).intValue();
                u87 u87Var = ((InputPreferencesFragment) obj2).Z;
                if (u87Var != null) {
                    op opVar = u87Var.a;
                    if (opVar.d()) {
                        i = 100;
                    } else {
                        i = (int) ((intValue / 100.0f) * 2.0f * 100.0f);
                    }
                    opVar.e(i, gi2.q(intValue, 1, 255));
                    return true;
                }
                nb3.a0("vibrator");
                throw null;
            case 3:
                r35 r35Var = (r35) obj2;
                r35Var.getClass();
                obj.getClass();
                r35Var.c((Boolean) obj);
                return true;
            case 4:
                RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = (RetroAchievementsPreferencesFragment) obj2;
                preference.getClass();
                kn5 kn5Var = ln5.Companion;
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                kn5Var.getClass();
                ln5 a = kn5.a(str);
                cn5 cn5Var = retroAchievementsPreferencesFragment.d0;
                if (cn5Var != null) {
                    a.getClass();
                    Set set = fn5.a;
                    SharedPreferences sharedPreferences = cn5Var.a;
                    en5 c = fn5.c(sharedPreferences);
                    SharedPreferences.Editor putLong = sharedPreferences.edit().putString("ra_offline_backend", a.getPreferenceValue()).putLong("ra_endpoint_generation", fn5.b(sharedPreferences));
                    ln5 ln5Var = ln5.RA_OFFLINE_PROXY;
                    if (a == ln5Var && c.b == ln5.BUILT_IN && sharedPreferences.getBoolean("ra_hardcore_enabled", false)) {
                        putLong.putBoolean("ra_proxy_hardcore_restore_pending", true).putBoolean("ra_hardcore_enabled", false);
                    } else if (a == ln5.BUILT_IN && !sharedPreferences.getBoolean("ra_offline_proxy_external_active", false)) {
                        putLong.getClass();
                        if (sharedPreferences.getBoolean("ra_proxy_hardcore_restore_pending", false) && !sharedPreferences.getBoolean("ra_hardcore_enabled", false)) {
                            putLong.putBoolean("ra_hardcore_enabled", true);
                        }
                        putLong.remove("ra_proxy_hardcore_restore_pending");
                    }
                    if (putLong.commit()) {
                        fn5.c(sharedPreferences);
                        if (a == ln5Var) {
                            cn5 cn5Var2 = retroAchievementsPreferencesFragment.d0;
                            if (cn5Var2 != null) {
                                if (cn5Var2.a().d == null) {
                                    Toast.makeText(retroAchievementsPreferencesFragment.requireContext(), (int) R.string.ra_offline_proxy_not_active, 1).show();
                                }
                            } else {
                                nb3.a0("endpointProvider");
                                throw null;
                            }
                        }
                        return true;
                    }
                    i.m("Could not persist RA offline backend");
                    return false;
                }
                nb3.a0("endpointProvider");
                throw null;
            case 5:
                preference.getClass();
                obj.getClass();
                ((RomsPreferencesFragment) obj2).l((SeekBarPreference) preference, ((Integer) obj).intValue());
                return true;
            default:
                StoragePickerPreference storagePickerPreference = (StoragePickerPreference) obj2;
                preference.getClass();
                obj.getClass();
                if (((h91) jw2.o((String) obj, h91.values())) == h91.STATIC_IMAGE) {
                    z = true;
                }
                storagePickerPreference.setVisible(z);
                return true;
        }
    }

    public /* synthetic */ zw(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
