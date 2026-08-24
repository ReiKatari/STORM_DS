package me.magnum.melonds.ui.settings.fragments;

import android.os.Bundle;
import androidx.preference.Preference;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class FirmwarePreferencesFragment extends Hilt_FirmwarePreferencesFragment implements q15 {
    public final ex6 Z = new ex6(new a5(this, 27));
    public wh7 d0;
    public yj1 e0;

    @Override // defpackage.q15
    public final String getTitle() {
        String string = getString(R.string.internal_firmware_settings);
        string.getClass();
        return string;
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_internal_firmware_settings, str);
        ex6 ex6Var = this.Z;
        Preference findPreference = findPreference("firmware_settings_birthday");
        ((p15) ex6Var.getValue()).getClass();
        p15.a(findPreference);
        Preference findPreference2 = findPreference("internal_mac_address");
        ((p15) ex6Var.getValue()).getClass();
        p15.a(findPreference2);
        h("internal_randomize_mac_address", new String[]{"internal_mac_address"}, false);
    }
}
