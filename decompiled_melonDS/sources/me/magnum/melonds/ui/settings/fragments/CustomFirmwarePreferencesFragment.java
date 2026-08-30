package me.magnum.melonds.ui.settings.fragments;

import a7.v;
import android.os.Bundle;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import me.magnum.melonds.R;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference;
import nc.u;
import yb.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class CustomFirmwarePreferencesFragment extends Hilt_CustomFirmwarePreferencesFragment implements ci.l {
    public final v Y;
    public final n Z;

    /* renamed from: b0  reason: collision with root package name */
    public sd.i f9585b0;

    /* renamed from: c0  reason: collision with root package name */
    public sd.d f9586c0;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9587a;

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
            f9587a = iArr;
        }
    }

    public CustomFirmwarePreferencesFragment() {
        yb.f s10 = p7.a.s(yb.h.NONE, new CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$2(new CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$1(this)));
        this.Y = new v(u.a(gi.b.class), new CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$3(s10), new CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$5(this, s10), new CustomFirmwarePreferencesFragment$special$$inlined$viewModels$default$4(s10));
        this.Z = new n(new e(this, 0));
    }

    @Override // ci.l
    public final String getTitle() {
        String string = getString(R.string.custom_bios_firmware);
        string.getClass();
        return string;
    }

    @Override // androidx.preference.a0
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
        n nVar = this.Z;
        ((ci.k) nVar.getValue()).b(biosDirectoryPickerPreference);
        ((ci.k) nVar.getValue()).b(biosDirectoryPickerPreference2);
        CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 customFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 = new CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1(this);
        biosDirectoryPickerPreference.Y = customFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1;
        biosDirectoryPickerPreference2.Y = customFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1;
        ((ListPreference) findPreference).setOnPreferenceChangeListener(new a(1, this));
    }
}
