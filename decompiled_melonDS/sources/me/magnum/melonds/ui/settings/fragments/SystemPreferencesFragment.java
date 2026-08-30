package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.b1;
import androidx.lifecycle.s;
import androidx.lifecycle.s0;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import androidx.preference.p;
import kf.x1;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import zc.g0;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class SystemPreferencesFragment extends Hilt_SystemPreferencesFragment implements ci.l {
    public x1 Y;
    public final h.c Z;

    /* renamed from: b0  reason: collision with root package name */
    public final h.c f9605b0;

    /* renamed from: c0  reason: collision with root package name */
    public final h.c f9606c0;

    /* renamed from: d0  reason: collision with root package name */
    public final h.c f9607d0;

    public SystemPreferencesFragment() {
        h.c registerForActivityResult = registerForActivityResult(new b1(1), new h.b(this) { // from class: me.magnum.melonds.ui.settings.fragments.l
            public final /* synthetic */ SystemPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // h.b
            public final void a(Object obj) {
                int i2 = r2;
                SystemPreferencesFragment systemPreferencesFragment = this.B;
                Uri uri = (Uri) obj;
                switch (i2) {
                    case 0:
                        if (uri != null) {
                            s f8 = s0.f(systemPreferencesFragment);
                            gd.f fVar = g0.f15015a;
                            x.v(f8, gd.e.L, null, new SystemPreferencesFragment$backupInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        if (uri != null) {
                            s f10 = s0.f(systemPreferencesFragment);
                            gd.f fVar2 = g0.f15015a;
                            x.v(f10, gd.e.L, null, new SystemPreferencesFragment$backupExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 2:
                        if (uri != null) {
                            s f11 = s0.f(systemPreferencesFragment);
                            gd.f fVar3 = g0.f15015a;
                            x.v(f11, gd.e.L, null, new SystemPreferencesFragment$restoreInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    default:
                        if (uri != null) {
                            s f12 = s0.f(systemPreferencesFragment);
                            gd.f fVar4 = g0.f15015a;
                            x.v(f12, gd.e.L, null, new SystemPreferencesFragment$restoreExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult.getClass();
        this.Z = registerForActivityResult;
        h.c registerForActivityResult2 = registerForActivityResult(new b1(1), new h.b(this) { // from class: me.magnum.melonds.ui.settings.fragments.l
            public final /* synthetic */ SystemPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // h.b
            public final void a(Object obj) {
                int i2 = r2;
                SystemPreferencesFragment systemPreferencesFragment = this.B;
                Uri uri = (Uri) obj;
                switch (i2) {
                    case 0:
                        if (uri != null) {
                            s f8 = s0.f(systemPreferencesFragment);
                            gd.f fVar = g0.f15015a;
                            x.v(f8, gd.e.L, null, new SystemPreferencesFragment$backupInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        if (uri != null) {
                            s f10 = s0.f(systemPreferencesFragment);
                            gd.f fVar2 = g0.f15015a;
                            x.v(f10, gd.e.L, null, new SystemPreferencesFragment$backupExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 2:
                        if (uri != null) {
                            s f11 = s0.f(systemPreferencesFragment);
                            gd.f fVar3 = g0.f15015a;
                            x.v(f11, gd.e.L, null, new SystemPreferencesFragment$restoreInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    default:
                        if (uri != null) {
                            s f12 = s0.f(systemPreferencesFragment);
                            gd.f fVar4 = g0.f15015a;
                            x.v(f12, gd.e.L, null, new SystemPreferencesFragment$restoreExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult2.getClass();
        this.f9605b0 = registerForActivityResult2;
        h.c registerForActivityResult3 = registerForActivityResult(new b1(1), new h.b(this) { // from class: me.magnum.melonds.ui.settings.fragments.l
            public final /* synthetic */ SystemPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // h.b
            public final void a(Object obj) {
                int i2 = r2;
                SystemPreferencesFragment systemPreferencesFragment = this.B;
                Uri uri = (Uri) obj;
                switch (i2) {
                    case 0:
                        if (uri != null) {
                            s f8 = s0.f(systemPreferencesFragment);
                            gd.f fVar = g0.f15015a;
                            x.v(f8, gd.e.L, null, new SystemPreferencesFragment$backupInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        if (uri != null) {
                            s f10 = s0.f(systemPreferencesFragment);
                            gd.f fVar2 = g0.f15015a;
                            x.v(f10, gd.e.L, null, new SystemPreferencesFragment$backupExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 2:
                        if (uri != null) {
                            s f11 = s0.f(systemPreferencesFragment);
                            gd.f fVar3 = g0.f15015a;
                            x.v(f11, gd.e.L, null, new SystemPreferencesFragment$restoreInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    default:
                        if (uri != null) {
                            s f12 = s0.f(systemPreferencesFragment);
                            gd.f fVar4 = g0.f15015a;
                            x.v(f12, gd.e.L, null, new SystemPreferencesFragment$restoreExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult3.getClass();
        this.f9606c0 = registerForActivityResult3;
        h.c registerForActivityResult4 = registerForActivityResult(new b1(1), new h.b(this) { // from class: me.magnum.melonds.ui.settings.fragments.l
            public final /* synthetic */ SystemPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // h.b
            public final void a(Object obj) {
                int i2 = r2;
                SystemPreferencesFragment systemPreferencesFragment = this.B;
                Uri uri = (Uri) obj;
                switch (i2) {
                    case 0:
                        if (uri != null) {
                            s f8 = s0.f(systemPreferencesFragment);
                            gd.f fVar = g0.f15015a;
                            x.v(f8, gd.e.L, null, new SystemPreferencesFragment$backupInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        if (uri != null) {
                            s f10 = s0.f(systemPreferencesFragment);
                            gd.f fVar2 = g0.f15015a;
                            x.v(f10, gd.e.L, null, new SystemPreferencesFragment$backupExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    case 2:
                        if (uri != null) {
                            s f11 = s0.f(systemPreferencesFragment);
                            gd.f fVar3 = g0.f15015a;
                            x.v(f11, gd.e.L, null, new SystemPreferencesFragment$restoreInternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                    default:
                        if (uri != null) {
                            s f12 = s0.f(systemPreferencesFragment);
                            gd.f fVar4 = g0.f15015a;
                            x.v(f12, gd.e.L, null, new SystemPreferencesFragment$restoreExternalLayoutLauncher$1$1(systemPreferencesFragment, uri, null), 2);
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult4.getClass();
        this.f9607d0 = registerForActivityResult4;
    }

    @Override // ci.l
    public final String getTitle() {
        String string = getString(R.string.category_system);
        string.getClass();
        return string;
    }

    @Override // androidx.preference.a0
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_system, str);
        Preference findPreference = findPreference("enable_jit");
        findPreference.getClass();
        SwitchPreference switchPreference = (SwitchPreference) findPreference;
        String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
        strArr.getClass();
        if (strArr.length == 0) {
            switchPreference.setEnabled(false);
            switchPreference.e(false);
            switchPreference.setSummary(R.string.jit_not_supported);
        }
        Preference findPreference2 = findPreference("backup_internal_layout");
        if (findPreference2 != null) {
            findPreference2.setOnPreferenceClickListener(new p(this) { // from class: me.magnum.melonds.ui.settings.fragments.m
                public final /* synthetic */ SystemPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // androidx.preference.p
                public final void a(Preference preference) {
                    switch (r2) {
                        case 0:
                            this.B.Z.a(null);
                            return;
                        case DSiCameraSource.FrontCamera /* 1 */:
                            this.B.f9605b0.a(null);
                            return;
                        case 2:
                            this.B.f9606c0.a(null);
                            return;
                        default:
                            this.B.f9607d0.a(null);
                            return;
                    }
                }
            });
        }
        Preference findPreference3 = findPreference("backup_external_layout");
        if (findPreference3 != null) {
            findPreference3.setOnPreferenceClickListener(new p(this) { // from class: me.magnum.melonds.ui.settings.fragments.m
                public final /* synthetic */ SystemPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // androidx.preference.p
                public final void a(Preference preference) {
                    switch (r2) {
                        case 0:
                            this.B.Z.a(null);
                            return;
                        case DSiCameraSource.FrontCamera /* 1 */:
                            this.B.f9605b0.a(null);
                            return;
                        case 2:
                            this.B.f9606c0.a(null);
                            return;
                        default:
                            this.B.f9607d0.a(null);
                            return;
                    }
                }
            });
        }
        Preference findPreference4 = findPreference("restore_internal_layout");
        if (findPreference4 != null) {
            findPreference4.setOnPreferenceClickListener(new p(this) { // from class: me.magnum.melonds.ui.settings.fragments.m
                public final /* synthetic */ SystemPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // androidx.preference.p
                public final void a(Preference preference) {
                    switch (r2) {
                        case 0:
                            this.B.Z.a(null);
                            return;
                        case DSiCameraSource.FrontCamera /* 1 */:
                            this.B.f9605b0.a(null);
                            return;
                        case 2:
                            this.B.f9606c0.a(null);
                            return;
                        default:
                            this.B.f9607d0.a(null);
                            return;
                    }
                }
            });
        }
        Preference findPreference5 = findPreference("restore_external_layout");
        if (findPreference5 != null) {
            findPreference5.setOnPreferenceClickListener(new p(this) { // from class: me.magnum.melonds.ui.settings.fragments.m
                public final /* synthetic */ SystemPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // androidx.preference.p
                public final void a(Preference preference) {
                    switch (r2) {
                        case 0:
                            this.B.Z.a(null);
                            return;
                        case DSiCameraSource.FrontCamera /* 1 */:
                            this.B.f9605b0.a(null);
                            return;
                        case 2:
                            this.B.f9606c0.a(null);
                            return;
                        default:
                            this.B.f9607d0.a(null);
                            return;
                    }
                }
            });
        }
    }
}
