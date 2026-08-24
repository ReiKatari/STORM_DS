package com.google.mlkit.vision.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MobileVisionBase<DetectionResultT> implements java.io.Closeable, defpackage.gu3 {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.common.internal.GmsLogger zzb = null;
    private final java.util.concurrent.atomic.AtomicBoolean zzc;
    private final com.google.mlkit.common.sdkinternal.MLTask zzd;
    private final com.google.android.gms.tasks.CancellationTokenSource zze;
    private final java.util.concurrent.Executor zzf;
    private final com.google.android.gms.tasks.Task zzg;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "MobileVisionBase"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.mlkit.vision.common.internal.MobileVisionBase.zzb = r0
            return
    }

    public MobileVisionBase(com.google.mlkit.common.sdkinternal.MLTask<DetectionResultT, com.google.mlkit.vision.common.InputImage> r3, java.util.concurrent.Executor r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.zzc = r0
            r2.zzd = r3
            com.google.android.gms.tasks.CancellationTokenSource r0 = new com.google.android.gms.tasks.CancellationTokenSource
            r0.<init>()
            r2.zze = r0
            r2.zzf = r4
            r3.pin()
            com.google.mlkit.vision.common.internal.zzb r1 = com.google.mlkit.vision.common.internal.zzb.zza
            com.google.android.gms.tasks.CancellationToken r0 = r0.getToken()
            com.google.android.gms.tasks.Task r3 = r3.callAfterLoad(r4, r1, r0)
            com.google.mlkit.vision.common.internal.zzc r4 = com.google.mlkit.vision.common.internal.zzc.zza
            com.google.android.gms.tasks.Task r3 = r3.addOnFailureListener(r4)
            r2.zzg = r3
            return
    }

    public static /* synthetic */ void zzc(java.lang.Exception r3) {
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.vision.common.internal.MobileVisionBase.zzb
            java.lang.String r1 = "MobileVisionBase"
            java.lang.String r2 = "Error preloading model resource"
            r0.e(r1, r2, r3)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @defpackage.ql4(defpackage.st3.ON_DESTROY)
    public synchronized void close() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzc     // Catch: java.lang.Throwable -> L18
            r1 = 1
            boolean r0 = r0.getAndSet(r1)     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1a
            com.google.android.gms.tasks.CancellationTokenSource r0 = r2.zze     // Catch: java.lang.Throwable -> L18
            r0.cancel()     // Catch: java.lang.Throwable -> L18
            com.google.mlkit.common.sdkinternal.MLTask r0 = r2.zzd     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.Executor r1 = r2.zzf     // Catch: java.lang.Throwable -> L18
            r0.unpin(r1)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            return
        L18:
            r0 = move-exception
            goto L1c
        L1a:
            monitor-exit(r2)
            return
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    public synchronized com.google.android.gms.tasks.Task<java.lang.Void> closeWithTask() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzc     // Catch: java.lang.Throwable -> L19
            r1 = 1
            boolean r0 = r0.getAndSet(r1)     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L1b
            com.google.android.gms.tasks.CancellationTokenSource r0 = r2.zze     // Catch: java.lang.Throwable -> L19
            r0.cancel()     // Catch: java.lang.Throwable -> L19
            com.google.mlkit.common.sdkinternal.MLTask r0 = r2.zzd     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.Executor r1 = r2.zzf     // Catch: java.lang.Throwable -> L19
            com.google.android.gms.tasks.Task r0 = r0.unpinWithTask(r1)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return r0
        L19:
            r0 = move-exception
            goto L22
        L1b:
            r0 = 0
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r0)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    public synchronized com.google.android.gms.tasks.Task<java.lang.Void> getInitTaskBase() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.tasks.Task r0 = r1.zzg     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public com.google.android.gms.tasks.Task<DetectionResultT> process(android.graphics.Bitmap r1, int r2) {
            r0 = this;
            com.google.mlkit.vision.common.InputImage r1 = com.google.mlkit.vision.common.InputImage.fromBitmap(r1, r2)
            com.google.android.gms.tasks.Task r0 = r0.processBase(r1)
            return r0
    }

    public com.google.android.gms.tasks.Task<DetectionResultT> process(android.media.Image r1, int r2) {
            r0 = this;
            com.google.mlkit.vision.common.InputImage r1 = com.google.mlkit.vision.common.InputImage.fromMediaImage(r1, r2)
            com.google.android.gms.tasks.Task r0 = r0.processBase(r1)
            return r0
    }

    public com.google.android.gms.tasks.Task<DetectionResultT> process(android.media.Image r1, int r2, android.graphics.Matrix r3) {
            r0 = this;
            com.google.mlkit.vision.common.InputImage r1 = com.google.mlkit.vision.common.InputImage.fromMediaImage(r1, r2, r3)
            com.google.android.gms.tasks.Task r0 = r0.processBase(r1)
            return r0
    }

    public com.google.android.gms.tasks.Task<DetectionResultT> process(java.nio.ByteBuffer r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            com.google.mlkit.vision.common.InputImage r1 = com.google.mlkit.vision.common.InputImage.fromByteBuffer(r1, r2, r3, r4, r5)
            com.google.android.gms.tasks.Task r0 = r0.processBase(r1)
            return r0
    }

    public synchronized com.google.android.gms.tasks.Task<DetectionResultT> processBase(com.google.mlkit.vision.common.InputImage r4) {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "InputImage can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzc     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            com.google.mlkit.common.MlKitException r4 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "This detector is already closed!"
            r1 = 14
            r4.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.forException(r4)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r4
        L1d:
            r4 = move-exception
            goto L50
        L1f:
            int r0 = r4.getWidth()     // Catch: java.lang.Throwable -> L1d
            r1 = 32
            if (r0 < r1) goto L42
            int r0 = r4.getHeight()     // Catch: java.lang.Throwable -> L1d
            if (r0 < r1) goto L42
            com.google.mlkit.common.sdkinternal.MLTask r0 = r3.zzd     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.Executor r1 = r3.zzf     // Catch: java.lang.Throwable -> L1d
            com.google.mlkit.vision.common.internal.zza r2 = new com.google.mlkit.vision.common.internal.zza     // Catch: java.lang.Throwable -> L1d
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.CancellationTokenSource r4 = r3.zze     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.CancellationToken r4 = r4.getToken()     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.Task r4 = r0.callAfterLoad(r1, r2, r4)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r4
        L42:
            com.google.mlkit.common.MlKitException r4 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "InputImage width and height should be at least 32!"
            r1 = 3
            r4.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.forException(r4)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r4
        L50:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }

    public synchronized com.google.android.gms.tasks.Task<DetectionResultT> processBase(defpackage.p64 r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "MlImage can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.zzc     // Catch: java.lang.Throwable -> L1d
            boolean r3 = r3.get()     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L1f
            com.google.mlkit.common.MlKitException r3 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "This detector is already closed!"
            r1 = 14
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.forException(r3)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return r3
        L1d:
            r3 = move-exception
            goto L21
        L1f:
            r3 = 0
            throw r3     // Catch: java.lang.Throwable -> L1d
        L21:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    public final /* synthetic */ java.lang.Object zza(com.google.mlkit.vision.common.InputImage r4) {
            r3 = this;
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.String r1 = "detectorTaskWithResource#run"
            com.google.android.gms.internal.mlkit_vision_common.zzlx r1 = com.google.android.gms.internal.mlkit_vision_common.zzlx.zze(r1)
            r1.zzb()
            com.google.mlkit.common.sdkinternal.MLTask r3 = r3.zzd     // Catch: java.lang.Throwable -> L15
            java.lang.Object r3 = r3.run(r4)     // Catch: java.lang.Throwable -> L15
            r1.close()
            return r3
        L15:
            r3 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L1a
            goto L2c
        L1a:
            r4 = move-exception
            java.lang.String r1 = "addSuppressed"
            java.lang.Class[] r2 = new java.lang.Class[]{r0}     // Catch: java.lang.Exception -> L2c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L2c
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L2c
            r0.invoke(r3, r4)     // Catch: java.lang.Exception -> L2c
        L2c:
            throw r3
    }

    public final /* synthetic */ java.lang.Object zzb(defpackage.p64 r2) {
            r1 = this;
            com.google.mlkit.vision.common.InputImage r2 = com.google.mlkit.vision.common.internal.CommonConvertUtils.convertMlImagetoInputImage(r2)
            if (r2 == 0) goto Ld
            com.google.mlkit.common.sdkinternal.MLTask r1 = r1.zzd
            java.lang.Object r1 = r1.run(r2)
            return r1
        Ld:
            com.google.mlkit.common.MlKitException r1 = new com.google.mlkit.common.MlKitException
            java.lang.String r2 = "Current type of MlImage is not supported."
            r0 = 13
            r1.<init>(r2, r0)
            throw r1
    }
}
