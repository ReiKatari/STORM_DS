package com.google.mlkit.common.sdkinternal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MLTaskExecutor {
    private static final java.lang.Object zza = null;
    private static com.google.mlkit.common.sdkinternal.MLTaskExecutor zzb;
    private final android.os.Handler zzc;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.mlkit.common.sdkinternal.MLTaskExecutor.zza = r0
            return
    }

    private MLTaskExecutor(android.os.Looper r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.mlkit_common.zza r0 = new com.google.android.gms.internal.mlkit_common.zza
            r0.<init>(r2)
            r1.zzc = r0
            return
    }

    public static com.google.mlkit.common.sdkinternal.MLTaskExecutor getInstance() {
            java.lang.Object r0 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.zza
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r1 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.zzb     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L21
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "MLHandler"
            r3 = 9
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1f
            r1.start()     // Catch: java.lang.Throwable -> L1f
            android.os.Looper r1 = r1.getLooper()     // Catch: java.lang.Throwable -> L1f
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r2 = new com.google.mlkit.common.sdkinternal.MLTaskExecutor     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1f
            com.google.mlkit.common.sdkinternal.MLTaskExecutor.zzb = r2     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r1 = move-exception
            goto L25
        L21:
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r1 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.zzb     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return r1
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
    }

    public static java.util.concurrent.Executor workerThreadExecutor() {
            com.google.mlkit.common.sdkinternal.zzh r0 = com.google.mlkit.common.sdkinternal.zzh.zza
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.Handler zza(com.google.mlkit.common.sdkinternal.MLTaskExecutor r0) {
            android.os.Handler r0 = r0.zzc
            return r0
    }

    public android.os.Handler getHandler() {
            r0 = this;
            android.os.Handler r0 = r0.zzc
            return r0
    }

    public <ResultT> com.google.android.gms.tasks.Task<ResultT> scheduleCallable(java.util.concurrent.Callable<ResultT> r3) {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            com.google.mlkit.common.sdkinternal.zzf r1 = new com.google.mlkit.common.sdkinternal.zzf
            r1.<init>(r3, r0)
            r2.scheduleRunnable(r1)
            com.google.android.gms.tasks.Task r2 = r0.getTask()
            return r2
    }

    public void scheduleRunnable(java.lang.Runnable r1) {
            r0 = this;
            java.util.concurrent.Executor r0 = workerThreadExecutor()
            r0.execute(r1)
            return
    }

    public void scheduleRunnableDelayed(java.lang.Runnable r1, long r2) {
            r0 = this;
            android.os.Handler r0 = r0.zzc
            r0.postDelayed(r1, r2)
            return
    }

    public <ResultT> com.google.android.gms.tasks.Task<ResultT> scheduleTaskCallable(java.util.concurrent.Callable<com.google.android.gms.tasks.Task<ResultT>> r2) {
            r1 = this;
            com.google.android.gms.tasks.Task r1 = r1.scheduleCallable(r2)
            java.util.concurrent.Executor r2 = com.google.android.gms.internal.mlkit_common.zzaw.zza()
            com.google.mlkit.common.sdkinternal.zzg r0 = new com.google.mlkit.common.sdkinternal.zzg
            r0.<init>()
            com.google.android.gms.tasks.Task r1 = r1.continueWithTask(r2, r0)
            return r1
    }
}
