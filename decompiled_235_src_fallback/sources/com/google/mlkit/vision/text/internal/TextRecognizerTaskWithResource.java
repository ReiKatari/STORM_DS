package com.google.mlkit.vision.text.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class TextRecognizerTaskWithResource extends com.google.mlkit.common.sdkinternal.MLTask<com.google.mlkit.vision.text.Text, com.google.mlkit.vision.common.InputImage> {
    private static final com.google.mlkit.common.sdkinternal.TaskQueue taskQueue = null;
    static boolean zza = true;
    private static final com.google.mlkit.vision.common.internal.ImageUtils zzb = null;
    private final com.google.mlkit.vision.text.internal.zzm zzc;
    private final com.google.android.gms.internal.mlkit_vision_text_common.zzuc zzd;
    private final com.google.android.gms.internal.mlkit_vision_text_common.zzue zze;
    private final com.google.mlkit.vision.text.TextRecognizerOptionsInterface zzf;

    static {
            com.google.mlkit.vision.common.internal.ImageUtils r0 = com.google.mlkit.vision.common.internal.ImageUtils.getInstance()
            com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource.zzb = r0
            com.google.mlkit.common.sdkinternal.TaskQueue r0 = new com.google.mlkit.common.sdkinternal.TaskQueue
            r0.<init>()
            com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource.taskQueue = r0
            return
    }

    public TextRecognizerTaskWithResource(com.google.android.gms.internal.mlkit_vision_text_common.zzuc r3, com.google.mlkit.vision.text.internal.zzm r4, com.google.mlkit.vision.text.TextRecognizerOptionsInterface r5) {
            r2 = this;
            int r0 = r5.getLoggingLanguageOption()
            r1 = 8
            if (r0 == r1) goto L13
            int r0 = r5.getLoggingLanguageOption()
            r1 = 7
            if (r0 != r1) goto L10
            goto L13
        L10:
            com.google.mlkit.common.sdkinternal.TaskQueue r0 = com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource.taskQueue
            goto L18
        L13:
            com.google.mlkit.common.sdkinternal.TaskQueue r0 = new com.google.mlkit.common.sdkinternal.TaskQueue
            r0.<init>()
        L18:
            r2.<init>(r0)
            r2.zzd = r3
            r2.zzc = r4
            com.google.mlkit.common.sdkinternal.MlKitContext r3 = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance()
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.internal.mlkit_vision_text_common.zzue r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzue.zza(r3)
            r2.zze = r3
            r2.zzf = r5
            return
    }

    private final void zzf(com.google.android.gms.internal.mlkit_vision_text_common.zzou r13, long r14, com.google.mlkit.vision.common.InputImage r16) {
            r12 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r0 - r14
            com.google.mlkit.vision.text.internal.zzq r0 = new com.google.mlkit.vision.text.internal.zzq
            r1 = r12
            r4 = r13
            r5 = r16
            r0.<init>(r1, r2, r4, r5)
            com.google.android.gms.internal.mlkit_vision_text_common.zzuc r4 = r12.zzd
            com.google.android.gms.internal.mlkit_vision_text_common.zzov r5 = com.google.android.gms.internal.mlkit_vision_text_common.zzov.zzf
            r4.zzf(r0, r5)
            com.google.android.gms.internal.mlkit_vision_text_common.zzeq r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzeq
            r0.<init>()
            r0.zza(r13)
            boolean r4 = com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource.zza
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.zzb(r4)
            com.google.android.gms.internal.mlkit_vision_text_common.zzsa r4 = new com.google.android.gms.internal.mlkit_vision_text_common.zzsa
            r4.<init>()
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r5 = r12.zzf
            int r5 = r5.getLoggingLanguageOption()
            com.google.android.gms.internal.mlkit_vision_text_common.zzsb r5 = com.google.mlkit.vision.text.internal.LoggingUtils.zza(r5)
            r4.zza(r5)
            com.google.android.gms.internal.mlkit_vision_text_common.zzsd r4 = r4.zzc()
            r0.zzc(r4)
            com.google.android.gms.internal.mlkit_vision_text_common.zzes r5 = r0.zzd()
            com.google.mlkit.vision.text.internal.zzr r8 = new com.google.mlkit.vision.text.internal.zzr
            r8.<init>(r12)
            com.google.android.gms.internal.mlkit_vision_text_common.zzov r4 = com.google.android.gms.internal.mlkit_vision_text_common.zzov.zzbi
            java.util.concurrent.Executor r0 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor()
            r6 = r2
            com.google.android.gms.internal.mlkit_vision_text_common.zzua r2 = new com.google.android.gms.internal.mlkit_vision_text_common.zzua
            com.google.android.gms.internal.mlkit_vision_text_common.zzuc r3 = r12.zzd
            r2.<init>(r3, r4, r5, r6, r8)
            r4 = r2
            r2 = r6
            r0.execute(r4)
            long r10 = java.lang.System.currentTimeMillis()
            long r2 = r10 - r2
            com.google.android.gms.internal.mlkit_vision_text_common.zzue r5 = r12.zze
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r0 = r12.zzf
            int r6 = r0.getLoggingEventId()
            int r7 = r13.zza()
            r8 = r2
            r5.zzc(r6, r7, r8, r10)
            return
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final synchronized void load() {
            r1 = this;
            monitor-enter(r1)
            com.google.mlkit.vision.text.internal.zzm r0 = r1.zzc     // Catch: java.lang.Throwable -> L8
            r0.zzb()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final synchronized void release() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource.zza = r0     // Catch: java.lang.Throwable -> Lb
            com.google.mlkit.vision.text.internal.zzm r0 = r1.zzc     // Catch: java.lang.Throwable -> Lb
            r0.zzc()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    public final /* bridge */ /* synthetic */ com.google.mlkit.vision.text.Text run(com.google.mlkit.vision.common.InputImage r1) {
            r0 = this;
            com.google.mlkit.vision.common.InputImage r1 = (com.google.mlkit.vision.common.InputImage) r1
            com.google.mlkit.vision.text.Text r0 = r0.zze(r1)
            return r0
    }

    public final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_common.zztr zzc(long r3, com.google.android.gms.internal.mlkit_vision_text_common.zzou r5, com.google.mlkit.vision.common.InputImage r6) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzrx r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzrx
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzoh r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zzoh
            r1.<init>()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.zzc(r3)
            r1.zzd(r5)
            boolean r3 = com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource.zza
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1.zze(r3)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r1.zza(r3)
            r1.zzb(r3)
            com.google.android.gms.internal.mlkit_vision_text_common.zzoj r3 = r1.zzf()
            r0.zzd(r3)
            com.google.mlkit.vision.common.internal.ImageUtils r3 = com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource.zzb
            int r4 = r3.getMobileVisionImageFormat(r6)
            int r3 = r3.getMobileVisionImageSize(r6)
            com.google.android.gms.internal.mlkit_vision_text_common.zzoa r5 = new com.google.android.gms.internal.mlkit_vision_text_common.zzoa
            r5.<init>()
            r6 = -1
            if (r4 == r6) goto L5e
            r6 = 35
            if (r4 == r6) goto L5b
            r6 = 842094169(0x32315659, float:1.0322389E-8)
            if (r4 == r6) goto L58
            r6 = 16
            if (r4 == r6) goto L55
            r6 = 17
            if (r4 == r6) goto L52
            com.google.android.gms.internal.mlkit_vision_text_common.zzob r4 = com.google.android.gms.internal.mlkit_vision_text_common.zzob.zza
            goto L60
        L52:
            com.google.android.gms.internal.mlkit_vision_text_common.zzob r4 = com.google.android.gms.internal.mlkit_vision_text_common.zzob.zzc
            goto L60
        L55:
            com.google.android.gms.internal.mlkit_vision_text_common.zzob r4 = com.google.android.gms.internal.mlkit_vision_text_common.zzob.zzb
            goto L60
        L58:
            com.google.android.gms.internal.mlkit_vision_text_common.zzob r4 = com.google.android.gms.internal.mlkit_vision_text_common.zzob.zzd
            goto L60
        L5b:
            com.google.android.gms.internal.mlkit_vision_text_common.zzob r4 = com.google.android.gms.internal.mlkit_vision_text_common.zzob.zze
            goto L60
        L5e:
            com.google.android.gms.internal.mlkit_vision_text_common.zzob r4 = com.google.android.gms.internal.mlkit_vision_text_common.zzob.zzg
        L60:
            r5.zza(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.zzb(r3)
            com.google.android.gms.internal.mlkit_vision_text_common.zzod r3 = r5.zzd()
            r0.zzc(r3)
            com.google.android.gms.internal.mlkit_vision_text_common.zzsa r3 = new com.google.android.gms.internal.mlkit_vision_text_common.zzsa
            r3.<init>()
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r4 = r2.zzf
            int r4 = r4.getLoggingLanguageOption()
            com.google.android.gms.internal.mlkit_vision_text_common.zzsb r4 = com.google.mlkit.vision.text.internal.LoggingUtils.zza(r4)
            r3.zza(r4)
            com.google.android.gms.internal.mlkit_vision_text_common.zzsd r3 = r3.zzc()
            r0.zze(r3)
            com.google.android.gms.internal.mlkit_vision_text_common.zzrz r3 = r0.zzf()
            com.google.android.gms.internal.mlkit_vision_text_common.zzow r4 = new com.google.android.gms.internal.mlkit_vision_text_common.zzow
            r4.<init>()
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r2 = r2.zzf
            boolean r2 = r2.getIsThickClient()
            if (r2 == 0) goto L9e
            com.google.android.gms.internal.mlkit_vision_text_common.zzot r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzot.zzc
            goto La0
        L9e:
            com.google.android.gms.internal.mlkit_vision_text_common.zzot r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzot.zzb
        La0:
            r4.zze(r2)
            r4.zzh(r3)
            com.google.android.gms.internal.mlkit_vision_text_common.zztr r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzuf.zzf(r4)
            return r2
    }

    public final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_common.zztr zzd(com.google.android.gms.internal.mlkit_vision_text_common.zzes r2, int r3, com.google.android.gms.internal.mlkit_vision_text_common.zznw r4) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzow r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzow
            r0.<init>()
            com.google.mlkit.vision.text.TextRecognizerOptionsInterface r1 = r1.zzf
            boolean r1 = r1.getIsThickClient()
            if (r1 == 0) goto L10
            com.google.android.gms.internal.mlkit_vision_text_common.zzot r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzot.zzc
            goto L12
        L10:
            com.google.android.gms.internal.mlkit_vision_text_common.zzot r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzot.zzb
        L12:
            r0.zze(r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzep r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zzep
            r1.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.zza(r3)
            r1.zzc(r2)
            r1.zzb(r4)
            com.google.android.gms.internal.mlkit_vision_text_common.zzeu r1 = r1.zze()
            r0.zzd(r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zztr r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzuf.zzf(r0)
            return r1
    }

    public final synchronized com.google.mlkit.vision.text.Text zze(com.google.mlkit.vision.common.InputImage r6) {
            r5 = this;
            monitor-enter(r5)
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L15
            com.google.mlkit.vision.text.internal.zzm r2 = r5.zzc     // Catch: java.lang.Throwable -> L15 com.google.mlkit.common.MlKitException -> L17
            com.google.mlkit.vision.text.Text r2 = r2.zza(r6)     // Catch: java.lang.Throwable -> L15 com.google.mlkit.common.MlKitException -> L17
            com.google.android.gms.internal.mlkit_vision_text_common.zzou r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzou.zza     // Catch: java.lang.Throwable -> L15 com.google.mlkit.common.MlKitException -> L17
            r5.zzf(r3, r0, r6)     // Catch: java.lang.Throwable -> L15 com.google.mlkit.common.MlKitException -> L17
            r3 = 0
            com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource.zza = r3     // Catch: java.lang.Throwable -> L15 com.google.mlkit.common.MlKitException -> L17
            monitor-exit(r5)
            return r2
        L15:
            r6 = move-exception
            goto L29
        L17:
            r2 = move-exception
            int r3 = r2.getErrorCode()     // Catch: java.lang.Throwable -> L15
            r4 = 14
            if (r3 != r4) goto L23
            com.google.android.gms.internal.mlkit_vision_text_common.zzou r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzou.zzk     // Catch: java.lang.Throwable -> L15
            goto L25
        L23:
            com.google.android.gms.internal.mlkit_vision_text_common.zzou r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzou.zzab     // Catch: java.lang.Throwable -> L15
        L25:
            r5.zzf(r3, r0, r6)     // Catch: java.lang.Throwable -> L15
            throw r2     // Catch: java.lang.Throwable -> L15
        L29:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L15
            throw r6
    }
}
