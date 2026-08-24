package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements a9 {
    public final /* synthetic */ int A;
    public final /* synthetic */ BasePreferenceFragment B;

    public /* synthetic */ b(BasePreferenceFragment basePreferenceFragment, int i) {
        this.A = i;
        this.B = basePreferenceFragment;
    }

    @Override // defpackage.a9
    public final void a(Object obj) {
        int i = this.A;
        BasePreferenceFragment basePreferenceFragment = this.B;
        switch (i) {
            case 0:
                GeneralPreferencesFragment generalPreferencesFragment = (GeneralPreferencesFragment) basePreferenceFragment;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    au3 C = bl2.C(generalPreferencesFragment);
                    xe1 xe1Var = xk1.a;
                    hv.L(C, de1.L, null, new GeneralPreferencesFragment$backupLauncher$1$1(generalPreferencesFragment, uri, null), 2);
                    return;
                }
                return;
            case 1:
                GeneralPreferencesFragment generalPreferencesFragment2 = (GeneralPreferencesFragment) basePreferenceFragment;
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    au3 C2 = bl2.C(generalPreferencesFragment2);
                    xe1 xe1Var2 = xk1.a;
                    hv.L(C2, de1.L, null, new GeneralPreferencesFragment$restoreLauncher$1$1(generalPreferencesFragment2, uri2, null), 2);
                    return;
                }
                return;
            default:
                VideoPreferencesFragment videoPreferencesFragment = (VideoPreferencesFragment) basePreferenceFragment;
                Uri uri3 = (Uri) obj;
                if (uri3 != null) {
                    hv.L(bl2.C(videoPreferencesFragment), null, null, new VideoPreferencesFragment$handleVulkanDriverImport$1(videoPreferencesFragment, uri3, null), 3);
                    return;
                }
                return;
        }
    }
}
