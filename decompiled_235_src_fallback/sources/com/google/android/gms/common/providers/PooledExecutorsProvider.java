package com.google.android.gms.common.providers;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@java.lang.Deprecated
/* loaded from: classes.dex */
public class PooledExecutorsProvider {
    private static com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory zza;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface PooledExecutorFactory {
        @java.lang.Deprecated
        java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    private PooledExecutorsProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static synchronized com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory getInstance() {
            java.lang.Class<com.google.android.gms.common.providers.PooledExecutorsProvider> r0 = com.google.android.gms.common.providers.PooledExecutorsProvider.class
            monitor-enter(r0)
            com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory r1 = com.google.android.gms.common.providers.PooledExecutorsProvider.zza     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.google.android.gms.common.providers.zza r1 = new com.google.android.gms.common.providers.zza     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.common.providers.PooledExecutorsProvider.zza = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory r1 = com.google.android.gms.common.providers.PooledExecutorsProvider.zza     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }
}
