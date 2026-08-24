package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaj implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    public final int zaa;
    public final com.google.android.gms.common.api.GoogleApiClient zab;
    public final com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener zac;
    final /* synthetic */ com.google.android.gms.common.api.internal.zak zad;

    public zaj(com.google.android.gms.common.api.internal.zak r1, int r2, com.google.android.gms.common.api.GoogleApiClient r3, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r4) {
            r0 = this;
            r0.zad = r1
            r0.<init>()
            r0.zaa = r2
            r0.zab = r3
            r0.zac = r4
            return
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r4) {
            r3 = this;
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "AutoManageHelper"
            java.lang.String r2 = "beginFailureResolution for "
            java.lang.String r0 = r2.concat(r0)
            android.util.Log.d(r1, r0)
            int r0 = r3.zaa
            com.google.android.gms.common.api.internal.zak r3 = r3.zad
            r3.zah(r4, r0)
            return
    }
}
