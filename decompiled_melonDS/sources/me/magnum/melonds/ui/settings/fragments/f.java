package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
import androidx.lifecycle.s;
import androidx.lifecycle.s0;
import androidx.preference.ListPreference;
import java.util.Locale;
import me.magnum.melonds.common.camera.DSiCameraSource;
import zc.g0;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements h.b {
    public final /* synthetic */ int A;
    public final /* synthetic */ BasePreferenceFragment B;

    public /* synthetic */ f(BasePreferenceFragment basePreferenceFragment, int i2) {
        this.A = i2;
        this.B = basePreferenceFragment;
    }

    @Override // h.b
    public final void a(Object obj) {
        int i2 = this.A;
        BasePreferenceFragment basePreferenceFragment = this.B;
        switch (i2) {
            case 0:
                GeneralPreferencesFragment generalPreferencesFragment = (GeneralPreferencesFragment) basePreferenceFragment;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    s f8 = s0.f(generalPreferencesFragment);
                    gd.f fVar = g0.f15015a;
                    x.v(f8, gd.e.L, null, new GeneralPreferencesFragment$backupLauncher$1$1(generalPreferencesFragment, uri, null), 2);
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                GeneralPreferencesFragment generalPreferencesFragment2 = (GeneralPreferencesFragment) basePreferenceFragment;
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    s f10 = s0.f(generalPreferencesFragment2);
                    gd.f fVar2 = g0.f15015a;
                    x.v(f10, gd.e.L, null, new GeneralPreferencesFragment$restoreLauncher$1$1(generalPreferencesFragment2, uri2, null), 2);
                    return;
                }
                return;
            default:
                AudioPreferencesFragment audioPreferencesFragment = (AudioPreferencesFragment) basePreferenceFragment;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (bool.booleanValue()) {
                    ListPreference listPreference = audioPreferencesFragment.A;
                    if (listPreference != null) {
                        String lowerCase = "DEVICE".toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        listPreference.f(lowerCase);
                        return;
                    }
                    nc.k.f("micSourcePreference");
                    throw null;
                }
                return;
        }
    }
}
