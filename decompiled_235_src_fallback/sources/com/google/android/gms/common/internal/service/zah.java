package com.google.android.gms.common.internal.service;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zah extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.common.internal.service.zal> {
    public zah(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r11, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r12) {
            r7 = this;
            r3 = 39
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r1 = "com.google.android.gms.common.internal.service.ICommonService"
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r0 = r1 instanceof com.google.android.gms.common.internal.service.zal
            if (r0 == 0) goto L11
            com.google.android.gms.common.internal.service.zal r1 = (com.google.android.gms.common.internal.service.zal) r1
            return r1
        L11:
            com.google.android.gms.common.internal.service.zal r1 = new com.google.android.gms.common.internal.service.zal
            r1.<init>(r2)
            return r1
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
            r0 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.service.ICommonService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
            r0 = this;
            java.lang.String r0 = "com.google.android.gms.common.service.START"
            return r0
    }
}
