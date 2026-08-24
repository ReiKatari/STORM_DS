package com.google.mlkit.common.sdkinternal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MlKitThreadPool extends com.google.android.gms.internal.mlkit_common.zzav {
    private static final java.lang.ThreadLocal zza = null;
    private final java.util.concurrent.ThreadPoolExecutor zzb;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.google.mlkit.common.sdkinternal.MlKitThreadPool.zza = r0
            return
    }

    public MlKitThreadPool() {
            r10 = this;
            r10.<init>()
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            int r3 = r1.availableProcessors()
            java.util.concurrent.ThreadPoolExecutor r2 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue
            r8.<init>()
            com.google.mlkit.common.sdkinternal.zzj r9 = new com.google.mlkit.common.sdkinternal.zzj
            r9.<init>(r0)
            r5 = 60
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r4 = r3
            r2.<init>(r3, r4, r5, r7, r8, r9)
            r10.zzb = r2
            r10 = 1
            r2.allowCoreThreadTimeOut(r10)
            return
    }

    public static /* synthetic */ void zzc(java.lang.Runnable r1) {
            java.lang.ThreadLocal r0 = com.google.mlkit.common.sdkinternal.MlKitThreadPool.zza
            java.lang.Object r0 = r0.get()
            java.util.Deque r0 = (java.util.Deque) r0
            zze(r0, r1)
            return
    }

    public static /* synthetic */ void zzd(java.lang.Runnable r2) {
            java.lang.ThreadLocal r0 = com.google.mlkit.common.sdkinternal.MlKitThreadPool.zza
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.set(r1)
            r2.run()
            return
    }

    private static void zze(java.util.Deque r2, java.lang.Runnable r3) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r2.add(r3)
            int r0 = r2.size()
            r1 = 1
            if (r0 > r1) goto L1b
        Ld:
            r3.run()
            r2.removeFirst()
            java.lang.Object r3 = r2.peekFirst()
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            if (r3 != 0) goto Ld
        L1b:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r4) {
            r3 = this;
            java.lang.ThreadLocal r0 = com.google.mlkit.common.sdkinternal.MlKitThreadPool.zza
            java.lang.Object r0 = r0.get()
            java.util.Deque r0 = (java.util.Deque) r0
            if (r0 == 0) goto L15
            int r1 = r0.size()
            r2 = 1
            if (r1 > r2) goto L15
            zze(r0, r4)
            return
        L15:
            java.util.concurrent.ThreadPoolExecutor r3 = r3.zzb
            com.google.mlkit.common.sdkinternal.zzi r0 = new com.google.mlkit.common.sdkinternal.zzi
            r0.<init>(r4)
            r3.execute(r0)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, com.google.android.gms.internal.mlkit_common.zzx
    public final /* synthetic */ java.lang.Object zza() {
            r0 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav
    public final java.util.concurrent.ExecutorService zzb() {
            r0 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r0.zzb
            return r0
    }
}
