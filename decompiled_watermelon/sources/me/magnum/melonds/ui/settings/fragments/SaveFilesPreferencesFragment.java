package me.magnum.melonds.ui.settings.fragments;

import android.os.Bundle;
import androidx.preference.Preference;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class SaveFilesPreferencesFragment extends Hilt_SaveFilesPreferencesFragment implements os4 {
    public final il6 Z = new il6(new bz2(21, this));
    public y37 c0;
    public uf1 d0;
    public v16 e0;

    @Override // defpackage.os4
    public final String getTitle() {
        String string = getString(R.string.category_save_files);
        string.getClass();
        return string;
    }

    public final v16 k() {
        v16 v16Var = this.e0;
        if (v16Var != null) {
            return v16Var;
        }
        b53.g0("settingsBackupManager");
        throw null;
    }

    @Override // defpackage.is4
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_save_files, str);
        Preference findPreference = findPreference("sram_dir");
        findPreference.getClass();
        ((ns4) this.Z.getValue()).c((StoragePickerPreference) findPreference, new bt5(0, this));
        h("use_rom_dir", new String[]{"sram_dir"}, false);
    }
}
