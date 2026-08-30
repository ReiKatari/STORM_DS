package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import java.util.Set;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.MicSource;
import me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.InputPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hw implements ur4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hw(VideoPreferencesFragment videoPreferencesFragment, StoragePickerPreference storagePickerPreference) {
        this.a = 6;
        this.b = storagePickerPreference;
    }

    @Override // defpackage.ur4
    public final boolean a(Preference preference, Object obj) {
        int i;
        int i2;
        String str;
        int i3 = this.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                AudioPreferencesFragment audioPreferencesFragment = (AudioPreferencesFragment) obj2;
                preference.getClass();
                obj.getClass();
                if (((MicSource) se.t((String) obj, MicSource.values())) == MicSource.DEVICE) {
                    Context requireContext = audioPreferencesFragment.requireContext();
                    requireContext.getClass();
                    if (jv3.o(requireContext, "android.permission.RECORD_AUDIO") != 0) {
                        audioPreferencesFragment.j(false);
                        return false;
                    }
                }
                return true;
            case 1:
                CustomFirmwarePreferencesFragment customFirmwarePreferencesFragment = (CustomFirmwarePreferencesFragment) obj2;
                preference.getClass();
                obj.getClass();
                ConsoleType consoleType = (ConsoleType) se.t((String) obj, ConsoleType.values());
                if (((y41) customFirmwarePreferencesFragment.Z.getValue()).b.b(consoleType).b != gw0.VALID) {
                    int i4 = CustomFirmwarePreferencesFragment.WhenMappings.a[consoleType.ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            i = R.string.dsi_incorrect_bios_dir_info;
                        } else {
                            i.c();
                            return false;
                        }
                    } else {
                        i = R.string.ds_incorrect_bios_dir_info;
                    }
                    sb sbVar = new sb(customFirmwarePreferencesFragment.requireContext());
                    sbVar.w(i);
                    sbVar.z(R.string.ok, null);
                    sbVar.C();
                }
                return true;
            case 2:
                preference.getClass();
                obj.getClass();
                int intValue = ((Integer) obj).intValue();
                hw6 hw6Var = ((InputPreferencesFragment) obj2).Z;
                if (hw6Var != null) {
                    cp cpVar = hw6Var.a;
                    if (cpVar.d()) {
                        i2 = 100;
                    } else {
                        i2 = (int) ((intValue / 100.0f) * 2.0f * 100.0f);
                    }
                    cpVar.e(i2, io2.m(intValue, 1, 255));
                    return true;
                }
                b53.g0("vibrator");
                throw null;
            case 3:
                nu4 nu4Var = (nu4) obj2;
                nu4Var.getClass();
                obj.getClass();
                nu4Var.c((Boolean) obj);
                return true;
            case 4:
                RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = (RetroAchievementsPreferencesFragment) obj2;
                preference.getClass();
                pd5 pd5Var = qd5.Companion;
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                pd5Var.getClass();
                qd5 a = pd5.a(str);
                id5 id5Var = retroAchievementsPreferencesFragment.c0;
                if (id5Var != null) {
                    a.getClass();
                    Set set = ld5.a;
                    SharedPreferences sharedPreferences = id5Var.a;
                    kd5 c = ld5.c(sharedPreferences);
                    SharedPreferences.Editor putLong = sharedPreferences.edit().putString("ra_offline_backend", a.getPreferenceValue()).putLong("ra_endpoint_generation", ld5.b(sharedPreferences));
                    qd5 qd5Var = qd5.RA_OFFLINE_PROXY;
                    if (a == qd5Var && c.b == qd5.BUILT_IN && sharedPreferences.getBoolean("ra_hardcore_enabled", false)) {
                        putLong.putBoolean("ra_proxy_hardcore_restore_pending", true).putBoolean("ra_hardcore_enabled", false);
                    } else if (a == qd5.BUILT_IN && !sharedPreferences.getBoolean("ra_offline_proxy_external_active", false)) {
                        putLong.getClass();
                        if (sharedPreferences.getBoolean("ra_proxy_hardcore_restore_pending", false) && !sharedPreferences.getBoolean("ra_hardcore_enabled", false)) {
                            putLong.putBoolean("ra_hardcore_enabled", true);
                        }
                        putLong.remove("ra_proxy_hardcore_restore_pending");
                    }
                    if (putLong.commit()) {
                        ld5.c(sharedPreferences);
                        if (a == qd5Var) {
                            id5 id5Var2 = retroAchievementsPreferencesFragment.c0;
                            if (id5Var2 != null) {
                                if (id5Var2.a().d == null) {
                                    Toast.makeText(retroAchievementsPreferencesFragment.requireContext(), (int) R.string.ra_offline_proxy_not_active, 1).show();
                                }
                            } else {
                                b53.g0("endpointProvider");
                                throw null;
                            }
                        }
                        return true;
                    }
                    i.n("Could not persist RA offline backend");
                    return false;
                }
                b53.g0("endpointProvider");
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
                if (((t51) se.t((String) obj, t51.values())) == t51.STATIC_IMAGE) {
                    z = true;
                }
                storagePickerPreference.setVisible(z);
                return true;
        }
    }

    public /* synthetic */ hw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
