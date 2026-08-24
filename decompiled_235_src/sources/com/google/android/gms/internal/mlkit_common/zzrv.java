package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.ModelType;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzrv extends zzsi {
    private zzmu zza;
    private String zzb;
    private boolean zzc;
    private boolean zzd;
    private ModelType zze;
    private zzna zzf;
    private int zzg;
    private byte zzh;

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zza(zzna zznaVar) {
        if (zznaVar != null) {
            this.zzf = zznaVar;
            return this;
        }
        u34.x("Null downloadStatus");
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzb(zzmu zzmuVar) {
        if (zzmuVar != null) {
            this.zza = zzmuVar;
            return this;
        }
        u34.x("Null errorCode");
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzc(int i) {
        this.zzg = i;
        this.zzh = (byte) (this.zzh | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzd(ModelType modelType) {
        if (modelType != null) {
            this.zze = modelType;
            return this;
        }
        u34.x("Null modelType");
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zze(boolean z) {
        this.zzd = z;
        this.zzh = (byte) (this.zzh | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzf(boolean z) {
        this.zzc = z;
        this.zzh = (byte) (this.zzh | 1);
        return this;
    }

    public final zzsi zzg(String str) {
        this.zzb = "NA";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsj zzh() {
        zzmu zzmuVar;
        String str;
        ModelType modelType;
        zzna zznaVar;
        if (this.zzh == 7 && (zzmuVar = this.zza) != null && (str = this.zzb) != null && (modelType = this.zze) != null && (zznaVar = this.zzf) != null) {
            return new zzrx(zzmuVar, str, this.zzc, this.zzd, modelType, zznaVar, this.zzg, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" errorCode");
        }
        if (this.zzb == null) {
            sb.append(" tfliteSchemaVersion");
        }
        if ((this.zzh & 1) == 0) {
            sb.append(" shouldLogRoughDownloadTime");
        }
        if ((this.zzh & 2) == 0) {
            sb.append(" shouldLogExactDownloadTime");
        }
        if (this.zze == null) {
            sb.append(" modelType");
        }
        if (this.zzf == null) {
            sb.append(" downloadStatus");
        }
        if ((this.zzh & 4) == 0) {
            sb.append(" failureStatusCode");
        }
        i.m("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
