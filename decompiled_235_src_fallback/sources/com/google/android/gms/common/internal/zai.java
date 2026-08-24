package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zai implements com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.OnConnectionFailedListener zaa;

    public zai(com.google.android.gms.common.api.internal.OnConnectionFailedListener r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.OnConnectionFailedListener r0 = r0.zaa
            r0.onConnectionFailed(r1)
            return
    }
}
