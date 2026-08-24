package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class CheatsPreferencesFragment extends me.magnum.melonds.ui.settings.fragments.Hilt_CheatsPreferencesFragment implements defpackage.q15 {
    public final defpackage.uo7 Z;
    public final defpackage.d9 d0;
    public final defpackage.d9 e0;

    public CheatsPreferencesFragment() {
            r5 = this;
            r5.<init>()
            me.magnum.melonds.ui.settings.fragments.CheatsPreferencesFragment$special$$inlined$viewModels$default$1 r0 = new me.magnum.melonds.ui.settings.fragments.CheatsPreferencesFragment$special$$inlined$viewModels$default$1
            r0.<init>(r5)
            xr3 r1 = defpackage.xr3.NONE
            me.magnum.melonds.ui.settings.fragments.CheatsPreferencesFragment$special$$inlined$viewModels$default$2 r2 = new me.magnum.melonds.ui.settings.fragments.CheatsPreferencesFragment$special$$inlined$viewModels$default$2
            r2.<init>(r0)
            go3 r0 = defpackage.kj2.M(r1, r2)
            java.lang.Class<gp0> r1 = defpackage.gp0.class
            ar0 r1 = defpackage.gh5.a(r1)
            me.magnum.melonds.ui.settings.fragments.CheatsPreferencesFragment$special$$inlined$viewModels$default$3 r2 = new me.magnum.melonds.ui.settings.fragments.CheatsPreferencesFragment$special$$inlined$viewModels$default$3
            r2.<init>(r0)
            me.magnum.melonds.ui.settings.fragments.CheatsPreferencesFragment$special$$inlined$viewModels$default$4 r3 = new me.magnum.melonds.ui.settings.fragments.CheatsPreferencesFragment$special$$inlined$viewModels$default$4
            r3.<init>(r0)
            me.magnum.melonds.ui.settings.fragments.CheatsPreferencesFragment$special$$inlined$viewModels$default$5 r4 = new me.magnum.melonds.ui.settings.fragments.CheatsPreferencesFragment$special$$inlined$viewModels$default$5
            r4.<init>(r5, r0)
            uo7 r0 = new uo7
            r0.<init>(r1, r2, r4, r3)
            r5.Z = r0
            zj1 r0 = new zj1
            sv4 r1 = defpackage.sv4.READ
            r2 = 1
            r0.<init>(r1, r2)
            fp0 r1 = new fp0
            r3 = 0
            r1.<init>(r5, r3)
            d9 r0 = r5.registerForActivityResult(r0, r1)
            r0.getClass()
            r5.d0 = r0
            c9 r0 = new c9
            r1 = 4
            r0.<init>(r1)
            fp0 r1 = new fp0
            r1.<init>(r5, r2)
            d9 r0 = r5.registerForActivityResult(r0, r1)
            r0.getClass()
            r5.e0 = r0
            return
    }

    @Override // defpackage.q15
    public final java.lang.String getTitle() {
            r1 = this;
            r0 = 2131951780(0x7f1300a4, float:1.9539984E38)
            java.lang.String r1 = r1.getString(r0)
            r1.getClass()
            return r1
    }

    public final void k() {
            r5 = this;
            uo7 r0 = r5.Z
            java.lang.Object r0 = r0.getValue()
            gp0 r0 = (defpackage.gp0) r0
            hp0 r0 = r0.b
            h16 r0 = (defpackage.h16) r0
            android.content.Context r0 = r0.a
            lw7 r0 = defpackage.lw7.b(r0)
            r0.getClass()
            androidx.work.impl.WorkDatabase r1 = r0.c
            ow7 r0 = r0.d
            r1.getClass()
            r0.getClass()
            r76 r2 = new r76
            r3 = 13
            r2.<init>(r3)
            zb6 r0 = r0.a
            r0.getClass()
            ci2 r3 = new ci2
            r4 = 29
            r3.<init>(r4, r2, r1)
            java.lang.String r1 = "loadStatusFuture"
            gx3 r0 = defpackage.yh2.p(r0, r1, r3)
            tb0 r0 = (defpackage.tb0) r0
            sb0 r0 = r0.B
            java.lang.Object r0 = r0.get()
            java.util.List r0 = (java.util.List) r0
            r0.getClass()
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L4d
            goto L72
        L4d:
            java.util.Iterator r0 = r0.iterator()
        L51:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r1 = r0.next()
            jw7 r1 = (defpackage.jw7) r1
            iw7 r1 = r1.b
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L51
            uo0 r0 = new uo0
            r0.<init>()
            androidx.fragment.app.u r5 = r5.getChildFragmentManager()
            r0.show(r5, r2)
            return
        L72:
            vr4 r0 = new vr4
            java.lang.String r1 = "text/xml"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0.<init>(r2, r1)
            d9 r5 = r5.d0
            r5.a(r0)
            return
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(android.os.Bundle r3, java.lang.String r4) {
            r2 = this;
            r3 = 2132148235(0x7f16000b, float:1.9938442E38)
            r2.setPreferencesFromResource(r3, r4)
            java.lang.String r3 = "cheats_import"
            androidx.preference.Preference r3 = r2.findPreference(r3)
            r3.getClass()
            java.lang.String r4 = "cheats_download_online"
            androidx.preference.Preference r4 = r2.findPreference(r4)
            if (r4 == 0) goto L20
            ep0 r0 = new ep0
            r1 = 0
            r0.<init>(r2, r1)
            r4.setOnPreferenceClickListener(r0)
        L20:
            ep0 r4 = new ep0
            r0 = 1
            r4.<init>(r2, r0)
            r3.setOnPreferenceClickListener(r4)
            return
    }
}
