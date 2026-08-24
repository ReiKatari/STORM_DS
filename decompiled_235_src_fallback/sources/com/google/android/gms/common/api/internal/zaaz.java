package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaaz implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zab;
    final /* synthetic */ com.google.android.gms.common.api.internal.zabe zac;

    public zaaz(com.google.android.gms.common.api.internal.zabe r1, java.util.concurrent.atomic.AtomicReference r2, com.google.android.gms.common.api.internal.StatusPendingResult r3) {
            r0 = this;
            r0.zac = r1
            r0.zaa = r2
            r0.zab = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r3 = r2.zaa
            java.lang.Object r3 = r3.get()
            com.google.android.gms.common.api.GoogleApiClient r3 = (com.google.android.gms.common.api.GoogleApiClient) r3
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.common.api.GoogleApiClient r3 = (com.google.android.gms.common.api.GoogleApiClient) r3
            com.google.android.gms.common.api.internal.StatusPendingResult r0 = r2.zab
            com.google.android.gms.common.api.internal.zabe r2 = r2.zac
            r1 = 1
            com.google.android.gms.common.api.internal.zabe.zah(r2, r3, r0, r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int r1) {
            r0 = this;
            return
    }
}
