package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements defpackage.a9 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment B;

    public /* synthetic */ b(me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.a9
    public final void a(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.A
            r1 = 2
            me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment r5 = r5.B
            r2 = 0
            switch(r0) {
                case 0: goto L35;
                case 1: goto L1e;
                default: goto L9;
            }
        L9:
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r5 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment) r5
            android.net.Uri r6 = (android.net.Uri) r6
            if (r6 != 0) goto L10
            goto L1d
        L10:
            au3 r0 = defpackage.bl2.C(r5)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1 r1 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1
            r1.<init>(r5, r6, r2)
            r5 = 3
            defpackage.hv.L(r0, r2, r2, r1, r5)
        L1d:
            return
        L1e:
            me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment r5 = (me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment) r5
            android.net.Uri r6 = (android.net.Uri) r6
            if (r6 == 0) goto L34
            au3 r0 = defpackage.bl2.C(r5)
            xe1 r3 = defpackage.xk1.a
            de1 r3 = defpackage.de1.L
            me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$restoreLauncher$1$1 r4 = new me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$restoreLauncher$1$1
            r4.<init>(r5, r6, r2)
            defpackage.hv.L(r0, r3, r2, r4, r1)
        L34:
            return
        L35:
            me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment r5 = (me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment) r5
            android.net.Uri r6 = (android.net.Uri) r6
            if (r6 == 0) goto L4b
            au3 r0 = defpackage.bl2.C(r5)
            xe1 r3 = defpackage.xk1.a
            de1 r3 = defpackage.de1.L
            me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1 r4 = new me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1
            r4.<init>(r5, r6, r2)
            defpackage.hv.L(r0, r3, r2, r4, r1)
        L4b:
            return
    }
}
