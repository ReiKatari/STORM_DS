package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaan extends com.google.android.gms.common.api.internal.zabg {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks zaa;

    public zaan(com.google.android.gms.common.api.internal.zaao r1, com.google.android.gms.common.api.internal.zabf r2, com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks r3) {
            r0 = this;
            r0.zaa = r3
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabg
    public final void zaa() {
            r3 = this;
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r1 = 16
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r3 = r3.zaa
            r3.onReportServiceBinding(r0)
            return
    }
}
