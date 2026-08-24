package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzrv extends com.google.android.gms.internal.mlkit_common.zzsi {
    private com.google.android.gms.internal.mlkit_common.zzmu zza;
    private java.lang.String zzb;
    private boolean zzc;
    private boolean zzd;
    private com.google.mlkit.common.sdkinternal.ModelType zze;
    private com.google.android.gms.internal.mlkit_common.zzna zzf;
    private int zzg;
    private byte zzh;

    public zzrv() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final com.google.android.gms.internal.mlkit_common.zzsi zza(com.google.android.gms.internal.mlkit_common.zzna r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.zzf = r1
            return r0
        L5:
            java.lang.String r0 = "Null downloadStatus"
            defpackage.u34.x(r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final com.google.android.gms.internal.mlkit_common.zzsi zzb(com.google.android.gms.internal.mlkit_common.zzmu r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.zza = r1
            return r0
        L5:
            java.lang.String r0 = "Null errorCode"
            defpackage.u34.x(r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final com.google.android.gms.internal.mlkit_common.zzsi zzc(int r1) {
            r0 = this;
            r0.zzg = r1
            byte r1 = r0.zzh
            r1 = r1 | 4
            byte r1 = (byte) r1
            r0.zzh = r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final com.google.android.gms.internal.mlkit_common.zzsi zzd(com.google.mlkit.common.sdkinternal.ModelType r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.zze = r1
            return r0
        L5:
            java.lang.String r0 = "Null modelType"
            defpackage.u34.x(r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final com.google.android.gms.internal.mlkit_common.zzsi zze(boolean r1) {
            r0 = this;
            r0.zzd = r1
            byte r1 = r0.zzh
            r1 = r1 | 2
            byte r1 = (byte) r1
            r0.zzh = r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final com.google.android.gms.internal.mlkit_common.zzsi zzf(boolean r1) {
            r0 = this;
            r0.zzc = r1
            byte r1 = r0.zzh
            r1 = r1 | 1
            byte r1 = (byte) r1
            r0.zzh = r1
            return r0
    }

    public final com.google.android.gms.internal.mlkit_common.zzsi zzg(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = "NA"
            r0.zzb = r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final com.google.android.gms.internal.mlkit_common.zzsj zzh() {
            r11 = this;
            byte r0 = r11.zzh
            r1 = 7
            if (r0 != r1) goto L23
            com.google.android.gms.internal.mlkit_common.zzmu r3 = r11.zza
            if (r3 == 0) goto L23
            java.lang.String r4 = r11.zzb
            if (r4 == 0) goto L23
            com.google.mlkit.common.sdkinternal.ModelType r7 = r11.zze
            if (r7 == 0) goto L23
            com.google.android.gms.internal.mlkit_common.zzna r8 = r11.zzf
            if (r8 != 0) goto L16
            goto L23
        L16:
            com.google.android.gms.internal.mlkit_common.zzrx r2 = new com.google.android.gms.internal.mlkit_common.zzrx
            boolean r5 = r11.zzc
            boolean r6 = r11.zzd
            int r9 = r11.zzg
            r10 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
        L23:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.google.android.gms.internal.mlkit_common.zzmu r1 = r11.zza
            if (r1 != 0) goto L31
            java.lang.String r1 = " errorCode"
            r0.append(r1)
        L31:
            java.lang.String r1 = r11.zzb
            if (r1 != 0) goto L3a
            java.lang.String r1 = " tfliteSchemaVersion"
            r0.append(r1)
        L3a:
            byte r1 = r11.zzh
            r1 = r1 & 1
            if (r1 != 0) goto L45
            java.lang.String r1 = " shouldLogRoughDownloadTime"
            r0.append(r1)
        L45:
            byte r1 = r11.zzh
            r1 = r1 & 2
            if (r1 != 0) goto L50
            java.lang.String r1 = " shouldLogExactDownloadTime"
            r0.append(r1)
        L50:
            com.google.mlkit.common.sdkinternal.ModelType r1 = r11.zze
            if (r1 != 0) goto L59
            java.lang.String r1 = " modelType"
            r0.append(r1)
        L59:
            com.google.android.gms.internal.mlkit_common.zzna r1 = r11.zzf
            if (r1 != 0) goto L62
            java.lang.String r1 = " downloadStatus"
            r0.append(r1)
        L62:
            byte r11 = r11.zzh
            r11 = r11 & 4
            if (r11 != 0) goto L6d
            java.lang.String r11 = " failureStatusCode"
            r0.append(r11)
        L6d:
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = "Missing required properties:"
            java.lang.String r11 = r0.concat(r11)
            defpackage.i.m(r11)
            r11 = 0
            return r11
    }
}
