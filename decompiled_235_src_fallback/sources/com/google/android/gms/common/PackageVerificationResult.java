package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class PackageVerificationResult {
    private final java.lang.String zza;
    private final boolean zzb;
    private final java.lang.String zzc;
    private final java.lang.Throwable zzd;

    private PackageVerificationResult(java.lang.String r1, int r2, boolean r3, java.lang.String r4, java.lang.Throwable r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            return
    }

    public static com.google.android.gms.common.PackageVerificationResult zza(java.lang.String r6, java.lang.String r7, java.lang.Throwable r8) {
            com.google.android.gms.common.PackageVerificationResult r0 = new com.google.android.gms.common.PackageVerificationResult
            r2 = 1
            r3 = 0
            r1 = r6
            r4 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static com.google.android.gms.common.PackageVerificationResult zzd(java.lang.String r6, int r7) {
            com.google.android.gms.common.PackageVerificationResult r0 = new com.google.android.gms.common.PackageVerificationResult
            r4 = 0
            r5 = 0
            r3 = 1
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final void zzb() {
            r2 = this;
            boolean r0 = r2.zzb
            if (r0 != 0) goto L20
            java.lang.String r0 = r2.zzc
            java.lang.Throwable r2 = r2.zzd
            java.lang.String r1 = "PackageVerificationRslt: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            if (r2 == 0) goto L1a
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r1.<init>(r0, r2)
            throw r1
        L1a:
            java.lang.SecurityException r2 = new java.lang.SecurityException
            r2.<init>(r0)
            throw r2
        L20:
            return
    }

    public final boolean zzc() {
            r0 = this;
            boolean r0 = r0.zzb
            return r0
    }
}
