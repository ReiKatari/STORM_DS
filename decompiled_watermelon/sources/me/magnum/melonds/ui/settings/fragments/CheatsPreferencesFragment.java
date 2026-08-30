package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import me.magnum.melonds.common.workers.CheatImportWorker;
import me.magnum.melonds.ui.settings.fragments.CheatsPreferencesFragment;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class CheatsPreferencesFragment extends Hilt_CheatsPreferencesFragment implements os4 {
    public final va7 Z;
    public final c9 c0;
    public final c9 d0;

    public CheatsPreferencesFragment() {
        gh3 H = yf2.H(wk3.NONE, new CheatsPreferencesFragment$special$$inlined$viewModels$default$2(new CheatsPreferencesFragment$special$$inlined$viewModels$default$1(this)));
        this.Z = new va7(q75.a(wm0.class), new CheatsPreferencesFragment$special$$inlined$viewModels$default$3(H), new CheatsPreferencesFragment$special$$inlined$viewModels$default$5(this, H), new CheatsPreferencesFragment$special$$inlined$viewModels$default$4(H));
        c9 registerForActivityResult = registerForActivityResult(new vf1(nm4.READ, 1), new z8(this) { // from class: vm0
            public final /* synthetic */ CheatsPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // defpackage.z8
            public final void b(Object obj) {
                int i = r2;
                CheatsPreferencesFragment cheatsPreferencesFragment = this.B;
                switch (i) {
                    case 0:
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            nq5 nq5Var = (nq5) ((wm0) cheatsPreferencesFragment.Z.getValue()).b;
                            nq5Var.getClass();
                            xf1 xf1Var = new xf1(CheatImportWorker.class);
                            ti4[] ti4VarArr = {new ti4("uri", uri.toString())};
                            e81 e81Var = new e81(0, (byte) 0);
                            ti4 ti4Var = ti4VarArr[0];
                            e81Var.h(ti4Var.B, (String) ti4Var.A);
                            ((xh7) xf1Var.B).e = e81Var.e();
                            id4 c = xf1Var.c();
                            kh7 b = kh7.b(nq5Var.a);
                            b.getClass();
                            b.a("cheat_import_worker", g32.KEEP, c);
                            new lm0().j(cheatsPreferencesFragment.getChildFragmentManager(), null);
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
        this.c0 = registerForActivityResult;
        c9 registerForActivityResult2 = registerForActivityResult(new b9(3), new z8(this) { // from class: vm0
            public final /* synthetic */ CheatsPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // defpackage.z8
            public final void b(Object obj) {
                int i = r2;
                CheatsPreferencesFragment cheatsPreferencesFragment = this.B;
                switch (i) {
                    case 0:
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            nq5 nq5Var = (nq5) ((wm0) cheatsPreferencesFragment.Z.getValue()).b;
                            nq5Var.getClass();
                            xf1 xf1Var = new xf1(CheatImportWorker.class);
                            ti4[] ti4VarArr = {new ti4("uri", uri.toString())};
                            e81 e81Var = new e81(0, (byte) 0);
                            ti4 ti4Var = ti4VarArr[0];
                            e81Var.h(ti4Var.B, (String) ti4Var.A);
                            ((xh7) xf1Var.B).e = e81Var.e();
                            id4 c = xf1Var.c();
                            kh7 b = kh7.b(nq5Var.a);
                            b.getClass();
                            b.a("cheat_import_worker", g32.KEEP, c);
                            new lm0().j(cheatsPreferencesFragment.getChildFragmentManager(), null);
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
        this.d0 = registerForActivityResult2;
    }

    @Override // defpackage.os4
    public final String getTitle() {
        String string = getString(R.string.cheats);
        string.getClass();
        return string;
    }

    public final void k() {
        kh7 b = kh7.b(((nq5) ((wm0) this.Z.getValue()).b).a);
        b.getClass();
        WorkDatabase workDatabase = b.c;
        nh7 nh7Var = b.d;
        workDatabase.getClass();
        nh7Var.getClass();
        d96 d96Var = new d96(2);
        k06 k06Var = nh7Var.a;
        k06Var.getClass();
        List<jh7> list = (List) ((l90) oo2.D(k06Var, "loadStatusFuture", new jd2(26, d96Var, workDatabase))).B.get();
        list.getClass();
        if (!list.isEmpty()) {
            for (jh7 jh7Var : list) {
                if (!jh7Var.b.isFinished()) {
                    new lm0().j(getChildFragmentManager(), null);
                    return;
                }
            }
        }
        this.c0.a(new ti4(null, new String[]{"text/xml"}));
    }

    @Override // defpackage.is4
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_cheats, str);
        Preference findPreference = findPreference("cheats_import");
        findPreference.getClass();
        findPreference.setOnPreferenceClickListener(new a31(5, this));
    }
}
