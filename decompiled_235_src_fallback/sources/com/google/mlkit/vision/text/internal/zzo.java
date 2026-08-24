package com.google.mlkit.vision.text.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzo {
    private final com.google.mlkit.vision.text.internal.zzp zza;
    private final com.google.mlkit.common.sdkinternal.ExecutorSelector zzb;

    public zzo(com.google.mlkit.vision.text.internal.zzp r1, com.google.mlkit.common.sdkinternal.ExecutorSelector r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final com.google.mlkit.vision.text.TextRecognizer zza(com.google.mlkit.vision.text.TextRecognizerOptionsInterface r4) {
            r3 = this;
            com.google.mlkit.vision.text.internal.zzp r0 = r3.zza
            com.google.mlkit.vision.text.internal.zzn r1 = new com.google.mlkit.vision.text.internal.zzn
            java.lang.Object r0 = r0.get(r4)
            com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource r0 = (com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource) r0
            com.google.mlkit.common.sdkinternal.ExecutorSelector r3 = r3.zzb
            java.util.concurrent.Executor r2 = r4.getExecutor()
            java.util.concurrent.Executor r3 = r3.getExecutorToUse(r2)
            java.lang.String r2 = r4.getLoggingLibraryName()
            com.google.android.gms.internal.mlkit_vision_text_common.zzuc r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzun.zzb(r2)
            r1.<init>(r0, r3, r2, r4)
            return r1
    }
}
