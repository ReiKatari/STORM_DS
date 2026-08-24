package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzi {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.String[] zzb = null;
    private static final java.lang.String[] zzc = null;
    private static final java.lang.String[] zzd = null;

    static {
            java.lang.String r4 = "com.waymo."
            java.lang.String r5 = "com.waze"
            java.lang.String r0 = "com.android."
            java.lang.String r1 = "com.google."
            java.lang.String r2 = "com.chrome."
            java.lang.String r3 = "com.nest."
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            com.google.android.gms.internal.mlkit_common.zzi.zzb = r0
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "goldfish"
            boolean r1 = r0.equals(r1)
            java.lang.String r2 = ""
            if (r1 != 0) goto L29
            java.lang.String r1 = "ranchu"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L27
            goto L29
        L27:
            r0 = r2
            goto L2b
        L29:
            java.lang.String r0 = "androidx.test.services.storage.runfiles"
        L2b:
            java.lang.String r1 = "media"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            com.google.android.gms.internal.mlkit_common.zzi.zzc = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 > r1) goto L3c
            java.lang.String r3 = "com.google.android.inputmethod.latin.inputcontent"
            goto L3d
        L3c:
            r3 = r2
        L3d:
            if (r0 > r1) goto L41
            java.lang.String r2 = "com.google.android.inputmethod.latin.dev.inputcontent"
        L41:
            java.lang.String r0 = "com.google.android.apps.docs.storage.legacy"
            java.lang.String[] r0 = new java.lang.String[]{r3, r2, r0}
            com.google.android.gms.internal.mlkit_common.zzi.zzd = r0
            return
    }

    public static android.content.res.AssetFileDescriptor zza(android.content.Context r4, android.net.Uri r5, java.lang.String r6) {
            com.google.android.gms.internal.mlkit_common.zzh r6 = com.google.android.gms.internal.mlkit_common.zzh.zza
            android.content.ContentResolver r0 = r4.getContentResolver()
            android.net.Uri r5 = zzc(r5)
            java.lang.String r1 = r5.getScheme()
            java.lang.String r2 = "android.resource"
            boolean r2 = r2.equals(r1)
            java.lang.String r3 = "r"
            if (r2 == 0) goto L1d
            android.content.res.AssetFileDescriptor r4 = r0.openAssetFileDescriptor(r5, r3)
            return r4
        L1d:
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L3c
            r1 = 1
            boolean r4 = zzj(r4, r5, r1, r6)
            if (r4 == 0) goto L34
            android.content.res.AssetFileDescriptor r4 = r0.openAssetFileDescriptor(r5, r3)
            zzd(r4)
            return r4
        L34:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "Can't open content uri."
            r4.<init>(r5)
            throw r4
        L3c:
            java.lang.String r2 = "file"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L69
            android.content.res.AssetFileDescriptor r0 = r0.openAssetFileDescriptor(r5, r3)
            zzd(r0)
            android.os.ParcelFileDescriptor r1 = r0.getParcelFileDescriptor()     // Catch: java.io.IOException -> L53 java.io.FileNotFoundException -> L55
            zzi(r4, r1, r5, r6)     // Catch: java.io.IOException -> L53 java.io.FileNotFoundException -> L55
            return r0
        L53:
            r4 = move-exception
            goto L57
        L55:
            r4 = move-exception
            goto L65
        L57:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r6 = "Validation failed."
            r5.<init>(r6)
            r5.initCause(r4)
            zzg(r0, r5)
            throw r5
        L65:
            zzg(r0, r4)
            throw r4
        L69:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "Unsupported scheme"
            r4.<init>(r5)
            throw r4
    }

    public static java.io.InputStream zzb(android.content.Context r3, android.net.Uri r4, com.google.android.gms.internal.mlkit_common.zzh r5) {
            android.content.ContentResolver r0 = r3.getContentResolver()
            android.net.Uri r4 = zzc(r4)
            java.lang.String r1 = r4.getScheme()
            java.lang.String r2 = "android.resource"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L19
            java.io.InputStream r3 = r0.openInputStream(r4)
            return r3
        L19:
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L38
            r1 = 1
            boolean r3 = zzj(r3, r4, r1, r5)
            if (r3 == 0) goto L30
            java.io.InputStream r3 = r0.openInputStream(r4)
            zzd(r3)
            return r3
        L30:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.String r4 = "Can't open content uri."
            r3.<init>(r4)
            throw r3
        L38:
            java.lang.String r2 = "file"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L82
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r4.getPath()
            r1.<init>(r2)
            java.io.File r1 = r1.getCanonicalFile()     // Catch: java.io.IOException -> L76
            android.net.Uri r1 = android.net.Uri.fromFile(r1)
            java.lang.String r2 = "r"
            android.os.ParcelFileDescriptor r0 = r0.openFileDescriptor(r1, r2)
            zzi(r3, r0, r4, r5)     // Catch: java.io.IOException -> L60 java.io.FileNotFoundException -> L62
            android.os.ParcelFileDescriptor$AutoCloseInputStream r3 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch: java.io.IOException -> L60 java.io.FileNotFoundException -> L62
            r3.<init>(r0)     // Catch: java.io.IOException -> L60 java.io.FileNotFoundException -> L62
            return r3
        L60:
            r3 = move-exception
            goto L64
        L62:
            r3 = move-exception
            goto L72
        L64:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "Validation failed."
            r4.<init>(r5)
            r4.initCause(r3)
            zzh(r0, r4)
            throw r4
        L72:
            zzh(r0, r3)
            throw r3
        L76:
            r3 = move-exception
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "Canonicalization failed."
            r4.<init>(r5)
            r4.initCause(r3)
            throw r4
        L82:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.String r4 = "Unsupported scheme"
            r3.<init>(r4)
            throw r3
    }

    private static android.net.Uri zzc(android.net.Uri r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto Le
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
        Le:
            return r2
    }

    private static java.lang.Object zzd(java.lang.Object r1) {
            if (r1 == 0) goto L3
            return r1
        L3:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.String r0 = "Content resolver returned null value."
            r1.<init>(r0)
            throw r1
    }

    private static java.lang.String zze(java.io.File r2) {
            java.lang.String r2 = r2.getCanonicalPath()
            java.lang.String r0 = "/"
            boolean r1 = r2.endsWith(r0)
            if (r1 != 0) goto L10
            java.lang.String r2 = r2.concat(r0)
        L10:
            return r2
    }

    private static void zzf(android.os.ParcelFileDescriptor r7, java.lang.String r8) {
            java.io.FileDescriptor r7 = r7.getFileDescriptor()     // Catch: android.system.ErrnoException -> L4a
            android.system.StructStat r7 = android.system.Os.fstat(r7)     // Catch: android.system.ErrnoException -> L4a
            android.system.StructStat r0 = android.system.Os.lstat(r8)     // Catch: android.system.ErrnoException -> L43
            int r1 = r0.st_mode
            boolean r1 = android.system.OsConstants.S_ISLNK(r1)
            java.lang.String r2 = "Can't open file: "
            if (r1 != 0) goto L35
            long r3 = r7.st_dev
            long r5 = r0.st_dev
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L27
            long r3 = r7.st_ino
            long r0 = r0.st_ino
            int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r7 != 0) goto L27
            return
        L27:
            java.lang.String r7 = java.lang.String.valueOf(r8)
            java.io.FileNotFoundException r8 = new java.io.FileNotFoundException
            java.lang.String r7 = r2.concat(r7)
            r8.<init>(r7)
            throw r8
        L35:
            java.lang.String r7 = java.lang.String.valueOf(r8)
            java.io.FileNotFoundException r8 = new java.io.FileNotFoundException
            java.lang.String r7 = r2.concat(r7)
            r8.<init>(r7)
            throw r8
        L43:
            r7 = move-exception
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r7)
            throw r8
        L4a:
            r7 = move-exception
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r7)
            throw r8
    }

    private static void zzg(android.content.res.AssetFileDescriptor r0, java.io.FileNotFoundException r1) {
            r0.close()     // Catch: java.io.IOException -> L4
            return
        L4:
            r0 = move-exception
            r1.addSuppressed(r0)
            return
    }

    private static void zzh(android.os.ParcelFileDescriptor r0, java.io.FileNotFoundException r1) {
            r0.close()     // Catch: java.io.IOException -> L4
            return
        L4:
            r0 = move-exception
            r1.addSuppressed(r0)
            return
    }

    private static void zzi(android.content.Context r5, android.os.ParcelFileDescriptor r6, android.net.Uri r7, com.google.android.gms.internal.mlkit_common.zzh r8) {
            java.io.File r0 = new java.io.File
            java.lang.String r7 = r7.getPath()
            r0.<init>(r7)
            java.lang.String r7 = r0.getCanonicalPath()
            zzf(r6, r7)
            java.lang.String r6 = "/proc/"
            boolean r6 = r7.startsWith(r6)
            if (r6 != 0) goto La3
            java.lang.String r6 = "/data/misc/"
            boolean r6 = r7.startsWith(r6)
            if (r6 != 0) goto La3
            com.google.android.gms.internal.mlkit_common.zzh.zza(r8)
            java.io.File r6 = r5.getDataDir()
            r0 = 1
            if (r6 == 0) goto L36
            java.lang.String r6 = zze(r6)
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto L45
            goto L9c
        L36:
            java.io.File r6 = android.os.Environment.getDataDirectory()
            java.lang.String r6 = zze(r6)
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto L45
            goto L9c
        L45:
            android.content.Context r6 = r5.createDeviceProtectedStorageContext()
            if (r6 == 0) goto L5c
            java.io.File r6 = r6.getDataDir()
            if (r6 == 0) goto L5c
            java.lang.String r6 = zze(r6)
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto L5c
            goto L9c
        L5c:
            com.google.android.gms.internal.mlkit_common.zzb r6 = new com.google.android.gms.internal.mlkit_common.zzb
            r6.<init>(r5)
            java.io.File[] r6 = zzk(r6)
            int r1 = r6.length
            r2 = 0
            r3 = r2
        L68:
            if (r3 >= r1) goto L7c
            r4 = r6[r3]
            if (r4 == 0) goto L79
            java.lang.String r4 = zze(r4)
            boolean r4 = r7.startsWith(r4)
            if (r4 == 0) goto L79
            goto L9c
        L79:
            int r3 = r3 + 1
            goto L68
        L7c:
            com.google.android.gms.internal.mlkit_common.zzc r6 = new com.google.android.gms.internal.mlkit_common.zzc
            r6.<init>(r5)
            java.io.File[] r5 = zzk(r6)
            int r6 = r5.length
            r1 = r2
        L87:
            if (r1 >= r6) goto L9b
            r3 = r5[r1]
            if (r3 == 0) goto L98
            java.lang.String r3 = zze(r3)
            boolean r3 = r7.startsWith(r3)
            if (r3 == 0) goto L98
            goto L9c
        L98:
            int r1 = r1 + 1
            goto L87
        L9b:
            r0 = r2
        L9c:
            boolean r5 = com.google.android.gms.internal.mlkit_common.zzh.zzb(r8)
            if (r0 != r5) goto La3
            return
        La3:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r6 = "Can't open file: "
            java.lang.String r6 = r6.concat(r7)
            r5.<init>(r6)
            throw r5
    }

    private static boolean zzj(android.content.Context r5, android.net.Uri r6, int r7, com.google.android.gms.internal.mlkit_common.zzh r8) {
            java.lang.String r7 = r6.getAuthority()
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r1 = 0
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r7, r1)
            r2 = 1
            if (r0 != 0) goto L2f
            r3 = 64
            int r3 = r7.lastIndexOf(r3)
            if (r3 < 0) goto L25
            int r3 = r3 + r2
            java.lang.String r7 = r7.substring(r3)
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r7, r1)
        L25:
            if (r0 != 0) goto L2f
            boolean r5 = com.google.android.gms.internal.mlkit_common.zzh.zzb(r8)
            if (r5 != 0) goto L2e
            return r2
        L2e:
            return r1
        L2f:
            com.google.android.gms.internal.mlkit_common.zzj r3 = new com.google.android.gms.internal.mlkit_common.zzj
            r3.<init>(r6, r0, r7)
            int r3 = com.google.android.gms.internal.mlkit_common.zzh.zzc(r8, r5, r3)
            int r3 = r3 + (-1)
            if (r3 == r2) goto Lb8
            java.lang.String r3 = r5.getPackageName()
            java.lang.String r4 = r0.packageName
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4d
            boolean r5 = com.google.android.gms.internal.mlkit_common.zzh.zzb(r8)
            return r5
        L4d:
            boolean r8 = com.google.android.gms.internal.mlkit_common.zzh.zzb(r8)
            if (r8 == 0) goto L54
            return r1
        L54:
            int r8 = android.os.Process.myPid()
            int r3 = android.os.Process.myUid()
            int r5 = r5.checkUriPermission(r6, r8, r3, r2)
            if (r5 != 0) goto L63
            return r2
        L63:
            boolean r5 = r0.exported
            if (r5 == 0) goto Lb7
            java.lang.String[] r5 = com.google.android.gms.internal.mlkit_common.zzi.zzc
            int r6 = r5.length
            r6 = r1
        L6b:
            r8 = 2
            if (r6 >= r8) goto L7a
            r8 = r5[r6]
            boolean r8 = r8.equals(r7)
            if (r8 == 0) goto L77
            return r2
        L77:
            int r6 = r6 + 1
            goto L6b
        L7a:
            java.lang.String[] r5 = com.google.android.gms.internal.mlkit_common.zzi.zzd
            int r6 = r5.length
            r6 = r1
        L7e:
            r8 = 3
            if (r6 >= r8) goto L8d
            r8 = r5[r6]
            boolean r8 = r8.equals(r7)
            if (r8 == 0) goto L8a
            return r2
        L8a:
            int r6 = r6 + 1
            goto L7e
        L8d:
            java.lang.String[] r5 = com.google.android.gms.internal.mlkit_common.zzi.zzb
            r6 = r1
        L90:
            r7 = 6
            if (r6 >= r7) goto Lb7
            r7 = r5[r6]
            int r8 = r7.length()
            int r8 = r8 + (-1)
            char r8 = r7.charAt(r8)
            java.lang.String r3 = r0.packageName
            r4 = 46
            if (r8 != r4) goto Lad
            boolean r7 = r3.startsWith(r7)
            if (r7 != 0) goto Lac
            goto Lb4
        Lac:
            return r1
        Lad:
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto Lb4
            return r1
        Lb4:
            int r6 = r6 + 1
            goto L90
        Lb7:
            return r2
        Lb8:
            return r1
    }

    private static java.io.File[] zzk(java.util.concurrent.Callable r1) {
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Exception -> L7 java.lang.NullPointerException -> Le
            java.io.File[] r1 = (java.io.File[]) r1     // Catch: java.lang.Exception -> L7 java.lang.NullPointerException -> Le
            return r1
        L7:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        Le:
            r1 = move-exception
            throw r1
    }
}
