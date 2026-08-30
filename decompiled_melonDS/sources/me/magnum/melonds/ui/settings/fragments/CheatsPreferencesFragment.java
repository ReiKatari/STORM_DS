package me.magnum.melonds.ui.settings.fragments;

import a7.v;
import ah.m1;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.b1;
import androidx.preference.Preference;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import k7.a0;
import kf.u1;
import me.magnum.melonds.R;
import me.magnum.melonds.common.workers.CheatImportWorker;
import nc.u;
import p7.t;
import p8.f0;
import p8.y;
import u1.h1;
import x8.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class CheatsPreferencesFragment extends Hilt_CheatsPreferencesFragment implements ci.l {
    public final v Y;
    public final h.c Z;

    /* renamed from: b0  reason: collision with root package name */
    public final h.c f9582b0;

    public CheatsPreferencesFragment() {
        yb.f s10 = p7.a.s(yb.h.NONE, new CheatsPreferencesFragment$special$$inlined$viewModels$default$2(new CheatsPreferencesFragment$special$$inlined$viewModels$default$1(this)));
        this.Y = new v(u.a(gi.a.class), new CheatsPreferencesFragment$special$$inlined$viewModels$default$3(s10), new CheatsPreferencesFragment$special$$inlined$viewModels$default$5(this, s10), new CheatsPreferencesFragment$special$$inlined$viewModels$default$4(s10));
        h.c registerForActivityResult = registerForActivityResult(new vd.a(sd.f.READ, 1), new h.b(this) { // from class: me.magnum.melonds.ui.settings.fragments.d
            public final /* synthetic */ CheatsPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // h.b
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            CheatsPreferencesFragment cheatsPreferencesFragment = this.B;
                            u1 u1Var = (u1) ((gi.a) cheatsPreferencesFragment.Y.getValue()).f5671b;
                            u1Var.getClass();
                            e9.a aVar = new e9.a(CheatImportWorker.class);
                            yb.j[] jVarArr = {new yb.j("uri", uri.toString())};
                            m1 m1Var = new m1(5, (byte) 0);
                            yb.j jVar = jVarArr[0];
                            m1Var.h(jVar.B, (String) jVar.A);
                            ((p) aVar.f4416c).f14424e = m1Var.f();
                            y c4 = aVar.c();
                            q8.p a10 = q8.p.a(u1Var.f8270a);
                            a10.getClass();
                            p8.l lVar = p8.l.KEEP;
                            lVar.getClass();
                            new q8.m(a10, "cheat_import_worker", lVar, t.x(c4)).a();
                            new ci.d().j(cheatsPreferencesFragment.getChildFragmentManager(), null);
                            return;
                        }
                        return;
                    default:
                        ((Boolean) obj).getClass();
                        this.B.i();
                        return;
                }
            }
        });
        registerForActivityResult.getClass();
        this.Z = registerForActivityResult;
        h.c registerForActivityResult2 = registerForActivityResult(new b1(3), new h.b(this) { // from class: me.magnum.melonds.ui.settings.fragments.d
            public final /* synthetic */ CheatsPreferencesFragment B;

            {
                this.B = this;
            }

            @Override // h.b
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            CheatsPreferencesFragment cheatsPreferencesFragment = this.B;
                            u1 u1Var = (u1) ((gi.a) cheatsPreferencesFragment.Y.getValue()).f5671b;
                            u1Var.getClass();
                            e9.a aVar = new e9.a(CheatImportWorker.class);
                            yb.j[] jVarArr = {new yb.j("uri", uri.toString())};
                            m1 m1Var = new m1(5, (byte) 0);
                            yb.j jVar = jVarArr[0];
                            m1Var.h(jVar.B, (String) jVar.A);
                            ((p) aVar.f4416c).f14424e = m1Var.f();
                            y c4 = aVar.c();
                            q8.p a10 = q8.p.a(u1Var.f8270a);
                            a10.getClass();
                            p8.l lVar = p8.l.KEEP;
                            lVar.getClass();
                            new q8.m(a10, "cheat_import_worker", lVar, t.x(c4)).a();
                            new ci.d().j(cheatsPreferencesFragment.getChildFragmentManager(), null);
                            return;
                        }
                        return;
                    default:
                        ((Boolean) obj).getClass();
                        this.B.i();
                        return;
                }
            }
        });
        registerForActivityResult2.getClass();
        this.f9582b0 = registerForActivityResult2;
    }

    @Override // ci.l
    public final String getTitle() {
        String string = getString(R.string.cheats);
        string.getClass();
        return string;
    }

    public final void i() {
        q8.p a10 = q8.p.a(((u1) ((gi.a) this.Y.getValue()).f5671b).f8270a);
        a10.getClass();
        WorkDatabase workDatabase = a10.f12373c;
        z8.a aVar = a10.f12374d;
        workDatabase.getClass();
        aVar.getClass();
        h1 h1Var = new h1(25);
        a0 a0Var = aVar.f14969a;
        a0Var.getClass();
        List<f0> list = (List) p7.k.k(a0Var, "loadStatusFuture", new q1.e(15, h1Var, workDatabase)).B.get();
        list.getClass();
        if (!list.isEmpty()) {
            for (f0 f0Var : list) {
                if (!f0Var.f11481b.isFinished()) {
                    new ci.d().j(getChildFragmentManager(), null);
                    return;
                }
            }
        }
        this.Z.a(new yb.j(null, new String[]{"text/xml"}));
    }

    @Override // androidx.preference.a0
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_cheats, str);
        Preference findPreference = findPreference("cheats_import");
        findPreference.getClass();
        findPreference.setOnPreferenceClickListener(new c(this, 0));
    }
}
