package com.google.mlkit.common.sdkinternal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class ModelResource {
    protected final com.google.mlkit.common.sdkinternal.TaskQueue taskQueue;
    private final java.util.concurrent.atomic.AtomicInteger zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb;

    public ModelResource() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.zza = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r2.zzb = r0
            com.google.mlkit.common.sdkinternal.TaskQueue r0 = new com.google.mlkit.common.sdkinternal.TaskQueue
            r0.<init>()
            r2.taskQueue = r0
            return
    }

    public ModelResource(com.google.mlkit.common.sdkinternal.TaskQueue r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.zza = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r2.zzb = r0
            r2.taskQueue = r3
            return
    }

    public <T> com.google.android.gms.tasks.Task<T> callAfterLoad(java.util.concurrent.Executor r8, java.util.concurrent.Callable<T> r9, com.google.android.gms.tasks.CancellationToken r10) {
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r7.zza
            int r0 = r0.get()
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            boolean r0 = r10.isCancellationRequested()
            if (r0 == 0) goto L19
            com.google.android.gms.tasks.Task r7 = com.google.android.gms.tasks.Tasks.forCanceled()
            return r7
        L19:
            com.google.android.gms.tasks.CancellationTokenSource r3 = new com.google.android.gms.tasks.CancellationTokenSource
            r3.<init>()
            com.google.android.gms.tasks.TaskCompletionSource r5 = new com.google.android.gms.tasks.TaskCompletionSource
            com.google.android.gms.tasks.CancellationToken r0 = r3.getToken()
            r5.<init>(r0)
            com.google.mlkit.common.sdkinternal.zzm r6 = new com.google.mlkit.common.sdkinternal.zzm
            r6.<init>(r8, r10, r3, r5)
            com.google.mlkit.common.sdkinternal.TaskQueue r8 = r7.taskQueue
            com.google.mlkit.common.sdkinternal.zzn r0 = new com.google.mlkit.common.sdkinternal.zzn
            r1 = r7
            r4 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r8.submit(r6, r0)
            com.google.android.gms.tasks.Task r7 = r5.getTask()
            return r7
    }

    public boolean isLoaded() {
            r0 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.zzb
            boolean r0 = r0.get()
            return r0
    }

    public abstract void load();

    public void pin() {
            r0 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r0.zza
            r0.incrementAndGet()
            return
    }

    public abstract void release();

    public void unpin(java.util.concurrent.Executor r1) {
            r0 = this;
            r0.unpinWithTask(r1)
            return
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unpinWithTask(java.util.concurrent.Executor r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.zza
            int r0 = r0.get()
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            com.google.mlkit.common.sdkinternal.zzl r1 = new com.google.mlkit.common.sdkinternal.zzl
            r1.<init>(r2, r0)
            com.google.mlkit.common.sdkinternal.TaskQueue r2 = r2.taskQueue
            r2.submit(r3, r1)
            com.google.android.gms.tasks.Task r2 = r0.getTask()
            return r2
    }

    public final /* synthetic */ void zza(com.google.android.gms.tasks.CancellationToken r3, com.google.android.gms.tasks.CancellationTokenSource r4, java.util.concurrent.Callable r5, com.google.android.gms.tasks.TaskCompletionSource r6) {
            r2 = this;
            boolean r0 = r3.isCancellationRequested()
            if (r0 == 0) goto La
            r4.cancel()
            return
        La:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzb     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L1e
            boolean r0 = r0.get()     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L1e
            if (r0 != 0) goto L20
            r2.load()     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L1e
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.zzb     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L1e
            r0 = 1
            r2.set(r0)     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L1e
            goto L20
        L1c:
            r2 = move-exception
            goto L46
        L1e:
            r2 = move-exception
            goto L3c
        L20:
            boolean r2 = r3.isCancellationRequested()     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L1e
            if (r2 == 0) goto L2a
            r4.cancel()     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L1e
            return
        L2a:
            java.lang.Object r2 = r5.call()     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L1e
            boolean r5 = r3.isCancellationRequested()     // Catch: java.lang.Exception -> L1c
            if (r5 == 0) goto L38
            r4.cancel()     // Catch: java.lang.Exception -> L1c
            return
        L38:
            r6.setResult(r2)     // Catch: java.lang.Exception -> L1c
            return
        L3c:
            com.google.mlkit.common.MlKitException r5 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Exception -> L1c
            java.lang.String r0 = "Internal error has occurred when executing ML Kit tasks"
            r1 = 13
            r5.<init>(r0, r1, r2)     // Catch: java.lang.Exception -> L1c
            throw r5     // Catch: java.lang.Exception -> L1c
        L46:
            boolean r3 = r3.isCancellationRequested()
            if (r3 == 0) goto L50
            r4.cancel()
            return
        L50:
            r6.setException(r2)
            return
    }

    public final /* synthetic */ void zzb(com.google.android.gms.tasks.TaskCompletionSource r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r3.zza
            int r0 = r0.decrementAndGet()
            r1 = 0
            if (r0 < 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = r1
        Lc:
            com.google.android.gms.common.internal.Preconditions.checkState(r2)
            if (r0 != 0) goto L19
            r3.release()
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.zzb
            r3.set(r1)
        L19:
            com.google.android.gms.internal.mlkit_common.zzrr.zza()
            r3 = 0
            r4.setResult(r3)
            return
    }
}
