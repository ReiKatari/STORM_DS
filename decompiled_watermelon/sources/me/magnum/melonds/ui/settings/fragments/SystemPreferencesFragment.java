package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class SystemPreferencesFragment extends Hilt_SystemPreferencesFragment implements os4 {
    public y37 Z;
    public uf1 c0;
    public v16 d0;
    public final il6 e0 = new il6(new t06(4, this));
    public boolean f0;
    public final c9 g0;
    public final c9 h0;
    public final c9 i0;
    public final c9 j0;

    public SystemPreferencesFragment() {
        c9 registerForActivityResult = registerForActivityResult(new b9(1), new z8(this) { // from class: me.magnum.melonds.ui.settings.fragments.b
            public final /* synthetic */ SystemPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // defpackage.z8
            public final void b(Object obj) {
                int i = r2;
                SystemPreferencesFragment systemPreferencesFragment = this.B;
                Uri uri = (Uri) obj;
                switch (i) {
                    case 0:
                        if (uri != null) {
                            ym3 y = hk2.y(systemPreferencesFragment);
                            bb1 bb1Var = tg1.a;
                            tq5.w(y, ha1.L, null, new SystemPreferencesFragment$backupInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 1:
                        if (uri != null) {
                            ym3 y2 = hk2.y(systemPreferencesFragment);
                            bb1 bb1Var2 = tg1.a;
                            tq5.w(y2, ha1.L, null, new SystemPreferencesFragment$backupExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 2:
                        if (uri != null) {
                            ym3 y3 = hk2.y(systemPreferencesFragment);
                            bb1 bb1Var3 = tg1.a;
                            tq5.w(y3, ha1.L, null, new SystemPreferencesFragment$restoreInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    default:
                        if (uri != null) {
                            ym3 y4 = hk2.y(systemPreferencesFragment);
                            bb1 bb1Var4 = tg1.a;
                            tq5.w(y4, ha1.L, null, new SystemPreferencesFragment$restoreExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult.getClass();
        this.g0 = registerForActivityResult;
        c9 registerForActivityResult2 = registerForActivityResult(new b9(1), new z8(this) { // from class: me.magnum.melonds.ui.settings.fragments.b
            public final /* synthetic */ SystemPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // defpackage.z8
            public final void b(Object obj) {
                int i = r2;
                SystemPreferencesFragment systemPreferencesFragment = this.B;
                Uri uri = (Uri) obj;
                switch (i) {
                    case 0:
                        if (uri != null) {
                            ym3 y = hk2.y(systemPreferencesFragment);
                            bb1 bb1Var = tg1.a;
                            tq5.w(y, ha1.L, null, new SystemPreferencesFragment$backupInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 1:
                        if (uri != null) {
                            ym3 y2 = hk2.y(systemPreferencesFragment);
                            bb1 bb1Var2 = tg1.a;
                            tq5.w(y2, ha1.L, null, new SystemPreferencesFragment$backupExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 2:
                        if (uri != null) {
                            ym3 y3 = hk2.y(systemPreferencesFragment);
                            bb1 bb1Var3 = tg1.a;
                            tq5.w(y3, ha1.L, null, new SystemPreferencesFragment$restoreInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    default:
                        if (uri != null) {
                            ym3 y4 = hk2.y(systemPreferencesFragment);
                            bb1 bb1Var4 = tg1.a;
                            tq5.w(y4, ha1.L, null, new SystemPreferencesFragment$restoreExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult2.getClass();
        this.h0 = registerForActivityResult2;
        c9 registerForActivityResult3 = registerForActivityResult(new b9(1), new z8(this) { // from class: me.magnum.melonds.ui.settings.fragments.b
            public final /* synthetic */ SystemPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // defpackage.z8
            public final void b(Object obj) {
                int i = r2;
                SystemPreferencesFragment systemPreferencesFragment = this.B;
                Uri uri = (Uri) obj;
                switch (i) {
                    case 0:
                        if (uri != null) {
                            ym3 y = hk2.y(systemPreferencesFragment);
                            bb1 bb1Var = tg1.a;
                            tq5.w(y, ha1.L, null, new SystemPreferencesFragment$backupInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 1:
                        if (uri != null) {
                            ym3 y2 = hk2.y(systemPreferencesFragment);
                            bb1 bb1Var2 = tg1.a;
                            tq5.w(y2, ha1.L, null, new SystemPreferencesFragment$backupExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 2:
                        if (uri != null) {
                            ym3 y3 = hk2.y(systemPreferencesFragment);
                            bb1 bb1Var3 = tg1.a;
                            tq5.w(y3, ha1.L, null, new SystemPreferencesFragment$restoreInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    default:
                        if (uri != null) {
                            ym3 y4 = hk2.y(systemPreferencesFragment);
                            bb1 bb1Var4 = tg1.a;
                            tq5.w(y4, ha1.L, null, new SystemPreferencesFragment$restoreExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult3.getClass();
        this.i0 = registerForActivityResult3;
        c9 registerForActivityResult4 = registerForActivityResult(new b9(1), new z8(this) { // from class: me.magnum.melonds.ui.settings.fragments.b
            public final /* synthetic */ SystemPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // defpackage.z8
            public final void b(Object obj) {
                int i = r2;
                SystemPreferencesFragment systemPreferencesFragment = this.B;
                Uri uri = (Uri) obj;
                switch (i) {
                    case 0:
                        if (uri != null) {
                            ym3 y = hk2.y(systemPreferencesFragment);
                            bb1 bb1Var = tg1.a;
                            tq5.w(y, ha1.L, null, new SystemPreferencesFragment$backupInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 1:
                        if (uri != null) {
                            ym3 y2 = hk2.y(systemPreferencesFragment);
                            bb1 bb1Var2 = tg1.a;
                            tq5.w(y2, ha1.L, null, new SystemPreferencesFragment$backupExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 2:
                        if (uri != null) {
                            ym3 y3 = hk2.y(systemPreferencesFragment);
                            bb1 bb1Var3 = tg1.a;
                            tq5.w(y3, ha1.L, null, new SystemPreferencesFragment$restoreInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    default:
                        if (uri != null) {
                            ym3 y4 = hk2.y(systemPreferencesFragment);
                            bb1 bb1Var4 = tg1.a;
                            tq5.w(y4, ha1.L, null, new SystemPreferencesFragment$restoreExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult4.getClass();
        this.j0 = registerForActivityResult4;
    }

    @Override // defpackage.os4
    public final String getTitle() {
        String string = getString(R.string.category_system);
        string.getClass();
        return string;
    }

    public final v16 k() {
        v16 v16Var = this.d0;
        if (v16Var != null) {
            return v16Var;
        }
        b53.g0("settingsBackupManager");
        throw null;
    }

    @Override // defpackage.is4
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
        String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
        strArr.getClass();
        if (strArr.length == 0) {
            switchPreference.e(false);
            switchPreference.setVisible(false);
        }
        il6 il6Var = this.e0;
        ((ns4) il6Var.getValue()).c(storagePickerPreference, null);
        Preference findPreference4 = findPreference("system_dldi_sd_card_image_size");
        ((ns4) il6Var.getValue()).getClass();
        ns4.a(findPreference4);
        switchPreference2.setOnPreferenceChangeListener(new gw(this, switchPreference2, 2));
        Preference findPreference5 = findPreference("backup_internal_layout");
        if (findPreference5 != null) {
            findPreference5.setOnPreferenceClickListener(new vr4(this) { // from class: am6
                public final /* synthetic */ SystemPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // defpackage.vr4
                public final void c(Preference preference) {
                    int i = r2;
                    SystemPreferencesFragment systemPreferencesFragment = this.B;
                    switch (i) {
                        case 0:
                            systemPreferencesFragment.g0.a(null);
                            return;
                        case 1:
                            systemPreferencesFragment.h0.a(null);
                            return;
                        case 2:
                            systemPreferencesFragment.i0.a(null);
                            return;
                        default:
                            systemPreferencesFragment.j0.a(null);
                            return;
                    }
                }
            });
        }
        Preference findPreference6 = findPreference("backup_external_layout");
        if (findPreference6 != null) {
            findPreference6.setOnPreferenceClickListener(new vr4(this) { // from class: am6
                public final /* synthetic */ SystemPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // defpackage.vr4
                public final void c(Preference preference) {
                    int i = r2;
                    SystemPreferencesFragment systemPreferencesFragment = this.B;
                    switch (i) {
                        case 0:
                            systemPreferencesFragment.g0.a(null);
                            return;
                        case 1:
                            systemPreferencesFragment.h0.a(null);
                            return;
                        case 2:
                            systemPreferencesFragment.i0.a(null);
                            return;
                        default:
                            systemPreferencesFragment.j0.a(null);
                            return;
                    }
                }
            });
        }
        Preference findPreference7 = findPreference("restore_internal_layout");
        if (findPreference7 != null) {
            findPreference7.setOnPreferenceClickListener(new vr4(this) { // from class: am6
                public final /* synthetic */ SystemPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // defpackage.vr4
                public final void c(Preference preference) {
                    int i = r2;
                    SystemPreferencesFragment systemPreferencesFragment = this.B;
                    switch (i) {
                        case 0:
                            systemPreferencesFragment.g0.a(null);
                            return;
                        case 1:
                            systemPreferencesFragment.h0.a(null);
                            return;
                        case 2:
                            systemPreferencesFragment.i0.a(null);
                            return;
                        default:
                            systemPreferencesFragment.j0.a(null);
                            return;
                    }
                }
            });
        }
        Preference findPreference8 = findPreference("restore_external_layout");
        if (findPreference8 != null) {
            findPreference8.setOnPreferenceClickListener(new vr4(this) { // from class: am6
                public final /* synthetic */ SystemPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // defpackage.vr4
                public final void c(Preference preference) {
                    int i = r2;
                    SystemPreferencesFragment systemPreferencesFragment = this.B;
                    switch (i) {
                        case 0:
                            systemPreferencesFragment.g0.a(null);
                            return;
                        case 1:
                            systemPreferencesFragment.h0.a(null);
                            return;
                        case 2:
                            systemPreferencesFragment.i0.a(null);
                            return;
                        default:
                            systemPreferencesFragment.j0.a(null);
                            return;
                    }
                }
            });
        }
    }
}
