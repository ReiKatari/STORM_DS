package com.google.mlkit.common.sdkinternal.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum BaseModel extends java.lang.Enum<com.google.mlkit.common.sdkinternal.model.BaseModel> {
    public static final com.google.mlkit.common.sdkinternal.model.BaseModel ENTITY_EXTRACTION = null;
    public static final com.google.mlkit.common.sdkinternal.model.BaseModel IMAGE_CAPTIONING = null;
    public static final com.google.mlkit.common.sdkinternal.model.BaseModel TOXICITY_DETECTION = null;
    public static final com.google.mlkit.common.sdkinternal.model.BaseModel TRANSLATE = null;
    public static final com.google.mlkit.common.sdkinternal.model.BaseModel zza = null;
    public static final com.google.mlkit.common.sdkinternal.model.BaseModel zzb = null;
    private static final /* synthetic */ com.google.mlkit.common.sdkinternal.model.BaseModel[] zzc = null;

    static {
            com.google.mlkit.common.sdkinternal.model.BaseModel r0 = new com.google.mlkit.common.sdkinternal.model.BaseModel
            java.lang.String r1 = "FACE_DETECTION"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.mlkit.common.sdkinternal.model.BaseModel.zza = r0
            com.google.mlkit.common.sdkinternal.model.BaseModel r1 = new com.google.mlkit.common.sdkinternal.model.BaseModel
            java.lang.String r2 = "SMART_REPLY"
            r3 = 1
            r1.<init>(r2, r3)
            com.google.mlkit.common.sdkinternal.model.BaseModel.zzb = r1
            com.google.mlkit.common.sdkinternal.model.BaseModel r2 = new com.google.mlkit.common.sdkinternal.model.BaseModel
            java.lang.String r3 = "TRANSLATE"
            r4 = 2
            r2.<init>(r3, r4)
            com.google.mlkit.common.sdkinternal.model.BaseModel.TRANSLATE = r2
            com.google.mlkit.common.sdkinternal.model.BaseModel r3 = new com.google.mlkit.common.sdkinternal.model.BaseModel
            java.lang.String r4 = "ENTITY_EXTRACTION"
            r5 = 3
            r3.<init>(r4, r5)
            com.google.mlkit.common.sdkinternal.model.BaseModel.ENTITY_EXTRACTION = r3
            com.google.mlkit.common.sdkinternal.model.BaseModel r4 = new com.google.mlkit.common.sdkinternal.model.BaseModel
            java.lang.String r5 = "TOXICITY_DETECTION"
            r6 = 4
            r4.<init>(r5, r6)
            com.google.mlkit.common.sdkinternal.model.BaseModel.TOXICITY_DETECTION = r4
            com.google.mlkit.common.sdkinternal.model.BaseModel r5 = new com.google.mlkit.common.sdkinternal.model.BaseModel
            java.lang.String r6 = "IMAGE_CAPTIONING"
            r7 = 5
            r5.<init>(r6, r7)
            com.google.mlkit.common.sdkinternal.model.BaseModel.IMAGE_CAPTIONING = r5
            com.google.mlkit.common.sdkinternal.model.BaseModel[] r0 = new com.google.mlkit.common.sdkinternal.model.BaseModel[]{r0, r1, r2, r3, r4, r5}
            com.google.mlkit.common.sdkinternal.model.BaseModel.zzc = r0
            return
    }

    BaseModel(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.mlkit.common.sdkinternal.model.BaseModel[] values() {
            com.google.mlkit.common.sdkinternal.model.BaseModel[] r0 = com.google.mlkit.common.sdkinternal.model.BaseModel.zzc
            java.lang.Object r0 = r0.clone()
            com.google.mlkit.common.sdkinternal.model.BaseModel[] r0 = (com.google.mlkit.common.sdkinternal.model.BaseModel[]) r0
            return r0
    }
}
