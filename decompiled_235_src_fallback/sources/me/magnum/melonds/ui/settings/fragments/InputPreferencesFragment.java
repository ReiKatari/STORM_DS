package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class InputPreferencesFragment extends me.magnum.melonds.ui.settings.fragments.Hilt_InputPreferencesFragment implements defpackage.q15 {
    public defpackage.u87 Z;
    public me.magnum.melonds.ui.settings.preferences.SoftwareInputBehaviourPreference d0;

    public InputPreferencesFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.q15
    public final java.lang.String getTitle() {
            r1 = this;
            r0 = 2131952038(0x7f1301a6, float:1.9540507E38)
            java.lang.String r1 = r1.getString(r0)
            r1.getClass()
            return r1
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(android.os.Bundle r7, java.lang.String r8) {
            r6 = this;
            r7 = 2132148239(0x7f16000f, float:1.993845E38)
            r6.setPreferencesFromResource(r7, r8)
            java.lang.String r7 = "soft_input_behaviour"
            androidx.preference.Preference r7 = r6.findPreference(r7)
            r7.getClass()
            me.magnum.melonds.ui.settings.preferences.SoftwareInputBehaviourPreference r7 = (me.magnum.melonds.ui.settings.preferences.SoftwareInputBehaviourPreference) r7
            r6.d0 = r7
            java.lang.String r7 = "input_touch_haptic_feedback_enabled"
            androidx.preference.Preference r7 = r6.findPreference(r7)
            r7.getClass()
            androidx.preference.SwitchPreference r7 = (androidx.preference.SwitchPreference) r7
            java.lang.String r8 = "input_touch_haptic_feedback_strength"
            androidx.preference.Preference r8 = r6.findPreference(r8)
            r8.getClass()
            androidx.preference.SeekBarPreference r8 = (androidx.preference.SeekBarPreference) r8
            java.lang.String r0 = "input_key_mapping"
            androidx.preference.Preference r0 = r6.findPreference(r0)
            r0.getClass()
            me.magnum.melonds.ui.settings.preferences.InGameLockedPreference r0 = (me.magnum.melonds.ui.settings.preferences.InGameLockedPreference) r0
            java.lang.String r1 = "input_layouts"
            androidx.preference.Preference r1 = r6.findPreference(r1)
            r1.getClass()
            me.magnum.melonds.ui.settings.preferences.InGameLockedPreference r1 = (me.magnum.melonds.ui.settings.preferences.InGameLockedPreference) r1
            androidx.fragment.app.p r2 = r6.requireActivity()
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r3 = "lock_input_mapping"
            r4 = 0
            boolean r2 = r2.getBooleanExtra(r3, r4)
            r0.A = r2
            r2 = 2131951751(0x7f130087, float:1.9539925E38)
            r0.B = r2
            androidx.fragment.app.p r3 = r6.requireActivity()
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r5 = "lock_input_layout"
            boolean r3 = r3.getBooleanExtra(r5, r4)
            r1.A = r3
            r1.B = r2
            u87 r2 = r6.Z
            if (r2 == 0) goto L94
            op r2 = r2.a
            boolean r2 = r2.c()
            if (r2 != 0) goto L76
            r7.setVisible(r4)
        L76:
            r8.setVisible(r4)
            zw r7 = new zw
            r2 = 2
            r7.<init>(r6, r2)
            r8.setOnPreferenceChangeListener(r7)
            a73 r7 = new a73
            r7.<init>(r6, r4)
            r0.setOnPreferenceClickListener(r7)
            a73 r7 = new a73
            r8 = 1
            r7.<init>(r6, r8)
            r1.setOnPreferenceClickListener(r7)
            return
        L94:
            java.lang.String r6 = "vibrator"
            defpackage.nb3.a0(r6)
            r6 = 0
            throw r6
    }

    @Override // me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment, androidx.fragment.app.o
    public final void onResume() {
            r4 = this;
            super.onResume()
            me.magnum.melonds.ui.settings.preferences.SoftwareInputBehaviourPreference r0 = r4.d0
            java.lang.String r1 = "softInputBehaviourPreference"
            r2 = 0
            if (r0 == 0) goto L2d
            if (r0 == 0) goto L29
            android.content.SharedPreferences r3 = r0.getSharedPreferences()
            if (r3 == 0) goto L25
            me.magnum.melonds.ui.settings.preferences.SoftwareInputBehaviourPreference r4 = r4.d0
            if (r4 == 0) goto L21
            java.lang.String r4 = r4.getKey()
            java.lang.String r1 = "hide_system_buttons_when_controller_connected"
            java.lang.String r2 = r3.getString(r4, r1)
            goto L25
        L21:
            defpackage.nb3.a0(r1)
            throw r2
        L25:
            r0.h(r2)
            return
        L29:
            defpackage.nb3.a0(r1)
            throw r2
        L2d:
            defpackage.nb3.a0(r1)
            throw r2
    }
}
