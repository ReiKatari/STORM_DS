package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@com.google.errorprone.annotations.RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public class PackageSignatureVerifier {
    static volatile com.google.android.gms.common.zzac zza;
    private static com.google.android.gms.common.zzad zzb;

    public PackageSignatureVerifier() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.android.gms.common.zzad zza(android.content.Context r2) {
            java.lang.Class<com.google.android.gms.common.PackageSignatureVerifier> r0 = com.google.android.gms.common.PackageSignatureVerifier.class
            monitor-enter(r0)
            com.google.android.gms.common.zzad r1 = com.google.android.gms.common.PackageSignatureVerifier.zzb     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.google.android.gms.common.zzad r1 = new com.google.android.gms.common.zzad     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.common.PackageSignatureVerifier.zzb = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            com.google.android.gms.common.zzad r2 = com.google.android.gms.common.PackageSignatureVerifier.zzb     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerified(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            boolean r2 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r3)
            zza(r3)
            boolean r0 = com.google.android.gms.common.zzn.zzf()
            if (r0 == 0) goto L62
            r0 = 1
            if (r0 == r2) goto L13
            java.lang.String r0 = "-0"
            goto L15
        L13:
            java.lang.String r0 = "-1"
        L15:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.common.zzac r1 = com.google.android.gms.common.PackageSignatureVerifier.zza
            if (r1 == 0) goto L34
            com.google.android.gms.common.zzac r1 = com.google.android.gms.common.PackageSignatureVerifier.zza
            java.lang.String r1 = com.google.android.gms.common.zzac.zzb(r1)
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L34
            com.google.android.gms.common.zzac r2 = com.google.android.gms.common.PackageSignatureVerifier.zza
            com.google.android.gms.common.PackageVerificationResult r2 = com.google.android.gms.common.zzac.zza(r2)
            return r2
        L34:
            zza(r3)
            r3 = 0
            com.google.android.gms.common.zzx r2 = com.google.android.gms.common.zzn.zzc(r4, r2, r3, r3)
            boolean r3 = r2.zza
            if (r3 == 0) goto L54
            int r2 = r2.zzd
            com.google.android.gms.common.zzac r3 = new com.google.android.gms.common.zzac
            com.google.android.gms.common.PackageVerificationResult r2 = com.google.android.gms.common.PackageVerificationResult.zzd(r4, r2)
            r3.<init>(r0, r2)
            com.google.android.gms.common.PackageSignatureVerifier.zza = r3
            com.google.android.gms.common.zzac r2 = com.google.android.gms.common.PackageSignatureVerifier.zza
            com.google.android.gms.common.PackageVerificationResult r2 = com.google.android.gms.common.zzac.zza(r2)
            return r2
        L54:
            java.lang.String r3 = r2.zzb
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r3 = r2.zzb
            java.lang.Throwable r2 = r2.zzc
            com.google.android.gms.common.PackageVerificationResult r2 = com.google.android.gms.common.PackageVerificationResult.zza(r4, r3, r2)
            return r2
        L62:
            com.google.android.gms.common.zzae r2 = new com.google.android.gms.common.zzae
            r2.<init>()
            throw r2
    }

    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerifiedWithRetry(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.common.PackageVerificationResult r0 = r1.queryPackageSignatureVerified(r2, r3)     // Catch: java.lang.SecurityException -> L8
            r0.zzb()     // Catch: java.lang.SecurityException -> L8
            return r0
        L8:
            r0 = move-exception
            com.google.android.gms.common.PackageVerificationResult r1 = r1.queryPackageSignatureVerified(r2, r3)
            boolean r2 = r1.zzc()
            if (r2 == 0) goto L1a
            java.lang.String r2 = "PkgSignatureVerifier"
            java.lang.String r3 = "Got flaky result during package signature verification"
            android.util.Log.e(r2, r3, r0)
        L1a:
            return r1
    }
}
