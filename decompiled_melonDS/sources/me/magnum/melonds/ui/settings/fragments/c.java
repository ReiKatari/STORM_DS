package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.preference.Preference;
import androidx.preference.p;
import cd.o1;
import java.io.File;
import k7.w;
import kf.d1;
import m9.o;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ BasePreferenceFragment B;

    public /* synthetic */ c(BasePreferenceFragment basePreferenceFragment, int i2) {
        this.A = i2;
        this.B = basePreferenceFragment;
    }

    @Override // androidx.preference.p
    public final void a(Preference preference) {
        boolean z10;
        switch (this.A) {
            case 0:
                CheatsPreferencesFragment cheatsPreferencesFragment = (CheatsPreferencesFragment) this.B;
                if (Build.VERSION.SDK_INT >= 33) {
                    Context requireContext = cheatsPreferencesFragment.requireContext();
                    requireContext.getClass();
                    if (aj.g.k(requireContext, "android.permission.POST_NOTIFICATIONS") != 0) {
                        cheatsPreferencesFragment.f9582b0.a("android.permission.POST_NOTIFICATIONS");
                        return;
                    }
                }
                cheatsPreferencesFragment.i();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = (RetroAchievementsPreferencesFragment) this.B;
                ei.c cVar = (ei.c) ((o1) retroAchievementsPreferencesFragment.i().f5675d.getValue()).getValue();
                if (cVar instanceof ei.a) {
                    bk.a aVar = new bk.a(retroAchievementsPreferencesFragment.requireContext());
                    aVar.w(R.string.retroachievements_logout);
                    aVar.t(R.string.retroachievements_logout_confirmation);
                    aVar.v(R.string.retroachievements_logout, new b(retroAchievementsPreferencesFragment, 1));
                    aVar.u(R.string.cancel, new ah.m(7));
                    aVar.y();
                    return;
                } else if (nc.k.a(cVar, ei.b.f4502a)) {
                    View inflate = LayoutInflater.from(retroAchievementsPreferencesFragment.getContext()).inflate(R.layout.dialog_retroachievements_login, (ViewGroup) null, false);
                    int i2 = R.id.text_password;
                    EditText editText = (EditText) w.k(inflate, R.id.text_password);
                    if (editText != null) {
                        i2 = R.id.text_username;
                        EditText editText2 = (EditText) w.k(inflate, R.id.text_username);
                        if (editText2 != null) {
                            LinearLayout linearLayout = (LinearLayout) inflate;
                            jb.c cVar2 = new jb.c(linearLayout, editText, editText2, 13);
                            bk.a aVar2 = new bk.a(retroAchievementsPreferencesFragment.requireContext());
                            aVar2.w(R.string.login_with_retro_achievements);
                            aVar2.x(linearLayout);
                            aVar2.v(R.string.login, new ah.l(2, retroAchievementsPreferencesFragment, cVar2));
                            aVar2.u(R.string.cancel, new ah.m(6));
                            aVar2.y();
                            return;
                        }
                    }
                    o.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                    return;
                } else if (!nc.k.a(cVar, ei.b.f4503b)) {
                    o.o();
                    return;
                } else {
                    return;
                }
            default:
                RomsPreferencesFragment romsPreferencesFragment = (RomsPreferencesFragment) this.B;
                d1 d1Var = ((gi.f) romsPreferencesFragment.Y.getValue()).f5680b;
                File externalCacheDir = d1Var.f8177a.getExternalCacheDir();
                if (externalCacheDir != null) {
                    z10 = jc.j.R(new File(externalCacheDir, "extracted_roms"));
                    d1Var.f8179c.a(y.f14813a);
                } else {
                    z10 = false;
                }
                if (!z10) {
                    Toast.makeText(romsPreferencesFragment.requireContext(), (int) R.string.error_clear_rom_cache, 1).show();
                    return;
                }
                return;
        }
    }
}
