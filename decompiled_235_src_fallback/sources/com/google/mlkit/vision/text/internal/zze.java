package com.google.mlkit.vision.text.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zze implements com.google.mlkit.vision.text.internal.zzm {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.mlkit_vision_text_common.zzp zzb;
    private boolean zzc;
    private com.google.android.gms.internal.mlkit_vision_text_common.zzh zzd;

    public zze(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzp r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzp
            r1 = 0
            r0.<init>(r1)
            r2.zzb = r0
            r2.zza = r3
            return
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final com.google.mlkit.vision.text.Text zza(com.google.mlkit.vision.common.InputImage r10) {
            r9 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzh r0 = r9.zzd
            if (r0 != 0) goto L7
            r9.zzb()
        L7:
            com.google.android.gms.internal.mlkit_vision_text_common.zzh r0 = r9.zzd
            if (r0 == 0) goto L60
            int r0 = r10.getFormat()
            r1 = -1
            if (r0 != r1) goto L20
            android.graphics.Bitmap r0 = r10.getBitmapInternal()
            int r1 = r10.getRotationDegrees()
            int r1 = com.google.mlkit.vision.common.internal.CommonConvertUtils.convertToMVRotation(r1)
        L1e:
            r7 = r1
            goto L2a
        L20:
            com.google.mlkit.vision.common.internal.ImageConvertUtils r0 = com.google.mlkit.vision.common.internal.ImageConvertUtils.getInstance()
            android.graphics.Bitmap r0 = r0.convertToUpRightBitmap(r10)
            r1 = 0
            goto L1e
        L2a:
            zh4 r8 = new zh4
            r8.<init>(r0)
            com.google.android.gms.internal.mlkit_vision_text_common.zzd r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zzd
            int r2 = r10.getWidth()
            int r3 = r10.getHeight()
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r7)
            com.google.android.gms.internal.mlkit_vision_text_common.zzh r9 = r9.zzd     // Catch: android.os.RemoteException -> L54
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)     // Catch: android.os.RemoteException -> L54
            com.google.android.gms.internal.mlkit_vision_text_common.zzh r9 = (com.google.android.gms.internal.mlkit_vision_text_common.zzh) r9     // Catch: android.os.RemoteException -> L54
            com.google.android.gms.internal.mlkit_vision_text_common.zzl[] r9 = r9.zze(r8, r1)     // Catch: android.os.RemoteException -> L54
            android.graphics.Matrix r10 = r10.getCoordinatesMatrix()
            com.google.mlkit.vision.text.Text r9 = com.google.mlkit.vision.text.internal.zzk.zza(r9, r10)
            return r9
        L54:
            r0 = move-exception
            r9 = r0
            com.google.mlkit.common.MlKitException r10 = new com.google.mlkit.common.MlKitException
            java.lang.String r0 = "Failed to run legacy text recognizer."
            r1 = 13
            r10.<init>(r0, r1, r9)
            throw r10
        L60:
            com.google.mlkit.common.MlKitException r9 = new com.google.mlkit.common.MlKitException
            java.lang.String r10 = "Waiting for the text recognition module to be downloaded. Please wait."
            r0 = 14
            r9.<init>(r10, r0)
            throw r9
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final void zzb() {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzh r0 = r4.zzd
            if (r0 == 0) goto L5
            goto L46
        L5:
            r0 = 13
            android.content.Context r1 = r4.zza     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L42 android.os.RemoteException -> L44
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r2 = com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L42 android.os.RemoteException -> L44
            java.lang.String r3 = "com.google.android.gms.vision.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.load(r1, r2, r3)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L42 android.os.RemoteException -> L44
            java.lang.String r2 = "com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator"
            android.os.IBinder r1 = r1.instantiate(r2)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L42 android.os.RemoteException -> L44
            com.google.android.gms.internal.mlkit_vision_text_common.zzk r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzj.zza(r1)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L42 android.os.RemoteException -> L44
            android.content.Context r2 = r4.zza     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L42 android.os.RemoteException -> L44
            zh4 r3 = new zh4     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L42 android.os.RemoteException -> L44
            r3.<init>(r2)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L42 android.os.RemoteException -> L44
            com.google.android.gms.internal.mlkit_vision_text_common.zzp r2 = r4.zzb     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L42 android.os.RemoteException -> L44
            com.google.android.gms.internal.mlkit_vision_text_common.zzh r1 = r1.zzd(r3, r2)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L42 android.os.RemoteException -> L44
            r4.zzd = r1     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L42 android.os.RemoteException -> L44
            if (r1 != 0) goto L46
            boolean r1 = r4.zzc     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L42 android.os.RemoteException -> L44
            if (r1 != 0) goto L46
            java.lang.String r1 = "LegacyTextDelegate"
            java.lang.String r2 = "Request OCR optional module download."
            android.util.Log.d(r1, r2)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L42 android.os.RemoteException -> L44
            android.content.Context r1 = r4.zza     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L42 android.os.RemoteException -> L44
            java.lang.String r2 = "ocr"
            com.google.mlkit.common.sdkinternal.OptionalModuleUtils.requestDownload(r1, r2)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L42 android.os.RemoteException -> L44
            r1 = 1
            r4.zzc = r1     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L42 android.os.RemoteException -> L44
            return
        L42:
            r4 = move-exception
            goto L47
        L44:
            r4 = move-exception
            goto L4f
        L46:
            return
        L47:
            com.google.mlkit.common.MlKitException r1 = new com.google.mlkit.common.MlKitException
            java.lang.String r2 = "Failed to load deprecated vision dynamite module."
            r1.<init>(r2, r0, r4)
            throw r1
        L4f:
            com.google.mlkit.common.MlKitException r1 = new com.google.mlkit.common.MlKitException
            java.lang.String r2 = "Failed to create legacy text recognizer."
            r1.<init>(r2, r0, r4)
            throw r1
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final void zzc() {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzh r0 = r3.zzd
            if (r0 == 0) goto L13
            r0.zzd()     // Catch: android.os.RemoteException -> L8
            goto L10
        L8:
            r0 = move-exception
            java.lang.String r1 = "LegacyTextDelegate"
            java.lang.String r2 = "Failed to release legacy text recognizer."
            android.util.Log.e(r1, r2, r0)
        L10:
            r0 = 0
            r3.zzd = r0
        L13:
            return
    }
}
