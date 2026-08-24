package com.google.mlkit.common.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class RemoteModel {
    public static final java.util.Map zza = null;
    private static final java.util.Map zzb = null;
    private final java.lang.String zzc;
    private final com.google.mlkit.common.sdkinternal.model.BaseModel zzd;
    private final com.google.mlkit.common.sdkinternal.ModelType zze;
    private java.lang.String zzf;

    static {
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.mlkit.common.sdkinternal.model.BaseModel> r1 = com.google.mlkit.common.sdkinternal.model.BaseModel.class
            r0.<init>(r1)
            com.google.mlkit.common.model.RemoteModel.zzb = r0
            java.util.EnumMap r0 = new java.util.EnumMap
            r0.<init>(r1)
            com.google.mlkit.common.model.RemoteModel.zza = r0
            return
    }

    public RemoteModel(java.lang.String r5, com.google.mlkit.common.sdkinternal.model.BaseModel r6, com.google.mlkit.common.sdkinternal.ModelType r7) {
            r4 = this;
            r4.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 1
            r2 = 0
            if (r6 != 0) goto Ld
            r3 = r2
            goto Le
        Ld:
            r3 = r1
        Le:
            if (r0 != r3) goto L11
            goto L12
        L11:
            r1 = r2
        L12:
            java.lang.String r0 = "One of cloud model name and base model cannot be empty"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
            r4.zzc = r5
            r4.zzd = r6
            r4.zze = r7
            return
    }

    public boolean baseModelHashMatches(java.lang.String r2) {
            r1 = this;
            com.google.mlkit.common.sdkinternal.model.BaseModel r1 = r1.zzd
            if (r1 != 0) goto L6
            r1 = 0
            return r1
        L6:
            java.util.Map r0 = com.google.mlkit.common.model.RemoteModel.zzb
            java.lang.Object r1 = r0.get(r1)
            boolean r1 = r2.equals(r1)
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.mlkit.common.model.RemoteModel
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.mlkit.common.model.RemoteModel r5 = (com.google.mlkit.common.model.RemoteModel) r5
            java.lang.String r1 = r4.zzc
            java.lang.String r3 = r5.zzc
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L2b
            com.google.mlkit.common.sdkinternal.model.BaseModel r1 = r4.zzd
            com.google.mlkit.common.sdkinternal.model.BaseModel r3 = r5.zzd
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L2b
            com.google.mlkit.common.sdkinternal.ModelType r4 = r4.zze
            com.google.mlkit.common.sdkinternal.ModelType r5 = r5.zze
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r4, r5)
            if (r4 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    public java.lang.String getModelHash() {
            r0 = this;
            java.lang.String r0 = r0.zzf
            return r0
    }

    public java.lang.String getModelName() {
            r0 = this;
            java.lang.String r0 = r0.zzc
            return r0
    }

    public java.lang.String getModelNameForBackend() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.mlkit.common.sdkinternal.model.BaseModel r1 = r1.zzd
            java.util.Map r0 = com.google.mlkit.common.model.RemoteModel.zza
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public com.google.mlkit.common.sdkinternal.ModelType getModelType() {
            r0 = this;
            com.google.mlkit.common.sdkinternal.ModelType r0 = r0.zze
            return r0
    }

    public java.lang.String getUniqueModelNameForPersist() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.mlkit.common.sdkinternal.model.BaseModel r1 = r1.zzd
            java.util.Map r0 = com.google.mlkit.common.model.RemoteModel.zza
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "COM.GOOGLE.BASE_"
            java.lang.String r1 = r0.concat(r1)
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.zzc
            com.google.mlkit.common.sdkinternal.model.BaseModel r1 = r2.zzd
            com.google.mlkit.common.sdkinternal.ModelType r2 = r2.zze
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r1, r2}
            int r2 = com.google.android.gms.common.internal.Objects.hashCode(r2)
            return r2
    }

    public boolean isBaseModel() {
            r0 = this;
            com.google.mlkit.common.sdkinternal.model.BaseModel r0 = r0.zzd
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void setModelHash(java.lang.String r1) {
            r0 = this;
            r0.zzf = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "RemoteModel"
            com.google.android.gms.internal.mlkit_common.zzq r0 = com.google.android.gms.internal.mlkit_common.zzr.zzb(r0)
            java.lang.String r1 = "modelName"
            java.lang.String r2 = r3.zzc
            r0.zza(r1, r2)
            java.lang.String r1 = "baseModel"
            com.google.mlkit.common.sdkinternal.model.BaseModel r2 = r3.zzd
            r0.zza(r1, r2)
            java.lang.String r1 = "modelType"
            com.google.mlkit.common.sdkinternal.ModelType r3 = r3.zze
            r0.zza(r1, r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
