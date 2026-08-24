package com.google.mlkit.vision.text.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzn extends com.google.mlkit.vision.common.internal.MobileVisionBase implements com.google.mlkit.vision.text.TextRecognizer {
    private final com.google.mlkit.vision.text.TextRecognizerOptionsInterface zzb;

    public zzn(com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource r1, java.util.concurrent.Executor r2, com.google.android.gms.internal.mlkit_vision_text_common.zzuc r3, com.google.mlkit.vision.text.TextRecognizerOptionsInterface r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzb = r4
            com.google.android.gms.internal.mlkit_vision_text_common.zzow r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzow
            r0.<init>()
            boolean r1 = r4.getIsThickClient()
            if (r1 == 0) goto L13
            com.google.android.gms.internal.mlkit_vision_text_common.zzot r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzot.zzc
            goto L15
        L13:
            com.google.android.gms.internal.mlkit_vision_text_common.zzot r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzot.zzb
        L15:
            r0.zze(r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzrx r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zzrx
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzsa r2 = new com.google.android.gms.internal.mlkit_vision_text_common.zzsa
            r2.<init>()
            int r4 = r4.getLoggingLanguageOption()
            com.google.android.gms.internal.mlkit_vision_text_common.zzsb r4 = com.google.mlkit.vision.text.internal.LoggingUtils.zza(r4)
            r2.zza(r4)
            com.google.android.gms.internal.mlkit_vision_text_common.zzsd r2 = r2.zzc()
            r1.zze(r2)
            com.google.android.gms.internal.mlkit_vision_text_common.zzrz r1 = r1.zzf()
            r0.zzh(r1)
            r1 = 1
            com.google.android.gms.internal.mlkit_vision_text_common.zztr r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzuf.zzg(r0, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzov r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzov.zzg
            r3.zzd(r0, r1)
            return
    }

    @Override // com.google.mlkit.vision.interfaces.Detector
    public final int getDetectorType() {
            r0 = this;
            r0 = 4
            return r0
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final com.google.android.gms.common.Feature[] getOptionalFeatures() {
            r0 = this;
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r0 = r0.zzb
            com.google.android.gms.common.Feature[] r0 = com.google.mlkit.vision.text.internal.TextOptionalModuleUtils.zza(r0)
            return r0
    }

    @Override // com.google.mlkit.vision.text.TextRecognizer
    public final com.google.android.gms.tasks.Task<com.google.mlkit.vision.text.Text> process(com.google.mlkit.vision.common.InputImage r1) {
            r0 = this;
            com.google.android.gms.tasks.Task r0 = super.processBase(r1)
            return r0
    }

    @Override // com.google.mlkit.vision.text.TextRecognizer
    public final com.google.android.gms.tasks.Task<com.google.mlkit.vision.text.Text> process(defpackage.p64 r1) {
            r0 = this;
            com.google.android.gms.tasks.Task r0 = super.processBase(r1)
            return r0
    }
}
