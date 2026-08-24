package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class GooglePlayServicesUtil extends com.google.android.gms.common.GooglePlayServicesUtilLight {
    public static final java.lang.String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @java.lang.Deprecated
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @java.lang.Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;
    public static final java.lang.String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    static {
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            com.google.android.gms.common.GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE = r0
            return
    }

    private GooglePlayServicesUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static android.app.Dialog getErrorDialog(int r1, android.app.Activity r2, int r3) {
            r0 = 0
            android.app.Dialog r1 = getErrorDialog(r1, r2, r3, r0)
            return r1
    }

    @java.lang.Deprecated
    public static android.app.Dialog getErrorDialog(int r2, android.app.Activity r3, int r4, android.content.DialogInterface.OnCancelListener r5) {
            r0 = 1
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(r3, r2)
            if (r0 != r1) goto L9
            r2 = 18
        L9:
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            android.app.Dialog r2 = r0.getErrorDialog(r3, r2, r4, r5)
            return r2
    }

    @java.lang.Deprecated
    public static android.app.PendingIntent getErrorPendingIntent(int r1, android.content.Context r2, int r3) {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            android.app.PendingIntent r1 = r0.getErrorResolutionPendingIntent(r2, r1, r3)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String getErrorString(int r0) {
            java.lang.String r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.getErrorString(r0)
            return r0
    }

    public static android.content.Context getRemoteContext(android.content.Context r0) {
            android.content.Context r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r0)
            return r0
    }

    public static android.content.res.Resources getRemoteResource(android.content.Context r0) {
            android.content.res.Resources r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteResource(r0)
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(android.content.Context r0) {
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(r0)
            return r0
    }

    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(android.content.Context r0, int r1) {
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static boolean isUserRecoverableError(int r0) {
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.isUserRecoverableError(r0)
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    public static boolean showErrorDialogFragment(int r1, android.app.Activity r2, int r3) {
            r0 = 0
            boolean r1 = showErrorDialogFragment(r1, r2, r3, r0)
            return r1
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    public static boolean showErrorDialogFragment(int r1, android.app.Activity r2, int r3, android.content.DialogInterface.OnCancelListener r4) {
            r0 = 0
            boolean r1 = showErrorDialogFragment(r1, r2, r0, r3, r4)
            return r1
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static boolean showErrorDialogFragment(int r8, android.app.Activity r9, androidx.fragment.app.o r10, int r11, android.content.DialogInterface.OnCancelListener r12) {
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(r9, r8)
            r1 = 1
            if (r1 != r0) goto L9
            r8 = 18
        L9:
            r4 = r8
            com.google.android.gms.common.GoogleApiAvailability r2 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            if (r10 != 0) goto L15
            boolean r8 = r2.showErrorDialogFragment(r9, r4, r11, r12)
            return r8
        L15:
            java.lang.String r8 = "d"
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            android.content.Intent r8 = r0.getErrorResolutionIntent(r9, r4, r8)
            com.google.android.gms.common.internal.zag r5 = com.google.android.gms.common.internal.zag.zac(r10, r8, r11)
            r7 = 0
            r3 = r9
            r6 = r12
            android.app.Dialog r8 = r2.zaa(r3, r4, r5, r6, r7)
            if (r8 != 0) goto L2e
            r8 = 0
            return r8
        L2e:
            java.lang.String r9 = "GooglePlayServicesErrorDialog"
            r2.zad(r3, r8, r9, r6)
            return r1
    }

    @java.lang.Deprecated
    public static void showErrorNotification(int r2, android.content.Context r3) {
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(r3, r2)
            if (r1 != 0) goto L15
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(r3, r2)
            if (r1 == 0) goto L11
            goto L15
        L11:
            r0.showErrorNotification(r3, r2)
            return
        L15:
            r0.zaf(r3)
            return
    }
}
