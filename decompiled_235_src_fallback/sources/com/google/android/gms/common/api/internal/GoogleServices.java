package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class GoogleServices {
    private static final java.lang.Object zza = null;
    private static com.google.android.gms.common.api.internal.GoogleServices zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.common.api.Status zzd;
    private final boolean zze;
    private final boolean zzf;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.api.internal.GoogleServices.zza = r0
            return
    }

    public GoogleServices(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            android.content.res.Resources r0 = r5.getResources()
            int r1 = com.google.android.gms.common.R.string.common_google_play_services_unknown_issue
            java.lang.String r1 = r0.getResourcePackageName(r1)
            java.lang.String r2 = "google_app_measurement_enable"
            java.lang.String r3 = "integer"
            int r1 = r0.getIdentifier(r2, r3, r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L29
            int r0 = r0.getInteger(r1)
            if (r0 == 0) goto L21
            r1 = r3
            goto L22
        L21:
            r1 = r2
        L22:
            if (r0 == 0) goto L25
            goto L26
        L25:
            r2 = r3
        L26:
            r4.zzf = r1
            goto L2b
        L29:
            r4.zzf = r3
        L2b:
            r4.zze = r2
            java.lang.String r0 = com.google.android.gms.common.internal.zzah.zzb(r5)
            if (r0 != 0) goto L3e
            com.google.android.gms.common.internal.StringResourceValueReader r0 = new com.google.android.gms.common.internal.StringResourceValueReader
            r0.<init>(r5)
            java.lang.String r5 = "google_app_id"
            java.lang.String r0 = r0.getString(r5)
        L3e:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L53
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status
            r0 = 10
            java.lang.String r1 = "Missing google app id value from from string resources with name google_app_id."
            r5.<init>(r0, r1)
            r4.zzd = r5
            r5 = 0
            r4.zzc = r5
            return
        L53:
            r4.zzc = r0
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r4.zzd = r5
            return
    }

    public GoogleServices(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r0.zzd = r1
            r0.zze = r2
            r1 = r2 ^ 1
            r0.zzf = r1
            return
    }

    private static com.google.android.gms.common.api.internal.GoogleServices checkInitialized(java.lang.String r4) {
            java.lang.String r0 = "Initialize must be called before "
            java.lang.Object r1 = com.google.android.gms.common.api.internal.GoogleServices.zza
            monitor-enter(r1)
            com.google.android.gms.common.api.internal.GoogleServices r2 = com.google.android.gms.common.api.internal.GoogleServices.zzb     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            r4 = move-exception
            goto L24
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lb
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r4 = "."
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> Lb
            r2.<init>(r4)     // Catch: java.lang.Throwable -> Lb
            throw r2     // Catch: java.lang.Throwable -> Lb
        L24:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r4
    }

    public static void clearInstanceForTest() {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleServices.zza
            monitor-enter(r0)
            r1 = 0
            com.google.android.gms.common.api.internal.GoogleServices.zzb = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    public static java.lang.String getGoogleAppId() {
            java.lang.String r0 = "getGoogleAppId"
            com.google.android.gms.common.api.internal.GoogleServices r0 = checkInitialized(r0)
            java.lang.String r0 = r0.zzc
            return r0
    }

    public static com.google.android.gms.common.api.Status initialize(android.content.Context r2) {
            java.lang.String r0 = "Context must not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleServices.zza
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleServices r1 = com.google.android.gms.common.api.internal.GoogleServices.zzb     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            com.google.android.gms.common.api.internal.GoogleServices r1 = new com.google.android.gms.common.api.internal.GoogleServices     // Catch: java.lang.Throwable -> L14
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L14
            com.google.android.gms.common.api.internal.GoogleServices.zzb = r1     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r2 = move-exception
            goto L1c
        L16:
            com.google.android.gms.common.api.internal.GoogleServices r2 = com.google.android.gms.common.api.internal.GoogleServices.zzb     // Catch: java.lang.Throwable -> L14
            com.google.android.gms.common.api.Status r2 = r2.zzd     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r2
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static com.google.android.gms.common.api.Status initialize(android.content.Context r1, java.lang.String r2, boolean r3) {
            java.lang.String r0 = "Context must not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r1 = "App ID must be nonempty."
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2, r1)
            java.lang.Object r1 = com.google.android.gms.common.api.internal.GoogleServices.zza
            monitor-enter(r1)
            com.google.android.gms.common.api.internal.GoogleServices r0 = com.google.android.gms.common.api.internal.GoogleServices.zzb     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            com.google.android.gms.common.api.Status r2 = r0.checkGoogleAppId(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return r2
        L17:
            r2 = move-exception
            goto L24
        L19:
            com.google.android.gms.common.api.internal.GoogleServices r0 = new com.google.android.gms.common.api.internal.GoogleServices     // Catch: java.lang.Throwable -> L17
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.common.api.internal.GoogleServices.zzb = r0     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.common.api.Status r2 = r0.zzd     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return r2
        L24:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    public static boolean isMeasurementEnabled() {
            java.lang.String r0 = "isMeasurementEnabled"
            com.google.android.gms.common.api.internal.GoogleServices r0 = checkInitialized(r0)
            com.google.android.gms.common.api.Status r1 = r0.zzd
            boolean r1 = r1.isSuccess()
            if (r1 == 0) goto L14
            boolean r0 = r0.zze
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public static boolean isMeasurementExplicitlyDisabled() {
            java.lang.String r0 = "isMeasurementExplicitlyDisabled"
            com.google.android.gms.common.api.internal.GoogleServices r0 = checkInitialized(r0)
            boolean r0 = r0.zzf
            return r0
    }

    public com.google.android.gms.common.api.Status checkGoogleAppId(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.zzc
            if (r0 == 0) goto L1c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L1c
            java.lang.String r2 = r2.zzc
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status
            java.lang.String r0 = "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '"
            java.lang.String r1 = "'."
            java.lang.String r2 = defpackage.lb1.A(r0, r2, r1)
            r0 = 10
            r3.<init>(r0, r2)
            return r3
        L1c:
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            return r2
    }
}
