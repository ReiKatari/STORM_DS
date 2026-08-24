package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@com.google.errorprone.annotations.RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public class GoogleSignatureVerifier {
    private static com.google.android.gms.common.GoogleSignatureVerifier zza;
    private static volatile java.util.Set zzb;
    private final android.content.Context zzc;
    private volatile java.lang.String zzd;

    public GoogleSignatureVerifier(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.zzc = r1
            return
    }

    public static com.google.android.gms.common.GoogleSignatureVerifier getInstance(android.content.Context r2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.Class<com.google.android.gms.common.GoogleSignatureVerifier> r0 = com.google.android.gms.common.GoogleSignatureVerifier.class
            monitor-enter(r0)
            com.google.android.gms.common.GoogleSignatureVerifier r1 = com.google.android.gms.common.GoogleSignatureVerifier.zza     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            com.google.android.gms.common.zzn.zze(r2)     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.common.GoogleSignatureVerifier r1 = new com.google.android.gms.common.GoogleSignatureVerifier     // Catch: java.lang.Throwable -> L15
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.common.GoogleSignatureVerifier.zza = r1     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r2 = move-exception
            goto L1b
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.common.GoogleSignatureVerifier r2 = com.google.android.gms.common.GoogleSignatureVerifier.zza
            return r2
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r2
    }

    public static final com.google.android.gms.common.zzj zza(android.content.pm.PackageInfo r3, com.google.android.gms.common.zzj... r4) {
            android.content.pm.Signature[] r0 = r3.signatures
            r1 = 0
            if (r0 != 0) goto L6
            goto L31
        L6:
            int r0 = r0.length
            r2 = 1
            if (r0 == r2) goto L12
            java.lang.String r3 = "GoogleSignatureVerifier"
            java.lang.String r4 = "Package has more than one signature."
            android.util.Log.w(r3, r4)
            return r1
        L12:
            com.google.android.gms.common.zzk r0 = new com.google.android.gms.common.zzk
            android.content.pm.Signature[] r3 = r3.signatures
            r2 = 0
            r3 = r3[r2]
            byte[] r3 = r3.toByteArray()
            r0.<init>(r3)
        L20:
            int r3 = r4.length
            if (r2 >= r3) goto L31
            r3 = r4[r2]
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2e
            r3 = r4[r2]
            return r3
        L2e:
            int r2 = r2 + 1
            goto L20
        L31:
            return r1
    }

    public static final boolean zzb(android.content.pm.PackageInfo r4, boolean r5) {
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L27
            if (r4 == 0) goto L29
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L27
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = r1
            goto L27
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = r0
        L27:
            r2 = r4
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r4 == 0) goto L48
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L48
            if (r5 == 0) goto L39
            com.google.android.gms.common.zzj[] r4 = com.google.android.gms.common.zzm.zza
            com.google.android.gms.common.zzj r4 = zza(r2, r4)
            goto L45
        L39:
            com.google.android.gms.common.zzj[] r4 = com.google.android.gms.common.zzm.zza
            r4 = r4[r1]
            com.google.android.gms.common.zzj[] r4 = new com.google.android.gms.common.zzj[]{r4}
            com.google.android.gms.common.zzj r4 = zza(r2, r4)
        L45:
            if (r4 == 0) goto L48
            return r0
        L48:
            return r1
    }

    private final com.google.android.gms.common.zzx zzc(java.lang.String r6, boolean r7, boolean r8) {
            r5 = this;
            java.lang.String r7 = "null pkg"
            if (r6 != 0) goto L9
            com.google.android.gms.common.zzx r5 = com.google.android.gms.common.zzx.zzc(r7)
            return r5
        L9:
            java.lang.String r8 = r5.zzd
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L8e
            boolean r8 = com.google.android.gms.common.zzn.zzg()
            android.content.Context r0 = r5.zzc
            r1 = 0
            if (r8 == 0) goto L23
            boolean r7 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r0)
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzn.zzb(r6, r7, r1, r1)
            goto L7b
        L23:
            android.content.pm.PackageManager r8 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            r0 = 64
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r6, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            android.content.Context r0 = r5.zzc
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r0)
            if (r8 != 0) goto L3a
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzx.zzc(r7)
            goto L7b
        L3a:
            android.content.pm.Signature[] r7 = r8.signatures
            if (r7 == 0) goto L75
            int r7 = r7.length
            r2 = 1
            if (r7 == r2) goto L43
            goto L75
        L43:
            com.google.android.gms.common.zzk r7 = new com.google.android.gms.common.zzk
            android.content.pm.Signature[] r3 = r8.signatures
            r3 = r3[r1]
            byte[] r3 = r3.toByteArray()
            r7.<init>(r3)
            java.lang.String r3 = r8.packageName
            com.google.android.gms.common.zzx r0 = com.google.android.gms.common.zzn.zza(r3, r7, r0, r1)
            boolean r4 = r0.zza
            if (r4 == 0) goto L73
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo
            if (r8 == 0) goto L73
            int r8 = r8.flags
            r8 = r8 & 2
            if (r8 == 0) goto L73
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzn.zza(r3, r7, r1, r2)
            boolean r7 = r7.zza
            if (r7 == 0) goto L73
            java.lang.String r7 = "debuggable release cert app rejected"
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzx.zzc(r7)
            goto L7b
        L73:
            r7 = r0
            goto L7b
        L75:
            java.lang.String r7 = "single cert required"
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzx.zzc(r7)
        L7b:
            boolean r8 = r7.zza
            if (r8 == 0) goto L81
            r5.zzd = r6
        L81:
            return r7
        L82:
            r5 = move-exception
            java.lang.String r7 = "no pkg "
            java.lang.String r6 = r7.concat(r6)
            com.google.android.gms.common.zzx r5 = com.google.android.gms.common.zzx.zzd(r6, r5)
            return r5
        L8e:
            com.google.android.gms.common.zzx r5 = com.google.android.gms.common.zzx.zzb()
            return r5
    }

    public boolean isGooglePublicSignedPackage(android.content.pm.PackageInfo r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = zzb(r4, r0)
            r2 = 1
            if (r1 == 0) goto Lc
            return r2
        Lc:
            boolean r4 = zzb(r4, r2)
            if (r4 == 0) goto L22
            android.content.Context r3 = r3.zzc
            boolean r3 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r3)
            if (r3 == 0) goto L1b
            return r2
        L1b:
            java.lang.String r3 = "GoogleSignatureVerifier"
            java.lang.String r4 = "Test-keys aren't accepted on this build."
            android.util.Log.w(r3, r4)
        L22:
            return r0
    }

    public boolean isPackageGoogleSigned(java.lang.String r2) {
            r1 = this;
            r0 = 0
            com.google.android.gms.common.zzx r1 = r1.zzc(r2, r0, r0)
            r1.zze()
            boolean r1 = r1.zza
            return r1
    }

    public boolean isUidGoogleSigned(int r6) {
            r5 = this;
            android.content.Context r0 = r5.zzc
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String[] r6 = r0.getPackagesForUid(r6)
            if (r6 == 0) goto L27
            int r0 = r6.length
            if (r0 != 0) goto L10
            goto L27
        L10:
            r1 = 0
            r2 = 0
            r3 = r1
        L13:
            if (r3 >= r0) goto L23
            r2 = r6[r3]
            com.google.android.gms.common.zzx r2 = r5.zzc(r2, r1, r1)
            boolean r4 = r2.zza
            if (r4 == 0) goto L20
            goto L2d
        L20:
            int r3 = r3 + 1
            goto L13
        L23:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            goto L2d
        L27:
            java.lang.String r5 = "no pkgs"
            com.google.android.gms.common.zzx r2 = com.google.android.gms.common.zzx.zzc(r5)
        L2d:
            r2.zze()
            boolean r5 = r2.zza
            return r5
    }
}
