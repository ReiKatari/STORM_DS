package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zac {
    private static final defpackage.ci6 zaa = null;
    private static java.util.Locale zab;

    static {
            ci6 r0 = new ci6
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.common.internal.zac.zaa = r0
            return
    }

    public static java.lang.String zaa(android.content.Context r2) {
            java.lang.String r0 = r2.getPackageName()
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.CharSequence r1 = r1.getApplicationLabel(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            java.lang.String r2 = r2.name
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L1e
            return r0
        L1e:
            return r2
    }

    public static java.lang.String zab(android.content.Context r1, int r2) {
            android.content.res.Resources r1 = r1.getResources()
            r0 = 1
            if (r2 == r0) goto L25
            r0 = 2
            if (r2 == r0) goto L1d
            r0 = 3
            if (r2 == r0) goto L15
            r2 = 17039370(0x104000a, float:2.42446E-38)
            java.lang.String r1 = r1.getString(r2)
            return r1
        L15:
            r2 = 2131951797(0x7f1300b5, float:1.9540019E38)
            java.lang.String r1 = r1.getString(r2)
            return r1
        L1d:
            r2 = 2131951807(0x7f1300bf, float:1.9540039E38)
            java.lang.String r1 = r1.getString(r2)
            return r1
        L25:
            r2 = 2131951800(0x7f1300b8, float:1.9540025E38)
            java.lang.String r1 = r1.getString(r2)
            return r1
    }

    public static java.lang.String zac(android.content.Context r3, int r4) {
            android.content.res.Resources r0 = r3.getResources()
            java.lang.String r1 = zaa(r3)
            r2 = 1
            if (r4 == r2) goto L8e
            r2 = 2
            if (r4 == r2) goto L74
            r2 = 3
            if (r4 == r2) goto L68
            r2 = 5
            if (r4 == r2) goto L61
            r2 = 7
            if (r4 == r2) goto L5a
            r2 = 9
            if (r4 == r2) goto L4e
            r2 = 20
            if (r4 == r2) goto L47
            switch(r4) {
                case 16: goto L40;
                case 17: goto L39;
                case 18: goto L2d;
                default: goto L22;
            }
        L22:
            int r3 = com.google.android.gms.common.R.string.common_google_play_services_unknown_issue
            java.lang.Object[] r4 = new java.lang.Object[]{r1}
            java.lang.String r3 = r0.getString(r3, r4)
            return r3
        L2d:
            r3 = 2131951810(0x7f1300c2, float:1.9540045E38)
            java.lang.Object[] r4 = new java.lang.Object[]{r1}
            java.lang.String r3 = r0.getString(r3, r4)
            return r3
        L39:
            java.lang.String r4 = "common_google_play_services_sign_in_failed_text"
            java.lang.String r3 = zag(r3, r4, r1)
            return r3
        L40:
            java.lang.String r4 = "common_google_play_services_api_unavailable_text"
            java.lang.String r3 = zag(r3, r4, r1)
            return r3
        L47:
            java.lang.String r4 = "common_google_play_services_restricted_profile_text"
            java.lang.String r3 = zag(r3, r4, r1)
            return r3
        L4e:
            r3 = 2131951806(0x7f1300be, float:1.9540037E38)
            java.lang.Object[] r4 = new java.lang.Object[]{r1}
            java.lang.String r3 = r0.getString(r3, r4)
            return r3
        L5a:
            java.lang.String r4 = "common_google_play_services_network_error_text"
            java.lang.String r3 = zag(r3, r4, r1)
            return r3
        L61:
            java.lang.String r4 = "common_google_play_services_invalid_account_text"
            java.lang.String r3 = zag(r3, r4, r1)
            return r3
        L68:
            r3 = 2131951798(0x7f1300b6, float:1.954002E38)
            java.lang.Object[] r4 = new java.lang.Object[]{r1}
            java.lang.String r3 = r0.getString(r3, r4)
            return r3
        L74:
            boolean r3 = com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(r3)
            if (r3 == 0) goto L82
            r3 = 2131951811(0x7f1300c3, float:1.9540047E38)
            java.lang.String r3 = r0.getString(r3)
            return r3
        L82:
            r3 = 2131951808(0x7f1300c0, float:1.954004E38)
            java.lang.Object[] r4 = new java.lang.Object[]{r1}
            java.lang.String r3 = r0.getString(r3, r4)
            return r3
        L8e:
            r3 = 2131951801(0x7f1300b9, float:1.9540027E38)
            java.lang.Object[] r4 = new java.lang.Object[]{r1}
            java.lang.String r3 = r0.getString(r3, r4)
            return r3
    }

    public static java.lang.String zad(android.content.Context r1, int r2) {
            r0 = 6
            if (r2 == r0) goto Ld
            r0 = 19
            if (r2 != r0) goto L8
            goto Ld
        L8:
            java.lang.String r1 = zac(r1, r2)
            return r1
        Ld:
            java.lang.String r2 = zaa(r1)
            java.lang.String r0 = "common_google_play_services_resolution_required_text"
            java.lang.String r1 = zag(r1, r0, r2)
            return r1
    }

    public static java.lang.String zae(android.content.Context r1, int r2) {
            r0 = 6
            if (r2 != r0) goto La
            java.lang.String r2 = "common_google_play_services_resolution_required_title"
            java.lang.String r2 = zah(r1, r2)
            goto Le
        La:
            java.lang.String r2 = zaf(r1, r2)
        Le:
            if (r2 != 0) goto L1c
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131951804(0x7f1300bc, float:1.9540033E38)
            java.lang.String r1 = r1.getString(r2)
            return r1
        L1c:
            return r2
    }

    public static java.lang.String zaf(android.content.Context r3, int r4) {
            android.content.res.Resources r0 = r3.getResources()
            r1 = 0
            java.lang.String r2 = "GoogleApiAvailability"
            switch(r4) {
                case 1: goto L7b;
                case 2: goto L73;
                case 3: goto L6b;
                case 4: goto L6a;
                case 5: goto L5e;
                case 6: goto L6a;
                case 7: goto L52;
                case 8: goto L4c;
                case 9: goto L46;
                case 10: goto L40;
                case 11: goto L3a;
                case 12: goto La;
                case 13: goto La;
                case 14: goto La;
                case 15: goto La;
                case 16: goto L34;
                case 17: goto L28;
                case 18: goto L6a;
                case 19: goto La;
                case 20: goto L1c;
                default: goto La;
            }
        La:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Unexpected error code "
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r2, r3)
            return r1
        L1c:
            java.lang.String r4 = "The current user profile is restricted and could not use authenticated features."
            android.util.Log.e(r2, r4)
            java.lang.String r4 = "common_google_play_services_restricted_profile_title"
            java.lang.String r3 = zah(r3, r4)
            return r3
        L28:
            java.lang.String r4 = "The specified account could not be signed in."
            android.util.Log.e(r2, r4)
            java.lang.String r4 = "common_google_play_services_sign_in_failed_title"
            java.lang.String r3 = zah(r3, r4)
            return r3
        L34:
            java.lang.String r3 = "One of the API components you attempted to connect to is not available."
            android.util.Log.e(r2, r3)
            return r1
        L3a:
            java.lang.String r3 = "The application is not licensed to the user."
            android.util.Log.e(r2, r3)
            return r1
        L40:
            java.lang.String r3 = "Developer error occurred. Please see logs for detailed information"
            android.util.Log.e(r2, r3)
            return r1
        L46:
            java.lang.String r3 = "Google Play services is invalid. Cannot recover."
            android.util.Log.e(r2, r3)
            return r1
        L4c:
            java.lang.String r3 = "Internal error occurred. Please see logs for detailed information"
            android.util.Log.e(r2, r3)
            return r1
        L52:
            java.lang.String r4 = "Network error occurred. Please retry request later."
            android.util.Log.e(r2, r4)
            java.lang.String r4 = "common_google_play_services_network_error_title"
            java.lang.String r3 = zah(r3, r4)
            return r3
        L5e:
            java.lang.String r4 = "An invalid account was specified when connecting. Please provide a valid account."
            android.util.Log.e(r2, r4)
            java.lang.String r4 = "common_google_play_services_invalid_account_title"
            java.lang.String r3 = zah(r3, r4)
            return r3
        L6a:
            return r1
        L6b:
            r3 = 2131951799(0x7f1300b7, float:1.9540023E38)
            java.lang.String r3 = r0.getString(r3)
            return r3
        L73:
            r3 = 2131951809(0x7f1300c1, float:1.9540043E38)
            java.lang.String r3 = r0.getString(r3)
            return r3
        L7b:
            r3 = 2131951802(0x7f1300ba, float:1.9540029E38)
            java.lang.String r3 = r0.getString(r3)
            return r3
    }

    private static java.lang.String zag(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r1 = zah(r1, r2)
            if (r1 != 0) goto L10
            int r1 = com.google.android.gms.common.R.string.common_google_play_services_unknown_issue
            java.lang.String r1 = r0.getString(r1)
        L10:
            android.content.res.Configuration r2 = r0.getConfiguration()
            java.util.Locale r2 = r2.locale
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r1 = java.lang.String.format(r2, r1, r3)
            return r1
    }

    private static java.lang.String zah(android.content.Context r6, java.lang.String r7) {
            java.lang.String r0 = "Got empty resource: "
            java.lang.String r1 = "Missing resource: "
            ci6 r2 = com.google.android.gms.common.internal.zac.zaa
            monitor-enter(r2)
            android.content.res.Resources r3 = r6.getResources()     // Catch: java.lang.Throwable -> L30
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Throwable -> L30
            android.os.LocaleList r3 = r3.getLocales()     // Catch: java.lang.Throwable -> L30
            hy3 r4 = new hy3     // Catch: java.lang.Throwable -> L30
            iy3 r5 = new iy3     // Catch: java.lang.Throwable -> L30
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L30
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L30
            r3 = 0
            java.util.Locale r3 = r4.b(r3)     // Catch: java.lang.Throwable -> L30
            java.util.Locale r4 = com.google.android.gms.common.internal.zac.zab     // Catch: java.lang.Throwable -> L30
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L32
            r2.clear()     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.common.internal.zac.zab = r3     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r6 = move-exception
            goto L84
        L32:
            java.lang.Object r3 = r2.get(r7)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            return r3
        L3c:
            android.content.res.Resources r6 = com.google.android.gms.common.GooglePlayServicesUtil.getRemoteResource(r6)     // Catch: java.lang.Throwable -> L30
            r3 = 0
            if (r6 != 0) goto L45
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            return r3
        L45:
            java.lang.String r4 = "string"
            java.lang.String r5 = "com.google.android.gms"
            int r4 = r6.getIdentifier(r7, r4, r5)     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L62
            java.lang.String r6 = "GoogleApiAvailability"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L30
            r0.append(r7)     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L30
            android.util.Log.w(r6, r7)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            return r3
        L62:
            java.lang.String r6 = r6.getString(r4)     // Catch: java.lang.Throwable -> L30
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L7f
            java.lang.String r6 = "GoogleApiAvailability"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L30
            r1.append(r7)     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L30
            android.util.Log.w(r6, r7)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            return r3
        L7f:
            r2.put(r7, r6)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            return r6
        L84:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            throw r6
    }
}
