package me.magnum.melonds.ui.settings.fragments;

import android.os.Bundle;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class SaveFilesPreferencesFragment extends Hilt_SaveFilesPreferencesFragment implements q15 {
    public final ex6 Z = new ex6(new er2(this, 28));
    public wh7 d0;
    public yj1 e0;
    public jd6 f0;

    @Override // defpackage.q15
    public final String getTitle() {
        String string = getString(R.string.category_save_files);
        string.getClass();
        return string;
    }

    public final jd6 k() {
        jd6 jd6Var = this.f0;
        if (jd6Var != null) {
            return jd6Var;
        }
        nb3.a0("settingsBackupManager");
        throw null;
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_save_files, str);
        StoragePickerPreference storagePickerPreference = (StoragePickerPreference) findPreference("sram_dir");
        if (storagePickerPreference != null) {
            ((p15) this.Z.getValue()).c(storagePickerPreference, new y36(this, 0));
        }
    }
}
