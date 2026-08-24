package me.magnum.melonds.ui.settings.fragments;

import android.os.Bundle;
import androidx.preference.Preference;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class CustomFirmwarePreferencesFragment extends Hilt_CustomFirmwarePreferencesFragment implements q15 {
    public final uo7 Z;
    public final ex6 d0;
    public wh7 e0;
    public yj1 f0;
    public m40 g0;

    public CustomFirmwarePreferencesFragment() {
        go3 M = kj2.M(xr3.NONE, new CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$2(new CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$1(this)));
        this.Z = new uo7(gh5.a(k81.class), new CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$3(M), new CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$5(this, M), new CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$4(M));
        this.d0 = new ex6(new a5(this, 21));
    }

    @Override // defpackage.q15
    public final String getTitle() {
        String string = getString(R.string.custom_bios_firmware);
        string.getClass();
        return string;
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_custom_firmware, str);
        Preference findPreference = findPreference("bios_dir");
        findPreference.getClass();
        BiosDirectoryPickerPreference biosDirectoryPickerPreference = (BiosDirectoryPickerPreference) findPreference;
        Preference findPreference2 = findPreference("dsi_bios_dir");
        findPreference2.getClass();
        BiosDirectoryPickerPreference biosDirectoryPickerPreference2 = (BiosDirectoryPickerPreference) findPreference2;
        ex6 ex6Var = this.d0;
        ((p15) ex6Var.getValue()).c(biosDirectoryPickerPreference, null);
        ((p15) ex6Var.getValue()).c(biosDirectoryPickerPreference2, null);
        CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 customFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 = new CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1(this);
        biosDirectoryPickerPreference.Z = customFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1;
        biosDirectoryPickerPreference2.Z = customFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1;
        Preference findPreference3 = findPreference("auto_download_ds_bios");
        Preference findPreference4 = findPreference("auto_download_dsi_bios");
        if (findPreference3 != null) {
            findPreference3.setOnPreferenceClickListener(new a(this, biosDirectoryPickerPreference, 0));
        }
        if (findPreference4 != null) {
            findPreference4.setOnPreferenceClickListener(new a(this, biosDirectoryPickerPreference2, 1));
        }
        h("use_custom_bios", new String[]{"show_bios"}, true);
    }
}
