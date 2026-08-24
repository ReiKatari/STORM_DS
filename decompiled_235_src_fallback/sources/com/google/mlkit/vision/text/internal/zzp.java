package com.google.mlkit.vision.text.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzp extends com.google.mlkit.common.sdkinternal.LazyInstanceMap {
    private final com.google.mlkit.common.sdkinternal.MlKitContext zza;

    public zzp(com.google.mlkit.common.sdkinternal.MlKitContext r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ java.lang.Object create(java.lang.Object r5) {
            r4 = this;
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r5 = (com.google.mlkit.vision.text.TextRecognizerOptionsInterface) r5
            java.lang.String r0 = r5.getLoggingLibraryName()
            com.google.android.gms.internal.mlkit_vision_text_common.zzuc r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzun.zzb(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r4 = r4.zza
            com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource r1 = new com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource
            android.content.Context r4 = r4.getApplicationContext()
            com.google.android.gms.common.GoogleApiAvailabilityLight r2 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            int r2 = r2.getApkVersion(r4)
            r3 = 204700000(0xc337960, float:1.3826183E-31)
            if (r2 >= r3) goto L2c
            boolean r2 = r5.getIsThickClient()
            if (r2 == 0) goto L26
            goto L2c
        L26:
            com.google.mlkit.vision.text.internal.zze r2 = new com.google.mlkit.vision.text.internal.zze
            r2.<init>(r4)
            goto L31
        L2c:
            com.google.mlkit.vision.text.internal.zzd r2 = new com.google.mlkit.vision.text.internal.zzd
            r2.<init>(r4, r5, r0)
        L31:
            r1.<init>(r0, r2, r5)
            return r1
    }
}
