package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zabj {
    private static final java.util.concurrent.ExecutorService zaa = null;

    static {
            com.google.android.gms.common.util.concurrent.NumberedThreadFactory r7 = new com.google.android.gms.common.util.concurrent.NumberedThreadFactory
            java.lang.String r0 = "GAC_Executor"
            r7.<init>(r0)
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 2
            r3 = 60
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r2 = r1
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r1 = 1
            r0.allowCoreThreadTimeOut(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            com.google.android.gms.common.api.internal.zabj.zaa = r0
            return
    }

    public static java.util.concurrent.ExecutorService zaa() {
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.common.api.internal.zabj.zaa
            return r0
    }
}
