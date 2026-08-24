package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zat implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    public final com.google.android.gms.common.api.Api zaa;
    private final boolean zab;
    private com.google.android.gms.common.api.internal.zau zac;

    public zat(com.google.android.gms.common.api.Api r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    private final com.google.android.gms.common.api.internal.zau zab() {
            r2 = this;
            com.google.android.gms.common.api.internal.zau r0 = r2.zac
            java.lang.String r1 = "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.api.internal.zau r2 = r2.zac
            return r2
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.zau r0 = r0.zab()
            r0.onConnected(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            com.google.android.gms.common.api.Api r0 = r2.zaa
            boolean r1 = r2.zab
            com.google.android.gms.common.api.internal.zau r2 = r2.zab()
            r2.zaa(r3, r0, r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.zau r0 = r0.zab()
            r0.onConnectionSuspended(r1)
            return
    }

    public final void zaa(com.google.android.gms.common.api.internal.zau r1) {
            r0 = this;
            r0.zac = r1
            return
    }
}
