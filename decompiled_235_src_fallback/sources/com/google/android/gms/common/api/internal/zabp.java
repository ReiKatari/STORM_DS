package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zabp implements com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabq zaa;

    public zabp(com.google.android.gms.common.api.internal.zabq r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void onSignOutComplete() {
            r2 = this;
            com.google.android.gms.common.api.internal.zabq r0 = r2.zaa
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r0.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            com.google.android.gms.common.api.internal.zabo r1 = new com.google.android.gms.common.api.internal.zabo
            r1.<init>(r2)
            r0.post(r1)
            return
    }
}
