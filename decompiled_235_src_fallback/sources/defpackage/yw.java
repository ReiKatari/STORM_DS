package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yw implements defpackage.x05 {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ yw(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.<init>()
            return
    }

    @Override // defpackage.x05
    public final boolean a(androidx.preference.Preference r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.a
            java.lang.String r1 = "local_multi"
            java.lang.String r2 = "translator_tts_neural_enabled"
            java.lang.String r3 = "translator_tts_multi_voice"
            java.lang.String r4 = "neural_edge"
            r5 = 0
            r6 = 0
            java.lang.Object r7 = r9.c
            java.lang.Object r9 = r9.b
            r8 = 1
            switch(r0) {
                case 0: goto L184;
                case 1: goto L143;
                case 2: goto Lda;
                case 3: goto L8d;
                default: goto L14;
            }
        L14:
            androidx.preference.ListPreference r9 = (androidx.preference.ListPreference) r9
            me.magnum.melonds.ui.settings.fragments.TranslatorPreferencesFragment r7 = (me.magnum.melonds.ui.settings.fragments.TranslatorPreferencesFragment) r7
            r10.getClass()
            boolean r10 = r11 instanceof java.lang.Boolean
            if (r10 == 0) goto L22
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            goto L23
        L22:
            r11 = r5
        L23:
            if (r11 == 0) goto L2a
            boolean r10 = r11.booleanValue()
            goto L2b
        L2a:
            r10 = r6
        L2b:
            java.lang.String r11 = "translator_tts_voice_engine"
            if (r10 == 0) goto L5a
            if (r9 == 0) goto L34
            r9.h(r1)
        L34:
            v15 r9 = r7.getPreferenceManager()
            android.content.SharedPreferences r9 = r9.d()
            if (r9 == 0) goto L8c
            android.content.SharedPreferences$Editor r9 = r9.edit()
            if (r9 == 0) goto L8c
            android.content.SharedPreferences$Editor r9 = r9.putString(r11, r1)
            if (r9 == 0) goto L8c
            android.content.SharedPreferences$Editor r9 = r9.putBoolean(r2, r6)
            if (r9 == 0) goto L8c
            android.content.SharedPreferences$Editor r9 = r9.putBoolean(r3, r8)
            if (r9 == 0) goto L8c
            r9.apply()
            goto L8c
        L5a:
            if (r9 == 0) goto L5e
            java.lang.String r5 = r9.e0
        L5e:
            boolean r10 = defpackage.nb3.k(r5, r1)
            if (r10 == 0) goto L8c
            r9.h(r4)
            v15 r9 = r7.getPreferenceManager()
            android.content.SharedPreferences r9 = r9.d()
            if (r9 == 0) goto L8c
            android.content.SharedPreferences$Editor r9 = r9.edit()
            if (r9 == 0) goto L8c
            android.content.SharedPreferences$Editor r9 = r9.putString(r11, r4)
            if (r9 == 0) goto L8c
            android.content.SharedPreferences$Editor r9 = r9.putBoolean(r2, r8)
            if (r9 == 0) goto L8c
            android.content.SharedPreferences$Editor r9 = r9.putBoolean(r3, r8)
            if (r9 == 0) goto L8c
            r9.apply()
        L8c:
            return r8
        L8d:
            androidx.preference.SwitchPreferenceCompat r9 = (androidx.preference.SwitchPreferenceCompat) r9
            me.magnum.melonds.ui.settings.fragments.TranslatorPreferencesFragment r7 = (me.magnum.melonds.ui.settings.fragments.TranslatorPreferencesFragment) r7
            r10.getClass()
            boolean r10 = r11 instanceof java.lang.String
            if (r10 == 0) goto L9b
            r5 = r11
            java.lang.String r5 = (java.lang.String) r5
        L9b:
            if (r5 != 0) goto L9e
            r5 = r4
        L9e:
            boolean r10 = r5.equals(r4)
            java.lang.String r11 = "single"
            boolean r11 = r5.equals(r11)
            r11 = r11 ^ r8
            boolean r0 = r5.equals(r1)
            if (r9 == 0) goto Lb2
            r9.e(r0)
        Lb2:
            v15 r9 = r7.getPreferenceManager()
            android.content.SharedPreferences r9 = r9.d()
            if (r9 == 0) goto Ld9
            android.content.SharedPreferences$Editor r9 = r9.edit()
            if (r9 == 0) goto Ld9
            android.content.SharedPreferences$Editor r9 = r9.putBoolean(r2, r10)
            if (r9 == 0) goto Ld9
            android.content.SharedPreferences$Editor r9 = r9.putBoolean(r3, r11)
            if (r9 == 0) goto Ld9
            java.lang.String r10 = "translator_local_voice_actor_studio"
            android.content.SharedPreferences$Editor r9 = r9.putBoolean(r10, r0)
            if (r9 == 0) goto Ld9
            r9.apply()
        Ld9:
            return r8
        Lda:
            me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment r9 = (me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment) r9
            androidx.preference.SwitchPreference r7 = (androidx.preference.SwitchPreference) r7
            r10.getClass()
            boolean r10 = r9.g0
            if (r10 == 0) goto Le6
            goto Lee
        Le6:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r10 = defpackage.nb3.k(r11, r10)
            if (r10 != 0) goto Lf0
        Lee:
            r6 = r8
            goto L142
        Lf0:
            jd6 r10 = r9.k()
            android.net.Uri r10 = r10.e()
            if (r10 == 0) goto L134
            jd6 r11 = r9.k()
            boolean r11 = r11.f(r10)
            if (r11 != 0) goto L105
            goto L134
        L105:
            zb r11 = new zb
            android.content.Context r0 = r9.requireContext()
            r11.<init>(r0)
            r0 = 2131952626(0x7f1303f2, float:1.95417E38)
            r11.z(r0)
            r0 = 2131952625(0x7f1303f1, float:1.9541698E38)
            r11.w(r0)
            wx6 r0 = new wx6
            r0.<init>(r9, r7, r10, r6)
            r1 = 2131952628(0x7f1303f4, float:1.9541704E38)
            r11.y(r1, r0)
            wx6 r0 = new wx6
            r0.<init>(r9, r7, r10, r8)
            r9 = 2131952627(0x7f1303f3, float:1.9541702E38)
            r11.x(r9, r0)
            r11.B()
            goto L142
        L134:
            r9.g0 = r8
            r7.e(r8)
            r9.g0 = r6
            jd6 r9 = r9.k()
            r9.i()
        L142:
            return r6
        L143:
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment r9 = (me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment) r9
            androidx.preference.SwitchPreference r7 = (androidx.preference.SwitchPreference) r7
            r10.getClass()
            r11.getClass()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r11.booleanValue()
            cn5 r11 = r9.d0
            if (r11 == 0) goto L17e
            en5 r11 = r11.a()
            ln5 r11 = r11.b
            ln5 r0 = defpackage.ln5.RA_OFFLINE_PROXY
            if (r11 != r0) goto L172
            if (r10 == 0) goto L172
            android.content.Context r9 = r9.requireContext()
            r10 = 2131952400(0x7f130310, float:1.9541242E38)
            android.widget.Toast r9 = android.widget.Toast.makeText(r9, r10, r8)
            r9.show()
            goto L17d
        L172:
            r9 = r10 ^ 1
            r7.setVisible(r9)
            if (r10 == 0) goto L17c
            r7.e(r8)
        L17c:
            r6 = r8
        L17d:
            return r6
        L17e:
            java.lang.String r9 = "endpointProvider"
            defpackage.nb3.a0(r9)
            throw r5
        L184:
            me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment r9 = (me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment) r9
            androidx.preference.SeekBarPreference r7 = (androidx.preference.SeekBarPreference) r7
            r10.getClass()
            r11.getClass()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            float r10 = (float) r10
            int r11 = r7.L
            float r11 = (float) r11
            float r10 = r10 / r11
            r11 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 * r11
            int r10 = (int) r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            r11 = 2131952898(0x7f130502, float:1.9542252E38)
            java.lang.String r9 = r9.getString(r11, r10)
            r7.setSummary(r9)
            return r8
    }
}
