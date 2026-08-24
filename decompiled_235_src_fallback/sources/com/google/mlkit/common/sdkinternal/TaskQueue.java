package com.google.mlkit.common.sdkinternal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class TaskQueue {
    private final java.lang.Object zza;
    private boolean zzb;
    private final java.util.Queue zzc;
    private final java.util.concurrent.atomic.AtomicReference zzd;

    public TaskQueue() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.zzc = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.zzd = r0
            return
    }

    public static /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicReference zza(com.google.mlkit.common.sdkinternal.TaskQueue r0) {
            java.util.concurrent.atomic.AtomicReference r0 = r0.zzd
            return r0
    }

    public static /* bridge */ /* synthetic */ void zzb(com.google.mlkit.common.sdkinternal.TaskQueue r0) {
            r0.zzc()
            return
    }

    private final void zzc() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            java.util.Queue r1 = r2.zzc     // Catch: java.lang.Throwable -> L10
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            r1 = 0
            r2.zzb = r1     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            goto L23
        L12:
            java.util.Queue r1 = r2.zzc     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = r1.remove()     // Catch: java.lang.Throwable -> L10
            com.google.mlkit.common.sdkinternal.zzv r1 = (com.google.mlkit.common.sdkinternal.zzv) r1     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            java.util.concurrent.Executor r0 = r1.zza
            java.lang.Runnable r1 = r1.zzb
            r2.zzd(r0, r1)
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    private final void zzd(java.util.concurrent.Executor r2, java.lang.Runnable r3) {
            r1 = this;
            com.google.mlkit.common.sdkinternal.zzt r0 = new com.google.mlkit.common.sdkinternal.zzt
            r0.<init>(r1, r3)
            r2.execute(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L9
            return
        L9:
            r1.zzc()
            return
    }

    public void checkIsRunningOnCurrentThread() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r1 = r1.zzd
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Object r1 = r1.get()
            boolean r1 = r0.equals(r1)
            com.google.android.gms.common.internal.Preconditions.checkState(r1)
            return
    }

    public void submit(java.util.concurrent.Executor r4, java.lang.Runnable r5) {
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            boolean r1 = r3.zzb     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            java.util.Queue r3 = r3.zzc     // Catch: java.lang.Throwable -> L14
            com.google.mlkit.common.sdkinternal.zzv r1 = new com.google.mlkit.common.sdkinternal.zzv     // Catch: java.lang.Throwable -> L14
            r2 = 0
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L14
            r3.add(r1)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r1 = 1
            r3.zzb = r1     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            r3.zzd(r4, r5)
            return
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }
}
