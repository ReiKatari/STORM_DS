package me.magnum.melonds.ui.settings.fragments;

import android.os.Bundle;
import androidx.preference.Preference;
import me.magnum.melonds.R;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import yb.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class SaveFilesPreferencesFragment extends Hilt_SaveFilesPreferencesFragment implements ci.l {
    public final n Y = new n(new e(this, 4));
    public sd.i Z;

    /* renamed from: b0  reason: collision with root package name */
    public sd.d f9604b0;

    @Override // ci.l
    public final String getTitle() {
        String string = getString(R.string.category_save_files);
        string.getClass();
        return string;
    }

    @Override // androidx.preference.a0
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_save_files, str);
        Preference findPreference = findPreference("sram_dir");
        findPreference.getClass();
        ((ci.k) this.Y.getValue()).b((StoragePickerPreference) findPreference);
    }
}
