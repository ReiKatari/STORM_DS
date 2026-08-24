package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzrx extends com.google.android.gms.internal.mlkit_common.zzsj {
    private final com.google.android.gms.internal.mlkit_common.zzmu zza;
    private final java.lang.String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final com.google.mlkit.common.sdkinternal.ModelType zze;
    private final com.google.android.gms.internal.mlkit_common.zzna zzf;
    private final int zzg;

    public /* synthetic */ zzrx(com.google.android.gms.internal.mlkit_common.zzmu r1, java.lang.String r2, boolean r3, boolean r4, com.google.mlkit.common.sdkinternal.ModelType r5, com.google.android.gms.internal.mlkit_common.zzna r6, int r7, com.google.android.gms.internal.mlkit_common.zzrw r8) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.mlkit_common.zzsj
            r2 = 0
            if (r1 == 0) goto L54
            com.google.android.gms.internal.mlkit_common.zzsj r5 = (com.google.android.gms.internal.mlkit_common.zzsj) r5
            com.google.android.gms.internal.mlkit_common.zzmu r1 = r4.zza
            com.google.android.gms.internal.mlkit_common.zzmu r3 = r5.zzc()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L54
            java.lang.String r1 = r4.zzb
            java.lang.String r3 = r5.zze()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L54
            boolean r1 = r4.zzc
            boolean r3 = r5.zzg()
            if (r1 != r3) goto L54
            boolean r1 = r4.zzd
            boolean r3 = r5.zzf()
            if (r1 != r3) goto L54
            com.google.mlkit.common.sdkinternal.ModelType r1 = r4.zze
            com.google.mlkit.common.sdkinternal.ModelType r3 = r5.zzb()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L54
            com.google.android.gms.internal.mlkit_common.zzna r1 = r4.zzf
            com.google.android.gms.internal.mlkit_common.zzna r3 = r5.zzd()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L54
            int r4 = r4.zzg
            int r5 = r5.zza()
            if (r4 != r5) goto L54
            return r0
        L54:
            return r2
    }

    public final int hashCode() {
            r6 = this;
            com.google.android.gms.internal.mlkit_common.zzmu r0 = r6.zza
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            java.lang.String r2 = r6.zzb
            int r0 = r0 * r1
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            boolean r2 = r6.zzc
            r3 = 1231(0x4cf, float:1.725E-42)
            r4 = 1237(0x4d5, float:1.733E-42)
            r5 = 1
            if (r5 == r2) goto L1d
            r2 = r4
            goto L1e
        L1d:
            r2 = r3
        L1e:
            int r0 = r0 * r1
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r2 = r6.zzd
            if (r5 == r2) goto L26
            r3 = r4
        L26:
            r0 = r0 ^ r3
            int r0 = r0 * r1
            com.google.mlkit.common.sdkinternal.ModelType r2 = r6.zze
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.android.gms.internal.mlkit_common.zzna r2 = r6.zzf
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r6 = r6.zzg
            r6 = r6 ^ r0
            return r6
    }

    public final java.lang.String toString() {
            r5 = this;
            com.google.android.gms.internal.mlkit_common.zzna r0 = r5.zzf
            com.google.mlkit.common.sdkinternal.ModelType r1 = r5.zze
            com.google.android.gms.internal.mlkit_common.zzmu r2 = r5.zza
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "RemoteModelLoggingOptions{errorCode="
            java.lang.String r4 = ", tfliteSchemaVersion="
            java.lang.StringBuilder r2 = defpackage.i61.t(r3, r2, r4)
            java.lang.String r3 = r5.zzb
            r2.append(r3)
            java.lang.String r3 = ", shouldLogRoughDownloadTime="
            r2.append(r3)
            boolean r3 = r5.zzc
            r2.append(r3)
            java.lang.String r3 = ", shouldLogExactDownloadTime="
            r2.append(r3)
            boolean r3 = r5.zzd
            r2.append(r3)
            java.lang.String r3 = ", modelType="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", downloadStatus="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ", failureStatusCode="
            r2.append(r0)
            int r5 = r5.zzg
            java.lang.String r0 = "}"
            java.lang.String r5 = defpackage.lb1.o(r2, r5, r0)
            return r5
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final int zza() {
            r0 = this;
            int r0 = r0.zzg
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final com.google.mlkit.common.sdkinternal.ModelType zzb() {
            r0 = this;
            com.google.mlkit.common.sdkinternal.ModelType r0 = r0.zze
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final com.google.android.gms.internal.mlkit_common.zzmu zzc() {
            r0 = this;
            com.google.android.gms.internal.mlkit_common.zzmu r0 = r0.zza
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final com.google.android.gms.internal.mlkit_common.zzna zzd() {
            r0 = this;
            com.google.android.gms.internal.mlkit_common.zzna r0 = r0.zzf
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final java.lang.String zze() {
            r0 = this;
            java.lang.String r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzf() {
            r0 = this;
            boolean r0 = r0.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzg() {
            r0 = this;
            boolean r0 = r0.zzc
            return r0
    }
}
