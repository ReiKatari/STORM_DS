package com.google.android.gms.common.providers;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zza implements com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory {
    public zza() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory
    public final java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor() {
            r0 = this;
            r0 = 1
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r0)
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(r0)
            return r0
    }
}
