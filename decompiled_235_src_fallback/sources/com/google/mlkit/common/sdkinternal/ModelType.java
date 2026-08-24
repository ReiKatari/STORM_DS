package com.google.mlkit.common.sdkinternal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum ModelType extends java.lang.Enum<com.google.mlkit.common.sdkinternal.ModelType> {
    public static final com.google.mlkit.common.sdkinternal.ModelType BASE = null;
    public static final com.google.mlkit.common.sdkinternal.ModelType CUSTOM = null;
    public static final com.google.mlkit.common.sdkinternal.ModelType DIGITAL_INK = null;
    public static final com.google.mlkit.common.sdkinternal.ModelType DIGITAL_INK_SEGMENTATION = null;
    public static final com.google.mlkit.common.sdkinternal.ModelType ENTITY_EXTRACTION = null;
    public static final com.google.mlkit.common.sdkinternal.ModelType IMAGE_CAPTIONING = null;
    public static final com.google.mlkit.common.sdkinternal.ModelType TOXICITY_DETECTION = null;
    public static final com.google.mlkit.common.sdkinternal.ModelType TRANSLATE = null;
    public static final com.google.mlkit.common.sdkinternal.ModelType UNKNOWN = null;
    private static final /* synthetic */ com.google.mlkit.common.sdkinternal.ModelType[] zza = null;

    static {
            com.google.mlkit.common.sdkinternal.ModelType r0 = new com.google.mlkit.common.sdkinternal.ModelType
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.mlkit.common.sdkinternal.ModelType.UNKNOWN = r0
            com.google.mlkit.common.sdkinternal.ModelType r1 = new com.google.mlkit.common.sdkinternal.ModelType
            java.lang.String r2 = "BASE"
            r3 = 1
            r1.<init>(r2, r3)
            com.google.mlkit.common.sdkinternal.ModelType.BASE = r1
            com.google.mlkit.common.sdkinternal.ModelType r2 = new com.google.mlkit.common.sdkinternal.ModelType
            java.lang.String r3 = "TRANSLATE"
            r4 = 2
            r2.<init>(r3, r4)
            com.google.mlkit.common.sdkinternal.ModelType.TRANSLATE = r2
            com.google.mlkit.common.sdkinternal.ModelType r3 = new com.google.mlkit.common.sdkinternal.ModelType
            java.lang.String r4 = "ENTITY_EXTRACTION"
            r5 = 3
            r3.<init>(r4, r5)
            com.google.mlkit.common.sdkinternal.ModelType.ENTITY_EXTRACTION = r3
            com.google.mlkit.common.sdkinternal.ModelType r4 = new com.google.mlkit.common.sdkinternal.ModelType
            java.lang.String r5 = "CUSTOM"
            r6 = 4
            r4.<init>(r5, r6)
            com.google.mlkit.common.sdkinternal.ModelType.CUSTOM = r4
            com.google.mlkit.common.sdkinternal.ModelType r5 = new com.google.mlkit.common.sdkinternal.ModelType
            java.lang.String r6 = "DIGITAL_INK"
            r7 = 5
            r5.<init>(r6, r7)
            com.google.mlkit.common.sdkinternal.ModelType.DIGITAL_INK = r5
            com.google.mlkit.common.sdkinternal.ModelType r6 = new com.google.mlkit.common.sdkinternal.ModelType
            java.lang.String r7 = "DIGITAL_INK_SEGMENTATION"
            r8 = 6
            r6.<init>(r7, r8)
            com.google.mlkit.common.sdkinternal.ModelType.DIGITAL_INK_SEGMENTATION = r6
            com.google.mlkit.common.sdkinternal.ModelType r7 = new com.google.mlkit.common.sdkinternal.ModelType
            java.lang.String r8 = "TOXICITY_DETECTION"
            r9 = 7
            r7.<init>(r8, r9)
            com.google.mlkit.common.sdkinternal.ModelType.TOXICITY_DETECTION = r7
            com.google.mlkit.common.sdkinternal.ModelType r8 = new com.google.mlkit.common.sdkinternal.ModelType
            java.lang.String r9 = "IMAGE_CAPTIONING"
            r10 = 8
            r8.<init>(r9, r10)
            com.google.mlkit.common.sdkinternal.ModelType.IMAGE_CAPTIONING = r8
            com.google.mlkit.common.sdkinternal.ModelType[] r0 = new com.google.mlkit.common.sdkinternal.ModelType[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            com.google.mlkit.common.sdkinternal.ModelType.zza = r0
            return
    }

    ModelType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.mlkit.common.sdkinternal.ModelType[] values() {
            com.google.mlkit.common.sdkinternal.ModelType[] r0 = com.google.mlkit.common.sdkinternal.ModelType.zza
            java.lang.Object r0 = r0.clone()
            com.google.mlkit.common.sdkinternal.ModelType[] r0 = (com.google.mlkit.common.sdkinternal.ModelType[]) r0
            return r0
    }
}
