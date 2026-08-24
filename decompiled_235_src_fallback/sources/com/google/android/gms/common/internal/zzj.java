package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzj {
    static final java.util.concurrent.ExecutorService zza = null;

    static {
            com.google.android.gms.common.util.concurrent.NamedThreadFactory r7 = new com.google.android.gms.common.util.concurrent.NamedThreadFactory
            java.lang.String r0 = "CallbackExecutor"
            r7.<init>(r0)
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 1
            r2 = 1
            r3 = 60
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r0.allowCoreThreadTimeOut(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            com.google.android.gms.common.internal.zzj.zza = r0
            return
    }
}
