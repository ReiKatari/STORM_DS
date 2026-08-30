package me.magnum.melonds.ui.settings.fragments;

import android.os.Bundle;
import androidx.preference.Preference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class FirmwarePreferencesFragment extends Hilt_FirmwarePreferencesFragment implements os4 {
    public final il6 Z = new il6(new b5(25, this));
    public y37 c0;
    public uf1 d0;

    @Override // defpackage.os4
    public final String getTitle() {
        String string = getString(R.string.internal_firmware_settings);
        string.getClass();
        return string;
    }

    @Override // defpackage.is4
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_internal_firmware_settings, str);
        il6 il6Var = this.Z;
        Preference findPreference = findPreference("firmware_settings_birthday");
        ((ns4) il6Var.getValue()).getClass();
        ns4.a(findPreference);
        Preference findPreference2 = findPreference("internal_mac_address");
        ((ns4) il6Var.getValue()).getClass();
        ns4.a(findPreference2);
        h("internal_randomize_mac_address", new String[]{"internal_mac_address"}, false);
    }
}
