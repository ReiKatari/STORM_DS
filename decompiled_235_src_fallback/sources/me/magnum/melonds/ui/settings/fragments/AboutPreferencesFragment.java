package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class AboutPreferencesFragment extends me.magnum.melonds.ui.settings.fragments.Hilt_AboutPreferencesFragment implements defpackage.q15 {
    public AboutPreferencesFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.q15
    public final java.lang.String getTitle() {
            r1 = this;
            r0 = 2131951645(0x7f13001d, float:1.953971E38)
            java.lang.String r1 = r1.getString(r0)
            r1.getClass()
            return r1
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(android.os.Bundle r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r6 = "v"
            r0 = 2132148233(0x7f160009, float:1.9938438E38)
            r5.setPreferencesFromResource(r0, r7)
            r7 = 0
            android.content.Context r0 = r5.requireContext()     // Catch: java.lang.Throwable -> L55
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L55
            android.content.Context r1 = r5.requireContext()     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L55
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r7)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r0.versionName     // Catch: java.lang.Throwable -> L55
            if (r1 != 0) goto L23
            java.lang.String r1 = "1.0.0"
        L23:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L55
            r3 = 28
            if (r2 < r3) goto L2e
            long r2 = defpackage.yr1.b(r0)     // Catch: java.lang.Throwable -> L55
            goto L31
        L2e:
            int r0 = r0.versionCode     // Catch: java.lang.Throwable -> L55
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L55
        L31:
            java.lang.String r0 = "about_version"
            androidx.preference.Preference r0 = r5.findPreference(r0)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L55
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L55
            r4.append(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = " (Build "
            r4.append(r6)     // Catch: java.lang.Throwable -> L55
            r4.append(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = ")"
            r4.append(r6)     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L55
            r0.setSummary(r6)     // Catch: java.lang.Throwable -> L55
        L55:
            java.lang.String r6 = "about_github"
            androidx.preference.Preference r6 = r5.findPreference(r6)
            if (r6 == 0) goto L65
            p r0 = new p
            r0.<init>(r5, r7)
            r6.setOnPreferenceClickListener(r0)
        L65:
            java.lang.String r6 = "credits_jpeacekeeper"
            androidx.preference.Preference r6 = r5.findPreference(r6)
            if (r6 == 0) goto L76
            p r7 = new p
            r0 = 1
            r7.<init>(r5, r0)
            r6.setOnPreferenceClickListener(r7)
        L76:
            java.lang.String r6 = "credits_watermelonds"
            androidx.preference.Preference r6 = r5.findPreference(r6)
            if (r6 == 0) goto L87
            p r7 = new p
            r0 = 2
            r7.<init>(r5, r0)
            r6.setOnPreferenceClickListener(r7)
        L87:
            java.lang.String r6 = "credits_melonds"
            androidx.preference.Preference r6 = r5.findPreference(r6)
            if (r6 == 0) goto L98
            p r7 = new p
            r0 = 3
            r7.<init>(r5, r0)
            r6.setOnPreferenceClickListener(r7)
        L98:
            return
    }
}
