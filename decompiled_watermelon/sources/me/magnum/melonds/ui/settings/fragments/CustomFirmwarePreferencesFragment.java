package me.magnum.melonds.ui.settings.fragments;

import android.os.Bundle;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class CustomFirmwarePreferencesFragment extends Hilt_CustomFirmwarePreferencesFragment implements os4 {
    public final va7 Z;
    public final il6 c0;
    public y37 d0;
    public uf1 e0;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ConsoleType.values().length];
            try {
                iArr[ConsoleType.DS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConsoleType.DSi.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public CustomFirmwarePreferencesFragment() {
        gh3 H = yf2.H(wk3.NONE, new CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$2(new CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$1(this)));
        this.Z = new va7(q75.a(y41.class), new CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$3(H), new CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$5(this, H), new CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$4(H));
        this.c0 = new il6(new b5(21, this));
    }

    @Override // defpackage.os4
    public final String getTitle() {
        String string = getString(R.string.custom_bios_firmware);
        string.getClass();
        return string;
    }

    @Override // defpackage.is4
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_custom_firmware, str);
        Preference findPreference = findPreference("console_type");
        findPreference.getClass();
        Preference findPreference2 = findPreference("bios_dir");
        findPreference2.getClass();
        BiosDirectoryPickerPreference biosDirectoryPickerPreference = (BiosDirectoryPickerPreference) findPreference2;
        Preference findPreference3 = findPreference("dsi_bios_dir");
        findPreference3.getClass();
        BiosDirectoryPickerPreference biosDirectoryPickerPreference2 = (BiosDirectoryPickerPreference) findPreference3;
        il6 il6Var = this.c0;
        ((ns4) il6Var.getValue()).c(biosDirectoryPickerPreference, null);
        ((ns4) il6Var.getValue()).c(biosDirectoryPickerPreference2, null);
        CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 customFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 = new CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1(this);
        biosDirectoryPickerPreference.Z = customFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1;
        biosDirectoryPickerPreference2.Z = customFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1;
        ((ListPreference) findPreference).setOnPreferenceChangeListener(new hw(1, this));
        h("use_custom_bios", new String[]{"show_bios"}, true);
    }
}
