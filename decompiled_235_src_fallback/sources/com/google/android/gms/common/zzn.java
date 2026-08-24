package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzn {
    static final com.google.android.gms.common.zzl zza = null;
    static final com.google.android.gms.common.zzl zzb = null;
    static final com.google.android.gms.common.zzl zzc = null;
    static final com.google.android.gms.common.zzl zzd = null;
    private static volatile com.google.android.gms.common.internal.zzag zze;
    private static final java.lang.Object zzf = null;
    private static android.content.Context zzg;

    static {
            com.google.android.gms.common.zzf r0 = new com.google.android.gms.common.zzf
            java.lang.String r1 = "0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"
            byte[] r1 = com.google.android.gms.common.zzj.zze(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzn.zza = r0
            com.google.android.gms.common.zzg r0 = new com.google.android.gms.common.zzg
            java.lang.String r1 = "0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"
            byte[] r1 = com.google.android.gms.common.zzj.zze(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzn.zzb = r0
            com.google.android.gms.common.zzh r0 = new com.google.android.gms.common.zzh
            java.lang.String r1 = "0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"
            byte[] r1 = com.google.android.gms.common.zzj.zze(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzn.zzc = r0
            com.google.android.gms.common.zzi r0 = new com.google.android.gms.common.zzi
            java.lang.String r1 = "0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"
            byte[] r1 = com.google.android.gms.common.zzj.zze(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzn.zzd = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.zzn.zzf = r0
            return
    }

    public static com.google.android.gms.common.zzx zza(java.lang.String r1, com.google.android.gms.common.zzj r2, boolean r3, boolean r4) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            com.google.android.gms.common.zzx r1 = zzh(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        Lc:
            r1 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
    }

    public static com.google.android.gms.common.zzx zzb(java.lang.String r0, boolean r1, boolean r2, boolean r3) {
            r2 = 0
            r3 = 1
            com.google.android.gms.common.zzx r0 = zzi(r0, r1, r2, r2, r3)
            return r0
    }

    public static com.google.android.gms.common.zzx zzc(java.lang.String r0, boolean r1, boolean r2, boolean r3) {
            r2 = 0
            com.google.android.gms.common.zzx r0 = zzi(r0, r1, r2, r2, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String zzd(boolean r2, java.lang.String r3, com.google.android.gms.common.zzj r4) {
            if (r2 != 0) goto Lf
            r0 = 1
            r1 = 0
            com.google.android.gms.common.zzx r0 = zzh(r3, r4, r0, r1)
            boolean r0 = r0.zza
            if (r0 == 0) goto Lf
            java.lang.String r0 = "debug cert rejected"
            goto L11
        Lf:
            java.lang.String r0 = "not allowed"
        L11:
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = com.google.android.gms.common.util.AndroidUtilsLight.zza(r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            byte[] r4 = r4.zzf()
            byte[] r4 = r1.digest(r4)
            java.lang.String r4 = com.google.android.gms.common.util.Hex.bytesToStringLowercase(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ": pkg="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = ", sha256="
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ", atk="
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = ", ver=12451000.false"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            return r2
    }

    public static synchronized void zze(android.content.Context r2) {
            java.lang.Class<com.google.android.gms.common.zzn> r0 = com.google.android.gms.common.zzn.class
            monitor-enter(r0)
            android.content.Context r1 = com.google.android.gms.common.zzn.zzg     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L15
            if (r2 == 0) goto L13
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.common.zzn.zzg = r2     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L11:
            r2 = move-exception
            goto L1e
        L13:
            monitor-exit(r0)
            return
        L15:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    public static boolean zzf() {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            zzj()     // Catch: java.lang.Throwable -> Le android.os.RemoteException -> L10 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L12
            com.google.android.gms.common.internal.zzag r1 = com.google.android.gms.common.zzn.zze     // Catch: java.lang.Throwable -> Le android.os.RemoteException -> L10 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L12
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> Le android.os.RemoteException -> L10 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L12
            goto L1b
        Le:
            r1 = move-exception
            goto L1f
        L10:
            r1 = move-exception
            goto L13
        L12:
            r1 = move-exception
        L13:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r3 = "Failed to get Google certificates from remote"
            android.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> Le
            r1 = 0
        L1b:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L1f:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
    }

    public static boolean zzg() {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            zzj()     // Catch: java.lang.Throwable -> Le android.os.RemoteException -> L10 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L12
            com.google.android.gms.common.internal.zzag r1 = com.google.android.gms.common.zzn.zze     // Catch: java.lang.Throwable -> Le android.os.RemoteException -> L10 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L12
            boolean r1 = r1.zzi()     // Catch: java.lang.Throwable -> Le android.os.RemoteException -> L10 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L12
            goto L1b
        Le:
            r1 = move-exception
            goto L1f
        L10:
            r1 = move-exception
            goto L13
        L12:
            r1 = move-exception
        L13:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r3 = "Failed to get Google certificates from remote"
            android.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> Le
            r1 = 0
        L1b:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L1f:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
    }

    private static com.google.android.gms.common.zzx zzh(java.lang.String r5, com.google.android.gms.common.zzj r6, boolean r7, boolean r8) {
            java.lang.String r0 = "Failed to get Google certificates from remote"
            java.lang.String r1 = "GoogleCertificates"
            zzj()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L40
            android.content.Context r2 = com.google.android.gms.common.zzn.zzg
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.zzs r2 = new com.google.android.gms.common.zzs
            r2.<init>(r5, r6, r7, r8)
            com.google.android.gms.common.internal.zzag r8 = com.google.android.gms.common.zzn.zze     // Catch: android.os.RemoteException -> L35
            android.content.Context r3 = com.google.android.gms.common.zzn.zzg     // Catch: android.os.RemoteException -> L35
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.os.RemoteException -> L35
            zh4 r4 = new zh4     // Catch: android.os.RemoteException -> L35
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L35
            boolean r8 = r8.zzh(r2, r4)     // Catch: android.os.RemoteException -> L35
            if (r8 == 0) goto L29
            com.google.android.gms.common.zzx r5 = com.google.android.gms.common.zzx.zzb()
            return r5
        L29:
            com.google.android.gms.common.zze r8 = new com.google.android.gms.common.zze
            r8.<init>(r7, r5, r6)
            com.google.android.gms.common.zzv r5 = new com.google.android.gms.common.zzv
            r6 = 0
            r5.<init>(r8, r6)
            return r5
        L35:
            r5 = move-exception
            android.util.Log.e(r1, r0, r5)
            java.lang.String r6 = "module call"
            com.google.android.gms.common.zzx r5 = com.google.android.gms.common.zzx.zzd(r6, r5)
            return r5
        L40:
            r5 = move-exception
            android.util.Log.e(r1, r0, r5)
            java.lang.String r6 = r5.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "module init: "
            java.lang.String r6 = r7.concat(r6)
            com.google.android.gms.common.zzx r5 = com.google.android.gms.common.zzx.zzd(r6, r5)
            return r5
    }

    private static com.google.android.gms.common.zzx zzi(java.lang.String r9, boolean r10, boolean r11, boolean r12, boolean r13) {
            java.lang.String r11 = "Failed to get Google certificates from remote"
            java.lang.String r12 = "GoogleCertificates"
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()
            android.content.Context r0 = com.google.android.gms.common.zzn.zzg     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L2a
            zzj()     // Catch: java.lang.Throwable -> L2a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L73
            com.google.android.gms.common.zzo r2 = new com.google.android.gms.common.zzo     // Catch: java.lang.Throwable -> L2a
            android.content.Context r0 = com.google.android.gms.common.zzn.zzg     // Catch: java.lang.Throwable -> L2a
            zh4 r6 = new zh4     // Catch: java.lang.Throwable -> L2a
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            r7 = 0
            r8 = 1
            r5 = 0
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2a
            if (r13 == 0) goto L30
            com.google.android.gms.common.internal.zzag r9 = com.google.android.gms.common.zzn.zze     // Catch: java.lang.Throwable -> L2a android.os.RemoteException -> L2d
            com.google.android.gms.common.zzq r9 = r9.zze(r2)     // Catch: java.lang.Throwable -> L2a android.os.RemoteException -> L2d
            goto L36
        L2a:
            r0 = move-exception
            r9 = r0
            goto L8e
        L2d:
            r0 = move-exception
            r9 = r0
            goto L69
        L30:
            com.google.android.gms.common.internal.zzag r9 = com.google.android.gms.common.zzn.zze     // Catch: java.lang.Throwable -> L2a android.os.RemoteException -> L2d
            com.google.android.gms.common.zzq r9 = r9.zzf(r2)     // Catch: java.lang.Throwable -> L2a android.os.RemoteException -> L2d
        L36:
            boolean r10 = r9.zzb()     // Catch: java.lang.Throwable -> L2a
            if (r10 == 0) goto L45
            int r9 = r9.zzc()     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.common.zzx r9 = com.google.android.gms.common.zzx.zzf(r9)     // Catch: java.lang.Throwable -> L2a
            goto L8a
        L45:
            java.lang.String r10 = r9.zza()     // Catch: java.lang.Throwable -> L2a
            int r11 = r9.zzd()     // Catch: java.lang.Throwable -> L2a
            r12 = 4
            if (r11 != r12) goto L56
            android.content.pm.PackageManager$NameNotFoundException r11 = new android.content.pm.PackageManager$NameNotFoundException     // Catch: java.lang.Throwable -> L2a
            r11.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L57
        L56:
            r11 = 0
        L57:
            java.lang.String r12 = "error checking package certificate"
            if (r10 != 0) goto L5c
            r10 = r12
        L5c:
            int r12 = r9.zzc()     // Catch: java.lang.Throwable -> L2a
            int r9 = r9.zzd()     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.common.zzx r9 = com.google.android.gms.common.zzx.zzg(r12, r9, r10, r11)     // Catch: java.lang.Throwable -> L2a
            goto L8a
        L69:
            android.util.Log.e(r12, r11, r9)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r10 = "module call"
            com.google.android.gms.common.zzx r9 = com.google.android.gms.common.zzx.zzd(r10, r9)     // Catch: java.lang.Throwable -> L2a
            goto L8a
        L73:
            r0 = move-exception
            r9 = r0
            android.util.Log.e(r12, r11, r9)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r10 = r9.getMessage()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r11 = "module init: "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r10 = r11.concat(r10)     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.common.zzx r9 = com.google.android.gms.common.zzx.zzd(r10, r9)     // Catch: java.lang.Throwable -> L2a
        L8a:
            android.os.StrictMode.setThreadPolicy(r1)
            return r9
        L8e:
            android.os.StrictMode.setThreadPolicy(r1)
            throw r9
    }

    private static void zzj() {
            com.google.android.gms.common.internal.zzag r0 = com.google.android.gms.common.zzn.zze
            if (r0 == 0) goto L5
            return
        L5:
            android.content.Context r0 = com.google.android.gms.common.zzn.zzg
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.Object r0 = com.google.android.gms.common.zzn.zzf
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzag r1 = com.google.android.gms.common.zzn.zze     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L2a
            android.content.Context r1 = com.google.android.gms.common.zzn.zzg     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r2 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "com.google.android.gms.googlecertificates"
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.load(r1, r2, r3)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "com.google.android.gms.common.GoogleCertificatesImpl"
            android.os.IBinder r1 = r1.instantiate(r2)     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.common.internal.zzag r1 = com.google.android.gms.common.internal.zzaf.zzb(r1)     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.common.zzn.zze = r1     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r1 = move-exception
            goto L2c
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r1
    }
}
