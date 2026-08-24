package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l15  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class l15 implements defpackage.x05 {
    public final /* synthetic */ int a;

    public /* synthetic */ l15(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.x05
    public final boolean a(androidx.preference.Preference r8, java.lang.Object r9) {
            r7 = this;
            int r7 = r7.a
            r0 = 1
            r1 = 0
            switch(r7) {
                case 0: goto L2a;
                default: goto L7;
            }
        L7:
            r8.getClass()
            boolean r7 = r9 instanceof java.lang.String
            if (r7 == 0) goto L11
            r1 = r9
            java.lang.String r1 = (java.lang.String) r1
        L11:
            java.lang.String r7 = "default"
            if (r1 != 0) goto L16
            r1 = r7
        L16:
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L22
            hy3 r7 = defpackage.hy3.b
            defpackage.tq.j(r7)
            goto L29
        L22:
            hy3 r7 = defpackage.hy3.a(r1)
            defpackage.tq.j(r7)
        L29:
            return r0
        L2a:
            r8.getClass()
            boolean r7 = r8 instanceof androidx.preference.ListPreference
            r2 = 2131952302(0x7f1302ae, float:1.9541043E38)
            if (r7 == 0) goto L62
            boolean r7 = r9 instanceof java.lang.String
            if (r7 == 0) goto L3b
            r1 = r9
            java.lang.String r1 = (java.lang.String) r1
        L3b:
            if (r1 == 0) goto L45
            r7 = r8
            androidx.preference.ListPreference r7 = (androidx.preference.ListPreference) r7
            int r7 = r7.e(r1)
            goto L46
        L45:
            r7 = -1
        L46:
            if (r7 < 0) goto L50
            r9 = r8
            androidx.preference.ListPreference r9 = (androidx.preference.ListPreference) r9
            java.lang.CharSequence[] r9 = r9.Z
            r7 = r9[r7]
            goto L5b
        L50:
            r7 = r8
            androidx.preference.ListPreference r7 = (androidx.preference.ListPreference) r7
            android.content.Context r7 = r7.getContext()
            java.lang.String r7 = r7.getString(r2)
        L5b:
            androidx.preference.ListPreference r8 = (androidx.preference.ListPreference) r8
            r8.setSummary(r7)
            goto L134
        L62:
            boolean r7 = r8 instanceof me.magnum.melonds.ui.settings.preferences.StoragePickerPreference
            if (r7 == 0) goto Lca
            if (r9 == 0) goto Lba
            boolean r7 = r9 instanceof java.util.Set
            if (r7 == 0) goto Lba
            r7 = r9
            java.util.Set r7 = (java.util.Set) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L76
            goto Lba
        L76:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r9.iterator()
        L81:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto La8
            java.lang.Object r9 = r7.next()
            r2 = r8
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r2 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference) r2
            android.content.Context r2 = r2.getContext()
            r2.getClass()
            r9.getClass()
            java.lang.String r9 = (java.lang.String) r9
            android.net.Uri r9 = android.net.Uri.parse(r9)
            java.lang.String r9 = defpackage.l.s(r2, r9)
            if (r9 == 0) goto L81
            r1.add(r9)
            goto L81
        La8:
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r8 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference) r8
            r5 = 0
            r6 = 62
            java.lang.String r2 = "\n"
            r3 = 0
            r4 = 0
            java.lang.String r7 = defpackage.gt0.P0(r1, r2, r3, r4, r5, r6)
            r8.setSummary(r7)
            goto L134
        Lba:
            r7 = r8
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r7 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference) r7
            android.content.Context r8 = r8.getContext()
            java.lang.String r8 = r8.getString(r2)
            r7.setSummary(r8)
            goto L134
        Lca:
            boolean r7 = r8 instanceof me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference
            if (r7 == 0) goto Lda
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto Ld4
            java.lang.String r9 = "01/01"
        Ld4:
            me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference r8 = (me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference) r8
            r8.setSummary(r9)
            goto L134
        Lda:
            boolean r7 = r8 instanceof com.smp.masterswitchpreference.MasterSwitchPreference
            if (r7 == 0) goto L103
            r9.getClass()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            com.smp.masterswitchpreference.MasterSwitchPreference r8 = (com.smp.masterswitchpreference.MasterSwitchPreference) r8
            if (r7 == 0) goto Lf7
            android.content.Context r7 = r8.getContext()
            r9 = 2131952358(0x7f1302e6, float:1.9541156E38)
        Lf2:
            java.lang.String r7 = r7.getString(r9)
            goto Lff
        Lf7:
            android.content.Context r7 = r8.getContext()
            r9 = 2131952304(0x7f1302b0, float:1.9541047E38)
            goto Lf2
        Lff:
            r8.setSummary(r7)
            goto L134
        L103:
            boolean r7 = r8 instanceof me.magnum.melonds.ui.settings.preferences.MacAddressPreference
            if (r7 == 0) goto L11d
            java.lang.String r9 = (java.lang.String) r9
            me.magnum.melonds.ui.settings.preferences.MacAddressPreference r8 = (me.magnum.melonds.ui.settings.preferences.MacAddressPreference) r8
            if (r9 == 0) goto L10e
            goto L119
        L10e:
            android.content.Context r7 = r8.getContext()
            java.lang.String r9 = r7.getString(r2)
            r9.getClass()
        L119:
            r8.setSummary(r9)
            goto L134
        L11d:
            if (r9 == 0) goto L126
            java.lang.String r7 = r9.toString()
            if (r7 == 0) goto L126
            goto L131
        L126:
            android.content.Context r7 = r8.getContext()
            java.lang.String r7 = r7.getString(r2)
            r7.getClass()
        L131:
            r8.setSummary(r7)
        L134:
            return r0
    }
}
