package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class GoogleApiAvailabilityLight {
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;
    public static final java.lang.String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final java.lang.String TRACKING_SOURCE_DIALOG = "d";
    static final java.lang.String TRACKING_SOURCE_NOTIFICATION = "n";
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zza = null;

    static {
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE = r0
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = new com.google.android.gms.common.GoogleApiAvailabilityLight
            r0.<init>()
            com.google.android.gms.common.GoogleApiAvailabilityLight.zza = r0
            return
    }

    public GoogleApiAvailabilityLight() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.common.GoogleApiAvailabilityLight getInstance() {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.zza
            return r0
    }

    public void cancelAvailabilityErrorNotifications(android.content.Context r1) {
            r0 = this;
            com.google.android.gms.common.GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(r1)
            return
    }

    public int getApkVersion(android.content.Context r1) {
            r0 = this;
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.getApkVersion(r1)
            return r0
    }

    public int getClientVersion(android.content.Context r1) {
            r0 = this;
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.getClientVersion(r1)
            return r0
    }

    @java.lang.Deprecated
    public android.content.Intent getErrorResolutionIntent(int r2) {
            r1 = this;
            r0 = 0
            android.content.Intent r1 = r1.getErrorResolutionIntent(r0, r2, r0)
            return r1
    }

    public android.content.Intent getErrorResolutionIntent(android.content.Context r3, int r4, java.lang.String r5) {
            r2 = this;
            r2 = 1
            java.lang.String r0 = "com.google.android.gms"
            if (r4 == r2) goto L1e
            r2 = 2
            if (r4 == r2) goto L1e
            r2 = 3
            r3 = 0
            if (r4 == r2) goto Ld
            return r3
        Ld:
            java.lang.String r2 = "package"
            android.net.Uri r2 = android.net.Uri.fromParts(r2, r0, r3)
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r3.<init>(r4)
            r3.setData(r2)
            return r3
        L1e:
            if (r3 == 0) goto L34
            boolean r2 = com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(r3)
            if (r2 != 0) goto L27
            goto L34
        L27:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION"
            r2.<init>(r3)
            java.lang.String r3 = "com.google.android.wearable.app"
            r2.setPackage(r3)
            return r2
        L34:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "gcore_"
            r2.<init>(r4)
            int r4 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            r2.append(r4)
            java.lang.String r4 = "-"
            r2.append(r4)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L4e
            r2.append(r5)
        L4e:
            r2.append(r4)
            if (r3 == 0) goto L5a
            java.lang.String r5 = r3.getPackageName()
            r2.append(r5)
        L5a:
            r2.append(r4)
            if (r3 == 0) goto L71
            com.google.android.gms.common.wrappers.PackageManagerWrapper r4 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L71
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L71
            r5 = 0
            android.content.pm.PackageInfo r3 = r4.getPackageInfo(r3, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L71
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L71
            r2.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L71
        L71:
            java.lang.String r2 = r2.toString()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.VIEW"
            r3.<init>(r4)
            java.lang.String r4 = "market://details"
            android.net.Uri r4 = android.net.Uri.parse(r4)
            android.net.Uri$Builder r4 = r4.buildUpon()
            java.lang.String r5 = "id"
            android.net.Uri$Builder r4 = r4.appendQueryParameter(r5, r0)
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L97
            java.lang.String r5 = "pcampaignid"
            r4.appendQueryParameter(r5, r2)
        L97:
            android.net.Uri r2 = r4.build()
            r3.setData(r2)
            java.lang.String r2 = "com.android.vending"
            r3.setPackage(r2)
            r2 = 524288(0x80000, float:7.34684E-40)
            r3.addFlags(r2)
            return r3
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            android.app.PendingIntent r1 = r1.getErrorResolutionPendingIntent(r2, r3, r4, r0)
            return r1
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            android.content.Intent r0 = r0.getErrorResolutionIntent(r1, r2, r4)
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r2 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r1, r3, r0, r2)
            return r0
    }

    public java.lang.String getErrorString(int r1) {
            r0 = this;
            java.lang.String r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.getErrorString(r1)
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public int isGooglePlayServicesAvailable(android.content.Context r2) {
            r1 = this;
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            int r1 = r1.isGooglePlayServicesAvailable(r2, r0)
            return r1
    }

    public int isGooglePlayServicesAvailable(android.content.Context r1, int r2) {
            r0 = this;
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(r1, r2)
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(r1, r0)
            if (r1 == 0) goto Lc
            r0 = 18
        Lc:
            return r0
    }

    public boolean isPlayServicesPossiblyUpdating(android.content.Context r1, int r2) {
            r0 = this;
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(r1, r2)
            return r0
    }

    public boolean isPlayStorePossiblyUpdating(android.content.Context r1, int r2) {
            r0 = this;
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(r1, r2)
            return r0
    }

    public boolean isUninstalledAppPossiblyUpdating(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.zza(r1, r2)
            return r0
    }

    public boolean isUserResolvableError(int r1) {
            r0 = this;
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.isUserRecoverableError(r1)
            return r0
    }

    public void verifyGooglePlayServicesIsAvailable(android.content.Context r1, int r2) {
            r0 = this;
            com.google.android.gms.common.GooglePlayServicesUtilLight.ensurePlayServicesAvailable(r1, r2)
            return
    }
}
