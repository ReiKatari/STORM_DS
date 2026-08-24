package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaat implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zaa;

    public /* synthetic */ zaat(com.google.android.gms.common.api.internal.zaaw r1, com.google.android.gms.common.api.internal.zaas r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zaaw r2 = r1.zaa
            com.google.android.gms.common.internal.ClientSettings r2 = com.google.android.gms.common.api.internal.zaaw.zal(r2)
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.internal.ClientSettings r2 = (com.google.android.gms.common.internal.ClientSettings) r2
            com.google.android.gms.common.api.internal.zaaw r2 = r1.zaa
            oz7 r2 = com.google.android.gms.common.api.internal.zaaw.zan(r2)
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            oz7 r2 = (defpackage.oz7) r2
            com.google.android.gms.common.api.internal.zaar r0 = new com.google.android.gms.common.api.internal.zaar
            com.google.android.gms.common.api.internal.zaaw r1 = r1.zaa
            r0.<init>(r1)
            r2.b(r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.zaaw r0 = r2.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaw.zap(r0)
            r0.lock()
            com.google.android.gms.common.api.internal.zaaw r0 = r2.zaa     // Catch: java.lang.Throwable -> L1c
            boolean r0 = com.google.android.gms.common.api.internal.zaaw.zay(r0, r3)     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.common.api.internal.zaaw r1 = r2.zaa
            if (r0 == 0) goto L1e
            com.google.android.gms.common.api.internal.zaaw.zaq(r1)     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.common.api.internal.zaaw r3 = r2.zaa     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.common.api.internal.zaaw.zau(r3)     // Catch: java.lang.Throwable -> L1c
            goto L21
        L1c:
            r3 = move-exception
            goto L2b
        L1e:
            com.google.android.gms.common.api.internal.zaaw.zas(r1, r3)     // Catch: java.lang.Throwable -> L1c
        L21:
            com.google.android.gms.common.api.internal.zaaw r2 = r2.zaa
            java.util.concurrent.locks.Lock r2 = com.google.android.gms.common.api.internal.zaaw.zap(r2)
            r2.unlock()
            return
        L2b:
            com.google.android.gms.common.api.internal.zaaw r2 = r2.zaa
            java.util.concurrent.locks.Lock r2 = com.google.android.gms.common.api.internal.zaaw.zap(r2)
            r2.unlock()
            throw r3
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int r1) {
            r0 = this;
            return
    }
}
