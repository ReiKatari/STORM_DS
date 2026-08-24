package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements defpackage.y05, me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderDirectoryLister {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Comparable L;

    public /* synthetic */ a(java.lang.Object r1, java.lang.Comparable r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderDirectoryLister
    public java.util.List a(java.lang.String r6) {
            r5 = this;
            java.lang.Object r0 = r5.B
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Comparable r5 = r5.L
            android.net.Uri r5 = (android.net.Uri) r5
            r6.getClass()
            qi6 r5 = defpackage.zl1.h(r0, r5)
            boolean r0 = defpackage.qs6.v0(r6)
            r1 = 0
            if (r0 != 0) goto L40
            r0 = 1
            char[] r0 = new char[r0]
            r2 = 47
            r0[r1] = r2
            r2 = 6
            java.util.List r6 = defpackage.qs6.J0(r6, r0, r2)
            java.util.Iterator r6 = r6.iterator()
        L26:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = defpackage.qs6.v0(r0)
            if (r2 == 0) goto L39
            goto L46
        L39:
            zl1 r5 = r5.f(r0)
            if (r5 != 0) goto L26
            goto L46
        L40:
            boolean r6 = r5.k()
            if (r6 != 0) goto L49
        L46:
            yt1 r5 = defpackage.yt1.A
            return r5
        L49:
            zl1[] r5 = r5.o()
            r5.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = r5.length
        L56:
            if (r1 >= r0) goto L74
            r2 = r5[r1]
            java.lang.String r3 = r2.i()
            if (r3 != 0) goto L62
            r2 = 0
            goto L6c
        L62:
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserEntry r4 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserEntry
            boolean r2 = r2.k()
            r4.<init>(r3, r2)
            r2 = r4
        L6c:
            if (r2 == 0) goto L71
            r6.add(r2)
        L71:
            int r1 = r1 + 1
            goto L56
        L74:
            return r6
    }

    @Override // defpackage.y05
    public void i(androidx.preference.Preference r8) {
            r7 = this;
            int r8 = r7.A
            r0 = 3
            r1 = 0
            r2 = 0
            r3 = 100
            r4 = 1
            java.lang.Comparable r5 = r7.L
            java.lang.Object r7 = r7.B
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment r7 = (me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment) r7
            me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference r5 = (me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference) r5
            switch(r8) {
                case 0: goto L44;
                default: goto L13;
            }
        L13:
            android.app.ProgressDialog r8 = new android.app.ProgressDialog
            android.content.Context r6 = r7.requireContext()
            r8.<init>(r6)
            r6 = 2131951716(0x7f130064, float:1.9539854E38)
            java.lang.String r6 = r7.getString(r6)
            r8.setTitle(r6)
            java.lang.String r6 = "Загрузка и настройка bios7.bin, bios9.bin, firmware.bin, nand.bin..."
            r8.setMessage(r6)
            r8.setProgressStyle(r4)
            r8.setMax(r3)
            r8.setCancelable(r2)
            r8.show()
            au3 r2 = defpackage.bl2.C(r7)
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$onCreatePreferences$2$1 r3 = new me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$onCreatePreferences$2$1
            r3.<init>(r7, r8, r5, r1)
            defpackage.hv.L(r2, r1, r1, r3, r0)
            return
        L44:
            android.app.ProgressDialog r8 = new android.app.ProgressDialog
            android.content.Context r6 = r7.requireContext()
            r8.<init>(r6)
            r6 = 2131951714(0x7f130062, float:1.953985E38)
            java.lang.String r6 = r7.getString(r6)
            r8.setTitle(r6)
            java.lang.String r6 = "Загрузка и настройка bios7.bin, bios9.bin, firmware.bin..."
            r8.setMessage(r6)
            r8.setProgressStyle(r4)
            r8.setMax(r3)
            r8.setCancelable(r2)
            r8.show()
            au3 r2 = defpackage.bl2.C(r7)
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$onCreatePreferences$1$1 r3 = new me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$onCreatePreferences$1$1
            r3.<init>(r7, r8, r5, r1)
            defpackage.hv.L(r2, r1, r1, r3, r0)
            return
    }
}
