package com.google.mlkit.vision.text.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class TextOptionalModuleUtils {
    private TextOptionalModuleUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.common.Feature[] zza(com.google.mlkit.vision.text.TextRecognizerOptionsInterface r1) {
            boolean r0 = r1.getIsThickClient()
            if (r0 == 0) goto L9
            com.google.android.gms.common.Feature[] r1 = com.google.mlkit.common.sdkinternal.OptionalModuleUtils.EMPTY_FEATURES
            return r1
        L9:
            int r1 = r1.getLoggingLanguageOption()
            switch(r1) {
                case 2: goto L33;
                case 3: goto L2c;
                case 4: goto L25;
                case 5: goto L1e;
                case 6: goto L17;
                case 7: goto L17;
                case 8: goto L17;
                default: goto L10;
            }
        L10:
            com.google.android.gms.common.Feature r1 = com.google.mlkit.common.sdkinternal.OptionalModuleUtils.FEATURE_OCR
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[]{r1}
            return r1
        L17:
            com.google.android.gms.common.Feature r1 = com.google.mlkit.common.sdkinternal.OptionalModuleUtils.FEATURE_OCR_COMMON
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[]{r1}
            return r1
        L1e:
            com.google.android.gms.common.Feature r1 = com.google.mlkit.common.sdkinternal.OptionalModuleUtils.FEATURE_OCR_KOREAN
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[]{r1}
            return r1
        L25:
            com.google.android.gms.common.Feature r1 = com.google.mlkit.common.sdkinternal.OptionalModuleUtils.FEATURE_OCR_JAPANESE
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[]{r1}
            return r1
        L2c:
            com.google.android.gms.common.Feature r1 = com.google.mlkit.common.sdkinternal.OptionalModuleUtils.FEATURE_OCR_DEVANAGARI
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[]{r1}
            return r1
        L33:
            com.google.android.gms.common.Feature r1 = com.google.mlkit.common.sdkinternal.OptionalModuleUtils.FEATURE_OCR_CHINESE
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[]{r1}
            return r1
    }
}
