package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zw implements defpackage.x05 {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ zw(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    public /* synthetic */ zw(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1, me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r2) {
            r0 = this;
            r1 = 6
            r0.a = r1
            r0.<init>()
            r0.b = r2
            return
    }

    @Override // defpackage.x05
    public final boolean a(androidx.preference.Preference r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.a
            r1 = 0
            r2 = 0
            java.lang.Object r10 = r10.b
            r3 = 1
            switch(r0) {
                case 0: goto L170;
                case 1: goto L130;
                case 2: goto Lfa;
                case 3: goto Lec;
                case 4: goto L3b;
                case 5: goto L27;
                default: goto La;
            }
        La:
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r10 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference) r10
            r11.getClass()
            r12.getClass()
            java.lang.String r12 = (java.lang.String) r12
            h91[] r11 = defpackage.h91.values()
            java.lang.Enum r11 = defpackage.jw2.o(r12, r11)
            h91 r11 = (defpackage.h91) r11
            h91 r12 = defpackage.h91.STATIC_IMAGE
            if (r11 != r12) goto L23
            r2 = r3
        L23:
            r10.setVisible(r2)
            return r3
        L27:
            me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment r10 = (me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment) r10
            r11.getClass()
            androidx.preference.SeekBarPreference r11 = (androidx.preference.SeekBarPreference) r11
            r12.getClass()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r10.l(r11, r12)
            return r3
        L3b:
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment r10 = (me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment) r10
            r11.getClass()
            kn5 r11 = defpackage.ln5.Companion
            boolean r0 = r12 instanceof java.lang.String
            if (r0 == 0) goto L49
            java.lang.String r12 = (java.lang.String) r12
            goto L4a
        L49:
            r12 = r1
        L4a:
            r11.getClass()
            ln5 r11 = defpackage.kn5.a(r12)
            cn5 r12 = r10.d0
            java.lang.String r0 = "endpointProvider"
            if (r12 == 0) goto Le8
            r11.getClass()
            java.util.Set r4 = defpackage.fn5.a
            android.content.SharedPreferences r12 = r12.a
            en5 r4 = defpackage.fn5.c(r12)
            android.content.SharedPreferences$Editor r5 = r12.edit()
            java.lang.String r6 = "ra_offline_backend"
            java.lang.String r7 = r11.getPreferenceValue()
            android.content.SharedPreferences$Editor r5 = r5.putString(r6, r7)
            java.lang.String r6 = "ra_endpoint_generation"
            long r7 = defpackage.fn5.b(r12)
            android.content.SharedPreferences$Editor r5 = r5.putLong(r6, r7)
            ln5 r6 = defpackage.ln5.RA_OFFLINE_PROXY
            java.lang.String r7 = "ra_proxy_hardcore_restore_pending"
            java.lang.String r8 = "ra_hardcore_enabled"
            if (r11 != r6) goto L96
            ln5 r4 = r4.b
            ln5 r9 = defpackage.ln5.BUILT_IN
            if (r4 != r9) goto L96
            boolean r4 = r12.getBoolean(r8, r2)
            if (r4 == 0) goto L96
            android.content.SharedPreferences$Editor r4 = r5.putBoolean(r7, r3)
            r4.putBoolean(r8, r2)
            goto Lb7
        L96:
            ln5 r4 = defpackage.ln5.BUILT_IN
            if (r11 != r4) goto Lb7
            java.lang.String r4 = "ra_offline_proxy_external_active"
            boolean r4 = r12.getBoolean(r4, r2)
            if (r4 != 0) goto Lb7
            r5.getClass()
            boolean r4 = r12.getBoolean(r7, r2)
            if (r4 == 0) goto Lb4
            boolean r4 = r12.getBoolean(r8, r2)
            if (r4 != 0) goto Lb4
            r5.putBoolean(r8, r3)
        Lb4:
            r5.remove(r7)
        Lb7:
            boolean r4 = r5.commit()
            if (r4 == 0) goto Le2
            defpackage.fn5.c(r12)
            if (r11 != r6) goto Ldc
            cn5 r11 = r10.d0
            if (r11 == 0) goto Lde
            en5 r11 = r11.a()
            java.lang.String r11 = r11.d
            if (r11 != 0) goto Ldc
            android.content.Context r10 = r10.requireContext()
            r11 = 2131952401(0x7f130311, float:1.9541244E38)
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r11, r3)
            r10.show()
        Ldc:
            r2 = r3
            goto Le7
        Lde:
            defpackage.nb3.a0(r0)
            throw r1
        Le2:
            java.lang.String r10 = "Could not persist RA offline backend"
            defpackage.i.m(r10)
        Le7:
            return r2
        Le8:
            defpackage.nb3.a0(r0)
            throw r1
        Lec:
            r35 r10 = (defpackage.r35) r10
            r10.getClass()
            r12.getClass()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r10.c(r12)
            return r3
        Lfa:
            me.magnum.melonds.ui.settings.fragments.InputPreferencesFragment r10 = (me.magnum.melonds.ui.settings.fragments.InputPreferencesFragment) r10
            r11.getClass()
            r12.getClass()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            u87 r10 = r10.Z
            if (r10 == 0) goto L12a
            op r10 = r10.a
            boolean r12 = r10.d()
            if (r12 == 0) goto L117
            r12 = 100
            goto L120
        L117:
            float r12 = (float) r11
            r0 = 1120403456(0x42c80000, float:100.0)
            float r12 = r12 / r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 * r1
            float r12 = r12 * r0
            int r12 = (int) r12
        L120:
            r0 = 255(0xff, float:3.57E-43)
            int r11 = defpackage.gi2.q(r11, r3, r0)
            r10.e(r12, r11)
            return r3
        L12a:
            java.lang.String r10 = "vibrator"
            defpackage.nb3.a0(r10)
            throw r1
        L130:
            me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment r10 = (me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment) r10
            r11.getClass()
            vs4 r11 = defpackage.ht.a
            android.content.Context r11 = r10.requireContext()
            r11.getClass()
            r12.getClass()
            java.lang.String r12 = (java.lang.String) r12
            e57 r0 = defpackage.g57.Companion
            r0.getClass()
            g57 r0 = defpackage.e57.a(r12)
            vs4 r1 = defpackage.ht.a
            r1.setValue(r0)
            java.lang.String r0 = defpackage.v15.b(r11)
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r0, r2)
            android.content.SharedPreferences$Editor r11 = r11.edit()
            java.lang.String r0 = "theme"
            android.content.SharedPreferences$Editor r11 = r11.putString(r0, r12)
            r11.apply()
            androidx.fragment.app.p r10 = r10.getActivity()
            if (r10 == 0) goto L16f
            r10.recreate()
        L16f:
            return r3
        L170:
            me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment r10 = (me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment) r10
            r11.getClass()
            r12.getClass()
            java.lang.String r12 = (java.lang.String) r12
            me.magnum.melonds.domain.model.MicSource[] r11 = me.magnum.melonds.domain.model.MicSource.values()
            java.lang.Enum r11 = defpackage.jw2.o(r12, r11)
            me.magnum.melonds.domain.model.MicSource r11 = (me.magnum.melonds.domain.model.MicSource) r11
            me.magnum.melonds.domain.model.MicSource r12 = me.magnum.melonds.domain.model.MicSource.DEVICE
            if (r11 != r12) goto L19c
            android.content.Context r11 = r10.requireContext()
            r11.getClass()
            java.lang.String r12 = "android.permission.RECORD_AUDIO"
            int r11 = defpackage.ge7.s(r11, r12)
            if (r11 != 0) goto L198
            goto L19c
        L198:
            r10.k(r2)
            goto L19d
        L19c:
            r2 = r3
        L19d:
            return r2
    }
}
