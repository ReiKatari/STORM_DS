package com.google.mlkit.vision.text.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzd implements com.google.mlkit.vision.text.internal.zzm {
    private final android.content.Context zza;
    private final com.google.mlkit.vision.text.TextRecognizerOptionsInterface zzb;
    private boolean zzc;
    private boolean zzd;
    private final com.google.android.gms.internal.mlkit_vision_text_common.zzuc zze;
    private com.google.android.gms.internal.mlkit_vision_text_common.zzuv zzf;

    public zzd(android.content.Context r1, com.google.mlkit.vision.text.TextRecognizerOptionsInterface r2, com.google.android.gms.internal.mlkit_vision_text_common.zzuc r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zze = r3
            return
    }

    private static com.google.android.gms.internal.mlkit_vision_text_common.zzvh zzd(com.google.mlkit.vision.text.TextRecognizerOptionsInterface r11, java.lang.String r12) {
            boolean r0 = r11 instanceof com.google.mlkit.vision.text.internal.zzc
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L11
            r0 = r11
            com.google.mlkit.vision.text.internal.zzc r0 = (com.google.mlkit.vision.text.internal.zzc) r0
            boolean r0 = r0.zza()
            if (r0 == 0) goto L11
            r10 = r2
            goto L12
        L11:
            r10 = r1
        L12:
            com.google.android.gms.internal.mlkit_vision_text_common.zzvh r3 = new com.google.android.gms.internal.mlkit_vision_text_common.zzvh
            java.lang.String r4 = r11.getConfigLabel()
            java.lang.String r5 = r11.getLoggingLibraryNameForOptionalModule()
            int r0 = r11.getLoggingLanguageOption()
            switch(r0) {
                case 1: goto L34;
                case 2: goto L32;
                case 3: goto L30;
                case 4: goto L2e;
                case 5: goto L2c;
                case 6: goto L2a;
                case 7: goto L27;
                case 8: goto L24;
                default: goto L23;
            }
        L23:
            goto L35
        L24:
            r2 = 9
            goto L35
        L27:
            r2 = 8
            goto L35
        L2a:
            r2 = 7
            goto L35
        L2c:
            r2 = 6
            goto L35
        L2e:
            r2 = 5
            goto L35
        L30:
            r2 = 4
            goto L35
        L32:
            r2 = 3
            goto L35
        L34:
            r2 = 2
        L35:
            int r8 = r2 + (-1)
            java.lang.String r9 = r11.getLanguageHint()
            r7 = 1
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final com.google.mlkit.vision.text.Text zza(com.google.mlkit.vision.common.InputImage r11) {
            r10 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzuv r0 = r10.zzf
            if (r0 != 0) goto L7
            r10.zzb()
        L7:
            com.google.android.gms.internal.mlkit_vision_text_common.zzuv r0 = r10.zzf
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.mlkit_vision_text_common.zzuv r0 = (com.google.android.gms.internal.mlkit_vision_text_common.zzuv) r0
            boolean r1 = r10.zzc
            r2 = 13
            if (r1 != 0) goto L34
            r0.zze()     // Catch: android.os.RemoteException -> L1c
            r1 = 1
            r10.zzc = r1     // Catch: android.os.RemoteException -> L1c
            goto L34
        L1c:
            r0 = move-exception
            r11 = r0
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r10 = r10.zzb
            java.lang.String r10 = r10.getLoggingLibraryName()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = "Failed to init text recognizer "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10, r2, r11)
            throw r0
        L34:
            com.google.android.gms.internal.mlkit_vision_text_common.zzuq r3 = new com.google.android.gms.internal.mlkit_vision_text_common.zzuq
            int r4 = r11.getFormat()
            int r5 = r11.getWidth()
            int r6 = r11.getHeight()
            int r1 = r11.getRotationDegrees()
            int r7 = com.google.mlkit.vision.common.internal.CommonConvertUtils.convertToMVRotation(r1)
            long r8 = android.os.SystemClock.elapsedRealtime()
            r3.<init>(r4, r5, r6, r7, r8)
            com.google.mlkit.vision.common.internal.ImageUtils r1 = com.google.mlkit.vision.common.internal.ImageUtils.getInstance()
            d13 r1 = r1.getImageDataWrapper(r11)
            com.google.android.gms.internal.mlkit_vision_text_common.zzvf r0 = r0.zzd(r1, r3)     // Catch: android.os.RemoteException -> L67
            com.google.mlkit.vision.text.Text r1 = new com.google.mlkit.vision.text.Text     // Catch: android.os.RemoteException -> L67
            android.graphics.Matrix r11 = r11.getCoordinatesMatrix()     // Catch: android.os.RemoteException -> L67
            r1.<init>(r0, r11)     // Catch: android.os.RemoteException -> L67
            return r1
        L67:
            r0 = move-exception
            r11 = r0
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r10 = r10.zzb
            java.lang.String r10 = r10.getLoggingLibraryName()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = "Failed to run text recognizer "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10, r2, r11)
            throw r0
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final void zzb() {
            r7 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzuv r0 = r7.zzf
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 13
            r1 = 1
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r2 = r7.zzb     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            boolean r3 = r2 instanceof com.google.mlkit.vision.text.internal.zzb     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            r4 = 0
            if (r3 == 0) goto L1c
            com.google.mlkit.vision.text.internal.zzb r2 = (com.google.mlkit.vision.text.internal.zzb) r2     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            java.lang.String r2 = r2.zza()     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            goto L1d
        L16:
            r1 = move-exception
            goto Ld7
        L19:
            r2 = move-exception
            goto Lfa
        L1c:
            r2 = r4
        L1d:
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r5 = r7.zzb     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            boolean r5 = r5.getIsThickClient()     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            java.lang.String r6 = "DecoupledTextDelegate"
            if (r5 == 0) goto L56
            java.lang.String r3 = "Start loading thick OCR module."
            android.util.Log.d(r6, r3)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            android.content.Context r3 = r7.zza     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r4 = com.google.android.gms.dynamite.DynamiteModule.PREFER_LOCAL     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r5 = r7.zzb     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            java.lang.String r5 = r5.getModuleId()     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.dynamite.DynamiteModule r3 = com.google.android.gms.dynamite.DynamiteModule.load(r3, r4, r5)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            java.lang.String r4 = "com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator"
            android.os.IBinder r3 = r3.instantiate(r4)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.internal.mlkit_vision_text_common.zzuy r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzux.zza(r3)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            android.content.Context r4 = r7.zza     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            zh4 r5 = new zh4     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            r5.<init>(r4)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r4 = r7.zzb     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.internal.mlkit_vision_text_common.zzvh r2 = zzd(r4, r2)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.internal.mlkit_vision_text_common.zzuv r2 = r3.zze(r5, r2)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            goto Lc7
        L56:
            if (r3 == 0) goto L87
            java.lang.String r3 = "Start loading custom OCR module."
            android.util.Log.d(r6, r3)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            android.content.Context r3 = r7.zza     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r5 = com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r6 = r7.zzb     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            java.lang.String r6 = r6.getModuleId()     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.dynamite.DynamiteModule r3 = com.google.android.gms.dynamite.DynamiteModule.load(r3, r5, r6)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            java.lang.String r5 = "com.google.android.gms.vision.text.mlkit.CommonTextRecognizerCreator"
            android.os.IBinder r3 = r3.instantiate(r5)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.internal.mlkit_vision_text_common.zzuu r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzut.zza(r3)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            android.content.Context r5 = r7.zza     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            zh4 r6 = new zh4     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            r6.<init>(r5)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r5 = r7.zzb     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.internal.mlkit_vision_text_common.zzvh r2 = zzd(r5, r2)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.internal.mlkit_vision_text_common.zzuv r2 = r3.zzd(r6, r4, r2)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            goto Lc7
        L87:
            java.lang.String r3 = "Start loading thin OCR module."
            android.util.Log.d(r6, r3)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            android.content.Context r3 = r7.zza     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r4 = com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r5 = r7.zzb     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            java.lang.String r5 = r5.getModuleId()     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.dynamite.DynamiteModule r3 = com.google.android.gms.dynamite.DynamiteModule.load(r3, r4, r5)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            java.lang.String r4 = "com.google.android.gms.vision.text.mlkit.TextRecognizerCreator"
            android.os.IBinder r3 = r3.instantiate(r4)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.internal.mlkit_vision_text_common.zzuy r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzux.zza(r3)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r4 = r7.zzb     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            int r4 = r4.getLoggingLanguageOption()     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            android.content.Context r5 = r7.zza
            if (r4 != r1) goto Lb8
            zh4 r2 = new zh4     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            r2.<init>(r5)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.internal.mlkit_vision_text_common.zzuv r2 = r3.zzd(r2)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            goto Lc7
        Lb8:
            zh4 r4 = new zh4     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            r4.<init>(r5)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r5 = r7.zzb     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.internal.mlkit_vision_text_common.zzvh r2 = zzd(r5, r2)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.internal.mlkit_vision_text_common.zzuv r2 = r3.zze(r4, r2)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
        Lc7:
            r7.zzf = r2     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.internal.mlkit_vision_text_common.zzuc r2 = r7.zze     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r3 = r7.zzb     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            boolean r3 = r3.getIsThickClient()     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.android.gms.internal.mlkit_vision_text_common.zzou r4 = com.google.android.gms.internal.mlkit_vision_text_common.zzou.zza     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            com.google.mlkit.vision.text.internal.LoggingUtils.zzb(r2, r3, r4)     // Catch: android.os.RemoteException -> L16 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L19
            return
        Ld7:
            com.google.android.gms.internal.mlkit_vision_text_common.zzuc r2 = r7.zze
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r3 = r7.zzb
            boolean r3 = r3.getIsThickClient()
            com.google.android.gms.internal.mlkit_vision_text_common.zzou r4 = com.google.android.gms.internal.mlkit_vision_text_common.zzou.zzC
            com.google.mlkit.vision.text.internal.LoggingUtils.zzb(r2, r3, r4)
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r7 = r7.zzb
            java.lang.String r7 = r7.getLoggingLibraryName()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            com.google.mlkit.common.MlKitException r2 = new com.google.mlkit.common.MlKitException
            java.lang.String r3 = "Failed to create text recognizer "
            java.lang.String r7 = r3.concat(r7)
            r2.<init>(r7, r0, r1)
            throw r2
        Lfa:
            com.google.android.gms.internal.mlkit_vision_text_common.zzuc r3 = r7.zze
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r4 = r7.zzb
            boolean r4 = r4.getIsThickClient()
            com.google.android.gms.internal.mlkit_vision_text_common.zzou r5 = com.google.android.gms.internal.mlkit_vision_text_common.zzou.zzB
            com.google.mlkit.vision.text.internal.LoggingUtils.zzb(r3, r4, r5)
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r3 = r7.zzb
            boolean r3 = r3.getIsThickClient()
            if (r3 != 0) goto L12b
            boolean r0 = r7.zzd
            if (r0 == 0) goto L114
            goto L121
        L114:
            android.content.Context r0 = r7.zza
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r2 = r7.zzb
            com.google.android.gms.common.Feature[] r2 = com.google.mlkit.vision.text.internal.TextOptionalModuleUtils.zza(r2)
            com.google.mlkit.common.sdkinternal.OptionalModuleUtils.requestDownload(r0, r2)
            r7.zzd = r1
        L121:
            com.google.mlkit.common.MlKitException r7 = new com.google.mlkit.common.MlKitException
            java.lang.String r0 = "Waiting for the text optional module to be downloaded. Please wait."
            r1 = 14
            r7.<init>(r0, r1)
            throw r7
        L12b:
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r7 = r7.zzb
            com.google.mlkit.common.MlKitException r1 = new com.google.mlkit.common.MlKitException
            java.lang.String r7 = r7.getLoggingLibraryName()
            java.lang.String r3 = r2.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to load text module "
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r7 = ". "
            r4.append(r7)
            r4.append(r3)
            java.lang.String r7 = r4.toString()
            r1.<init>(r7, r0, r2)
            throw r1
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final void zzc() {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzuv r0 = r3.zzf
            if (r0 == 0) goto L21
            r0.zzf()     // Catch: android.os.RemoteException -> L8
            goto L1e
        L8:
            r0 = move-exception
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r1 = r3.zzb
            java.lang.String r1 = r1.getLoggingLibraryName()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Failed to release text recognizer "
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "DecoupledTextDelegate"
            android.util.Log.e(r2, r1, r0)
        L1e:
            r0 = 0
            r3.zzf = r0
        L21:
            r0 = 0
            r3.zzc = r0
            return
    }
}
