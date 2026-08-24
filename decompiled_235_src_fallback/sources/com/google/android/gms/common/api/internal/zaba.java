package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaba implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zaa;

    public zaba(com.google.android.gms.common.api.internal.zabe r1, com.google.android.gms.common.api.internal.StatusPendingResult r2) {
            r0 = this;
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r0 = 8
            r2.<init>(r0)
            com.google.android.gms.common.api.internal.StatusPendingResult r1 = r1.zaa
            r1.setResult(r2)
            return
    }
}
