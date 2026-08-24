package com.google.mlkit.common.sdkinternal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ModelInfo {
    private final java.lang.String zza;
    private final android.net.Uri zzb;
    private final java.lang.String zzc;
    private final com.google.mlkit.common.sdkinternal.ModelType zzd;

    public ModelInfo(java.lang.String r1, android.net.Uri r2, java.lang.String r3, com.google.mlkit.common.sdkinternal.ModelType r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public java.lang.String getModelHash() {
            r0 = this;
            java.lang.String r0 = r0.zzc
            return r0
    }

    public java.lang.String getModelNameForPersist() {
            r0 = this;
            java.lang.String r0 = r0.zza
            return r0
    }

    public com.google.mlkit.common.sdkinternal.ModelType getModelType() {
            r0 = this;
            com.google.mlkit.common.sdkinternal.ModelType r0 = r0.zzd
            return r0
    }

    public android.net.Uri getModelUri() {
            r0 = this;
            android.net.Uri r0 = r0.zzb
            return r0
    }
}
