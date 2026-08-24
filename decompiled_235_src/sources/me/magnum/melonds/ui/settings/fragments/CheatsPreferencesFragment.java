package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import androidx.preference.Preference;
import androidx.work.impl.WorkDatabase;
import com.stormds.emulator.R;
import java.util.List;
import me.magnum.melonds.ui.settings.fragments.CheatsPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class CheatsPreferencesFragment extends Hilt_CheatsPreferencesFragment implements q15 {
    public final uo7 Z;
    public final d9 d0;
    public final d9 e0;

    public CheatsPreferencesFragment() {
        go3 M = kj2.M(xr3.NONE, new CheatsPreferencesFragment$special$$inlined$viewModels$default$2(new CheatsPreferencesFragment$special$$inlined$viewModels$default$1(this)));
        this.Z = new uo7(gh5.a(gp0.class), new CheatsPreferencesFragment$special$$inlined$viewModels$default$3(M), new CheatsPreferencesFragment$special$$inlined$viewModels$default$5(this, M), new CheatsPreferencesFragment$special$$inlined$viewModels$default$4(M));
        d9 registerForActivityResult = registerForActivityResult(new zj1(sv4.READ, 1), new a9(this) { // from class: fp0
            public final /* synthetic */ CheatsPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // defpackage.a9
            public final void a(Object obj) {
                int i = r2;
                CheatsPreferencesFragment cheatsPreferencesFragment = this.B;
                switch (i) {
                    case 0:
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            ((h16) ((gp0) cheatsPreferencesFragment.Z.getValue()).b).l(uri);
                            new uo0().show(cheatsPreferencesFragment.getChildFragmentManager(), (String) null);
                            return;
                        }
                        return;
                    default:
                        ((Boolean) obj).getClass();
                        cheatsPreferencesFragment.k();
                        return;
                }
            }
        });
        registerForActivityResult.getClass();
        this.d0 = registerForActivityResult;
        d9 registerForActivityResult2 = registerForActivityResult(new c9(4), new a9(this) { // from class: fp0
            public final /* synthetic */ CheatsPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // defpackage.a9
            public final void a(Object obj) {
                int i = r2;
                CheatsPreferencesFragment cheatsPreferencesFragment = this.B;
                switch (i) {
                    case 0:
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            ((h16) ((gp0) cheatsPreferencesFragment.Z.getValue()).b).l(uri);
                            new uo0().show(cheatsPreferencesFragment.getChildFragmentManager(), (String) null);
                            return;
                        }
                        return;
                    default:
                        ((Boolean) obj).getClass();
                        cheatsPreferencesFragment.k();
                        return;
                }
            }
        });
        registerForActivityResult2.getClass();
        this.e0 = registerForActivityResult2;
    }

    @Override // defpackage.q15
    public final String getTitle() {
        String string = getString(R.string.cheats);
        string.getClass();
        return string;
    }

    public final void k() {
        lw7 b = lw7.b(((h16) ((gp0) this.Z.getValue()).b).a);
        b.getClass();
        WorkDatabase workDatabase = b.c;
        ow7 ow7Var = b.d;
        workDatabase.getClass();
        ow7Var.getClass();
        r76 r76Var = new r76(13);
        zb6 zb6Var = ow7Var.a;
        zb6Var.getClass();
        List<jw7> list = (List) ((tb0) yh2.p(zb6Var, "loadStatusFuture", new ci2(29, r76Var, workDatabase))).B.get();
        list.getClass();
        if (!list.isEmpty()) {
            for (jw7 jw7Var : list) {
                if (!jw7Var.b.isFinished()) {
                    new uo0().show(getChildFragmentManager(), (String) null);
                    return;
                }
            }
        }
        this.d0.a(new vr4(null, new String[]{"text/xml"}));
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_cheats, str);
        Preference findPreference = findPreference("cheats_import");
        findPreference.getClass();
        Preference findPreference2 = findPreference("cheats_download_online");
        if (findPreference2 != null) {
            findPreference2.setOnPreferenceClickListener(new y05(this) { // from class: ep0
                public final /* synthetic */ CheatsPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // defpackage.y05
                public final void i(Preference preference) {
                    int i = r2;
                    CheatsPreferencesFragment cheatsPreferencesFragment = this.B;
                    switch (i) {
                        case 0:
                            Toast.makeText(cheatsPreferencesFragment.requireContext(), cheatsPreferencesFragment.getString(R.string.cheats_download_success), 1).show();
                            return;
                        default:
                            if (Build.VERSION.SDK_INT >= 33) {
                                Context requireContext = cheatsPreferencesFragment.requireContext();
                                requireContext.getClass();
                                if (ge7.s(requireContext, "android.permission.POST_NOTIFICATIONS") != 0) {
                                    cheatsPreferencesFragment.e0.a("android.permission.POST_NOTIFICATIONS");
                                    return;
                                }
                            }
                            cheatsPreferencesFragment.k();
                            return;
                    }
                }
            });
        }
        findPreference.setOnPreferenceClickListener(new y05(this) { // from class: ep0
            public final /* synthetic */ CheatsPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // defpackage.y05
            public final void i(Preference preference) {
                int i = r2;
                CheatsPreferencesFragment cheatsPreferencesFragment = this.B;
                switch (i) {
                    case 0:
                        Toast.makeText(cheatsPreferencesFragment.requireContext(), cheatsPreferencesFragment.getString(R.string.cheats_download_success), 1).show();
                        return;
                    default:
                        if (Build.VERSION.SDK_INT >= 33) {
                            Context requireContext = cheatsPreferencesFragment.requireContext();
                            requireContext.getClass();
                            if (ge7.s(requireContext, "android.permission.POST_NOTIFICATIONS") != 0) {
                                cheatsPreferencesFragment.e0.a("android.permission.POST_NOTIFICATIONS");
                                return;
                            }
                        }
                        cheatsPreferencesFragment.k();
                        return;
                }
            }
        });
    }
}
