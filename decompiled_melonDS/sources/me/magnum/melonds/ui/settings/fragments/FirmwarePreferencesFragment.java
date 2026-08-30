package me.magnum.melonds.ui.settings.fragments;

import android.os.Bundle;
import androidx.preference.Preference;
import me.magnum.melonds.R;
import yb.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class FirmwarePreferencesFragment extends Hilt_FirmwarePreferencesFragment implements ci.l {
    public final n Y = new n(new e(this, 1));
    public sd.i Z;

    /* renamed from: b0  reason: collision with root package name */
    public sd.d f9589b0;

    @Override // ci.l
    public final String getTitle() {
        String string = getString(R.string.internal_firmware_settings);
        string.getClass();
        return string;
    }

    @Override // androidx.preference.a0
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_internal_firmware_settings, str);
        n nVar = this.Y;
        Preference findPreference = findPreference("firmware_settings_birthday");
        ((ci.k) nVar.getValue()).getClass();
        ci.k.a(findPreference);
        Preference findPreference2 = findPreference("internal_mac_address");
        ((ci.k) nVar.getValue()).getClass();
        ci.k.a(findPreference2);
    }
}
