package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzst {
    private static final com.google.android.gms.common.internal.GmsLogger zza = null;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "RemoteModelUtils"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.android.gms.internal.mlkit_common.zzst.zza = r0
            return
    }

    public static com.google.android.gms.internal.mlkit_common.zznc zza(com.google.mlkit.common.model.RemoteModel r10, com.google.mlkit.common.sdkinternal.SharedPrefManager r11, com.google.android.gms.internal.mlkit_common.zzsj r12) {
            com.google.mlkit.common.sdkinternal.ModelType r0 = r12.zzb()
            java.lang.String r1 = r10.getModelHash()
            com.google.android.gms.internal.mlkit_common.zzni r2 = new com.google.android.gms.internal.mlkit_common.zzni
            r2.<init>()
            com.google.android.gms.internal.mlkit_common.zznd r3 = new com.google.android.gms.internal.mlkit_common.zznd
            r3.<init>()
            java.lang.String r4 = r10.getModelNameForBackend()
            r3.zzc(r4)
            com.google.android.gms.internal.mlkit_common.zznf r4 = com.google.android.gms.internal.mlkit_common.zznf.zzd
            r3.zzd(r4)
            java.lang.String r1 = com.google.android.gms.internal.mlkit_common.zzu.zzb(r1)
            r3.zza(r1)
            int r0 = r0.ordinal()
            r1 = 2
            if (r0 == r1) goto L3b
            r1 = 4
            if (r0 == r1) goto L38
            r1 = 5
            if (r0 == r1) goto L35
            com.google.android.gms.internal.mlkit_common.zzne r0 = com.google.android.gms.internal.mlkit_common.zzne.zza
            goto L3d
        L35:
            com.google.android.gms.internal.mlkit_common.zzne r0 = com.google.android.gms.internal.mlkit_common.zzne.zzh
            goto L3d
        L38:
            com.google.android.gms.internal.mlkit_common.zzne r0 = com.google.android.gms.internal.mlkit_common.zzne.zzb
            goto L3d
        L3b:
            com.google.android.gms.internal.mlkit_common.zzne r0 = com.google.android.gms.internal.mlkit_common.zzne.zzd
        L3d:
            r3.zzb(r0)
            com.google.android.gms.internal.mlkit_common.zznh r0 = r3.zzg()
            r2.zzb(r0)
            com.google.android.gms.internal.mlkit_common.zznl r0 = r2.zzc()
            com.google.android.gms.internal.mlkit_common.zzmz r1 = new com.google.android.gms.internal.mlkit_common.zzmz
            r1.<init>()
            com.google.android.gms.internal.mlkit_common.zzmu r2 = r12.zzc()
            r1.zzd(r2)
            com.google.android.gms.internal.mlkit_common.zzna r2 = r12.zzd()
            r1.zzc(r2)
            int r2 = r12.zza()
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.zzb(r2)
            r1.zzf(r0)
            boolean r0 = r12.zzg()
            java.lang.String r2 = "Model downloaded without its beginning time recorded."
            java.lang.String r3 = "RemoteModelUtils"
            r4 = 0
            if (r0 == 0) goto L9e
            long r6 = r11.getModelDownloadBeginTimeMs(r10)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L87
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.android.gms.internal.mlkit_common.zzst.zza
            r0.w(r3, r2)
            goto L9e
        L87:
            long r8 = r11.getModelFirstUseTimeMs(r10)
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 != 0) goto L96
            long r8 = android.os.SystemClock.elapsedRealtime()
            r11.setModelFirstUseTimeMs(r10, r8)
        L96:
            long r8 = r8 - r6
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r1.zzg(r0)
        L9e:
            boolean r12 = r12.zzf()
            if (r12 == 0) goto Lbe
            long r10 = r11.getModelDownloadBeginTimeMs(r10)
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 != 0) goto Lb2
            com.google.android.gms.common.internal.GmsLogger r10 = com.google.android.gms.internal.mlkit_common.zzst.zza
            r10.w(r3, r2)
            goto Lbe
        Lb2:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            r1.zze(r10)
        Lbe:
            com.google.android.gms.internal.mlkit_common.zznc r10 = r1.zzi()
            return r10
    }
}
