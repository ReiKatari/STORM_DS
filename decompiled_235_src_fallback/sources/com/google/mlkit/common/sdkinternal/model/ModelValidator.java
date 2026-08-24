package com.google.mlkit.common.sdkinternal.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface ModelValidator {

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class ValidationResult {
        public static final com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult VALID = null;
        private final com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode zza;
        private final java.lang.String zzb;

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* loaded from: classes.dex */
        public enum ErrorCode extends java.lang.Enum<com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode> {
            public static final com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode MODEL_FORMAT_INVALID = null;
            public static final com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode OK = null;
            public static final com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode TFLITE_VERSION_INCOMPATIBLE = null;
            private static final /* synthetic */ com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode[] zza = null;

            static {
                    com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode r0 = new com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode
                    java.lang.String r1 = "OK"
                    r2 = 0
                    r0.<init>(r1, r2)
                    com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.OK = r0
                    com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode r1 = new com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode
                    java.lang.String r2 = "TFLITE_VERSION_INCOMPATIBLE"
                    r3 = 1
                    r1.<init>(r2, r3)
                    com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.TFLITE_VERSION_INCOMPATIBLE = r1
                    com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode r2 = new com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode
                    java.lang.String r3 = "MODEL_FORMAT_INVALID"
                    r4 = 2
                    r2.<init>(r3, r4)
                    com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.MODEL_FORMAT_INVALID = r2
                    com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode[] r0 = new com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode[]{r0, r1, r2}
                    com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.zza = r0
                    return
            }

            ErrorCode(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode[] values() {
                    com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode[] r0 = com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.zza
                    java.lang.Object r0 = r0.clone()
                    com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode[] r0 = (com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode[]) r0
                    return r0
            }
        }

        static {
                com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult r0 = new com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult
                com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode r1 = com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.OK
                r2 = 0
                r0.<init>(r1, r2)
                com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.VALID = r0
                return
        }

        public ValidationResult(com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.zza = r1
                r0.zzb = r2
                return
        }

        public com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode getErrorCode() {
                r0 = this;
                com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode r0 = r0.zza
                return r0
        }

        public java.lang.String getErrorMessage() {
                r0 = this;
                java.lang.String r0 = r0.zzb
                return r0
        }

        public boolean isValid() {
                r1 = this;
                com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode r1 = r1.zza
                com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode r0 = com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.OK
                if (r1 != r0) goto L8
                r1 = 1
                return r1
            L8:
                r1 = 0
                return r1
        }
    }

    com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult validateModel(java.io.File r1, com.google.mlkit.common.model.RemoteModel r2);
}
