package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements z8 {
    public final /* synthetic */ int A;
    public final /* synthetic */ BasePreferenceFragment B;

    public /* synthetic */ a(BasePreferenceFragment basePreferenceFragment, int i) {
        this.A = i;
        this.B = basePreferenceFragment;
    }

    @Override // defpackage.z8
    public final void b(Object obj) {
        int i = this.A;
        BasePreferenceFragment basePreferenceFragment = this.B;
        switch (i) {
            case 0:
                GeneralPreferencesFragment generalPreferencesFragment = (GeneralPreferencesFragment) basePreferenceFragment;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    ym3 y = hk2.y(generalPreferencesFragment);
                    bb1 bb1Var = tg1.a;
                    tq5.w(y, ha1.L, null, new GeneralPreferencesFragment$backupLauncher$1$1(generalPreferencesFragment, uri, null), 2);
                    return;
                }
                return;
            case 1:
                GeneralPreferencesFragment generalPreferencesFragment2 = (GeneralPreferencesFragment) basePreferenceFragment;
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    ym3 y2 = hk2.y(generalPreferencesFragment2);
                    bb1 bb1Var2 = tg1.a;
                    tq5.w(y2, ha1.L, null, new GeneralPreferencesFragment$restoreLauncher$1$1(generalPreferencesFragment2, uri2, null), 2);
                    return;
                }
                return;
            default:
                VideoPreferencesFragment videoPreferencesFragment = (VideoPreferencesFragment) basePreferenceFragment;
                Uri uri3 = (Uri) obj;
                if (uri3 != null) {
                    tq5.w(hk2.y(videoPreferencesFragment), null, null, new VideoPreferencesFragment$handleVulkanDriverImport$1(videoPreferencesFragment, uri3, null), 3);
                    return;
                }
                return;
        }
    }
}
