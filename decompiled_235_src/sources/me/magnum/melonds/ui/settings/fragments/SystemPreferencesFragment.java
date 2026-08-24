package me.magnum.melonds.ui.settings.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.dldi.DldiFileManagerActivity;
import me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class SystemPreferencesFragment extends Hilt_SystemPreferencesFragment implements q15 {
    public wh7 Z;
    public yj1 d0;
    public jd6 e0;
    public final ex6 f0 = new ex6(new t46(this, 11));
    public boolean g0;
    public final d9 h0;
    public final d9 i0;
    public final d9 j0;
    public final d9 k0;

    public SystemPreferencesFragment() {
        d9 registerForActivityResult = registerForActivityResult(new c9(2), new a9(this) { // from class: me.magnum.melonds.ui.settings.fragments.c
            public final /* synthetic */ SystemPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // defpackage.a9
            public final void a(Object obj) {
                int i = r2;
                SystemPreferencesFragment systemPreferencesFragment = this.B;
                Uri uri = (Uri) obj;
                switch (i) {
                    case 0:
                        if (uri != null) {
                            au3 C = bl2.C(systemPreferencesFragment);
                            xe1 xe1Var = xk1.a;
                            hv.L(C, de1.L, null, new SystemPreferencesFragment$backupInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 1:
                        if (uri != null) {
                            au3 C2 = bl2.C(systemPreferencesFragment);
                            xe1 xe1Var2 = xk1.a;
                            hv.L(C2, de1.L, null, new SystemPreferencesFragment$backupExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 2:
                        if (uri != null) {
                            au3 C3 = bl2.C(systemPreferencesFragment);
                            xe1 xe1Var3 = xk1.a;
                            hv.L(C3, de1.L, null, new SystemPreferencesFragment$restoreInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    default:
                        if (uri != null) {
                            au3 C4 = bl2.C(systemPreferencesFragment);
                            xe1 xe1Var4 = xk1.a;
                            hv.L(C4, de1.L, null, new SystemPreferencesFragment$restoreExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult.getClass();
        this.h0 = registerForActivityResult;
        d9 registerForActivityResult2 = registerForActivityResult(new c9(2), new a9(this) { // from class: me.magnum.melonds.ui.settings.fragments.c
            public final /* synthetic */ SystemPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // defpackage.a9
            public final void a(Object obj) {
                int i = r2;
                SystemPreferencesFragment systemPreferencesFragment = this.B;
                Uri uri = (Uri) obj;
                switch (i) {
                    case 0:
                        if (uri != null) {
                            au3 C = bl2.C(systemPreferencesFragment);
                            xe1 xe1Var = xk1.a;
                            hv.L(C, de1.L, null, new SystemPreferencesFragment$backupInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 1:
                        if (uri != null) {
                            au3 C2 = bl2.C(systemPreferencesFragment);
                            xe1 xe1Var2 = xk1.a;
                            hv.L(C2, de1.L, null, new SystemPreferencesFragment$backupExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 2:
                        if (uri != null) {
                            au3 C3 = bl2.C(systemPreferencesFragment);
                            xe1 xe1Var3 = xk1.a;
                            hv.L(C3, de1.L, null, new SystemPreferencesFragment$restoreInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    default:
                        if (uri != null) {
                            au3 C4 = bl2.C(systemPreferencesFragment);
                            xe1 xe1Var4 = xk1.a;
                            hv.L(C4, de1.L, null, new SystemPreferencesFragment$restoreExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult2.getClass();
        this.i0 = registerForActivityResult2;
        d9 registerForActivityResult3 = registerForActivityResult(new c9(2), new a9(this) { // from class: me.magnum.melonds.ui.settings.fragments.c
            public final /* synthetic */ SystemPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // defpackage.a9
            public final void a(Object obj) {
                int i = r2;
                SystemPreferencesFragment systemPreferencesFragment = this.B;
                Uri uri = (Uri) obj;
                switch (i) {
                    case 0:
                        if (uri != null) {
                            au3 C = bl2.C(systemPreferencesFragment);
                            xe1 xe1Var = xk1.a;
                            hv.L(C, de1.L, null, new SystemPreferencesFragment$backupInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 1:
                        if (uri != null) {
                            au3 C2 = bl2.C(systemPreferencesFragment);
                            xe1 xe1Var2 = xk1.a;
                            hv.L(C2, de1.L, null, new SystemPreferencesFragment$backupExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 2:
                        if (uri != null) {
                            au3 C3 = bl2.C(systemPreferencesFragment);
                            xe1 xe1Var3 = xk1.a;
                            hv.L(C3, de1.L, null, new SystemPreferencesFragment$restoreInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    default:
                        if (uri != null) {
                            au3 C4 = bl2.C(systemPreferencesFragment);
                            xe1 xe1Var4 = xk1.a;
                            hv.L(C4, de1.L, null, new SystemPreferencesFragment$restoreExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult3.getClass();
        this.j0 = registerForActivityResult3;
        d9 registerForActivityResult4 = registerForActivityResult(new c9(2), new a9(this) { // from class: me.magnum.melonds.ui.settings.fragments.c
            public final /* synthetic */ SystemPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // defpackage.a9
            public final void a(Object obj) {
                int i = r2;
                SystemPreferencesFragment systemPreferencesFragment = this.B;
                Uri uri = (Uri) obj;
                switch (i) {
                    case 0:
                        if (uri != null) {
                            au3 C = bl2.C(systemPreferencesFragment);
                            xe1 xe1Var = xk1.a;
                            hv.L(C, de1.L, null, new SystemPreferencesFragment$backupInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 1:
                        if (uri != null) {
                            au3 C2 = bl2.C(systemPreferencesFragment);
                            xe1 xe1Var2 = xk1.a;
                            hv.L(C2, de1.L, null, new SystemPreferencesFragment$backupExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 2:
                        if (uri != null) {
                            au3 C3 = bl2.C(systemPreferencesFragment);
                            xe1 xe1Var3 = xk1.a;
                            hv.L(C3, de1.L, null, new SystemPreferencesFragment$restoreInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    default:
                        if (uri != null) {
                            au3 C4 = bl2.C(systemPreferencesFragment);
                            xe1 xe1Var4 = xk1.a;
                            hv.L(C4, de1.L, null, new SystemPreferencesFragment$restoreExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult4.getClass();
        this.k0 = registerForActivityResult4;
    }

    @Override // defpackage.q15
    public final String getTitle() {
        String string = getString(R.string.category_system);
        string.getClass();
        return string;
    }

    public final jd6 k() {
        jd6 jd6Var = this.e0;
        if (jd6Var != null) {
            return jd6Var;
        }
        nb3.a0("settingsBackupManager");
        throw null;
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_system, str);
        Preference findPreference = findPreference("enable_jit");
        findPreference.getClass();
        SwitchPreference switchPreference = (SwitchPreference) findPreference;
        Preference findPreference2 = findPreference("save_internal_config_as_file");
        findPreference2.getClass();
        SwitchPreference switchPreference2 = (SwitchPreference) findPreference2;
        Preference findPreference3 = findPreference("system_dldi_sd_card_dir");
        findPreference3.getClass();
        StoragePickerPreference storagePickerPreference = (StoragePickerPreference) findPreference3;
        ListPreference listPreference = (ListPreference) findPreference("app_language");
        if (listPreference != null) {
            listPreference.setOnPreferenceChangeListener(new l15(1));
        }
        String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
        strArr.getClass();
        if (strArr.length == 0) {
            switchPreference.e(false);
            switchPreference.setVisible(false);
        }
        ex6 ex6Var = this.f0;
        ((p15) ex6Var.getValue()).c(storagePickerPreference, null);
        Preference findPreference4 = findPreference("system_dldi_sd_card_image_size");
        ((p15) ex6Var.getValue()).getClass();
        p15.a(findPreference4);
        Preference findPreference5 = findPreference("pref_open_dldi_file_manager");
        if (findPreference5 != null) {
            findPreference5.setOnPreferenceClickListener(new y05(this) { // from class: vx6
                public final /* synthetic */ SystemPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // defpackage.y05
                public final void i(Preference preference) {
                    int i = r2;
                    SystemPreferencesFragment systemPreferencesFragment = this.B;
                    switch (i) {
                        case 0:
                            systemPreferencesFragment.j0.a(null);
                            return;
                        case 1:
                            systemPreferencesFragment.k0.a(null);
                            return;
                        case 2:
                            systemPreferencesFragment.startActivity(new Intent(systemPreferencesFragment.requireContext(), DldiFileManagerActivity.class));
                            return;
                        case 3:
                            systemPreferencesFragment.h0.a(null);
                            return;
                        default:
                            systemPreferencesFragment.i0.a(null);
                            return;
                    }
                }
            });
        }
        switchPreference2.setOnPreferenceChangeListener(new yw(2, this, switchPreference2));
        Preference findPreference6 = findPreference("backup_internal_layout");
        if (findPreference6 != null) {
            findPreference6.setOnPreferenceClickListener(new y05(this) { // from class: vx6
                public final /* synthetic */ SystemPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // defpackage.y05
                public final void i(Preference preference) {
                    int i = r2;
                    SystemPreferencesFragment systemPreferencesFragment = this.B;
                    switch (i) {
                        case 0:
                            systemPreferencesFragment.j0.a(null);
                            return;
                        case 1:
                            systemPreferencesFragment.k0.a(null);
                            return;
                        case 2:
                            systemPreferencesFragment.startActivity(new Intent(systemPreferencesFragment.requireContext(), DldiFileManagerActivity.class));
                            return;
                        case 3:
                            systemPreferencesFragment.h0.a(null);
                            return;
                        default:
                            systemPreferencesFragment.i0.a(null);
                            return;
                    }
                }
            });
        }
        Preference findPreference7 = findPreference("backup_external_layout");
        if (findPreference7 != null) {
            findPreference7.setOnPreferenceClickListener(new y05(this) { // from class: vx6
                public final /* synthetic */ SystemPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // defpackage.y05
                public final void i(Preference preference) {
                    int i = r2;
                    SystemPreferencesFragment systemPreferencesFragment = this.B;
                    switch (i) {
                        case 0:
                            systemPreferencesFragment.j0.a(null);
                            return;
                        case 1:
                            systemPreferencesFragment.k0.a(null);
                            return;
                        case 2:
                            systemPreferencesFragment.startActivity(new Intent(systemPreferencesFragment.requireContext(), DldiFileManagerActivity.class));
                            return;
                        case 3:
                            systemPreferencesFragment.h0.a(null);
                            return;
                        default:
                            systemPreferencesFragment.i0.a(null);
                            return;
                    }
                }
            });
        }
        Preference findPreference8 = findPreference("restore_internal_layout");
        if (findPreference8 != null) {
            findPreference8.setOnPreferenceClickListener(new y05(this) { // from class: vx6
                public final /* synthetic */ SystemPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // defpackage.y05
                public final void i(Preference preference) {
                    int i = r2;
                    SystemPreferencesFragment systemPreferencesFragment = this.B;
                    switch (i) {
                        case 0:
                            systemPreferencesFragment.j0.a(null);
                            return;
                        case 1:
                            systemPreferencesFragment.k0.a(null);
                            return;
                        case 2:
                            systemPreferencesFragment.startActivity(new Intent(systemPreferencesFragment.requireContext(), DldiFileManagerActivity.class));
                            return;
                        case 3:
                            systemPreferencesFragment.h0.a(null);
                            return;
                        default:
                            systemPreferencesFragment.i0.a(null);
                            return;
                    }
                }
            });
        }
        Preference findPreference9 = findPreference("restore_external_layout");
        if (findPreference9 != null) {
            findPreference9.setOnPreferenceClickListener(new y05(this) { // from class: vx6
                public final /* synthetic */ SystemPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // defpackage.y05
                public final void i(Preference preference) {
                    int i = r2;
                    SystemPreferencesFragment systemPreferencesFragment = this.B;
                    switch (i) {
                        case 0:
                            systemPreferencesFragment.j0.a(null);
                            return;
                        case 1:
                            systemPreferencesFragment.k0.a(null);
                            return;
                        case 2:
                            systemPreferencesFragment.startActivity(new Intent(systemPreferencesFragment.requireContext(), DldiFileManagerActivity.class));
                            return;
                        case 3:
                            systemPreferencesFragment.h0.a(null);
                            return;
                        default:
                            systemPreferencesFragment.i0.a(null);
                            return;
                    }
                }
            });
        }
    }
}
