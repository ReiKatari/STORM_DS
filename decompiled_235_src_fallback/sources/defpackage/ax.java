package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ax  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ax implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ ax(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    public /* synthetic */ ax(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1, androidx.preference.Preference r2) {
            r0 = this;
            r1 = 4
            r0.A = r1
            r0.<init>()
            r0.B = r2
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r5, int r6) {
            r4 = this;
            int r0 = r4.A
            r1 = 1
            java.lang.Object r4 = r4.B
            switch(r0) {
                case 0: goto L65;
                case 1: goto L55;
                case 2: goto L3c;
                case 3: goto L13;
                default: goto L8;
            }
        L8:
            androidx.preference.Preference r4 = (androidx.preference.Preference) r4
            r4.getClass()
            me.magnum.melonds.ui.settings.preferences.InGameLockedSwitchPreference r4 = (me.magnum.melonds.ui.settings.preferences.InGameLockedSwitchPreference) r4
            r4.e(r1)
            return
        L13:
            android.content.Context r4 = (android.content.Context) r4
            lw7 r4 = defpackage.lw7.b(r4)
            r4.getClass()
            az0 r6 = r4.b
            xd5 r6 = r6.m
            java.lang.String r0 = "CancelWorkByName_"
            java.lang.String r1 = "retroarch-shader-install"
            java.lang.String r0 = r0.concat(r1)
            ow7 r1 = r4.d
            zb6 r1 = r1.a
            r1.getClass()
            oj0 r2 = new oj0
            r3 = 0
            r2.<init>(r4, r3)
            defpackage.uj2.a0(r6, r0, r1, r2)
            r5.dismiss()
            return
        L3c:
            me.magnum.melonds.ui.settings.preferences.MacAddressPreference r4 = (me.magnum.melonds.ui.settings.preferences.MacAddressPreference) r4
            zz3 r6 = r4.B
            if (r6 == 0) goto L47
            java.lang.String r6 = r6.toString()
            goto L48
        L47:
            r6 = 0
        L48:
            boolean r0 = r4.callChangeListener(r6)
            if (r0 == 0) goto L51
            r4.persistString(r6)
        L51:
            r5.dismiss()
            return
        L55:
            java.util.List r4 = (java.util.List) r4
            int r5 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            java.lang.Object r4 = r4.get(r6)
            bk5 r4 = (defpackage.bk5) r4
            on2 r4 = r4.b
            r4.c()
            return
        L65:
            me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment r4 = (me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment) r4
            r4.k(r1)
            return
    }
}
