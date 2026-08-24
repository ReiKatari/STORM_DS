package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@com.google.errorprone.annotations.RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {defpackage.nz7.class, defpackage.pz7.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public class GoogleApiAvailability extends com.google.android.gms.common.GoogleApiAvailabilityLight {
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;
    private static final java.lang.Object zaa = null;
    private static final com.google.android.gms.common.GoogleApiAvailability zab = null;
    private java.lang.String zac;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.GoogleApiAvailability.zaa = r0
            com.google.android.gms.common.GoogleApiAvailability r0 = new com.google.android.gms.common.GoogleApiAvailability
            r0.<init>()
            com.google.android.gms.common.GoogleApiAvailability.zab = r0
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE = r0
            return
    }

    public GoogleApiAvailability() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.common.GoogleApiAvailability getInstance() {
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.zab
            return r0
    }

    public static final com.google.android.gms.tasks.Task zai(com.google.android.gms.common.api.HasApiKey r4, com.google.android.gms.common.api.HasApiKey... r5) {
            java.lang.String r0 = "Requested API must not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L11
            r3 = r5[r2]
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            int r2 = r2 + 1
            goto L7
        L11:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r4)
            java.util.List r4 = java.util.Arrays.asList(r5)
            r0.addAll(r4)
            com.google.android.gms.common.api.internal.GoogleApiManager r4 = com.google.android.gms.common.api.internal.GoogleApiManager.zaj()
            com.google.android.gms.tasks.Task r4 = r4.zam(r0)
            return r4
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> checkApiAvailability(com.google.android.gms.common.api.GoogleApi<?> r1, com.google.android.gms.common.api.GoogleApi<?>... r2) {
            r0 = this;
            com.google.android.gms.tasks.Task r0 = zai(r1, r2)
            com.google.android.gms.common.zab r1 = com.google.android.gms.common.zab.zaa
            com.google.android.gms.tasks.Task r0 = r0.onSuccessTask(r1)
            return r0
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> checkApiAvailability(com.google.android.gms.common.api.HasApiKey<?> r1, com.google.android.gms.common.api.HasApiKey<?>... r2) {
            r0 = this;
            com.google.android.gms.tasks.Task r0 = zai(r1, r2)
            com.google.android.gms.common.zaa r1 = com.google.android.gms.common.zaa.zaa
            com.google.android.gms.tasks.Task r0 = r0.onSuccessTask(r1)
            return r0
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int getClientVersion(android.content.Context r1) {
            r0 = this;
            int r0 = super.getClientVersion(r1)
            return r0
    }

    public android.app.Dialog getErrorDialog(android.app.Activity r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            android.app.Dialog r1 = r1.getErrorDialog(r2, r3, r4, r0)
            return r1
    }

    public android.app.Dialog getErrorDialog(android.app.Activity r8, int r9, int r10, android.content.DialogInterface.OnCancelListener r11) {
            r7 = this;
            java.lang.String r0 = "d"
            android.content.Intent r0 = r7.getErrorResolutionIntent(r8, r9, r0)
            com.google.android.gms.common.internal.zag r4 = com.google.android.gms.common.internal.zag.zab(r8, r0, r10)
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            android.app.Dialog r7 = r1.zaa(r2, r3, r4, r5, r6)
            return r7
    }

    public android.app.Dialog getErrorDialog(androidx.fragment.app.o r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            android.app.Dialog r1 = r1.getErrorDialog(r2, r3, r4, r0)
            return r1
    }

    public android.app.Dialog getErrorDialog(androidx.fragment.app.o r8, int r9, int r10, android.content.DialogInterface.OnCancelListener r11) {
            r7 = this;
            java.lang.String r0 = "d"
            android.content.Context r1 = r8.requireContext()
            android.content.Intent r0 = r7.getErrorResolutionIntent(r1, r9, r0)
            android.content.Context r2 = r8.requireContext()
            com.google.android.gms.common.internal.zag r4 = com.google.android.gms.common.internal.zag.zac(r8, r0, r10)
            r6 = 0
            r1 = r7
            r3 = r9
            r5 = r11
            android.app.Dialog r7 = r1.zaa(r2, r3, r4, r5, r6)
            return r7
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public android.content.Intent getErrorResolutionIntent(android.content.Context r1, int r2, java.lang.String r3) {
            r0 = this;
            android.content.Intent r0 = super.getErrorResolutionIntent(r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context r1, int r2, int r3) {
            r0 = this;
            android.app.PendingIntent r0 = super.getErrorResolutionPendingIntent(r1, r2, r3)
            return r0
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context r2, com.google.android.gms.common.ConnectionResult r3) {
            r1 = this;
            boolean r0 = r3.hasResolution()
            if (r0 == 0) goto Lb
            android.app.PendingIntent r1 = r3.getResolution()
            return r1
        Lb:
            int r3 = r3.getErrorCode()
            r0 = 0
            android.app.PendingIntent r1 = r1.getErrorResolutionPendingIntent(r2, r3, r0)
            return r1
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final java.lang.String getErrorString(int r1) {
            r0 = this;
            java.lang.String r0 = super.getErrorString(r1)
            return r0
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public int isGooglePlayServicesAvailable(android.content.Context r1) {
            r0 = this;
            int r0 = super.isGooglePlayServicesAvailable(r1)
            return r0
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(android.content.Context r1, int r2) {
            r0 = this;
            int r0 = super.isGooglePlayServicesAvailable(r1, r2)
            return r0
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int r1) {
            r0 = this;
            boolean r0 = super.isUserResolvableError(r1)
            return r0
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> makeGooglePlayServicesAvailable(android.app.Activity r3) {
            r2 = this;
            int r0 = com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE
            java.lang.String r1 = "makeGooglePlayServicesAvailable must be called from the main thread"
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r1)
            int r2 = r2.isGooglePlayServicesAvailable(r3, r0)
            r0 = 0
            if (r2 != 0) goto L13
            com.google.android.gms.tasks.Task r2 = com.google.android.gms.tasks.Tasks.forResult(r0)
            return r2
        L13:
            com.google.android.gms.common.api.internal.zacc r3 = com.google.android.gms.common.api.internal.zacc.zaa(r3)
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r1.<init>(r2, r0)
            r2 = 0
            r3.zah(r1, r2)
            com.google.android.gms.tasks.Task r2 = r3.zad()
            return r2
    }

    public void setDefaultNotificationChannelId(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            if (r0 == 0) goto L19
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            android.app.NotificationChannel r2 = defpackage.wa2.g(r2, r3)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
        L19:
            java.lang.Object r2 = com.google.android.gms.common.GoogleApiAvailability.zaa
            monitor-enter(r2)
            r1.zac = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r1
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(android.app.Activity r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r1 = r1.showErrorDialogFragment(r2, r3, r4, r0)
            return r1
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(android.app.Activity r1, int r2, int r3, android.content.DialogInterface.OnCancelListener r4) {
            r0 = this;
            android.app.Dialog r2 = r0.getErrorDialog(r1, r2, r3, r4)
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r3 = "GooglePlayServicesErrorDialog"
            r0.zad(r1, r2, r3, r4)
            r0 = 1
            return r0
    }

    public boolean showErrorDialogFragment(android.app.Activity r7, int r8, defpackage.d9 r9, android.content.DialogInterface.OnCancelListener r10) {
            r6 = this;
            com.google.android.gms.common.zac r5 = new com.google.android.gms.common.zac
            r5.<init>(r6, r7, r8, r9)
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            android.app.Dialog r6 = r0.zaa(r1, r2, r3, r4, r5)
            if (r6 != 0) goto L12
            r6 = 0
            return r6
        L12:
            java.lang.String r7 = "GooglePlayServicesErrorDialog"
            r0.zad(r1, r6, r7, r4)
            r6 = 1
            return r6
    }

    public void showErrorNotification(android.content.Context r3, int r4) {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "n"
            android.app.PendingIntent r0 = r2.getErrorResolutionPendingIntent(r3, r4, r0, r1)
            r1 = 0
            r2.zae(r3, r4, r1, r0)
            return
    }

    public void showErrorNotification(android.content.Context r3, com.google.android.gms.common.ConnectionResult r4) {
            r2 = this;
            android.app.PendingIntent r0 = r2.getErrorResolutionPendingIntent(r3, r4)
            int r4 = r4.getErrorCode()
            r1 = 0
            r2.zae(r3, r4, r1, r0)
            return
    }

    public final android.app.Dialog zaa(android.content.Context r5, int r6, com.google.android.gms.common.internal.zag r7, android.content.DialogInterface.OnCancelListener r8, android.content.DialogInterface.OnClickListener r9) {
            r4 = this;
            r4 = 0
            if (r6 != 0) goto L4
            return r4
        L4:
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r2 = 16843529(0x1010309, float:2.3695736E-38)
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            android.content.res.Resources r1 = r5.getResources()
            int r0 = r0.resourceId
            java.lang.String r0 = r1.getResourceEntryName(r0)
            java.lang.String r1 = "Theme.Dialog.Alert"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2c
            android.app.AlertDialog$Builder r4 = new android.app.AlertDialog$Builder
            r0 = 5
            r4.<init>(r5, r0)
        L2c:
            if (r4 != 0) goto L33
            android.app.AlertDialog$Builder r4 = new android.app.AlertDialog$Builder
            r4.<init>(r5)
        L33:
            java.lang.String r0 = com.google.android.gms.common.internal.zac.zac(r5, r6)
            r4.setMessage(r0)
            if (r8 == 0) goto L3f
            r4.setOnCancelListener(r8)
        L3f:
            java.lang.String r8 = com.google.android.gms.common.internal.zac.zab(r5, r6)
            if (r8 == 0) goto L4b
            if (r7 != 0) goto L48
            r7 = r9
        L48:
            r4.setPositiveButton(r8, r7)
        L4b:
            java.lang.String r5 = com.google.android.gms.common.internal.zac.zaf(r5, r6)
            if (r5 == 0) goto L54
            r4.setTitle(r5)
        L54:
            java.lang.String r5 = "Creating dialog for Google Play services availability issue. ConnectionResult="
            java.lang.String r5 = defpackage.lb1.g(r6, r5)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            java.lang.String r7 = "GoogleApiAvailability"
            android.util.Log.w(r7, r5, r6)
            android.app.AlertDialog r4 = r4.create()
            return r4
    }

    public final android.app.Dialog zab(android.app.Activity r4, android.content.DialogInterface.OnCancelListener r5) {
            r3 = this;
            android.widget.ProgressBar r0 = new android.widget.ProgressBar
            r1 = 16842874(0x101007a, float:2.36939E-38)
            r2 = 0
            r0.<init>(r4, r2, r1)
            r1 = 1
            r0.setIndeterminate(r1)
            r1 = 0
            r0.setVisibility(r1)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r4)
            r1.setView(r0)
            r0 = 18
            java.lang.String r0 = com.google.android.gms.common.internal.zac.zac(r4, r0)
            r1.setMessage(r0)
            java.lang.String r0 = ""
            r1.setPositiveButton(r0, r2)
            android.app.AlertDialog r0 = r1.create()
            java.lang.String r1 = "GooglePlayServicesUpdatingDialog"
            r3.zad(r4, r0, r1, r5)
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final com.google.android.gms.common.api.internal.zabx zac(android.content.Context r5, com.google.android.gms.common.api.internal.zabw r6) {
            r4 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.PACKAGE_ADDED"
            r0.<init>(r1)
            java.lang.String r1 = "package"
            r0.addDataScheme(r1)
            com.google.android.gms.common.api.internal.zabx r1 = new com.google.android.gms.common.api.internal.zabx
            r1.<init>(r6)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 < r3) goto L20
            if (r2 < r3) goto L1b
            r2 = 2
            goto L1c
        L1b:
            r2 = 0
        L1c:
            defpackage.q66.e(r5, r1, r0, r2)
            goto L23
        L20:
            r5.registerReceiver(r1, r0)
        L23:
            r1.zaa(r5)
            java.lang.String r0 = "com.google.android.gms"
            boolean r4 = r4.isUninstalledAppPossiblyUpdating(r5, r0)
            if (r4 != 0) goto L36
            r6.zaa()
            r1.zab()
            r4 = 0
            return r4
        L36:
            return r1
    }

    public final void zad(android.app.Activity r1, android.app.Dialog r2, java.lang.String r3, android.content.DialogInterface.OnCancelListener r4) {
            r0 = this;
            boolean r0 = r1 instanceof androidx.fragment.app.p     // Catch: java.lang.NoClassDefFoundError -> L12
            if (r0 == 0) goto L12
            androidx.fragment.app.p r1 = (androidx.fragment.app.p) r1
            ll2 r0 = r1.t()
            com.google.android.gms.common.SupportErrorDialogFragment r1 = com.google.android.gms.common.SupportErrorDialogFragment.newInstance(r2, r4)
            r1.show(r0, r3)
            return
        L12:
            android.app.FragmentManager r0 = r1.getFragmentManager()
            com.google.android.gms.common.ErrorDialogFragment r1 = com.google.android.gms.common.ErrorDialogFragment.newInstance(r2, r4)
            r1.show(r0, r3)
            return
    }

    public final void zae(android.content.Context r10, int r11, java.lang.String r12, android.app.PendingIntent r13) {
            r9 = this;
            java.lang.String r12 = "GMS core API Availability. ConnectionResult="
            java.lang.String r0 = ", tag=null"
            java.lang.String r12 = defpackage.lb1.k(r12, r11, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            java.lang.String r1 = "GoogleApiAvailability"
            android.util.Log.w(r1, r12, r0)
            r12 = 18
            if (r11 != r12) goto L1a
            r9.zaf(r10)
            return
        L1a:
            if (r13 != 0) goto L27
            r9 = 6
            if (r11 != r9) goto L26
            java.lang.String r9 = "GoogleApiAvailability"
            java.lang.String r10 = "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead."
            android.util.Log.w(r9, r10)
        L26:
            return
        L27:
            java.lang.String r12 = com.google.android.gms.common.internal.zac.zae(r10, r11)
            java.lang.String r0 = com.google.android.gms.common.internal.zac.zad(r10, r11)
            android.content.res.Resources r1 = r10.getResources()
            java.lang.String r2 = "notification"
            java.lang.Object r2 = r10.getSystemService(r2)
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            xg4 r3 = new xg4
            r4 = 0
            r3.<init>(r10, r4)
            r4 = 1
            r3.o = r4
            r5 = 16
            r3.c(r5)
            java.lang.CharSequence r12 = defpackage.xg4.b(r12)
            r3.e = r12
            ap3 r12 = new ap3
            r5 = 8
            r6 = 0
            r12.<init>(r5, r6)
            java.lang.CharSequence r5 = defpackage.xg4.b(r0)
            r12.L = r5
            r3.d(r12)
            boolean r12 = com.google.android.gms.common.util.DeviceProperties.isWearable(r10)
            r5 = 2
            if (r12 == 0) goto L99
            boolean r12 = com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKatWatch()
            com.google.android.gms.common.internal.Preconditions.checkState(r12)
            android.content.pm.ApplicationInfo r12 = r10.getApplicationInfo()
            int r12 = r12.icon
            android.app.Notification r0 = r3.t
            r0.icon = r12
            r3.h = r5
            boolean r12 = com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(r10)
            if (r12 == 0) goto L96
            r12 = 2131951812(0x7f1300c4, float:1.954005E38)
            java.lang.String r12 = r1.getString(r12)
            java.util.ArrayList r0 = r3.b
            wg4 r1 = new wg4
            r1.<init>(r12, r13)
            r0.add(r1)
            goto Lbf
        L96:
            r3.g = r13
            goto Lbf
        L99:
            r12 = 17301642(0x108008a, float:2.4979642E-38)
            android.app.Notification r7 = r3.t
            r7.icon = r12
            r12 = 2131951804(0x7f1300bc, float:1.9540033E38)
            java.lang.String r12 = r1.getString(r12)
            android.app.Notification r1 = r3.t
            java.lang.CharSequence r12 = defpackage.xg4.b(r12)
            r1.tickerText = r12
            long r7 = java.lang.System.currentTimeMillis()
            android.app.Notification r12 = r3.t
            r12.when = r7
            r3.g = r13
            java.lang.CharSequence r12 = defpackage.xg4.b(r0)
            r3.f = r12
        Lbf:
            boolean r12 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            if (r12 != 0) goto Lc6
            goto L102
        Lc6:
            boolean r12 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            com.google.android.gms.common.internal.Preconditions.checkState(r12)
            java.lang.Object r12 = com.google.android.gms.common.GoogleApiAvailability.zaa
            monitor-enter(r12)
            java.lang.String r9 = r9.zac     // Catch: java.lang.Throwable -> L11c
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L11c
            if (r9 != 0) goto L100
            java.lang.String r9 = "com.google.android.gms.availability"
            android.app.NotificationChannel r12 = defpackage.wa2.f(r2)
            android.content.res.Resources r10 = r10.getResources()
            r13 = 2131951803(0x7f1300bb, float:1.954003E38)
            java.lang.String r10 = r10.getString(r13)
            if (r12 != 0) goto Lf0
            android.app.NotificationChannel r10 = defpackage.wa2.h(r10)
            defpackage.wa2.w(r2, r10)
            goto L100
        Lf0:
            java.lang.CharSequence r13 = defpackage.wa2.k(r12)
            boolean r13 = r10.contentEquals(r13)
            if (r13 != 0) goto L100
            defpackage.wa2.v(r12, r10)
            defpackage.wa2.w(r2, r12)
        L100:
            r3.r = r9
        L102:
            android.app.Notification r9 = r3.a()
            if (r11 == r4) goto L111
            if (r11 == r5) goto L111
            r10 = 3
            if (r11 == r10) goto L111
            r10 = 39789(0x9b6d, float:5.5756E-41)
            goto L118
        L111:
            java.util.concurrent.atomic.AtomicBoolean r10 = com.google.android.gms.common.GooglePlayServicesUtilLight.sCanceledAvailabilityNotification
            r10.set(r6)
            r10 = 10436(0x28c4, float:1.4624E-41)
        L118:
            r2.notify(r10, r9)
            return
        L11c:
            r9 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L11c
            throw r9
    }

    public final void zaf(android.content.Context r4) {
            r3 = this;
            com.google.android.gms.common.zad r0 = new com.google.android.gms.common.zad
            r0.<init>(r3, r4)
            r3 = 1
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            r0.sendEmptyMessageDelayed(r3, r1)
            return
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean zag(android.app.Activity r8, com.google.android.gms.common.api.internal.LifecycleFragment r9, int r10, int r11, android.content.DialogInterface.OnCancelListener r12) {
            r7 = this;
            java.lang.String r11 = "d"
            android.content.Intent r11 = r7.getErrorResolutionIntent(r8, r10, r11)
            r0 = 2
            com.google.android.gms.common.internal.zag r4 = com.google.android.gms.common.internal.zag.zad(r9, r11, r0)
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r10
            r5 = r12
            android.app.Dialog r7 = r1.zaa(r2, r3, r4, r5, r6)
            if (r7 != 0) goto L18
            r7 = 0
            return r7
        L18:
            java.lang.String r8 = "GooglePlayServicesErrorDialog"
            r1.zad(r2, r7, r8, r5)
            r7 = 1
            return r7
    }

    public final boolean zah(android.content.Context r5, com.google.android.gms.common.ConnectionResult r6, int r7) {
            r4 = this;
            boolean r0 = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(r5)
            r1 = 0
            if (r0 == 0) goto L8
            goto L25
        L8:
            android.app.PendingIntent r0 = r4.getErrorResolutionPendingIntent(r5, r6)
            if (r0 == 0) goto L25
            int r6 = r6.getErrorCode()
            r2 = 1
            android.content.Intent r7 = com.google.android.gms.common.api.GoogleApiActivity.zaa(r5, r0, r7, r2)
            int r0 = defpackage.a08.a
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 | r3
            android.app.PendingIntent r7 = android.app.PendingIntent.getActivity(r5, r1, r7, r0)
            r0 = 0
            r4.zae(r5, r6, r0, r7)
            return r2
        L25:
            return r1
    }
}
