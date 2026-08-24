package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zah implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ com.google.android.gms.common.api.internal.ConnectionCallbacks zaa;

    public zah(com.google.android.gms.common.api.internal.ConnectionCallbacks r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.ConnectionCallbacks r0 = r0.zaa
            r0.onConnected(r1)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.ConnectionCallbacks r0 = r0.zaa
            r0.onConnectionSuspended(r1)
            return
    }
}
